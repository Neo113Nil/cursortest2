package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.tse0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0013J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0013J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJr\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0013J\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b\u0003\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b'\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b(\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b)\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b*\u0010\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b+\u0010\u0013R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b-\u0010\u001a¨\u0006."}, d2 = {"Lcom/ybsdk/rconfig/configs/NfcWatchSettingsConfig;", "", "", "isEnabled", "", "settingsTitle", "settingsSubtitle", "settingsCategoryTitle", "settingsCategorySubtitle", "title", "subtitle", "", "Lcom/ybsdk/rconfig/configs/WatchBanner;", "items", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "component8", "()Ljava/util/List;", "copy", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/ybsdk/rconfig/configs/NfcWatchSettingsConfig;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "Ljava/lang/String;", "getSettingsTitle", "getSettingsSubtitle", "getSettingsCategoryTitle", "getSettingsCategorySubtitle", "getTitle", "getSubtitle", "Ljava/util/List;", "getItems", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class NfcWatchSettingsConfig {

    @Json(name = "is_enabled")
    private final boolean isEnabled;

    @Json(name = "items")
    private final List<WatchBanner> items;

    @Json(name = "settings_category_subtitle")
    private final String settingsCategorySubtitle;

    @Json(name = "settings_category_title")
    private final String settingsCategoryTitle;

    @Json(name = "settings_subtitle")
    private final String settingsSubtitle;

    @Json(name = "settings_title")
    private final String settingsTitle;

    @Json(name = "subtitle")
    private final String subtitle;

    @Json(name = "title")
    private final String title;

    public /* synthetic */ NfcWatchSettingsConfig(boolean z, String str, String str2, String str3, String str4, String str5, String str6, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, list);
    }

    public static /* synthetic */ NfcWatchSettingsConfig copy$default(NfcWatchSettingsConfig nfcWatchSettingsConfig, boolean z, String str, String str2, String str3, String str4, String str5, String str6, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = nfcWatchSettingsConfig.isEnabled;
        }
        if ((i & 2) != 0) {
            str = nfcWatchSettingsConfig.settingsTitle;
        }
        if ((i & 4) != 0) {
            str2 = nfcWatchSettingsConfig.settingsSubtitle;
        }
        if ((i & 8) != 0) {
            str3 = nfcWatchSettingsConfig.settingsCategoryTitle;
        }
        if ((i & 16) != 0) {
            str4 = nfcWatchSettingsConfig.settingsCategorySubtitle;
        }
        if ((i & 32) != 0) {
            str5 = nfcWatchSettingsConfig.title;
        }
        if ((i & 64) != 0) {
            str6 = nfcWatchSettingsConfig.subtitle;
        }
        if ((i & 128) != 0) {
            list = nfcWatchSettingsConfig.items;
        }
        String str7 = str6;
        List list2 = list;
        String str8 = str4;
        String str9 = str5;
        return nfcWatchSettingsConfig.copy(z, str, str2, str3, str8, str9, str7, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSettingsTitle() {
        return this.settingsTitle;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSettingsSubtitle() {
        return this.settingsSubtitle;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSettingsCategoryTitle() {
        return this.settingsCategoryTitle;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSettingsCategorySubtitle() {
        return this.settingsCategorySubtitle;
    }

    /* renamed from: component6, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component7, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public final List<WatchBanner> component8() {
        return this.items;
    }

    public final NfcWatchSettingsConfig copy(boolean isEnabled, String settingsTitle, String settingsSubtitle, String settingsCategoryTitle, String settingsCategorySubtitle, String title, String subtitle, List<WatchBanner> items) {
        return new NfcWatchSettingsConfig(isEnabled, settingsTitle, settingsSubtitle, settingsCategoryTitle, settingsCategorySubtitle, title, subtitle, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NfcWatchSettingsConfig)) {
            return false;
        }
        NfcWatchSettingsConfig nfcWatchSettingsConfig = (NfcWatchSettingsConfig) other;
        return this.isEnabled == nfcWatchSettingsConfig.isEnabled && jl40.l(this.settingsTitle, nfcWatchSettingsConfig.settingsTitle) && jl40.l(this.settingsSubtitle, nfcWatchSettingsConfig.settingsSubtitle) && jl40.l(this.settingsCategoryTitle, nfcWatchSettingsConfig.settingsCategoryTitle) && jl40.l(this.settingsCategorySubtitle, nfcWatchSettingsConfig.settingsCategorySubtitle) && jl40.l(this.title, nfcWatchSettingsConfig.title) && jl40.l(this.subtitle, nfcWatchSettingsConfig.subtitle) && jl40.l(this.items, nfcWatchSettingsConfig.items);
    }

    public final List<WatchBanner> getItems() {
        return this.items;
    }

    public final String getSettingsCategorySubtitle() {
        return this.settingsCategorySubtitle;
    }

    public final String getSettingsCategoryTitle() {
        return this.settingsCategoryTitle;
    }

    public final String getSettingsSubtitle() {
        return this.settingsSubtitle;
    }

    public final String getSettingsTitle() {
        return this.settingsTitle;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.isEnabled) * 31;
        String str = this.settingsTitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.settingsSubtitle;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.settingsCategoryTitle;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.settingsCategorySubtitle;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.title;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.subtitle;
        return this.items.hashCode() + ((hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public String toString() {
        boolean z = this.isEnabled;
        String str = this.settingsTitle;
        String str2 = this.settingsSubtitle;
        String str3 = this.settingsCategoryTitle;
        String str4 = this.settingsCategorySubtitle;
        String str5 = this.title;
        String str6 = this.subtitle;
        List<WatchBanner> list = this.items;
        StringBuilder v = ly3.v("NfcWatchSettingsConfig(isEnabled=", ", settingsTitle=", str, ", settingsSubtitle=", z);
        g8e.D(v, str2, ", settingsCategoryTitle=", str3, ", settingsCategorySubtitle=");
        g8e.D(v, str4, ", title=", str5, ", subtitle=");
        return tse0.j(str6, ", items=", Extension.C_BRAKE, v, list);
    }

    public NfcWatchSettingsConfig(boolean z, String str, String str2, String str3, String str4, String str5, String str6, List<WatchBanner> list) {
        this.isEnabled = z;
        this.settingsTitle = str;
        this.settingsSubtitle = str2;
        this.settingsCategoryTitle = str3;
        this.settingsCategorySubtitle = str4;
        this.title = str5;
        this.subtitle = str6;
        this.items = list;
    }
}
