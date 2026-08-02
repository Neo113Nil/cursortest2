package com.yandex.go.tariffcard.experiment;

import defpackage.c6z;
import defpackage.d540;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.n96;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/tariffcard/experiment/MulticlassTariffsUnavailableTextsExperiment;", "Ln96;", "Lc6z;", "Companion", "com/yandex/go/tariffcard/experiment/k", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MulticlassTariffsUnavailableTextsExperiment extends n96 implements c6z {
    public static final k Companion = new k();
    public static final i3y[] f;
    public static final MulticlassTariffsUnavailableTextsExperiment g;
    public final boolean b;
    public final Map c;
    public final Map d;
    public final String e;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new d540(10)), kotlin.a.b(lazyThreadSafetyMode, new d540(11)), null};
        g = new MulticlassTariffsUnavailableTextsExperiment(0);
    }

    public /* synthetic */ MulticlassTariffsUnavailableTextsExperiment(int i, boolean z, Map map, Map map2, String str) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = kotlin.collections.b.f();
        } else {
            this.c = map;
        }
        if ((i & 4) == 0) {
            this.d = kotlin.collections.b.f();
        } else {
            this.d = map2;
        }
        if ((i & 8) == 0) {
            this.e = "";
        } else {
            this.e = str;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getD() {
        return this.c;
    }

    public MulticlassTariffsUnavailableTextsExperiment() {
        this(0);
    }

    public MulticlassTariffsUnavailableTextsExperiment(int i) {
        Map f2 = kotlin.collections.b.f();
        Map f3 = kotlin.collections.b.f();
        this.b = false;
        this.c = f2;
        this.d = f3;
        this.e = "";
    }
}
