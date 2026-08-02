package com.ybsdk.deeplink.generated;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.vfc;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J(\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000fJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\u0011R \u0010 \u001a\u00020\u001f8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b \u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lcom/ybsdk/deeplink/generated/UserCardsAction;", "Lcom/ybsdk/feature/deeplink/api/BaseDeeplinkAction;", "", "snackbarTitle", "snackbarSubtitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/deeplink/generated/UserCardsAction;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSnackbarTitle", "getSnackbarSubtitle", "Landroid/net/Uri;", "deeplinkUri", "Landroid/net/Uri;", "getDeeplinkUri", "()Landroid/net/Uri;", "getDeeplinkUri$annotations", "()V", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class UserCardsAction implements BaseDeeplinkAction {
    public static final Parcelable.Creator<UserCardsAction> CREATOR = new Creator();
    private final Uri deeplinkUri;
    private final String snackbarSubtitle;
    private final String snackbarTitle;

    public UserCardsAction(String str, String str2) {
        this.snackbarTitle = str;
        this.snackbarSubtitle = str2;
        Uri.Builder l = vfc.l("ybapp", "screen.open", "/user_cards");
        if (str != null) {
            l.appendQueryParameter("snackbar_title", str);
        }
        if (str2 != null) {
            l.appendQueryParameter("snackbar_subtitle", str2);
        }
        this.deeplinkUri = l.build();
    }

    public static /* synthetic */ UserCardsAction copy$default(UserCardsAction userCardsAction, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userCardsAction.snackbarTitle;
        }
        if ((i & 2) != 0) {
            str2 = userCardsAction.snackbarSubtitle;
        }
        return userCardsAction.copy(str, str2);
    }

    public static /* synthetic */ void getDeeplinkUri$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getSnackbarTitle() {
        return this.snackbarTitle;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSnackbarSubtitle() {
        return this.snackbarSubtitle;
    }

    public final UserCardsAction copy(String snackbarTitle, String snackbarSubtitle) {
        return new UserCardsAction(snackbarTitle, snackbarSubtitle);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserCardsAction)) {
            return false;
        }
        UserCardsAction userCardsAction = (UserCardsAction) other;
        return jl40.l(this.snackbarTitle, userCardsAction.snackbarTitle) && jl40.l(this.snackbarSubtitle, userCardsAction.snackbarSubtitle);
    }

    @Override // com.ybsdk.feature.deeplink.api.BaseDeeplinkAction
    public Uri getDeeplinkUri() {
        return this.deeplinkUri;
    }

    public final String getSnackbarSubtitle() {
        return this.snackbarSubtitle;
    }

    public final String getSnackbarTitle() {
        return this.snackbarTitle;
    }

    public int hashCode() {
        String str = this.snackbarTitle;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.snackbarSubtitle;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return unr0.p("UserCardsAction(snackbarTitle=", this.snackbarTitle, ", snackbarSubtitle=", this.snackbarSubtitle, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.snackbarTitle);
        dest.writeString(this.snackbarSubtitle);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UserCardsAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserCardsAction createFromParcel(Parcel parcel) {
            return new UserCardsAction(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserCardsAction[] newArray(int i) {
            return new UserCardsAction[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserCardsAction() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ UserCardsAction(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
