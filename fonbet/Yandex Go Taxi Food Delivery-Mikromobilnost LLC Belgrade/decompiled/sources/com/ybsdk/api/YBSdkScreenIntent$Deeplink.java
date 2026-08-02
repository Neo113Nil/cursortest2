package com.ybsdk.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.ybsdk.feature.deeplink.api.Deeplink;
import defpackage.jl40;
import defpackage.vh51;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u0004HÀ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0010J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u0012¨\u0006!"}, d2 = {"com/ybsdk/api/YBSdkScreenIntent$Deeplink", "Lvh51;", "", "Landroid/os/Parcelable;", "Lcom/ybsdk/feature/deeplink/api/Deeplink;", Constants.DEEPLINK, "<init>", "(Lcom/ybsdk/feature/deeplink/api/Deeplink;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1$yb_sdk_sdkRelease", "()Lcom/ybsdk/feature/deeplink/api/Deeplink;", "component1", "Lcom/ybsdk/api/YBSdkScreenIntent$Deeplink;", "copy", "(Lcom/ybsdk/feature/deeplink/api/Deeplink;)Lcom/ybsdk/api/YBSdkScreenIntent$Deeplink;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/feature/deeplink/api/Deeplink;", "getDeeplink$yb_sdk_sdkRelease", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class YBSdkScreenIntent$Deeplink extends vh51 implements Parcelable {
    public static final Parcelable.Creator<YBSdkScreenIntent$Deeplink> CREATOR = new Creator();
    private final Deeplink deeplink;

    public YBSdkScreenIntent$Deeplink(Deeplink deeplink) {
        this.deeplink = deeplink;
    }

    public static /* synthetic */ YBSdkScreenIntent$Deeplink copy$default(YBSdkScreenIntent$Deeplink yBSdkScreenIntent$Deeplink, Deeplink deeplink, int i, Object obj) {
        if ((i & 1) != 0) {
            deeplink = yBSdkScreenIntent$Deeplink.deeplink;
        }
        return yBSdkScreenIntent$Deeplink.copy(deeplink);
    }

    /* renamed from: component1$yb_sdk_sdkRelease, reason: from getter */
    public final Deeplink getDeeplink() {
        return this.deeplink;
    }

    public final YBSdkScreenIntent$Deeplink copy(Deeplink deeplink) {
        return new YBSdkScreenIntent$Deeplink(deeplink);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof YBSdkScreenIntent$Deeplink) && jl40.l(this.deeplink, ((YBSdkScreenIntent$Deeplink) other).deeplink);
    }

    public final Deeplink getDeeplink$yb_sdk_sdkRelease() {
        return this.deeplink;
    }

    public int hashCode() {
        return this.deeplink.hashCode();
    }

    public String toString() {
        return "Deeplink(deeplink=" + this.deeplink + Extension.C_BRAKE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.deeplink, flags);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<YBSdkScreenIntent$Deeplink> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final YBSdkScreenIntent$Deeplink createFromParcel(Parcel parcel) {
            return new YBSdkScreenIntent$Deeplink((Deeplink) parcel.readParcelable(YBSdkScreenIntent$Deeplink.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final YBSdkScreenIntent$Deeplink[] newArray(int i) {
            return new YBSdkScreenIntent$Deeplink[i];
        }
    }
}
