package com.yandex.payment.sdk.core.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import defpackage.af8;
import defpackage.tse0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001e\u001fB1\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/yandex/payment/sdk/core/data/CardExpirationDateValidationConfig;", "Landroid/os/Parcelable;", "", "minExpirationMonth", "minExpirationYear", "", ErrorResponseData.JSON_ERROR_MESSAGE, "", "allowEndlessCards", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Z)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Integer;", "getMinExpirationMonth$core_release", "()Ljava/lang/Integer;", "getMinExpirationYear$core_release", "Ljava/lang/String;", "getErrorMessage$core_release", "()Ljava/lang/String;", "Z", "getAllowEndlessCards$core_release", "()Z", "Companion", "a", "af8", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CardExpirationDateValidationConfig implements Parcelable {
    private static final CardExpirationDateValidationConfig Default;
    private final boolean allowEndlessCards;
    private final String errorMessage;
    private final Integer minExpirationMonth;
    private final Integer minExpirationYear;
    public static final af8 Companion = new af8();
    public static final Parcelable.Creator<CardExpirationDateValidationConfig> CREATOR = new Creator();

    public static final class a {
    }

    static {
        new a();
        Default = new CardExpirationDateValidationConfig(null, null, null, true);
    }

    public CardExpirationDateValidationConfig(Integer num, Integer num2, String str, boolean z) {
        this.minExpirationMonth = num;
        this.minExpirationYear = num2;
        this.errorMessage = str;
        this.allowEndlessCards = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* renamed from: getAllowEndlessCards$core_release, reason: from getter */
    public final boolean getAllowEndlessCards() {
        return this.allowEndlessCards;
    }

    /* renamed from: getErrorMessage$core_release, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* renamed from: getMinExpirationMonth$core_release, reason: from getter */
    public final Integer getMinExpirationMonth() {
        return this.minExpirationMonth;
    }

    /* renamed from: getMinExpirationYear$core_release, reason: from getter */
    public final Integer getMinExpirationYear() {
        return this.minExpirationYear;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Integer num = this.minExpirationMonth;
        if (num == null) {
            dest.writeInt(0);
        } else {
            tse0.v(dest, 1, num);
        }
        Integer num2 = this.minExpirationYear;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            tse0.v(dest, 1, num2);
        }
        dest.writeString(this.errorMessage);
        dest.writeInt(this.allowEndlessCards ? 1 : 0);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CardExpirationDateValidationConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardExpirationDateValidationConfig createFromParcel(Parcel parcel) {
            return new CardExpirationDateValidationConfig(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardExpirationDateValidationConfig[] newArray(int i) {
            return new CardExpirationDateValidationConfig[i];
        }
    }

    public /* synthetic */ CardExpirationDateValidationConfig(Integer num, Integer num2, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, num2, str, (i & 8) != 0 ? true : z);
    }
}
