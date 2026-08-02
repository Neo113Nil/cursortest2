package defpackage;

import java.lang.reflect.Method;

/* loaded from: classes11.dex */
public final class f321 extends h321 {
    public final /* synthetic */ Method b;

    public f321(Method method) {
        this.b = method;
    }

    @Override // defpackage.h321
    public final Object a(Class cls) {
        String F = tis0.F(cls);
        if (F == null) {
            return this.b.invoke(null, cls, Object.class);
        }
        ny61.f("UnsafeAllocator is used for non-instantiable type: ".concat(F));
        return null;
    }
}
