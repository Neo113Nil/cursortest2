package com.yandex.go.tariffcard.experiment;

import defpackage.gsq0;
import defpackage.n96;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/tariffcard/experiment/MulticlassCashbackShowExperiment;", "Ln96;", "Companion", "com/yandex/go/tariffcard/experiment/e", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MulticlassCashbackShowExperiment extends n96 {
    public static final e Companion = new e();
    public static final MulticlassCashbackShowExperiment c = new MulticlassCashbackShowExperiment(0);
    public final boolean b;

    public /* synthetic */ MulticlassCashbackShowExperiment(int i, boolean z) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public MulticlassCashbackShowExperiment(int i) {
        this.b = false;
    }

    public MulticlassCashbackShowExperiment() {
        this(0);
    }
}
