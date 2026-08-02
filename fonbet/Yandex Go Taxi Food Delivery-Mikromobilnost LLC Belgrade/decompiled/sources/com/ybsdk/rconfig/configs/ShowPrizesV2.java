package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.xvz;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0003\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/rconfig/configs/ShowPrizesV2;", "", "", "isEnabled", "", "widgetScreen", "<init>", "(ZLjava/lang/String;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "copy", "(ZLjava/lang/String;)Lcom/ybsdk/rconfig/configs/ShowPrizesV2;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "Ljava/lang/String;", "getWidgetScreen", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ShowPrizesV2 {

    @Json(name = "is_enabled")
    private final boolean isEnabled;

    @Json(name = "widget_screen")
    private final String widgetScreen;

    public ShowPrizesV2(boolean z, String str) {
        this.isEnabled = z;
        this.widgetScreen = str;
    }

    public static /* synthetic */ ShowPrizesV2 copy$default(ShowPrizesV2 showPrizesV2, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = showPrizesV2.isEnabled;
        }
        if ((i & 2) != 0) {
            str = showPrizesV2.widgetScreen;
        }
        return showPrizesV2.copy(z, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final String getWidgetScreen() {
        return this.widgetScreen;
    }

    public final ShowPrizesV2 copy(boolean isEnabled, String widgetScreen) {
        return new ShowPrizesV2(isEnabled, widgetScreen);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShowPrizesV2)) {
            return false;
        }
        ShowPrizesV2 showPrizesV2 = (ShowPrizesV2) other;
        return this.isEnabled == showPrizesV2.isEnabled && jl40.l(this.widgetScreen, showPrizesV2.widgetScreen);
    }

    public final String getWidgetScreen() {
        return this.widgetScreen;
    }

    public int hashCode() {
        return this.widgetScreen.hashCode() + (Boolean.hashCode(this.isEnabled) * 31);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public String toString() {
        return xvz.m("ShowPrizesV2(isEnabled=", this.isEnabled, ", widgetScreen=", this.widgetScreen, Extension.C_BRAKE);
    }
}
