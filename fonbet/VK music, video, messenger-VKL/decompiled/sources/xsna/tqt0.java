package xsna;

import kotlin.NoWhenBranchMatchedException;
import one.video.controls20.a;
import xsna.qwm;
import xsna.sqt0;

/* compiled from: VideoView2.kt */
/* loaded from: classes3.dex */
public final class tqt0 implements rwm {
    public final /* synthetic */ sqt0 a;

    public tqt0(sqt0 sqt0Var) {
        this.a = sqt0Var;
    }

    @Override // xsna.rwm
    public final void a(qwm qwmVar) {
        sqt0.k kVar = this.a.v;
        if (qwmVar instanceof qwm.b) {
            kVar.a(new a.e(((qwm.b) qwmVar).a));
        } else if (qwmVar instanceof qwm.c) {
            kVar.a(new a.i(((qwm.c) qwmVar).a));
        } else {
            if (!(qwmVar instanceof qwm.a)) {
                throw new NoWhenBranchMatchedException();
            }
            kVar.a(new a.d(((qwm.a) qwmVar).a));
        }
    }
}
