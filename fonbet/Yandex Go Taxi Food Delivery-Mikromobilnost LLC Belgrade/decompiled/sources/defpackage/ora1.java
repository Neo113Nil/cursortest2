package defpackage;

import android.content.res.AssetManager;
import com.google.android.play.core.splitinstall.internal.zzbl;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes11.dex */
public abstract class ora1 {
    public static final void a(int i, fid fidVar, sls slsVar, f530 f530Var) {
        sls slsVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(993578581);
        int i2 = (btsVar.e(slsVar) ? 4 : 2) | i | 48;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            c530 c530Var = c530.a;
            f530 o = an91.o(c530Var, 0.0f, 8.0f, 8.0f, 8.0f, 1);
            f530Var = c530Var;
            ButtonSize buttonSize = ButtonSize.M;
            l7d.a.getClass();
            slsVar2 = slsVar;
            vpa1.a(o, false, buttonSize, slsVar2, l7d.b, btsVar, ((i2 << 9) & 7168) | 24960, 2);
        } else {
            slsVar2 = slsVar;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new vl5(slsVar2, f530Var, i, 6);
        }
    }

    public static final sxk0 b(zii0 zii0Var, long j, long j2, long j3, long j4) {
        return new sxk0(zii0Var.a, zii0Var.b, zii0Var.c, zii0Var.d, j, j2, j3, j4);
    }

    public static final sxk0 c(float f, float f2, float f3, float f4, long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & Float.floatToRawIntBits(intBitsToFloat2));
        return new sxk0(f, f2, f3, f4, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits);
    }

    public static final boolean d(sxk0 sxk0Var) {
        long j = sxk0Var.e;
        return (j >>> 32) == (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & j) && j == sxk0Var.f && j == sxk0Var.g && j == sxk0Var.h;
    }

    public static void e(ms1 ms1Var, String str) {
        synchronized (ms1Var) {
            try {
                ms1Var.b.b(oqe.d);
                if (ms1Var.c) {
                    ms1Var.b(str);
                } else {
                    ms1Var.w.add(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static q991 f(Class cls, Object obj, String str) {
        return new q991(3, obj, i(obj, str), Array.newInstance((Class<?>) cls, 0).getClass());
    }

    public static Object g() {
        try {
            Constructor declaredConstructor = AssetManager.class.getDeclaredConstructor(null);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor.newInstance(null);
        } catch (Exception e) {
            throw new zzbl("Failed to invoke default constructor on class ".concat(AssetManager.class.getName()), e);
        }
    }

    public static Object h(Object obj, String str, Class cls, Class cls2, Serializable serializable) {
        try {
            return cls.cast(j(obj.getClass(), str, cls2).invoke(obj, serializable));
        } catch (Exception e) {
            throw new zzbl("Failed to invoke method " + str + " on an object of type " + obj.getClass(), e);
        }
    }

    public static Field i(Object obj, String str) {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new zzbl(b64.l("Failed to find a field named ", str, " on an object of instance ", obj.getClass().getName()));
    }

    public static Method j(Class cls, String str, Class... clsArr) {
        for (Class cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
            try {
                Method declaredMethod = cls2.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
            }
        }
        throw new zzbl(String.format("Could not find a method named %s with parameters %s in type %s", str, Arrays.asList(clsArr), cls));
    }
}
