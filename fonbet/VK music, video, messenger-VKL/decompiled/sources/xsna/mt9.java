package xsna;

import com.vk.dto.money.Fee;
import com.vk.dto.money.MoneyCard;
import com.vk.dto.money.MoneyReceiverInfo;
import com.vk.money.createtransfer.people.ReceiverType;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.dc;

/* compiled from: CardMethod.kt */
/* loaded from: classes3.dex */
public final class mt9 extends dc implements dc.a {
    public final MoneyCard b;
    public final MoneyReceiverInfo c;

    public mt9(MoneyCard moneyCard, MoneyReceiverInfo moneyReceiverInfo) {
        super(moneyReceiverInfo);
        this.b = moneyCard;
        this.c = moneyReceiverInfo;
    }

    @Override // xsna.dc, xsna.njp0
    public final int a() {
        return this.c.c;
    }

    @Override // xsna.dc.a
    public final String b() {
        return this.b.b;
    }

    @Override // xsna.dc, xsna.njp0
    public final double d(int i) {
        Fee fee;
        return (this.c.j == ReceiverType.Card2VkPay.h() || (fee = this.b.e) == null) ? ConnectivityTracker.DEFAULT_UPLINK_BITRATE : fee.a(i);
    }

    @Override // xsna.dc, xsna.njp0
    public final int e() {
        return this.c.b;
    }
}
