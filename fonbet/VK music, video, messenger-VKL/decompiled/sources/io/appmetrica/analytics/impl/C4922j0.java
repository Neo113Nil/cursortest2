package io.appmetrica.analytics.impl;

import android.util.Pair;

/* renamed from: io.appmetrica.analytics.impl.j0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4922j0 {
    public Rc a;
    public long b;
    public boolean c;
    public final Bl d;

    public C4922j0(String str, long j, Bl bl) {
        this.b = j;
        try {
            this.a = new Rc(str);
        } catch (Throwable unused) {
            this.a = new Rc();
        }
        this.d = bl;
    }

    public final synchronized void a(Pair pair) {
        if (this.d.b(this.a, (String) pair.first, (String) pair.second)) {
            this.c = true;
        }
    }

    public final synchronized String toString() {
        return "Map size " + this.a.size() + ". Is changed " + this.c + ". Current revision " + this.b;
    }

    public final synchronized C4897i0 a() {
        try {
            if (this.c) {
                this.b++;
                this.c = false;
            }
        } catch (Throwable th) {
            throw th;
        }
        return new C4897i0(AbstractC5166sb.b(this.a), this.b);
    }
}
