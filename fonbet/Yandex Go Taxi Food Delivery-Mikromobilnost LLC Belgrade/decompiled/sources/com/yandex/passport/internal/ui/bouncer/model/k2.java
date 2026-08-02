package com.yandex.passport.internal.ui.bouncer.model;

import defpackage.b64;

/* loaded from: classes2.dex */
public final class k2 implements o2 {
    public final String a;
    public final String b;

    public k2(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k2)) {
            return false;
        }
        k2 k2Var = (k2) obj;
        return this.a.equals(k2Var.a) && this.b.equals(k2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnSocialActionResult(taskId=");
        sb.append(this.a);
        sb.append(", slothUrl=");
        return b64.p(sb, this.b, ')');
    }
}
