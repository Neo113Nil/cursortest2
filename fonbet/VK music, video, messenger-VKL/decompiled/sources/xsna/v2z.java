package xsna;

import android.content.Context;
import xsna.i8i;

/* compiled from: LibraryVersionComponent.java */
/* loaded from: classes.dex */
public final class v2z {

    /* compiled from: LibraryVersionComponent.java */
    public interface a<T> {
        String a(Context context);
    }

    public static i8i<?> a(String str, String str2) {
        dn5 dn5Var = new dn5(str, str2);
        i8i.a a2 = i8i.a(s2z.class);
        a2.e = 1;
        a2.f = new y33(dn5Var);
        return a2.b();
    }

    public static i8i<?> b(final String str, final a<Context> aVar) {
        i8i.a a2 = i8i.a(s2z.class);
        a2.e = 1;
        a2.a(gzl.b(Context.class));
        a2.f = new b9i() { // from class: xsna.u2z
            @Override // xsna.b9i
            public final Object c(lcg0 lcg0Var) {
                return new dn5(str, aVar.a((Context) lcg0Var.a(Context.class)));
            }
        };
        return a2.b();
    }
}
