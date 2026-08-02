package defpackage;

import java.lang.reflect.Method;

/* loaded from: classes15.dex */
public final class c0c extends imb1 {
    public final /* synthetic */ Method b;
    public final /* synthetic */ Class c;
    public final /* synthetic */ int d;

    public c0c(Method method, Class cls, int i) {
        this.b = method;
        this.c = cls;
        this.d = i;
    }

    @Override // defpackage.imb1
    public final Object c() {
        return this.b.invoke(null, this.c, Integer.valueOf(this.d));
    }

    public final String toString() {
        return this.c.getName();
    }
}
