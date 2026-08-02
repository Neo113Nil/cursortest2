package com.yandex.go.scooters.passes.experiments.model;

import defpackage.gsq0;
import defpackage.w96;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/passes/experiments/model/ScootersFireworkForSuperPassPurchaseExperiment;", "Lw96;", "Companion", "com/yandex/go/scooters/passes/experiments/model/a", "$serializer", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ScootersFireworkForSuperPassPurchaseExperiment extends w96 {
    public static final a Companion = new a();
    public static final ScootersFireworkForSuperPassPurchaseExperiment d = new ScootersFireworkForSuperPassPurchaseExperiment(0);
    public final boolean b;
    public final String c;

    public /* synthetic */ ScootersFireworkForSuperPassPurchaseExperiment(int i, String str, boolean z) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = "";
        } else {
            this.c = str;
        }
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public ScootersFireworkForSuperPassPurchaseExperiment(int i) {
        this.b = false;
        this.c = "";
    }

    public ScootersFireworkForSuperPassPurchaseExperiment() {
        this(0);
    }
}
