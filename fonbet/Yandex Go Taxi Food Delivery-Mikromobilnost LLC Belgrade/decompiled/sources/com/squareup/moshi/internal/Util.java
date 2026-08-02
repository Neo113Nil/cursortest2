package com.squareup.moshi.internal;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonClass;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonQualifier;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import defpackage.b64;
import defpackage.ny61;
import defpackage.qv10;
import defpackage.s2u0;
import defpackage.w511;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class Util {
    public static final Class<?> DEFAULT_CONSTRUCTOR_MARKER;
    public static final Class a;
    public static final Map b;
    public static final Set<Annotation> NO_ANNOTATIONS = Collections.EMPTY_SET;
    public static final Type[] EMPTY_TYPE_ARRAY = new Type[0];

    /* loaded from: classes11.dex */
    public static final class GenericArrayTypeImpl implements GenericArrayType {
        public final Type a;

        public GenericArrayTypeImpl(Type type) {
            this.a = Util.canonicalize(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && Types.equals(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.a;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return Util.c(this.a) + "[]";
        }
    }

    public static final class ParameterizedTypeImpl implements ParameterizedType {
        public final Type a;
        public final Type b;
        public final Type[] typeArguments;

        public ParameterizedTypeImpl(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class<?> enclosingClass = ((Class) type2).getEnclosingClass();
                if (type != null) {
                    if (enclosingClass == null || Types.getRawType(type) != enclosingClass) {
                        w511.l("unexpected owner type for ", type2, Extension.COLON_SPACE, type);
                        throw null;
                    }
                } else if (enclosingClass != null) {
                    w511.t("unexpected owner type for ", type2, ": null");
                    throw null;
                }
            }
            this.a = type != null ? Util.canonicalize(type) : null;
            this.b = Util.canonicalize(type2);
            this.typeArguments = (Type[]) typeArr.clone();
            int i = 0;
            while (true) {
                Type[] typeArr2 = this.typeArguments;
                if (i >= typeArr2.length) {
                    return;
                }
                typeArr2[i].getClass();
                Util.a(this.typeArguments[i]);
                Type[] typeArr3 = this.typeArguments;
                typeArr3[i] = Util.canonicalize(typeArr3[i]);
                i++;
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && Types.equals(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.typeArguments.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.a;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.b;
        }

        public int hashCode() {
            int hashCode = Arrays.hashCode(this.typeArguments) ^ this.b.hashCode();
            Set<Annotation> set = Util.NO_ANNOTATIONS;
            Type type = this.a;
            return (type != null ? type.hashCode() : 0) ^ hashCode;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder((this.typeArguments.length + 1) * 30);
            sb.append(Util.c(this.b));
            if (this.typeArguments.length == 0) {
                return sb.toString();
            }
            sb.append("<");
            sb.append(Util.c(this.typeArguments[0]));
            for (int i = 1; i < this.typeArguments.length; i++) {
                sb.append(Extension.FIX_SPACE);
                sb.append(Util.c(this.typeArguments[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* loaded from: classes11.dex */
    public static final class WildcardTypeImpl implements WildcardType {
        public final Type a;
        public final Type b;

        public WildcardTypeImpl(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                w511.q();
                throw null;
            }
            if (typeArr.length != 1) {
                w511.q();
                throw null;
            }
            if (typeArr2.length != 1) {
                typeArr[0].getClass();
                Util.a(typeArr[0]);
                this.b = null;
                this.a = Util.canonicalize(typeArr[0]);
                return;
            }
            typeArr2[0].getClass();
            Util.a(typeArr2[0]);
            if (typeArr[0] != Object.class) {
                w511.q();
                throw null;
            }
            this.b = Util.canonicalize(typeArr2[0]);
            this.a = Object.class;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && Types.equals(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.b;
            return type != null ? new Type[]{type} : Util.EMPTY_TYPE_ARRAY;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.a};
        }

        public int hashCode() {
            Type type = this.b;
            return (this.a.hashCode() + 31) ^ (type != null ? type.hashCode() + 31 : 1);
        }

        public String toString() {
            Type type = this.b;
            if (type != null) {
                return "? super " + Util.c(type);
            }
            Type type2 = this.a;
            if (type2 == Object.class) {
                return "?";
            }
            return "? extends " + Util.c(type2);
        }
    }

    static {
        Class<?> cls;
        try {
            cls = Class.forName(getKotlinMetadataClassName());
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        a = cls;
        DEFAULT_CONSTRUCTOR_MARKER = DefaultConstructorMarker.class;
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        linkedHashMap.put(Boolean.TYPE, Boolean.class);
        linkedHashMap.put(Byte.TYPE, Byte.class);
        linkedHashMap.put(Character.TYPE, Character.class);
        linkedHashMap.put(Double.TYPE, Double.class);
        linkedHashMap.put(Float.TYPE, Float.class);
        linkedHashMap.put(Integer.TYPE, Integer.class);
        linkedHashMap.put(Long.TYPE, Long.class);
        linkedHashMap.put(Short.TYPE, Short.class);
        linkedHashMap.put(Void.TYPE, Void.class);
        b = Collections.unmodifiableMap(linkedHashMap);
    }

    public static void a(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            w511.t("Unexpected primitive ", type, ". Use the boxed type.");
        }
    }

    public static Type b(Type type, Class cls, Type type2, LinkedHashSet linkedHashSet) {
        TypeVariable typeVariable;
        do {
            int i = 0;
            if (!(type2 instanceof TypeVariable)) {
                if (type2 instanceof Class) {
                    Class cls2 = (Class) type2;
                    if (cls2.isArray()) {
                        Class<?> componentType = cls2.getComponentType();
                        Type b2 = b(type, cls, componentType, linkedHashSet);
                        return componentType == b2 ? cls2 : Types.arrayOf(b2);
                    }
                }
                if (type2 instanceof GenericArrayType) {
                    GenericArrayType genericArrayType = (GenericArrayType) type2;
                    Type genericComponentType = genericArrayType.getGenericComponentType();
                    Type b3 = b(type, cls, genericComponentType, linkedHashSet);
                    return genericComponentType == b3 ? genericArrayType : Types.arrayOf(b3);
                }
                if (type2 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type2;
                    Type ownerType = parameterizedType.getOwnerType();
                    Type b4 = b(type, cls, ownerType, linkedHashSet);
                    boolean z = b4 != ownerType;
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    int length = actualTypeArguments.length;
                    while (i < length) {
                        Type b5 = b(type, cls, actualTypeArguments[i], linkedHashSet);
                        if (b5 != actualTypeArguments[i]) {
                            if (!z) {
                                actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                z = true;
                            }
                            actualTypeArguments[i] = b5;
                        }
                        i++;
                    }
                    return z ? new ParameterizedTypeImpl(b4, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
                }
                boolean z2 = type2 instanceof WildcardType;
                Type type3 = type2;
                if (z2) {
                    WildcardType wildcardType = (WildcardType) type2;
                    Type[] lowerBounds = wildcardType.getLowerBounds();
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    if (lowerBounds.length == 1) {
                        Type b6 = b(type, cls, lowerBounds[0], linkedHashSet);
                        type3 = wildcardType;
                        if (b6 != lowerBounds[0]) {
                            return Types.supertypeOf(b6);
                        }
                    } else {
                        type3 = wildcardType;
                        if (upperBounds.length == 1) {
                            Type b7 = b(type, cls, upperBounds[0], linkedHashSet);
                            type3 = wildcardType;
                            if (b7 != upperBounds[0]) {
                                return Types.subtypeOf(b7);
                            }
                        }
                    }
                }
                return type3;
            }
            typeVariable = (TypeVariable) type2;
            if (linkedHashSet.contains(typeVariable)) {
                return type2;
            }
            linkedHashSet.add(typeVariable);
            GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
            Class cls3 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
            if (cls3 != null) {
                Type genericSupertype = getGenericSupertype(type, cls, cls3);
                if (genericSupertype instanceof ParameterizedType) {
                    TypeVariable[] typeParameters = cls3.getTypeParameters();
                    while (i < typeParameters.length) {
                        if (typeVariable.equals(typeParameters[i])) {
                            type2 = ((ParameterizedType) genericSupertype).getActualTypeArguments()[i];
                        } else {
                            i++;
                        }
                    }
                    ny61.p();
                    return null;
                }
            }
            type2 = typeVariable;
        } while (type2 != typeVariable);
        return type2;
    }

    public static <T> Class<T> boxIfPrimitive(Class<T> cls) {
        Class<T> cls2 = (Class) b.get(cls);
        return cls2 == null ? cls : cls2;
    }

    public static String c(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static Type canonicalize(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new GenericArrayTypeImpl(canonicalize(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            if (type instanceof ParameterizedTypeImpl) {
                return type;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new ParameterizedTypeImpl(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return type instanceof GenericArrayTypeImpl ? type : new GenericArrayTypeImpl(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType) || (type instanceof WildcardTypeImpl)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new WildcardTypeImpl(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    public static JsonAdapter<?> generatedAdapter(Moshi moshi, Type type, Class<?> cls) {
        Class<?> cls2;
        Constructor<?> declaredConstructor;
        Object[] objArr;
        JsonClass jsonClass = (JsonClass) cls.getAnnotation(JsonClass.class);
        if (jsonClass != null && jsonClass.generateAdapter()) {
            try {
                try {
                    cls2 = Class.forName(Types.generatedJsonAdapterName(cls.getName()), true, cls.getClassLoader());
                } catch (NoSuchMethodException e) {
                    e = e;
                    cls2 = null;
                }
                try {
                    if (type instanceof ParameterizedType) {
                        Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                        try {
                            declaredConstructor = cls2.getDeclaredConstructor(Moshi.class, Type[].class);
                            objArr = new Object[]{moshi, actualTypeArguments};
                        } catch (NoSuchMethodException unused) {
                            declaredConstructor = cls2.getDeclaredConstructor(Type[].class);
                            objArr = new Object[]{actualTypeArguments};
                        }
                    } else {
                        try {
                            declaredConstructor = cls2.getDeclaredConstructor(Moshi.class);
                            objArr = new Object[]{moshi};
                        } catch (NoSuchMethodException unused2) {
                            declaredConstructor = cls2.getDeclaredConstructor(null);
                            objArr = new Object[0];
                        }
                    }
                    declaredConstructor.setAccessible(true);
                    return ((JsonAdapter) declaredConstructor.newInstance(objArr)).nullSafe();
                } catch (NoSuchMethodException e2) {
                    e = e2;
                    if ((type instanceof ParameterizedType) || cls2.getTypeParameters().length == 0) {
                        s2u0.f(type, "Failed to find the generated JsonAdapter constructor for ", e);
                        return null;
                    }
                    StringBuilder sb = new StringBuilder("Failed to find the generated JsonAdapter constructor for '");
                    sb.append(type);
                    String canonicalName = cls2.getCanonicalName();
                    sb.append("'. Suspiciously, the type was not parameterized but the target class '");
                    sb.append(canonicalName);
                    sb.append("' is generic. Consider using Types#newParameterizedType() to define these missing type variables.");
                    throw new RuntimeException(sb.toString(), e);
                }
            } catch (ClassNotFoundException e3) {
                s2u0.f(type, "Failed to find the generated JsonAdapter class for ", e3);
            } catch (IllegalAccessException e4) {
                s2u0.f(type, "Failed to access the generated JsonAdapter for ", e4);
                return null;
            } catch (InstantiationException e5) {
                s2u0.f(type, "Failed to instantiate the generated JsonAdapter for ", e5);
                return null;
            } catch (InvocationTargetException e6) {
                throw rethrowCause(e6);
            }
        }
        return null;
    }

    public static Type getGenericSupertype(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return getGenericSupertype(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return getGenericSupertype(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    private static String getKotlinMetadataClassName() {
        return "kotlin.Metadata";
    }

    public static boolean hasNullable(Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().getSimpleName().equals("Nullable")) {
                return true;
            }
        }
        return false;
    }

    public static boolean isAnnotationPresent(Set<? extends Annotation> set, Class<? extends Annotation> cls) {
        if (set.isEmpty()) {
            return false;
        }
        Iterator<? extends Annotation> it = set.iterator();
        while (it.hasNext()) {
            if (it.next().annotationType() == cls) {
                return true;
            }
        }
        return false;
    }

    public static boolean isKotlin(Class<?> cls) {
        Class<? extends Annotation> cls2 = a;
        return cls2 != null && cls.isAnnotationPresent(cls2);
    }

    public static boolean isPlatformType(Class<?> cls) {
        String name = cls.getName();
        return name.startsWith("android.") || name.startsWith("androidx.") || name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("kotlin.") || name.startsWith("kotlinx.") || name.startsWith("scala.");
    }

    public static Set<? extends Annotation> jsonAnnotations(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(JsonQualifier.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : NO_ANNOTATIONS;
    }

    public static String jsonName(String str, Json json2) {
        if (json2 != null) {
            String name = json2.name();
            if (!"\u0000".equals(name)) {
                return name;
            }
        }
        return str;
    }

    public static <T> Constructor<T> lookupDefaultsConstructor(Class<T> cls) {
        if (DEFAULT_CONSTRUCTOR_MARKER == null) {
            ny61.r("DefaultConstructorMarker not on classpath. Make sure the Kotlin stdlib is on the classpath.");
            return null;
        }
        for (Object obj : cls.getDeclaredConstructors()) {
            Constructor<T> constructor = (Constructor<T>) obj;
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            if (parameterTypes.length != 0 && parameterTypes[parameterTypes.length - 1].equals(DEFAULT_CONSTRUCTOR_MARKER)) {
                constructor.setAccessible(true);
                return constructor;
            }
        }
        ny61.r(qv10.l(cls, "No defaults constructor found for "));
        return null;
    }

    public static JsonDataException missingProperty(String str, String str2, JsonReader jsonReader) {
        String sb;
        String path = jsonReader.getPath();
        if (str2.equals(str)) {
            sb = b64.l("Required value '", str, "' missing at ", path);
        } else {
            StringBuilder v = b64.v("Required value '", str, "' (JSON name '", str2, "') missing at ");
            v.append(path);
            sb = v.toString();
        }
        return new JsonDataException(sb);
    }

    public static Type removeSubtypeWildcard(Type type) {
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        if (wildcardType.getLowerBounds().length != 0) {
            return type;
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        if (upperBounds.length == 1) {
            return upperBounds[0];
        }
        w511.q();
        return null;
    }

    public static Type resolve(Type type, Class<?> cls, Type type2) {
        return b(type, cls, type2, new LinkedHashSet());
    }

    public static RuntimeException rethrowCause(InvocationTargetException invocationTargetException) {
        Throwable targetException = invocationTargetException.getTargetException();
        if (targetException instanceof RuntimeException) {
            throw ((RuntimeException) targetException);
        }
        if (targetException instanceof Error) {
            throw ((Error) targetException);
        }
        throw new RuntimeException(targetException);
    }

    public static String typeAnnotatedWithAnnotations(Type type, Set<? extends Annotation> set) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(type);
        if (set.isEmpty()) {
            str = " (with no annotations)";
        } else {
            str = " annotated " + set;
        }
        sb.append(str);
        return sb.toString();
    }

    public static boolean typesMatch(Type type, Type type2) {
        return Types.equals(type, type2);
    }

    public static JsonDataException unexpectedNull(String str, String str2, JsonReader jsonReader) {
        String sb;
        String path = jsonReader.getPath();
        if (str2.equals(str)) {
            sb = b64.l("Non-null value '", str, "' was null at ", path);
        } else {
            StringBuilder v = b64.v("Non-null value '", str, "' (JSON name '", str2, "') was null at ");
            v.append(path);
            sb = v.toString();
        }
        return new JsonDataException(sb);
    }

    public static String jsonName(String str, AnnotatedElement annotatedElement) {
        return jsonName(str, (Json) annotatedElement.getAnnotation(Json.class));
    }

    public static Set<? extends Annotation> jsonAnnotations(AnnotatedElement annotatedElement) {
        return jsonAnnotations(annotatedElement.getAnnotations());
    }
}
