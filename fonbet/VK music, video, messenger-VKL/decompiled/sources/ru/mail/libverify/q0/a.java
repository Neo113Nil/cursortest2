package ru.mail.libverify.q0;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.auth.zzfr;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.mail.verify.core.utils.Gsonable;
import ru.mail.verify.core.utils.json.JsonParseException;

/* loaded from: classes9.dex */
public final class a {
    private static final ConcurrentHashMap<Object, Boolean> a = new ConcurrentHashMap<>();

    @NonNull
    public static <T> T a(@NonNull String str, @NonNull Class<T> cls) throws JsonParseException {
        if (TextUtils.isEmpty(str)) {
            throw new JsonParseException("Empty json");
        }
        if (a((Class<?>) cls)) {
            try {
                return (T) b(new JSONObject(str), cls);
            } catch (JSONException e) {
                throw new JsonParseException(e);
            }
        }
        if (!cls.isArray() || !a(cls.getComponentType())) {
            throw new IllegalArgumentException("Type deserialization is not supported ".concat(cls.getName()));
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            try {
                return (T) a(jSONArray, (Class<?>) cls);
            } catch (Throwable th) {
                jSONArray.toString();
                throw new JsonParseException(th);
            }
        } catch (JSONException e2) {
            throw new JsonParseException(e2);
        }
    }

    @NonNull
    private static <T> T b(@NonNull JSONObject jSONObject, @NonNull Class<T> cls) throws JsonParseException {
        b bVar;
        try {
            Constructor<T> declaredConstructor = cls.getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            T newInstance = declaredConstructor.newInstance(null);
            LinkedList<Field> linkedList = new LinkedList();
            while (cls.getSuperclass() != null) {
                for (Field field : cls.getDeclaredFields()) {
                    if (!Modifier.isStatic(field.getModifiers()) && !Modifier.isTransient(field.getModifiers())) {
                        linkedList.add(field);
                    }
                }
                cls = cls.getSuperclass();
            }
            for (Field field2 : linkedList) {
                String name = (!field2.isAnnotationPresent(b.class) || (bVar = (b) field2.getAnnotation(b.class)) == null || bVar.value() == null) ? field2.getName() : bVar.value();
                if (jSONObject.has(name)) {
                    field2.setAccessible(true);
                    Class<?> type = field2.getType();
                    if (type == String.class) {
                        field2.set(newInstance, jSONObject.get(name));
                    } else {
                        if (type != Integer.TYPE && type != Integer.class) {
                            if (type != Long.TYPE && type != Long.class) {
                                if (type != Double.TYPE && type != Double.class) {
                                    if (type.isArray()) {
                                        field2.set(newInstance, a(jSONObject.getJSONArray(name), type));
                                    } else if (a(type, Map.class)) {
                                        field2.set(newInstance, a(jSONObject, field2));
                                    } else {
                                        if (!a(type, Set.class) && !a(type, List.class)) {
                                            if (a(type)) {
                                                field2.set(newInstance, b(jSONObject.getJSONObject(name), type));
                                            } else if (type.isEnum()) {
                                                field2.set(newInstance, b(jSONObject.getString(name), type));
                                            } else {
                                                field2.set(newInstance, jSONObject.isNull(name) ? null : jSONObject.get(name));
                                            }
                                        }
                                        field2.set(newInstance, a(jSONObject, field2, name, type));
                                    }
                                }
                                field2.set(newInstance, Long.valueOf(jSONObject.getLong(name)));
                            }
                            field2.set(newInstance, Long.valueOf(jSONObject.getLong(name)));
                        }
                        field2.set(newInstance, Integer.valueOf(jSONObject.getInt(name)));
                    }
                }
            }
            return newInstance;
        } catch (Throwable th) {
            jSONObject.toString();
            throw new JsonParseException(th);
        }
    }

    @NonNull
    public static <T> List<T> c(@NonNull String str, @NonNull Class<T> cls) throws JsonParseException {
        JsonParseException jsonParseException;
        try {
            try {
                return Arrays.asList((Object[]) a(new JSONArray(str), (Class<?>) cls));
            } finally {
            }
        } catch (JSONException e) {
            throw new JsonParseException(e);
        }
    }

    @NonNull
    public static <T> HashMap<String, T> d(@NonNull String str, @NonNull Class<T> cls) throws JsonParseException {
        try {
            return a(new JSONObject(str), cls);
        } catch (JSONException e) {
            throw new JsonParseException(e);
        }
    }

    private static boolean e(@Nullable Object obj) {
        if (obj == null || (obj instanceof Map) || (obj instanceof List) || (obj instanceof Set) || (obj instanceof String)) {
            return false;
        }
        return a(obj.getClass());
    }

    @NonNull
    public static String f(@NonNull Object obj) throws JsonParseException {
        if (e(obj)) {
            return d(obj).toString();
        }
        if (obj.getClass().isArray()) {
            return a(obj).toString();
        }
        if (obj instanceof Map) {
            return c(obj).toString();
        }
        if ((obj instanceof List) || (obj instanceof Set)) {
            return b(obj).toString();
        }
        throw new IllegalArgumentException("Type serialization is not supported");
    }

