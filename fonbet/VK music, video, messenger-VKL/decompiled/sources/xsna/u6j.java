package xsna;

import com.google.gson.JsonIOException;
import com.google.gson.ReflectionAccessFilter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import xsna.gpf0;

/* compiled from: ConstructorConstructor.java */
/* loaded from: classes.dex */
public final class u6j {
    public final Map<Type, n6x<?>> a;
    public final boolean b;
    public final List<ReflectionAccessFilter> c;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes13.dex */
    public class a<T> implements jp70<T> {
        public final /* synthetic */ n6x b;

        public a(n6x n6xVar, Type type) {
            this.b = n6xVar;
        }

        @Override // xsna.jp70
        public final T h() {
            return (T) this.b.a();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes13.dex */
    public class b<T> implements jp70<T> {
        public final /* synthetic */ n6x b;

        public b(n6x n6xVar, Type type) {
            this.b = n6xVar;
        }

        @Override // xsna.jp70
        public final T h() {
            return (T) this.b.a();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes13.dex */
    public class c<T> implements jp70<T> {
        public final /* synthetic */ String b;

        public c(String str) {
            this.b = str;
        }

        @Override // xsna.jp70
        public final T h() {
            throw new JsonIOException(this.b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* loaded from: classes13.dex */
    public class d<T> implements jp70<T> {
        public final /* synthetic */ String b;

        public d(String str) {
            this.b = str;
        }

        @Override // xsna.jp70
        public final T h() {
            throw new JsonIOException(this.b);
        }
    }

    public u6j(Map<Type, n6x<?>> map, boolean z, List<ReflectionAccessFilter> list) {
        this.a = map;
        this.b = z;
        this.c = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0109 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> jp70<T> a(xtp0<T> xtp0Var) {
        jp70<T> y6jVar;
        String sb;
        Type type = xtp0Var.getType();
        Class<? super T> rawType = xtp0Var.getRawType();
        Map<Type, n6x<?>> map = this.a;
        n6x<?> n6xVar = map.get(type);
        if (n6xVar != null) {
            return new a(n6xVar, type);
        }
        n6x<?> n6xVar2 = map.get(rawType);
        if (n6xVar2 != null) {
            return new b(n6xVar2, type);
        }
        jp70<T> jp70Var = null;
        jp70<T> v6jVar = EnumSet.class.isAssignableFrom(rawType) ? new v6j(type) : rawType == EnumMap.class ? new t98(type) : null;
        if (v6jVar != null) {
            return v6jVar;
        }
        ReflectionAccessFilter.FilterResult a2 = gpf0.a(this.c, rawType);
        if (!Modifier.isAbstract(rawType.getModifiers())) {
            try {
                Constructor<? super T> declaredConstructor = rawType.getDeclaredConstructor(null);
                ReflectionAccessFilter.FilterResult filterResult = ReflectionAccessFilter.FilterResult.ALLOW;
                if (a2 == filterResult || (gpf0.a.a.a(declaredConstructor, null) && (a2 != ReflectionAccessFilter.FilterResult.BLOCK_ALL || Modifier.isPublic(declaredConstructor.getModifiers())))) {
                    if (a2 == filterResult) {
                        try {
                            declaredConstructor.setAccessible(true);
                            sb = null;
                        } catch (Exception e) {
                            StringBuilder sb2 = new StringBuilder("Failed making constructor '");
                            StringBuilder sb3 = new StringBuilder(declaredConstructor.getDeclaringClass().getName());
                            sb3.append('#');
                            sb3.append(declaredConstructor.getDeclaringClass().getSimpleName());
                            sb3.append('(');
                            Class<?>[] parameterTypes = declaredConstructor.getParameterTypes();
                            for (int i = 0; i < parameterTypes.length; i++) {
                                if (i > 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(parameterTypes[i].getSimpleName());
                            }
                            sb3.append(')');
                            sb2.append(sb3.toString());
                            sb2.append("' accessible; either change its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: ");
                            sb2.append(e.getMessage());
                            sb = sb2.toString();
                        }
                        if (sb != null) {
                            y6jVar = new x6j(sb);
                        }
                    }
                    y6jVar = new y6j(declaredConstructor);
                } else {
                    y6jVar = new w6j("Unable to invoke no-args constructor of " + rawType + "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter.");
                }
            } catch (NoSuchMethodException unused) {
            }
            if (y6jVar == null) {
                return y6jVar;
            }
            if (Collection.class.isAssignableFrom(rawType)) {
                jp70Var = SortedSet.class.isAssignableFrom(rawType) ? new sv1(10) : Set.class.isAssignableFrom(rawType) ? new sd9(false) : Queue.class.isAssignableFrom(rawType) ? new s1v() : new oa01();
            } else if (Map.class.isAssignableFrom(rawType)) {
                jp70Var = ConcurrentNavigableMap.class.isAssignableFrom(rawType) ? new sdy() : ConcurrentMap.class.isAssignableFrom(rawType) ? new ine0() : SortedMap.class.isAssignableFrom(rawType) ? new fsk(10) : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(xtp0.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType())) ? new lmc() : new sua();
            }
            if (jp70Var != null) {
                return jp70Var;
            }
            String a3 = q5q0.a(rawType);
            if (a3 != null) {
                return new c(a3);
            }
            if (a2 != ReflectionAccessFilter.FilterResult.ALLOW) {
                return new d("Unable to create instance of " + rawType + "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection.");
            }
            if (this.b) {
                return new t6j(rawType);
            }
            return new vay0("Unable to create instance of " + rawType + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.");
        }
        y6jVar = null;
        if (y6jVar == null) {
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}
