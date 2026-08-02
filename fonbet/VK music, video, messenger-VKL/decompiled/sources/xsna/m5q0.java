package xsna;

import java.lang.reflect.Method;

/* compiled from: UnsafeAllocator.java */
/* loaded from: classes.dex */
public final class m5q0 extends q5q0 {
    public final /* synthetic */ Method a;
    public final /* synthetic */ Object b;

    public m5q0(Object obj, Method method) {
        this.a = method;
        this.b = obj;
    }

    @Override // xsna.q5q0
    public final <T> T b(Class<T> cls) throws Exception {
        String a = q5q0.a(cls);
        if (a != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(a));
        }
        return (T) this.a.invoke(this.b, cls);
    }
}
