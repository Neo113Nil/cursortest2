package com.ybsdk.feature.qr.api;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.nzs;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/feature/qr/api/QrReaderScreenType;", "Landroid/os/Parcelable;", "Old", "New", "Lcom/ybsdk/feature/qr/api/QrReaderScreenType$New;", "Lcom/ybsdk/feature/qr/api/QrReaderScreenType$Old;", "feature-qr-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface QrReaderScreenType extends Parcelable {

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000eJ\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u0003\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/feature/qr/api/QrReaderScreenType$New;", "Lcom/ybsdk/feature/qr/api/QrReaderScreenType;", "", "isTsarButtonEnabled", "<init>", "(Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Z", "copy", "(Z)Lcom/ybsdk/feature/qr/api/QrReaderScreenType$New;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "feature-qr-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class New implements QrReaderScreenType {
        public static final Parcelable.Creator<New> CREATOR = new Creator();
        private final boolean isTsarButtonEnabled;

        public New(boolean z) {
            this.isTsarButtonEnabled = z;
        }

        public static /* synthetic */ New copy$default(New r0, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = r0.isTsarButtonEnabled;
            }
            return r0.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsTsarButtonEnabled() {
            return this.isTsarButtonEnabled;
        }

        public final New copy(boolean isTsarButtonEnabled) {
            return new New(isTsarButtonEnabled);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof New) && this.isTsarButtonEnabled == ((New) other).isTsarButtonEnabled;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isTsarButtonEnabled);
        }

        public final boolean isTsarButtonEnabled() {
            return this.isTsarButtonEnabled;
        }

        public String toString() {
            return nzs.b("New(isTsarButtonEnabled=", Extension.C_BRAKE, this.isTsarButtonEnabled);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.isTsarButtonEnabled ? 1 : 0);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<New> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final New createFromParcel(Parcel parcel) {
                return new New(parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final New[] newArray(int i) {
                return new New[i];
            }
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/qr/api/QrReaderScreenType$Old;", "Lcom/ybsdk/feature/qr/api/QrReaderScreenType;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "feature-qr-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Old implements QrReaderScreenType {
        public static final Old INSTANCE = new Old();
        public static final Parcelable.Creator<Old> CREATOR = new Creator();

        private Old() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Old);
        }

        public int hashCode() {
            return -1779473886;
        }

        public String toString() {
            return "Old";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Old> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Old createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Old.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Old[] newArray(int i) {
                return new Old[i];
            }
        }
    }
}
