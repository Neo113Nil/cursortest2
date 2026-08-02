package com.yandex.messaging.ui.main.telemessenger;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.k4o;
import defpackage.tcy0;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u0000 \u00132\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0014B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lcom/yandex/messaging/ui/main/telemessenger/TeleMessengerMainFragmentTabs;", "Landroid/os/Parcelable;", "", "", "id", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Companion", "tcy0", "CALLS", "CHATS", "PROFILE", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TeleMessengerMainFragmentTabs implements Parcelable {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TeleMessengerMainFragmentTabs[] $VALUES;
    public static final Parcelable.Creator<TeleMessengerMainFragmentTabs> CREATOR;
    public static final tcy0 Companion;
    private final String id;
    public static final TeleMessengerMainFragmentTabs CALLS = new TeleMessengerMainFragmentTabs("CALLS", 0, "calls");
    public static final TeleMessengerMainFragmentTabs CHATS = new TeleMessengerMainFragmentTabs("CHATS", 1, "chats");
    public static final TeleMessengerMainFragmentTabs PROFILE = new TeleMessengerMainFragmentTabs("PROFILE", 2, "profile");

    private static final /* synthetic */ TeleMessengerMainFragmentTabs[] $values() {
        return new TeleMessengerMainFragmentTabs[]{CALLS, CHATS, PROFILE};
    }

    static {
        TeleMessengerMainFragmentTabs[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new tcy0();
        CREATOR = new Parcelable.Creator<TeleMessengerMainFragmentTabs>() { // from class: com.yandex.messaging.ui.main.telemessenger.TeleMessengerMainFragmentTabs.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TeleMessengerMainFragmentTabs createFromParcel(Parcel parcel) {
                return TeleMessengerMainFragmentTabs.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TeleMessengerMainFragmentTabs[] newArray(int i) {
                return new TeleMessengerMainFragmentTabs[i];
            }
        };
    }

    private TeleMessengerMainFragmentTabs(String str, int i, String str2) {
        this.id = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static TeleMessengerMainFragmentTabs valueOf(String str) {
        return (TeleMessengerMainFragmentTabs) Enum.valueOf(TeleMessengerMainFragmentTabs.class, str);
    }

    public static TeleMessengerMainFragmentTabs[] values() {
        return (TeleMessengerMainFragmentTabs[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getId() {
        return this.id;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name());
    }
}
