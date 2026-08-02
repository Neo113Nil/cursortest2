package xsna;

import android.content.Context;
import android.os.Bundle;
import com.vk.api.money.MoneySendTransfer;
import com.vk.dto.money.MoneyReceiverInfo;
import com.vk.dto.money.VkPayTransferMethod;
import com.vk.money.createtransfer.people.CreatePeopleTransferFragment;
import com.vk.money.createtransfer.people.ReceiverType;
import com.vk.money.createtransfer.people.pin.VkPayPinFragment;
import com.vkontakte.android.R;
import java.util.Iterator;

/* compiled from: VkPayToVkPayTransferStrategy.kt */
/* loaded from: classes3.dex */
public final class acv0 implements rjp0 {
    @Override // xsna.rjp0
    public final void a(Context context, MoneySendTransfer moneySendTransfer, k9k k9kVar) {
        throw new UnsupportedOperationException();
    }

    @Override // xsna.rjp0
    public final int c() {
        return ReceiverType.VkPay2VkPay.h();
    }

    @Override // xsna.rjp0
    public final MoneyReceiverInfo d(nl nlVar) {
        VkPayTransferMethod g = nlVar.g();
        Object obj = null;
        if (g == null) {
            return null;
        }
        Iterator<T> it = g.g.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((MoneyReceiverInfo) next).j == ReceiverType.VkPay2VkPay.h()) {
                obj = next;
                break;
            }
        }
        return (MoneyReceiverInfo) obj;
    }

    public final void e(Context context, CreatePeopleTransferFragment createPeopleTransferFragment, MoneySendTransfer moneySendTransfer) {
        VkPayPinFragment.a aVar = new VkPayPinFragment.a(VkPayPinFragment.class, null, null);
        MoneySendTransfer b = super.b(moneySendTransfer);
        Bundle bundle = aVar.j;
        bundle.putParcelable("money_transfer_key", b);
        bundle.putBoolean("has_status", true);
        bundle.putString("title", context.getString(R.string.vkpay_pin_entry_point));
        aVar.s(true);
        createPeopleTransferFragment.startActivityForResult(aVar.n(context), 100);
    }
}
