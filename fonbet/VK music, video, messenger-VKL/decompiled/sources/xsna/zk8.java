package xsna;

/* compiled from: Brush.java */
/* loaded from: classes17.dex */
public abstract class zk8 {
    public float a = 1.0f;

    public abstract zk8 a();

    public abstract void b();

    public abstract void c();

    public abstract float d();

    public abstract int e();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zk8.class != obj.getClass()) {
            return false;
        }
        zk8 zk8Var = (zk8) obj;
        return this.a == zk8Var.a && e() == zk8Var.e() && f() == zk8Var.f() && d() == zk8Var.d() && g() == zk8Var.g();
    }

    public abstract int f();

    public abstract float g();

    public abstract boolean h();

    public final int hashCode() {
        return Float.hashCode(g()) + ((Float.hashCode(d()) + ((Integer.hashCode(f()) + ((Integer.hashCode(e()) + (((Float.hashCode(this.a) * 31) + 255) * 31)) * 31)) * 31)) * 31);
    }
}
