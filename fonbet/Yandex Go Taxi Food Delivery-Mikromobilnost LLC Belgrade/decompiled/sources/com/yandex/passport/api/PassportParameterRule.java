package com.yandex.passport.api;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.qv10;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001$B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J*\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0011J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0013R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006%"}, d2 = {"Lcom/yandex/passport/api/PassportParameterRule;", "Landroid/os/Parcelable;", "Lcom/yandex/passport/api/PassportParameterRule$Sign;", "sign", "", "", "parameters", "<init>", "(Lcom/yandex/passport/api/PassportParameterRule$Sign;Ljava/util/Set;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/yandex/passport/api/PassportParameterRule$Sign;", "component2", "()Ljava/util/Set;", "copy", "(Lcom/yandex/passport/api/PassportParameterRule$Sign;Ljava/util/Set;)Lcom/yandex/passport/api/PassportParameterRule;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/passport/api/PassportParameterRule$Sign;", "getSign", "Ljava/util/Set;", "getParameters", "Sign", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class PassportParameterRule implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<PassportParameterRule> CREATOR = new Creator();
    private final Set<String> parameters;
    private final Sign sign;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/passport/api/PassportParameterRule$Sign;", "", "INCLUDE", "EXCLUDE", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Sign {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Sign[] $VALUES;
        public static final Sign EXCLUDE;
        public static final Sign INCLUDE;

        static {
            Sign sign = new Sign("INCLUDE", 0);
            INCLUDE = sign;
            Sign sign2 = new Sign("EXCLUDE", 1);
            EXCLUDE = sign2;
            Sign[] signArr = {sign, sign2};
            $VALUES = signArr;
            $ENTRIES = kotlin.enums.a.a(signArr);
        }

        public static Sign valueOf(String str) {
            return (Sign) Enum.valueOf(Sign.class, str);
        }

        public static Sign[] values() {
            return (Sign[]) $VALUES.clone();
        }
    }

    public PassportParameterRule(Sign sign, Set<String> set) {
        this.sign = sign;
        this.parameters = set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PassportParameterRule copy$default(PassportParameterRule passportParameterRule, Sign sign, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            sign = passportParameterRule.sign;
        }
        if ((i & 2) != 0) {
            set = passportParameterRule.parameters;
        }
        return passportParameterRule.copy(sign, set);
    }

    /* renamed from: component1, reason: from getter */
    public final Sign getSign() {
        return this.sign;
    }

    public final Set<String> component2() {
        return this.parameters;
    }

    public final PassportParameterRule copy(Sign sign, Set<String> parameters) {
        return new PassportParameterRule(sign, parameters);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassportParameterRule)) {
            return false;
        }
        PassportParameterRule passportParameterRule = (PassportParameterRule) other;
        return this.sign == passportParameterRule.sign && jl40.l(this.parameters, passportParameterRule.parameters);
    }

    public final Set<String> getParameters() {
        return this.parameters;
    }

    public final Sign getSign() {
        return this.sign;
    }

    public int hashCode() {
        return this.parameters.hashCode() + (this.sign.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PassportParameterRule(sign=");
        sb.append(this.sign);
        sb.append(", parameters=");
        return qv10.s(sb, this.parameters, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.sign.name());
        Set<String> set = this.parameters;
        dest.writeInt(set.size());
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            dest.writeString(it.next());
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PassportParameterRule> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PassportParameterRule createFromParcel(Parcel parcel) {
            Sign valueOf = Sign.valueOf(parcel.readString());
            int readInt = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
            for (int i = 0; i != readInt; i++) {
                linkedHashSet.add(parcel.readString());
            }
            return new PassportParameterRule(valueOf, linkedHashSet);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PassportParameterRule[] newArray(int i) {
            return new PassportParameterRule[i];
        }
    }
}
