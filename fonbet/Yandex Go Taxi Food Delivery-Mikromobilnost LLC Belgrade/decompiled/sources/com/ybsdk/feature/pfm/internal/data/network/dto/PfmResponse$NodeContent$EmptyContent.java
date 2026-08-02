package com.ybsdk.feature.pfm.internal.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.pfm.internal.data.network.dto.PfmResponse;
import defpackage.icb0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"com/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$NodeContent$EmptyContent", "Licb0;", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$NodeType;", "nodeType", "<init>", "(Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$NodeType;)V", "component1", "()Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$NodeType;", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$NodeContent$EmptyContent;", "copy", "(Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$NodeType;)Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$NodeContent$EmptyContent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$NodeType;", "getNodeType", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PfmResponse$NodeContent$EmptyContent implements icb0 {
    private final PfmResponse.NodeType nodeType;

    public PfmResponse$NodeContent$EmptyContent(@Json(name = "node_type") PfmResponse.NodeType nodeType) {
        this.nodeType = nodeType;
    }

    public static /* synthetic */ PfmResponse$NodeContent$EmptyContent copy$default(PfmResponse$NodeContent$EmptyContent pfmResponse$NodeContent$EmptyContent, PfmResponse.NodeType nodeType, int i, Object obj) {
        if ((i & 1) != 0) {
            nodeType = pfmResponse$NodeContent$EmptyContent.nodeType;
        }
        return pfmResponse$NodeContent$EmptyContent.copy(nodeType);
    }

    /* renamed from: component1, reason: from getter */
    public final PfmResponse.NodeType getNodeType() {
        return this.nodeType;
    }

    public final PfmResponse$NodeContent$EmptyContent copy(@Json(name = "node_type") PfmResponse.NodeType nodeType) {
        return new PfmResponse$NodeContent$EmptyContent(nodeType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PfmResponse$NodeContent$EmptyContent) && this.nodeType == ((PfmResponse$NodeContent$EmptyContent) other).nodeType;
    }

    public final PfmResponse.NodeType getNodeType() {
        return this.nodeType;
    }

    public int hashCode() {
        return this.nodeType.hashCode();
    }

    public String toString() {
        return "EmptyContent(nodeType=" + this.nodeType + Extension.C_BRAKE;
    }
}
