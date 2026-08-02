package defpackage;

import android.net.Uri;
import com.ybsdk.feature.transfer.version2.api.TransferRemoteConfig$DashboardTopButton$TargetNfcScreenAnalytics;
import com.ybsdk.feature.transfer.version2.api.TransferRemoteConfig$DashboardTopButton$Type;
import com.ybsdk.widgets.common.YbButtonView;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class jo01 {
    public final YbButtonView.a a;
    public final Uri b;
    public final Uri c;
    public final TransferRemoteConfig$DashboardTopButton$TargetNfcScreenAnalytics d;
    public final TransferRemoteConfig$DashboardTopButton$Type e;

    public jo01(YbButtonView.a aVar, Uri uri, Uri uri2, TransferRemoteConfig$DashboardTopButton$TargetNfcScreenAnalytics transferRemoteConfig$DashboardTopButton$TargetNfcScreenAnalytics, TransferRemoteConfig$DashboardTopButton$Type transferRemoteConfig$DashboardTopButton$Type) {
        this.a = aVar;
        this.b = uri;
        this.c = uri2;
        this.d = transferRemoteConfig$DashboardTopButton$TargetNfcScreenAnalytics;
        this.e = transferRemoteConfig$DashboardTopButton$Type;
    }

    public final Uri a() {
        return this.b;
    }

    public final YbButtonView.a b() {
        return this.a;
    }

    public final TransferRemoteConfig$DashboardTopButton$Type c() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jo01)) {
            return false;
        }
        jo01 jo01Var = (jo01) obj;
        return jl40.l(this.a, jo01Var.a) && jl40.l(this.b, jo01Var.b) && jl40.l(this.c, jo01Var.c) && this.d == jo01Var.d && this.e == jo01Var.e;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Uri uri = this.c;
        int hashCode2 = (hashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        TransferRemoteConfig$DashboardTopButton$TargetNfcScreenAnalytics transferRemoteConfig$DashboardTopButton$TargetNfcScreenAnalytics = this.d;
        int hashCode3 = (hashCode2 + (transferRemoteConfig$DashboardTopButton$TargetNfcScreenAnalytics == null ? 0 : transferRemoteConfig$DashboardTopButton$TargetNfcScreenAnalytics.hashCode())) * 31;
        TransferRemoteConfig$DashboardTopButton$Type transferRemoteConfig$DashboardTopButton$Type = this.e;
        return hashCode3 + (transferRemoteConfig$DashboardTopButton$Type != null ? transferRemoteConfig$DashboardTopButton$Type.hashCode() : 0);
    }

    public final String toString() {
        return "DashboardTopButton(state=" + this.a + ", action=" + this.b + ", tokenizationAction=" + this.c + ", targetNfcScreenAnalytics=" + this.d + ", type=" + this.e + Extension.C_BRAKE;
    }

    public /* synthetic */ jo01(YbButtonView.a aVar, Uri uri, Uri uri2, TransferRemoteConfig$DashboardTopButton$Type transferRemoteConfig$DashboardTopButton$Type) {
        this(aVar, uri, uri2, null, transferRemoteConfig$DashboardTopButton$Type);
    }
}
