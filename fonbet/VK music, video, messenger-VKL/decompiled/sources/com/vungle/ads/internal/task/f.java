package com.vungle.ads.internal.task;

import android.os.Bundle;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;

/* loaded from: classes7.dex */
public final class f implements Cloneable {
    public final String a;
    public boolean b;
    public long c;
    public Bundle d = new Bundle();
    public int e = 2;

    public f(String str) {
        this.a = str;
    }

    public final f a(Bundle bundle) {
        this.d = bundle;
        return this;
    }

    public final long b() {
        return this.c;
    }

    public final Bundle c() {
        return this.d;
    }

    public final Object clone() {
        return super.clone();
    }

    public final String d() {
        return this.a;
    }

    public final int e() {
        return this.e;
    }

    public final boolean f() {
        return this.b;
    }

    public final void g() {
        this.c = 0L;
    }

    public final f a() {
        try {
            return (f) super.clone();
        } catch (CloneNotSupportedException e) {
            boolean z = u.a;
            t.a("JobInfo", "Cannot copy JobInfo " + this, e);
            return null;
        }
    }
}
