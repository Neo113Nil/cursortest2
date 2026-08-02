package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.kr00;
import defpackage.qje;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/MapkitSectionMetadataData;", "", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/q0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MapkitSectionMetadataData {
    public static final q0 Companion = new q0();
    public static final i3y[] f = {null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new kr00(13))};
    public final kotlinx.serialization.json.c a;
    public final kotlinx.serialization.json.c b;
    public final kotlinx.serialization.json.c c;
    public final kotlinx.serialization.json.c d;
    public final List e;

    public /* synthetic */ MapkitSectionMetadataData(int i, kotlinx.serialization.json.c cVar, kotlinx.serialization.json.c cVar2, kotlinx.serialization.json.c cVar3, kotlinx.serialization.json.c cVar4, List list) {
        if (31 != (i & 31)) {
            qje.Z(i, 31, MapkitSectionMetadataData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = cVar;
        this.b = cVar2;
        this.c = cVar3;
        this.d = cVar4;
        this.e = list;
    }

    public MapkitSectionMetadataData(kotlinx.serialization.json.c cVar, kotlinx.serialization.json.c cVar2, kotlinx.serialization.json.c cVar3, kotlinx.serialization.json.c cVar4, ArrayList arrayList) {
        this.a = cVar;
        this.b = cVar2;
        this.c = cVar3;
        this.d = cVar4;
        this.e = arrayList;
    }
}