    @NonNull
    private static JSONObject d(@NonNull Object obj) throws JsonParseException {
        String name;
        b bVar;
        try {
            JSONObject jSONObject = new JSONObject();
            ArrayList arrayList = new ArrayList();
            for (Class<?> cls = obj.getClass(); cls.getSuperclass() != null; cls = cls.getSuperclass()) {
                arrayList.addAll(Arrays.asList(cls.getDeclaredFields()));
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Field field = (Field) it.next();
                if (!Modifier.isStatic(field.getModifiers()) && !Modifier.isTransient(field.getModifiers())) {
                    if (field.isAnnotationPresent(b.class) && (bVar = (b) field.getAnnotation(b.class)) != null && bVar.value() != null) {
                        name = bVar.value();
                    } else {
                        name = field.getName();
                    }
                    field.setAccessible(true);
                    Object obj2 = field.get(obj);
                    if (obj2 != null) {
                        Class<?> type = field.getType();
                        if (type.isArray()) {
                            jSONObject.put(name, a(obj2));
                        } else {
                            if (!a(type, Set.class) && !a(type, List.class)) {
                                if (a(type, Map.class)) {
                                    jSONObject.put(name, c(obj2));
                                } else if (a(type)) {
                                    jSONObject.put(name, d(obj2));
                                } else {
                                    jSONObject.put(name, obj2);
                                }
                            }
                            jSONObject.put(name, b(obj2));
                        }
                    }
                }
            }
            return jSONObject;
        } catch (Throwable th) {
            obj.toString();
            throw new JsonParseException(th);
        }
    }

    @NonNull
    private static JSONObject c(@NonNull Object obj) throws JsonParseException {
        try {
            JSONObject jSONObject = new JSONObject();
            Map map = (Map) obj;
            for (Object obj2 : map.keySet()) {
                String str = (String) obj2;
                Object obj3 = map.get(obj2);
                if (e(obj3)) {
                    jSONObject.put(str, d(obj3));
                } else {
                    if (!(obj3 instanceof List) && !(obj3 instanceof Set)) {
                        if (obj3 instanceof Map) {
                            jSONObject.put(str, c(obj3));
                        } else {
                            jSONObject.put(str, obj3);
                        }
                    }
                    jSONObject.put(str, b(obj3));
                }
            }
            return jSONObject;
        } catch (Throwable th) {
            obj.toString();
            throw new JsonParseException(th);
        }
    }

    @NonNull
    private static <T> HashMap<String, T> a(@NonNull JSONObject jSONObject, @NonNull Class<T> cls) throws JsonParseException {
        try {
            zzfr zzfrVar = (HashMap<String, T>) new HashMap();
            Iterator<String> keys = jSONObject.keys();
            if (a((Class<?>) cls)) {
                while (keys.hasNext()) {
                    String next = keys.next();
                    zzfrVar.put(next, b((JSONObject) jSONObject.get(next), cls));
                }
            } else {
                while (keys.hasNext()) {
                    String next2 = keys.next();
                    zzfrVar.put(next2, jSONObject.get(next2));
                }
            }
            return zzfrVar;
        } catch (Throwable th) {
            jSONObject.toString();
            throw new JsonParseException(th);
        }
    }

