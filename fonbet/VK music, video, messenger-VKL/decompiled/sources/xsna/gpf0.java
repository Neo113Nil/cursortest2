package xsna;

import com.google.gson.ReflectionAccessFilter;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* compiled from: ReflectionAccessFilterHelper.java */
/* loaded from: classes.dex */
public final class gpf0 {

    /* compiled from: ReflectionAccessFilterHelper.java */
    /* loaded from: classes13.dex */
    public static abstract class a {
        public static final a a;

        /* compiled from: ReflectionAccessFilterHelper.java */
        /* renamed from: xsna.gpf0$a$a, reason: collision with other inner class name */
        public class C2953a extends a {
            public final /* synthetic */ Method b;

            public C2953a(Method method) {
                this.b = method;
            }

            @Override // xsna.gpf0.a
            public final boolean a(AccessibleObject accessibleObject, Object obj) {
                try {
                    return ((Boolean) this.b.invoke(accessibleObject, obj)).booleanValue();
                } catch (Exception e) {
                    throw new RuntimeException("Failed invoking canAccess", e);
                }
            }
        }

        /* compiled from: ReflectionAccessFilterHelper.java */
        public class b extends a {
            @Override // xsna.gpf0.a
            public final boolean a(AccessibleObject accessibleObject, Object obj) {
                return true;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:5:0x001d  */
        static {
            a c2953a;
            if (yxx.a()) {
                try {
                    c2953a = new C2953a(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
                } catch (NoSuchMethodException unused) {
                }
                if (c2953a == null) {
                    c2953a = new b();
                }
                a = c2953a;
            }
            c2953a = null;
            if (c2953a == null) {
            }
            a = c2953a;
        }

        public abstract boolean a(AccessibleObject accessibleObject, Object obj);
    }

    public static ReflectionAccessFilter.FilterResult a(List<ReflectionAccessFilter> list, Class<?> cls) {
        Iterator<ReflectionAccessFilter> it = list.iterator();
        while (it.hasNext()) {
            ReflectionAccessFilter.FilterResult check = it.next().check(cls);
            if (check != ReflectionAccessFilter.FilterResult.INDECISIVE) {
                return check;
            }
        }
        return ReflectionAccessFilter.FilterResult.ALLOW;
    }
}
