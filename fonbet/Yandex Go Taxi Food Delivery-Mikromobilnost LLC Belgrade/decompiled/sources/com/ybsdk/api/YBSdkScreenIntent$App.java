package com.ybsdk.api;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.nzs;
import defpackage.vh51;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000fJ\u001a\u0010\u001b\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u0011¨\u0006\u001f"}, d2 = {"com/ybsdk/api/YBSdkScreenIntent$App", "Lvh51;", "Landroid/os/Parcelable;", "", "hasUid", "<init>", "(Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Z", "Lcom/ybsdk/api/YBSdkScreenIntent$App;", "copy", "(Z)Lcom/ybsdk/api/YBSdkScreenIntent$App;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getHasUid", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class YBSdkScreenIntent$App extends vh51 implements Parcelable {
    public static final Parcelable.Creator<YBSdkScreenIntent$App> CREATOR = new Creator();
    private final boolean hasUid;

    public YBSdkScreenIntent$App(boolean z) {
        this.hasUid = z;
    }

    public static /* synthetic */ YBSdkScreenIntent$App copy$default(YBSdkScreenIntent$App yBSdkScreenIntent$App, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = yBSdkScreenIntent$App.hasUid;
        }
        return yBSdkScreenIntent$App.copy(z);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getHasUid() {
        return this.hasUid;
    }

    public final YBSdkScreenIntent$App copy(boolean hasUid) {
        return new YBSdkScreenIntent$App(hasUid);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof YBSdkScreenIntent$App) && this.hasUid == ((YBSdkScreenIntent$App) other).hasUid;
    }

    public final boolean getHasUid() {
        return this.hasUid;
    }

    public int hashCode() {
        return Boolean.hashCode(this.hasUid);
    }

    public String toString() {
        return nzs.b("App(hasUid=", Extension.C_BRAKE, this.hasUid);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.hasUid ? 1 : 0);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<YBSdkScreenIntent$App> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final YBSdkScreenIntent$App createFromParcel(Parcel parcel) {
            return new YBSdkScreenIntent$App(parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final YBSdkScreenIntent$App[] newArray(int i) {
            return new YBSdkScreenIntent$App[i];
        }
    }
}
