package defpackage;

/* loaded from: classes5.dex */
public abstract class a151 {
    public final String a;

    public a151(String str) {
        this.a = str;
    }

    public abstract void a(n351 n351Var, fid fidVar, int i);

    public boolean b(fid fidVar) {
        bts btsVar = (bts) fidVar;
        btsVar.e0(199459868);
        btsVar.t(false);
        return true;
    }

    public void c() {
    }

    public void d(n351 n351Var) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a151) {
            return this.a.equals(((a151) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
