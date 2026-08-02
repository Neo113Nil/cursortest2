package com.ybsdk.deeplink.generated;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.vfc;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0017J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0017Jd\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0017J\u0010\u0010\"\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\"\u0010\u0015J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b+\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b.\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b/\u0010\u0017R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b0\u0010\u0017R \u00102\u001a\u0002018\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b2\u00103\u0012\u0004\b6\u00107\u001a\u0004\b4\u00105¨\u00068"}, d2 = {"Lcom/ybsdk/deeplink/generated/AutoTopupAction;", "Lcom/ybsdk/feature/deeplink/api/BaseDeeplinkAction;", "", "autoTopupId", "agreementId", "type", "", "amount", "threshold", "source", "only", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/lang/Double;", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/deeplink/generated/AutoTopupAction;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAutoTopupId", "getAgreementId", "getType", "Ljava/lang/Double;", "getAmount", "getThreshold", "getSource", "getOnly", "Landroid/net/Uri;", "deeplinkUri", "Landroid/net/Uri;", "getDeeplinkUri", "()Landroid/net/Uri;", "getDeeplinkUri$annotations", "()V", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AutoTopupAction implements BaseDeeplinkAction {
    public static final Parcelable.Creator<AutoTopupAction> CREATOR = new Creator();
    private final String agreementId;
    private final Double amount;
    private final String autoTopupId;
    private final Uri deeplinkUri;
    private final String only;
    private final String source;
    private final Double threshold;
    private final String type;

    public AutoTopupAction(String str, String str2, String str3, Double d, Double d2, String str4, String str5) {
        this.autoTopupId = str;
        this.agreementId = str2;
        this.type = str3;
        this.amount = d;
        this.threshold = d2;
        this.source = str4;
        this.only = str5;
        Uri.Builder l = vfc.l("ybapp", "screen.open", "/auto_topup");
        if (str != null) {
            l.appendQueryParameter("auto_topup_id", str);
        }
        if (str2 != null) {
            l.appendQueryParameter("agreement_id", str2);
        }
        if (str3 != null) {
            l.appendQueryParameter("type", str3);
        }
        if (d != null) {
            l.appendQueryParameter("amount", String.valueOf(d.doubleValue()));
        }
        if (d2 != null) {
            l.appendQueryParameter("threshold", String.valueOf(d2.doubleValue()));
        }
        if (str4 != null) {
            l.appendQueryParameter("source", str4);
        }
        if (str5 != null) {
            l.appendQueryParameter("only", str5);
        }
        this.deeplinkUri = l.build();
    }

    public static /* synthetic */ AutoTopupAction copy$default(AutoTopupAction autoTopupAction, String str, String str2, String str3, Double d, Double d2, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = autoTopupAction.autoTopupId;
        }
        if ((i & 2) != 0) {
            str2 = autoTopupAction.agreementId;
        }
        if ((i & 4) != 0) {
            str3 = autoTopupAction.type;
        }
        if ((i & 8) != 0) {
            d = autoTopupAction.amount;
        }
        if ((i & 16) != 0) {
            d2 = autoTopupAction.threshold;
        }
        if ((i & 32) != 0) {
            str4 = autoTopupAction.source;
        }
        if ((i & 64) != 0) {
            str5 = autoTopupAction.only;
        }
        String str6 = str4;
        String str7 = str5;
        Double d3 = d2;
        String str8 = str3;
        return autoTopupAction.copy(str, str2, str8, d, d3, str6, str7);
    }

    public static /* synthetic */ void getDeeplinkUri$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getAutoTopupId() {
        return this.autoTopupId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component4, reason: from getter */
    public final Double getAmount() {
        return this.amount;
    }

    /* renamed from: component5, reason: from getter */
    public final Double getThreshold() {
        return this.threshold;
    }

    /* renamed from: component6, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: component7, reason: from getter */
    public final String getOnly() {
        return this.only;
    }

    public final AutoTopupAction copy(String autoTopupId, String agreementId, String type, Double amount, Double threshold, String source, String only) {
        return new AutoTopupAction(autoTopupId, agreementId, type, amount, threshold, source, only);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoTopupAction)) {
            return false;
        }
        AutoTopupAction autoTopupAction = (AutoTopupAction) other;
        return jl40.l(this.autoTopupId, autoTopupAction.autoTopupId) && jl40.l(this.agreementId, autoTopupAction.agreementId) && jl40.l(this.type, autoTopupAction.type) && jl40.l(this.amount, autoTopupAction.amount) && jl40.l(this.threshold, autoTopupAction.threshold) && jl40.l(this.source, autoTopupAction.source) && jl40.l(this.only, autoTopupAction.only);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final Double getAmount() {
        return this.amount;
    }

    public final String getAutoTopupId() {
        return this.autoTopupId;
    }

    @Override // com.ybsdk.feature.deeplink.api.BaseDeeplinkAction
    public Uri getDeeplinkUri() {
        return this.deeplinkUri;
    }

    public final String getOnly() {
        return this.only;
    }

    public final String getSource() {
        return this.source;
    }

    public final Double getThreshold() {
        return this.threshold;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.autoTopupId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.agreementId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.type;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d = this.amount;
        int hashCode4 = (hashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.threshold;
        int hashCode5 = (hashCode4 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str4 = this.source;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.only;
        return hashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        String str = this.autoTopupId;
        String str2 = this.agreementId;
        String str3 = this.type;
        Double d = this.amount;
        Double d2 = this.threshold;
        String str4 = this.source;
        String str5 = this.only;
        StringBuilder v = b64.v("AutoTopupAction(autoTopupId=", str, ", agreementId=", str2, ", type=");
        v.append(str3);
        v.append(", amount=");
        v.append(d);
        v.append(", threshold=");
        v.append(d2);
        v.append(", source=");
        v.append(str4);
        v.append(", only=");
        return oyr.t(v, str5, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.autoTopupId);
        dest.writeString(this.agreementId);
        dest.writeString(this.type);
        Double d = this.amount;
        if (d == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d.doubleValue());
        }
        Double d2 = this.threshold;
        if (d2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d2.doubleValue());
        }
        dest.writeString(this.source);
        dest.writeString(this.only);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AutoTopupAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AutoTopupAction createFromParcel(Parcel parcel) {
            return new AutoTopupAction(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null, parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AutoTopupAction[] newArray(int i) {
            return new AutoTopupAction[i];
        }
    }

    public AutoTopupAction() {
        this(null, null, null, null, null, null, null, HProv.PP_VERSION_TIMESTAMP, null);
    }

    public /* synthetic */ AutoTopupAction(String str, String str2, String str3, Double d, Double d2, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : d, (i & 16) != 0 ? null : d2, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5);
    }
}
