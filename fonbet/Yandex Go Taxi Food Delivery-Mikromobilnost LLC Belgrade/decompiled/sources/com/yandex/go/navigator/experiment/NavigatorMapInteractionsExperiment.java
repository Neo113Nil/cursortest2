package com.yandex.go.navigator.experiment;

import defpackage.gsq0;
import defpackage.w96;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/navigator/experiment/NavigatorMapInteractionsExperiment;", "Lw96;", "Companion", "com/yandex/go/navigator/experiment/e", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NavigatorMapInteractionsExperiment extends w96 {
    public static final e Companion = new e();
    public static final NavigatorMapInteractionsExperiment f = new NavigatorMapInteractionsExperiment(0);
    public static final LongTap g = new LongTap(0);
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final LongTap e;

    public /* synthetic */ NavigatorMapInteractionsExperiment(int i, boolean z, boolean z2, boolean z3, LongTap longTap) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = false;
        } else {
            this.c = z2;
        }
        if ((i & 4) == 0) {
            this.d = false;
        } else {
            this.d = z3;
        }
        if ((i & 8) == 0) {
            this.e = g;
        } else {
            this.e = longTap;
        }
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getC() {
        return this.b;
    }

    public NavigatorMapInteractionsExperiment(int i) {
        this.b = false;
        this.c = false;
        this.d = false;
        this.e = g;
    }

    public NavigatorMapInteractionsExperiment() {
        this(0);
    }
}
