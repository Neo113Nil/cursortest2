package com.yandex.passport.internal.properties;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.f2;
import com.yandex.passport.api.k2;
import defpackage.b64;
import defpackage.jl40;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0002$%B!\b\u0000\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J(\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0011J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0015¨\u0006&"}, d2 = {"Lcom/yandex/passport/internal/properties/SocialRegistrationProperties;", "Lcom/yandex/passport/api/f2;", "Landroid/os/Parcelable;", "Lcom/yandex/passport/api/PassportUidImpl;", "uid", "", Constants.KEY_MESSAGE, "<init>", "(Lcom/yandex/passport/api/PassportUidImpl;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/yandex/passport/api/PassportUidImpl;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/yandex/passport/api/PassportUidImpl;Ljava/lang/String;)Lcom/yandex/passport/internal/properties/SocialRegistrationProperties;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/passport/api/PassportUidImpl;", "getUid", "Ljava/lang/String;", "getMessage", "Companion", "a", "com/yandex/passport/internal/properties/w", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class SocialRegistrationProperties implements f2, Parcelable {
    public static final int $stable = 8;
    private final String message;
    private final PassportUidImpl uid;
    public static final w Companion = new w();
    public static final Parcelable.Creator<SocialRegistrationProperties> CREATOR = new Creator();

    /* loaded from: classes2.dex */
    public static final class a implements f2 {
        public k2 a;

        @Override // com.yandex.passport.api.f2
        public final String getMessage() {
            return null;
        }

        @Override // com.yandex.passport.api.f2
        public final k2 getUid() {
            return this.a;
        }
    }

    public /* synthetic */ SocialRegistrationProperties(PassportUidImpl passportUidImpl, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : passportUidImpl, (i & 2) != 0 ? null : str);
    }

    public static /* synthetic */ SocialRegistrationProperties copy$default(SocialRegistrationProperties socialRegistrationProperties, PassportUidImpl passportUidImpl, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            passportUidImpl = socialRegistrationProperties.uid;
        }
        if ((i & 2) != 0) {
            str = socialRegistrationProperties.message;
        }
        return socialRegistrationProperties.copy(passportUidImpl, str);
    }

    /* renamed from: component1, reason: from getter */
    public final PassportUidImpl getUid() {
        return this.uid;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final SocialRegistrationProperties copy(PassportUidImpl uid, String message) {
        return new SocialRegistrationProperties(uid, message);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SocialRegistrationProperties)) {
            return false;
        }
        SocialRegistrationProperties socialRegistrationProperties = (SocialRegistrationProperties) other;
        return jl40.l(this.uid, socialRegistrationProperties.uid) && jl40.l(this.message, socialRegistrationProperties.message);
    }

    @Override // com.yandex.passport.api.f2
    public String getMessage() {
        return this.message;
    }

    public int hashCode() {
        PassportUidImpl passportUidImpl = this.uid;
        int hashCode = (passportUidImpl == null ? 0 : passportUidImpl.hashCode()) * 31;
        String str = this.message;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SocialRegistrationProperties(uid=");
        sb.append(this.uid);
        sb.append(", message=");
        return b64.p(sb, this.message, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        PassportUidImpl passportUidImpl = this.uid;
        if (passportUidImpl == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            passportUidImpl.writeToParcel(dest, flags);
        }
        dest.writeString(this.message);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SocialRegistrationProperties> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SocialRegistrationProperties createFromParcel(Parcel parcel) {
            return new SocialRegistrationProperties(parcel.readInt() == 0 ? null : PassportUidImpl.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SocialRegistrationProperties[] newArray(int i) {
            return new SocialRegistrationProperties[i];
        }
    }

    @Override // com.yandex.passport.api.f2
    public PassportUidImpl getUid() {
        return this.uid;
    }

    public SocialRegistrationProperties(PassportUidImpl passportUidImpl, String str) {
        this.uid = passportUidImpl;
        this.message = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SocialRegistrationProperties() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
