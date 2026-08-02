package com.vungle.ads.fpd;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import xsna.cti;
import xsna.imi0;
import xsna.lmi0;
import xsna.n9x;
import xsna.ozl;
import xsna.zcl;

@imi0
/* loaded from: classes7.dex */
public final class Demographic {
    public static final Companion Companion = new Companion(null);
    public Integer a;
    public Integer b;

    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final KSerializer<Demographic> serializer() {
            return Demographic$$serializer.INSTANCE;
        }

        public Companion() {
        }
    }

    public Demographic() {
    }

    public static final void write$Self(Demographic demographic, cti ctiVar, SerialDescriptor serialDescriptor) {
        if (ctiVar.z() || demographic.a != null) {
            ctiVar.s(serialDescriptor, 0, n9x.a, demographic.a);
        }
        if (!ctiVar.z() && demographic.b == null) {
            return;
        }
        ctiVar.s(serialDescriptor, 1, n9x.a, demographic.b);
    }

    public final Demographic setAgeRange(int i) {
        this.a = Integer.valueOf(AgeRange.Companion.fromAge$vungle_ads_release(i).getId());
        return this;
    }

    public final Demographic setGender(LiftoffGender liftoffGender) {
        this.b = Integer.valueOf(liftoffGender.getValue());
        return this;
    }

    @ozl
    public /* synthetic */ Demographic(int i, Integer num, Integer num2, lmi0 lmi0Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
    }

    @ozl
    public final Demographic setLengthOfResidence(int i) {
        return this;
    }

    @ozl
    public final Demographic setMedianHomeValueUSD(int i) {
        return this;
    }

    @ozl
    public final Demographic setMonthlyHousingCosts(int i) {
        return this;
    }
}
