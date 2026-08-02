package xsna;

import androidx.recyclerview.widget.m;
import xsna.yj20;

/* compiled from: VerificationTypeDiffCallback.kt */
/* loaded from: classes3.dex */
public final class rnr0 extends m.e<yj20> {
    @Override // androidx.recyclerview.widget.m.e
    public final boolean areContentsTheSame(yj20 yj20Var, yj20 yj20Var2) {
        yj20 yj20Var3 = yj20Var;
        yj20 yj20Var4 = yj20Var2;
        if ((yj20Var3 instanceof yj20.b) && (yj20Var4 instanceof yj20.b)) {
            return epx.f(((yj20.b) yj20Var3).c, ((yj20.b) yj20Var4).c);
        }
        if ((yj20Var3 instanceof yj20.c) && (yj20Var4 instanceof yj20.c)) {
            yj20.c cVar = (yj20.c) yj20Var3;
            yj20.c cVar2 = (yj20.c) yj20Var4;
            return epx.f(cVar.b(), cVar2.b()) && epx.f(cVar.g(), cVar2.g()) && cVar.e() == cVar2.e() && cVar.a() == cVar2.a() && cVar.h() == cVar2.h();
        }
        if ((yj20Var3 instanceof yj20.a) && (yj20Var4 instanceof yj20.a)) {
            return epx.f(((yj20.a) yj20Var3).c, ((yj20.a) yj20Var4).c);
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.m.e
    public final boolean areItemsTheSame(yj20 yj20Var, yj20 yj20Var2) {
        return epx.f(yj20Var.b(), yj20Var2.b());
    }
}
