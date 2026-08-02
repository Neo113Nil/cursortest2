package com.yandex.passport.data.models;

/* loaded from: classes15.dex */
public final class r {
    public final q a;
    public final q b;

    public r(q qVar, q qVar2) {
        this.a = qVar;
        this.b = qVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.a.equals(rVar.a) && this.b.equals(rVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "UrlTemplateConfig(updateTokenWithMasterUrl=" + this.a + ", switchMemberUrl=" + this.b + ')';
    }
}
