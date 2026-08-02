package xsna;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.util.ArrayMap;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.car.app.serialization.BundlerException;
import androidx.core.graphics.drawable.IconCompat;
import com.ironsource.X3;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: Bundler.java */
/* loaded from: classes11.dex */
public final class go8 {
    public static final ArrayMap a;
    public static final ArrayMap b;

    /* compiled from: Bundler.java */
    public static class a extends d {
    }

    /* compiled from: Bundler.java */
    public static class b {
        public final Object a;
        public final String b;

        public b(Object obj, String str) {
            this.a = obj;
            this.b = str;
        }

        public final String a() {
            return X3.j.d + this.b + ", " + go8.i(this.a.getClass()) + X3.j.e;
        }

        public final String toString() {
            return a();
        }
    }

    /* compiled from: Bundler.java */
    public static class c implements AutoCloseable {

        @Nullable
        public final String[] b;
        public final ArrayDeque<b> c;

        public c(@Nullable Object obj, String str, ArrayDeque<b> arrayDeque) {
            this.c = arrayDeque;
            if (obj != null) {
                arrayDeque.addFirst(new b(obj, str));
                if (Log.isLoggable("CarApp.Bun", 2)) {
                    int min = Math.min(arrayDeque.size(), 11);
                    if (this.b == null) {
                        this.b = new String[12];
                    }
                    if (this.b[min] == null) {
                        char[] cArr = new char[min];
                        Arrays.fill(cArr, ' ');
                        String str2 = new String(cArr);
                        this.b[min] = min == 11 ? str2.concat("...") : str2;
                    }
                    go8.i(obj.getClass());
                }
            }
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            this.c.removeFirst();
        }

        public final String m() {
            StringBuilder sb = new StringBuilder();
            ArrayDeque<b> arrayDeque = this.c;
            int min = Math.min(arrayDeque.size(), 8);
            Iterator<b> descendingIterator = arrayDeque.descendingIterator();
            while (descendingIterator.hasNext()) {
                int i = min - 1;
                if (min <= 0) {
                    break;
                }
                sb.append(descendingIterator.next().a());
                min = i;
            }
            if (descendingIterator.hasNext()) {
                sb.append("[...]");
            }
            return sb.toString();
        }
    }

    static {
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put(Boolean.class, "bool");
        arrayMap.put(Byte.class, "byte");
        arrayMap.put(Short.class, "short");
        arrayMap.put(Integer.class, "int");
        arrayMap.put(Long.class, "long");
        arrayMap.put(Double.class, "double");
        arrayMap.put(Float.class, "float");
        arrayMap.put(String.class, "string");
        arrayMap.put(Parcelable.class, "parcelable");
        arrayMap.put(Map.class, "map");
        arrayMap.put(List.class, "list");
        arrayMap.put(IconCompat.class, "image");
        a = arrayMap;
        ArrayMap arrayMap2 = new ArrayMap();
        arrayMap2.put(0, "primitive");
        arrayMap2.put(1, "iInterface");
        arrayMap2.put(9, "iBinder");
        arrayMap2.put(2, "map");
        arrayMap2.put(3, "set");
        arrayMap2.put(4, "list");
        arrayMap2.put(5, "object");
        arrayMap2.put(6, "image");
        b = arrayMap2;
    }

    public static void a(Bundle bundle, AbstractCollection abstractCollection, c cVar) throws BundlerException {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("tag_value");
        if (parcelableArrayList == null) {
            throw new d("Bundle is missing the collection", cVar);
        }
        Iterator it = parcelableArrayList.iterator();
        while (it.hasNext()) {
            abstractCollection.add(f((Bundle) ((Parcelable) it.next()), cVar));
        }
    }

