package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class pk implements a05 {
    public final Throwable a;
    public final v7l b;

    public pk(Throwable th, v7l v7lVar) {
        this.a = th;
        this.b = v7lVar;
    }

    public static pk b(pk pkVar, Throwable th, v7l v7lVar, int i) {
        if ((i & 1) != 0) {
            th = pkVar.a;
        }
        if ((i & 2) != 0) {
            v7lVar = pkVar.b;
        }
        pkVar.getClass();
        return new pk(th, v7lVar);
    }

    @Override // defpackage.a05
    public final lur0 a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pk)) {
            return false;
        }
        pk pkVar = (pk) obj;
        return jl40.l(this.a, pkVar.a) && jl40.l(this.b, pkVar.b);
    }

    @Override // defpackage.a05
    public final v7l getEntity() {
        return this.b;
    }

    @Override // defpackage.a05
    public final Throwable getError() {
        return this.a;
    }

    public final int hashCode() {
        Throwable th = this.a;
        int hashCode = (th == null ? 0 : th.hashCode()) * 31;
        v7l v7lVar = this.b;
        return hashCode + (v7lVar != null ? v7lVar.hashCode() : 0);
    }

    public final String toString() {
        return "AccountDetailsState(error=" + this.a + ", entity=" + this.b + Extension.C_BRAKE;
    }

    public pk() {
        this(null, null);
    }
}
