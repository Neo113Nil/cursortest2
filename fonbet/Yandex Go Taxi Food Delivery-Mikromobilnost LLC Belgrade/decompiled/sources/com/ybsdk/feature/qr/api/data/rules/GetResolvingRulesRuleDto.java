package com.ybsdk.feature.qr.api.data.rules;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.xvz;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/feature/qr/api/data/rules/GetResolvingRulesRuleDto;", "", "regexes", "", "", "category", "deeplinkTemplate", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getRegexes", "()Ljava/util/List;", "getCategory", "()Ljava/lang/String;", "getDeeplinkTemplate", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-qr-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GetResolvingRulesRuleDto {
    private final String category;
    private final String deeplinkTemplate;
    private final List<String> regexes;

    public GetResolvingRulesRuleDto(@Json(name = "regexes") List<String> list, @Json(name = "category") String str, @Json(name = "deeplink_template") String str2) {
        this.regexes = list;
        this.category = str;
        this.deeplinkTemplate = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetResolvingRulesRuleDto copy$default(GetResolvingRulesRuleDto getResolvingRulesRuleDto, List list, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = getResolvingRulesRuleDto.regexes;
        }
        if ((i & 2) != 0) {
            str = getResolvingRulesRuleDto.category;
        }
        if ((i & 4) != 0) {
            str2 = getResolvingRulesRuleDto.deeplinkTemplate;
        }
        return getResolvingRulesRuleDto.copy(list, str, str2);
    }

    public final List<String> component1() {
        return this.regexes;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDeeplinkTemplate() {
        return this.deeplinkTemplate;
    }

    public final GetResolvingRulesRuleDto copy(@Json(name = "regexes") List<String> regexes, @Json(name = "category") String category, @Json(name = "deeplink_template") String deeplinkTemplate) {
        return new GetResolvingRulesRuleDto(regexes, category, deeplinkTemplate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetResolvingRulesRuleDto)) {
            return false;
        }
        GetResolvingRulesRuleDto getResolvingRulesRuleDto = (GetResolvingRulesRuleDto) other;
        return jl40.l(this.regexes, getResolvingRulesRuleDto.regexes) && jl40.l(this.category, getResolvingRulesRuleDto.category) && jl40.l(this.deeplinkTemplate, getResolvingRulesRuleDto.deeplinkTemplate);
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getDeeplinkTemplate() {
        return this.deeplinkTemplate;
    }

    public final List<String> getRegexes() {
        return this.regexes;
    }

    public int hashCode() {
        return this.deeplinkTemplate.hashCode() + unr0.b(this.regexes.hashCode() * 31, 31, this.category);
    }

    public String toString() {
        List<String> list = this.regexes;
        String str = this.category;
        return oyr.t(xvz.s("GetResolvingRulesRuleDto(regexes=", list, ", category=", str, ", deeplinkTemplate="), this.deeplinkTemplate, Extension.C_BRAKE);
    }
}
