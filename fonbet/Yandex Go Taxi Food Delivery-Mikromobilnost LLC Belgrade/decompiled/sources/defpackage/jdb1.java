package defpackage;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.i0;
import com.google.android.gms.measurement.internal.zzls;
import com.google.android.gms.measurement.internal.zzom;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public final class jdb1 {
    public final long a;
    public final i0 b;
    public final String c;
    public final Map d;
    public final zzls e;
    public final long f;
    public final long g;
    public final long h;
    public final int i;

    public /* synthetic */ jdb1(long j, i0 i0Var, String str, HashMap hashMap, zzls zzlsVar, long j2, long j3, long j4, int i) {
        this.a = j;
        this.b = i0Var;
        this.c = str;
        this.d = hashMap;
        this.e = zzlsVar;
        this.f = j2;
        this.g = j3;
        this.h = j4;
        this.i = i;
    }

    public final vab1 a() {
        return new vab1(this.c, this.d, this.e, null);
    }

    public final zzom b() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.d.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        return new zzom(this.a, this.b.d(), this.c, bundle, this.e.a(), this.g, "");
    }

    public final long c() {
        return this.a;
    }

    public final i0 d() {
        return this.b;
    }

    public final String e() {
        return this.c;
    }

    public final zzls f() {
        return this.e;
    }

    public final long g() {
        return this.f;
    }

    public final long h() {
        return this.h;
    }

    public final int i() {
        return this.i;
    }
}
