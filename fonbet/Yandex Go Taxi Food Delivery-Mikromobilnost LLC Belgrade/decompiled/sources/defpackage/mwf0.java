package defpackage;

import java.lang.reflect.Method;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class mwf0 {
    public final Method a;
    public final Object[] b;

    public mwf0(Method method, Object[] objArr) {
        this.a = method;
        this.b = objArr;
    }

    public final void a(Object obj) {
        try {
            Method method = this.a;
            Object[] objArr = this.b;
            method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            ny61.j(e2);
        }
    }
}
