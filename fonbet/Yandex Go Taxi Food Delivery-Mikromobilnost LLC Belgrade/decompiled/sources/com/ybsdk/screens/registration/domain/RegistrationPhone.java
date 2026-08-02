package com.ybsdk.screens.registration.domain;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\n\u000bR\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005\u0082\u0001\u0002\f\r¨\u0006\u000e"}, d2 = {"Lcom/ybsdk/screens/registration/domain/RegistrationPhone;", "Landroid/os/Parcelable;", "phone", "", "getPhone", "()Ljava/lang/String;", "phoneId", "getPhoneId", "maskedPhone", "getMaskedPhone", "PredefinedPhoneEntity", "UserCustomPhoneEntity", "Lcom/ybsdk/screens/registration/domain/RegistrationPhone$PredefinedPhoneEntity;", "Lcom/ybsdk/screens/registration/domain/RegistrationPhone$UserCustomPhoneEntity;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface RegistrationPhone extends Parcelable {
    String getMaskedPhone();

    String getPhone();

    String getPhoneId();

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000fJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\u0011R\"\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010\u001c\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0011¨\u0006#"}, d2 = {"Lcom/ybsdk/screens/registration/domain/RegistrationPhone$PredefinedPhoneEntity;", "Lcom/ybsdk/screens/registration/domain/RegistrationPhone;", "", "phoneId", "maskedPhone", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/screens/registration/domain/RegistrationPhone$PredefinedPhoneEntity;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPhoneId", "getMaskedPhone", "phone", "getPhone", "getPhone$annotations", "()V", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PredefinedPhoneEntity implements RegistrationPhone {
        public static final Parcelable.Creator<PredefinedPhoneEntity> CREATOR = new Creator();
        private final String maskedPhone;
        private final String phone;
        private final String phoneId;

        public PredefinedPhoneEntity(String str, String str2) {
            this.phoneId = str;
            this.maskedPhone = str2;
        }

        public static /* synthetic */ PredefinedPhoneEntity copy$default(PredefinedPhoneEntity predefinedPhoneEntity, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = predefinedPhoneEntity.phoneId;
            }
            if ((i & 2) != 0) {
                str2 = predefinedPhoneEntity.maskedPhone;
            }
            return predefinedPhoneEntity.copy(str, str2);
        }

        public static /* synthetic */ void getPhone$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getPhoneId() {
            return this.phoneId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getMaskedPhone() {
            return this.maskedPhone;
        }

        public final PredefinedPhoneEntity copy(String phoneId, String maskedPhone) {
            return new PredefinedPhoneEntity(phoneId, maskedPhone);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PredefinedPhoneEntity)) {
                return false;
            }
            PredefinedPhoneEntity predefinedPhoneEntity = (PredefinedPhoneEntity) other;
            return jl40.l(this.phoneId, predefinedPhoneEntity.phoneId) && jl40.l(this.maskedPhone, predefinedPhoneEntity.maskedPhone);
        }

        @Override // com.ybsdk.screens.registration.domain.RegistrationPhone
        public String getMaskedPhone() {
            return this.maskedPhone;
        }

        @Override // com.ybsdk.screens.registration.domain.RegistrationPhone
        public String getPhone() {
            return this.phone;
        }

        @Override // com.ybsdk.screens.registration.domain.RegistrationPhone
        public String getPhoneId() {
            return this.phoneId;
        }

        public int hashCode() {
            return this.maskedPhone.hashCode() + (this.phoneId.hashCode() * 31);
        }

        public String toString() {
            return unr0.p("PredefinedPhoneEntity(phoneId=", this.phoneId, ", maskedPhone=", this.maskedPhone, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.phoneId);
            dest.writeString(this.maskedPhone);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PredefinedPhoneEntity> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PredefinedPhoneEntity createFromParcel(Parcel parcel) {
                return new PredefinedPhoneEntity(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PredefinedPhoneEntity[] newArray(int i) {
                return new PredefinedPhoneEntity[i];
            }
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010R\"\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001a\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\u0010R\"\u0010 \u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b \u0010\u001a\u0012\u0004\b\"\u0010\u001f\u001a\u0004\b!\u0010\u0010¨\u0006#"}, d2 = {"Lcom/ybsdk/screens/registration/domain/RegistrationPhone$UserCustomPhoneEntity;", "Lcom/ybsdk/screens/registration/domain/RegistrationPhone;", "", "phone", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/ybsdk/screens/registration/domain/RegistrationPhone$UserCustomPhoneEntity;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPhone", "phoneId", "getPhoneId", "getPhoneId$annotations", "()V", "maskedPhone", "getMaskedPhone", "getMaskedPhone$annotations", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UserCustomPhoneEntity implements RegistrationPhone {
        public static final Parcelable.Creator<UserCustomPhoneEntity> CREATOR = new Creator();
        private final String maskedPhone;
        private final String phone;
        private final String phoneId;

        public UserCustomPhoneEntity(String str) {
            this.phone = str;
        }

        public static /* synthetic */ UserCustomPhoneEntity copy$default(UserCustomPhoneEntity userCustomPhoneEntity, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = userCustomPhoneEntity.phone;
            }
            return userCustomPhoneEntity.copy(str);
        }

        public static /* synthetic */ void getMaskedPhone$annotations() {
        }

        public static /* synthetic */ void getPhoneId$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getPhone() {
            return this.phone;
        }

        public final UserCustomPhoneEntity copy(String phone) {
            return new UserCustomPhoneEntity(phone);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UserCustomPhoneEntity) && jl40.l(this.phone, ((UserCustomPhoneEntity) other).phone);
        }

        @Override // com.ybsdk.screens.registration.domain.RegistrationPhone
        public String getMaskedPhone() {
            return this.maskedPhone;
        }

        @Override // com.ybsdk.screens.registration.domain.RegistrationPhone
        public String getPhone() {
            return this.phone;
        }

        @Override // com.ybsdk.screens.registration.domain.RegistrationPhone
        public String getPhoneId() {
            return this.phoneId;
        }

        public int hashCode() {
            return this.phone.hashCode();
        }

        public String toString() {
            return oyr.p("UserCustomPhoneEntity(phone=", this.phone, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.phone);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<UserCustomPhoneEntity> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UserCustomPhoneEntity createFromParcel(Parcel parcel) {
                return new UserCustomPhoneEntity(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UserCustomPhoneEntity[] newArray(int i) {
                return new UserCustomPhoneEntity[i];
            }
        }
    }
}
