package com.yandex.go.scooters.passes.data.model;

import defpackage.gsq0;
import defpackage.qje;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/passes/data/model/ScootersPassesUnfreezeParams;", "", "Companion", "$serializer", "com/yandex/go/scooters/passes/data/model/j", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersPassesUnfreezeParams {
    public static final j Companion = new j();
    public final String a;

    public /* synthetic */ ScootersPassesUnfreezeParams(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            qje.Z(i, 1, ScootersPassesUnfreezeParams$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public ScootersPassesUnfreezeParams(String str) {
        this.a = str;
    }
}
