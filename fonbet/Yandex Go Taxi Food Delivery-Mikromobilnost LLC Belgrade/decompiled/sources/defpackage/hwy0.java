package defpackage;

import androidx.compose.runtime.f;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;

/* loaded from: classes5.dex */
public final class hwy0 {
    public final YandexShapes a;
    public final gci0 b;
    public final tvu c;
    public final tvu d;

    public hwy0(avy0 avy0Var) {
        this.a = avy0Var.c;
        ofg ofgVar = avy0Var.a;
        this.b = e.R(ofgVar.a(), bvf0.b(), wsr0.a(xsr0.a, 3), Boolean.valueOf(ofgVar.b()));
        oic oicVar = avy0Var.b;
        fl51 b = oicVar.b();
        this.c = new tvu(ofgVar.a(), oicVar.c(), this, b, 1);
        fl51 d = oicVar.d();
        this.d = new tvu(ofgVar.a(), oicVar.a(), this, d, 1);
    }

    public static final el51 a(hwy0 hwy0Var, fl51 fl51Var) {
        return new el51(rzo.d(fl51Var.a), rzo.d(fl51Var.b), rzo.d(fl51Var.c), rzo.d(fl51Var.d), rzo.d(fl51Var.e), rzo.d(fl51Var.f), rzo.d(fl51Var.g), rzo.d(fl51Var.h), rzo.d(fl51Var.i), rzo.d(fl51Var.j), rzo.d(fl51Var.k), rzo.d(fl51Var.l), rzo.d(fl51Var.m), rzo.d(fl51Var.n), rzo.d(fl51Var.o), rzo.d(fl51Var.p), rzo.d(fl51Var.q), rzo.d(fl51Var.r), rzo.d(fl51Var.s), rzo.d(fl51Var.t), rzo.d(fl51Var.u));
    }

    public final el51 b(fid fidVar) {
        return d(fidVar) ? gl51.a() : gl51.b();
    }

    public final el51 c(fid fidVar) {
        return (el51) f.a(this.c, b(fidVar), null, fidVar, 0, 2).getValue();
    }

    public final boolean d(fid fidVar) {
        return ((Boolean) f.b(this.b, fidVar).getValue()).booleanValue();
    }
}
