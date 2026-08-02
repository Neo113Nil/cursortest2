package com.ybsdk.deeplink.generated;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.oyr;
import defpackage.vfc;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J2\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0011J\u001a\u0010\u001d\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b\u0003\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b\"\u0010\u0015R \u0010$\u001a\u00020#8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b(\u0010)\u001a\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lcom/ybsdk/deeplink/generated/OpenEsiaIdentificationAction;", "Lcom/ybsdk/feature/deeplink/api/BaseDeeplinkAction;", "", "isCredit", "", "esiaStart", "applicationId", "<init>", "(ZLjava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "copy", "(ZLjava/lang/String;Ljava/lang/String;)Lcom/ybsdk/deeplink/generated/OpenEsiaIdentificationAction;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "Ljava/lang/String;", "getEsiaStart", "getApplicationId", "Landroid/net/Uri;", "deeplinkUri", "Landroid/net/Uri;", "getDeeplinkUri", "()Landroid/net/Uri;", "getDeeplinkUri$annotations", "()V", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OpenEsiaIdentificationAction implements BaseDeeplinkAction {
    public static final Parcelable.Creator<OpenEsiaIdentificationAction> CREATOR = new Creator();
    private final String applicationId;
    private final Uri deeplinkUri;
    private final String esiaStart;
    private final boolean isCredit;

    public OpenEsiaIdentificationAction(boolean z, String str, String str2) {
        this.isCredit = z;
        this.esiaStart = str;
        this.applicationId = str2;
        Uri.Builder l = vfc.l("ybapp", "screen.open", "/open_esia_identification");
        l.appendQueryParameter("isCredit", String.valueOf(z));
        if (str != null) {
            l.appendQueryParameter("esiaStart", str);
        }
        if (str2 != null) {
            l.appendQueryParameter("application_id", str2);
        }
        this.deeplinkUri = l.build();
    }

    public static /* synthetic */ OpenEsiaIdentificationAction copy$default(OpenEsiaIdentificationAction openEsiaIdentificationAction, boolean z, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = openEsiaIdentificationAction.isCredit;
        }
        if ((i & 2) != 0) {
            str = openEsiaIdentificationAction.esiaStart;
        }
        if ((i & 4) != 0) {
            str2 = openEsiaIdentificationAction.applicationId;
        }
        return openEsiaIdentificationAction.copy(z, str, str2);
    }

    public static /* synthetic */ void getDeeplinkUri$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsCredit() {
        return this.isCredit;
    }

    /* renamed from: component2, reason: from getter */
    public final String getEsiaStart() {
        return this.esiaStart;
    }

    /* renamed from: component3, reason: from getter */
    public final String getApplicationId() {
        return this.applicationId;
    }

    public final OpenEsiaIdentificationAction copy(boolean isCredit, String esiaStart, String applicationId) {
        return new OpenEsiaIdentificationAction(isCredit, esiaStart, applicationId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpenEsiaIdentificationAction)) {
            return false;
        }
        OpenEsiaIdentificationAction openEsiaIdentificationAction = (OpenEsiaIdentificationAction) other;
        return this.isCredit == openEsiaIdentificationAction.isCredit && jl40.l(this.esiaStart, openEsiaIdentificationAction.esiaStart) && jl40.l(this.applicationId, openEsiaIdentificationAction.applicationId);
    }

    public final String getApplicationId() {
        return this.applicationId;
    }

    @Override // com.ybsdk.feature.deeplink.api.BaseDeeplinkAction
    public Uri getDeeplinkUri() {
        return this.deeplinkUri;
    }

    public final String getEsiaStart() {
        return this.esiaStart;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.isCredit) * 31;
        String str = this.esiaStart;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.applicationId;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean isCredit() {
        return this.isCredit;
    }

    public String toString() {
        boolean z = this.isCredit;
        String str = this.esiaStart;
        return oyr.t(ly3.v("OpenEsiaIdentificationAction(isCredit=", ", esiaStart=", str, ", applicationId=", z), this.applicationId, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.isCredit ? 1 : 0);
        dest.writeString(this.esiaStart);
        dest.writeString(this.applicationId);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OpenEsiaIdentificationAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OpenEsiaIdentificationAction createFromParcel(Parcel parcel) {
            return new OpenEsiaIdentificationAction(parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OpenEsiaIdentificationAction[] newArray(int i) {
            return new OpenEsiaIdentificationAction[i];
        }
    }

    public OpenEsiaIdentificationAction() {
        this(false, null, null, 7, null);
    }

    public /* synthetic */ OpenEsiaIdentificationAction(boolean z, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
