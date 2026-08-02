package com.squareup.moshi;

import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes11.dex */
abstract class ClassFactory<T> {
    public static <T> ClassFactory<T> get(final Class<?> cls) {
        try {
            try {
                try {
                    try {
                        final Constructor<?> declaredConstructor = cls.getDeclaredConstructor(null);
                        declaredConstructor.setAccessible(true);
                        return new ClassFactory<T>() { // from class: com.squareup.moshi.ClassFactory.1
                            @Override // com.squareup.moshi.ClassFactory
                            public T newInstance() throws IllegalAccessException, InvocationTargetException, InstantiationException {
                                return (T) declaredConstructor.newInstance(null);
                            }

                            public String toString() {
                                return cls.getName();
                            }
                        };
                    } catch (Exception unused) {
                        ny61.g("cannot construct instances of ".concat(cls.getName()));
                        return null;
                    }
                } catch (NoSuchMethodException unused2) {
                    Class<?> cls2 = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls2.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    final Object obj = declaredField.get(null);
                    final Method method = cls2.getMethod("allocateInstance", Class.class);
                    return new ClassFactory<T>() { // from class: com.squareup.moshi.ClassFactory.2
                        @Override // com.squareup.moshi.ClassFactory
                        public T newInstance() throws InvocationTargetException, IllegalAccessException {
                            return (T) method.invoke(obj, cls);
                        }

                        public String toString() {
                            return cls.getName();
                        }
                    };
                }
            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused3) {
                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                declaredMethod.setAccessible(true);
                final int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                final Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                declaredMethod2.setAccessible(true);
                return new ClassFactory<T>() { // from class: com.squareup.moshi.ClassFactory.3
                    @Override // com.squareup.moshi.ClassFactory
                    public T newInstance() throws InvocationTargetException, IllegalAccessException {
                        return (T) declaredMethod2.invoke(null, cls, Integer.valueOf(intValue));
                    }

                    public String toString() {
                        return cls.getName();
                    }
                };
            } catch (IllegalAccessException unused4) {
                ny61.w();
                return null;
            }
        } catch (IllegalAccessException unused5) {
            ny61.w();
            return null;
        } catch (NoSuchMethodException unused6) {
            final Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
            declaredMethod3.setAccessible(true);
            return new ClassFactory<T>() { // from class: com.squareup.moshi.ClassFactory.4
                @Override // com.squareup.moshi.ClassFactory
                public T newInstance() throws InvocationTargetException, IllegalAccessException {
                    return (T) declaredMethod3.invoke(null, cls, Object.class);
                }

                public String toString() {
                    return cls.getName();
                }
            };
        } catch (InvocationTargetException e) {
            throw Util.rethrowCause(e);
        }
    }

    public abstract Object newInstance();
}