    public static Object b(Bundle bundle, c cVar) throws BundlerException {
        String string = bundle.getString("tag_value");
        if (string == null) {
            throw new d(zr.a("Missing enum name [", string, X3.j.e), cVar);
        }
        String string2 = bundle.getString("tag_class_name");
        if (string2 == null) {
            throw new d(zr.a("Missing enum className [", string2, X3.j.e), cVar);
        }
        try {
            return g(Class.forName(string2), "valueOf", cVar).invoke(null, string);
        } catch (ClassNotFoundException e) {
            throw new d(zr.a("Enum class [", string2, "] not found"), cVar, e);
        } catch (IllegalArgumentException e2) {
            throw new d(ss9.a("Enum value [", string, "] does not exist in enum class [", string2, X3.j.e), cVar, e2);
        } catch (ReflectiveOperationException e3) {
            throw new d(zr.a("Enum of class [", string2, "] missing valueOf method"), cVar, e3);
        }
    }

    public static Object c(Bundle bundle, c cVar) throws BundlerException {
        IBinder binder = bundle.getBinder("tag_value");
        if (binder == null) {
            throw new d("Bundle is missing the binder", cVar);
        }
        String string = bundle.getString("tag_class_name");
        if (string == null) {
            throw new d("Bundle is missing IInterface class name", cVar);
        }
        try {
            Object invoke = g(Class.forName(string), "asInterface", cVar).invoke(null, binder);
            if (invoke != null) {
                return invoke;
            }
            throw new d("Failed to get interface from binder", cVar);
        } catch (ClassNotFoundException e) {
            throw new d("Binder for unknown IInterface: ".concat(string), cVar, e);
        } catch (ReflectiveOperationException e2) {
            throw new d("Method to create IInterface from a Binder is not accessible for interface: ".concat(string), cVar, e2);
        }
    }

    public static HashMap d(Bundle bundle, c cVar) throws BundlerException {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("tag_value");
        if (parcelableArrayList == null) {
            throw new d("Bundle is missing the map", cVar);
        }
        HashMap hashMap = new HashMap();
        Iterator it = parcelableArrayList.iterator();
        while (it.hasNext()) {
            Bundle bundle2 = (Bundle) ((Parcelable) it.next());
            Bundle bundle3 = bundle2.getBundle("tag_1");
            Bundle bundle4 = bundle2.getBundle("tag_2");
            if (bundle3 == null) {
                throw new d("Bundle is missing key", cVar);
            }
            hashMap.put(f(bundle3, cVar), bundle4 == null ? null : f(bundle4, cVar));
        }
        return hashMap;
    }

