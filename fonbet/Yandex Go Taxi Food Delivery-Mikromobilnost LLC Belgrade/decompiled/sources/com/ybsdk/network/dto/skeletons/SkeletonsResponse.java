package com.ybsdk.network.dto.skeletons;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.divkit.api.data.RawSkeletonId;
import com.ybsdk.feature.divkit.api.data.SkeletonAliases;
import defpackage.jl40;
import defpackage.qv10;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003J5\u0010\u0013\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/network/dto/skeletons/SkeletonsResponse;", "", "skeletons", "", "Lcom/ybsdk/network/dto/skeletons/SkeletonItem;", "skeletonsToDelete", "Lcom/ybsdk/feature/divkit/api/data/RawSkeletonId;", "aliases", "Lcom/ybsdk/feature/divkit/api/data/SkeletonAliases;", "<init>", "(Ljava/util/List;Ljava/util/List;Lcom/ybsdk/feature/divkit/api/data/SkeletonAliases;)V", "getSkeletons", "()Ljava/util/List;", "getSkeletonsToDelete", "getAliases", "()Lcom/ybsdk/feature/divkit/api/data/SkeletonAliases;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SkeletonsResponse {
    private final SkeletonAliases aliases;
    private final List<SkeletonItem> skeletons;
    private final List<RawSkeletonId> skeletonsToDelete;

    public SkeletonsResponse(@Json(name = "skeletons") List<SkeletonItem> list, @Json(name = "skeletons_to_delete") List<RawSkeletonId> list2, @Json(name = "aliases") SkeletonAliases skeletonAliases) {
        this.skeletons = list;
        this.skeletonsToDelete = list2;
        this.aliases = skeletonAliases;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SkeletonsResponse copy$default(SkeletonsResponse skeletonsResponse, List list, List list2, SkeletonAliases skeletonAliases, int i, Object obj) {
        if ((i & 1) != 0) {
            list = skeletonsResponse.skeletons;
        }
        if ((i & 2) != 0) {
            list2 = skeletonsResponse.skeletonsToDelete;
        }
        if ((i & 4) != 0) {
            skeletonAliases = skeletonsResponse.aliases;
        }
        return skeletonsResponse.copy(list, list2, skeletonAliases);
    }

    public final List<SkeletonItem> component1() {
        return this.skeletons;
    }

    public final List<RawSkeletonId> component2() {
        return this.skeletonsToDelete;
    }

    /* renamed from: component3, reason: from getter */
    public final SkeletonAliases getAliases() {
        return this.aliases;
    }

    public final SkeletonsResponse copy(@Json(name = "skeletons") List<SkeletonItem> skeletons, @Json(name = "skeletons_to_delete") List<RawSkeletonId> skeletonsToDelete, @Json(name = "aliases") SkeletonAliases aliases) {
        return new SkeletonsResponse(skeletons, skeletonsToDelete, aliases);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SkeletonsResponse)) {
            return false;
        }
        SkeletonsResponse skeletonsResponse = (SkeletonsResponse) other;
        return jl40.l(this.skeletons, skeletonsResponse.skeletons) && jl40.l(this.skeletonsToDelete, skeletonsResponse.skeletonsToDelete) && jl40.l(this.aliases, skeletonsResponse.aliases);
    }

    public final SkeletonAliases getAliases() {
        return this.aliases;
    }

    public final List<SkeletonItem> getSkeletons() {
        return this.skeletons;
    }

    public final List<RawSkeletonId> getSkeletonsToDelete() {
        return this.skeletonsToDelete;
    }

    public int hashCode() {
        int c = unr0.c(this.skeletons.hashCode() * 31, 31, this.skeletonsToDelete);
        SkeletonAliases skeletonAliases = this.aliases;
        return c + (skeletonAliases == null ? 0 : skeletonAliases.hashCode());
    }

    public String toString() {
        List<SkeletonItem> list = this.skeletons;
        List<RawSkeletonId> list2 = this.skeletonsToDelete;
        SkeletonAliases skeletonAliases = this.aliases;
        StringBuilder v = qv10.v("SkeletonsResponse(skeletons=", list, ", skeletonsToDelete=", list2, ", aliases=");
        v.append(skeletonAliases);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
