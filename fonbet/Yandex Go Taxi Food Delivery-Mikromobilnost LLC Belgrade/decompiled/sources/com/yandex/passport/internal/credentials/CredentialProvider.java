package com.yandex.passport.internal.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/passport/internal/credentials/CredentialProvider;", "Landroid/os/Parcelable;", "Companion", "NoCredentials", "FromProperties", "Provided", "com/yandex/passport/internal/credentials/b", "Lcom/yandex/passport/internal/credentials/CredentialProvider$FromProperties;", "Lcom/yandex/passport/internal/credentials/CredentialProvider$NoCredentials;", "Lcom/yandex/passport/internal/credentials/CredentialProvider$Provided;", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface CredentialProvider extends Parcelable {
    public static final b Companion = b.a;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/yandex/passport/internal/credentials/CredentialProvider$FromProperties;", "Lcom/yandex/passport/internal/credentials/CredentialProvider;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FromProperties implements CredentialProvider {
        public static final int $stable = 0;
        public static final FromProperties INSTANCE = new FromProperties();
        public static final Parcelable.Creator<FromProperties> CREATOR = new Creator();

        private FromProperties() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<FromProperties> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FromProperties createFromParcel(Parcel parcel) {
                parcel.readInt();
                return FromProperties.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FromProperties[] newArray(int i) {
                return new FromProperties[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/yandex/passport/internal/credentials/CredentialProvider$NoCredentials;", "Lcom/yandex/passport/internal/credentials/CredentialProvider;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NoCredentials implements CredentialProvider {
        public static final int $stable = 0;
        public static final NoCredentials INSTANCE = new NoCredentials();
        public static final Parcelable.Creator<NoCredentials> CREATOR = new Creator();

        private NoCredentials() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<NoCredentials> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NoCredentials createFromParcel(Parcel parcel) {
                parcel.readInt();
                return NoCredentials.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NoCredentials[] newArray(int i) {
                return new NoCredentials[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000eJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/yandex/passport/internal/credentials/CredentialProvider$Provided;", "Lcom/yandex/passport/internal/credentials/CredentialProvider;", "Lcom/yandex/passport/internal/credentials/ClientCredentials;", "clientCredentials", "<init>", "(Lcom/yandex/passport/internal/credentials/ClientCredentials;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/yandex/passport/internal/credentials/ClientCredentials;", "copy", "(Lcom/yandex/passport/internal/credentials/ClientCredentials;)Lcom/yandex/passport/internal/credentials/CredentialProvider$Provided;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/passport/internal/credentials/ClientCredentials;", "getClientCredentials", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Provided implements CredentialProvider {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Provided> CREATOR = new Creator();
        private final ClientCredentials clientCredentials;

        public Provided(ClientCredentials clientCredentials) {
            this.clientCredentials = clientCredentials;
        }

        public static /* synthetic */ Provided copy$default(Provided provided, ClientCredentials clientCredentials, int i, Object obj) {
            if ((i & 1) != 0) {
                clientCredentials = provided.clientCredentials;
            }
            return provided.copy(clientCredentials);
        }

        /* renamed from: component1, reason: from getter */
        public final ClientCredentials getClientCredentials() {
            return this.clientCredentials;
        }

        public final Provided copy(ClientCredentials clientCredentials) {
            return new Provided(clientCredentials);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Provided) && jl40.l(this.clientCredentials, ((Provided) other).clientCredentials);
        }

        public final ClientCredentials getClientCredentials() {
            return this.clientCredentials;
        }

        public int hashCode() {
            return this.clientCredentials.hashCode();
        }

        public String toString() {
            return "Provided(clientCredentials=" + this.clientCredentials + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeParcelable(this.clientCredentials, flags);
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Provided> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Provided createFromParcel(Parcel parcel) {
                return new Provided((ClientCredentials) parcel.readParcelable(Provided.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Provided[] newArray(int i) {
                return new Provided[i];
            }
        }
    }
}
