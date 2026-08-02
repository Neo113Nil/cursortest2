package com.yandex.go.scooters.data.model;

import defpackage.gsq0;
import defpackage.w96;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/data/model/ScootersUsePointAExperiment;", "Lw96;", "Companion", "com/yandex/go/scooters/data/model/j0", "$serializer", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ScootersUsePointAExperiment extends w96 {
    public static final j0 Companion = new j0();
    public static final ScootersUsePointAExperiment c = new ScootersUsePointAExperiment(0);
    public final boolean b;

    public /* synthetic */ ScootersUsePointAExperiment(int i, boolean z) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public ScootersUsePointAExperiment(int i) {
        this.b = false;
    }

    public ScootersUsePointAExperiment() {
        this(0);
    }
}
