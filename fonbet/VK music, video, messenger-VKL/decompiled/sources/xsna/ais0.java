package xsna;

import androidx.media3.transformer.ExportException;
import androidx.media3.transformer.a0;

/* compiled from: VideoDownloadUtil.kt */
/* loaded from: classes6.dex */
public final class ais0 implements a0.c {
    public final /* synthetic */ io.reactivex.rxjava3.core.r<Integer> a;

    public ais0(io.reactivex.rxjava3.core.r<Integer> rVar) {
        this.a = rVar;
    }

    @Override // androidx.media3.transformer.a0.c
    public final void a(ExportException exportException) {
        this.a.b(exportException);
    }

    @Override // androidx.media3.transformer.a0.c
    public final void onCompleted() {
        this.a.onComplete();
    }
}