    public static Object e(Bundle bundle, c cVar) throws BundlerException {
        String string = bundle.getString("tag_class_name");
        if (string == null) {
            throw new d("Bundle is missing the class name", cVar);
        }
        try {
            Class<?> cls = Class.forName(string);
            Constructor<?> declaredConstructor = cls.getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            Object newInstance = declaredConstructor.newInstance(null);
            Iterator it = h(cls).iterator();
            while (it.hasNext()) {
                Field field = (Field) it.next();
                field.setAccessible(true);
                String str = field.getDeclaringClass().getName() + field.getName();
                Object obj = bundle.get(str);
                if (obj == null) {
                    obj = bundle.get(str.replaceAll("androidx.core.graphics.drawable.IconCompat", "android.support.v4.graphics.drawable.IconCompat"));
                }
                if (obj instanceof Bundle) {
                    field.set(newInstance, f((Bundle) obj, cVar));
                } else if (obj == null && Log.isLoggable("CarApp.Bun", 3)) {
                    field.toString();
                }
            }
            return newInstance;
        } catch (ClassNotFoundException e) {
            throw new d("Object for unknown class: ".concat(string), cVar, e);
        } catch (IllegalArgumentException e2) {
            throw new d("Failed to deserialize class: ".concat(string), cVar, e2);
        } catch (NoSuchMethodException e3) {
            throw new d("Object missing no args constructor: ".concat(string), cVar, e3);
        } catch (ReflectiveOperationException e4) {
            throw new d("Constructor or field is not accessible: ".concat(string), cVar, e4);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(1:3)|4|(2:5|6)|65|66|67|68|69|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00f5, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00f6, code lost:
    
        r4.addSuppressed(r5);
     */
    @NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object f(@NonNull Bundle bundle, c cVar) throws BundlerException {
        ClassLoader classLoader = go8.class.getClassLoader();
        Objects.requireNonNull(classLoader);
        bundle.setClassLoader(classLoader);
        int i = bundle.getInt("tag_class_type");
        String str = (String) b.get(Integer.valueOf(bundle.getInt("tag_class_type")));
        if (str == null) {
            str = "unknown";
        }
        c cVar2 = new c(bundle, str, cVar.c);
        try {
            switch (i) {
                case 0:
                    Object obj = bundle.get("tag_value");
                    if (obj == null) {
                        throw new d("Bundle is missing the primitive value", cVar2);
                    }
                    cVar2.close();
                    return obj;
                case 1:
                    Object c2 = c(bundle, cVar2);
                    cVar2.close();
                    return c2;
                case 2:
                    HashMap d2 = d(bundle, cVar2);
                    cVar2.close();
                    return d2;
                case 3:
                    HashSet hashSet = new HashSet();
                    a(bundle, hashSet, cVar2);
                    cVar2.close();
                    return hashSet;
                case 4:
                    ArrayList arrayList = new ArrayList();
                    a(bundle, arrayList, cVar2);
                    cVar2.close();
                    return arrayList;
                case 5:
                    Object e = e(bundle, cVar2);
                    cVar2.close();
                    return e;
                case 6:
                    Bundle bundle2 = bundle.getBundle("tag_value");
                    if (bundle2 == null) {
                        throw new d("IconCompat bundle is null", cVar2);
                    }
                    IconCompat b2 = IconCompat.b(bundle2);
                    if (b2 == null) {
                        throw new d("Failed to create IconCompat from bundle", cVar2);
                    }
                    cVar2.close();
                    return b2;
                case 7:
                    Object b3 = b(bundle, cVar2);
                    cVar2.close();
                    return b3;
                case 8:
                    String string = bundle.getString("tag_value");
                    if (string == null) {
                        throw new d("Class is missing the class name", cVar2);
                    }
                    try {
                        Class<?> cls = Class.forName(string);
                        cVar2.close();
                        return cls;
                    } catch (ClassNotFoundException e2) {
                        throw new d("Class name is unknown: ".concat(string), cVar2, e2);
                    }
                case 9:
                    IBinder binder = bundle.getBinder("tag_value");
                    if (binder == null) {
                        throw new d("Bundle is missing the binder", cVar2);
                    }
                    cVar2.close();
                    return binder;
                case 10:
                    j1a0 a2 = j1a0.a(bundle);
                    cVar2.close();
                    return a2;
                default:
                    throw new d("Unsupported class type in bundle: " + i, cVar2);
            }
        } catch (Throwable th) {
            cVar2.close();
            throw th;
        }
        cVar2.close();
        throw th;
    }

    public static Method g(@Nullable Class<?> cls, String str, c cVar) throws d {
        if (cls == null || cls == Object.class) {
            throw new d("No method " + str + " in class " + cls, cVar);
        }
        for (Method method : cls.getDeclaredMethods()) {
            if (method.getName().equals(str)) {
                method.setAccessible(true);
                return method;
            }
        }
        return g(cls.getSuperclass(), str, cVar);
    }

    public static ArrayList h(@Nullable Class cls) {
        ArrayList arrayList = new ArrayList();
        if (cls != null && cls != Object.class) {
            for (Field field : cls.getDeclaredFields()) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    arrayList.add(field);
                }
            }
            arrayList.addAll(h(cls.getSuperclass()));
        }
        return arrayList;
    }

    public static String i(Class<?> cls) {
        String str = (String) a.get(cls);
        if (str == null) {
            if (List.class.isAssignableFrom(cls)) {
                return "<List>";
            }
            if (Map.class.isAssignableFrom(cls)) {
                return "<Map>";
            }
            if (Set.class.isAssignableFrom(cls)) {
                return "<Set>";
            }
        }
        return str == null ? cls.getSimpleName() : str;
    }

