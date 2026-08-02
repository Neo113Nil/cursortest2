package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b*\b\u0081\b\u0018\u00002\u00020\u0001:\u000223Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0016J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0016J|\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010\u0014J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b\u0003\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0014R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010\u0018R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b.\u0010\u001aR\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b/\u0010\u0016R\u001c\u0010\r\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b0\u0010\u001aR\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b1\u0010\u0016¨\u00064"}, d2 = {"Lcom/ybsdk/rconfig/configs/YbSdkRtmConfig;", "", "", "isEnabled", "", "projectName", "", "Lcom/ybsdk/rconfig/configs/YbSdkRtmConfig$SdkRtmBlackListItem;", "blackList", "trimAdditionalEnabled", "", "maxAdditionalLength", "additionalToTrim", "truncatedSize", "importantFields", "<init>", "(ZLjava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/List;", "component4", "()Ljava/lang/Boolean;", "component5", "()Ljava/lang/Integer;", "component6", "component7", "component8", "copy", "(ZLjava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;)Lcom/ybsdk/rconfig/configs/YbSdkRtmConfig;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "Ljava/lang/String;", "getProjectName", "Ljava/util/List;", "getBlackList", "Ljava/lang/Boolean;", "getTrimAdditionalEnabled", "Ljava/lang/Integer;", "getMaxAdditionalLength", "getAdditionalToTrim", "getTruncatedSize", "getImportantFields", "SdkRtmBlackListItem", "AdditionalRegex", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class YbSdkRtmConfig {

    @Json(name = "additional_to_trim")
    private final List<String> additionalToTrim;

    @Json(name = "blacklist")
    private final List<SdkRtmBlackListItem> blackList;

    @Json(name = "important_fields")
    private final List<String> importantFields;

    @Json(name = "is_enabled")
    private final boolean isEnabled;

    @Json(name = "max_additional_length")
    private final Integer maxAdditionalLength;

    @Json(name = "project_name")
    private final String projectName;

    @Json(name = "trim_additional_enabled")
    private final Boolean trimAdditionalEnabled;

    @Json(name = "truncated_size")
    private final Integer truncatedSize;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/rconfig/configs/YbSdkRtmConfig$AdditionalRegex;", "", "key", "", "regex", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getRegex", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AdditionalRegex {

        @Json(name = "key")
        private final String key;

        @Json(name = "regex")
        private final String regex;

        public AdditionalRegex(String str, String str2) {
            this.key = str;
            this.regex = str2;
        }

        public static /* synthetic */ AdditionalRegex copy$default(AdditionalRegex additionalRegex, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = additionalRegex.key;
            }
            if ((i & 2) != 0) {
                str2 = additionalRegex.regex;
            }
            return additionalRegex.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        /* renamed from: component2, reason: from getter */
        public final String getRegex() {
            return this.regex;
        }

        public final AdditionalRegex copy(String key, String regex) {
            return new AdditionalRegex(key, regex);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AdditionalRegex)) {
                return false;
            }
            AdditionalRegex additionalRegex = (AdditionalRegex) other;
            return jl40.l(this.key, additionalRegex.key) && jl40.l(this.regex, additionalRegex.regex);
        }

        public final String getKey() {
            return this.key;
        }

        public final String getRegex() {
            return this.regex;
        }

        public int hashCode() {
            return this.regex.hashCode() + (this.key.hashCode() * 31);
        }

        public String toString() {
            return unr0.p("AdditionalRegex(key=", this.key, ", regex=", this.regex, Extension.C_BRAKE);
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/ybsdk/rconfig/configs/YbSdkRtmConfig$SdkRtmBlackListItem;", "", "titleRegex", "", "urlRegex", "additionalRegexes", "", "Lcom/ybsdk/rconfig/configs/YbSdkRtmConfig$AdditionalRegex;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getTitleRegex", "()Ljava/lang/String;", "getUrlRegex", "getAdditionalRegexes", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SdkRtmBlackListItem {

        @Json(name = "additional_regexes")
        private final List<AdditionalRegex> additionalRegexes;

        @Json(name = "title_regex")
        private final String titleRegex;

        @Json(name = "url_regex")
        private final String urlRegex;

        public SdkRtmBlackListItem(String str, String str2, List<AdditionalRegex> list) {
            this.titleRegex = str;
            this.urlRegex = str2;
            this.additionalRegexes = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SdkRtmBlackListItem copy$default(SdkRtmBlackListItem sdkRtmBlackListItem, String str, String str2, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sdkRtmBlackListItem.titleRegex;
            }
            if ((i & 2) != 0) {
                str2 = sdkRtmBlackListItem.urlRegex;
            }
            if ((i & 4) != 0) {
                list = sdkRtmBlackListItem.additionalRegexes;
            }
            return sdkRtmBlackListItem.copy(str, str2, list);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitleRegex() {
            return this.titleRegex;
        }

        /* renamed from: component2, reason: from getter */
        public final String getUrlRegex() {
            return this.urlRegex;
        }

        public final List<AdditionalRegex> component3() {
            return this.additionalRegexes;
        }

        public final SdkRtmBlackListItem copy(String titleRegex, String urlRegex, List<AdditionalRegex> additionalRegexes) {
            return new SdkRtmBlackListItem(titleRegex, urlRegex, additionalRegexes);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SdkRtmBlackListItem)) {
                return false;
            }
            SdkRtmBlackListItem sdkRtmBlackListItem = (SdkRtmBlackListItem) other;
            return jl40.l(this.titleRegex, sdkRtmBlackListItem.titleRegex) && jl40.l(this.urlRegex, sdkRtmBlackListItem.urlRegex) && jl40.l(this.additionalRegexes, sdkRtmBlackListItem.additionalRegexes);
        }

        public final List<AdditionalRegex> getAdditionalRegexes() {
            return this.additionalRegexes;
        }

        public final String getTitleRegex() {
            return this.titleRegex;
        }

        public final String getUrlRegex() {
            return this.urlRegex;
        }

        public int hashCode() {
            String str = this.titleRegex;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.urlRegex;
            return this.additionalRegexes.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public String toString() {
            String str = this.titleRegex;
            String str2 = this.urlRegex;
            return ly3.s(b64.v("SdkRtmBlackListItem(titleRegex=", str, ", urlRegex=", str2, ", additionalRegexes="), this.additionalRegexes, Extension.C_BRAKE);
        }
    }

    public YbSdkRtmConfig(boolean z, String str, List<SdkRtmBlackListItem> list, Boolean bool, Integer num, List<String> list2, Integer num2, List<String> list3) {
        this.isEnabled = z;
        this.projectName = str;
        this.blackList = list;
        this.trimAdditionalEnabled = bool;
        this.maxAdditionalLength = num;
        this.additionalToTrim = list2;
        this.truncatedSize = num2;
        this.importantFields = list3;
    }

    public static /* synthetic */ YbSdkRtmConfig copy$default(YbSdkRtmConfig ybSdkRtmConfig, boolean z, String str, List list, Boolean bool, Integer num, List list2, Integer num2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = ybSdkRtmConfig.isEnabled;
        }
        if ((i & 2) != 0) {
            str = ybSdkRtmConfig.projectName;
        }
        if ((i & 4) != 0) {
            list = ybSdkRtmConfig.blackList;
        }
        if ((i & 8) != 0) {
            bool = ybSdkRtmConfig.trimAdditionalEnabled;
        }
        if ((i & 16) != 0) {
            num = ybSdkRtmConfig.maxAdditionalLength;
        }
        if ((i & 32) != 0) {
            list2 = ybSdkRtmConfig.additionalToTrim;
        }
        if ((i & 64) != 0) {
            num2 = ybSdkRtmConfig.truncatedSize;
        }
        if ((i & 128) != 0) {
            list3 = ybSdkRtmConfig.importantFields;
        }
        Integer num3 = num2;
        List list4 = list3;
        Integer num4 = num;
        List list5 = list2;
        return ybSdkRtmConfig.copy(z, str, list, bool, num4, list5, num3, list4);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final String getProjectName() {
        return this.projectName;
    }

    public final List<SdkRtmBlackListItem> component3() {
        return this.blackList;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getTrimAdditionalEnabled() {
        return this.trimAdditionalEnabled;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getMaxAdditionalLength() {
        return this.maxAdditionalLength;
    }

    public final List<String> component6() {
        return this.additionalToTrim;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getTruncatedSize() {
        return this.truncatedSize;
    }

    public final List<String> component8() {
        return this.importantFields;
    }

    public final YbSdkRtmConfig copy(boolean isEnabled, String projectName, List<SdkRtmBlackListItem> blackList, Boolean trimAdditionalEnabled, Integer maxAdditionalLength, List<String> additionalToTrim, Integer truncatedSize, List<String> importantFields) {
        return new YbSdkRtmConfig(isEnabled, projectName, blackList, trimAdditionalEnabled, maxAdditionalLength, additionalToTrim, truncatedSize, importantFields);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof YbSdkRtmConfig)) {
            return false;
        }
        YbSdkRtmConfig ybSdkRtmConfig = (YbSdkRtmConfig) other;
        return this.isEnabled == ybSdkRtmConfig.isEnabled && jl40.l(this.projectName, ybSdkRtmConfig.projectName) && jl40.l(this.blackList, ybSdkRtmConfig.blackList) && jl40.l(this.trimAdditionalEnabled, ybSdkRtmConfig.trimAdditionalEnabled) && jl40.l(this.maxAdditionalLength, ybSdkRtmConfig.maxAdditionalLength) && jl40.l(this.additionalToTrim, ybSdkRtmConfig.additionalToTrim) && jl40.l(this.truncatedSize, ybSdkRtmConfig.truncatedSize) && jl40.l(this.importantFields, ybSdkRtmConfig.importantFields);
    }

    public final List<String> getAdditionalToTrim() {
        return this.additionalToTrim;
    }

    public final List<SdkRtmBlackListItem> getBlackList() {
        return this.blackList;
    }

    public final List<String> getImportantFields() {
        return this.importantFields;
    }

    public final Integer getMaxAdditionalLength() {
        return this.maxAdditionalLength;
    }

    public final String getProjectName() {
        return this.projectName;
    }

    public final Boolean getTrimAdditionalEnabled() {
        return this.trimAdditionalEnabled;
    }

    public final Integer getTruncatedSize() {
        return this.truncatedSize;
    }

    public int hashCode() {
        int c = unr0.c(unr0.b(Boolean.hashCode(this.isEnabled) * 31, 31, this.projectName), 31, this.blackList);
        Boolean bool = this.trimAdditionalEnabled;
        int hashCode = (c + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.maxAdditionalLength;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<String> list = this.additionalToTrim;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.truncatedSize;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<String> list2 = this.importantFields;
        return hashCode4 + (list2 != null ? list2.hashCode() : 0);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public String toString() {
        boolean z = this.isEnabled;
        String str = this.projectName;
        List<SdkRtmBlackListItem> list = this.blackList;
        Boolean bool = this.trimAdditionalEnabled;
        Integer num = this.maxAdditionalLength;
        List<String> list2 = this.additionalToTrim;
        Integer num2 = this.truncatedSize;
        List<String> list3 = this.importantFields;
        StringBuilder v = ly3.v("YbSdkRtmConfig(isEnabled=", ", projectName=", str, ", blackList=", z);
        v.append(list);
        v.append(", trimAdditionalEnabled=");
        v.append(bool);
        v.append(", maxAdditionalLength=");
        v.append(num);
        v.append(", additionalToTrim=");
        v.append(list2);
        v.append(", truncatedSize=");
        v.append(num2);
        v.append(", importantFields=");
        v.append(list3);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
