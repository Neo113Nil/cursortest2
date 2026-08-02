package defpackage;

import java.lang.reflect.Method;

/* loaded from: classes11.dex */
public final class e321 extends h321 {
    public final /* synthetic */ Method b;
    public final /* synthetic */ int c;

    public e321(int i, Method method) {
        this.b = method;
        this.c = i;
    }

    @Override // defpackage.h321
    public final Object a(Class cls) {
        String F = tis0.F(cls);
        if (F == null) {
            return this.b.invoke(null, cls, Integer.valueOf(this.c));
        }
        ny61.f("UnsafeAllocator is used for non-instantiable type: ".concat(F));
        return null;
    }
}
