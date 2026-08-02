package com.ybsdk.deeplink.generated;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.ly3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0015J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0015JV\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0015J\u0010\u0010\u001e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0013J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b'\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b(\u0010\u0015R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b)\u0010\u0015R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b*\u0010\u0015R \u0010,\u001a\u00020+8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b,\u0010-\u0012\u0004\b0\u00101\u001a\u0004\b.\u0010/¨\u00062"}, d2 = {"Lcom/ybsdk/deeplink/generated/QrCreditLimitTermAction;", "Lcom/ybsdk/feature/deeplink/api/BaseDeeplinkAction;", "", "selectTermId", "headerTitle", "headerSubtitle", "footerTodayPayment", "footerPlanPayment", "actionTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/deeplink/generated/QrCreditLimitTermAction;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSelectTermId", "getHeaderTitle", "getHeaderSubtitle", "getFooterTodayPayment", "getFooterPlanPayment", "getActionTitle", "Landroid/net/Uri;", "deeplinkUri", "Landroid/net/Uri;", "getDeeplinkUri", "()Landroid/net/Uri;", "getDeeplinkUri$annotations", "()V", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class QrCreditLimitTermAction implements BaseDeeplinkAction {
    public static final Parcelable.Creator<QrCreditLimitTermAction> CREATOR = new Creator();
    private final String actionTitle;
    private final Uri deeplinkUri;
    private final String footerPlanPayment;
    private final String footerTodayPayment;
    private final String headerSubtitle;
    private final String headerTitle;
    private final String selectTermId;

    public QrCreditLimitTermAction(String str, String str2, String str3, String str4, String str5, String str6) {
        this.selectTermId = str;
        this.headerTitle = str2;
        this.headerSubtitle = str3;
        this.footerTodayPayment = str4;
        this.footerPlanPayment = str5;
        this.actionTitle = str6;
        Uri.Builder j = ly3.j("ybapp", "screen.open", "/qr_credit_limit_term", "select_term_id", str);
        if (str2 != null) {
            j.appendQueryParameter("header_title", str2);
        }
        if (str3 != null) {
            j.appendQueryParameter("header_subtitle", str3);
        }
        if (str4 != null) {
            j.appendQueryParameter("footer_today_payment", str4);
        }
        if (str5 != null) {
            j.appendQueryParameter("footer_plan_payment", str5);
        }
        if (str6 != null) {
            j.appendQueryParameter("action_title", str6);
        }
        this.deeplinkUri = j.build();
    }

    public static /* synthetic */ QrCreditLimitTermAction copy$default(QrCreditLimitTermAction qrCreditLimitTermAction, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = qrCreditLimitTermAction.selectTermId;
        }
        if ((i & 2) != 0) {
            str2 = qrCreditLimitTermAction.headerTitle;
        }
        if ((i & 4) != 0) {
            str3 = qrCreditLimitTermAction.headerSubtitle;
        }
        if ((i & 8) != 0) {
            str4 = qrCreditLimitTermAction.footerTodayPayment;
        }
        if ((i & 16) != 0) {
            str5 = qrCreditLimitTermAction.footerPlanPayment;
        }
        if ((i & 32) != 0) {
            str6 = qrCreditLimitTermAction.actionTitle;
        }
        String str7 = str5;
        String str8 = str6;
        return qrCreditLimitTermAction.copy(str, str2, str3, str4, str7, str8);
    }

    public static /* synthetic */ void getDeeplinkUri$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getSelectTermId() {
        return this.selectTermId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getHeaderTitle() {
        return this.headerTitle;
    }

    /* renamed from: component3, reason: from getter */
    public final String getHeaderSubtitle() {
        return this.headerSubtitle;
    }

    /* renamed from: component4, reason: from getter */
    public final String getFooterTodayPayment() {
        return this.footerTodayPayment;
    }

    /* renamed from: component5, reason: from getter */
    public final String getFooterPlanPayment() {
        return this.footerPlanPayment;
    }

    /* renamed from: component6, reason: from getter */
    public final String getActionTitle() {
        return this.actionTitle;
    }

    public final QrCreditLimitTermAction copy(String selectTermId, String headerTitle, String headerSubtitle, String footerTodayPayment, String footerPlanPayment, String actionTitle) {
        return new QrCreditLimitTermAction(selectTermId, headerTitle, headerSubtitle, footerTodayPayment, footerPlanPayment, actionTitle);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QrCreditLimitTermAction)) {
            return false;
        }
        QrCreditLimitTermAction qrCreditLimitTermAction = (QrCreditLimitTermAction) other;
        return jl40.l(this.selectTermId, qrCreditLimitTermAction.selectTermId) && jl40.l(this.headerTitle, qrCreditLimitTermAction.headerTitle) && jl40.l(this.headerSubtitle, qrCreditLimitTermAction.headerSubtitle) && jl40.l(this.footerTodayPayment, qrCreditLimitTermAction.footerTodayPayment) && jl40.l(this.footerPlanPayment, qrCreditLimitTermAction.footerPlanPayment) && jl40.l(this.actionTitle, qrCreditLimitTermAction.actionTitle);
    }

    public final String getActionTitle() {
        return this.actionTitle;
    }

    @Override // com.ybsdk.feature.deeplink.api.BaseDeeplinkAction
    public Uri getDeeplinkUri() {
        return this.deeplinkUri;
    }

    public final String getFooterPlanPayment() {
        return this.footerPlanPayment;
    }

    public final String getFooterTodayPayment() {
        return this.footerTodayPayment;
    }

    public final String getHeaderSubtitle() {
        return this.headerSubtitle;
    }

    public final String getHeaderTitle() {
        return this.headerTitle;
    }

    public final String getSelectTermId() {
        return this.selectTermId;
    }

    public int hashCode() {
        int hashCode = this.selectTermId.hashCode() * 31;
        String str = this.headerTitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.headerSubtitle;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.footerTodayPayment;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.footerPlanPayment;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.actionTitle;
        return hashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        String str = this.selectTermId;
        String str2 = this.headerTitle;
        String str3 = this.headerSubtitle;
        String str4 = this.footerTodayPayment;
        String str5 = this.footerPlanPayment;
        String str6 = this.actionTitle;
        StringBuilder v = b64.v("QrCreditLimitTermAction(selectTermId=", str, ", headerTitle=", str2, ", headerSubtitle=");
        g8e.D(v, str3, ", footerTodayPayment=", str4, ", footerPlanPayment=");
        return g8e.r(v, str5, ", actionTitle=", str6, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.selectTermId);
        dest.writeString(this.headerTitle);
        dest.writeString(this.headerSubtitle);
        dest.writeString(this.footerTodayPayment);
        dest.writeString(this.footerPlanPayment);
        dest.writeString(this.actionTitle);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<QrCreditLimitTermAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QrCreditLimitTermAction createFromParcel(Parcel parcel) {
            return new QrCreditLimitTermAction(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QrCreditLimitTermAction[] newArray(int i) {
            return new QrCreditLimitTermAction[i];
        }
    }

    public /* synthetic */ QrCreditLimitTermAction(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }
}
