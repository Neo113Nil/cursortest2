package xsna;

import com.vk.money.createtransfer.chat.a;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: ChatMethod.kt */
/* loaded from: classes3.dex */
public final class vtb implements njp0 {
    public final com.vk.money.createtransfer.chat.a a;
    public final izb b;
    public final a370 c = new a370();

    public vtb(com.vk.money.createtransfer.chat.a aVar, izb izbVar) {
        this.a = aVar;
        this.b = izbVar;
    }

    public static vtb b(vtb vtbVar, com.vk.money.createtransfer.chat.a aVar, izb izbVar, int i) {
        if ((i & 1) != 0) {
            aVar = vtbVar.a;
        }
        if ((i & 2) != 0) {
            izbVar = vtbVar.b;
        }
        vtbVar.getClass();
        return new vtb(aVar, izbVar);
    }

    @Override // xsna.njp0
    public final int a() {
        com.vk.money.createtransfer.chat.a aVar = this.a;
        if (!(aVar instanceof a.c)) {
            return 999999;
        }
        ((a.c) aVar).getClass();
        throw null;
    }

    @Override // xsna.njp0
    public final double d(int i) {
        this.c.getClass();
        return ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
    }

    @Override // xsna.njp0
    public final int e() {
        return ((this.b.c ? 1 : 0) + 1) * this.c.a.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vtb)) {
            return false;
        }
        vtb vtbVar = (vtb) obj;
        return epx.f(this.a, vtbVar.a) && epx.f(this.b, vtbVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ChatMethod(autoReceive=" + this.a + ", chatTransactionInfo=" + this.b + ')';
    }
}
