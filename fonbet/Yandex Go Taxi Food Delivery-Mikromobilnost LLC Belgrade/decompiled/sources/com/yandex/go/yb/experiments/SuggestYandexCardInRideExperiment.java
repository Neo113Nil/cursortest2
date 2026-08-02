package com.yandex.go.yb.experiments;

import defpackage.c3u0;
import defpackage.c6z;
import defpackage.d6z;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.n96;
import defpackage.nnm;
import defpackage.oyr;
import defpackage.unr0;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/yb/experiments/SuggestYandexCardInRideExperiment;", "Ln96;", "Lc6z;", "Companion", "com/yandex/go/yb/experiments/c", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class SuggestYandexCardInRideExperiment extends n96 implements c6z {
    public static final c Companion = new c();
    public static final i3y[] i = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new c3u0(24)), null, null, null, null, null};
    public static final SuggestYandexCardInRideExperiment j = new SuggestYandexCardInRideExperiment(0);
    public final boolean b;
    public final Map c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public /* synthetic */ SuggestYandexCardInRideExperiment(int i2, boolean z, Map map, String str, String str2, String str3, String str4, String str5) {
        this.b = (i2 & 1) == 0 ? false : z;
        if ((i2 & 2) == 0) {
            this.c = kotlin.collections.b.f();
        } else {
            this.c = map;
        }
        if ((i2 & 4) == 0) {
            this.d = "";
        } else {
            this.d = str;
        }
        if ((i2 & 8) == 0) {
            this.e = "";
        } else {
            this.e = str2;
        }
        if ((i2 & 16) == 0) {
            this.f = "";
        } else {
            this.f = str3;
        }
        if ((i2 & 32) == 0) {
            this.g = "";
        } else {
            this.g = str4;
        }
        if ((i2 & 64) == 0) {
            this.h = null;
        } else {
            this.h = str5;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Override // defpackage.n96
    public final boolean b() {
        return (!getB() || d6z.Y(this, this.d).length() == 0 || d6z.Y(this, this.e).length() == 0 || d6z.Y(this, this.f).length() == 0 || d6z.Y(this, this.g).length() == 0) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuggestYandexCardInRideExperiment)) {
            return false;
        }
        SuggestYandexCardInRideExperiment suggestYandexCardInRideExperiment = (SuggestYandexCardInRideExperiment) obj;
        return this.b == suggestYandexCardInRideExperiment.b && jl40.l(this.c, suggestYandexCardInRideExperiment.c) && jl40.l(this.d, suggestYandexCardInRideExperiment.d) && jl40.l(this.e, suggestYandexCardInRideExperiment.e) && jl40.l(this.f, suggestYandexCardInRideExperiment.f) && jl40.l(this.g, suggestYandexCardInRideExperiment.g) && jl40.l(this.h, suggestYandexCardInRideExperiment.h);
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(unr0.b(unr0.b(unr0.d(Boolean.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        String str = this.h;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder l = nnm.l("SuggestYandexCardInRideExperiment(enabled=", ", l10n=", ", titleKey=", this.c, this.b);
        g8e.D(l, this.d, ", descriptionKey=", this.e, ", changeButtonKey=");
        g8e.D(l, this.f, ", closeButtonKey=", this.g, ", iconTag=");
        return oyr.t(l, this.h, Extension.C_BRAKE);
    }

    public SuggestYandexCardInRideExperiment() {
        this(0);
    }

    public SuggestYandexCardInRideExperiment(int i2) {
        Map f = kotlin.collections.b.f();
        this.b = false;
        this.c = f;
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = null;
    }
}
