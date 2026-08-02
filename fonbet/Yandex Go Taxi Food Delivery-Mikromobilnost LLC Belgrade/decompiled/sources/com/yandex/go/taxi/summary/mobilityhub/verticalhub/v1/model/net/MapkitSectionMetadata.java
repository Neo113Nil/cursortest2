package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net;

import defpackage.gsq0;
import defpackage.qje;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/MapkitSectionMetadata;", "", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/p0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MapkitSectionMetadata {
    public static final p0 Companion = new p0();
    public final MapkitWeightData a;
    public final MapkitSectionMetadataData b;

    public /* synthetic */ MapkitSectionMetadata(int i, MapkitWeightData mapkitWeightData, MapkitSectionMetadataData mapkitSectionMetadataData) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, MapkitSectionMetadata$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = mapkitWeightData;
        this.b = mapkitSectionMetadataData;
    }

    public MapkitSectionMetadata(MapkitWeightData mapkitWeightData, MapkitSectionMetadataData mapkitSectionMetadataData) {
        this.a = mapkitWeightData;
        this.b = mapkitSectionMetadataData;
    }
}
