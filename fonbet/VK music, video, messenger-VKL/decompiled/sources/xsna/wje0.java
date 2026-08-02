package xsna;

import com.vk.push.pushsdk.domain.model.ReceivedBy;
import java.util.List;
import xsna.uje0;

/* compiled from: PushMessageResult.kt */
/* loaded from: classes5.dex */
public final class wje0 {
    public final List<uje0.b> a;
    public final boolean b;
    public final ReceivedBy c;

    public wje0(List<uje0.b> list, boolean z, ReceivedBy receivedBy) {
        this.a = list;
        this.b = z;
        this.c = receivedBy;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wje0)) {
            return false;
        }
        wje0 wje0Var = (wje0) obj;
        return epx.f(this.a, wje0Var.a) && this.b == wje0Var.b && this.c == wje0Var.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        boolean z = this.b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return this.c.hashCode() + ((hashCode + i) * 31);
    }

    public final String toString() {
        return "PushMessageResults(results=" + this.a + ", isOrderGuaranteed=" + this.b + ", receivedBy=" + this.c + ')';
    }
}
