package defpackage;

import com.google.gson.JsonParseException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes11.dex */
public final class dpi0 extends api0 {
    public static final HashMap e;
    public final Constructor b;
    public final Object[] c;
    public final HashMap d;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(Byte.TYPE, (byte) 0);
        hashMap.put(Short.TYPE, (short) 0);
        hashMap.put(Integer.TYPE, 0);
        hashMap.put(Long.TYPE, 0L);
        hashMap.put(Float.TYPE, Float.valueOf(0.0f));
        hashMap.put(Double.TYPE, Double.valueOf(0.0d));
        hashMap.put(Character.TYPE, (char) 0);
        hashMap.put(Boolean.TYPE, Boolean.FALSE);
        e = hashMap;
    }

    public dpi0(Class cls, cpi0 cpi0Var, boolean z) {
        super(cpi0Var);
        this.d = new HashMap();
        lia1 lia1Var = xoi0.a;
        Constructor d = lia1Var.d(cls);
        this.b = d;
        if (z) {
            epi0.a(null, d);
        } else {
            xoi0.f(d);
        }
        String[] f = lia1Var.f(cls);
        for (int i = 0; i < f.length; i++) {
            this.d.put(f[i], Integer.valueOf(i));
        }
        Class<?>[] parameterTypes = this.b.getParameterTypes();
        this.c = new Object[parameterTypes.length];
        for (int i2 = 0; i2 < parameterTypes.length; i2++) {
            this.c[i2] = e.get(parameterTypes[i2]);
        }
    }

    @Override // defpackage.api0
    public final Object a() {
        return (Object[]) this.c.clone();
    }

    @Override // defpackage.api0
    public final Object b(Object obj) {
        Object[] objArr = (Object[]) obj;
        Constructor constructor = this.b;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e2) {
            lia1 lia1Var = xoi0.a;
            ny61.n("Unexpected IllegalAccessException occurred (Gson 2.14.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e2);
            return null;
        } catch (IllegalArgumentException | InstantiationException e3) {
            throw new RuntimeException("Failed to invoke constructor '" + xoi0.b(constructor) + "' with args " + Arrays.toString(objArr), e3);
        } catch (InvocationTargetException e4) {
            ny61.n("Failed to invoke constructor '" + xoi0.b(constructor) + "' with args " + Arrays.toString(objArr), e4.getCause());
            return null;
        }
    }

    @Override // defpackage.api0
    public final void c(Object obj, wdx wdxVar, zoi0 zoi0Var) {
        Object[] objArr = (Object[]) obj;
        String str = zoi0Var.c;
        Integer num = (Integer) this.d.get(str);
        if (num == null) {
            w511.m("Could not find the index in the constructor '", xoi0.b(this.b), "' for field with name '", str, "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
            return;
        }
        int intValue = num.intValue();
        Object read = zoi0Var.g.read(wdxVar);
        if (read != null || !zoi0Var.h) {
            objArr[intValue] = read;
        } else {
            StringBuilder x = unr0.x("null is not allowed as value for record component '", str, "' of primitive type; at path ");
            x.append(wdxVar.getPath());
            throw new JsonParseException(x.toString());
        }
    }
}
