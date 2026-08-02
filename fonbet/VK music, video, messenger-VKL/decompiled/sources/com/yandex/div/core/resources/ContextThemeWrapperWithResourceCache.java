package com.yandex.div.core.resources;

import android.content.Context;
import android.content.res.Resources;
import kotlin.Lazy;
import xsna.bpn0;
import xsna.gzs;
import xsna.lpj;

/* compiled from: ContextThemeWrapperWithResourceCache.kt */
/* loaded from: classes7.dex */
public final class ContextThemeWrapperWithResourceCache extends lpj {
    private final Lazy resourceCache$delegate;

    public ContextThemeWrapperWithResourceCache(Context context, int i) {
        super(context, i);
        this.resourceCache$delegate = new bpn0(new gzs<PrimitiveResourceCache>() { // from class: com.yandex.div.core.resources.ContextThemeWrapperWithResourceCache$resourceCache$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // xsna.gzs
            public final PrimitiveResourceCache invoke() {
                Resources resources;
                resources = super/*xsna.lpj*/.getResources();
                return new PrimitiveResourceCache(resources);
            }
        });
    }

    private final Resources getResourceCache() {
        return (Resources) this.resourceCache$delegate.getValue();
    }

    @Override // xsna.lpj, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return getResourceCache();
    }
}
