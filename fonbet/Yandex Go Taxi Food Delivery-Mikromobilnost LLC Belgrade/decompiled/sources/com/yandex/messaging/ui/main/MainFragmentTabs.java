package com.yandex.messaging.ui.main;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.f500;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/yandex/messaging/ui/main/MainFragmentTabs;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Companion", "f500", "CHATS", "SETTINGS", "THREADS", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MainFragmentTabs implements Parcelable {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MainFragmentTabs[] $VALUES;
    public static final Parcelable.Creator<MainFragmentTabs> CREATOR;
    public static final f500 Companion;
    private static final int size;
    public static final MainFragmentTabs CHATS = new MainFragmentTabs("CHATS", 0);
    public static final MainFragmentTabs SETTINGS = new MainFragmentTabs("SETTINGS", 1);
    public static final MainFragmentTabs THREADS = new MainFragmentTabs("THREADS", 2);

    private static final /* synthetic */ MainFragmentTabs[] $values() {
        return new MainFragmentTabs[]{CHATS, SETTINGS, THREADS};
    }

    static {
        MainFragmentTabs[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
        Companion = new f500();
        CREATOR = new Parcelable.Creator<MainFragmentTabs>() { // from class: com.yandex.messaging.ui.main.MainFragmentTabs.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MainFragmentTabs createFromParcel(Parcel parcel) {
                return MainFragmentTabs.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MainFragmentTabs[] newArray(int i) {
                return new MainFragmentTabs[i];
            }
        };
        size = values().length;
    }

    private MainFragmentTabs(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static MainFragmentTabs valueOf(String str) {
        return (MainFragmentTabs) Enum.valueOf(MainFragmentTabs.class, str);
    }

    public static MainFragmentTabs[] values() {
        return (MainFragmentTabs[]) $VALUES.clone();
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
