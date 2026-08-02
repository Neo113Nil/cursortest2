package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: IdentifiableCookie.kt */
/* loaded from: classes.dex */
public final class suv {
    public final usj a;

    public suv(usj usjVar) {
        this.a = usjVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof suv)) {
            return false;
        }
        suv suvVar = (suv) obj;
        String e = suvVar.a.e();
        usj usjVar = this.a;
        return epx.f(e, usjVar.e()) && epx.f(suvVar.a.a(), usjVar.a()) && epx.f(suvVar.a.f(), usjVar.f()) && suvVar.a.h() == usjVar.h() && suvVar.a.c() == usjVar.c();
    }

    public final int hashCode() {
        usj usjVar = this.a;
        return ((((usjVar.f().hashCode() + ((usjVar.a().hashCode() + ((usjVar.e().hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31)) * 31) + (!usjVar.h())) * 31) + (!usjVar.c());
    }
}
