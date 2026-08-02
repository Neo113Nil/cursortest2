package defpackage;

import java.lang.reflect.Method;

/* loaded from: classes11.dex */
public final class d321 extends h321 {
    public final /* synthetic */ Method b;
    public final /* synthetic */ Object c;

    public d321(Method method, Object obj) {
        this.b = method;
        this.c = obj;
    }

    @Override // defpackage.h321
    public final Object a(Class cls) {
        String F = tis0.F(cls);
        if (F == null) {
            return this.b.invoke(this.c, cls);
        }
        ny61.f("UnsafeAllocator is used for non-instantiable type: ".concat(F));
        return null;
    }
}
