package xsna;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import kotlinx.serialization.KSerializer;

/* compiled from: Platform.kt */
/* loaded from: classes8.dex */
public final class rta0 {
    /* JADX WARN: Can't wrap try/catch for region: R(15:58|(1:(2:60|(1:63)(1:62))(2:111|112))|(5:106|107|108|(8:80|81|(1:(3:83|(1:101)(1:(1:89)(2:86|87))|88)(2:102|(1:104)))|90|(1:100)(1:94)|95|(1:97)|99)|(1:79)(4:70|(1:78)|76|77))|65|(1:67)|80|81|(2:(0)(0)|88)|90|(1:92)|100|95|(0)|99|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x00ee, code lost:
    
        if (r12 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x00ae, code lost:
    
        if (r11 == false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0163 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0100 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014c A[Catch: NoSuchFieldException -> 0x017b, TryCatch #1 {NoSuchFieldException -> 0x017b, blocks: (B:81:0x0142, B:83:0x014c, B:92:0x0168, B:94:0x016e, B:95:0x0174, B:97:0x0178, B:88:0x0160), top: B:80:0x0142 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0178 A[Catch: NoSuchFieldException -> 0x017b, TRY_LEAVE, TryCatch #1 {NoSuchFieldException -> 0x017b, blocks: (B:81:0x0142, B:83:0x014c, B:92:0x0168, B:94:0x016e, B:95:0x0174, B:97:0x0178, B:88:0x0160), top: B:80:0x0142 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> KSerializer<T> a(dcy<T> dcyVar, KSerializer<Object>... kSerializerArr) {
        Object obj;
        KSerializer<T> kSerializer;
        Class<?> cls;
        Object obj2;
        KSerializer<T> kSerializer2;
        int length;
        int i;
        Object obj3;
        Field field;
        imi0 imi0Var;
        Class<?> a = ((pfc) dcyVar).a();
        KSerializer[] kSerializerArr2 = (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length);
        if (a.isEnum() && a.getAnnotation(imi0.class) == null && a.getAnnotation(qub0.class) == null) {
            return new bsp((Enum[]) a.getEnumConstants(), a.getCanonicalName());
        }
        KSerializer[] kSerializerArr3 = (KSerializer[]) Arrays.copyOf(kSerializerArr2, kSerializerArr2.length);
        tub0 tub0Var = null;
        try {
            Field declaredField = a.getDeclaredField("Companion");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
        } catch (Throwable unused) {
            obj = null;
        }
        KSerializer<T> b = obj == null ? null : b(obj, (KSerializer[]) Arrays.copyOf(kSerializerArr3, kSerializerArr3.length));
        if (b != null) {
            return b;
        }
        String canonicalName = a.getCanonicalName();
        if (canonicalName != null && !brm0.B(canonicalName, "java.", false) && !brm0.B(canonicalName, "kotlin.", false)) {
            Field[] declaredFields = a.getDeclaredFields();
            int length2 = declaredFields.length;
            Field field2 = null;
            int i2 = 0;
            boolean z = false;
            while (true) {
                if (i2 < length2) {
                    Field field3 = declaredFields[i2];
                    if (epx.f(field3.getName(), "INSTANCE") && epx.f(field3.getType(), a) && Modifier.isStatic(field3.getModifiers())) {
                        if (z) {
                            break;
                        }
                        z = true;
                        field2 = field3;
                    }
                    i2++;
                }
            }
            field2 = null;
            if (field2 != null) {
                Object obj4 = field2.get(null);
                Method[] methods = a.getMethods();
                int length3 = methods.length;
                Method method = null;
                int i3 = 0;
                boolean z2 = false;
                while (true) {
                    if (i3 < length3) {
                        Method method2 = methods[i3];
                        if (epx.f(method2.getName(), "serializer") && method2.getParameterTypes().length == 0 && epx.f(method2.getReturnType(), KSerializer.class)) {
                            if (z2) {
                                break;
                            }
                            z2 = true;
                            method = method2;
                        }
                        i3++;
                    }
                }
                method = null;
                if (method != null) {
                    Object invoke = method.invoke(obj4, null);
                    if (invoke instanceof KSerializer) {
                        kSerializer = (KSerializer) invoke;
                        if (kSerializer == null) {
                            return kSerializer;
                        }
                        KSerializer[] kSerializerArr4 = (KSerializer[]) Arrays.copyOf(kSerializerArr2, kSerializerArr2.length);
                        Class<?>[] declaredClasses = a.getDeclaredClasses();
                        int length4 = declaredClasses.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length4) {
                                cls = null;
                                break;
                            }
                            cls = declaredClasses[i4];
                            if (cls.getAnnotation(yt50.class) != null) {
                                break;
                            }
                            i4++;
                        }
                        if (cls != null) {
                            try {
                                Field declaredField2 = a.getDeclaredField(cls.getSimpleName());
                                declaredField2.setAccessible(true);
                                obj2 = declaredField2.get(null);
                            } catch (Throwable unused2) {
                            }
                            if (obj2 != null || (kSerializer2 = b(obj2, (KSerializer[]) Arrays.copyOf(kSerializerArr4, kSerializerArr4.length))) == null) {
                                Class<?>[] declaredClasses2 = a.getDeclaredClasses();
                                length = declaredClasses2.length;
                                Class<?> cls2 = null;
                                i = 0;
                                boolean z3 = false;
                                while (true) {
                                    if (i >= length) {
                                        Class<?> cls3 = declaredClasses2[i];
                                        if (cls3.getSimpleName().equals("$serializer")) {
                                            if (z3) {
                                                break;
                                            }
                                            z3 = true;
                                            cls2 = cls3;
                                        }
                                        i++;
                                    } else if (!z3) {
                                    }
                                }
                                cls2 = null;
                                obj3 = (cls2 != null || (field = cls2.getField("INSTANCE")) == null) ? null : field.get(null);
                                if (obj3 instanceof KSerializer) {
                                    kSerializer2 = (KSerializer) obj3;
                                }
                                kSerializer2 = null;
                            }
                            if (kSerializer2 == null) {
                                return kSerializer2;
                            }
                            if (a.getAnnotation(qub0.class) != null || ((imi0Var = (imi0) a.getAnnotation(imi0.class)) != null && fpf0.a(imi0Var.with()).equals(fpf0.a(tub0.class)))) {
                                tub0Var = new tub0(fpf0.a(a));
                            }
                            return tub0Var;
                        }
                        obj2 = null;
                        if (obj2 != null) {
                        }
                        Class<?>[] declaredClasses22 = a.getDeclaredClasses();
                        length = declaredClasses22.length;
                        Class<?> cls22 = null;
                        i = 0;
                        boolean z32 = false;
                        while (true) {
                            if (i >= length) {
                            }
                            i++;
                        }
                        cls22 = null;
                        if (cls22 != null) {
                        }
                        if (obj3 instanceof KSerializer) {
                        }
                        kSerializer2 = null;
                        if (kSerializer2 == null) {
                        }
                    }
                }
            }
        }
        kSerializer = null;
        if (kSerializer == null) {
        }
    }

    public static final <T> KSerializer<T> b(Object obj, KSerializer<Object>... kSerializerArr) {
        Class[] clsArr;
        try {
            if (kSerializerArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = kSerializerArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i = 0; i < length; i++) {
                    clsArr2[i] = KSerializer.class;
                }
                clsArr = clsArr2;
            }
            Object invoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(kSerializerArr, kSerializerArr.length));
            if (invoke instanceof KSerializer) {
                return (KSerializer) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                throw e;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    public static final <T> boolean c(dcy<T> dcyVar) {
        return ((pfc) dcyVar).a().isInterface();
    }
}
