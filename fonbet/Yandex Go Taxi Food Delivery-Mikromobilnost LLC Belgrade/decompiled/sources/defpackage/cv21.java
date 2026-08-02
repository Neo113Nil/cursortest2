package defpackage;

/* loaded from: classes15.dex */
public abstract class cv21 {
    public abstract hv21 a(String str);

    public abstract long b(hv21 hv21Var);

    public abstract void c(hv21 hv21Var);

    public void d(String str) {
        if (b(new hv21(str, false, null, null)) == -1) {
            e(str);
        }
    }

    public abstract void e(String str);
}
