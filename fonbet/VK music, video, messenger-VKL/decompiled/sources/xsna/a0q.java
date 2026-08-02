package xsna;

import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import xsna.yl5;

/* compiled from: EventInternal.java */
/* loaded from: classes.dex */
public abstract class a0q {

    /* compiled from: EventInternal.java */
    public static abstract class a {
        public final void a(String str, String str2) {
            HashMap hashMap = ((yl5.a) this).f;
            if (hashMap == null) {
                throw new IllegalStateException("Property \"autoMetadata\" has not been set");
            }
            hashMap.put(str, str2);
        }
    }

    public final String a(String str) {
        String str2 = b().get(str);
        return str2 == null ? "" : str2;
    }

    public abstract Map<String, String> b();

    @Nullable
    public abstract Integer c();

    public abstract uip d();

    public abstract long e();

    @Nullable
    public abstract byte[] f();

    @Nullable
    public abstract byte[] g();

    public final int h(String str) {
        String str2 = b().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    @Nullable
    public abstract Integer i();

    @Nullable
    public abstract String j();

    public abstract String k();

    public abstract long l();

    public final yl5.a m() {
        yl5.a aVar = new yl5.a();
        String k = k();
        if (k == null) {
            throw new NullPointerException("Null transportName");
        }
        aVar.a = k;
        aVar.b = c();
        aVar.g = i();
        aVar.h = j();
        aVar.i = f();
        aVar.j = g();
        uip d = d();
        if (d == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        aVar.c = d;
        aVar.d = Long.valueOf(e());
        aVar.e = Long.valueOf(l());
        aVar.f = new HashMap(b());
        return aVar;
    }
}
