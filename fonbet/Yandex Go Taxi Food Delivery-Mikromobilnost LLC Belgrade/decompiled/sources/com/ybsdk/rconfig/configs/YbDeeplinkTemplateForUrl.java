package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/rconfig/configs/YbDeeplinkTemplateForUrl;", "", "regex", "", "deeplinkTemplate", "originRegex", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRegex", "()Ljava/lang/String;", "getDeeplinkTemplate", "getOriginRegex", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class YbDeeplinkTemplateForUrl {

    @Json(name = "deeplink_template")
    private final String deeplinkTemplate;

    @Json(name = "origin_regex")
    private final String originRegex;

    @Json(name = "regex")
    private final String regex;

    public YbDeeplinkTemplateForUrl(String str, String str2, String str3) {
        this.regex = str;
        this.deeplinkTemplate = str2;
        this.originRegex = str3;
    }

    public static /* synthetic */ YbDeeplinkTemplateForUrl copy$default(YbDeeplinkTemplateForUrl ybDeeplinkTemplateForUrl, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ybDeeplinkTemplateForUrl.regex;
        }
        if ((i & 2) != 0) {
            str2 = ybDeeplinkTemplateForUrl.deeplinkTemplate;
        }
        if ((i & 4) != 0) {
            str3 = ybDeeplinkTemplateForUrl.originRegex;
        }
        return ybDeeplinkTemplateForUrl.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getRegex() {
        return this.regex;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDeeplinkTemplate() {
        return this.deeplinkTemplate;
    }

    /* renamed from: component3, reason: from getter */
    public final String getOriginRegex() {
        return this.originRegex;
    }

    public final YbDeeplinkTemplateForUrl copy(String regex, String deeplinkTemplate, String originRegex) {
        return new YbDeeplinkTemplateForUrl(regex, deeplinkTemplate, originRegex);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof YbDeeplinkTemplateForUrl)) {
            return false;
        }
        YbDeeplinkTemplateForUrl ybDeeplinkTemplateForUrl = (YbDeeplinkTemplateForUrl) other;
        return jl40.l(this.regex, ybDeeplinkTemplateForUrl.regex) && jl40.l(this.deeplinkTemplate, ybDeeplinkTemplateForUrl.deeplinkTemplate) && jl40.l(this.originRegex, ybDeeplinkTemplateForUrl.originRegex);
    }

    public final String getDeeplinkTemplate() {
        return this.deeplinkTemplate;
    }

    public final String getOriginRegex() {
        return this.originRegex;
    }

    public final String getRegex() {
        return this.regex;
    }

    public int hashCode() {
        int b = unr0.b(this.regex.hashCode() * 31, 31, this.deeplinkTemplate);
        String str = this.originRegex;
        return b + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.regex;
        String str2 = this.deeplinkTemplate;
        return oyr.t(b64.v("YbDeeplinkTemplateForUrl(regex=", str, ", deeplinkTemplate=", str2, ", originRegex="), this.originRegex, Extension.C_BRAKE);
    }
}
