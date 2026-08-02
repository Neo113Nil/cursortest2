package com.yandex.go.benefits_center.benefits.data.experiment;

import defpackage.c6z;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.q03;
import defpackage.w96;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/benefits_center/benefits/data/experiment/BenefitsCenterTitleExperiment;", "Lw96;", "Lc6z;", "Companion", "com/yandex/go/benefits_center/benefits/data/experiment/b", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BenefitsCenterTitleExperiment extends w96 implements c6z {
    public static final b Companion = new b();
    public static final i3y[] e = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new q03(26)), null, null};
    public static final BenefitsCenterTitleExperiment f = new BenefitsCenterTitleExperiment(0);
    public final Map b;
    public final boolean c;
    public final String d;

    public /* synthetic */ BenefitsCenterTitleExperiment(int i, String str, Map map, boolean z) {
        this.b = (i & 1) == 0 ? kotlin.collections.b.f() : map;
        if ((i & 2) == 0) {
            this.c = false;
        } else {
            this.c = z;
        }
        if ((i & 4) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.b;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.c;
    }

    public BenefitsCenterTitleExperiment() {
        this(0);
    }

    public BenefitsCenterTitleExperiment(int i) {
        this.b = kotlin.collections.b.f();
        this.c = false;
        this.d = null;
    }
}
