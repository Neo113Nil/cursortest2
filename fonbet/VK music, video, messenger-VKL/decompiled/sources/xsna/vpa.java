package xsna;

import android.text.Spanned;
import xsna.qjc;

/* compiled from: CensoredSpansUpdater.kt */
/* loaded from: classes16.dex */
public final class vpa {
    public static void a(CharSequence charSequence, qjc.a aVar) {
        Spanned spanned;
        int nextSpanTransition;
        if ((charSequence instanceof Spanned) && (nextSpanTransition = (spanned = (Spanned) charSequence).nextSpanTransition(-1, charSequence.length(), spa.class)) != charSequence.length()) {
            spa[] spaVarArr = (spa[]) spanned.getSpans(nextSpanTransition, spanned.length(), spa.class);
            if (spaVarArr.length != 0 && ((spa) rl3.L(spaVarArr)).c == null) {
                int length = spaVarArr.length;
                for (spa spaVar : spaVarArr) {
                    spaVar.m = length;
                    spaVar.c = aVar;
                }
            }
        }
    }

    public final io.reactivex.rxjava3.internal.operators.completable.u b(ej90 ej90Var, t0c0 t0c0Var) {
        io.reactivex.rxjava3.internal.operators.completable.m mVar = new io.reactivex.rxjava3.internal.operators.completable.m(new tpa(this, ej90Var, t0c0Var));
        asu0.a.getClass();
        return mVar.q(asu0.i()).o(io.reactivex.rxjava3.android.schedulers.a.b());
    }
}
