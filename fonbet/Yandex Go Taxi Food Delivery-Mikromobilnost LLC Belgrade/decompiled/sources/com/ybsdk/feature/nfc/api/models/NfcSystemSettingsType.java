package com.ybsdk.feature.nfc.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/feature/nfc/api/models/NfcSystemSettingsType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "ENABLE_ADAPTER", "ENABLE_BIOMETRY", "ENABLE_DEFAULT_APP", "ENABLE_DRAW_OVERLAY", "ADD_SHORTCUT", "feature-nfc-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NfcSystemSettingsType implements Parcelable {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NfcSystemSettingsType[] $VALUES;
    public static final Parcelable.Creator<NfcSystemSettingsType> CREATOR;
    public static final NfcSystemSettingsType ENABLE_ADAPTER = new NfcSystemSettingsType("ENABLE_ADAPTER", 0);
    public static final NfcSystemSettingsType ENABLE_BIOMETRY = new NfcSystemSettingsType("ENABLE_BIOMETRY", 1);
    public static final NfcSystemSettingsType ENABLE_DEFAULT_APP = new NfcSystemSettingsType("ENABLE_DEFAULT_APP", 2);
    public static final NfcSystemSettingsType ENABLE_DRAW_OVERLAY = new NfcSystemSettingsType("ENABLE_DRAW_OVERLAY", 3);
    public static final NfcSystemSettingsType ADD_SHORTCUT = new NfcSystemSettingsType("ADD_SHORTCUT", 4);

    private static final /* synthetic */ NfcSystemSettingsType[] $values() {
        return new NfcSystemSettingsType[]{ENABLE_ADAPTER, ENABLE_BIOMETRY, ENABLE_DEFAULT_APP, ENABLE_DRAW_OVERLAY, ADD_SHORTCUT};
    }

    static {
        NfcSystemSettingsType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
        CREATOR = new Parcelable.Creator<NfcSystemSettingsType>() { // from class: com.ybsdk.feature.nfc.api.models.NfcSystemSettingsType.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NfcSystemSettingsType createFromParcel(Parcel parcel) {
                return NfcSystemSettingsType.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NfcSystemSettingsType[] newArray(int i) {
                return new NfcSystemSettingsType[i];
            }
        };
    }

    private NfcSystemSettingsType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static NfcSystemSettingsType valueOf(String str) {
        return (NfcSystemSettingsType) Enum.valueOf(NfcSystemSettingsType.class, str);
    }

    public static NfcSystemSettingsType[] values() {
        return (NfcSystemSettingsType[]) $VALUES.clone();
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
