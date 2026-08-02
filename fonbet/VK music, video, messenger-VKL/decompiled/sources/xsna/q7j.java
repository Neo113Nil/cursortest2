package xsna;

import java.lang.reflect.Method;
import xsna.p7j;

/* compiled from: ConsumerAdapter.kt */
/* loaded from: classes12.dex */
public final class q7j implements p7j.b {
    public final /* synthetic */ Method a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public q7j(Method method, Object obj, Object obj2) {
        this.a = method;
        this.b = obj;
        this.c = obj2;
    }

    @Override // xsna.p7j.b
    public final void dispose() {
        this.a.invoke(this.b, this.c);
    }
}
