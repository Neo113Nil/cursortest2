package com.yandex.passport.api.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.api.t0;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class PassportEnvironmentImpl implements t0, Parcelable {
    private static final String ACCOUNT_NAME_SUFFIX_TEAM = "@yandex-team.ru";
    public static final Parcelable.Creator<PassportEnvironmentImpl> CREATOR;
    private static final String LEGACY_AFFINITY_PROD = "PROD";
    private static final String LEGACY_AFFINITY_TEST = "TEST";
    private static final Map<Integer, PassportEnvironmentImpl> MAP;
    public static final PassportEnvironmentImpl PRODUCTION;
    public static final int PRODUCTION_INT = 1;
    public static final PassportEnvironmentImpl RC;
    public static final int RC_INT = 5;
    public static final PassportEnvironmentImpl TEAM_PRODUCTION;
    public static final int TEAM_PRODUCTION_INT = 2;
    public static final PassportEnvironmentImpl TEAM_TESTING;
    public static final int TEAM_TESTING_INT = 4;
    public static final PassportEnvironmentImpl TESTING;
    public static final int TESTING_INT = 3;
    private final int integer;
    private final String string;

    static {
        PassportEnvironmentImpl passportEnvironmentImpl = new PassportEnvironmentImpl(1, "PRODUCTION");
        PRODUCTION = passportEnvironmentImpl;
        PassportEnvironmentImpl passportEnvironmentImpl2 = new PassportEnvironmentImpl(2, "TEAM_PRODUCTION");
        TEAM_PRODUCTION = passportEnvironmentImpl2;
        PassportEnvironmentImpl passportEnvironmentImpl3 = new PassportEnvironmentImpl(3, "TESTING");
        TESTING = passportEnvironmentImpl3;
        PassportEnvironmentImpl passportEnvironmentImpl4 = new PassportEnvironmentImpl(4, "TEAM_TESTING");
        TEAM_TESTING = passportEnvironmentImpl4;
        PassportEnvironmentImpl passportEnvironmentImpl5 = new PassportEnvironmentImpl(5, "RC");
        RC = passportEnvironmentImpl5;
        HashMap hashMap = new HashMap();
        MAP = hashMap;
        hashMap.put(Integer.valueOf(passportEnvironmentImpl.getInteger()), passportEnvironmentImpl);
        hashMap.put(Integer.valueOf(passportEnvironmentImpl2.getInteger()), passportEnvironmentImpl2);
        hashMap.put(Integer.valueOf(passportEnvironmentImpl3.getInteger()), passportEnvironmentImpl3);
        hashMap.put(Integer.valueOf(passportEnvironmentImpl4.getInteger()), passportEnvironmentImpl4);
        hashMap.put(Integer.valueOf(passportEnvironmentImpl5.getInteger()), passportEnvironmentImpl5);
        CREATOR = new Parcelable.Creator<PassportEnvironmentImpl>() { // from class: com.yandex.passport.api.impl.PassportEnvironmentImpl.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public PassportEnvironmentImpl createFromParcel(Parcel parcel) {
                return PassportEnvironmentImpl.from(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public PassportEnvironmentImpl[] newArray(int i) {
                return new PassportEnvironmentImpl[i];
            }
        };
    }

    private PassportEnvironmentImpl(int i, String str) {
        this.integer = i;
        this.string = str;
    }

    public static PassportEnvironmentImpl from(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            Map<Integer, PassportEnvironmentImpl> map = MAP;
            return map.containsKey(Integer.valueOf(parseInt)) ? map.get(Integer.valueOf(parseInt)) : PRODUCTION;
        } catch (NumberFormatException unused) {
            return PRODUCTION;
        }
    }

    public static PassportEnvironmentImpl fromAccountName(String str) {
        return (str == null || !str.endsWith("@yandex-team.ru")) ? PRODUCTION : TEAM_PRODUCTION;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof t0) && this.integer == ((t0) obj).getInteger();
    }

    @Override // com.yandex.passport.api.t0
    public int getInteger() {
        return this.integer;
    }

    public int hashCode() {
        return this.integer;
    }

    public boolean isTeam() {
        return equals(TEAM_PRODUCTION) || equals(TEAM_TESTING);
    }

    public String toLegacyAffinity() {
        return (equals(TESTING) || equals(TEAM_TESTING)) ? LEGACY_AFFINITY_TEST : LEGACY_AFFINITY_PROD;
    }

    public String toString() {
        return this.string;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.integer);
    }

    public static PassportEnvironmentImpl from(int i) {
        Map<Integer, PassportEnvironmentImpl> map = MAP;
        if (map.containsKey(Integer.valueOf(i))) {
            return map.get(Integer.valueOf(i));
        }
        return PRODUCTION;
    }

    public static PassportEnvironmentImpl from(t0 t0Var) {
        return from(t0Var.getInteger());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static PassportEnvironmentImpl from(Parcel parcel) {
        return from(parcel.readInt());
    }
}
