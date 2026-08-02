package com.ybsdk.feature.qr.api.data.rules;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.xvz;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/qr/api/data/rules/GetResolvingRulesResponseDto;", "", "rules", "", "Lcom/ybsdk/feature/qr/api/data/rules/GetResolvingRulesRuleDto;", "unknownQrDeeplink", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getRules", "()Ljava/util/List;", "getUnknownQrDeeplink", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-qr-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GetResolvingRulesResponseDto {
    private final List<GetResolvingRulesRuleDto> rules;
    private final String unknownQrDeeplink;

    public GetResolvingRulesResponseDto(@Json(name = "rules") List<GetResolvingRulesRuleDto> list, @Json(name = "unknown_qr_deeplink") String str) {
        this.rules = list;
        this.unknownQrDeeplink = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetResolvingRulesResponseDto copy$default(GetResolvingRulesResponseDto getResolvingRulesResponseDto, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = getResolvingRulesResponseDto.rules;
        }
        if ((i & 2) != 0) {
            str = getResolvingRulesResponseDto.unknownQrDeeplink;
        }
        return getResolvingRulesResponseDto.copy(list, str);
    }

    public final List<GetResolvingRulesRuleDto> component1() {
        return this.rules;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUnknownQrDeeplink() {
        return this.unknownQrDeeplink;
    }

    public final GetResolvingRulesResponseDto copy(@Json(name = "rules") List<GetResolvingRulesRuleDto> rules, @Json(name = "unknown_qr_deeplink") String unknownQrDeeplink) {
        return new GetResolvingRulesResponseDto(rules, unknownQrDeeplink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetResolvingRulesResponseDto)) {
            return false;
        }
        GetResolvingRulesResponseDto getResolvingRulesResponseDto = (GetResolvingRulesResponseDto) other;
        return jl40.l(this.rules, getResolvingRulesResponseDto.rules) && jl40.l(this.unknownQrDeeplink, getResolvingRulesResponseDto.unknownQrDeeplink);
    }

    public final List<GetResolvingRulesRuleDto> getRules() {
        return this.rules;
    }

    public final String getUnknownQrDeeplink() {
        return this.unknownQrDeeplink;
    }

    public int hashCode() {
        return this.unknownQrDeeplink.hashCode() + (this.rules.hashCode() * 31);
    }

    public String toString() {
        return xvz.i("GetResolvingRulesResponseDto(rules=", ", unknownQrDeeplink=", this.unknownQrDeeplink, Extension.C_BRAKE, this.rules);
    }
}
