package xsna;

import android.content.Context;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;

/* compiled from: ClipsItemsPrefetcherDefault.kt */
/* loaded from: classes16.dex */
public final class xie implements wie {
    public final Context a;
    public final hwe b;

    public xie(Context context, hwe hweVar) {
        this.a = context;
        this.b = hweVar;
    }

    @Override // xsna.wie
    public final void a(SdkVideoFile sdkVideoFile) {
        this.b.d(this.a, sdkVideoFile);
    }

    @Override // xsna.wie
    public final void b(SdkVideoFile sdkVideoFile) {
        this.b.e(sdkVideoFile);
    }

    @Override // xsna.wie
    public final boolean isEnabled() {
        return this.b.c();
    }
}
