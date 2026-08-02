package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* loaded from: classes10.dex */
public final class owf0 extends kwf0 {
    public final /* synthetic */ InvocationHandler a;

    public owf0(InvocationHandler invocationHandler) {
        this.a = invocationHandler;
    }

    @Override // defpackage.kwf0
    public final Object a(Object obj, Method method, Object[] objArr) {
        return this.a.invoke(obj, method, objArr);
    }
}
