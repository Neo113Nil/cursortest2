package defpackage;

/* loaded from: classes10.dex */
public abstract class d2w extends e530 implements dd11 {
    public p651 a;
    public p651 b;

    public d2w() {
        jer jerVar = w8a1.a;
        this.a = jerVar;
        this.b = jerVar;
    }

    public abstract p651 E0(p651 p651Var);

    public void F0() {
        this.b = E0(this.a);
        dai0.N(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new c2w(this, 0));
    }

    @Override // defpackage.dd11
    public final Object V() {
        return "androidx.compose.foundation.layout.ConsumedInsetsProvider";
    }

    @Override // defpackage.e530
    public void onAttach() {
        dai0.L(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new c2w(this, 1));
        F0();
    }

    @Override // defpackage.e530
    public void onDetach() {
        this.b = this.a;
        dai0.N(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new c2w(this, 0));
    }

    @Override // defpackage.e530
    public final void onReset() {
        super.onReset();
        this.a = w8a1.a;
    }
}
