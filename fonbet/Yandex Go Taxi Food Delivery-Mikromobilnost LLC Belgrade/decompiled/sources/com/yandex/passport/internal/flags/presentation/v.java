package com.yandex.passport.internal.flags.presentation;

import defpackage.b64;

/* loaded from: classes15.dex */
public final class v implements y0 {
    public final com.yandex.passport.internal.flags.g a;
    public final String b;

    public v(com.yandex.passport.internal.flags.g gVar, String str) {
        this.a = gVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.a.equals(vVar.a) && this.b.equals(vVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExperimentItem(flag=");
        sb.append(this.a);
        sb.append(", value=");
        return b64.p(sb, this.b, ')');
    }
}
