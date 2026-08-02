package com.yandex.go.business.impl.experiment;

import defpackage.c6z;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.w96;
import defpackage.z151;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/business/impl/experiment/YangoBusinessExperiment;", "Lw96;", "Lc6z;", "Companion", "com/yandex/go/business/impl/experiment/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class YangoBusinessExperiment extends w96 implements c6z {
    public static final a Companion = new a();
    public static final i3y[] g = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z151(8)), null, null, null};
    public static final YangoBusinessExperiment h = new YangoBusinessExperiment(0);
    public final boolean b;
    public final Map c;
    public final String d;
    public final String e;
    public final String f;

    public /* synthetic */ YangoBusinessExperiment(int i, String str, String str2, String str3, Map map, boolean z) {
        this.b = (i & 1) == 0 ? false : z;
        this.c = (i & 2) == 0 ? b.f() : map;
        if ((i & 4) == 0) {
            this.d = "";
        } else {
            this.d = str;
        }
        if ((i & 8) == 0) {
            this.e = "";
        } else {
            this.e = str2;
        }
        if ((i & 16) == 0) {
            this.f = null;
        } else {
            this.f = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YangoBusinessExperiment)) {
            return false;
        }
        YangoBusinessExperiment yangoBusinessExperiment = (YangoBusinessExperiment) obj;
        return this.b == yangoBusinessExperiment.b && jl40.l(this.c, yangoBusinessExperiment.c) && jl40.l(this.d, yangoBusinessExperiment.d) && jl40.l(this.e, yangoBusinessExperiment.e) && jl40.l(this.f, yangoBusinessExperiment.f);
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(unr0.d(Boolean.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder l = nnm.l("YangoBusinessExperiment(enabled=", ", l10n=", ", urlId=", this.c, this.b);
        g8e.D(l, this.d, ", menuSectionTitleKey=", this.e, ", badgeTextKey=");
        return oyr.t(l, this.f, Extension.C_BRAKE);
    }

    public YangoBusinessExperiment() {
        this(0);
    }

    public YangoBusinessExperiment(int i) {
        Map f = b.f();
        this.b = false;
        this.c = f;
        this.d = "";
        this.e = "";
        this.f = null;
    }
}
