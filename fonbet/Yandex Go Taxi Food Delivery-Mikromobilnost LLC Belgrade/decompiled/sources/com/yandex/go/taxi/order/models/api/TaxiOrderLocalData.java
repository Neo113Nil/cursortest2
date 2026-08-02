package com.yandex.go.taxi.order.models.api;

import com.yandex.go.analytics.SimpleOrderAddressAnalyticsData;
import com.yandex.go.taxi.order.models.api.feedback.TaxiOrderSelectedTipsChoiceState;
import com.yandex.go.taxi.order.models.api.feedback.TaxiOrderTipsState;
import com.yandex.go.taxi.order.models.api.objects.SaveTime;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.ih70;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.oyr;
import defpackage.qv10;
import defpackage.u580;
import defpackage.unr0;
import defpackage.uzs;
import defpackage.v4r0;
import defpackage.w511;
import defpackage.wh60;
import defpackage.xh60;
import defpackage.z2y0;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.yandex.taxi.object.DriveState;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/TaxiOrderLocalData;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/j", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class TaxiOrderLocalData {
    public static final j Companion = new j();
    public static final i3y[] e0;
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final DriveState E;
    public final String F;
    public final SaveTime G;
    public final DriveState H;
    public final TimeZone I;
    public final com.yandex.go.analytics.e J;
    public final com.yandex.go.analytics.e K;
    public final String L;
    public final Set M;
    public final Map N;
    public final Map O;
    public final Set P;
    public final Set Q;
    public final Set R;
    public final boolean S;
    public final TaxiOrderFeedbackQuestion T;
    public final Set U;
    public final DriveState V;
    public final TaxiOrderFeedback W;
    public final boolean X;
    public final boolean Y;
    public final String Z;
    public final boolean a;
    public final boolean a0;
    public final boolean b;
    public final Set b0;
    public final boolean c;
    public final Set c0;
    public final boolean d;
    public final Map d0;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final int v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e0 = new i3y[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new z2y0(0)), null, null, kotlin.a.b(lazyThreadSafetyMode, new z2y0(7)), null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new z2y0(8)), kotlin.a.b(lazyThreadSafetyMode, new z2y0(9)), kotlin.a.b(lazyThreadSafetyMode, new z2y0(10)), kotlin.a.b(lazyThreadSafetyMode, new z2y0(11)), kotlin.a.b(lazyThreadSafetyMode, new z2y0(12)), kotlin.a.b(lazyThreadSafetyMode, new z2y0(1)), null, null, kotlin.a.b(lazyThreadSafetyMode, new z2y0(2)), kotlin.a.b(lazyThreadSafetyMode, new z2y0(3)), null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new z2y0(4)), kotlin.a.b(lazyThreadSafetyMode, new z2y0(5)), kotlin.a.b(lazyThreadSafetyMode, new z2y0(6))};
    }

    public TaxiOrderLocalData(int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, int i3, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, DriveState driveState, String str, SaveTime saveTime, DriveState driveState2, TimeZone timeZone, com.yandex.go.analytics.e eVar, com.yandex.go.analytics.e eVar2, String str2, Set set, Map map, Map map2, Set set2, Set set3, Set set4, boolean z30, TaxiOrderFeedbackQuestion taxiOrderFeedbackQuestion, Set set5, DriveState driveState3, TaxiOrderFeedback taxiOrderFeedback, boolean z31, boolean z32, String str3, boolean z33, Set set6, Set set7, Map map3) {
        TaxiOrderFeedback taxiOrderFeedback2;
        if ((i & 1) == 0) {
            this.a = false;
        } else {
            this.a = z;
        }
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z2;
        }
        if ((i & 4) == 0) {
            this.c = false;
        } else {
            this.c = z3;
        }
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z4;
        }
        if ((i & 16) == 0) {
            this.e = false;
        } else {
            this.e = z5;
        }
        if ((i & 32) == 0) {
            this.f = false;
        } else {
            this.f = z6;
        }
        if ((i & 64) == 0) {
            this.g = false;
        } else {
            this.g = z7;
        }
        if ((i & 128) == 0) {
            this.h = false;
        } else {
            this.h = z8;
        }
        if ((i & 256) == 0) {
            this.i = false;
        } else {
            this.i = z9;
        }
        if ((i & 512) == 0) {
            this.j = false;
        } else {
            this.j = z10;
        }
        if ((i & 1024) == 0) {
            this.k = false;
        } else {
            this.k = z11;
        }
        if ((i & 2048) == 0) {
            this.l = false;
        } else {
            this.l = z12;
        }
        if ((i & 4096) == 0) {
            this.m = false;
        } else {
            this.m = z13;
        }
        if ((i & 8192) == 0) {
            this.n = false;
        } else {
            this.n = z14;
        }
        if ((i & 16384) == 0) {
            this.o = false;
        } else {
            this.o = z15;
        }
        if ((i & 32768) == 0) {
            this.p = false;
        } else {
            this.p = z16;
        }
        if ((i & 65536) == 0) {
            this.q = false;
        } else {
            this.q = z17;
        }
        if ((i & 131072) == 0) {
            this.r = false;
        } else {
            this.r = z18;
        }
        if ((i & 262144) == 0) {
            this.s = false;
        } else {
            this.s = z19;
        }
        if ((i & 524288) == 0) {
            this.t = false;
        } else {
            this.t = z20;
        }
        if ((i & 1048576) == 0) {
            this.u = false;
        } else {
            this.u = z21;
        }
        if ((i & 2097152) == 0) {
            this.v = 0;
        } else {
            this.v = i3;
        }
        if ((i & SelfTester_JCP.ENCRYPT_CBC) == 0) {
            this.w = false;
        } else {
            this.w = z22;
        }
        if ((i & SelfTester_JCP.ENCRYPT_CNT) == 0) {
            this.x = false;
        } else {
            this.x = z23;
        }
        if ((16777216 & i) == 0) {
            this.y = false;
        } else {
            this.y = z24;
        }
        if ((33554432 & i) == 0) {
            this.z = false;
        } else {
            this.z = z25;
        }
        if ((67108864 & i) == 0) {
            this.A = false;
        } else {
            this.A = z26;
        }
        if ((134217728 & i) == 0) {
            this.B = false;
        } else {
            this.B = z27;
        }
        if ((268435456 & i) == 0) {
            this.C = false;
        } else {
            this.C = z28;
        }
        if ((536870912 & i) == 0) {
            this.D = false;
        } else {
            this.D = z29;
        }
        if ((1073741824 & i) == 0) {
            this.E = null;
        } else {
            this.E = driveState;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.F = null;
        } else {
            this.F = str;
        }
        if ((i2 & 1) == 0) {
            this.G = null;
        } else {
            this.G = saveTime;
        }
        if ((i2 & 2) == 0) {
            this.H = null;
        } else {
            this.H = driveState2;
        }
        this.I = (i2 & 4) == 0 ? TimeZone.getDefault() : timeZone;
        if ((i2 & 8) == 0) {
            this.J = null;
        } else {
            this.J = eVar;
        }
        if ((i2 & 16) == 0) {
            this.K = null;
        } else {
            this.K = eVar2;
        }
        if ((i2 & 32) == 0) {
            this.L = null;
        } else {
            this.L = str2;
        }
        int i4 = i2 & 64;
        EmptySet emptySet = EmptySet.a;
        if (i4 == 0) {
            this.M = emptySet;
        } else {
            this.M = set;
        }
        this.N = (i2 & 128) == 0 ? kotlin.collections.b.f() : map;
        this.O = (i2 & 256) == 0 ? kotlin.collections.b.f() : map2;
        if ((i2 & 512) == 0) {
            this.P = emptySet;
        } else {
            this.P = set2;
        }
        if ((i2 & 1024) == 0) {
            this.Q = emptySet;
        } else {
            this.Q = set3;
        }
        if ((i2 & 2048) == 0) {
            this.R = emptySet;
        } else {
            this.R = set4;
        }
        if ((i2 & 4096) == 0) {
            this.S = false;
        } else {
            this.S = z30;
        }
        if ((i2 & 8192) == 0) {
            this.T = null;
        } else {
            this.T = taxiOrderFeedbackQuestion;
        }
        if ((i2 & 16384) == 0) {
            this.U = emptySet;
        } else {
            this.U = set5;
        }
        this.V = (i2 & 32768) == 0 ? DriveState.PREORDER : driveState3;
        if ((i2 & 65536) == 0) {
            TaxiOrderFeedback.Companion.getClass();
            taxiOrderFeedback2 = TaxiOrderFeedback.j;
        } else {
            taxiOrderFeedback2 = taxiOrderFeedback;
        }
        this.W = taxiOrderFeedback2;
        if ((i2 & 131072) == 0) {
            this.X = false;
        } else {
            this.X = z31;
        }
        if ((i2 & 262144) == 0) {
            this.Y = false;
        } else {
            this.Y = z32;
        }
        if ((i2 & 524288) == 0) {
            this.Z = null;
        } else {
            this.Z = str3;
        }
        if ((i2 & 1048576) == 0) {
            this.a0 = false;
        } else {
            this.a0 = z33;
        }
        if ((i2 & 2097152) == 0) {
            this.b0 = emptySet;
        } else {
            this.b0 = set6;
        }
        if ((i2 & SelfTester_JCP.ENCRYPT_CBC) == 0) {
            this.c0 = emptySet;
        } else {
            this.c0 = set7;
        }
        if ((i2 & SelfTester_JCP.ENCRYPT_CNT) == 0) {
            this.d0 = null;
        } else {
            this.d0 = map3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v54, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v61, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v64, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v65, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v66, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v67, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v68, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v69, types: [java.util.Set] */
    public static TaxiOrderLocalData b(TaxiOrderLocalData taxiOrderLocalData, boolean z, int i, boolean z2, boolean z3, boolean z4, boolean z5, DriveState driveState, String str, SaveTime saveTime, DriveState driveState2, TimeZone timeZone, com.yandex.go.analytics.e eVar, com.yandex.go.analytics.e eVar2, String str2, LinkedHashSet linkedHashSet, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, LinkedHashSet linkedHashSet2, LinkedHashSet linkedHashSet3, LinkedHashSet linkedHashSet4, TaxiOrderFeedbackQuestion taxiOrderFeedbackQuestion, LinkedHashSet linkedHashSet5, DriveState driveState3, TaxiOrderFeedback taxiOrderFeedback, boolean z6, String str3, boolean z7, LinkedHashSet linkedHashSet6, Set set, Map map, int i2, int i3) {
        int i4;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i5;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22 = (i2 & 1) != 0 ? taxiOrderLocalData.a : z;
        boolean z23 = (i2 & 2) != 0 ? taxiOrderLocalData.b : true;
        boolean z24 = (i2 & 4) != 0 ? taxiOrderLocalData.c : true;
        boolean z25 = (i2 & 8) != 0 ? taxiOrderLocalData.d : true;
        boolean z26 = (i2 & 16) != 0 ? taxiOrderLocalData.e : true;
        boolean z27 = (i2 & 32) != 0 ? taxiOrderLocalData.f : true;
        boolean z28 = (i2 & 64) != 0 ? taxiOrderLocalData.g : true;
        boolean z29 = taxiOrderLocalData.h;
        boolean z30 = (i2 & 256) != 0 ? taxiOrderLocalData.i : true;
        boolean z31 = (i2 & 512) != 0 ? taxiOrderLocalData.j : true;
        boolean z32 = (i2 & 1024) != 0 ? taxiOrderLocalData.k : true;
        boolean z33 = (i2 & 2048) != 0 ? taxiOrderLocalData.l : true;
        boolean z34 = (i2 & 4096) != 0 ? taxiOrderLocalData.m : true;
        boolean z35 = (i2 & 8192) != 0 ? taxiOrderLocalData.n : true;
        boolean z36 = (i2 & 16384) != 0 ? taxiOrderLocalData.o : true;
        boolean z37 = (i2 & 32768) != 0 ? taxiOrderLocalData.p : true;
        if ((i2 & 65536) != 0) {
            i4 = 65536;
            z8 = taxiOrderLocalData.q;
        } else {
            i4 = 65536;
            z8 = true;
        }
        boolean z38 = taxiOrderLocalData.r;
        boolean z39 = taxiOrderLocalData.s;
        if ((i2 & 524288) != 0) {
            z9 = z39;
            z10 = taxiOrderLocalData.t;
        } else {
            z9 = z39;
            z10 = true;
        }
        if ((i2 & 1048576) != 0) {
            z11 = z10;
            z12 = taxiOrderLocalData.u;
        } else {
            z11 = z10;
            z12 = true;
        }
        if ((i2 & 2097152) != 0) {
            z13 = z12;
            i5 = taxiOrderLocalData.v;
        } else {
            z13 = z12;
            i5 = i;
        }
        int i6 = i5;
        boolean z40 = (i2 & SelfTester_JCP.ENCRYPT_CBC) != 0 ? taxiOrderLocalData.w : true;
        if ((i2 & SelfTester_JCP.ENCRYPT_CNT) != 0) {
            z14 = z40;
            z15 = taxiOrderLocalData.x;
        } else {
            z14 = z40;
            z15 = true;
        }
        if ((i2 & 16777216) != 0) {
            z16 = z15;
            z17 = taxiOrderLocalData.y;
        } else {
            z16 = z15;
            z17 = true;
        }
        if ((i2 & SelfTester_JCP.DECRYPT_CFB) != 0) {
            z18 = z17;
            z19 = taxiOrderLocalData.z;
        } else {
            z18 = z17;
            z19 = z2;
        }
        boolean z41 = z19;
        boolean z42 = (i2 & SelfTester_JCP.DECRYPT_CBC) != 0 ? taxiOrderLocalData.A : z3;
        boolean z43 = (i2 & SelfTester_JCP.DECRYPT_CNT) != 0 ? taxiOrderLocalData.B : true;
        if ((i2 & SelfTester_JCP.IMITA) != 0) {
            z20 = z43;
            z21 = taxiOrderLocalData.C;
        } else {
            z20 = z43;
            z21 = z4;
        }
        boolean z44 = z21;
        boolean z45 = (i2 & 536870912) != 0 ? taxiOrderLocalData.D : z5;
        DriveState driveState4 = (i2 & 1073741824) != 0 ? taxiOrderLocalData.E : driveState;
        String str4 = (i2 & Integer.MIN_VALUE) != 0 ? taxiOrderLocalData.F : str;
        SaveTime saveTime2 = (i3 & 1) != 0 ? taxiOrderLocalData.G : saveTime;
        DriveState driveState5 = (i3 & 2) != 0 ? taxiOrderLocalData.H : driveState2;
        TimeZone timeZone2 = (i3 & 4) != 0 ? taxiOrderLocalData.I : timeZone;
        com.yandex.go.analytics.e eVar3 = (i3 & 8) != 0 ? taxiOrderLocalData.J : eVar;
        com.yandex.go.analytics.e eVar4 = (i3 & 16) != 0 ? taxiOrderLocalData.K : eVar2;
        String str5 = (i3 & 32) != 0 ? taxiOrderLocalData.L : str2;
        LinkedHashSet linkedHashSet7 = (i3 & 64) != 0 ? taxiOrderLocalData.M : linkedHashSet;
        LinkedHashMap linkedHashMap3 = (i3 & 128) != 0 ? taxiOrderLocalData.N : linkedHashMap;
        LinkedHashMap linkedHashMap4 = (i3 & 256) != 0 ? taxiOrderLocalData.O : linkedHashMap2;
        LinkedHashSet linkedHashSet8 = (i3 & 512) != 0 ? taxiOrderLocalData.P : linkedHashSet2;
        LinkedHashSet linkedHashSet9 = (i3 & 1024) != 0 ? taxiOrderLocalData.Q : linkedHashSet3;
        LinkedHashSet linkedHashSet10 = (i3 & 2048) != 0 ? taxiOrderLocalData.R : linkedHashSet4;
        boolean z46 = (i3 & 4096) != 0 ? taxiOrderLocalData.S : true;
        TaxiOrderFeedbackQuestion taxiOrderFeedbackQuestion2 = (i3 & 8192) != 0 ? taxiOrderLocalData.T : taxiOrderFeedbackQuestion;
        LinkedHashSet linkedHashSet11 = (i3 & 16384) != 0 ? taxiOrderLocalData.U : linkedHashSet5;
        DriveState driveState6 = (i3 & 32768) != 0 ? taxiOrderLocalData.V : driveState3;
        TaxiOrderFeedback taxiOrderFeedback2 = (i3 & i4) != 0 ? taxiOrderLocalData.W : taxiOrderFeedback;
        boolean z47 = (131072 & i3) != 0 ? taxiOrderLocalData.X : true;
        boolean z48 = (262144 & i3) != 0 ? taxiOrderLocalData.Y : z6;
        String str6 = (i3 & 524288) != 0 ? taxiOrderLocalData.Z : str3;
        boolean z49 = (i3 & 1048576) != 0 ? taxiOrderLocalData.a0 : z7;
        LinkedHashSet linkedHashSet12 = (i3 & 2097152) != 0 ? taxiOrderLocalData.b0 : linkedHashSet6;
        Set set2 = (i3 & SelfTester_JCP.ENCRYPT_CBC) != 0 ? taxiOrderLocalData.c0 : set;
        Map map2 = (i3 & SelfTester_JCP.ENCRYPT_CNT) != 0 ? taxiOrderLocalData.d0 : map;
        taxiOrderLocalData.getClass();
        return new TaxiOrderLocalData(z22, z23, z24, z25, z26, z27, z28, z29, z30, z31, z32, z33, z34, z35, z36, z37, z8, z38, z9, z11, z13, i6, z14, z16, z18, z41, z42, z20, z44, z45, driveState4, str4, saveTime2, driveState5, timeZone2, eVar3, eVar4, str5, linkedHashSet7, linkedHashMap3, linkedHashMap4, linkedHashSet8, linkedHashSet9, linkedHashSet10, z46, taxiOrderFeedbackQuestion2, linkedHashSet11, driveState6, taxiOrderFeedback2, z47, z48, str6, z49, linkedHashSet12, set2, map2);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.yandex.go.analytics.e e(com.yandex.go.analytics.e eVar, zzs zzsVar, DriveState driveState) {
        String str;
        if (eVar != null) {
            zzs b = eVar.getB();
            uzs uzsVar = zzs.Companion;
            if (!b.a(zzsVar, 1.0E-6d)) {
                eVar = null;
            }
            if (eVar != null) {
                return eVar;
            }
        }
        ih70 ih70Var = com.yandex.go.analytics.e.Companion;
        int i = u580.a[OrderScreenUtils$OrderScreenType.TAXI.ordinal()];
        if (i == 1) {
            switch (u580.b[driveState.ordinal()]) {
                case 1:
                case 2:
                    str = "taxi_scheduling";
                    break;
                case 3:
                    str = "taxi_check_in";
                    break;
                case 4:
                case 5:
                    str = "taxi_search";
                    break;
                case 6:
                    str = "taxi_driving";
                    break;
                case 7:
                    str = "taxi_waiting";
                    break;
                case 8:
                    str = "taxi_transporting";
                    break;
                case 9:
                    str = "taxi_feedback";
                    break;
            }
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            switch (u580.b[driveState.ordinal()]) {
                case 1:
                case 2:
                    str = "feed_taxi_scheduling";
                    break;
                case 3:
                    str = "feed_taxi_check_in";
                    break;
                case 4:
                case 5:
                    str = "feed_taxi_search";
                    break;
                case 6:
                    str = "feed_taxi_driving";
                    break;
                case 7:
                    str = "feed_taxi_waiting";
                    break;
                case 8:
                    str = "feed_taxi_transporting";
                    break;
                case 9:
                    str = "feed_taxi_feedback";
                    break;
                default:
                    str = "#none#";
                    break;
            }
        }
        ih70Var.getClass();
        return new SimpleOrderAddressAnalyticsData(108, zzsVar, str);
    }

    public final TaxiOrderLocalData A(boolean z) {
        return b(this, z, 0, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, -2, 16777215);
    }

    public final TaxiOrderLocalData B(boolean z) {
        return b(this, false, 0, false, false, false, z, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, -536870913, 16777215);
    }

    public final TaxiOrderLocalData C() {
        return b(this, false, 0, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, -1, 16646143);
    }

    public final TaxiOrderLocalData D(List list) {
        TaxiOrderFeedback taxiOrderFeedback = this.W;
        taxiOrderFeedback.getClass();
        return b(this, false, 0, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, TaxiOrderFeedback.a(taxiOrderFeedback, null, null, list, null, null, null, null, null, 251), false, null, false, null, null, null, -1, 16711679);
    }

    public final TaxiOrderLocalData E() {
        return b(this, false, 0, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, -16777217, 16777215);
    }

    public final TaxiOrderLocalData F(com.yandex.go.analytics.e eVar) {
        return b(this, false, 0, false, false, false, false, null, null, null, null, null, null, eVar, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, -1, 16777199);
    }

    public final TaxiOrderLocalData G() {
        return b(this, false, 0, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, -65537, 16777215);
    }

    public final TaxiOrderLocalData H(String str) {
        TaxiOrderFeedback taxiOrderFeedback = this.W;
        taxiOrderFeedback.getClass();
        return b(this, false, 0, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, TaxiOrderFeedback.a(taxiOrderFeedback, null, null, null, null, null, str, null, null, 223), false, null, false, null, null, null, -1, 16711679);
    }

    public final TaxiOrderLocalData I() {
        return b(this, false, 0, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, -32769, 16777215);
    }

    public final TaxiOrderLocalData J(ArrayList arrayList) {
        TaxiOrderFeedback taxiOrderFeedback = this.W;
        return b(this, false, 0, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, TaxiOrderFeedback.a(taxiOrderFeedback, null, null, null, null, null, null, TaxiOrderTipsState.a(taxiOrderFeedback.g, arrayList, null, 13), null, 191), false, null, false, null, null, null, -1, 16711679);
    }

    public final TaxiOrderLocalData K(String str) {
        return b(this, false, 0, false, false, false, false, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, -1, 16777183);
    }

    public final TaxiOrderLocalData L() {
        return b(this, false, 0, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, -65, 16777215);
    }

    public final TaxiOrderLocalData M() {
        return b(this, false, 0, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, -513, 16777215);
    }

    public final TaxiOrderLocalData N() {
        return b(this, false, 0, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, -257, 16777215);
    }

    public final TaxiOrderLocalData O(boolean z) {
        return b(this, false, 0, false, false, z, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, -268435457, 16777215);
    }

    public final TaxiOrderLocalData P(com.yandex.go.analytics.e eVar) {
        return b(this, false, 0, false, false, false, false, null, null, null, null, null, eVar, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, -1, 16777207);
    }

    public final TaxiOrderLocalData Q(DriveState driveState) {
        return b(this, false, 0, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, driveState, null, false, null, false, null, null, null, -1, 16744447);
    }

    public final TaxiOrderLocalData R(int i) {
        TaxiOrderFeedback taxiOrderFeedback = this.W;
        taxiOrderFeedback.getClass();
        return b(this, false, 0, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, TaxiOrderFeedback.a(taxiOrderFeedback, Integer.valueOf(i), null, null, null, null, null, null, null, 254), false, null, false, null, null, null, -1, 16711679);
    }

    public final TaxiOrderLocalData S(List list) {
        TaxiOrderFeedback taxiOrderFeedback = this.W;
        taxiOrderFeedback.getClass();
        return b(this, false, 0, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, TaxiOrderFeedback.a(taxiOrderFeedback, null, list, null, null, null, null, null, null, 253), false, null, false, null, null, null, -1, 16711679);
    }

    public final TaxiOrderLocalData T(TaxiOrderSelectedTipsChoiceState taxiOrderSelectedTipsChoiceState) {
        TaxiOrderFeedback taxiOrderFeedback = this.W;
        TaxiOrderTipsState taxiOrderTipsState = taxiOrderFeedback.g;
        taxiOrderTipsState.getClass();
        return b(this, false, 0, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, TaxiOrderFeedback.a(taxiOrderFeedback, null, null, null, null, null, null, TaxiOrderTipsState.a(taxiOrderTipsState, null, taxiOrderSelectedTipsChoiceState, 7), null, 191), false, null, false, null, null, null, -1, 16711679);
    }

    public final TaxiOrderLocalData U(TimeZone timeZone) {
        return b(this, false, 0, false, false, false, false, null, null, null, null, timeZone, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, -1, 16777211);
    }

    public final TaxiOrderLocalData V() {
        return b(this, false, 0, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, -9, 16777215);
    }

    public final TaxiOrderLocalData W(boolean z) {
        return b(this, false, 0, z, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, -33554433, 16777215);
    }

    public final TaxiOrderLocalData X(boolean z) {
        return b(this, false, 0, false, z, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, -67108865, 16777215);
    }

    public final TaxiOrderLocalData a(String str) {
        return b(this, false, 0, false, false, false, false, null, null, null, null, null, null, null, null, v4r0.i(this.M, str), null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, -1, 16777151);
    }

    /* renamed from: c, reason: from getter */
    public final boolean getA() {
        return this.a;
    }

    /* renamed from: d, reason: from getter */
    public final Set getM() {
        return this.M;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaxiOrderLocalData)) {
            return false;
        }
        TaxiOrderLocalData taxiOrderLocalData = (TaxiOrderLocalData) obj;
        return this.a == taxiOrderLocalData.a && this.b == taxiOrderLocalData.b && this.c == taxiOrderLocalData.c && this.d == taxiOrderLocalData.d && this.e == taxiOrderLocalData.e && this.f == taxiOrderLocalData.f && this.g == taxiOrderLocalData.g && this.h == taxiOrderLocalData.h && this.i == taxiOrderLocalData.i && this.j == taxiOrderLocalData.j && this.k == taxiOrderLocalData.k && this.l == taxiOrderLocalData.l && this.m == taxiOrderLocalData.m && this.n == taxiOrderLocalData.n && this.o == taxiOrderLocalData.o && this.p == taxiOrderLocalData.p && this.q == taxiOrderLocalData.q && this.r == taxiOrderLocalData.r && this.s == taxiOrderLocalData.s && this.t == taxiOrderLocalData.t && this.u == taxiOrderLocalData.u && this.v == taxiOrderLocalData.v && this.w == taxiOrderLocalData.w && this.x == taxiOrderLocalData.x && this.y == taxiOrderLocalData.y && this.z == taxiOrderLocalData.z && this.A == taxiOrderLocalData.A && this.B == taxiOrderLocalData.B && this.C == taxiOrderLocalData.C && this.D == taxiOrderLocalData.D && this.E == taxiOrderLocalData.E && jl40.l(this.F, taxiOrderLocalData.F) && jl40.l(this.G, taxiOrderLocalData.G) && this.H == taxiOrderLocalData.H && jl40.l(this.I, taxiOrderLocalData.I) && jl40.l(this.J, taxiOrderLocalData.J) && jl40.l(this.K, taxiOrderLocalData.K) && jl40.l(this.L, taxiOrderLocalData.L) && jl40.l(this.M, taxiOrderLocalData.M) && jl40.l(this.N, taxiOrderLocalData.N) && jl40.l(this.O, taxiOrderLocalData.O) && jl40.l(this.P, taxiOrderLocalData.P) && jl40.l(this.Q, taxiOrderLocalData.Q) && jl40.l(this.R, taxiOrderLocalData.R) && this.S == taxiOrderLocalData.S && jl40.l(this.T, taxiOrderLocalData.T) && jl40.l(this.U, taxiOrderLocalData.U) && this.V == taxiOrderLocalData.V && jl40.l(this.W, taxiOrderLocalData.W) && this.X == taxiOrderLocalData.X && this.Y == taxiOrderLocalData.Y && jl40.l(this.Z, taxiOrderLocalData.Z) && this.a0 == taxiOrderLocalData.a0 && jl40.l(this.b0, taxiOrderLocalData.b0) && jl40.l(this.c0, taxiOrderLocalData.c0) && jl40.l(this.d0, taxiOrderLocalData.d0);
    }

    /* renamed from: f, reason: from getter */
    public final boolean getF() {
        return this.f;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getE() {
        return this.e;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getY() {
        return this.y;
    }

    public final int hashCode() {
        int e = unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(oyr.b(this.v, unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31), 31, this.w), 31, this.x), 31, this.y), 31, this.z), 31, this.A), 31, this.B), 31, this.C), 31, this.D);
        DriveState driveState = this.E;
        int hashCode = (e + (driveState == null ? 0 : driveState.hashCode())) * 31;
        String str = this.F;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        SaveTime saveTime = this.G;
        int hashCode3 = (hashCode2 + (saveTime == null ? 0 : saveTime.hashCode())) * 31;
        DriveState driveState2 = this.H;
        int hashCode4 = (this.I.hashCode() + ((hashCode3 + (driveState2 == null ? 0 : driveState2.hashCode())) * 31)) * 31;
        com.yandex.go.analytics.e eVar = this.J;
        int hashCode5 = (hashCode4 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        com.yandex.go.analytics.e eVar2 = this.K;
        int hashCode6 = (hashCode5 + (eVar2 == null ? 0 : eVar2.hashCode())) * 31;
        String str2 = this.L;
        int e2 = unr0.e(g8e.e(this.R, g8e.e(this.Q, g8e.e(this.P, unr0.d(unr0.d(g8e.e(this.M, (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31, this.N), 31, this.O), 31), 31), 31), 31, this.S);
        TaxiOrderFeedbackQuestion taxiOrderFeedbackQuestion = this.T;
        int e3 = unr0.e(unr0.e((this.W.hashCode() + ((this.V.hashCode() + g8e.e(this.U, (e2 + (taxiOrderFeedbackQuestion == null ? 0 : taxiOrderFeedbackQuestion.hashCode())) * 31, 31)) * 31)) * 31, 31, this.X), 31, this.Y);
        String str3 = this.Z;
        int e4 = g8e.e(this.c0, g8e.e(this.b0, unr0.e((e3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.a0), 31), 31);
        Map map = this.d0;
        return e4 + (map != null ? map.hashCode() : 0);
    }

    public final com.yandex.go.analytics.e i(zzs zzsVar, DriveState driveState) {
        return e(this.K, zzsVar, driveState);
    }

    /* renamed from: j, reason: from getter */
    public final Map getN() {
        return this.N;
    }

    /* renamed from: k, reason: from getter */
    public final Set getB0() {
        return this.b0;
    }

    /* renamed from: l, reason: from getter */
    public final DriveState getH() {
        return this.H;
    }

    /* renamed from: m, reason: from getter */
    public final boolean getY() {
        return this.Y;
    }

    /* renamed from: n, reason: from getter */
    public final String getL() {
        return this.L;
    }

    /* renamed from: o, reason: from getter */
    public final boolean getC() {
        return this.c;
    }

    /* renamed from: p, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public final com.yandex.go.analytics.e q(zzs zzsVar, DriveState driveState) {
        return e(this.J, zzsVar, driveState);
    }

    /* renamed from: r, reason: from getter */
    public final SaveTime getG() {
        return this.G;
    }

    /* renamed from: s, reason: from getter */
    public final TaxiOrderFeedback getW() {
        return this.W;
    }

    /* renamed from: t, reason: from getter */
    public final TimeZone getI() {
        return this.I;
    }

    public final String toString() {
        StringBuilder u = qv10.u("TaxiOrderLocalData(active=", ", notifiedUserReady=", ", notifiedSaveRide=", this.a, this.b);
        nnm.v(", tipsUserSelected=", ", cancelledByUser=", u, this.c, this.d);
        nnm.v(", cancelledByAccident=", ", isNotifiedAboutCancellation=", u, this.e, this.f);
        nnm.v(", isNotifiedAboutOnDriving=", ", isNotifiedAboutMultiorder=", u, this.g, this.h);
        nnm.v(", isNotifiedAboutCashback=", ", chatMessageSentOnce=", u, this.i, this.j);
        nnm.v(", chatGreetingClearedOnce=", ", paidDiscountDialogShowed=", u, this.k, this.l);
        nnm.v(", tariffUpgradeShowed=", ", feedbackSentOnce=", u, this.m, this.n);
        nnm.v(", isForceDestinationShowed=", ", isFailed=", u, this.o, this.p);
        nnm.v(", isPaidTimerShowed=", ", isFreeTimerShowed=", u, this.q, this.r);
        nnm.v(", communicationButtonShown=", ", hasDebt=", u, this.s, this.t);
        u.append(this.u);
        u.append(", paymentChangesCount=");
        u.append(this.v);
        u.append(", bookingTimerStarted=");
        nnm.v(", isInstructionShown=", ", closedCompleteScreen=", u, this.w, this.x);
        nnm.v(", isInTrackingOnlyFeedbackFlow=", ", walkingRouteActive=", u, this.y, this.z);
        nnm.v(", walkingRouteClosed=", ", isPaymentChanged=", u, this.A, this.B);
        nnm.v(", isCancelByOrderCancelNotification=", ", driverAnalyticSentForState=", u, this.C, this.D);
        u.append(this.E);
        u.append(", googlePayCardId=");
        u.append(this.F);
        u.append(", saveTime=");
        u.append(this.G);
        u.append(", lastNotifiedState=");
        u.append(this.H);
        u.append(", timeZone=");
        u.append(this.I);
        u.append(", pickupPointAnalyticsData=");
        u.append(this.J);
        u.append(", dropOffPointAnalyticsData=");
        u.append(this.K);
        u.append(", notificationGroupKey=");
        u.append(this.L);
        u.append(", aliases=");
        u.append(this.M);
        u.append(", foregroundNotificationOverrides=");
        u.append(this.N);
        u.append(", travelCompanionAnimationsShowCount=");
        u.append(this.O);
        u.append(", dismissedByUserNotificationsIds=");
        u.append(this.P);
        u.append(", shownUpsellIds=");
        u.append(this.Q);
        u.append(", clickedUpsellIds=");
        u.append(this.R);
        u.append(", feedbackQuestionRequested=");
        u.append(this.S);
        u.append(", taxiOrderFeedbackQuestion=");
        u.append(this.T);
        u.append(", shownCommunicationsIds=");
        u.append(this.U);
        u.append(", previouslyUpdatedDriveState=");
        u.append(this.V);
        u.append(", taxiOrderFeedback=");
        u.append(this.W);
        u.append(", isCancelSilently=");
        u.append(this.X);
        u.append(", needOpenDetails=");
        unr0.A(", traceId=", this.Z, ", isCompletePollingEnabled=", u, this.Y);
        u.append(this.a0);
        u.append(", hiddenMapObjectsIds=");
        u.append(this.b0);
        u.append(", statesForceAttractedOnFeed=");
        u.append(this.c0);
        u.append(", validatedOrderStatusWindowNotification=");
        u.append(this.d0);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }

    public final String u() {
        TaxiOrderSelectedTipsChoiceState taxiOrderSelectedTipsChoiceState = this.W.g.d;
        if (taxiOrderSelectedTipsChoiceState != null) {
            return taxiOrderSelectedTipsChoiceState.c;
        }
        return null;
    }

    public final TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsValueType v() {
        TaxiOrderSelectedTipsChoiceState taxiOrderSelectedTipsChoiceState = this.W.g.d;
        if (taxiOrderSelectedTipsChoiceState != null) {
            return taxiOrderSelectedTipsChoiceState.b;
        }
        return null;
    }

    public final xh60 w() {
        Map map = this.d0;
        if (map == null || map.isEmpty()) {
            return null;
        }
        String str = (String) kotlin.collections.a.O(map.keySet());
        return new xh60(str, (wh60) kotlin.collections.b.g(str, map));
    }

    /* renamed from: x, reason: from getter */
    public final boolean getA() {
        return this.A;
    }

    public final boolean y(String str) {
        return this.M.contains(str);
    }

    /* renamed from: z, reason: from getter */
    public final boolean getZ() {
        return this.z;
    }

    public TaxiOrderLocalData() {
        this(0);
    }

    public TaxiOrderLocalData(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, int i, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, DriveState driveState, String str, SaveTime saveTime, DriveState driveState2, TimeZone timeZone, com.yandex.go.analytics.e eVar, com.yandex.go.analytics.e eVar2, String str2, Set set, Map map, Map map2, Set set2, Set set3, Set set4, boolean z30, TaxiOrderFeedbackQuestion taxiOrderFeedbackQuestion, Set set5, DriveState driveState3, TaxiOrderFeedback taxiOrderFeedback, boolean z31, boolean z32, String str3, boolean z33, Set set6, Set set7, Map map3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = z8;
        this.i = z9;
        this.j = z10;
        this.k = z11;
        this.l = z12;
        this.m = z13;
        this.n = z14;
        this.o = z15;
        this.p = z16;
        this.q = z17;
        this.r = z18;
        this.s = z19;
        this.t = z20;
        this.u = z21;
        this.v = i;
        this.w = z22;
        this.x = z23;
        this.y = z24;
        this.z = z25;
        this.A = z26;
        this.B = z27;
        this.C = z28;
        this.D = z29;
        this.E = driveState;
        this.F = str;
        this.G = saveTime;
        this.H = driveState2;
        this.I = timeZone;
        this.J = eVar;
        this.K = eVar2;
        this.L = str2;
        this.M = set;
        this.N = map;
        this.O = map2;
        this.P = set2;
        this.Q = set3;
        this.R = set4;
        this.S = z30;
        this.T = taxiOrderFeedbackQuestion;
        this.U = set5;
        this.V = driveState3;
        this.W = taxiOrderFeedback;
        this.X = z31;
        this.Y = z32;
        this.Z = str3;
        this.a0 = z33;
        this.b0 = set6;
        this.c0 = set7;
        this.d0 = map3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TaxiOrderLocalData(int i) {
        this(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, 0, false, false, false, false, false, false, false, false, null, null, null, null, r35, null, null, null, r39, r40, r41, r39, r39, r39, false, null, r39, r48, r49, false, false, null, false, r39, r39, null);
        TimeZone timeZone = TimeZone.getDefault();
        Map f = kotlin.collections.b.f();
        Map f2 = kotlin.collections.b.f();
        DriveState driveState = DriveState.PREORDER;
        TaxiOrderFeedback.Companion.getClass();
        TaxiOrderFeedback taxiOrderFeedback = TaxiOrderFeedback.j;
        EmptySet emptySet = EmptySet.a;
    }
}
