package com.ybsdk.deeplink.generated;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import com.ybsdk.network.dto.CreateApplicationWithProductJsonAdapter;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.qv10;
import defpackage.unr0;
import defpackage.vfc;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019JT\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b \u0010\u0014J\u001a\u0010#\u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b*\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b+\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b,\u0010\u0019R \u0010.\u001a\u00020-8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b.\u0010/\u0012\u0004\b2\u00103\u001a\u0004\b0\u00101¨\u00064"}, d2 = {"Lcom/ybsdk/deeplink/generated/TransactionsFeedAction;", "Lcom/ybsdk/feature/deeplink/api/BaseDeeplinkAction;", "", "showTabbar", "hideFilters", "", CreateApplicationWithProductJsonAdapter.productKey, "headerStyle", "filtersStyle", "agreementId", "<init>", "(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Z", "component2", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "copy", "(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/deeplink/generated/TransactionsFeedAction;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getShowTabbar", "getHideFilters", "Ljava/lang/String;", "getProduct", "getHeaderStyle", "getFiltersStyle", "getAgreementId", "Landroid/net/Uri;", "deeplinkUri", "Landroid/net/Uri;", "getDeeplinkUri", "()Landroid/net/Uri;", "getDeeplinkUri$annotations", "()V", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TransactionsFeedAction implements BaseDeeplinkAction {
    public static final Parcelable.Creator<TransactionsFeedAction> CREATOR = new Creator();
    private final String agreementId;
    private final Uri deeplinkUri;
    private final String filtersStyle;
    private final String headerStyle;
    private final boolean hideFilters;
    private final String product;
    private final boolean showTabbar;

    public TransactionsFeedAction(boolean z, boolean z2, String str, String str2, String str3, String str4) {
        this.showTabbar = z;
        this.hideFilters = z2;
        this.product = str;
        this.headerStyle = str2;
        this.filtersStyle = str3;
        this.agreementId = str4;
        Uri.Builder l = vfc.l("ybapp", "screen.open", "/transactions_feed");
        l.appendQueryParameter("show_tabbar", String.valueOf(z));
        l.appendQueryParameter("hide_filters", String.valueOf(z2));
        if (str != null) {
            l.appendQueryParameter(CreateApplicationWithProductJsonAdapter.productKey, str);
        }
        if (str2 != null) {
            l.appendQueryParameter("header_style", str2);
        }
        if (str3 != null) {
            l.appendQueryParameter("filters_style", str3);
        }
        if (str4 != null) {
            l.appendQueryParameter("agreement_id", str4);
        }
        this.deeplinkUri = l.build();
    }

    public static /* synthetic */ TransactionsFeedAction copy$default(TransactionsFeedAction transactionsFeedAction, boolean z, boolean z2, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = transactionsFeedAction.showTabbar;
        }
        if ((i & 2) != 0) {
            z2 = transactionsFeedAction.hideFilters;
        }
        if ((i & 4) != 0) {
            str = transactionsFeedAction.product;
        }
        if ((i & 8) != 0) {
            str2 = transactionsFeedAction.headerStyle;
        }
        if ((i & 16) != 0) {
            str3 = transactionsFeedAction.filtersStyle;
        }
        if ((i & 32) != 0) {
            str4 = transactionsFeedAction.agreementId;
        }
        String str5 = str3;
        String str6 = str4;
        return transactionsFeedAction.copy(z, z2, str, str2, str5, str6);
    }

    public static /* synthetic */ void getDeeplinkUri$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShowTabbar() {
        return this.showTabbar;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getHideFilters() {
        return this.hideFilters;
    }

    /* renamed from: component3, reason: from getter */
    public final String getProduct() {
        return this.product;
    }

    /* renamed from: component4, reason: from getter */
    public final String getHeaderStyle() {
        return this.headerStyle;
    }

    /* renamed from: component5, reason: from getter */
    public final String getFiltersStyle() {
        return this.filtersStyle;
    }

    /* renamed from: component6, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    public final TransactionsFeedAction copy(boolean showTabbar, boolean hideFilters, String product, String headerStyle, String filtersStyle, String agreementId) {
        return new TransactionsFeedAction(showTabbar, hideFilters, product, headerStyle, filtersStyle, agreementId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionsFeedAction)) {
            return false;
        }
        TransactionsFeedAction transactionsFeedAction = (TransactionsFeedAction) other;
        return this.showTabbar == transactionsFeedAction.showTabbar && this.hideFilters == transactionsFeedAction.hideFilters && jl40.l(this.product, transactionsFeedAction.product) && jl40.l(this.headerStyle, transactionsFeedAction.headerStyle) && jl40.l(this.filtersStyle, transactionsFeedAction.filtersStyle) && jl40.l(this.agreementId, transactionsFeedAction.agreementId);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    @Override // com.ybsdk.feature.deeplink.api.BaseDeeplinkAction
    public Uri getDeeplinkUri() {
        return this.deeplinkUri;
    }

    public final String getFiltersStyle() {
        return this.filtersStyle;
    }

    public final String getHeaderStyle() {
        return this.headerStyle;
    }

    public final boolean getHideFilters() {
        return this.hideFilters;
    }

    public final String getProduct() {
        return this.product;
    }

    public final boolean getShowTabbar() {
        return this.showTabbar;
    }

    public int hashCode() {
        int e = unr0.e(Boolean.hashCode(this.showTabbar) * 31, 31, this.hideFilters);
        String str = this.product;
        int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.headerStyle;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.filtersStyle;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.agreementId;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        boolean z = this.showTabbar;
        boolean z2 = this.hideFilters;
        String str = this.product;
        String str2 = this.headerStyle;
        String str3 = this.filtersStyle;
        String str4 = this.agreementId;
        StringBuilder u = qv10.u("TransactionsFeedAction(showTabbar=", ", hideFilters=", ", product=", z, z2);
        g8e.D(u, str, ", headerStyle=", str2, ", filtersStyle=");
        return g8e.r(u, str3, ", agreementId=", str4, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.showTabbar ? 1 : 0);
        dest.writeInt(this.hideFilters ? 1 : 0);
        dest.writeString(this.product);
        dest.writeString(this.headerStyle);
        dest.writeString(this.filtersStyle);
        dest.writeString(this.agreementId);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TransactionsFeedAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransactionsFeedAction createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
            return new TransactionsFeedAction(z2, parcel.readInt() == 0 ? z : true, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransactionsFeedAction[] newArray(int i) {
            return new TransactionsFeedAction[i];
        }
    }

    public TransactionsFeedAction() {
        this(false, false, null, null, null, null, 63, null);
    }

    public /* synthetic */ TransactionsFeedAction(boolean z, boolean z2, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4);
    }
}
