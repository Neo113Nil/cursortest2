package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: io.appmetrica.analytics.impl.el, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4814el {
    public static final String d = "SESSION_SLEEP_START";
    public static final String e = "SESSION_LAST_EVENT_OFFSET";
    public static final String f = "SESSION_ID";
    public static final String g = "SESSION_COUNTER_ID";
    public static final String h = "SESSION_INIT_TIME";
    public static final String i = "SESSION_IS_ALIVE_REPORT_NEEDED";
    public final String a;

    @NonNull
    protected final C4860gf b;
    public C5140rb c;

    public C4814el(@NonNull C4860gf c4860gf, @NonNull String str) {
        this.b = c4860gf;
        this.a = str;
        C5140rb c5140rb = new C5140rb();
        try {
            String h2 = c4860gf.h(str);
            if (!TextUtils.isEmpty(h2)) {
                c5140rb = new C5140rb(h2);
            }
        } catch (Throwable unused) {
        }
        this.c = c5140rb;
    }

    public final C4814el a(long j) {
        a(h, Long.valueOf(j));
        return this;
    }

    public final C4814el b(long j) {
        a(e, Long.valueOf(j));
        return this;
    }

    @Nullable
    public final Long c() {
        return this.c.a(h);
    }

    public final C4814el d(long j) {
        a(f, Long.valueOf(j));
        return this;
    }

    @Nullable
    public final Long e() {
        return this.c.a(g);
    }

    @Nullable
    public final Long f() {
        return this.c.a(f);
    }

    @Nullable
    public final Long g() {
        return this.c.a(d);
    }

    public final boolean h() {
        return this.c.length() > 0;
    }

    @Nullable
    public final Boolean i() {
        C5140rb c5140rb = this.c;
        c5140rb.getClass();
        try {
            return Boolean.valueOf(c5140rb.getBoolean(i));
        } catch (Throwable unused) {
            return null;
        }
    }

    public final C4814el a(boolean z) {
        a(i, Boolean.valueOf(z));
        return this;
    }

    public final void b() {
        this.b.e(this.a, this.c.toString());
        this.b.b();
    }

    public final C4814el c(long j) {
        a(g, Long.valueOf(j));
        return this;
    }

    @Nullable
    public final Long d() {
        return this.c.a(e);
    }

    public final C4814el e(long j) {
        a(d, Long.valueOf(j));
        return this;
    }

    public final void a(String str, Object obj) {
        try {
            this.c.put(str, obj);
        } catch (Throwable unused) {
        }
    }

    public final void a() {
        this.c = new C5140rb();
        b();
    }
}
