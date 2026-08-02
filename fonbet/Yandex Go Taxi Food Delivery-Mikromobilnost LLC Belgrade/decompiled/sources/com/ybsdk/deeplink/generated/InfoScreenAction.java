package com.ybsdk.deeplink.generated;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.oo31;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0016J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0016J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0016JR\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0016J\u0010\u0010 \u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b \u0010\u0014J\u001a\u0010#\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b)\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b*\u0010\u0016R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b+\u0010\u0016R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b,\u0010\u0016R \u0010.\u001a\u00020-8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b.\u0010/\u0012\u0004\b2\u00103\u001a\u0004\b0\u00101¨\u00064"}, d2 = {"Lcom/ybsdk/deeplink/generated/InfoScreenAction;", "Lcom/ybsdk/feature/deeplink/api/BaseDeeplinkAction;", "", "target", "", "showBack", "showCloseButton", "agreementId", "progress", "startStoryId", "<init>", "(Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/deeplink/generated/InfoScreenAction;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTarget", "Z", "getShowBack", "getShowCloseButton", "getAgreementId", "getProgress", "getStartStoryId", "Landroid/net/Uri;", "deeplinkUri", "Landroid/net/Uri;", "getDeeplinkUri", "()Landroid/net/Uri;", "getDeeplinkUri$annotations", "()V", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InfoScreenAction implements BaseDeeplinkAction {
    public static final Parcelable.Creator<InfoScreenAction> CREATOR = new Creator();
    private final String agreementId;
    private final Uri deeplinkUri;
    private final String progress;
    private final boolean showBack;
    private final boolean showCloseButton;
    private final String startStoryId;
    private final String target;

    public InfoScreenAction(String str, boolean z, boolean z2, String str2, String str3, String str4) {
        this.target = str;
        this.showBack = z;
        this.showCloseButton = z2;
        this.agreementId = str2;
        this.progress = str3;
        this.startStoryId = str4;
        Uri.Builder j = ly3.j("ybapp", "screen.open", "/info_screen", "target", str);
        j.appendQueryParameter("show_back", String.valueOf(z));
        j.appendQueryParameter("show_close_button", String.valueOf(z2));
        if (str2 != null) {
            j.appendQueryParameter("agreement_id", str2);
        }
        if (str3 != null) {
            j.appendQueryParameter("progress", str3);
        }
        if (str4 != null) {
            j.appendQueryParameter("start_story_id", str4);
        }
        this.deeplinkUri = j.build();
    }

    public static /* synthetic */ InfoScreenAction copy$default(InfoScreenAction infoScreenAction, String str, boolean z, boolean z2, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = infoScreenAction.target;
        }
        if ((i & 2) != 0) {
            z = infoScreenAction.showBack;
        }
        if ((i & 4) != 0) {
            z2 = infoScreenAction.showCloseButton;
        }
        if ((i & 8) != 0) {
            str2 = infoScreenAction.agreementId;
        }
        if ((i & 16) != 0) {
            str3 = infoScreenAction.progress;
        }
        if ((i & 32) != 0) {
            str4 = infoScreenAction.startStoryId;
        }
        String str5 = str3;
        String str6 = str4;
        return infoScreenAction.copy(str, z, z2, str2, str5, str6);
    }

    public static /* synthetic */ void getDeeplinkUri$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getTarget() {
        return this.target;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowBack() {
        return this.showBack;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShowCloseButton() {
        return this.showCloseButton;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getProgress() {
        return this.progress;
    }

    /* renamed from: component6, reason: from getter */
    public final String getStartStoryId() {
        return this.startStoryId;
    }

    public final InfoScreenAction copy(String target, boolean showBack, boolean showCloseButton, String agreementId, String progress, String startStoryId) {
        return new InfoScreenAction(target, showBack, showCloseButton, agreementId, progress, startStoryId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InfoScreenAction)) {
            return false;
        }
        InfoScreenAction infoScreenAction = (InfoScreenAction) other;
        return jl40.l(this.target, infoScreenAction.target) && this.showBack == infoScreenAction.showBack && this.showCloseButton == infoScreenAction.showCloseButton && jl40.l(this.agreementId, infoScreenAction.agreementId) && jl40.l(this.progress, infoScreenAction.progress) && jl40.l(this.startStoryId, infoScreenAction.startStoryId);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    @Override // com.ybsdk.feature.deeplink.api.BaseDeeplinkAction
    public Uri getDeeplinkUri() {
        return this.deeplinkUri;
    }

    public final String getProgress() {
        return this.progress;
    }

    public final boolean getShowBack() {
        return this.showBack;
    }

    public final boolean getShowCloseButton() {
        return this.showCloseButton;
    }

    public final String getStartStoryId() {
        return this.startStoryId;
    }

    public final String getTarget() {
        return this.target;
    }

    public int hashCode() {
        int e = unr0.e(unr0.e(this.target.hashCode() * 31, 31, this.showBack), 31, this.showCloseButton);
        String str = this.agreementId;
        int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.progress;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.startStoryId;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.target;
        boolean z = this.showBack;
        boolean z2 = this.showCloseButton;
        String str2 = this.agreementId;
        String str3 = this.progress;
        String str4 = this.startStoryId;
        StringBuilder l = oo31.l("InfoScreenAction(target=", str, ", showBack=", ", showCloseButton=", z);
        unr0.A(", agreementId=", str2, ", progress=", l, z2);
        return g8e.r(l, str3, ", startStoryId=", str4, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.target);
        dest.writeInt(this.showBack ? 1 : 0);
        dest.writeInt(this.showCloseButton ? 1 : 0);
        dest.writeString(this.agreementId);
        dest.writeString(this.progress);
        dest.writeString(this.startStoryId);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<InfoScreenAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InfoScreenAction createFromParcel(Parcel parcel) {
            boolean z;
            String readString = parcel.readString();
            boolean z2 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
            return new InfoScreenAction(readString, z2, parcel.readInt() == 0 ? z : true, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InfoScreenAction[] newArray(int i) {
            return new InfoScreenAction[i];
        }
    }

    public /* synthetic */ InfoScreenAction(String str, boolean z, boolean z2, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? true : z2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4);
    }
}
