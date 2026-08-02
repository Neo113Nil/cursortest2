package io.appmetrica.analytics.impl;

/* loaded from: classes8.dex */
public abstract class Jd extends AbstractC4886hf implements El {
    public Jd(Ta ta, String str) {
        super(ta, str);
    }

    public final String c(String str, String str2) {
        return this.a.getString(f(str), str2);
    }

    public final El d(String str, String str2) {
        return (El) b(f(str), str2);
    }

    public final boolean e(String str) {
        return this.a.a(f(str));
    }

    public abstract String f(String str);

    public El g(String str) {
        return (El) d(f(str));
    }

    public Jd(Ta ta) {
        this(ta, null);
    }

    public final El d(String str, int i) {
        return (El) b(f(str), i);
    }

    public final int c(String str, int i) {
        return this.a.getInt(f(str), i);
    }

    public final El d(String str, long j) {
        return (El) b(f(str), j);
    }

    public final El d(String str, boolean z) {
        return (El) b(f(str), z);
    }

    public final long c(String str, long j) {
        return this.a.getLong(f(str), j);
    }

    public final boolean c(String str, boolean z) {
        return this.a.getBoolean(f(str), z);
    }
}
