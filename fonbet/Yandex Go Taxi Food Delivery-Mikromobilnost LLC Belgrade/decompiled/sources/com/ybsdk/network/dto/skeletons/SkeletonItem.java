package com.ybsdk.network.dto.skeletons;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.divkit.api.data.RawSkeletonId;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J.\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/ybsdk/network/dto/skeletons/SkeletonItem;", "", "skeletonId", "Lcom/ybsdk/feature/divkit/api/data/RawSkeletonId;", "divkitData", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "hash", "", "<init>", "(Ljava/lang/String;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getSkeletonId-6QunHn0", "()Ljava/lang/String;", "Ljava/lang/String;", "getDivkitData", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "getHash", "component1", "component1-6QunHn0", "component2", "component3", "copy", "copy-1Paszng", "(Ljava/lang/String;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;Ljava/lang/String;)Lcom/ybsdk/network/dto/skeletons/SkeletonItem;", "equals", "", "other", "hashCode", "", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SkeletonItem {
    private final DivDataDto divkitData;
    private final String hash;
    private final String skeletonId;

    private SkeletonItem(String str, DivDataDto divDataDto, String str2) {
        this.skeletonId = str;
        this.divkitData = divDataDto;
        this.hash = str2;
    }

    /* renamed from: copy-1Paszng$default, reason: not valid java name */
    public static /* synthetic */ SkeletonItem m470copy1Paszng$default(SkeletonItem skeletonItem, String str, DivDataDto divDataDto, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = skeletonItem.skeletonId;
        }
        if ((i & 2) != 0) {
            divDataDto = skeletonItem.divkitData;
        }
        if ((i & 4) != 0) {
            str2 = skeletonItem.hash;
        }
        return skeletonItem.m472copy1Paszng(str, divDataDto, str2);
    }

    /* renamed from: component1-6QunHn0, reason: not valid java name and from getter */
    public final String getSkeletonId() {
        return this.skeletonId;
    }

    /* renamed from: component2, reason: from getter */
    public final DivDataDto getDivkitData() {
        return this.divkitData;
    }

    /* renamed from: component3, reason: from getter */
    public final String getHash() {
        return this.hash;
    }

    /* renamed from: copy-1Paszng, reason: not valid java name */
    public final SkeletonItem m472copy1Paszng(@Json(name = "skeleton_id") String skeletonId, @Json(name = "divkit_data") DivDataDto divkitData, @Json(name = "hash") String hash) {
        return new SkeletonItem(skeletonId, divkitData, hash, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SkeletonItem)) {
            return false;
        }
        SkeletonItem skeletonItem = (SkeletonItem) other;
        return RawSkeletonId.m435equalsimpl0(this.skeletonId, skeletonItem.skeletonId) && jl40.l(this.divkitData, skeletonItem.divkitData) && jl40.l(this.hash, skeletonItem.hash);
    }

    public final DivDataDto getDivkitData() {
        return this.divkitData;
    }

    public final String getHash() {
        return this.hash;
    }

    /* renamed from: getSkeletonId-6QunHn0, reason: not valid java name */
    public final String m473getSkeletonId6QunHn0() {
        return this.skeletonId;
    }

    public int hashCode() {
        return this.hash.hashCode() + ((this.divkitData.hashCode() + (RawSkeletonId.m436hashCodeimpl(this.skeletonId) * 31)) * 31);
    }

    public String toString() {
        String m437toStringimpl = RawSkeletonId.m437toStringimpl(this.skeletonId);
        DivDataDto divDataDto = this.divkitData;
        String str = this.hash;
        StringBuilder sb = new StringBuilder("SkeletonItem(skeletonId=");
        sb.append(m437toStringimpl);
        sb.append(", divkitData=");
        sb.append(divDataDto);
        sb.append(", hash=");
        return oyr.t(sb, str, Extension.C_BRAKE);
    }

    public /* synthetic */ SkeletonItem(@Json(name = "skeleton_id") String str, @Json(name = "divkit_data") DivDataDto divDataDto, @Json(name = "hash") String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, divDataDto, str2);
    }
}
