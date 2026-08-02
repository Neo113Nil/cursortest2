package org.chromium.net.impl;

import android.content.Context;
import java.util.Arrays;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.httpflags.ResolvedFlags;
import org.chromium.net.impl.CronetLogger;

/* loaded from: classes11.dex */
public class NativeCronetProvider extends CronetProvider {
    public static final String OVERRIDE_NATIVE_CRONET_WITH_HTTPENGINE_FLAG = "Cronet_OverrideNativeCronetWithHttpEngine";
    private final HttpEngineNativeProvider mHttpEngineProvider;

    public NativeCronetProvider(Context context) {
        super(context);
        this.mHttpEngineProvider = new HttpEngineNativeProvider(this.mContext);
    }

    private boolean shouldUseHttpEngine() {
        ResolvedFlags.Value value;
        return HttpEngineNativeProvider.isHttpEngineAvailable() && (value = HttpFlagsForImpl.getHttpFlags(this.mContext, CronetLogger.CronetSource.CRONET_SOURCE_STATICALLY_LINKED).flags().get(OVERRIDE_NATIVE_CRONET_WITH_HTTPENGINE_FLAG)) != null && value.getBoolValue();
    }

    @Override // org.chromium.net.CronetProvider
    public CronetEngine.Builder createBuilder() {
        return shouldUseHttpEngine() ? this.mHttpEngineProvider.createBuilder() : new ExperimentalCronetEngine.Builder(new NativeCronetEngineBuilderWithLibraryLoaderImpl(this.mContext));
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof NativeCronetProvider) && this.mContext.equals(((NativeCronetProvider) obj).mContext);
        }
        return true;
    }

    @Override // org.chromium.net.CronetProvider
    public String getName() {
        return CronetProvider.PROVIDER_NAME_APP_PACKAGED;
    }

    @Override // org.chromium.net.CronetProvider
    public String getVersion() {
        return shouldUseHttpEngine() ? this.mHttpEngineProvider.getVersion() : ImplVersion.getCronetVersion();
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{NativeCronetProvider.class, this.mContext});
    }

    @Override // org.chromium.net.CronetProvider
    public boolean isEnabled() {
        return true;
    }
}
