package com.yandex.passport.internal.entities;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.api.PassportPersonProfile$PassportGender;
import defpackage.jl40;
import defpackage.qke;
import defpackage.unr0;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 72\u00020\u00012\u00020\u0002:\u00018BU\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0012\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b$\u0010%J^\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b(\u0010\u001eJ\u0010\u0010)\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b)\u0010\u001cJ\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b/\u0010\u001eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b0\u0010\u001eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b1\u0010\u001eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b2\u0010\u001eR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u0010#R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b6\u0010%¨\u00069"}, d2 = {"Lcom/yandex/passport/internal/entities/PersonProfile;", "", "Landroid/os/Parcelable;", "", "displayName", "firstName", "lastName", "birthday", "Lcom/yandex/passport/api/PassportPersonProfile$PassportGender;", "gender", "", "displayNames", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/passport/api/PassportPersonProfile$PassportGender;Ljava/util/List;)V", "", "toMap", "()Ljava/util/Map;", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/yandex/passport/api/PassportPersonProfile$PassportGender;", "component6", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/passport/api/PassportPersonProfile$PassportGender;Ljava/util/List;)Lcom/yandex/passport/internal/entities/PersonProfile;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDisplayName", "getFirstName", "getLastName", "getBirthday", "Lcom/yandex/passport/api/PassportPersonProfile$PassportGender;", "getGender", "Ljava/util/List;", "getDisplayNames", "Companion", "com/yandex/passport/internal/entities/n", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class PersonProfile implements Parcelable {
    public static final int $stable = 8;
    private final String birthday;
    private final String displayName;
    private final List<String> displayNames;
    private final String firstName;
    private final PassportPersonProfile$PassportGender gender;
    private final String lastName;
    public static final n Companion = new n();
    public static final Parcelable.Creator<PersonProfile> CREATOR = new Creator();
    private static final SimpleDateFormat BIRTHDAY_FORMAT = new SimpleDateFormat("yyyy-MM-dd", Locale.US);

    public /* synthetic */ PersonProfile(String str, String str2, String str3, String str4, PassportPersonProfile$PassportGender passportPersonProfile$PassportGender, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : passportPersonProfile$PassportGender, (i & 32) != 0 ? null : list);
    }

    public static /* synthetic */ PersonProfile copy$default(PersonProfile personProfile, String str, String str2, String str3, String str4, PassportPersonProfile$PassportGender passportPersonProfile$PassportGender, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = personProfile.displayName;
        }
        if ((i & 2) != 0) {
            str2 = personProfile.firstName;
        }
        if ((i & 4) != 0) {
            str3 = personProfile.lastName;
        }
        if ((i & 8) != 0) {
            str4 = personProfile.birthday;
        }
        if ((i & 16) != 0) {
            passportPersonProfile$PassportGender = personProfile.gender;
        }
        if ((i & 32) != 0) {
            list = personProfile.displayNames;
        }
        PassportPersonProfile$PassportGender passportPersonProfile$PassportGender2 = passportPersonProfile$PassportGender;
        List list2 = list;
        return personProfile.copy(str, str2, str3, str4, passportPersonProfile$PassportGender2, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBirthday() {
        return this.birthday;
    }

    /* renamed from: component5, reason: from getter */
    public final PassportPersonProfile$PassportGender getGender() {
        return this.gender;
    }

    public final List<String> component6() {
        return this.displayNames;
    }

    public final PersonProfile copy(String displayName, String firstName, String lastName, String birthday, PassportPersonProfile$PassportGender gender, List<String> displayNames) {
        return new PersonProfile(displayName, firstName, lastName, birthday, gender, displayNames);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PersonProfile)) {
            return false;
        }
        PersonProfile personProfile = (PersonProfile) other;
        return jl40.l(this.displayName, personProfile.displayName) && jl40.l(this.firstName, personProfile.firstName) && jl40.l(this.lastName, personProfile.lastName) && jl40.l(this.birthday, personProfile.birthday) && this.gender == personProfile.gender && jl40.l(this.displayNames, personProfile.displayNames);
    }

    public String getBirthday() {
        return this.birthday;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public List<String> getDisplayNames() {
        return this.displayNames;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public PassportPersonProfile$PassportGender getGender() {
        return this.gender;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int hashCode() {
        String str = this.displayName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.firstName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lastName;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.birthday;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        PassportPersonProfile$PassportGender passportPersonProfile$PassportGender = this.gender;
        int hashCode5 = (hashCode4 + (passportPersonProfile$PassportGender == null ? 0 : passportPersonProfile$PassportGender.hashCode())) * 31;
        List<String> list = this.displayNames;
        return hashCode5 + (list != null ? list.hashCode() : 0);
    }

    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("person-profile", this);
        return bundle;
    }

    public final Map<String, String> toMap() {
        Pair pair = new Pair("display_name", getDisplayName());
        Pair pair2 = new Pair("firstname", getFirstName());
        Pair pair3 = new Pair("lastname", getLastName());
        Pair pair4 = new Pair("birthday", getBirthday());
        PassportPersonProfile$PassportGender gender = getGender();
        return qke.k(kotlin.collections.b.i(pair, pair2, pair3, pair4, new Pair("gender", gender != null ? gender.toString() : null)));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PersonProfile(displayName=");
        sb.append(this.displayName);
        sb.append(", firstName=");
        sb.append(this.firstName);
        sb.append(", lastName=");
        sb.append(this.lastName);
        sb.append(", birthday=");
        sb.append(this.birthday);
        sb.append(", gender=");
        sb.append(this.gender);
        sb.append(", displayNames=");
        return unr0.t(sb, this.displayNames, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.displayName);
        dest.writeString(this.firstName);
        dest.writeString(this.lastName);
        dest.writeString(this.birthday);
        PassportPersonProfile$PassportGender passportPersonProfile$PassportGender = this.gender;
        if (passportPersonProfile$PassportGender == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(passportPersonProfile$PassportGender.name());
        }
        dest.writeStringList(this.displayNames);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PersonProfile> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PersonProfile createFromParcel(Parcel parcel) {
            return new PersonProfile(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : PassportPersonProfile$PassportGender.valueOf(parcel.readString()), parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PersonProfile[] newArray(int i) {
            return new PersonProfile[i];
        }
    }

    public PersonProfile(String str, String str2, String str3, String str4, PassportPersonProfile$PassportGender passportPersonProfile$PassportGender, List<String> list) {
        this.displayName = str;
        this.firstName = str2;
        this.lastName = str3;
        this.birthday = str4;
        this.gender = passportPersonProfile$PassportGender;
        this.displayNames = list;
    }

    public PersonProfile() {
        this(null, null, null, null, null, null, 63, null);
    }
}
