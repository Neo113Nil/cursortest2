package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.yandex.payment.sdk.core.data.BankName;
import com.yandex.payment.sdk.core.data.BoundCard;
import com.yandex.payment.sdk.core.data.CardId;
import com.yandex.payment.sdk.core.data.CardPaymentSystem;
import com.yandex.payment.sdk.core.data.PaymentKitError;
import com.yandex.payment.sdk.core.data.PaymentMethod;
import com.yandex.plus.core.data.pay.PlusPaymentMethod;

/* loaded from: classes2.dex */
public final class dv5 extends x40 {
    public final ksi0 a;
    public final hca0 b;

    public dv5(ksi0 ksi0Var, hca0 hca0Var) {
        this.a = ksi0Var;
        this.b = hca0Var;
    }

    @Override // defpackage.x40
    public final Intent a(Context context, Object obj) {
        return this.a.c();
    }

    @Override // defpackage.x40
    public final Object c(int i, Intent intent) {
        z6a0 z6a0Var;
        PaymentKitError paymentKitError;
        BoundCard boundCard;
        y6a0 y6a0Var = null;
        if (intent == null || (boundCard = (BoundCard) ((Parcelable) ffx.P(intent, "DATA", BoundCard.class))) == null) {
            z6a0Var = null;
        } else {
            pf8 pf8Var = CardId.Companion;
            String cardId = boundCard.getCardId();
            pf8Var.getClass();
            PaymentMethod.Card card = new PaymentMethod.Card(new CardId(cardId), CardPaymentSystem.Unknown, "", BankName.UnknownBank, null);
            this.b.getClass();
            z6a0Var = new z6a0(new PlusPaymentMethod.Card(card.getId().getValue()));
        }
        if (z6a0Var != null) {
            return z6a0Var;
        }
        if (intent != null && (paymentKitError = (PaymentKitError) ((Parcelable) ffx.P(intent, "ERROR", PaymentKitError.class))) != null) {
            y6a0Var = new y6a0(paymentKitError.getMessage(), paymentKitError.getCode(), paymentKitError.getStatus(), paymentKitError.getKind().name(), paymentKitError.getTrigger().name());
        }
        return y6a0Var != null ? y6a0Var : x6a0.a;
    }
}
