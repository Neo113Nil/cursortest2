package com.yandex.go.due.experiment;

import defpackage.b64;
import defpackage.c6z;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jee0;
import defpackage.jl40;
import defpackage.n96;
import defpackage.nnm;
import defpackage.unr0;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/due/experiment/PreorderTitleByTariffExperiment;", "Ln96;", "Lc6z;", "Companion", "com/yandex/go/due/experiment/d", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PreorderTitleByTariffExperiment extends n96 implements c6z {
    public static final d Companion = new d();
    public static final i3y[] e;
    public static final PreorderTitleByTariffExperiment f;
    public final boolean b;
    public final Map c;
    public final Map d;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new jee0(20)), kotlin.a.b(lazyThreadSafetyMode, new jee0(21))};
        f = new PreorderTitleByTariffExperiment(0);
    }

    public /* synthetic */ PreorderTitleByTariffExperiment(int i, boolean z, Map map, Map map2) {
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
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreorderTitleByTariffExperiment)) {
            return false;
        }
        PreorderTitleByTariffExperiment preorderTitleByTariffExperiment = (PreorderTitleByTariffExperiment) obj;
        return this.b == preorderTitleByTariffExperiment.b && jl40.l(this.c, preorderTitleByTariffExperiment.c) && jl40.l(this.d, preorderTitleByTariffExperiment.d);
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.d(Boolean.hashCode(this.b) * 31, 31, this.c);
    }

    public final String toString() {
        return b64.r(nnm.l("PreorderTitleByTariffExperiment(enabled=", ", l10n=", ", titleByTariff=", this.c, this.b), this.d, Extension.C_BRAKE);
    }

    public PreorderTitleByTariffExperiment() {
        this(0);
    }

    public PreorderTitleByTariffExperiment(int i) {
        Map f2 = kotlin.collections.b.f();
        Map f3 = kotlin.collections.b.f();
        this.b = false;
        this.c = f2;
        this.d = f3;
    }
}
