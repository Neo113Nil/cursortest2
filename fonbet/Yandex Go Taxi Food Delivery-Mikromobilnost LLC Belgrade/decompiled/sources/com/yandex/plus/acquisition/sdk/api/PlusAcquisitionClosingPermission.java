package com.yandex.plus.acquisition.sdk.api;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.unr0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/yandex/plus/acquisition/sdk/api/PlusAcquisitionClosingPermission;", "Landroid/os/Parcelable;", "All", "Authorized", "NoOne", "Lcom/yandex/plus/acquisition/sdk/api/PlusAcquisitionClosingPermission$All;", "Lcom/yandex/plus/acquisition/sdk/api/PlusAcquisitionClosingPermission$Authorized;", "Lcom/yandex/plus/acquisition/sdk/api/PlusAcquisitionClosingPermission$NoOne;", "acquisition-sdk-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface PlusAcquisitionClosingPermission extends Parcelable {

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\bJ\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/yandex/plus/acquisition/sdk/api/PlusAcquisitionClosingPermission$All;", "Lcom/yandex/plus/acquisition/sdk/api/PlusAcquisitionClosingPermission;", "", "needCloseOnError", "<init>", "(Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Z", "copy", "(Z)Lcom/yandex/plus/acquisition/sdk/api/PlusAcquisitionClosingPermission$All;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getNeedCloseOnError", "acquisition-sdk-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class All implements PlusAcquisitionClosingPermission {
        public static final Parcelable.Creator<All> CREATOR = new Creator();
        private final boolean needCloseOnError;

        public All(boolean z) {
            this.needCloseOnError = z;
        }

        public static /* synthetic */ All copy$default(All all, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = all.needCloseOnError;
            }
            return all.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getNeedCloseOnError() {
            return this.needCloseOnError;
        }

        public final All copy(boolean needCloseOnError) {
            return new All(needCloseOnError);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof All) && this.needCloseOnError == ((All) other).needCloseOnError;
        }

        public final boolean getNeedCloseOnError() {
            return this.needCloseOnError;
        }

        public int hashCode() {
            return Boolean.hashCode(this.needCloseOnError);
        }

        public String toString() {
            return unr0.u(new StringBuilder("All(needCloseOnError="), this.needCloseOnError, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.needCloseOnError ? 1 : 0);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<All> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final All createFromParcel(Parcel parcel) {
                return new All(parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final All[] newArray(int i) {
                return new All[i];
            }
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\bJ\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/yandex/plus/acquisition/sdk/api/PlusAcquisitionClosingPermission$Authorized;", "Lcom/yandex/plus/acquisition/sdk/api/PlusAcquisitionClosingPermission;", "", "needCloseOnError", "<init>", "(Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Z", "copy", "(Z)Lcom/yandex/plus/acquisition/sdk/api/PlusAcquisitionClosingPermission$Authorized;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getNeedCloseOnError", "acquisition-sdk-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Authorized implements PlusAcquisitionClosingPermission {
        public static final Parcelable.Creator<Authorized> CREATOR = new Creator();
        private final boolean needCloseOnError;

        public Authorized(boolean z) {
            this.needCloseOnError = z;
        }

        public static /* synthetic */ Authorized copy$default(Authorized authorized, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = authorized.needCloseOnError;
            }
            return authorized.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getNeedCloseOnError() {
            return this.needCloseOnError;
        }

        public final Authorized copy(boolean needCloseOnError) {
            return new Authorized(needCloseOnError);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Authorized) && this.needCloseOnError == ((Authorized) other).needCloseOnError;
        }

        public final boolean getNeedCloseOnError() {
            return this.needCloseOnError;
        }

        public int hashCode() {
            return Boolean.hashCode(this.needCloseOnError);
        }

        public String toString() {
            return unr0.u(new StringBuilder("Authorized(needCloseOnError="), this.needCloseOnError, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.needCloseOnError ? 1 : 0);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Authorized> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Authorized createFromParcel(Parcel parcel) {
                return new Authorized(parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Authorized[] newArray(int i) {
                return new Authorized[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/plus/acquisition/sdk/api/PlusAcquisitionClosingPermission$NoOne;", "Lcom/yandex/plus/acquisition/sdk/api/PlusAcquisitionClosingPermission;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "acquisition-sdk-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NoOne implements PlusAcquisitionClosingPermission {
        public static final NoOne INSTANCE = new NoOne();
        public static final Parcelable.Creator<NoOne> CREATOR = new Creator();

        private NoOne() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof NoOne);
        }

        public int hashCode() {
            return 672326837;
        }

        public String toString() {
            return "NoOne";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<NoOne> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NoOne createFromParcel(Parcel parcel) {
                parcel.readInt();
                return NoOne.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NoOne[] newArray(int i) {
                return new NoOne[i];
            }
        }
    }
}
