package com.squareup.moshi;

import com.squareup.moshi.internal.Util;
import defpackage.kbs;
import defpackage.ny61;
import defpackage.qv10;
import defpackage.unr0;
import defpackage.vg10;
import defpackage.w511;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class Types {
    public static Annotation a(final Class cls) {
        if (!cls.isAnnotation()) {
            vg10.e(cls, " must be an annotation.");
            return null;
        }
        if (!cls.isAnnotationPresent(JsonQualifier.class)) {
            vg10.e(cls, " must have @JsonQualifier.");
            return null;
        }
        if (cls.getDeclaredMethods().length == 0) {
            return (Annotation) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: com.squareup.moshi.Types.1
                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                @Override // java.lang.reflect.InvocationHandler
                public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
                    String name = method.getName();
                    name.getClass();
                    char c = 65535;
                    switch (name.hashCode()) {
                        case -1776922004:
                            if (name.equals("toString")) {
                                c = 0;
                                break;
                            }
                            break;
                        case -1295482945:
                            if (name.equals("equals")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 147696667:
                            if (name.equals("hashCode")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 1444986633:
                            if (name.equals("annotationType")) {
                                c = 3;
                                break;
                            }
                            break;
                    }
                    Class cls2 = cls;
                    switch (c) {
                        case 0:
                            return "@" + cls2.getName() + "()";
                        case 1:
                            return Boolean.valueOf(cls2.isInstance(objArr[0]));
                        case 2:
                            return 0;
                        case 3:
                            return cls2;
                        default:
                            return method.invoke(obj, objArr);
                    }
                }
            });
        }
        vg10.e(cls, " must not declare methods.");
        return null;
    }

    public static GenericArrayType arrayOf(Type type) {
        return new Util.GenericArrayTypeImpl(type);
    }

    public static Type collectionElementType(Type type, Class<?> cls) {
        if (!Collection.class.isAssignableFrom(cls)) {
            w511.q();
            return null;
        }
        Type resolve = Util.resolve(type, cls, Util.getGenericSupertype(type, cls, Collection.class));
        if (resolve instanceof WildcardType) {
            resolve = ((WildcardType) resolve).getUpperBounds()[0];
        }
        return resolve instanceof ParameterizedType ? ((ParameterizedType) resolve).getActualTypeArguments()[0] : Object.class;
    }

    public static boolean equals(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type2 instanceof GenericArrayType ? equals(((Class) type).getComponentType(), ((GenericArrayType) type2).getGenericComponentType()) : type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return equals(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType instanceof Util.ParameterizedTypeImpl ? ((Util.ParameterizedTypeImpl) parameterizedType).typeArguments : parameterizedType.getActualTypeArguments(), parameterizedType2 instanceof Util.ParameterizedTypeImpl ? ((Util.ParameterizedTypeImpl) parameterizedType2).typeArguments : parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof Class) {
                return equals(((Class) type2).getComponentType(), ((GenericArrayType) type).getGenericComponentType());
            }
            if (type2 instanceof GenericArrayType) {
                return equals(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    public static String generatedJsonAdapterName(Class<?> cls) {
        if (cls.getAnnotation(JsonClass.class) != null) {
            return generatedJsonAdapterName(cls.getName());
        }
        ny61.g(qv10.l(cls, "Class does not have a JsonClass annotation: "));
        return null;
    }

    @Deprecated
    public static Set<? extends Annotation> getFieldJsonQualifierAnnotations(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            Annotation[] declaredAnnotations = declaredField.getDeclaredAnnotations();
            LinkedHashSet linkedHashSet = new LinkedHashSet(declaredAnnotations.length);
            for (Annotation annotation : declaredAnnotations) {
                if (annotation.annotationType().isAnnotationPresent(JsonQualifier.class)) {
                    linkedHashSet.add(annotation);
                }
            }
            return Collections.unmodifiableSet(linkedHashSet);
        } catch (NoSuchFieldException e) {
            StringBuilder x = unr0.x("Could not access field ", str, " on class ");
            x.append(cls.getCanonicalName());
            throw new IllegalArgumentException(x.toString(), e);
        }
    }

    public static Class<?> getRawType(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(getRawType(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return getRawType(((WildcardType) type).getUpperBounds()[0]);
        }
        w511.l("Expected a Class, ParameterizedType, or GenericArrayType, but <", type, "> is of type ", type == null ? "null" : type.getClass().getName());
        return null;
    }

    public static ParameterizedType newParameterizedType(Type type, Type... typeArr) {
        if (typeArr.length != 0) {
            return new Util.ParameterizedTypeImpl(null, type, typeArr);
        }
        kbs.f(type, "Missing type arguments for ");
        return null;
    }

    public static ParameterizedType newParameterizedTypeWithOwner(Type type, Type type2, Type... typeArr) {
        if (typeArr.length != 0) {
            return new Util.ParameterizedTypeImpl(type, type2, typeArr);
        }
        kbs.f(type2, "Missing type arguments for ");
        return null;
    }

    public static Set<? extends Annotation> nextAnnotations(Set<? extends Annotation> set, Class<? extends Annotation> cls) {
        if (!cls.isAnnotationPresent(JsonQualifier.class)) {
            vg10.e(cls, " is not a JsonQualifier.");
            return null;
        }
        if (set.isEmpty()) {
            return null;
        }
        for (Annotation annotation : set) {
            if (cls.equals(annotation.annotationType())) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(set);
                linkedHashSet.remove(annotation);
                return Collections.unmodifiableSet(linkedHashSet);
            }
        }
        return null;
    }

    public static WildcardType subtypeOf(Type type) {
        return new Util.WildcardTypeImpl(type instanceof WildcardType ? ((WildcardType) type).getUpperBounds() : new Type[]{type}, Util.EMPTY_TYPE_ARRAY);
    }

    public static WildcardType supertypeOf(Type type) {
        return new Util.WildcardTypeImpl(new Type[]{Object.class}, type instanceof WildcardType ? ((WildcardType) type).getLowerBounds() : new Type[]{type});
    }

    public static String generatedJsonAdapterName(String str) {
        return str.replace("$", "_") + "JsonAdapter";
    }
}
