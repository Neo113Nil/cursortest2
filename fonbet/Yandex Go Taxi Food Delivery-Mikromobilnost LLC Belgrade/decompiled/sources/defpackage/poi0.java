package defpackage;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/* loaded from: classes15.dex */
public final class poi0 extends ums {
    public poi0() {
        super(8);
    }

    @Override // defpackage.ums
    public final String f(int i, Method method) {
        Parameter parameter = method.getParameters()[i];
        if (!parameter.isNamePresent()) {
            return super.f(i, method);
        }
        return "parameter '" + parameter.getName() + '\'';
    }

    @Override // defpackage.ums
    public final Object h(Method method, Class cls, Object obj, Object[] objArr) {
        return t791.g(method, cls, obj, objArr);
    }

    @Override // defpackage.ums
    public final boolean i(Method method) {
        return method.isDefault();
    }
}
