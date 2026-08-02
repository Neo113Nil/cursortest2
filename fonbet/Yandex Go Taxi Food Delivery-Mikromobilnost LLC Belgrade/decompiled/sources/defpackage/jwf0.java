package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final /* synthetic */ class jwf0 implements InvocationHandler {
    public final /* synthetic */ sls a;
    public final /* synthetic */ zxf0 b;

    public /* synthetic */ jwf0(sls slsVar, zxf0 zxf0Var) {
        this.a = slsVar;
        this.b = zxf0Var;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        if (!((Boolean) this.a.invoke()).booleanValue()) {
            return pwf0.a(method);
        }
        return method.invoke(this.b, Arrays.copyOf(objArr, objArr.length));
    }
}
