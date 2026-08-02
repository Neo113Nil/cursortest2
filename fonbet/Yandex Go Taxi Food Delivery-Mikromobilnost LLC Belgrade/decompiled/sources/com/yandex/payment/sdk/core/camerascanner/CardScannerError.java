package com.yandex.payment.sdk.core.camerascanner;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/yandex/payment/sdk/core/camerascanner/CardScannerError;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "NoPermissions", "NoMlServices", "FailedCameraInit", "Unknown", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CardScannerError implements Parcelable {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CardScannerError[] $VALUES;
    public static final Parcelable.Creator<CardScannerError> CREATOR;
    public static final CardScannerError NoPermissions = new CardScannerError("NoPermissions", 0);
    public static final CardScannerError NoMlServices = new CardScannerError("NoMlServices", 1);
    public static final CardScannerError FailedCameraInit = new CardScannerError("FailedCameraInit", 2);
    public static final CardScannerError Unknown = new CardScannerError("Unknown", 3);

    private static final /* synthetic */ CardScannerError[] $values() {
        return new CardScannerError[]{NoPermissions, NoMlServices, FailedCameraInit, Unknown};
    }

    static {
        CardScannerError[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
        CREATOR = new Parcelable.Creator<CardScannerError>() { // from class: com.yandex.payment.sdk.core.camerascanner.CardScannerError.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CardScannerError createFromParcel(Parcel parcel) {
                return CardScannerError.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CardScannerError[] newArray(int i) {
                return new CardScannerError[i];
            }
        };
    }

    private CardScannerError(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static CardScannerError valueOf(String str) {
        return (CardScannerError) Enum.valueOf(CardScannerError.class, str);
    }

    public static CardScannerError[] values() {
        return (CardScannerError[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name());
    }
}
