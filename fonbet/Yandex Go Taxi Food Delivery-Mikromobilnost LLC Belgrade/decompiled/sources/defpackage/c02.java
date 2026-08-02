package defpackage;

import com.yandex.go.mainscreen.superapp.impl.fragment.a;
import ru.yandex.taxi.altpins.source.ConfirmAlternativeSourceFragment;
import ru.yandex.taxi.fragment.BaseFragment;

/* loaded from: classes5.dex */
public final class c02 extends dds {
    public final mf00 F;
    public final aj0 G;
    public final a H;

    public c02(mf00 mf00Var, aj0 aj0Var, a aVar) {
        super(null);
        this.F = mf00Var;
        this.G = aj0Var;
        this.H = aVar;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        this.F.a(this, new j01(28));
    }

    @Override // defpackage.dds
    public final a P() {
        return this.H;
    }

    @Override // defpackage.dds
    public final void Q(Object obj, BaseFragment baseFragment) {
        b02 b02Var = (b02) obj;
        m950 m950Var = (m950) this.G.get();
        String str = b02Var.a;
        sz1 sz1Var = b02Var.b;
        A(m950Var, new xx1(str, sz1Var, sz1Var.h, b02Var.c, b02Var.d), new dl1(1, this));
    }

    @Override // defpackage.dds
    public final BaseFragment T(Object obj) {
        ConfirmAlternativeSourceFragment.Companion.getClass();
        return new ConfirmAlternativeSourceFragment();
    }
}
