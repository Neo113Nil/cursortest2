package xsna;

import java.lang.reflect.Method;

/* compiled from: UnsafeAllocator.java */
/* loaded from: classes13.dex */
public final class o5q0 extends q5q0 {
    public final /* synthetic */ Method a;

    public o5q0(Method method) {
        this.a = method;
    }

    @Override // xsna.q5q0
    public final <T> T b(Class<T> cls) throws Exception {
        String a = q5q0.a(cls);
        if (a != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(a));
        }
        return (T) this.a.invoke(null, cls, Object.class);
    }
}
