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
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0016J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJV\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0016J\u0010\u0010 \u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b \u0010\u0014J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b)\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b*\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b+\u0010\u0016R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010\u001cR \u0010/\u001a\u00020.8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b/\u00100\u0012\u0004\b3\u00104\u001a\u0004\b1\u00102¨\u00065"}, d2 = {"Lcom/ybsdk/deeplink/generated/TransferAction;", "Lcom/ybsdk/feature/deeplink/api/BaseDeeplinkAction;", "", "direction", "sourceAgreementId", "targetAgreementId", "scenario", "type", "", "amount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Ljava/lang/Double;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)Lcom/ybsdk/deeplink/generated/TransferAction;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDirection", "getSourceAgreementId", "getTargetAgreementId", "getScenario", "getType", "Ljava/lang/Double;", "getAmount", "Landroid/net/Uri;", "deeplinkUri", "Landroid/net/Uri;", "getDeeplinkUri", "()Landroid/net/Uri;", "getDeeplinkUri$annotations", "()V", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TransferAction implements BaseDeeplinkAction {
    public static final Parcelable.Creator<TransferAction> CREATOR = new Creator();
    private final Double amount;
    private final Uri deeplinkUri;
    private final String direction;
    private final String scenario;
    private final String sourceAgreementId;
    private final String targetAgreementId;
    private final String type;

    public TransferAction(String str, String str2, String str3, String str4, String str5, Double d) {
        this.direction = str;
        this.sourceAgreementId = str2;
        this.targetAgreementId = str3;
        this.scenario = str4;
        this.type = str5;
        this.amount = d;
        Uri.Builder j = ly3.j("ybapp", "screen.open", "/transfer", "direction", str);
        if (str2 != null) {
            j.appendQueryParameter("source_agreement_id", str2);
        }
        if (str3 != null) {
            j.appendQueryParameter("target_agreement_id", str3);
        }
        if (str4 != null) {
            j.appendQueryParameter("scenario", str4);
        }
        if (str5 != null) {
            j.appendQueryParameter("type", str5);
        }
        if (d != null) {
            j.appendQueryParameter("amount", String.valueOf(d.doubleValue()));
        }
        this.deeplinkUri = j.build();
    }

    public static /* synthetic */ TransferAction copy$default(TransferAction transferAction, String str, String str2, String str3, String str4, String str5, Double d, int i, Object obj) {
        if ((i & 1) != 0) {
            str = transferAction.direction;
        }
        if ((i & 2) != 0) {
            str2 = transferAction.sourceAgreementId;
        }
        if ((i & 4) != 0) {
            str3 = transferAction.targetAgreementId;
        }
        if ((i & 8) != 0) {
            str4 = transferAction.scenario;
        }
        if ((i & 16) != 0) {
            str5 = transferAction.type;
        }
        if ((i & 32) != 0) {
            d = transferAction.amount;
        }
        String str6 = str5;
        Double d2 = d;
        return transferAction.copy(str, str2, str3, str4, str6, d2);
    }

    public static /* synthetic */ void getDeeplinkUri$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getDirection() {
        return this.direction;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSourceAgreementId() {
        return this.sourceAgreementId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTargetAgreementId() {
        return this.targetAgreementId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getScenario() {
        return this.scenario;
    }

    /* renamed from: component5, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component6, reason: from getter */
    public final Double getAmount() {
        return this.amount;
    }

    public final TransferAction copy(String direction, String sourceAgreementId, String targetAgreementId, String scenario, String type, Double amount) {
        return new TransferAction(direction, sourceAgreementId, targetAgreementId, scenario, type, amount);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferAction)) {
            return false;
        }
        TransferAction transferAction = (TransferAction) other;
        return jl40.l(this.direction, transferAction.direction) && jl40.l(this.sourceAgreementId, transferAction.sourceAgreementId) && jl40.l(this.targetAgreementId, transferAction.targetAgreementId) && jl40.l(this.scenario, transferAction.scenario) && jl40.l(this.type, transferAction.type) && jl40.l(this.amount, transferAction.amount);
    }

    public final Double getAmount() {
        return this.amount;
    }

    @Override // com.ybsdk.feature.deeplink.api.BaseDeeplinkAction
    public Uri getDeeplinkUri() {
        return this.deeplinkUri;
    }

    public final String getDirection() {
        return this.direction;
    }

    public final String getScenario() {
        return this.scenario;
    }

    public final String getSourceAgreementId() {
        return this.sourceAgreementId;
    }

    public final String getTargetAgreementId() {
        return this.targetAgreementId;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = this.direction.hashCode() * 31;
        String str = this.sourceAgreementId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.targetAgreementId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.scenario;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.type;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Double d = this.amount;
        return hashCode5 + (d != null ? d.hashCode() : 0);
    }

    public String toString() {
        String str = this.direction;
        String str2 = this.sourceAgreementId;
        String str3 = this.targetAgreementId;
        String str4 = this.scenario;
        String str5 = this.type;
        Double d = this.amount;
        StringBuilder v = b64.v("TransferAction(direction=", str, ", sourceAgreementId=", str2, ", targetAgreementId=");
        g8e.D(v, str3, ", scenario=", str4, ", type=");
        v.append(str5);
        v.append(", amount=");
        v.append(d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.direction);
        dest.writeString(this.sourceAgreementId);
        dest.writeString(this.targetAgreementId);
        dest.writeString(this.scenario);
        dest.writeString(this.type);
        Double d = this.amount;
        if (d == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d.doubleValue());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TransferAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransferAction createFromParcel(Parcel parcel) {
            return new TransferAction(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransferAction[] newArray(int i) {
            return new TransferAction[i];
        }
    }

    public TransferAction() {
        this(null, null, null, null, null, null, 63, null);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ TransferAction(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.Double r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L6
            java.lang.String r2 = "transfer"
        L6:
            r9 = r8 & 2
            r0 = 0
            if (r9 == 0) goto Lc
            r3 = r0
        Lc:
            r9 = r8 & 4
            if (r9 == 0) goto L11
            r4 = r0
        L11:
            r9 = r8 & 8
            if (r9 == 0) goto L16
            r5 = r0
        L16:
            r9 = r8 & 16
            if (r9 == 0) goto L1b
            r6 = r0
        L1b:
            r8 = r8 & 32
            if (r8 == 0) goto L27
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L2e
        L27:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L2e:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ybsdk.deeplink.generated.TransferAction.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Double, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
