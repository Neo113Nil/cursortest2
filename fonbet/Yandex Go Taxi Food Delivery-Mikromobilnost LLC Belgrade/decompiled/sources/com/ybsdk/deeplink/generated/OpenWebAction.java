package com.ybsdk.deeplink.generated;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.design.theme.ThemedParams;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.nzs;
import defpackage.oo31;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001:\u0001KB\u0089\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0018\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b'\u0010$J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001dJ\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u001dJ\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\u001dJ\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\u001dJ\u0094\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b.\u0010\u001dJ\u0010\u0010/\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b/\u0010\u001bJ\u001a\u00102\u001a\u00020\u00042\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b7\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b8\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b:\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010;\u001a\u0004\b<\u0010$R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010=\u001a\u0004\b>\u0010&R\u0019\u0010\f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\f\u0010;\u001a\u0004\b?\u0010$R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u00104\u001a\u0004\b@\u0010\u001dR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00104\u001a\u0004\bA\u0010\u001dR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u00104\u001a\u0004\bB\u0010\u001dR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u00104\u001a\u0004\bC\u0010\u001dR \u0010E\u001a\u00020D8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bE\u0010F\u0012\u0004\bI\u0010J\u001a\u0004\bG\u0010H¨\u0006L"}, d2 = {"Lcom/ybsdk/deeplink/generated/OpenWebAction;", "Lcom/ybsdk/feature/deeplink/api/BaseDeeplinkAction;", "", "url", "", "openKeyboard", "showNavbar", "fitWindowTop", "Lcom/ybsdk/core/utils/ColorModel;", "headerColor", "Lcom/ybsdk/core/design/theme/ThemedParams;", "statusbarStyle", "controlColor", "control", "title", "auth", "addSvcRetpath", "<init>", "(Ljava/lang/String;ZZLjava/lang/Boolean;Lcom/ybsdk/core/utils/ColorModel;Lcom/ybsdk/core/design/theme/ThemedParams;Lcom/ybsdk/core/utils/ColorModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "()Ljava/lang/Boolean;", "component5", "()Lcom/ybsdk/core/utils/ColorModel;", "component6", "()Lcom/ybsdk/core/design/theme/ThemedParams;", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;ZZLjava/lang/Boolean;Lcom/ybsdk/core/utils/ColorModel;Lcom/ybsdk/core/design/theme/ThemedParams;Lcom/ybsdk/core/utils/ColorModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/deeplink/generated/OpenWebAction;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "Z", "getOpenKeyboard", "getShowNavbar", "Ljava/lang/Boolean;", "getFitWindowTop", "Lcom/ybsdk/core/utils/ColorModel;", "getHeaderColor", "Lcom/ybsdk/core/design/theme/ThemedParams;", "getStatusbarStyle", "getControlColor", "getControl", "getTitle", "getAuth", "getAddSvcRetpath", "Landroid/net/Uri;", "deeplinkUri", "Landroid/net/Uri;", "getDeeplinkUri", "()Landroid/net/Uri;", "getDeeplinkUri$annotations", "()V", "uub1", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OpenWebAction implements BaseDeeplinkAction {
    public static final Parcelable.Creator<OpenWebAction> CREATOR = new Creator();
    private final String addSvcRetpath;
    private final String auth;
    private final String control;
    private final ColorModel controlColor;
    private final Uri deeplinkUri;
    private final Boolean fitWindowTop;
    private final ColorModel headerColor;
    private final boolean openKeyboard;
    private final boolean showNavbar;
    private final ThemedParams<String> statusbarStyle;
    private final String title;
    private final String url;

    public OpenWebAction(String str, boolean z, boolean z2, Boolean bool, ColorModel colorModel, ThemedParams<String> themedParams, ColorModel colorModel2, String str2, String str3, String str4, String str5) {
        this.url = str;
        this.openKeyboard = z;
        this.showNavbar = z2;
        this.fitWindowTop = bool;
        this.headerColor = colorModel;
        this.statusbarStyle = themedParams;
        this.controlColor = colorModel2;
        this.control = str2;
        this.title = str3;
        this.auth = str4;
        this.addSvcRetpath = str5;
        Uri.Builder j = ly3.j("ybapp", "screen.open", "/open_web", "url", str);
        j.appendQueryParameter("open_keyboard", String.valueOf(z));
        j.appendQueryParameter("show_navbar", String.valueOf(z2));
        if (bool != null) {
            j.appendQueryParameter("fit_window_top", String.valueOf(bool.booleanValue()));
        }
        if (themedParams != null) {
            String light = themedParams.getLight();
            j.appendQueryParameter("statusbar_style", light == null ? "" : light);
            String dark = themedParams.getDark();
            if (dark != null) {
                j.appendQueryParameter("statusbar_style_dark", dark);
            }
        }
        if (str2 != null) {
            j.appendQueryParameter("control", str2);
        }
        if (str3 != null) {
            j.appendQueryParameter("title", str3);
        }
        if (str4 != null) {
            j.appendQueryParameter("auth", str4);
        }
        if (str5 != null) {
            j.appendQueryParameter("add_svc_retpath", str5);
        }
        this.deeplinkUri = j.build();
    }

    public static /* synthetic */ OpenWebAction copy$default(OpenWebAction openWebAction, String str, boolean z, boolean z2, Boolean bool, ColorModel colorModel, ThemedParams themedParams, ColorModel colorModel2, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = openWebAction.url;
        }
        if ((i & 2) != 0) {
            z = openWebAction.openKeyboard;
        }
        if ((i & 4) != 0) {
            z2 = openWebAction.showNavbar;
        }
        if ((i & 8) != 0) {
            bool = openWebAction.fitWindowTop;
        }
        if ((i & 16) != 0) {
            colorModel = openWebAction.headerColor;
        }
        if ((i & 32) != 0) {
            themedParams = openWebAction.statusbarStyle;
        }
        if ((i & 64) != 0) {
            colorModel2 = openWebAction.controlColor;
        }
        if ((i & 128) != 0) {
            str2 = openWebAction.control;
        }
        if ((i & 256) != 0) {
            str3 = openWebAction.title;
        }
        if ((i & 512) != 0) {
            str4 = openWebAction.auth;
        }
        if ((i & 1024) != 0) {
            str5 = openWebAction.addSvcRetpath;
        }
        String str6 = str4;
        String str7 = str5;
        String str8 = str2;
        String str9 = str3;
        ThemedParams themedParams2 = themedParams;
        ColorModel colorModel3 = colorModel2;
        ColorModel colorModel4 = colorModel;
        boolean z3 = z2;
        return openWebAction.copy(str, z, z3, bool, colorModel4, themedParams2, colorModel3, str8, str9, str6, str7);
    }

    public static /* synthetic */ void getDeeplinkUri$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component10, reason: from getter */
    public final String getAuth() {
        return this.auth;
    }

    /* renamed from: component11, reason: from getter */
    public final String getAddSvcRetpath() {
        return this.addSvcRetpath;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getOpenKeyboard() {
        return this.openKeyboard;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShowNavbar() {
        return this.showNavbar;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getFitWindowTop() {
        return this.fitWindowTop;
    }

    /* renamed from: component5, reason: from getter */
    public final ColorModel getHeaderColor() {
        return this.headerColor;
    }

    public final ThemedParams<String> component6() {
        return this.statusbarStyle;
    }

    /* renamed from: component7, reason: from getter */
    public final ColorModel getControlColor() {
        return this.controlColor;
    }

    /* renamed from: component8, reason: from getter */
    public final String getControl() {
        return this.control;
    }

    /* renamed from: component9, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final OpenWebAction copy(String url, boolean openKeyboard, boolean showNavbar, Boolean fitWindowTop, ColorModel headerColor, ThemedParams<String> statusbarStyle, ColorModel controlColor, String control, String title, String auth, String addSvcRetpath) {
        return new OpenWebAction(url, openKeyboard, showNavbar, fitWindowTop, headerColor, statusbarStyle, controlColor, control, title, auth, addSvcRetpath);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpenWebAction)) {
            return false;
        }
        OpenWebAction openWebAction = (OpenWebAction) other;
        return jl40.l(this.url, openWebAction.url) && this.openKeyboard == openWebAction.openKeyboard && this.showNavbar == openWebAction.showNavbar && jl40.l(this.fitWindowTop, openWebAction.fitWindowTop) && jl40.l(this.headerColor, openWebAction.headerColor) && jl40.l(this.statusbarStyle, openWebAction.statusbarStyle) && jl40.l(this.controlColor, openWebAction.controlColor) && jl40.l(this.control, openWebAction.control) && jl40.l(this.title, openWebAction.title) && jl40.l(this.auth, openWebAction.auth) && jl40.l(this.addSvcRetpath, openWebAction.addSvcRetpath);
    }

    public final String getAddSvcRetpath() {
        return this.addSvcRetpath;
    }

    public final String getAuth() {
        return this.auth;
    }

    public final String getControl() {
        return this.control;
    }

    public final ColorModel getControlColor() {
        return this.controlColor;
    }

    @Override // com.ybsdk.feature.deeplink.api.BaseDeeplinkAction
    public Uri getDeeplinkUri() {
        return this.deeplinkUri;
    }

    public final Boolean getFitWindowTop() {
        return this.fitWindowTop;
    }

    public final ColorModel getHeaderColor() {
        return this.headerColor;
    }

    public final boolean getOpenKeyboard() {
        return this.openKeyboard;
    }

    public final boolean getShowNavbar() {
        return this.showNavbar;
    }

    public final ThemedParams<String> getStatusbarStyle() {
        return this.statusbarStyle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int e = unr0.e(unr0.e(this.url.hashCode() * 31, 31, this.openKeyboard), 31, this.showNavbar);
        Boolean bool = this.fitWindowTop;
        int hashCode = (e + (bool == null ? 0 : bool.hashCode())) * 31;
        ColorModel colorModel = this.headerColor;
        int hashCode2 = (hashCode + (colorModel == null ? 0 : colorModel.hashCode())) * 31;
        ThemedParams<String> themedParams = this.statusbarStyle;
        int hashCode3 = (hashCode2 + (themedParams == null ? 0 : themedParams.hashCode())) * 31;
        ColorModel colorModel2 = this.controlColor;
        int hashCode4 = (hashCode3 + (colorModel2 == null ? 0 : colorModel2.hashCode())) * 31;
        String str = this.control;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.auth;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.addSvcRetpath;
        return hashCode7 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.url;
        boolean z = this.openKeyboard;
        boolean z2 = this.showNavbar;
        Boolean bool = this.fitWindowTop;
        ColorModel colorModel = this.headerColor;
        ThemedParams<String> themedParams = this.statusbarStyle;
        ColorModel colorModel2 = this.controlColor;
        String str2 = this.control;
        String str3 = this.title;
        String str4 = this.auth;
        String str5 = this.addSvcRetpath;
        StringBuilder l = oo31.l("OpenWebAction(url=", str, ", openKeyboard=", ", showNavbar=", z);
        l.append(z2);
        l.append(", fitWindowTop=");
        l.append(bool);
        l.append(", headerColor=");
        l.append(colorModel);
        l.append(", statusbarStyle=");
        l.append(themedParams);
        l.append(", controlColor=");
        l.append(colorModel2);
        l.append(", control=");
        l.append(str2);
        l.append(", title=");
        g8e.D(l, str3, ", auth=", str4, ", addSvcRetpath=");
        return oyr.t(l, str5, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.url);
        dest.writeInt(this.openKeyboard ? 1 : 0);
        dest.writeInt(this.showNavbar ? 1 : 0);
        Boolean bool = this.fitWindowTop;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            nzs.k(dest, 1, bool);
        }
        dest.writeParcelable(this.headerColor, flags);
        dest.writeParcelable(this.statusbarStyle, flags);
        dest.writeParcelable(this.controlColor, flags);
        dest.writeString(this.control);
        dest.writeString(this.title);
        dest.writeString(this.auth);
        dest.writeString(this.addSvcRetpath);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OpenWebAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OpenWebAction createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            Boolean valueOf;
            String readString = parcel.readString();
            boolean z3 = false;
            boolean z4 = true;
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = true;
                z4 = z;
            }
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = z2;
                }
                valueOf = Boolean.valueOf(z);
            }
            return new OpenWebAction(readString, z3, z4, valueOf, (ColorModel) parcel.readParcelable(OpenWebAction.class.getClassLoader()), (ThemedParams) parcel.readParcelable(OpenWebAction.class.getClassLoader()), (ColorModel) parcel.readParcelable(OpenWebAction.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OpenWebAction[] newArray(int i) {
            return new OpenWebAction[i];
        }
    }

    public /* synthetic */ OpenWebAction(String str, boolean z, boolean z2, Boolean bool, ColorModel colorModel, ThemedParams themedParams, ColorModel colorModel2, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? true : z2, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : colorModel, (i & 32) != 0 ? null : themedParams, (i & 64) != 0 ? null : colorModel2, (i & 128) != 0 ? null : str2, (i & 256) != 0 ? null : str3, (i & 512) != 0 ? null : str4, (i & 1024) != 0 ? null : str5);
    }
}
