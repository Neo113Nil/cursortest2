package com.vungle.ads.fpd;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import xsna.cti;
import xsna.epx;
import xsna.fpf0;
import xsna.imi0;
import xsna.izs;
import xsna.j8y;
import xsna.jdz;
import xsna.lmi0;
import xsna.n9y;
import xsna.o8y;
import xsna.oqm0;
import xsna.ozl;
import xsna.s1v;
import xsna.s3q0;
import xsna.zcl;

@imi0
/* loaded from: classes7.dex */
public final class FirstPartyData {
    public static final Companion Companion = new Companion(null);
    public static final j8y g = n9y.a(new izs<o8y, s3q0>() { // from class: com.vungle.ads.fpd.FirstPartyData$Companion$JSON$1
        @Override // xsna.izs
        public /* bridge */ /* synthetic */ s3q0 invoke(o8y o8yVar) {
            invoke2(o8yVar);
            return s3q0.a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(o8y o8yVar) {
            o8yVar.e = true;
            o8yVar.b = false;
            o8yVar.a = false;
        }
    });
    public final String a;
    public volatile SessionContext b;
    public volatile Demographic c;
    public volatile Location d;
    public volatile Revenue e;
    public Map f;

    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final KSerializer<FirstPartyData> serializer() {
            return FirstPartyData$$serializer.INSTANCE;
        }

        public Companion() {
        }
    }

    public FirstPartyData() {
        this.a = "2.0";
    }

    public static final void write$Self(FirstPartyData firstPartyData, cti ctiVar, SerialDescriptor serialDescriptor) {
        if (ctiVar.z() || !epx.f(firstPartyData.a, "2.0")) {
            ctiVar.m(serialDescriptor, 0, firstPartyData.a);
        }
        if (ctiVar.z() || firstPartyData.b != null) {
            ctiVar.s(serialDescriptor, 1, SessionContext$$serializer.INSTANCE, firstPartyData.b);
        }
        if (ctiVar.z() || firstPartyData.c != null) {
            ctiVar.s(serialDescriptor, 2, Demographic$$serializer.INSTANCE, firstPartyData.c);
        }
        if (ctiVar.z() || firstPartyData.d != null) {
            ctiVar.s(serialDescriptor, 3, Location$$serializer.INSTANCE, firstPartyData.d);
        }
        if (ctiVar.z() || firstPartyData.e != null) {
            ctiVar.s(serialDescriptor, 4, Revenue$$serializer.INSTANCE, firstPartyData.e);
        }
        if (!ctiVar.z() && firstPartyData.f == null) {
            return;
        }
        oqm0 oqm0Var = oqm0.a;
        ctiVar.s(serialDescriptor, 5, new jdz(oqm0Var, oqm0Var), firstPartyData.f);
    }

    public final synchronized void clearAll() {
        try {
            this.b = null;
            this.c = null;
            this.e = null;
            this.d = null;
            Map map = this.f;
            if (map != null) {
                map.clear();
            }
            this.f = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final String debug() {
        j8y j8yVar = g;
        return j8yVar.b(s1v.p(j8yVar.b, fpf0.d(FirstPartyData.class)), this);
    }

    public final synchronized Map<String, String> getCustomData() {
        Map<String, String> map;
        map = this.f;
        if (map == null) {
            map = new ConcurrentHashMap<>();
            this.f = map;
        }
        return map;
    }

    public final synchronized Demographic getDemographic() {
        Demographic demographic;
        demographic = this.c;
        if (demographic == null) {
            demographic = new Demographic();
            this.c = demographic;
        }
        return demographic;
    }

    public final synchronized Location getLocation() {
        Location location;
        location = this.d;
        if (location == null) {
            location = new Location();
            this.d = location;
        }
        return location;
    }

    public final synchronized Revenue getRevenue() {
        Revenue revenue;
        revenue = this.e;
        if (revenue == null) {
            revenue = new Revenue();
            this.e = revenue;
        }
        return revenue;
    }

    public final synchronized SessionContext getSessionContext() {
        SessionContext sessionContext;
        sessionContext = this.b;
        if (sessionContext == null) {
            sessionContext = new SessionContext();
            this.b = sessionContext;
        }
        return sessionContext;
    }

    @ozl
    public /* synthetic */ FirstPartyData(int i, String str, SessionContext sessionContext, Demographic demographic, Location location, Revenue revenue, Map map, lmi0 lmi0Var) {
        this.a = (i & 1) == 0 ? "2.0" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = sessionContext;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = demographic;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = location;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = revenue;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = map;
        }
    }
}
