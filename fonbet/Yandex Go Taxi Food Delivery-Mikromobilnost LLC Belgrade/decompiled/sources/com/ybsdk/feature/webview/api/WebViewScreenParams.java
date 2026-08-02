package com.ybsdk.feature.webview.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.navigation.ScreenParams;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.feature.webview.api.WebViewAppearanceOption;
import com.ybsdk.feature.webview.api.WebViewCloseCallback;
import com.ybsdk.widgets.common.ErrorView$State$PrimaryButtonGravity;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.nzs;
import defpackage.oo31;
import defpackage.ooc;
import defpackage.ql41;
import defpackage.unr0;
import defpackage.x4e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001MBc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b-\u0010 Jn\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b0\u0010\u001eJ\u0010\u00101\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b1\u0010\u001cJ\u001a\u00104\u001a\u00020\u00042\b\u00103\u001a\u0004\u0018\u000102HÖ\u0003¢\u0006\u0004\b4\u00105R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00108\u001a\u0004\b9\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010:\u001a\u0004\b;\u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010<\u001a\u0004\b=\u0010$R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010>\u001a\u0004\b?\u0010&R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010@\u001a\u0004\bA\u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010B\u001a\u0004\bC\u0010*R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010D\u001a\u0004\bE\u0010,R\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u00108\u001a\u0004\bF\u0010 R\u0011\u0010H\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bG\u0010 R\u0011\u0010L\u001a\u00020I8F¢\u0006\u0006\u001a\u0004\bJ\u0010K¨\u0006N"}, d2 = {"Lcom/ybsdk/feature/webview/api/WebViewScreenParams;", "Lcom/ybsdk/core/navigation/ScreenParams;", "", "url", "", "openKeyboardOnLoad", "Lcom/ybsdk/feature/webview/api/WebViewScreenParams$Auth;", "auth", "Lcom/ybsdk/feature/webview/api/WebViewAppearanceOption;", "appearanceOption", "Lcom/ybsdk/feature/webview/api/WebViewCloseCallback;", "closeCallback", "Lcom/ybsdk/feature/webview/api/WebViewStatusBar;", "statusBar", "fitsSystemWindow", "Lcom/ybsdk/widgets/common/ErrorView$State$PrimaryButtonGravity;", "primaryErrorButtonGravity", "shouldReloadWhenShownInViewPager", "<init>", "(Ljava/lang/String;ZLcom/ybsdk/feature/webview/api/WebViewScreenParams$Auth;Lcom/ybsdk/feature/webview/api/WebViewAppearanceOption;Lcom/ybsdk/feature/webview/api/WebViewCloseCallback;Lcom/ybsdk/feature/webview/api/WebViewStatusBar;Ljava/lang/Boolean;Lcom/ybsdk/widgets/common/ErrorView$State$PrimaryButtonGravity;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "()Lcom/ybsdk/feature/webview/api/WebViewScreenParams$Auth;", "component4", "()Lcom/ybsdk/feature/webview/api/WebViewAppearanceOption;", "component5", "()Lcom/ybsdk/feature/webview/api/WebViewCloseCallback;", "component6", "()Lcom/ybsdk/feature/webview/api/WebViewStatusBar;", "component7", "()Ljava/lang/Boolean;", "component8", "()Lcom/ybsdk/widgets/common/ErrorView$State$PrimaryButtonGravity;", "component9", "copy", "(Ljava/lang/String;ZLcom/ybsdk/feature/webview/api/WebViewScreenParams$Auth;Lcom/ybsdk/feature/webview/api/WebViewAppearanceOption;Lcom/ybsdk/feature/webview/api/WebViewCloseCallback;Lcom/ybsdk/feature/webview/api/WebViewStatusBar;Ljava/lang/Boolean;Lcom/ybsdk/widgets/common/ErrorView$State$PrimaryButtonGravity;Z)Lcom/ybsdk/feature/webview/api/WebViewScreenParams;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "Z", "getOpenKeyboardOnLoad", "Lcom/ybsdk/feature/webview/api/WebViewScreenParams$Auth;", "getAuth", "Lcom/ybsdk/feature/webview/api/WebViewAppearanceOption;", "getAppearanceOption", "Lcom/ybsdk/feature/webview/api/WebViewCloseCallback;", "getCloseCallback", "Lcom/ybsdk/feature/webview/api/WebViewStatusBar;", "getStatusBar", "Ljava/lang/Boolean;", "getFitsSystemWindow", "Lcom/ybsdk/widgets/common/ErrorView$State$PrimaryButtonGravity;", "getPrimaryErrorButtonGravity", "getShouldReloadWhenShownInViewPager", "getShowAsOverlay", "showAsOverlay", "Lcom/ybsdk/core/utils/ColorModel;", "getGripBackground", "()Lcom/ybsdk/core/utils/ColorModel;", "gripBackground", "Auth", "feature-webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class WebViewScreenParams implements ScreenParams {
    public static final Parcelable.Creator<WebViewScreenParams> CREATOR = new Creator();
    private final WebViewAppearanceOption appearanceOption;
    private final Auth auth;
    private final WebViewCloseCallback closeCallback;
    private final Boolean fitsSystemWindow;
    private final boolean openKeyboardOnLoad;
    private final ErrorView$State$PrimaryButtonGravity primaryErrorButtonGravity;
    private final boolean shouldReloadWhenShownInViewPager;
    private final WebViewStatusBar statusBar;
    private final String url;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/feature/webview/api/WebViewScreenParams$Auth;", "", "", "authLevel", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getAuthLevel", "()Ljava/lang/String;", "Companion", "com/ybsdk/feature/webview/api/b", JCP.RAW_PREFIX, "BNK", "BNK_NO_VERIFY", "YANDEX", "feature-webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Auth {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Auth[] $VALUES;
        public static final b Companion;
        private final String authLevel;
        public static final Auth NONE = new Auth(JCP.RAW_PREFIX, 0, "none");
        public static final Auth BNK = new Auth("BNK", 1, ooc.l(ooc.c));
        public static final Auth BNK_NO_VERIFY = new Auth("BNK_NO_VERIFY", 2, ooc.l(ooc.b));
        public static final Auth YANDEX = new Auth("YANDEX", 3, "yandex");

        private static final /* synthetic */ Auth[] $values() {
            return new Auth[]{NONE, BNK, BNK_NO_VERIFY, YANDEX};
        }

        static {
            Auth[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
            Companion = new b();
        }

        private Auth(String str, int i, String str2) {
            this.authLevel = str2;
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static Auth valueOf(String str) {
            return (Auth) Enum.valueOf(Auth.class, str);
        }

        public static Auth[] values() {
            return (Auth[]) $VALUES.clone();
        }

        public final String getAuthLevel() {
            return this.authLevel;
        }
    }

    public WebViewScreenParams(String str, boolean z, Auth auth, WebViewAppearanceOption webViewAppearanceOption, WebViewCloseCallback webViewCloseCallback, WebViewStatusBar webViewStatusBar, Boolean bool, ErrorView$State$PrimaryButtonGravity errorView$State$PrimaryButtonGravity, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? a.a : auth, (i & 8) != 0 ? new WebViewAppearanceOption.NoToolbar(null, false, false, 7, null) : webViewAppearanceOption, (i & 16) != 0 ? WebViewCloseCallback.EmptyCallback.INSTANCE : webViewCloseCallback, (i & 32) != 0 ? null : webViewStatusBar, (i & 64) == 0 ? bool : null, (i & 128) != 0 ? ErrorView$State$PrimaryButtonGravity.BOTTOM : errorView$State$PrimaryButtonGravity, (i & 256) != 0 ? false : z2);
    }

    public static /* synthetic */ WebViewScreenParams copy$default(WebViewScreenParams webViewScreenParams, String str, boolean z, Auth auth, WebViewAppearanceOption webViewAppearanceOption, WebViewCloseCallback webViewCloseCallback, WebViewStatusBar webViewStatusBar, Boolean bool, ErrorView$State$PrimaryButtonGravity errorView$State$PrimaryButtonGravity, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = webViewScreenParams.url;
        }
        if ((i & 2) != 0) {
            z = webViewScreenParams.openKeyboardOnLoad;
        }
        if ((i & 4) != 0) {
            auth = webViewScreenParams.auth;
        }
        if ((i & 8) != 0) {
            webViewAppearanceOption = webViewScreenParams.appearanceOption;
        }
        if ((i & 16) != 0) {
            webViewCloseCallback = webViewScreenParams.closeCallback;
        }
        if ((i & 32) != 0) {
            webViewStatusBar = webViewScreenParams.statusBar;
        }
        if ((i & 64) != 0) {
            bool = webViewScreenParams.fitsSystemWindow;
        }
        if ((i & 128) != 0) {
            errorView$State$PrimaryButtonGravity = webViewScreenParams.primaryErrorButtonGravity;
        }
        if ((i & 256) != 0) {
            z2 = webViewScreenParams.shouldReloadWhenShownInViewPager;
        }
        ErrorView$State$PrimaryButtonGravity errorView$State$PrimaryButtonGravity2 = errorView$State$PrimaryButtonGravity;
        boolean z3 = z2;
        WebViewStatusBar webViewStatusBar2 = webViewStatusBar;
        Boolean bool2 = bool;
        WebViewCloseCallback webViewCloseCallback2 = webViewCloseCallback;
        Auth auth2 = auth;
        return webViewScreenParams.copy(str, z, auth2, webViewAppearanceOption, webViewCloseCallback2, webViewStatusBar2, bool2, errorView$State$PrimaryButtonGravity2, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getOpenKeyboardOnLoad() {
        return this.openKeyboardOnLoad;
    }

    /* renamed from: component3, reason: from getter */
    public final Auth getAuth() {
        return this.auth;
    }

    /* renamed from: component4, reason: from getter */
    public final WebViewAppearanceOption getAppearanceOption() {
        return this.appearanceOption;
    }

    /* renamed from: component5, reason: from getter */
    public final WebViewCloseCallback getCloseCallback() {
        return this.closeCallback;
    }

    /* renamed from: component6, reason: from getter */
    public final WebViewStatusBar getStatusBar() {
        return this.statusBar;
    }

    /* renamed from: component7, reason: from getter */
    public final Boolean getFitsSystemWindow() {
        return this.fitsSystemWindow;
    }

    /* renamed from: component8, reason: from getter */
    public final ErrorView$State$PrimaryButtonGravity getPrimaryErrorButtonGravity() {
        return this.primaryErrorButtonGravity;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getShouldReloadWhenShownInViewPager() {
        return this.shouldReloadWhenShownInViewPager;
    }

    public final WebViewScreenParams copy(String url, boolean openKeyboardOnLoad, Auth auth, WebViewAppearanceOption appearanceOption, WebViewCloseCallback closeCallback, WebViewStatusBar statusBar, Boolean fitsSystemWindow, ErrorView$State$PrimaryButtonGravity primaryErrorButtonGravity, boolean shouldReloadWhenShownInViewPager) {
        return new WebViewScreenParams(url, openKeyboardOnLoad, auth, appearanceOption, closeCallback, statusBar, fitsSystemWindow, primaryErrorButtonGravity, shouldReloadWhenShownInViewPager);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebViewScreenParams)) {
            return false;
        }
        WebViewScreenParams webViewScreenParams = (WebViewScreenParams) other;
        return jl40.l(this.url, webViewScreenParams.url) && this.openKeyboardOnLoad == webViewScreenParams.openKeyboardOnLoad && this.auth == webViewScreenParams.auth && jl40.l(this.appearanceOption, webViewScreenParams.appearanceOption) && jl40.l(this.closeCallback, webViewScreenParams.closeCallback) && jl40.l(this.statusBar, webViewScreenParams.statusBar) && jl40.l(this.fitsSystemWindow, webViewScreenParams.fitsSystemWindow) && this.primaryErrorButtonGravity == webViewScreenParams.primaryErrorButtonGravity && this.shouldReloadWhenShownInViewPager == webViewScreenParams.shouldReloadWhenShownInViewPager;
    }

    public final WebViewAppearanceOption getAppearanceOption() {
        return this.appearanceOption;
    }

    public final Auth getAuth() {
        return this.auth;
    }

    public final WebViewCloseCallback getCloseCallback() {
        return this.closeCallback;
    }

    public final Boolean getFitsSystemWindow() {
        return this.fitsSystemWindow;
    }

    public final ColorModel getGripBackground() {
        WebViewAppearanceOption webViewAppearanceOption = this.appearanceOption;
        if (webViewAppearanceOption instanceof WebViewAppearanceOption.ShowToolbar) {
            return ((WebViewAppearanceOption.ShowToolbar) webViewAppearanceOption).getColor();
        }
        WebViewStatusBar webViewStatusBar = this.statusBar;
        if (webViewStatusBar != null) {
            return webViewStatusBar.getColor();
        }
        WebViewAppearanceOption.Companion.getClass();
        return ql41.a();
    }

    public final boolean getOpenKeyboardOnLoad() {
        return this.openKeyboardOnLoad;
    }

    public final ErrorView$State$PrimaryButtonGravity getPrimaryErrorButtonGravity() {
        return this.primaryErrorButtonGravity;
    }

    public final boolean getShouldReloadWhenShownInViewPager() {
        return this.shouldReloadWhenShownInViewPager;
    }

    public final boolean getShowAsOverlay() {
        WebViewAppearanceOption webViewAppearanceOption = this.appearanceOption;
        WebViewAppearanceOption.NoToolbar noToolbar = webViewAppearanceOption instanceof WebViewAppearanceOption.NoToolbar ? (WebViewAppearanceOption.NoToolbar) webViewAppearanceOption : null;
        if (noToolbar != null) {
            return noToolbar.getShowAsOverlay();
        }
        return false;
    }

    public final WebViewStatusBar getStatusBar() {
        return this.statusBar;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode = (this.closeCallback.hashCode() + ((this.appearanceOption.hashCode() + ((this.auth.hashCode() + unr0.e(this.url.hashCode() * 31, 31, this.openKeyboardOnLoad)) * 31)) * 31)) * 31;
        WebViewStatusBar webViewStatusBar = this.statusBar;
        int hashCode2 = (hashCode + (webViewStatusBar == null ? 0 : webViewStatusBar.hashCode())) * 31;
        Boolean bool = this.fitsSystemWindow;
        int hashCode3 = bool != null ? bool.hashCode() : 0;
        return Boolean.hashCode(this.shouldReloadWhenShownInViewPager) + ((this.primaryErrorButtonGravity.hashCode() + ((hashCode2 + hashCode3) * 31)) * 31);
    }

    public String toString() {
        String str = this.url;
        boolean z = this.openKeyboardOnLoad;
        Auth auth = this.auth;
        WebViewAppearanceOption webViewAppearanceOption = this.appearanceOption;
        WebViewCloseCallback webViewCloseCallback = this.closeCallback;
        WebViewStatusBar webViewStatusBar = this.statusBar;
        Boolean bool = this.fitsSystemWindow;
        ErrorView$State$PrimaryButtonGravity errorView$State$PrimaryButtonGravity = this.primaryErrorButtonGravity;
        boolean z2 = this.shouldReloadWhenShownInViewPager;
        StringBuilder l = oo31.l("WebViewScreenParams(url=", str, ", openKeyboardOnLoad=", ", auth=", z);
        l.append(auth);
        l.append(", appearanceOption=");
        l.append(webViewAppearanceOption);
        l.append(", closeCallback=");
        l.append(webViewCloseCallback);
        l.append(", statusBar=");
        l.append(webViewStatusBar);
        l.append(", fitsSystemWindow=");
        l.append(bool);
        l.append(", primaryErrorButtonGravity=");
        l.append(errorView$State$PrimaryButtonGravity);
        l.append(", shouldReloadWhenShownInViewPager=");
        return x4e.i(l, z2, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.url);
        dest.writeInt(this.openKeyboardOnLoad ? 1 : 0);
        dest.writeString(this.auth.name());
        dest.writeParcelable(this.appearanceOption, flags);
        dest.writeParcelable(this.closeCallback, flags);
        WebViewStatusBar webViewStatusBar = this.statusBar;
        if (webViewStatusBar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            webViewStatusBar.writeToParcel(dest, flags);
        }
        Boolean bool = this.fitsSystemWindow;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            nzs.k(dest, 1, bool);
        }
        dest.writeString(this.primaryErrorButtonGravity.name());
        dest.writeInt(this.shouldReloadWhenShownInViewPager ? 1 : 0);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<WebViewScreenParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WebViewScreenParams createFromParcel(Parcel parcel) {
            boolean z;
            Auth auth;
            WebViewAppearanceOption webViewAppearanceOption;
            WebViewStatusBar webViewStatusBar;
            Boolean bool;
            ErrorView$State$PrimaryButtonGravity errorView$State$PrimaryButtonGravity;
            boolean z2;
            String readString = parcel.readString();
            boolean z3 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
            } else {
                z = false;
            }
            Auth valueOf = Auth.valueOf(parcel.readString());
            WebViewAppearanceOption webViewAppearanceOption2 = (WebViewAppearanceOption) parcel.readParcelable(WebViewScreenParams.class.getClassLoader());
            WebViewCloseCallback webViewCloseCallback = (WebViewCloseCallback) parcel.readParcelable(WebViewScreenParams.class.getClassLoader());
            Boolean bool2 = null;
            WebViewStatusBar createFromParcel = parcel.readInt() == 0 ? null : WebViewStatusBar.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                bool2 = Boolean.valueOf(parcel.readInt() != 0 ? true : z);
            }
            ErrorView$State$PrimaryButtonGravity valueOf2 = ErrorView$State$PrimaryButtonGravity.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                z2 = true;
                auth = valueOf;
                webViewAppearanceOption = webViewAppearanceOption2;
                webViewStatusBar = createFromParcel;
                bool = bool2;
                errorView$State$PrimaryButtonGravity = valueOf2;
            } else {
                auth = valueOf;
                webViewAppearanceOption = webViewAppearanceOption2;
                webViewStatusBar = createFromParcel;
                bool = bool2;
                errorView$State$PrimaryButtonGravity = valueOf2;
                z2 = z;
            }
            return new WebViewScreenParams(readString, z3, auth, webViewAppearanceOption, webViewCloseCallback, webViewStatusBar, bool, errorView$State$PrimaryButtonGravity, z2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WebViewScreenParams[] newArray(int i) {
            return new WebViewScreenParams[i];
        }
    }

    public WebViewScreenParams(String str, boolean z, Auth auth, WebViewAppearanceOption webViewAppearanceOption, WebViewCloseCallback webViewCloseCallback, WebViewStatusBar webViewStatusBar, Boolean bool, ErrorView$State$PrimaryButtonGravity errorView$State$PrimaryButtonGravity, boolean z2) {
        this.url = str;
        this.openKeyboardOnLoad = z;
        this.auth = auth;
        this.appearanceOption = webViewAppearanceOption;
        this.closeCallback = webViewCloseCallback;
        this.statusBar = webViewStatusBar;
        this.fitsSystemWindow = bool;
        this.primaryErrorButtonGravity = errorView$State$PrimaryButtonGravity;
        this.shouldReloadWhenShownInViewPager = z2;
    }
}
