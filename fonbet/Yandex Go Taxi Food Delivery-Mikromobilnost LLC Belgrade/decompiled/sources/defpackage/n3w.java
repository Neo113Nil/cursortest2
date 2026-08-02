package defpackage;

/* loaded from: classes9.dex */
public final class n3w implements v7p, h3y {
    public static final n3w b = new n3w(null);
    public final Object a;

    public n3w(Object obj) {
        this.a = obj;
    }

    public static n3w a(Object obj) {
        q5z.g(obj, "instance cannot be null");
        return new n3w(obj);
    }

    public static n3w b(Object obj) {
        return obj == null ? b : new n3w(obj);
    }

    @Override // defpackage.yvf0
    public final Object get() {
        return this.a;
    }
}
