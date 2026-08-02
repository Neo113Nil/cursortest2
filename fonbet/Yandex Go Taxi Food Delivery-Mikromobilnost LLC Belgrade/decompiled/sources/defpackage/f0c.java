package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.yandex.messaging.protojson.EmbeddedJsonAdapter;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.NotImplementedError;

/* loaded from: classes15.dex */
public final class f0c extends ProtoAdapter {
    public final imb1 a;
    public final SparseArray b;

    /* JADX WARN: Code restructure failed: missing block: B:97:0x0241, code lost:
    
        r4 = defpackage.vp11.a(r2);
        r2 = defpackage.y6a1.e(r2, r4, r4.getGenericSuperclass());
        r8 = r8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015d A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f0c(ouf0 ouf0Var, Type type, Class cls) {
        super(FieldEncoding.LENGTH_DELIMITED, (Class<?>) cls);
        imb1 a0cVar;
        Throwable th;
        int i;
        Pair pair;
        e0c e0cVar;
        e0c e0cVar2;
        int i2 = 0;
        ?? r8 = 0;
        try {
            try {
                try {
                    try {
                        Constructor declaredConstructor = cls.getDeclaredConstructor(null);
                        declaredConstructor.setAccessible(true);
                        a0cVar = new a0c(declaredConstructor, cls, 0);
                    } catch (Exception unused) {
                        ny61.g("cannot construct instances of ".concat(cls.getName()));
                        throw null;
                    }
                } catch (NoSuchMethodException unused2) {
                    Class<?> cls2 = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls2.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    a0cVar = new b0c(cls2.getMethod("allocateInstance", Class.class), declaredField.get(null), cls);
                }
            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused3) {
                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                declaredMethod.setAccessible(true);
                int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                declaredMethod2.setAccessible(true);
                a0cVar = new c0c(declaredMethod2, cls, intValue);
            } catch (IllegalAccessException unused4) {
                ny61.w();
                throw null;
            }
        } catch (IllegalAccessException unused5) {
            ny61.w();
            throw null;
        } catch (NoSuchMethodException unused6) {
            Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
            declaredMethod3.setAccessible(true);
            a0cVar = new a0c(declaredMethod3, cls, 1);
        } catch (InvocationTargetException e) {
            ny61.j(e);
            throw null;
        }
        this.a = a0cVar;
        this.b = new SparseArray();
        Type type2 = type;
        while (type2 != Object.class) {
            Class a = vp11.a(type2);
            String name = a.getName();
            int i3 = (name.startsWith("android.") || name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("kotlin.") || name.startsWith("scala.")) ? 1 : i2;
            Field[] declaredFields = a.getDeclaredFields();
            int i4 = i2;
            while (true) {
                if ((i4 < declaredFields.length ? 1 : i2) != 0) {
                    int i5 = i4 + 1;
                    try {
                        Field field = declaredFields[i4];
                        int modifiers = field.getModifiers();
                        if (Modifier.isStatic(modifiers) || Modifier.isTransient(modifiers) || !(Modifier.isPublic(modifiers) || Modifier.isProtected(modifiers) || i3 == 0)) {
                            i = i2;
                            th = r8;
                        } else {
                            xuf0 xuf0Var = (xuf0) field.getAnnotation(xuf0.class);
                            z83.i();
                            if (xuf0Var != null) {
                                field.setAccessible(true);
                                ?? r16 = ((cex) field.getAnnotation(cex.class)) != null ? 1 : i2;
                                Type e2 = y6a1.e(type2, a, field.getGenericType());
                                if (field.getAnnotation(zuf0.class) != null) {
                                    if (e2 instanceof ParameterizedType) {
                                        Type[] actualTypeArguments = ((ParameterizedType) e2).getActualTypeArguments();
                                        i = i2;
                                        if (actualTypeArguments.length == 2) {
                                            pair = new Pair(actualTypeArguments[i], actualTypeArguments[1]);
                                            if (pair == null) {
                                                ny61.f("@ProtoMap fields must be  Map<A, B>");
                                                throw r8;
                                            }
                                        }
                                    } else {
                                        i = i2;
                                    }
                                    pair = r8;
                                    if (pair == null) {
                                    }
                                } else {
                                    i = i2;
                                    pair = r8;
                                }
                                Type genericComponentType = e2 instanceof GenericArrayType ? ((GenericArrayType) e2).getGenericComponentType() : e2 instanceof Class ? ((Class) e2).getComponentType() : r8;
                                if (xuf0Var.encoding() == 1) {
                                    th = r8;
                                    e0cVar = new e0c(xuf0Var.tag(), field, new EmbeddedJsonAdapter(ouf0Var.a.adapter(e2)), r16, null, false);
                                } else {
                                    th = r8;
                                    if (pair != null) {
                                        e0cVar2 = new e0c(xuf0Var.tag(), field, ProtoAdapter.newMapAdapter(ouf0Var.a((Type) pair.first), ouf0Var.a((Type) pair.second)), r16, null, true);
                                    } else if (genericComponentType != null) {
                                        e0cVar2 = jl40.l(Byte.TYPE, genericComponentType) ? new e0c(xuf0Var.tag(), field, k80.g, r16, null, false) : new e0c(xuf0Var.tag(), field, ouf0Var.a(genericComponentType), r16, vp11.a(genericComponentType), false);
                                    } else {
                                        e0cVar = new e0c(xuf0Var.tag(), field, ouf0Var.a(e2), r16, null, false);
                                    }
                                    e0cVar = e0cVar2;
                                }
                                e0c e0cVar3 = (e0c) this.b.get(xuf0Var.tag());
                                if (e0cVar3 != null) {
                                    vm7.e("Conflicting fields:\n    ", e0cVar3.b, "\n    ", e0cVar.b);
                                    throw th;
                                }
                                this.b.put(xuf0Var.tag(), e0cVar);
                            } else {
                                i4 = i5;
                            }
                        }
                        i4 = i5;
                        i2 = i;
                        r8 = th;
                    } catch (ArrayIndexOutOfBoundsException e3) {
                        Throwable th2 = r8;
                        w511.i(e3.getMessage());
                        throw th2;
                    }
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        SparseArray sparseArray;
        try {
            Object c = this.a.c();
            SparseArray sparseArray2 = new SparseArray();
            long beginMessage = protoReader.beginMessage();
            int nextTag = protoReader.nextTag();
            while (true) {
                sparseArray = this.b;
                if (nextTag == -1) {
                    break;
                }
                e0c e0cVar = (e0c) sparseArray.get(nextTag);
                if (e0cVar != null) {
                    ProtoAdapter protoAdapter = e0cVar.c;
                    if (e0cVar.e != null || e0cVar.f) {
                        ArrayList arrayList = (ArrayList) sparseArray2.get(nextTag);
                        if (arrayList == null) {
                            arrayList = new ArrayList(128);
                            sparseArray2.put(nextTag, arrayList);
                        }
                        arrayList.add(protoAdapter.decode(protoReader));
                    } else {
                        e0cVar.b.set(c, protoAdapter.decode(protoReader));
                    }
                } else {
                    protoReader.skip();
                }
                nextTag = protoReader.nextTag();
            }
            protoReader.endMessage(beginMessage);
            int size = sparseArray2.size();
            for (int i = 0; i < size; i++) {
                int keyAt = sparseArray2.keyAt(i);
                ArrayList arrayList2 = (ArrayList) sparseArray2.valueAt(i);
                e0c e0cVar2 = (e0c) sparseArray.get(keyAt);
                Class cls = e0cVar2.e;
                Field field = e0cVar2.b;
                if (cls != null) {
                    Object newInstance = Array.newInstance((Class<?>) cls, arrayList2.size());
                    int size2 = arrayList2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        Array.set(newInstance, i2, arrayList2.get(i2));
                    }
                    field.set(c, newInstance);
                } else if (e0cVar2.f) {
                    HashMap hashMap = new HashMap(arrayList2.size());
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        hashMap.putAll((Map) it.next());
                    }
                    field.set(c, hashMap);
                }
            }
            int size3 = sparseArray.size();
            for (int i3 = 0; i3 < size3; i3++) {
                e0c e0cVar3 = (e0c) sparseArray.valueAt(i3);
                if (e0cVar3.d && e0cVar3.b.get(c) == null) {
                    return null;
                }
            }
            return c;
        } catch (IllegalAccessException unused) {
            ny61.w();
            return null;
        } catch (InstantiationException e) {
            ny61.j(e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable targetException = e2.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw targetException;
            }
            if (targetException instanceof Error) {
                throw targetException;
            }
            ny61.j(targetException);
            return null;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SparseArray sparseArray = this.b;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            e0c e0cVar = (e0c) sparseArray.valueAt(i);
            Field field = e0cVar.b;
            int i2 = e0cVar.a;
            ProtoAdapter protoAdapter = e0cVar.c;
            Object obj2 = field.get(obj);
            if (obj2 != null) {
                if (e0cVar.e != null) {
                    int length = Array.getLength(obj2);
                    for (int i3 = 0; i3 < length; i3++) {
                        protoAdapter.encodeWithTag(protoWriter, i2, (int) Array.get(obj2, i3));
                    }
                } else {
                    protoAdapter.encodeWithTag(protoWriter, i2, (int) obj2);
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SparseArray sparseArray = this.b;
        int size = sparseArray.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            e0c e0cVar = (e0c) sparseArray.valueAt(i2);
            Field field = e0cVar.b;
            int i3 = e0cVar.a;
            ProtoAdapter protoAdapter = e0cVar.c;
            Object obj2 = field.get(obj);
            if (obj2 != null) {
                if (e0cVar.e != null) {
                    int length = Array.getLength(obj2);
                    for (int i4 = 0; i4 < length; i4++) {
                        i += protoAdapter.encodedSizeWithTag(i3, Array.get(obj2, i4));
                    }
                } else {
                    i += protoAdapter.encodedSizeWithTag(i3, obj2);
                }
            }
        }
        return i;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        throw new NotImplementedError("An operation is not implemented: not implemented");
    }
}
