package com.ybsdk.deeplink.generated;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import defpackage.jl40;
import defpackage.nzs;
import defpackage.vfc;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J(\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u001a\u0010\u001b\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u0014R \u0010\"\u001a\u00020!8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%¨\u0006("}, d2 = {"Lcom/ybsdk/deeplink/generated/CreditLimitSettingsTermAction;", "Lcom/ybsdk/feature/deeplink/api/BaseDeeplinkAction;", "", "initialScreenId", "", "fitWindowTop", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;)Lcom/ybsdk/deeplink/generated/CreditLimitSettingsTermAction;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getInitialScreenId", "Ljava/lang/Boolean;", "getFitWindowTop", "Landroid/net/Uri;", "deeplinkUri", "Landroid/net/Uri;", "getDeeplinkUri", "()Landroid/net/Uri;", "getDeeplinkUri$annotations", "()V", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CreditLimitSettingsTermAction implements BaseDeeplinkAction {
    public static final Parcelable.Creator<CreditLimitSettingsTermAction> CREATOR = new Creator();
    private final Uri deeplinkUri;
    private final Boolean fitWindowTop;
    private final String initialScreenId;

    public CreditLimitSettingsTermAction(String str, Boolean bool) {
        this.initialScreenId = str;
        this.fitWindowTop = bool;
        Uri.Builder l = vfc.l("ybapp", "screen.open", "/credit_limit_settings_term");
        if (str != null) {
            l.appendQueryParameter("initial_screen_id", str);
        }
        if (bool != null) {
            l.appendQueryParameter("fit_window_top", String.valueOf(bool.booleanValue()));
        }
        this.deeplinkUri = l.build();
    }

    public static /* synthetic */ CreditLimitSettingsTermAction copy$default(CreditLimitSettingsTermAction creditLimitSettingsTermAction, String str, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = creditLimitSettingsTermAction.initialScreenId;
        }
        if ((i & 2) != 0) {
            bool = creditLimitSettingsTermAction.fitWindowTop;
        }
        return creditLimitSettingsTermAction.copy(str, bool);
    }

    public static /* synthetic */ void getDeeplinkUri$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getInitialScreenId() {
        return this.initialScreenId;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getFitWindowTop() {
        return this.fitWindowTop;
    }

    public final CreditLimitSettingsTermAction copy(String initialScreenId, Boolean fitWindowTop) {
        return new CreditLimitSettingsTermAction(initialScreenId, fitWindowTop);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreditLimitSettingsTermAction)) {
            return false;
        }
        CreditLimitSettingsTermAction creditLimitSettingsTermAction = (CreditLimitSettingsTermAction) other;
        return jl40.l(this.initialScreenId, creditLimitSettingsTermAction.initialScreenId) && jl40.l(this.fitWindowTop, creditLimitSettingsTermAction.fitWindowTop);
    }

    @Override // com.ybsdk.feature.deeplink.api.BaseDeeplinkAction
    public Uri getDeeplinkUri() {
        return this.deeplinkUri;
    }

    public final Boolean getFitWindowTop() {
        return this.fitWindowTop;
    }

    public final String getInitialScreenId() {
        return this.initialScreenId;
    }

    public int hashCode() {
        String str = this.initialScreenId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.fitWindowTop;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "CreditLimitSettingsTermAction(initialScreenId=" + this.initialScreenId + ", fitWindowTop=" + this.fitWindowTop + Extension.C_BRAKE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.initialScreenId);
        Boolean bool = this.fitWindowTop;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            nzs.k(dest, 1, bool);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CreditLimitSettingsTermAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreditLimitSettingsTermAction createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CreditLimitSettingsTermAction(readString, valueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreditLimitSettingsTermAction[] newArray(int i) {
            return new CreditLimitSettingsTermAction[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CreditLimitSettingsTermAction() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ CreditLimitSettingsTermAction(String str, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool);
    }
}
