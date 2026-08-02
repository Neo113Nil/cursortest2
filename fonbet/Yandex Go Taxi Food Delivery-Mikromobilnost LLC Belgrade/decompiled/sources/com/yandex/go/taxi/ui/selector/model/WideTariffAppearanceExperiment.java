package com.yandex.go.taxi.ui.selector.model;

import defpackage.gsq0;
import defpackage.qv10;
import defpackage.smw0;
import defpackage.unr0;
import defpackage.xn11;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/ui/selector/model/WideTariffAppearanceExperiment;", "Lxn11;", "Companion", "com/yandex/go/taxi/ui/selector/model/a", "$serializer", "selector"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class WideTariffAppearanceExperiment implements xn11 {
    public static final a Companion = new a();
    public static final WideTariffAppearanceExperiment f = new WideTariffAppearanceExperiment(0);
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public /* synthetic */ WideTariffAppearanceExperiment(int i, boolean z, boolean z2, boolean z3, boolean z4) {
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
            this.e = false;
        } else {
            this.e = z4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WideTariffAppearanceExperiment)) {
            return false;
        }
        WideTariffAppearanceExperiment wideTariffAppearanceExperiment = (WideTariffAppearanceExperiment) obj;
        return this.b == wideTariffAppearanceExperiment.b && this.c == wideTariffAppearanceExperiment.c && this.d == wideTariffAppearanceExperiment.d && this.e == wideTariffAppearanceExperiment.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + unr0.e(unr0.e(Boolean.hashCode(this.b) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        return smw0.k(", unselectedTariffCarIsSemiTransparent=", Extension.C_BRAKE, qv10.u("WideTariffAppearanceExperiment(enabled=", ", selectedTariffExpressiveOutline=", ", unselectedTariffPriceTextIsGray=", this.b, this.c), this.d, this.e);
    }

    public WideTariffAppearanceExperiment(int i) {
        this.b = false;
        this.c = false;
        this.d = false;
        this.e = false;
    }

    public WideTariffAppearanceExperiment() {
        this(0);
    }
}
