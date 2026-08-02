package com.ybsdk.feature.kyc.internal.screens.photov3;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.navigation.ScreenParams;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J0\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\u0012¨\u0006\""}, d2 = {"Lcom/ybsdk/feature/kyc/internal/screens/photov3/PhotoParams;", "Lcom/ybsdk/core/navigation/ScreenParams;", "", "applicationId", "applicationType", "documentGroup", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/feature/kyc/internal/screens/photov3/PhotoParams;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getApplicationId", "getApplicationType", "getDocumentGroup", "feature-kyc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PhotoParams implements ScreenParams {
    public static final Parcelable.Creator<PhotoParams> CREATOR = new Creator();
    private final String applicationId;
    private final String applicationType;
    private final String documentGroup;

    public PhotoParams(String str, String str2, String str3) {
        this.applicationId = str;
        this.applicationType = str2;
        this.documentGroup = str3;
    }

    public static /* synthetic */ PhotoParams copy$default(PhotoParams photoParams, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = photoParams.applicationId;
        }
        if ((i & 2) != 0) {
            str2 = photoParams.applicationType;
        }
        if ((i & 4) != 0) {
            str3 = photoParams.documentGroup;
        }
        return photoParams.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getApplicationId() {
        return this.applicationId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getApplicationType() {
        return this.applicationType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDocumentGroup() {
        return this.documentGroup;
    }

    public final PhotoParams copy(String applicationId, String applicationType, String documentGroup) {
        return new PhotoParams(applicationId, applicationType, documentGroup);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhotoParams)) {
            return false;
        }
        PhotoParams photoParams = (PhotoParams) other;
        return jl40.l(this.applicationId, photoParams.applicationId) && jl40.l(this.applicationType, photoParams.applicationType) && jl40.l(this.documentGroup, photoParams.documentGroup);
    }

    public final String getApplicationId() {
        return this.applicationId;
    }

    public final String getApplicationType() {
        return this.applicationType;
    }

    public final String getDocumentGroup() {
        return this.documentGroup;
    }

    public int hashCode() {
        int b = unr0.b(this.applicationId.hashCode() * 31, 31, this.applicationType);
        String str = this.documentGroup;
        return b + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.applicationId;
        String str2 = this.applicationType;
        return oyr.t(b64.v("PhotoParams(applicationId=", str, ", applicationType=", str2, ", documentGroup="), this.documentGroup, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.applicationId);
        dest.writeString(this.applicationType);
        dest.writeString(this.documentGroup);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PhotoParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PhotoParams createFromParcel(Parcel parcel) {
            return new PhotoParams(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PhotoParams[] newArray(int i) {
            return new PhotoParams[i];
        }
    }
}
