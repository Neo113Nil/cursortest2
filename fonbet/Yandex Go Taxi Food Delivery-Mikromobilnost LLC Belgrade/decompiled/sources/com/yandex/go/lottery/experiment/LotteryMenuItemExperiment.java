package com.yandex.go.lottery.experiment;

import defpackage.c6z;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.t5z;
import defpackage.unr0;
import defpackage.xn11;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/lottery/experiment/LotteryMenuItemExperiment;", "Lxn11;", "Lc6z;", "Companion", "com/yandex/go/lottery/experiment/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class LotteryMenuItemExperiment implements xn11, c6z {
    public static final a Companion = new a();
    public static final i3y[] h = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new t5z(6)), null, null, null, null, null};
    public static final LotteryMenuItemExperiment i = new LotteryMenuItemExperiment(0);
    public final Map b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public /* synthetic */ LotteryMenuItemExperiment(int i2, String str, String str2, String str3, String str4, Map map, boolean z) {
        this.b = (i2 & 1) == 0 ? b.f() : map;
        if ((i2 & 2) == 0) {
            this.c = false;
        } else {
            this.c = z;
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LotteryMenuItemExperiment)) {
            return false;
        }
        LotteryMenuItemExperiment lotteryMenuItemExperiment = (LotteryMenuItemExperiment) obj;
        return jl40.l(this.b, lotteryMenuItemExperiment.b) && this.c == lotteryMenuItemExperiment.c && jl40.l(this.d, lotteryMenuItemExperiment.d) && jl40.l(this.e, lotteryMenuItemExperiment.e) && jl40.l(this.f, lotteryMenuItemExperiment.f) && jl40.l(this.g, lotteryMenuItemExperiment.g);
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.b;
    }

    public final int hashCode() {
        return this.g.hashCode() + unr0.b(unr0.b(unr0.b(unr0.e(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LotteryMenuItemExperiment(l10n=");
        sb.append(this.b);
        sb.append(", enabled=");
        sb.append(this.c);
        sb.append(", deeplink=");
        g8e.D(sb, this.d, ", iconTag=", this.e, ", titleKey=");
        return g8e.r(sb, this.f, ", subtitleKey=", this.g, Extension.C_BRAKE);
    }

    public LotteryMenuItemExperiment() {
        this(0);
    }

    public LotteryMenuItemExperiment(int i2) {
        this.b = b.f();
        this.c = false;
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = "";
    }
}