    public static Bundle j(Collection<Object> collection, c cVar) throws BundlerException {
        Bundle bundle = new Bundle(2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator<Object> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            arrayList.add(o(it.next(), "<item " + i + ">", cVar));
            i++;
        }
        bundle.putParcelableArrayList("tag_value", arrayList);
        return bundle;
    }

    public static Bundle k(Object obj, c cVar) throws BundlerException {
        Bundle bundle = new Bundle(3);
        bundle.putInt("tag_class_type", 7);
        try {
            bundle.putString("tag_value", (String) g(obj.getClass(), "name", cVar).invoke(obj, null));
            bundle.putString("tag_class_name", obj.getClass().getName());
            return bundle;
        } catch (ReflectiveOperationException e) {
            throw new d("Enum missing name method", cVar, e);
        }
    }

    public static Bundle l(Map<Object, Object> map, c cVar) throws BundlerException {
        Bundle bundle = new Bundle(2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        int i = 0;
        for (Map.Entry<Object, Object> entry : map.entrySet()) {
            Bundle bundle2 = new Bundle(2);
            bundle2.putBundle("tag_1", o(entry.getKey(), "<key " + i + ">", cVar));
            if (entry.getValue() != null) {
                bundle2.putBundle("tag_2", o(entry.getValue(), "<value " + i + ">", cVar));
            }
            i++;
            arrayList.add(bundle2);
        }
        bundle.putInt("tag_class_type", 2);
        bundle.putParcelableArrayList("tag_value", arrayList);
        return bundle;
    }

    public static Bundle m(Object obj, c cVar) throws BundlerException {
        String name = obj.getClass().getName();
        try {
            obj.getClass().getDeclaredConstructor(null);
            ArrayList h = h(obj.getClass());
            Bundle bundle = new Bundle(h.size() + 2);
            bundle.putInt("tag_class_type", 5);
            bundle.putString("tag_class_name", name);
            Iterator it = h.iterator();
            while (it.hasNext()) {
                Field field = (Field) it.next();
                field.setAccessible(true);
                String a2 = fo8.a(field.getDeclaringClass().getName(), field.getName());
                try {
                    Object obj2 = field.get(obj);
                    if (obj2 != null) {
                        bundle.putParcelable(a2, o(obj2, field.getName(), cVar));
                    }
                } catch (IllegalAccessException e) {
                    throw new d(go9.b("Field is not accessible: ", a2), cVar, e);
                }
            }
            return bundle;
        } catch (NoSuchMethodException e2) {
            throw new d("Class to deserialize is missing a no args constructor: ".concat(name), cVar, e2);
        }
    }

    public static Bundle n(Object obj, c cVar) throws BundlerException {
        Bundle bundle = new Bundle(2);
        bundle.putInt("tag_class_type", 0);
        if (obj instanceof Boolean) {
            bundle.putBoolean("tag_value", ((Boolean) obj).booleanValue());
            return bundle;
        }
        if (obj instanceof Byte) {
            bundle.putByte("tag_value", ((Byte) obj).byteValue());
            return bundle;
        }
        if (obj instanceof Character) {
            bundle.putChar("tag_value", ((Character) obj).charValue());
            return bundle;
        }
        if (obj instanceof Short) {
            bundle.putShort("tag_value", ((Short) obj).shortValue());
            return bundle;
        }
        if (obj instanceof Integer) {
            bundle.putInt("tag_value", ((Integer) obj).intValue());
            return bundle;
        }
        if (obj instanceof Long) {
            bundle.putLong("tag_value", ((Long) obj).longValue());
            return bundle;
        }
        if (obj instanceof Double) {
            bundle.putDouble("tag_value", ((Double) obj).doubleValue());
            return bundle;
        }
        if (obj instanceof Float) {
            bundle.putFloat("tag_value", ((Float) obj).floatValue());
            return bundle;
        }
        if (obj instanceof String) {
            bundle.putString("tag_value", (String) obj);
            return bundle;
        }
        if (!(obj instanceof Parcelable)) {
            throw new d("Unsupported primitive type: ".concat(obj.getClass().getName()), cVar);
        }
        bundle.putParcelable("tag_value", (Parcelable) obj);
        return bundle;
    }

    public static Bundle o(@Nullable Object obj, String str, c cVar) throws BundlerException {
        ArrayDeque<b> arrayDeque = cVar.c;
        if (obj != null) {
            Iterator<b> it = arrayDeque.iterator();
            while (it.hasNext()) {
                if (it.next().a == obj) {
                    throw new a("Found cycle while bundling type ".concat(obj.getClass().getSimpleName()), cVar);
                }
            }
        }
        c cVar2 = new c(obj, str, arrayDeque);
        try {
            if (obj == null) {
                throw new d("Bundling of null object is not supported", cVar2);
            }
            if (obj instanceof IconCompat) {
                Bundle bundle = new Bundle(2);
                bundle.putInt("tag_class_type", 6);
                bundle.putBundle("tag_value", ((IconCompat) obj).k());
                cVar2.close();
                return bundle;
            }
            if (!(obj instanceof Boolean) && !(obj instanceof Byte) && !(obj instanceof Character) && !(obj instanceof Short) && !(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Double) && !(obj instanceof Float) && !(obj instanceof String) && !(obj instanceof Parcelable)) {
                if (obj instanceof IInterface) {
                    IInterface iInterface = (IInterface) obj;
                    Bundle bundle2 = new Bundle(3);
                    String name = iInterface.getClass().getName();
                    bundle2.putInt("tag_class_type", 1);
                    bundle2.putBinder("tag_value", iInterface.asBinder());
                    bundle2.putString("tag_class_name", name);
                    cVar2.close();
                    return bundle2;
                }
                if (obj instanceof IBinder) {
                    Bundle bundle3 = new Bundle(2);
                    bundle3.putInt("tag_class_type", 9);
                    bundle3.putBinder("tag_value", (IBinder) obj);
                    cVar2.close();
                    return bundle3;
                }
                if (obj instanceof Map) {
                    Bundle l = l((Map) obj, cVar2);
                    cVar2.close();
                    return l;
                }
                if (obj instanceof List) {
                    Bundle j = j((List) obj, cVar2);
                    j.putInt("tag_class_type", 4);
                    cVar2.close();
                    return j;
                }
                if (obj instanceof Set) {
                    Bundle j2 = j((Set) obj, cVar2);
                    j2.putInt("tag_class_type", 3);
                    cVar2.close();
                    return j2;
                }
                if (obj.getClass().isEnum()) {
                    Bundle k = k(obj, cVar2);
                    cVar2.close();
                    return k;
                }
                if (obj instanceof Class) {
                    Bundle bundle4 = new Bundle(2);
                    bundle4.putInt("tag_class_type", 8);
                    bundle4.putString("tag_value", ((Class) obj).getName());
                    cVar2.close();
                    return bundle4;
                }
                if (obj.getClass().isArray()) {
                    throw new d("Object serializing contains an array, use a list or a set instead", cVar2);
                }
                if (!(obj instanceof j1a0)) {
                    Bundle m = m(obj, cVar2);
                    cVar2.close();
                    return m;
                }
                Bundle c2 = ((j1a0) obj).c();
                c2.putInt("tag_class_type", 10);
                cVar2.close();
                return c2;
            }
            Bundle n = n(obj, cVar2);
            cVar2.close();
            return n;
        } catch (Throwable th) {
            try {
                cVar2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* compiled from: Bundler.java */
    public static class d extends BundlerException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public d(String str, c cVar) {
            super(r2.toString());
            StringBuilder b = ho8.b(str, ", frames: ");
            b.append(cVar.m());
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public d(String str, c cVar, Exception exc) {
            super(r2.toString(), exc);
            StringBuilder b = ho8.b(str, ", frames: ");
            b.append(cVar.m());
        }
    }
}
