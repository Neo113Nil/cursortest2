package defpackage;

import android.content.Context;
import java.util.LinkedHashMap;

/* loaded from: classes14.dex */
public final class nn70 {
    public final Context a;
    public final tls b;
    public final tls c;
    public final tls d;
    public final int g;
    public final LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();
    public final LinkedHashMap h = new LinkedHashMap();

    public nn70(Context context, tls tlsVar, tls tlsVar2, tls tlsVar3) {
        this.a = context;
        this.b = tlsVar;
        this.c = tlsVar2;
        this.d = tlsVar3;
        this.g = tje.u(2, context);
    }

    public final float a(int i) {
        return ((Number) this.f.computeIfAbsent(Integer.valueOf(i), new yu0(13, new mn70(this, i, 0)))).floatValue();
    }

    public final int b(int i) {
        return ((Number) this.h.computeIfAbsent(Integer.valueOf(i), new yu0(14, new mn70(this, i, 1)))).intValue();
    }
}
