package com.yandex.passport.internal.ui.bouncer.model;

import android.content.Intent;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class v implements n0 {
    public final int a;
    public final Intent b;

    public v(int i, Intent intent) {
        this.a = i;
        this.b = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.a == vVar.a && jl40.l(this.b, vVar.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Intent intent = this.b;
        return hashCode + (intent == null ? 0 : intent.hashCode());
    }

    public final String toString() {
        return "ProcessFallbackResult(code=" + this.a + ", data=" + this.b + ')';
    }
}
