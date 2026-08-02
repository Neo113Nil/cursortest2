package com.ybsdk.deeplink.generated;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.div.state.db.StateEntry;
import com.ybsdk.core.design.theme.ThemedParams;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.nzs;
import defpackage.smw0;
import defpackage.tse0;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001:\u0001ZBË\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0013\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u001a¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\"J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\"J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\"J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\"J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\"J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\"J\u0012\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b.\u0010-J\u0012\u0010/\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010\"J\u0012\u00100\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b2\u00101J\u0018\u00103\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b3\u00104J\u0018\u00105\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b5\u00104JÖ\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00132\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b8\u0010\"J\u0010\u00109\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b9\u0010 J\u001a\u0010<\u001a\u00020\u00052\b\u0010;\u001a\u0004\u0018\u00010:HÖ\u0003¢\u0006\u0004\b<\u0010=R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010>\u001a\u0004\b?\u0010\"R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010>\u001a\u0004\b@\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010A\u001a\u0004\bB\u0010%R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010>\u001a\u0004\bC\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010>\u001a\u0004\bD\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010>\u001a\u0004\bE\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010>\u001a\u0004\bF\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010>\u001a\u0004\bG\u0010\"R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010>\u001a\u0004\bH\u0010\"R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010I\u001a\u0004\bJ\u0010-R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010I\u001a\u0004\bK\u0010-R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010>\u001a\u0004\bL\u0010\"R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010M\u001a\u0004\bN\u00101R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010M\u001a\u0004\bO\u00101R\u001f\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010P\u001a\u0004\bQ\u00104R\u001f\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010P\u001a\u0004\bR\u00104R \u0010T\u001a\u00020S8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bT\u0010U\u0012\u0004\bX\u0010Y\u001a\u0004\bV\u0010W¨\u0006["}, d2 = {"Lcom/ybsdk/deeplink/generated/DivkitAction;", "Lcom/ybsdk/feature/deeplink/api/BaseDeeplinkAction;", "", StateEntry.COLUMN_PATH, "screenKey", "", "onlyInitialDataLoad", "skeleton", "skeletonId", MetaDataField.SCREEN_FIELD, "toolbarTitle", "toolbarSubtitle", "payload", "showNavbar", "fitWindowTop", "bottomBarItemId", "Lcom/ybsdk/core/utils/ColorModel;", "headerColor", "bottomBarColor", "Lcom/ybsdk/core/design/theme/ThemedParams;", "statusbarStyle", "bottomBarStyle", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/ybsdk/core/utils/ColorModel;Lcom/ybsdk/core/utils/ColorModel;Lcom/ybsdk/core/design/theme/ThemedParams;Lcom/ybsdk/core/design/theme/ThemedParams;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "()Ljava/lang/Boolean;", "component11", "component12", "component13", "()Lcom/ybsdk/core/utils/ColorModel;", "component14", "component15", "()Lcom/ybsdk/core/design/theme/ThemedParams;", "component16", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/ybsdk/core/utils/ColorModel;Lcom/ybsdk/core/utils/ColorModel;Lcom/ybsdk/core/design/theme/ThemedParams;Lcom/ybsdk/core/design/theme/ThemedParams;)Lcom/ybsdk/deeplink/generated/DivkitAction;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPath", "getScreenKey", "Z", "getOnlyInitialDataLoad", "getSkeleton", "getSkeletonId", "getScreen", "getToolbarTitle", "getToolbarSubtitle", "getPayload", "Ljava/lang/Boolean;", "getShowNavbar", "getFitWindowTop", "getBottomBarItemId", "Lcom/ybsdk/core/utils/ColorModel;", "getHeaderColor", "getBottomBarColor", "Lcom/ybsdk/core/design/theme/ThemedParams;", "getStatusbarStyle", "getBottomBarStyle", "Landroid/net/Uri;", "deeplinkUri", "Landroid/net/Uri;", "getDeeplinkUri", "()Landroid/net/Uri;", "getDeeplinkUri$annotations", "()V", "vj91", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DivkitAction implements BaseDeeplinkAction {
    public static final Parcelable.Creator<DivkitAction> CREATOR = new Creator();
    private final ColorModel bottomBarColor;
    private final String bottomBarItemId;
    private final ThemedParams<String> bottomBarStyle;
    private final Uri deeplinkUri;
    private final Boolean fitWindowTop;
    private final ColorModel headerColor;
    private final boolean onlyInitialDataLoad;
    private final String path;
    private final String payload;
    private final String screen;
    private final String screenKey;
    private final Boolean showNavbar;
    private final String skeleton;
    private final String skeletonId;
    private final ThemedParams<String> statusbarStyle;
    private final String toolbarSubtitle;
    private final String toolbarTitle;

    public DivkitAction(String str, String str2, boolean z, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool, Boolean bool2, String str9, ColorModel colorModel, ColorModel colorModel2, ThemedParams<String> themedParams, ThemedParams<String> themedParams2) {
        this.path = str;
        this.screenKey = str2;
        this.onlyInitialDataLoad = z;
        this.skeleton = str3;
        this.skeletonId = str4;
        this.screen = str5;
        this.toolbarTitle = str6;
        this.toolbarSubtitle = str7;
        this.payload = str8;
        this.showNavbar = bool;
        this.fitWindowTop = bool2;
        this.bottomBarItemId = str9;
        this.headerColor = colorModel;
        this.bottomBarColor = colorModel2;
        this.statusbarStyle = themedParams;
        this.bottomBarStyle = themedParams2;
        Uri.Builder j = ly3.j("ybapp", "screen.open", "/divkit", StateEntry.COLUMN_PATH, str);
        j.appendQueryParameter("screen_key", str2);
        j.appendQueryParameter("only_initial_data_load", String.valueOf(z));
        if (str3 != null) {
            j.appendQueryParameter("skeleton", str3);
        }
        if (str4 != null) {
            j.appendQueryParameter("skeleton_id", str4);
        }
        if (str5 != null) {
            j.appendQueryParameter(MetaDataField.SCREEN_FIELD, str5);
        }
        if (str6 != null) {
            j.appendQueryParameter("toolbar_title", str6);
        }
        if (str7 != null) {
            j.appendQueryParameter("toolbar_subtitle", str7);
        }
        if (str8 != null) {
            j.appendQueryParameter("payload", str8);
        }
        if (bool != null) {
            j.appendQueryParameter("show_navbar", String.valueOf(bool.booleanValue()));
        }
        if (bool2 != null) {
            j.appendQueryParameter("fit_window_top", String.valueOf(bool2.booleanValue()));
        }
        if (str9 != null) {
            j.appendQueryParameter("bottom_bar_item_id", str9);
        }
        if (themedParams != null) {
            String light = themedParams.getLight();
            j.appendQueryParameter("statusbar_style", light == null ? "" : light);
            String dark = themedParams.getDark();
            if (dark != null) {
                j.appendQueryParameter("statusbar_style_dark", dark);
            }
        }
        if (themedParams2 != null) {
            String light2 = themedParams2.getLight();
            j.appendQueryParameter("bottom_bar_style", light2 != null ? light2 : "");
            String dark2 = themedParams2.getDark();
            if (dark2 != null) {
                j.appendQueryParameter("bottom_bar_style_dark", dark2);
            }
        }
        this.deeplinkUri = j.build();
    }

    public static /* synthetic */ void getDeeplinkUri$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* renamed from: component10, reason: from getter */
    public final Boolean getShowNavbar() {
        return this.showNavbar;
    }

    /* renamed from: component11, reason: from getter */
    public final Boolean getFitWindowTop() {
        return this.fitWindowTop;
    }

    /* renamed from: component12, reason: from getter */
    public final String getBottomBarItemId() {
        return this.bottomBarItemId;
    }

    /* renamed from: component13, reason: from getter */
    public final ColorModel getHeaderColor() {
        return this.headerColor;
    }

    /* renamed from: component14, reason: from getter */
    public final ColorModel getBottomBarColor() {
        return this.bottomBarColor;
    }

    public final ThemedParams<String> component15() {
        return this.statusbarStyle;
    }

    public final ThemedParams<String> component16() {
        return this.bottomBarStyle;
    }

    /* renamed from: component2, reason: from getter */
    public final String getScreenKey() {
        return this.screenKey;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getOnlyInitialDataLoad() {
        return this.onlyInitialDataLoad;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSkeleton() {
        return this.skeleton;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSkeletonId() {
        return this.skeletonId;
    }

    /* renamed from: component6, reason: from getter */
    public final String getScreen() {
        return this.screen;
    }

    /* renamed from: component7, reason: from getter */
    public final String getToolbarTitle() {
        return this.toolbarTitle;
    }

    /* renamed from: component8, reason: from getter */
    public final String getToolbarSubtitle() {
        return this.toolbarSubtitle;
    }

    /* renamed from: component9, reason: from getter */
    public final String getPayload() {
        return this.payload;
    }

    public final DivkitAction copy(String path, String screenKey, boolean onlyInitialDataLoad, String skeleton, String skeletonId, String screen, String toolbarTitle, String toolbarSubtitle, String payload, Boolean showNavbar, Boolean fitWindowTop, String bottomBarItemId, ColorModel headerColor, ColorModel bottomBarColor, ThemedParams<String> statusbarStyle, ThemedParams<String> bottomBarStyle) {
        return new DivkitAction(path, screenKey, onlyInitialDataLoad, skeleton, skeletonId, screen, toolbarTitle, toolbarSubtitle, payload, showNavbar, fitWindowTop, bottomBarItemId, headerColor, bottomBarColor, statusbarStyle, bottomBarStyle);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DivkitAction)) {
            return false;
        }
        DivkitAction divkitAction = (DivkitAction) other;
        return jl40.l(this.path, divkitAction.path) && jl40.l(this.screenKey, divkitAction.screenKey) && this.onlyInitialDataLoad == divkitAction.onlyInitialDataLoad && jl40.l(this.skeleton, divkitAction.skeleton) && jl40.l(this.skeletonId, divkitAction.skeletonId) && jl40.l(this.screen, divkitAction.screen) && jl40.l(this.toolbarTitle, divkitAction.toolbarTitle) && jl40.l(this.toolbarSubtitle, divkitAction.toolbarSubtitle) && jl40.l(this.payload, divkitAction.payload) && jl40.l(this.showNavbar, divkitAction.showNavbar) && jl40.l(this.fitWindowTop, divkitAction.fitWindowTop) && jl40.l(this.bottomBarItemId, divkitAction.bottomBarItemId) && jl40.l(this.headerColor, divkitAction.headerColor) && jl40.l(this.bottomBarColor, divkitAction.bottomBarColor) && jl40.l(this.statusbarStyle, divkitAction.statusbarStyle) && jl40.l(this.bottomBarStyle, divkitAction.bottomBarStyle);
    }

    public final ColorModel getBottomBarColor() {
        return this.bottomBarColor;
    }

    public final String getBottomBarItemId() {
        return this.bottomBarItemId;
    }

    public final ThemedParams<String> getBottomBarStyle() {
        return this.bottomBarStyle;
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

    public final boolean getOnlyInitialDataLoad() {
        return this.onlyInitialDataLoad;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getPayload() {
        return this.payload;
    }

    public final String getScreen() {
        return this.screen;
    }

    public final String getScreenKey() {
        return this.screenKey;
    }

    public final Boolean getShowNavbar() {
        return this.showNavbar;
    }

    public final String getSkeleton() {
        return this.skeleton;
    }

    public final String getSkeletonId() {
        return this.skeletonId;
    }

    public final ThemedParams<String> getStatusbarStyle() {
        return this.statusbarStyle;
    }

    public final String getToolbarSubtitle() {
        return this.toolbarSubtitle;
    }

    public final String getToolbarTitle() {
        return this.toolbarTitle;
    }

    public int hashCode() {
        int e = unr0.e(unr0.b(this.path.hashCode() * 31, 31, this.screenKey), 31, this.onlyInitialDataLoad);
        String str = this.skeleton;
        int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.skeletonId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.screen;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.toolbarTitle;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.toolbarSubtitle;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.payload;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.showNavbar;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.fitWindowTop;
        int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str7 = this.bottomBarItemId;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        ColorModel colorModel = this.headerColor;
        int hashCode10 = (hashCode9 + (colorModel == null ? 0 : colorModel.hashCode())) * 31;
        ColorModel colorModel2 = this.bottomBarColor;
        int hashCode11 = (hashCode10 + (colorModel2 == null ? 0 : colorModel2.hashCode())) * 31;
        ThemedParams<String> themedParams = this.statusbarStyle;
        int hashCode12 = (hashCode11 + (themedParams == null ? 0 : themedParams.hashCode())) * 31;
        ThemedParams<String> themedParams2 = this.bottomBarStyle;
        return hashCode12 + (themedParams2 != null ? themedParams2.hashCode() : 0);
    }

    public String toString() {
        String str = this.path;
        String str2 = this.screenKey;
        boolean z = this.onlyInitialDataLoad;
        String str3 = this.skeleton;
        String str4 = this.skeletonId;
        String str5 = this.screen;
        String str6 = this.toolbarTitle;
        String str7 = this.toolbarSubtitle;
        String str8 = this.payload;
        Boolean bool = this.showNavbar;
        Boolean bool2 = this.fitWindowTop;
        String str9 = this.bottomBarItemId;
        ColorModel colorModel = this.headerColor;
        ColorModel colorModel2 = this.bottomBarColor;
        ThemedParams<String> themedParams = this.statusbarStyle;
        ThemedParams<String> themedParams2 = this.bottomBarStyle;
        StringBuilder v = b64.v("DivkitAction(path=", str, ", screenKey=", str2, ", onlyInitialDataLoad=");
        unr0.A(", skeleton=", str3, ", skeletonId=", v, z);
        g8e.D(v, str4, ", screen=", str5, ", toolbarTitle=");
        g8e.D(v, str6, ", toolbarSubtitle=", str7, ", payload=");
        tse0.A(v, str8, ", showNavbar=", bool, ", fitWindowTop=");
        v.append(bool2);
        v.append(", bottomBarItemId=");
        v.append(str9);
        v.append(", headerColor=");
        smw0.z(v, colorModel, ", bottomBarColor=", colorModel2, ", statusbarStyle=");
        v.append(themedParams);
        v.append(", bottomBarStyle=");
        v.append(themedParams2);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.path);
        dest.writeString(this.screenKey);
        dest.writeInt(this.onlyInitialDataLoad ? 1 : 0);
        dest.writeString(this.skeleton);
        dest.writeString(this.skeletonId);
        dest.writeString(this.screen);
        dest.writeString(this.toolbarTitle);
        dest.writeString(this.toolbarSubtitle);
        dest.writeString(this.payload);
        Boolean bool = this.showNavbar;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            nzs.k(dest, 1, bool);
        }
        Boolean bool2 = this.fitWindowTop;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            nzs.k(dest, 1, bool2);
        }
        dest.writeString(this.bottomBarItemId);
        dest.writeParcelable(this.headerColor, flags);
        dest.writeParcelable(this.bottomBarColor, flags);
        dest.writeParcelable(this.statusbarStyle, flags);
        dest.writeParcelable(this.bottomBarStyle, flags);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DivkitAction> {
        /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
            java.lang.NullPointerException
            */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.ybsdk.deeplink.generated.DivkitAction createFromParcel(
        /*  JADX ERROR: Method generation error
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r18v0 ??
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
            	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            */
        /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
            java.lang.NullPointerException
            */

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DivkitAction[] newArray(int i) {
            return new DivkitAction[i];
        }
    }

    public /* synthetic */ DivkitAction(String str, String str2, boolean z, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool, Boolean bool2, String str9, ColorModel colorModel, ColorModel colorModel2, ThemedParams themedParams, ThemedParams themedParams2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? true : z, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : bool, (i & 1024) != 0 ? null : bool2, (i & 2048) != 0 ? null : str9, (i & 4096) != 0 ? null : colorModel, (i & 8192) != 0 ? null : colorModel2, (i & 16384) != 0 ? null : themedParams, (i & 32768) != 0 ? null : themedParams2);
    }
}
