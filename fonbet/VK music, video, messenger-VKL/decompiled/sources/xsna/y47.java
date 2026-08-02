package xsna;

/* compiled from: BiometricFragment.java */
/* loaded from: classes11.dex */
public final class y47 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ CharSequence c;
    public final /* synthetic */ q47 d;

    public y47(q47 q47Var, int i, CharSequence charSequence) {
        this.d = q47Var;
        this.b = i;
        this.c = charSequence;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.yn(this.b, this.c);
    }
}
