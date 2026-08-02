package xsna;

import android.content.Context;
import com.vk.api.money.MoneySendTransfer;
import com.vk.dto.money.MoneyReceiverInfo;
import com.vk.money.createtransfer.people.ReceiverType;

/* compiled from: Card2CardTransferStrategy.kt */
/* loaded from: classes3.dex */
public final class ts9 implements rjp0 {
    @Override // xsna.rjp0
    public final void a(Context context, MoneySendTransfer moneySendTransfer, k9k k9kVar) {
        ver0.c(context, hg1.m(rsg0.y0(super.b(moneySendTransfer), null, null, 3), context, 0L, false, 62).subscribe(new tf1(new tm0(k9kVar, 17), 7), new um0(new jy(k9kVar, 22), 10)));
    }

    @Override // xsna.rjp0
    public final int c() {
        return ReceiverType.Card2Card.h();
    }

    @Override // xsna.rjp0
    public final MoneyReceiverInfo d(nl nlVar) {
        return nlVar.a();
    }
}
