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

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J4\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\u0012R \u0010#\u001a\u00020\"8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b#\u0010$\u0012\u0004\b'\u0010(\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lcom/ybsdk/deeplink/generated/ResultSelectedTermAction;", "Lcom/ybsdk/feature/deeplink/api/BaseDeeplinkAction;", "", "selectTermId", "resultText", "termsToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/deeplink/generated/ResultSelectedTermAction;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSelectTermId", "getResultText", "getTermsToken", "Landroid/net/Uri;", "deeplinkUri", "Landroid/net/Uri;", "getDeeplinkUri", "()Landroid/net/Uri;", "getDeeplinkUri$annotations", "()V", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ResultSelectedTermAction implements BaseDeeplinkAction {
    public static final Parcelable.Creator<ResultSelectedTermAction> CREATOR = new Creator();
    private final Uri deeplinkUri;
    private final String resultText;
    private final String selectTermId;
    private final String termsToken;

    public ResultSelectedTermAction(String str, String str2, String str3) {
        this.selectTermId = str;
        this.resultText = str2;
        this.termsToken = str3;
        Uri.Builder l = vfc.l("ybapp", "screen.open", "/result_selected_term");
        if (str != null) {
            l.appendQueryParameter("select_term_id", str);
        }
        if (str2 != null) {
            l.appendQueryParameter("result_text", str2);
        }
        if (str3 != null) {
            l.appendQueryParameter("terms_token", str3);
        }
        this.deeplinkUri = l.build();
    }

    public static /* synthetic */ ResultSelectedTermAction copy$default(ResultSelectedTermAction resultSelectedTermAction, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = resultSelectedTermAction.selectTermId;
        }
        if ((i & 2) != 0) {
            str2 = resultSelectedTermAction.resultText;
        }
        if ((i & 4) != 0) {
            str3 = resultSelectedTermAction.termsToken;
        }
        return resultSelectedTermAction.copy(str, str2, str3);
    }

    public static /* synthetic */ void getDeeplinkUri$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getSelectTermId() {
        return this.selectTermId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getResultText() {
        return this.resultText;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTermsToken() {
        return this.termsToken;
    }

    public final ResultSelectedTermAction copy(String selectTermId, String resultText, String termsToken) {
        return new ResultSelectedTermAction(selectTermId, resultText, termsToken);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResultSelectedTermAction)) {
            return false;
        }
        ResultSelectedTermAction resultSelectedTermAction = (ResultSelectedTermAction) other;
        return jl40.l(this.selectTermId, resultSelectedTermAction.selectTermId) && jl40.l(this.resultText, resultSelectedTermAction.resultText) && jl40.l(this.termsToken, resultSelectedTermAction.termsToken);
    }

    @Override // com.ybsdk.feature.deeplink.api.BaseDeeplinkAction
    public Uri getDeeplinkUri() {
        return this.deeplinkUri;
    }

    public final String getResultText() {
        return this.resultText;
    }

    public final String getSelectTermId() {
        return this.selectTermId;
    }

    public final String getTermsToken() {
        return this.termsToken;
    }

    public int hashCode() {
        String str = this.selectTermId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.resultText;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.termsToken;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.selectTermId;
        String str2 = this.resultText;
        return oyr.t(b64.v("ResultSelectedTermAction(selectTermId=", str, ", resultText=", str2, ", termsToken="), this.termsToken, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.selectTermId);
        dest.writeString(this.resultText);
        dest.writeString(this.termsToken);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ResultSelectedTermAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ResultSelectedTermAction createFromParcel(Parcel parcel) {
            return new ResultSelectedTermAction(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ResultSelectedTermAction[] newArray(int i) {
            return new ResultSelectedTermAction[i];
        }
    }

    public ResultSelectedTermAction() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ ResultSelectedTermAction(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
