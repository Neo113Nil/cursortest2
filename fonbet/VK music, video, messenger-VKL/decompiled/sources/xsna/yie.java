package xsna;

import android.content.Context;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;

/* compiled from: ClipsItemsPrefetcherFeed.kt */
/* loaded from: classes16.dex */
public final class yie implements wie {
    public final Context a;
    public final yof b;
    public final hwe c;

    public yie(Context context, yof yofVar, hwe hweVar) {
        this.a = context;
        this.b = yofVar;
        this.c = hweVar;
    }

    @Override // xsna.wie
    public final void a(SdkVideoFile sdkVideoFile) {
        this.c.d(this.a, sdkVideoFile);
    }

    @Override // xsna.wie
    public final void b(SdkVideoFile sdkVideoFile) {
        this.c.e(sdkVideoFile);
    }

    @Override // xsna.wie
    public final boolean isEnabled() {
        if (this.b.N().c) {
            return false;
        }
        hwe hweVar = this.c;
        return ((zof) hweVar.d.getValue()).k() && ((pkd) hweVar.a.getValue()).n() && hweVar.c();
    }
}
