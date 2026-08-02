package com.yandex.xplat.payment.sdk;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dia0;
import defpackage.jqa0;
import defpackage.mbb1;
import defpackage.tyj0;
import defpackage.y3x;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u0000 \u00132\u00060\u0001j\u0002`\u0002:\u0001\u0014B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/yandex/xplat/payment/sdk/PaymethodMarkup;", "Landroid/os/Parcelable;", "Lcom/yandex/xplat/common/Parcelable;", "", "card", "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getCard", "()Ljava/lang/String;", "Companion", "jqa0", "xplat-payment-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public class PaymethodMarkup implements Parcelable {
    private final String card;
    public static final jqa0 Companion = new jqa0();
    public static final Parcelable.Creator<PaymethodMarkup> CREATOR = new Creator();

    public PaymethodMarkup(String str) {
        this.card = str;
    }

    public static tyj0 fromJsonItem(y3x y3xVar) {
        Companion.getClass();
        return mbb1.d(y3xVar, new dia0(4));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getCard() {
        return this.card;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.card);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PaymethodMarkup> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymethodMarkup createFromParcel(Parcel parcel) {
            return new PaymethodMarkup(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymethodMarkup[] newArray(int i) {
            return new PaymethodMarkup[i];
        }
    }
}
