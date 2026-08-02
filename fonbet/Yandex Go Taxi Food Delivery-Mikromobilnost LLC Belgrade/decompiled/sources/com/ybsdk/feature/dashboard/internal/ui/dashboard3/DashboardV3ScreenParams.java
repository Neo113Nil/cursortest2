package com.ybsdk.feature.dashboard.internal.ui.dashboard3;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0014\u0010\u0011\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J(\u0010\u0014\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0012J\u0010\u0010\u0017\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0010J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001f\u0010\u0012¨\u0006 "}, d2 = {"Lcom/ybsdk/feature/dashboard/internal/ui/dashboard3/DashboardV3ScreenParams;", "Landroid/os/Parcelable;", "", "Lcom/ybsdk/feature/dashboard/api/DashboardV3ProductId;", "productId", "balance", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/feature/dashboard/internal/ui/dashboard3/DashboardV3ScreenParams;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProductId", "getBalance", "feature-dashboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DashboardV3ScreenParams implements Parcelable {
    public static final Parcelable.Creator<DashboardV3ScreenParams> CREATOR = new Creator();
    private final String balance;
    private final String productId;

    public DashboardV3ScreenParams(String str, String str2) {
        this.productId = str;
        this.balance = str2;
    }

    public static /* synthetic */ DashboardV3ScreenParams copy$default(DashboardV3ScreenParams dashboardV3ScreenParams, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dashboardV3ScreenParams.productId;
        }
        if ((i & 2) != 0) {
            str2 = dashboardV3ScreenParams.balance;
        }
        return dashboardV3ScreenParams.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBalance() {
        return this.balance;
    }

    public final DashboardV3ScreenParams copy(String productId, String balance) {
        return new DashboardV3ScreenParams(productId, balance);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DashboardV3ScreenParams)) {
            return false;
        }
        DashboardV3ScreenParams dashboardV3ScreenParams = (DashboardV3ScreenParams) other;
        return jl40.l(this.productId, dashboardV3ScreenParams.productId) && jl40.l(this.balance, dashboardV3ScreenParams.balance);
    }

    public final String getBalance() {
        return this.balance;
    }

    public final String getProductId() {
        return this.productId;
    }

    public int hashCode() {
        return this.balance.hashCode() + (this.productId.hashCode() * 31);
    }

    public String toString() {
        return unr0.p("DashboardV3ScreenParams(productId=", this.productId, ", balance=", this.balance, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.productId);
        dest.writeString(this.balance);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DashboardV3ScreenParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DashboardV3ScreenParams createFromParcel(Parcel parcel) {
            return new DashboardV3ScreenParams(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DashboardV3ScreenParams[] newArray(int i) {
            return new DashboardV3ScreenParams[i];
        }
    }
}
