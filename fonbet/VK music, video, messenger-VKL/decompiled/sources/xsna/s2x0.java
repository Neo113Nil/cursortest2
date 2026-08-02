package xsna;

import android.content.Context;
import android.view.View;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.p2x0;

/* compiled from: VoipToolTipRenderer.kt */
/* loaded from: classes7.dex */
public final class s2x0 {
    public final Context a;
    public final p2x0 b;
    public final int c;
    public final int d;
    public final long e;
    public final View f;
    public com.vk.core.tips.b g;

    /* compiled from: VoipToolTipRenderer.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<p2x0.c, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(p2x0.c cVar) {
            p2x0.c cVar2 = cVar;
            s2x0 s2x0Var = (s2x0) this.receiver;
            s2x0Var.getClass();
            if (!(cVar2 instanceof p2x0.c.b)) {
                if (cVar2 instanceof p2x0.c.C3490c) {
                    p2x0 p2x0Var = s2x0Var.b;
                    p2x0Var.c.onNext(new p2x0.b.c(s2x0Var.f));
                } else if (cVar2 instanceof p2x0.c.d) {
                    p2x0.c.d dVar = (p2x0.c.d) cVar2;
                    View view = dVar.b;
                    String str = dVar.c;
                    if (view.isAttachedToWindow()) {
                        bwt0.j(view, new jbo(s2x0Var, view, str, 7));
                    } else {
                        bwt0.g(view, new crf(s2x0Var, view, str, 5));
                    }
                } else {
                    if (!(cVar2 instanceof p2x0.c.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    com.vk.core.tips.b bVar = s2x0Var.g;
                    if (bVar != null) {
                        bVar.b(false);
                    }
                    s2x0Var.g = null;
                }
            }
            return s3q0.a;
        }
    }

    public s2x0(Context context, p2x0 p2x0Var, int i, int i2, long j, View view) {
        this.a = context;
        this.b = p2x0Var;
        this.c = i;
        this.d = i2;
        this.e = j;
        this.f = view;
        io.reactivex.rxjava3.subjects.d<p2x0.c> dVar = p2x0Var.b;
        dVar.getClass();
        p2x0Var.d.b(new io.reactivex.rxjava3.internal.operators.observable.y(dVar, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).a0(asu0.a.d()).subscribe(new dfr0(new a(1, this, s2x0.class, "onStateChanged", "onStateChanged(Lcom/vk/voip/ui/tooltip/feature/VoipToolTipFeature$State;)V", 0), 9)));
    }
}
