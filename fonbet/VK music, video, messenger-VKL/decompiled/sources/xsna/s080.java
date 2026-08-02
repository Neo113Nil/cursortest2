package xsna;

import com.vk.im.engine.models.account.AccountInfo;

/* compiled from: OnAccountInfoUpdateEvent.kt */
/* loaded from: classes2.dex */
public final class s080 extends sxp {
    public final Object b;
    public final xpp<AccountInfo> c;

    public s080(Object obj, xpp<AccountInfo> xppVar) {
        this.b = obj;
        this.c = xppVar;
    }

    @Override // xsna.sxp
    public final Object a() {
        return this.b;
    }

    public final xpp<AccountInfo> c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s080)) {
            return false;
        }
        s080 s080Var = (s080) obj;
        return epx.f(this.b, s080Var.b) && epx.f(this.c, s080Var.c);
    }

    public final int hashCode() {
        Object obj = this.b;
        return this.c.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "OnAccountInfoUpdateEvent(changerTag=" + this.b + ", accountInfo=" + this.c + ')';
    }
}
