package com.yandex.passport.internal.ui.bouncer.model;

import defpackage.b64;

/* loaded from: classes15.dex */
public final class l1 implements r1 {
    public final String a;
    public final String b;

    public l1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        return this.a.equals(l1Var.a) && this.b.equals(l1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Error(tag=");
        sb.append(this.a);
        sb.append(", description=");
        return b64.p(sb, this.b, ')');
    }
}
