package xsna;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* compiled from: ConstructorConstructor.java */
/* loaded from: classes.dex */
public final class y6j implements jp70<Object> {
    public final /* synthetic */ Constructor b;

    public y6j(Constructor constructor) {
        this.b = constructor;
    }

    @Override // xsna.jp70
    public final Object h() {
        Constructor constructor = this.b;
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.9.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Failed to invoke " + constructor + " with no args", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("Failed to invoke " + constructor + " with no args", e3.getTargetException());
        }
    }
}
