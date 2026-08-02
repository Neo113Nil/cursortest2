package xsna;

import java.io.IOException;

/* compiled from: FLog.java */
/* loaded from: classes.dex */
public final class ahq {
    public static final bhq a = bhq.b;

    public static void a(Class<?> cls, String str) {
        bhq bhqVar = a;
        if (bhqVar.a(6)) {
            String simpleName = cls.getSimpleName();
            bhqVar.getClass();
            bhq.b(6, simpleName, str);
        }
    }

    public static void b(Class cls, String str, IOException iOException) {
        bhq bhqVar = a;
        if (bhqVar.a(6)) {
            String simpleName = cls.getSimpleName();
            bhqVar.getClass();
            bhq.c(6, simpleName, str, iOException);
        }
    }

    public static void c(Class<?> cls, String str, Object... objArr) {
        bhq bhqVar = a;
        if (bhqVar.a(6)) {
            String simpleName = cls.getSimpleName();
            String format = String.format(null, str, objArr);
            bhqVar.getClass();
            bhq.b(6, simpleName, format);
        }
    }

    public static void d(String str, String str2) {
        bhq bhqVar = a;
        if (bhqVar.a(6)) {
            bhqVar.getClass();
            bhq.b(6, str, str2);
        }
    }

    public static void e(String str, String str2, Throwable th) {
        bhq bhqVar = a;
        if (bhqVar.a(6)) {
            bhqVar.getClass();
            bhq.c(6, str, str2, th);
        }
    }

    public static void f(Class cls, Object obj, String str) {
        bhq bhqVar = a;
        if (bhqVar.a(2)) {
            String simpleName = cls.getSimpleName();
            String format = String.format(null, str, obj);
            bhqVar.getClass();
            bhq.b(2, simpleName, format);
        }
    }

    public static void g(Class<?> cls, String str, Object obj, Object obj2) {
        bhq bhqVar = a;
        if (bhqVar.a(2)) {
            String simpleName = cls.getSimpleName();
            String format = String.format(null, str, obj, obj2);
            bhqVar.getClass();
            bhq.b(2, simpleName, format);
        }
    }

    public static void h(Class<?> cls, String str, Object obj, Object obj2, Object obj3) {
        if (a.a(2)) {
            String format = String.format(null, str, obj, obj2, obj3);
            if (a.a(2)) {
                bhq.b(2, cls.getSimpleName(), format);
            }
        }
    }

    public static void i(Class cls, String str, Exception exc) {
        bhq bhqVar = a;
        if (bhqVar.a(5)) {
            String simpleName = cls.getSimpleName();
            bhqVar.getClass();
            bhq.c(5, simpleName, str, exc);
        }
    }

    public static void j(Class<?> cls, String str, Object... objArr) {
        bhq bhqVar = a;
        if (bhqVar.a(5)) {
            String simpleName = cls.getSimpleName();
            String format = String.format(null, str, objArr);
            bhqVar.getClass();
            bhq.b(5, simpleName, format);
        }
    }

    public static void k(Exception exc, String str, Object... objArr) {
        if (a.a(5)) {
            i(ym8.class, String.format(null, str, objArr), exc);
        }
    }

    public static void l(String str, String str2, Object... objArr) {
        bhq bhqVar = a;
        if (bhqVar.a(5)) {
            String format = String.format(null, str2, objArr);
            bhqVar.getClass();
            bhq.b(5, str, format);
        }
    }

    public static void m(String str, String str2, Object... objArr) {
        bhq bhqVar = a;
        if (bhqVar.a(6)) {
            String format = String.format(null, str2, objArr);
            bhqVar.getClass();
            bhq.b(6, str, format);
        }
    }
}
