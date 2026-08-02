package xsna;

import android.content.Context;
import com.vk.api.money.MoneySendTransfer;
import com.vk.dto.money.MoneyReceiverInfo;

/* compiled from: TransferStrategy.kt */
/* loaded from: classes3.dex */
public interface rjp0 {
    void a(Context context, MoneySendTransfer moneySendTransfer, k9k k9kVar);

    default MoneySendTransfer b(MoneySendTransfer moneySendTransfer) {
        return MoneySendTransfer.F0(moneySendTransfer, c(), null, null, 2015);
    }

    int c();

    MoneyReceiverInfo d(nl nlVar);
}
