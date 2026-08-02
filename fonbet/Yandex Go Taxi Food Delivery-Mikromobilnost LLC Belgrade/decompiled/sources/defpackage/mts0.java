package defpackage;

import com.yandex.delivery.mapper.model.state.IconStyleState;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class mts0 implements pts0 {
    public final j7v a;
    public final IconStyleState b;

    public mts0(j7v j7vVar, IconStyleState iconStyleState) {
        this.a = j7vVar;
        this.b = iconStyleState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mts0)) {
            return false;
        }
        mts0 mts0Var = (mts0) obj;
        return this.a.equals(mts0Var.a) && this.b == mts0Var.b;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        IconStyleState iconStyleState = this.b;
        return hashCode + (iconStyleState == null ? 0 : iconStyleState.hashCode());
    }

    public final String toString() {
        return "LeadIcon(icon=" + this.a + ", style=" + this.b + Extension.C_BRAKE;
    }
}
