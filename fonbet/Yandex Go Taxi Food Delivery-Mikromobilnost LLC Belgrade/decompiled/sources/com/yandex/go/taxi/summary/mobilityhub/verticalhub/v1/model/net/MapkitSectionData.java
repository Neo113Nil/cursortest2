package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net;

import defpackage.gsq0;
import defpackage.qje;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/MapkitSectionData;", "", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/o0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MapkitSectionData {
    public static final o0 Companion = new o0();
    public final MapkitSectionMetadata a;

    public /* synthetic */ MapkitSectionData(int i, MapkitSectionMetadata mapkitSectionMetadata) {
        if (1 == (i & 1)) {
            this.a = mapkitSectionMetadata;
        } else {
            qje.Z(i, 1, MapkitSectionData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public MapkitSectionData(MapkitSectionMetadata mapkitSectionMetadata) {
        this.a = mapkitSectionMetadata;
    }
}
