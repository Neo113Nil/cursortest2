package defpackage;

import android.content.Context;
import android.view.ContextThemeWrapper;
import com.yandex.go.taxi.summary.api.ui.MapPositionAction;
import java.util.concurrent.atomic.AtomicReference;
import ru.yandex.taxi.address.clarification.impl.repo.a;
import ru.yandex.taxi.address.clarification.impl.ui.AddressAdjustmentModalView;

/* loaded from: classes5.dex */
public final class op0 extends m230 {
    public final Context E;
    public final a3v F;
    public final mhf G;
    public final n050 H;
    public final yit0 I;
    public final e56 J;
    public final biv0 K;
    public final i130 L;
    public final svw M;
    public final bq0 N;
    public final rp0 O;
    public final a P;
    public final tb1 Q;
    public final tit0 R;
    public final h56 S;
    public final exu0 T;
    public final pwy0 U;

    public op0(Context context, a3v a3vVar, mhf mhfVar, n050 n050Var, yit0 yit0Var, e56 e56Var, biv0 biv0Var, i130 i130Var, svw svwVar, bq0 bq0Var, rp0 rp0Var, a aVar, tb1 tb1Var, tit0 tit0Var, h56 h56Var, exu0 exu0Var, pwy0 pwy0Var) {
        super(null);
        this.E = context;
        this.F = a3vVar;
        this.G = mhfVar;
        this.H = n050Var;
        this.I = yit0Var;
        this.J = e56Var;
        this.K = biv0Var;
        this.L = i130Var;
        this.M = svwVar;
        this.N = bq0Var;
        this.O = rp0Var;
        this.P = aVar;
        this.Q = tb1Var;
        this.R = tit0Var;
        this.S = h56Var;
        this.T = exu0Var;
        this.U = pwy0Var;
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.L.a();
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return true;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        mp0 mp0Var = (mp0) obj;
        xp0 xp0Var = mp0Var.a;
        AtomicReference atomicReference = new AtomicReference(null);
        AddressAdjustmentModalView a = this.O.a(new ContextThemeWrapper(this.E, this.T.a(this.U.getThemeType()).b), this.N.a(xp0Var, new v5(7, atomicReference, this), new jg(7, this)));
        a.setOnAppearingListener(new np0(this, a, mp0Var.b, xp0Var, atomicReference));
        this.L.a().a();
        jpv0 b = this.K.b();
        b.getClass();
        boolean z = b instanceof hpv0;
        a aVar = this.P;
        if (z) {
            aVar.d = tp0.b;
        } else {
            aVar.d = vp0.b;
        }
        this.I.a(MapPositionAction.DEFAULT);
        this.Q.b = null;
        return a;
    }
}
