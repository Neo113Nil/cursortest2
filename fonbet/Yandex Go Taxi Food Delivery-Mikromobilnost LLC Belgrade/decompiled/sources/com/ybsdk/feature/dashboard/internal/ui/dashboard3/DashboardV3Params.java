package com.ybsdk.feature.dashboard.internal.ui.dashboard3;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.navigation.ScreenParams;
import defpackage.jl40;
import defpackage.oo31;
import defpackage.oyr;
import defpackage.vfc;
import defpackage.xvz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/feature/dashboard/internal/ui/dashboard3/DashboardV3Params;", "Lcom/ybsdk/core/navigation/ScreenParams;", "Products", "External", "Lcom/ybsdk/feature/dashboard/internal/ui/dashboard3/DashboardV3Params$External;", "Lcom/ybsdk/feature/dashboard/internal/ui/dashboard3/DashboardV3Params$Products;", "feature-dashboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface DashboardV3Params extends ScreenParams {

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/feature/dashboard/internal/ui/dashboard3/DashboardV3Params$External;", "Lcom/ybsdk/feature/dashboard/internal/ui/dashboard3/DashboardV3Params;", "", "memberId", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/ybsdk/feature/dashboard/internal/ui/dashboard3/DashboardV3Params$External;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMemberId", "feature-dashboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class External implements DashboardV3Params {
        public static final Parcelable.Creator<External> CREATOR = new Creator();
        private final String memberId;

        public External(String str) {
            this.memberId = str;
        }

        public static /* synthetic */ External copy$default(External external, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = external.memberId;
            }
            return external.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMemberId() {
            return this.memberId;
        }

        public final External copy(String memberId) {
            return new External(memberId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof External) && jl40.l(this.memberId, ((External) other).memberId);
        }

        public final String getMemberId() {
            return this.memberId;
        }

        public int hashCode() {
            return this.memberId.hashCode();
        }

        public String toString() {
            return oyr.p("External(memberId=", this.memberId, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.memberId);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<External> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final External createFromParcel(Parcel parcel) {
                return new External(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final External[] newArray(int i) {
                return new External[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J*\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0011J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0015¨\u0006#"}, d2 = {"Lcom/ybsdk/feature/dashboard/internal/ui/dashboard3/DashboardV3Params$Products;", "Lcom/ybsdk/feature/dashboard/internal/ui/dashboard3/DashboardV3Params;", "", "Lcom/ybsdk/feature/dashboard/internal/ui/dashboard3/DashboardV3ScreenParams;", "products", "", "initialProductId", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/lang/String;)Lcom/ybsdk/feature/dashboard/internal/ui/dashboard3/DashboardV3Params$Products;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getProducts", "Ljava/lang/String;", "getInitialProductId", "feature-dashboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Products implements DashboardV3Params {
        public static final Parcelable.Creator<Products> CREATOR = new Creator();
        private final String initialProductId;
        private final List<DashboardV3ScreenParams> products;

        public Products(List<DashboardV3ScreenParams> list, String str) {
            this.products = list;
            this.initialProductId = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Products copy$default(Products products, List list, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                list = products.products;
            }
            if ((i & 2) != 0) {
                str = products.initialProductId;
            }
            return products.copy(list, str);
        }

        public final List<DashboardV3ScreenParams> component1() {
            return this.products;
        }

        /* renamed from: component2, reason: from getter */
        public final String getInitialProductId() {
            return this.initialProductId;
        }

        public final Products copy(List<DashboardV3ScreenParams> products, String initialProductId) {
            return new Products(products, initialProductId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Products)) {
                return false;
            }
            Products products = (Products) other;
            return jl40.l(this.products, products.products) && jl40.l(this.initialProductId, products.initialProductId);
        }

        public final String getInitialProductId() {
            return this.initialProductId;
        }

        public final List<DashboardV3ScreenParams> getProducts() {
            return this.products;
        }

        public int hashCode() {
            return this.initialProductId.hashCode() + (this.products.hashCode() * 31);
        }

        public String toString() {
            return xvz.i("Products(products=", ", initialProductId=", this.initialProductId, Extension.C_BRAKE, this.products);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Iterator t = vfc.t(dest, this.products);
            while (t.hasNext()) {
                ((DashboardV3ScreenParams) t.next()).writeToParcel(dest, flags);
            }
            dest.writeString(this.initialProductId);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Products> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Products createFromParcel(Parcel parcel) {
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = oo31.d(DashboardV3ScreenParams.CREATOR, parcel, arrayList, i, 1);
                }
                return new Products(arrayList, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Products[] newArray(int i) {
                return new Products[i];
            }
        }
    }
}
