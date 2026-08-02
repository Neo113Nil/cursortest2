package xsna;

import xsna.ify;

/* compiled from: VideoCommentReplyOverlay.kt */
/* loaded from: classes4.dex */
public final class qbs0 implements ify.a {
    public final /* synthetic */ io.reactivex.rxjava3.core.r<s3q0> b;

    public qbs0(io.reactivex.rxjava3.core.r<s3q0> rVar) {
        this.b = rVar;
    }

    @Override // xsna.ify.a
    public final void Y0() {
        this.b.onNext(s3q0.a);
    }

    @Override // xsna.ify.a
    public final void x0(int i) {
        this.b.onNext(s3q0.a);
    }
}
