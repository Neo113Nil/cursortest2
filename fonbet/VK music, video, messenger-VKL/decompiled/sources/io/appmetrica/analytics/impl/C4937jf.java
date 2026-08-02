package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.jf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4937jf extends Jd implements Lo {
    public static final Cif d = new Cif("LOCATION_TRACKING_ENABLED", null);
    public static final Cif e = new Cif("PREF_KEY_OFFSET", null);
    public static final Cif f = new Cif("UNCHECKED_TIME", null);
    public static final Cif g = new Cif("STATISTICS_RESTRICTED_IN_MAIN", null);
    public static final Cif h = new Cif("LAST_IDENTITY_LIGHT_SEND_TIME", null);
    public static final Cif i = new Cif("NEXT_REPORT_SEND_ATTEMPT_NUMBER", null);
    public static final Cif j = new Cif("NEXT_LOCATION_SEND_ATTEMPT_NUMBER", null);
    public static final Cif k = new Cif("NEXT_STARTUP_SEND_ATTEMPT_NUMBER", null);
    public static final Cif l = new Cif("LAST_REPORT_SEND_ATTEMPT_TIME", null);
    public static final Cif m = new Cif("LAST_LOCATION_SEND_ATTEMPT_TIME", null);
    public static final Cif n = new Cif("LAST_STARTUP_SEND_ATTEMPT_TIME", null);
    public static final Cif o = new Cif("SATELLITE_PRELOAD_INFO_CHECKED", null);
    public static final Cif p = new Cif("SATELLITE_CLIDS_CHECKED", null);
    public static final Cif q = new Cif("VITAL_DATA", null);
    public static final Cif r = new Cif("LAST_KOTLIN_VERSION_SEND_TIME", null);
    public static final Cif s = new Cif("ADV_IDENTIFIERS_TRACKING_ENABLED", null);

    public C4937jf(Ta ta) {
        super(ta);
    }

    public final long a(int i2) {
        return this.a.getLong(e.b, i2);
    }

    public final boolean b(boolean z) {
        return this.a.getBoolean(f.b, z);
    }

    public final C4937jf c(boolean z) {
        return (C4937jf) b(g.b, z);
    }

    public final C4937jf d(long j2) {
        return (C4937jf) b(e.b, j2);
    }

    public final boolean e() {
        return this.a.getBoolean(d.b, false);
    }

    public final void f(boolean z) {
        b(d.b, z).b();
    }

    public final C4937jf g() {
        return (C4937jf) b(p.b, true);
    }

    public final C4937jf h() {
        return (C4937jf) b(o.b, true);
    }

    public final boolean i() {
        return this.a.getBoolean(o.b, false);
    }

    public final boolean j() {
        return this.a.getBoolean(p.b, false);
    }

    public final long a(long j2) {
        return this.a.getLong(h.b, j2);
    }

    public final C4937jf b(long j2) {
        return (C4937jf) b(h.b, j2);
    }

    public final C4937jf c(long j2) {
        return (C4937jf) b(r.b, j2);
    }

    public final C4937jf d(boolean z) {
        return (C4937jf) b(f.b, z);
    }

    public final void e(boolean z) {
        b(s.b, z).b();
    }

    public final long f() {
        return this.a.getLong(r.b, 0L);
    }

    @Override // io.appmetrica.analytics.impl.Lo
    @Nullable
    public final String a() {
        return this.a.getString(q.b, null);
    }

    public final C4937jf b(@NonNull EnumC4807ee enumC4807ee, int i2) {
        Cif cif;
        int ordinal = enumC4807ee.ordinal();
        if (ordinal == 0) {
            cif = i;
        } else if (ordinal != 1) {
            cif = ordinal != 2 ? null : k;
        } else {
            cif = j;
        }
        return cif != null ? (C4937jf) b(cif.b, i2) : this;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4886hf
    @NonNull
    public final Set<String> c() {
        return this.a.a();
    }

    @Nullable
    public final Boolean d() {
        Cif cif = g;
        if (!this.a.a(cif.b)) {
            return null;
        }
        return Boolean.valueOf(this.a.getBoolean(cif.b, true));
    }

    @Override // io.appmetrica.analytics.impl.Jd
    @NonNull
    public final String f(@NonNull String str) {
        return new Cif(str, null).b;
    }

    @Override // io.appmetrica.analytics.impl.Lo
    public final void a(@NonNull String str) {
        b(q.b, str).b();
    }

    public final boolean a(boolean z) {
        return this.a.getBoolean(s.b, z);
    }

    public final C4937jf b(@NonNull EnumC4807ee enumC4807ee, long j2) {
        Cif cif;
        int ordinal = enumC4807ee.ordinal();
        if (ordinal == 0) {
            cif = l;
        } else if (ordinal != 1) {
            cif = ordinal != 2 ? null : n;
        } else {
            cif = m;
        }
        return cif != null ? (C4937jf) b(cif.b, j2) : this;
    }

    public final int a(@NonNull EnumC4807ee enumC4807ee, int i2) {
        Cif cif;
        int ordinal = enumC4807ee.ordinal();
        if (ordinal == 0) {
            cif = i;
        } else if (ordinal != 1) {
            cif = ordinal != 2 ? null : k;
        } else {
            cif = j;
        }
        if (cif == null) {
            return i2;
        }
        return this.a.getInt(cif.b, i2);
    }

    public final long a(@NonNull EnumC4807ee enumC4807ee, long j2) {
        Cif cif;
        int ordinal = enumC4807ee.ordinal();
        if (ordinal == 0) {
            cif = l;
        } else if (ordinal != 1) {
            cif = ordinal != 2 ? null : n;
        } else {
            cif = m;
        }
        if (cif == null) {
            return j2;
        }
        return this.a.getLong(cif.b, j2);
    }
}
