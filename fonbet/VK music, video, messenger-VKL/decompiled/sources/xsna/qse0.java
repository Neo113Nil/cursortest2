package xsna;

import com.vk.ecomm.market.api.dto.OwnerResponseTime;
import java.util.ArrayList;

/* compiled from: GoodQuickMessagesHolder.kt */
/* loaded from: classes18.dex */
public final class qse0 {
    public final String a;
    public final ArrayList b;
    public final OwnerResponseTime c;

    public qse0(String str, ArrayList arrayList, OwnerResponseTime ownerResponseTime) {
        this.a = str;
        this.b = arrayList;
        this.c = ownerResponseTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qse0)) {
            return false;
        }
        qse0 qse0Var = (qse0) obj;
        return epx.f(this.a, qse0Var.a) && this.b.equals(qse0Var.b) && epx.f(this.c, qse0Var.c);
    }

    public final int hashCode() {
        int a = qr.a(this.b, this.a.hashCode() * 31, 31);
        OwnerResponseTime ownerResponseTime = this.c;
        return a + (ownerResponseTime == null ? 0 : ownerResponseTime.hashCode());
    }

    public final String toString() {
        return "QuickMessagesItem(title=" + this.a + ", messages=" + this.b + ", ownerResponseTime=" + this.c + ')';
    }
}
