package com.yandex.payment.sdk.core.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b64;
import defpackage.jl40;
import defpackage.lu2;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0001#B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J4\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\nJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\u0012¨\u0006$"}, d2 = {"Lcom/yandex/payment/sdk/core/data/AppInfo;", "Landroid/os/Parcelable;", "", "psuid", "tsid", "appid", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/payment/sdk/core/data/AppInfo;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPsuid", "getTsid", "getAppid", "Companion", "lu2", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AppInfo implements Parcelable {
    private final String appid;
    private final String psuid;
    private final String tsid;
    public static final lu2 Companion = new lu2();
    public static final Parcelable.Creator<AppInfo> CREATOR = new Creator();
    private static final AppInfo Default = new AppInfo(null, null, null);

    public AppInfo(String str, String str2, String str3) {
        this.psuid = str;
        this.tsid = str2;
        this.appid = str3;
    }

    public static /* synthetic */ AppInfo copy$default(AppInfo appInfo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appInfo.psuid;
        }
        if ((i & 2) != 0) {
            str2 = appInfo.tsid;
        }
        if ((i & 4) != 0) {
            str3 = appInfo.appid;
        }
        return appInfo.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPsuid() {
        return this.psuid;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTsid() {
        return this.tsid;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAppid() {
        return this.appid;
    }

    public final AppInfo copy(String psuid, String tsid, String appid) {
        return new AppInfo(psuid, tsid, appid);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppInfo)) {
            return false;
        }
        AppInfo appInfo = (AppInfo) other;
        return jl40.l(this.psuid, appInfo.psuid) && jl40.l(this.tsid, appInfo.tsid) && jl40.l(this.appid, appInfo.appid);
    }

    public final String getAppid() {
        return this.appid;
    }

    public final String getPsuid() {
        return this.psuid;
    }

    public final String getTsid() {
        return this.tsid;
    }

    public int hashCode() {
        String str = this.psuid;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.tsid;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.appid;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.psuid;
        String str2 = this.tsid;
        return oyr.t(b64.v("AppInfo(psuid=", str, ", tsid=", str2, ", appid="), this.appid, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.psuid);
        dest.writeString(this.tsid);
        dest.writeString(this.appid);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AppInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AppInfo createFromParcel(Parcel parcel) {
            return new AppInfo(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AppInfo[] newArray(int i) {
            return new AppInfo[i];
        }
    }
}
