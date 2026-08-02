package com.yandex.passport.internal.ui.bouncer.model;

import android.content.Intent;
import defpackage.jl40;

/* loaded from: classes15.dex */
public final class j2 implements o2 {
    public final int a;
    public final Intent b;

    public j2(int i, Intent intent) {
        this.a = i;
        this.b = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j2)) {
            return false;
        }
        j2 j2Var = (j2) obj;
        return this.a == j2Var.a && jl40.l(this.b, j2Var.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Intent intent = this.b;
        return hashCode + (intent == null ? 0 : intent.hashCode());
    }

    public final String toString() {
        return "OnFallbackResult(code=" + this.a + ", data=" + this.b + ')';
    }
}
