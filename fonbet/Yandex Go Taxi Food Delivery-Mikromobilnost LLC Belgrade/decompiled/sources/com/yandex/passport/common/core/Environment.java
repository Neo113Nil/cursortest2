package com.yandex.passport.common.core;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\u0081\u0002\u0018\u0000 \u00112\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0012B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0010\u0010\u000ej\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lcom/yandex/passport/common/core/Environment;", "Landroid/os/Parcelable;", "", "", "integer", "<init>", "(Ljava/lang/String;II)V", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", CA20Status.STATUS_USER_I, "getInteger", "Companion", "com/yandex/passport/common/core/a", "PRODUCTION", "TEAM_PRODUCTION", "TESTING", "TEAM_TESTING", "RC", "passport-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Environment implements Parcelable {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Environment[] $VALUES;
    public static final Parcelable.Creator<Environment> CREATOR;
    public static final a Companion;
    private final int integer;
    public static final Environment PRODUCTION = new Environment("PRODUCTION", 0, 1);
    public static final Environment TEAM_PRODUCTION = new Environment("TEAM_PRODUCTION", 1, 2);
    public static final Environment TESTING = new Environment("TESTING", 2, 3);
    public static final Environment TEAM_TESTING = new Environment("TEAM_TESTING", 3, 4);
    public static final Environment RC = new Environment("RC", 4, 5);

    private static final /* synthetic */ Environment[] $values() {
        return new Environment[]{PRODUCTION, TEAM_PRODUCTION, TESTING, TEAM_TESTING, RC};
    }

    static {
        Environment[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a();
        CREATOR = new Parcelable.Creator<Environment>() { // from class: com.yandex.passport.common.core.Environment.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Environment createFromParcel(Parcel parcel) {
                return Environment.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Environment[] newArray(int i) {
                return new Environment[i];
            }
        };
    }

    private Environment(String str, int i, int i2) {
        this.integer = i2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static Environment valueOf(String str) {
        return (Environment) Enum.valueOf(Environment.class, str);
    }

    public static Environment[] values() {
        return (Environment[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int getInteger() {
        return this.integer;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name());
    }
}
