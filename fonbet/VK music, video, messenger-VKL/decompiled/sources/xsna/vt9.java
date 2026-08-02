package xsna;

import android.content.Context;
import com.vk.api.money.MoneySendTransfer;
import com.vk.dto.money.MoneyReceiverInfo;
import com.vk.money.createtransfer.people.ReceiverType;

/* compiled from: CardToVkPayTransferStrategy.kt */
/* loaded from: classes3.dex */
public final class vt9 implements rjp0 {
    @Override // xsna.rjp0
    public final void a(Context context, MoneySendTransfer moneySendTransfer, k9k k9kVar) {
        ver0.c(context, hg1.m(rsg0.y0(super.b(moneySendTransfer), null, null, 3), context, 0L, false, 62).subscribe(new hz(new mb(k9kVar, 15), 10), new jz(new iz(k9kVar, 7), 6)));
    }

    @Override // xsna.rjp0
    public final int c() {
        return ReceiverType.Card2VkPay.h();
    }

    @Override // xsna.rjp0
    public final MoneyReceiverInfo d(nl nlVar) {
        return nlVar.b();
    }
}
