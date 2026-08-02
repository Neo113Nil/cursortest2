package com.yandex.go.plus.experiment;

import defpackage.gsq0;
import defpackage.xn11;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/plus/experiment/PlusModeExperiment;", "Lxn11;", "Companion", "com/yandex/go/plus/experiment/e", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PlusModeExperiment implements xn11 {
    public static final e Companion = new e();
    public static final PlusModeExperiment d = new PlusModeExperiment(0);
    public final boolean b;
    public final String c;

    public /* synthetic */ PlusModeExperiment(int i, String str, boolean z) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
    }

    public PlusModeExperiment(int i) {
        this.b = false;
        this.c = null;
    }

    public PlusModeExperiment() {
        this(0);
    }
}
