package com.yandex.passport.internal.report.reporters;

import defpackage.b64;
import defpackage.unr0;

/* loaded from: classes8.dex */
public final class l0 {
    public final String a;
    public final String b;
    public final m0 c;
    public final String d;

    public l0(String str, String str2, m0 m0Var, String str3) {
        this.a = str;
        this.b = str2;
        this.c = m0Var;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return this.a.equals(l0Var.a) && this.b.equals(l0Var.b) && this.c.equals(l0Var.c) && this.d.equals(l0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application(appId=");
        sb.append(this.a);
        sb.append(", version=");
        sb.append(this.b);
        sb.append(", amManifestVersion=");
        sb.append(this.c);
        sb.append(", signatureInfo=");
        return b64.p(sb, this.d, ')');
    }
}
