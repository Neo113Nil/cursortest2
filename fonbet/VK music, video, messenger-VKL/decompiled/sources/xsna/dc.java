package xsna;

import com.vk.dto.money.MoneyReceiverInfo;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: AbsTransferMethod.kt */
/* loaded from: classes3.dex */
public abstract class dc implements njp0 {
    public final MoneyReceiverInfo a;

    /* compiled from: AbsTransferMethod.kt */
    public interface a {
        String b();
    }

    public dc(MoneyReceiverInfo moneyReceiverInfo) {
        this.a = moneyReceiverInfo;
    }

    @Override // xsna.njp0
    public int a() {
        return this.a.c;
    }

    @Override // xsna.njp0
    public double d(int i) {
        return ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
    }

    @Override // xsna.njp0
    public int e() {
        return this.a.b;
    }
}
