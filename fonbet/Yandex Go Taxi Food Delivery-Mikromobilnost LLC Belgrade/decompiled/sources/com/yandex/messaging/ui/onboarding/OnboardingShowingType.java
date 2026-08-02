package com.yandex.messaging.ui.onboarding;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/yandex/messaging/ui/onboarding/OnboardingShowingType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "AppStart", "OrganizationSwitch", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class OnboardingShowingType implements Parcelable {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OnboardingShowingType[] $VALUES;
    public static final Parcelable.Creator<OnboardingShowingType> CREATOR;
    public static final OnboardingShowingType AppStart = new OnboardingShowingType("AppStart", 0);
    public static final OnboardingShowingType OrganizationSwitch = new OnboardingShowingType("OrganizationSwitch", 1);

    private static final /* synthetic */ OnboardingShowingType[] $values() {
        return new OnboardingShowingType[]{AppStart, OrganizationSwitch};
    }

    static {
        OnboardingShowingType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        CREATOR = new Parcelable.Creator<OnboardingShowingType>() { // from class: com.yandex.messaging.ui.onboarding.OnboardingShowingType.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OnboardingShowingType createFromParcel(Parcel parcel) {
                return OnboardingShowingType.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OnboardingShowingType[] newArray(int i) {
                return new OnboardingShowingType[i];
            }
        };
    }

    private OnboardingShowingType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static OnboardingShowingType valueOf(String str) {
        return (OnboardingShowingType) Enum.valueOf(OnboardingShowingType.class, str);
    }

    public static OnboardingShowingType[] values() {
        return (OnboardingShowingType[]) $VALUES.clone();
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
