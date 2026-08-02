package xsna;

/* compiled from: MainCoroutineDispatcher.kt */
/* loaded from: classes11.dex */
public abstract class ge00 extends ovj {
    @Override // xsna.ovj
    public ovj T(int i) {
        p7i.c(i);
        return this;
    }

    public abstract ge00 U();

    @Override // xsna.ovj
    public String toString() {
        ge00 ge00Var;
        String str;
        bdn bdnVar = bdn.a;
        ge00 ge00Var2 = ie00.a;
        if (this == ge00Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                ge00Var = ge00Var2.U();
            } catch (UnsupportedOperationException unused) {
                ge00Var = null;
            }
            str = this == ge00Var ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        return getClass().getSimpleName() + '@' + y6l.a(this);
    }
}
