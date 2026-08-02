package com.ybsdk.feature.qr.api.data.resolve;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.xvz;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/feature/qr/api/data/resolve/ResolveQrResponseDto;", "", "deeplinks", "", "", "qrType", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getDeeplinks", "()Ljava/util/List;", "getQrType", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-qr-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ResolveQrResponseDto {
    private final List<String> deeplinks;
    private final String qrType;

    public ResolveQrResponseDto(@Json(name = "deeplinks") List<String> list, @Json(name = "qr_type") String str) {
        this.deeplinks = list;
        this.qrType = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ResolveQrResponseDto copy$default(ResolveQrResponseDto resolveQrResponseDto, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = resolveQrResponseDto.deeplinks;
        }
        if ((i & 2) != 0) {
            str = resolveQrResponseDto.qrType;
        }
        return resolveQrResponseDto.copy(list, str);
    }

    public final List<String> component1() {
        return this.deeplinks;
    }

    /* renamed from: component2, reason: from getter */
    public final String getQrType() {
        return this.qrType;
    }

    public final ResolveQrResponseDto copy(@Json(name = "deeplinks") List<String> deeplinks, @Json(name = "qr_type") String qrType) {
        return new ResolveQrResponseDto(deeplinks, qrType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResolveQrResponseDto)) {
            return false;
        }
        ResolveQrResponseDto resolveQrResponseDto = (ResolveQrResponseDto) other;
        return jl40.l(this.deeplinks, resolveQrResponseDto.deeplinks) && jl40.l(this.qrType, resolveQrResponseDto.qrType);
    }

    public final List<String> getDeeplinks() {
        return this.deeplinks;
    }

    public final String getQrType() {
        return this.qrType;
    }

    public int hashCode() {
        int hashCode = this.deeplinks.hashCode() * 31;
        String str = this.qrType;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return xvz.i("ResolveQrResponseDto(deeplinks=", ", qrType=", this.qrType, Extension.C_BRAKE, this.deeplinks);
    }
}
