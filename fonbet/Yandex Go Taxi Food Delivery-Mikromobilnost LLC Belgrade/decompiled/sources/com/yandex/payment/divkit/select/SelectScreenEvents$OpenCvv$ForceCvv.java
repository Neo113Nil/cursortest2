package com.yandex.payment.divkit.select;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.payment.sdk.core.data.PaymentMethod;
import defpackage.ydq0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"com/yandex/payment/divkit/select/SelectScreenEvents$OpenCvv$ForceCvv", "Lydq0;", "Landroid/os/Parcelable;", "Lcom/yandex/payment/sdk/core/data/PaymentMethod$Card;", "card", "<init>", "(Lcom/yandex/payment/sdk/core/data/PaymentMethod$Card;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/yandex/payment/sdk/core/data/PaymentMethod$Card;", "getCard", "()Lcom/yandex/payment/sdk/core/data/PaymentMethod$Card;", "divkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SelectScreenEvents$OpenCvv$ForceCvv extends ydq0 implements Parcelable {
    public static final Parcelable.Creator<SelectScreenEvents$OpenCvv$ForceCvv> CREATOR = new Creator();
    private final PaymentMethod.Card card;

    public SelectScreenEvents$OpenCvv$ForceCvv(PaymentMethod.Card card) {
        this.card = card;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final PaymentMethod.Card getCard() {
        return this.card;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.card, flags);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SelectScreenEvents$OpenCvv$ForceCvv> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SelectScreenEvents$OpenCvv$ForceCvv createFromParcel(Parcel parcel) {
            return new SelectScreenEvents$OpenCvv$ForceCvv((PaymentMethod.Card) parcel.readParcelable(SelectScreenEvents$OpenCvv$ForceCvv.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SelectScreenEvents$OpenCvv$ForceCvv[] newArray(int i) {
            return new SelectScreenEvents$OpenCvv$ForceCvv[i];
        }
    }
}
