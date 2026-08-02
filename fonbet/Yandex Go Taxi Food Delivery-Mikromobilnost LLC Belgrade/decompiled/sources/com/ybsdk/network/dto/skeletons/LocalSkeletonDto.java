package com.ybsdk.network.dto.skeletons;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.divkit.api.data.RawSkeletonId;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\r\u0010\tJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J$\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/network/dto/skeletons/LocalSkeletonDto;", "", "skeletonId", "Lcom/ybsdk/feature/divkit/api/data/RawSkeletonId;", "hash", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getSkeletonId-6QunHn0", "()Ljava/lang/String;", "Ljava/lang/String;", "getHash", "component1", "component1-6QunHn0", "component2", "copy", "copy-EVaZr64", "(Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/network/dto/skeletons/LocalSkeletonDto;", "equals", "", "other", "hashCode", "", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class LocalSkeletonDto {
    private final String hash;
    private final String skeletonId;

    private LocalSkeletonDto(String str, String str2) {
        this.skeletonId = str;
        this.hash = str2;
    }

    /* renamed from: copy-EVaZr64$default, reason: not valid java name */
    public static /* synthetic */ LocalSkeletonDto m466copyEVaZr64$default(LocalSkeletonDto localSkeletonDto, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = localSkeletonDto.skeletonId;
        }
        if ((i & 2) != 0) {
            str2 = localSkeletonDto.hash;
        }
        return localSkeletonDto.m468copyEVaZr64(str, str2);
    }

    /* renamed from: component1-6QunHn0, reason: not valid java name and from getter */
    public final String getSkeletonId() {
        return this.skeletonId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getHash() {
        return this.hash;
    }

    /* renamed from: copy-EVaZr64, reason: not valid java name */
    public final LocalSkeletonDto m468copyEVaZr64(@Json(name = "skeleton_id") String skeletonId, @Json(name = "hash") String hash) {
        return new LocalSkeletonDto(skeletonId, hash, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalSkeletonDto)) {
            return false;
        }
        LocalSkeletonDto localSkeletonDto = (LocalSkeletonDto) other;
        return RawSkeletonId.m435equalsimpl0(this.skeletonId, localSkeletonDto.skeletonId) && jl40.l(this.hash, localSkeletonDto.hash);
    }

    public final String getHash() {
        return this.hash;
    }

    /* renamed from: getSkeletonId-6QunHn0, reason: not valid java name */
    public final String m469getSkeletonId6QunHn0() {
        return this.skeletonId;
    }

    public int hashCode() {
        return this.hash.hashCode() + (RawSkeletonId.m436hashCodeimpl(this.skeletonId) * 31);
    }

    public String toString() {
        return unr0.p("LocalSkeletonDto(skeletonId=", RawSkeletonId.m437toStringimpl(this.skeletonId), ", hash=", this.hash, Extension.C_BRAKE);
    }

    public /* synthetic */ LocalSkeletonDto(@Json(name = "skeleton_id") String str, @Json(name = "hash") String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }
}
