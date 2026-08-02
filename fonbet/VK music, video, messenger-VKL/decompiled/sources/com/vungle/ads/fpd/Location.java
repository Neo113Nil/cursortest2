package com.vungle.ads.fpd;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import xsna.cti;
import xsna.imi0;
import xsna.lmi0;
import xsna.ozl;
import xsna.zcl;

@imi0
/* loaded from: classes7.dex */
public final class Location {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final KSerializer<Location> serializer() {
            return Location$$serializer.INSTANCE;
        }

        public Companion() {
        }
    }

    public Location() {
    }

    @ozl
    public /* synthetic */ Location(int i, lmi0 lmi0Var) {
    }

    @ozl
    public final Location setCountry(String str) {
        return this;
    }

    @ozl
    public final Location setDma(int i) {
        return this;
    }

    @ozl
    public final Location setRegionState(String str) {
        return this;
    }

    public static final void write$Self(Location location, cti ctiVar, SerialDescriptor serialDescriptor) {
    }
}
