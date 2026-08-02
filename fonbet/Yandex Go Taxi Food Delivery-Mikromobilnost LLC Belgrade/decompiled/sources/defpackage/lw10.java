package defpackage;

/* loaded from: classes15.dex */
public final class lw10 implements Runnable, x08 {
    public xyz a;

    @Override // defpackage.x08
    public final void cancel() {
        this.a = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xyz xyzVar = this.a;
        if (xyzVar != null) {
            xyzVar.invoke();
        }
    }
}
