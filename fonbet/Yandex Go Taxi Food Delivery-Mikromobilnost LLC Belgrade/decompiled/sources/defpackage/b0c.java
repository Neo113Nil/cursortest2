package defpackage;

import java.lang.reflect.Method;

/* loaded from: classes15.dex */
public final class b0c extends imb1 {
    public final /* synthetic */ Method b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Class d;

    public b0c(Method method, Object obj, Class cls) {
        this.b = method;
        this.c = obj;
        this.d = cls;
    }

    @Override // defpackage.imb1
    public final Object c() {
        return this.b.invoke(this.c, this.d);
    }

    public final String toString() {
        return this.d.getName();
    }
}
