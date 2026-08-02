package defpackage;

import com.yandex.go.overdraft.api.domain.model.OverdraftContext;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class lug {
    public final String a;
    public final OverdraftContext b;

    public lug(String str, OverdraftContext overdraftContext) {
        this.a = str;
        this.b = overdraftContext;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lug)) {
            return false;
        }
        lug lugVar = (lug) obj;
        return jl40.l(this.a, lugVar.a) && this.b == lugVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DebtsHistoryPayload(orderId=" + this.a + ", overdraftContext=" + this.b + Extension.C_BRAKE;
    }
}