    @NonNull
    private static HashMap a(@NonNull JSONObject jSONObject, @NonNull Field field) throws JSONException, JsonParseException {
        String name;
        Class cls;
        Class cls2;
        b bVar;
        if (field.isAnnotationPresent(b.class) && (bVar = (b) field.getAnnotation(b.class)) != null && bVar.value() != null) {
            name = bVar.value();
        } else {
            name = field.getName();
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(name);
        HashMap hashMap = new HashMap();
        Type genericType = field.getGenericType();
        if (genericType instanceof ParameterizedType) {
            Type[] actualTypeArguments = ((ParameterizedType) genericType).getActualTypeArguments();
            if (actualTypeArguments.length == 2) {
                cls = (Class) actualTypeArguments[0];
                cls2 = (Class) actualTypeArguments[1];
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            cls = null;
            cls2 = null;
        }
        if (cls != null && cls2 != null) {
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (cls2.isEnum()) {
                    hashMap.put(next, b(jSONObject2.getString(next), cls2));
                } else if (a((Class<?>) cls2)) {
                    hashMap.put(next, b(jSONObject2.getJSONObject(next), cls2));
                } else if (cls2 == Object.class) {
                    hashMap.put(next, jSONObject2.get(next));
                } else {
                    hashMap.put(next, jSONObject2.getString(next));
                }
            }
            return hashMap;
        }
        throw new IllegalArgumentException();
    }

    @NonNull
    private static JSONArray b(@NonNull Object obj) throws JsonParseException {
        try {
            JSONArray jSONArray = new JSONArray();
            for (Object obj2 : (Collection) obj) {
                if (e(obj2)) {
                    jSONArray.put(d(obj2));
                } else {
                    jSONArray.put(obj2);
                }
            }
            return jSONArray;
        } catch (Throwable th) {
            obj.toString();
            throw new JsonParseException(th);
        }
    }

    @NonNull
    private static AbstractCollection a(@NonNull JSONObject jSONObject, @NonNull Field field, @NonNull String str, Class cls) throws JSONException, JsonParseException {
        AbstractCollection arrayList;
        Class cls2;
        JSONArray jSONArray = jSONObject.getJSONArray(str);
        if (cls == Set.class) {
            arrayList = new HashSet();
        } else if (cls == LinkedList.class) {
            arrayList = new LinkedList();
        } else if (cls == LinkedHashSet.class) {
            arrayList = new LinkedHashSet();
        } else {
            arrayList = new ArrayList();
        }
        Type genericType = field.getGenericType();
        if (genericType instanceof ParameterizedType) {
            Type[] actualTypeArguments = ((ParameterizedType) genericType).getActualTypeArguments();
            if (actualTypeArguments.length == 1) {
                cls2 = (Class) actualTypeArguments[0];
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            cls2 = null;
        }
        if (cls2 != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                if (cls2.isEnum()) {
                    arrayList.add(b(jSONArray.getString(i), cls2));
                } else if (a((Class<?>) cls2)) {
                    arrayList.add(b(jSONArray.getJSONObject(i), cls2));
                } else {
                    arrayList.add(jSONArray.get(i));
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException();
    }

    @Nullable
    private static Enum b(@Nullable String str, @Nullable Class cls) {
        b bVar;
        if (str != null) {
            for (Field field : cls.getFields()) {
                if (field.isAnnotationPresent(b.class) && (bVar = (b) field.getAnnotation(b.class)) != null && TextUtils.equals(bVar.value(), str)) {
                    str = field.getName();
                    break;
                }
            }
            try {
                return Enum.valueOf(cls, str);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    private static boolean a(@NonNull Class cls, @NonNull Class cls2) {
        if (cls == cls2) {
            return true;
        }
        if (cls2.isInterface()) {
            Class superclass = cls.getSuperclass();
            if (superclass != null && a(superclass, cls2)) {
                return true;
            }
            for (Class<?> cls3 : cls.getInterfaces()) {
                if (a(cls3, cls2)) {
                    return true;
                }
            }
            return false;
        }
        return cls.isAssignableFrom(cls2);
    }

    @NonNull
    private static JSONArray a(@NonNull Object obj) throws JsonParseException {
        try {
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < Array.getLength(obj); i++) {
                Object obj2 = Array.get(obj, i);
                if (e(obj2)) {
                    jSONArray.put(d(obj2));
                } else {
                    jSONArray.put(obj2);
                }
            }
            return jSONArray;
        } catch (Throwable th) {
            obj.toString();
            throw new JsonParseException(th);
        }
    }

    @NonNull
    private static Object a(@NonNull JSONArray jSONArray, @NonNull Class<?> cls) throws JSONException, JsonParseException {
        Class<?> componentType = cls.getComponentType();
        if (componentType == null) {
            componentType = cls;
        }
        Object newInstance = Array.newInstance(componentType, jSONArray.length());
        int i = 0;
        if (a(componentType)) {
            while (i < jSONArray.length()) {
                Array.set(newInstance, i, b(jSONArray.getJSONObject(i), componentType));
                i++;
            }
        } else if (componentType.isEnum()) {
            while (i < jSONArray.length()) {
                Array.set(newInstance, i, b(jSONArray.getString(i), componentType));
                i++;
            }
        } else if (cls != Integer.TYPE && cls != Integer.class) {
            if (cls != Long.TYPE && cls != Long.class) {
                if (cls != Double.TYPE && cls != Double.class) {
                    while (i < jSONArray.length()) {
                        Array.set(newInstance, i, jSONArray.get(i));
                        i++;
                    }
                } else {
                    while (i < jSONArray.length()) {
                        Array.set(newInstance, i, Double.valueOf(jSONArray.getDouble(i)));
                        i++;
                    }
                }
            } else {
                while (i < jSONArray.length()) {
                    Array.set(newInstance, i, Long.valueOf(jSONArray.getLong(i)));
                    i++;
                }
            }
        } else {
            while (i < jSONArray.length()) {
                Array.set(newInstance, i, Integer.valueOf(jSONArray.getInt(i)));
                i++;
            }
        }
        return newInstance;
    }

    private static boolean a(@Nullable Class<?> cls) {
        if (cls != null && !cls.isPrimitive() && !cls.isEnum() && !cls.isArray() && cls != String.class && cls != Map.class && cls != List.class && cls != Set.class) {
            if (a.containsKey(cls)) {
                return true;
            }
            for (Class<?> cls2 = cls; cls2.getSuperclass() != null; cls2 = cls2.getSuperclass()) {
                for (Class<?> cls3 : cls2.getInterfaces()) {
                    if (cls3 == Gsonable.class) {
                        a.put(cls, Boolean.TRUE);
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
