package defpackage;

import com.yandex.go.payments.shared.business.accountcreation.corp.create_navigator.analytics.B2BAccountFlowAnalytics$B2BNavigatorModalButtonType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class pte {
    public final String a;
    public final ovi0 b;
    public final ote c;
    public final B2BAccountFlowAnalytics$B2BNavigatorModalButtonType d;

    public pte(String str, ovi0 ovi0Var, ote oteVar, B2BAccountFlowAnalytics$B2BNavigatorModalButtonType b2BAccountFlowAnalytics$B2BNavigatorModalButtonType) {
        this.a = str;
        this.b = ovi0Var;
        this.c = oteVar;
        this.d = b2BAccountFlowAnalytics$B2BNavigatorModalButtonType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pte)) {
            return false;
        }
        pte pteVar = (pte) obj;
        return this.a.equals(pteVar.a) && jl40.l(this.b, pteVar.b) && this.c.equals(pteVar.c) && this.d == pteVar.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ovi0 ovi0Var = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (ovi0Var == null ? 0 : ovi0Var.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "Button(title=" + this.a + ", icon=" + this.b + ", action=" + this.c + ", analyticsType=" + this.d + Extension.C_BRAKE;
    }
}
