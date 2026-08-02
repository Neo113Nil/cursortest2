package com.ybsdk.network.dto.skeletons;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.xvz;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/network/dto/skeletons/SkeletonsRequest;", "", "localSkeletonDtos", "", "Lcom/ybsdk/network/dto/skeletons/LocalSkeletonDto;", "aliasesHash", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getLocalSkeletonDtos", "()Ljava/util/List;", "getAliasesHash", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class SkeletonsRequest {
    private final String aliasesHash;
    private final List<LocalSkeletonDto> localSkeletonDtos;

    public SkeletonsRequest(@Json(name = "local_skeletons") List<LocalSkeletonDto> list, @Json(name = "aliases_hash") String str) {
        this.localSkeletonDtos = list;
        this.aliasesHash = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SkeletonsRequest copy$default(SkeletonsRequest skeletonsRequest, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = skeletonsRequest.localSkeletonDtos;
        }
        if ((i & 2) != 0) {
            str = skeletonsRequest.aliasesHash;
        }
        return skeletonsRequest.copy(list, str);
    }

    public final List<LocalSkeletonDto> component1() {
        return this.localSkeletonDtos;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAliasesHash() {
        return this.aliasesHash;
    }

    public final SkeletonsRequest copy(@Json(name = "local_skeletons") List<LocalSkeletonDto> localSkeletonDtos, @Json(name = "aliases_hash") String aliasesHash) {
        return new SkeletonsRequest(localSkeletonDtos, aliasesHash);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SkeletonsRequest)) {
            return false;
        }
        SkeletonsRequest skeletonsRequest = (SkeletonsRequest) other;
        return jl40.l(this.localSkeletonDtos, skeletonsRequest.localSkeletonDtos) && jl40.l(this.aliasesHash, skeletonsRequest.aliasesHash);
    }

    public final String getAliasesHash() {
        return this.aliasesHash;
    }

    public final List<LocalSkeletonDto> getLocalSkeletonDtos() {
        return this.localSkeletonDtos;
    }

    public int hashCode() {
        int hashCode = this.localSkeletonDtos.hashCode() * 31;
        String str = this.aliasesHash;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return xvz.i("SkeletonsRequest(localSkeletonDtos=", ", aliasesHash=", this.aliasesHash, Extension.C_BRAKE, this.localSkeletonDtos);
    }
}
