package com.yandex.go.walking.navigation.impl.experiment;

import defpackage.gsq0;
import defpackage.n96;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/walking/navigation/impl/experiment/WalkNavExperiment;", "Ln96;", "Companion", "com/yandex/go/walking/navigation/impl/experiment/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class WalkNavExperiment extends n96 {
    public static final a Companion = new a();
    public static final WalkNavExperiment e = new WalkNavExperiment(0);
    public final boolean b;
    public final int c;
    public final int d;

    public /* synthetic */ WalkNavExperiment(int i, int i2, int i3, boolean z) {
        this.b = (i & 1) == 0 ? false : z;
        this.c = (i & 2) == 0 ? 60 : i2;
        if ((i & 4) == 0) {
            this.d = 5;
        } else {
            this.d = i3;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public WalkNavExperiment(int i) {
        this.b = false;
        this.c = 60;
        this.d = 5;
    }

    public WalkNavExperiment() {
        this(0);
    }
}
