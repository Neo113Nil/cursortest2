package xsna;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;
import xsna.wjy;

/* compiled from: ConstructorConstructor.java */
/* loaded from: classes.dex */
public final class t6j implements jp70 {
    public final Object b;
    public final Serializable c;

    public t6j(wjy.c cVar) {
        this.b = cVar;
        this.c = new AtomicInteger(0);
    }

    public synchronized boolean a() {
        return ((AtomicInteger) this.c).get() >= 8;
    }

    @Override // xsna.jp70
    public Object h() {
        Class cls = (Class) this.c;
        try {
            return ((q5q0) this.b).b(cls);
        } catch (Exception e) {
            throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e);
        }
    }

    public t6j(Class cls) {
        Object p5q0Var;
        this.c = cls;
        try {
            try {
                try {
                    Class<?> cls2 = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls2.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    p5q0Var = new m5q0(declaredField.get(null), cls2.getMethod("allocateInstance", Class.class));
                } catch (Exception unused) {
                    Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod.setAccessible(true);
                    p5q0Var = new o5q0(declaredMethod);
                }
            } catch (Exception unused2) {
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                declaredMethod2.setAccessible(true);
                int intValue = ((Integer) declaredMethod2.invoke(null, Object.class)).intValue();
                Method declaredMethod3 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                declaredMethod3.setAccessible(true);
                p5q0Var = new n5q0(intValue, declaredMethod3);
            }
        } catch (Exception unused3) {
            p5q0Var = new p5q0();
        }
        this.b = p5q0Var;
    }
}
