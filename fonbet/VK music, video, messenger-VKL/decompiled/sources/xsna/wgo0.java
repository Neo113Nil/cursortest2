package xsna;

import androidx.compose.foundation.MutatePriority;

/* compiled from: TextFieldScroll.kt */
/* loaded from: classes11.dex */
public final class wgo0 implements khh0 {
    public final /* synthetic */ khh0 a;
    public final f1m b;
    public final f1m c;

    public wgo0(khh0 khh0Var, xgo0 xgo0Var) {
        this.a = khh0Var;
        this.b = bbk0.b(new wrl0(xgo0Var, 7));
        this.c = bbk0.b(new pvh0(xgo0Var, 9));
    }

    @Override // xsna.khh0
    public final boolean a() {
        return this.a.a();
    }

    @Override // xsna.khh0
    public final Object b(MutatePriority mutatePriority, wzs<? super ggh0, ? super spj<? super s3q0>, ? extends Object> wzsVar, spj<? super s3q0> spjVar) {
        return this.a.b(mutatePriority, wzsVar, spjVar);
    }

    @Override // xsna.khh0
    public final boolean c() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }

    @Override // xsna.khh0
    public final float d(float f) {
        return this.a.d(f);
    }

    @Override // xsna.khh0
    public final boolean e() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }
}
