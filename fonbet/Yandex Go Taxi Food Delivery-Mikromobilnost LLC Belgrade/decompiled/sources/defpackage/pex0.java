package defpackage;

import com.yandex.go.dto.response.d2;
import com.yandex.go.preorder.extraphone.ExtraContactPhonesRules;
import com.yandex.go.routestats.PriceMeta;
import com.yandex.go.zone.dto.objects.AttributedDescription;
import com.yandex.go.zone.dto.objects.AuctionInfo;
import com.yandex.go.zone.dto.objects.BrandingType;
import com.yandex.go.zone.dto.objects.ComboOrder;
import com.yandex.go.zone.dto.objects.CouponCheckResult;
import com.yandex.go.zone.dto.objects.PaidOptions;
import com.yandex.go.zone.dto.objects.ServiceLevel;
import com.yandex.go.zone.dto.objects.SuffixSpanType;
import com.yandex.go.zone.dto.objects.SummaryStyle;
import com.yandex.go.zone.dto.objects.TariffCard;
import com.yandex.go.zone.dto.objects.e5;
import com.yandex.go.zone.dto.objects.f5;
import com.yandex.go.zone.dto.response.SearchScreen;
import com.yandex.go.zone.dto.response.Selector;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlinx.serialization.json.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;
import ru.yandex.taxi.tariffs.model.TariffSource;
import ru.yandex.taxi.tariffs.model.a;

/* loaded from: classes10.dex */
public final class pex0 {
    public final boolean A;
    public final List A0;
    public final boolean B;
    public final zvb B0;
    public final boolean C;
    public final AuctionInfo C0;
    public final String D;
    public final fom0 D0;
    public final String E;
    public final String E0;
    public final SuffixSpanType F;
    public final String F0;
    public final String G;
    public final AttributedDescription G0;
    public final d2 H;
    public final List H0;
    public final ofa0 I;
    public final int I0;
    public final String J;
    public final sgx0 J0;
    public final String K;
    public final boolean K0;
    public final Set L;
    public final i3y L0;
    public final int M;
    public pex0 M0;
    public final Selector N;
    public final wu1 O;
    public final boolean P;
    public final boolean Q;
    public final String R;
    public final List S;
    public final PriceMeta T;
    public final List U;
    public final jn40 V;
    public final ExtraContactPhonesRules W;
    public final boolean X;
    public final dhm Y;
    public final ati Z;
    public final TariffSource a;
    public final qjc a0;
    public final String b;
    public final String b0;
    public final List c;
    public final b c0;
    public final List d;
    public final List d0;
    public final List e;
    public final PaidOptions e0;
    public final List f;
    public final ComboOrder f0;
    public final is60 g;
    public final boolean g0;
    public final ybo h;
    public final String h0;
    public final String i;
    public final TariffCard i0;
    public final String j;
    public final CouponCheckResult j0;
    public final String k;
    public final SearchScreen k0;
    public final String l;
    public final ServiceLevel.QueueOnSearchDisplayInfo l0;
    public final qze0 m;
    public final BrandingType m0;
    public final int n;
    public final String n0;
    public final String o;
    public final int o0;
    public final String p;
    public final Map p0;
    public final String q;
    public final List q0;
    public final oox0 r;
    public final List r0;
    public final boolean s;
    public final List s0;
    public final boolean t;
    public final a t0;
    public final boolean u;
    public final TariffOrderFlow u0;
    public final boolean v;
    public final SummaryStyle v0;
    public final boolean w;
    public final f5 w0;
    public final Boolean x;
    public final ServiceLevel.TariffCard x0;
    public final String y;
    public final String y0;
    public final boolean z;
    public final List z0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public pex0(TariffSource tariffSource, String str, List list, List list2, List list3, List list4, is60 is60Var, ybo yboVar, String str2, String str3, String str4, String str5, qze0 qze0Var, int i, String str6, String str7, String str8, oox0 oox0Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Boolean bool, String str9, boolean z6, boolean z7, boolean z8, boolean z9, String str10, String str11, SuffixSpanType suffixSpanType, String str12, d2 d2Var, ofa0 ofa0Var, String str13, String str14, HashSet hashSet, int i2, Selector selector, wu1 wu1Var, boolean z10, boolean z11, String str15, List list5, PriceMeta priceMeta, List list6, jn40 jn40Var, ExtraContactPhonesRules extraContactPhonesRules, boolean z12, ati atiVar, qjc qjcVar, b bVar, List list7, PaidOptions paidOptions, ComboOrder comboOrder, boolean z13, String str16, TariffCard tariffCard, CouponCheckResult couponCheckResult, SearchScreen searchScreen, ServiceLevel.QueueOnSearchDisplayInfo queueOnSearchDisplayInfo, BrandingType brandingType, String str17, int i3, Map map, List list8, List list9, List list10, a aVar, TariffOrderFlow tariffOrderFlow, SummaryStyle summaryStyle, f5 f5Var, ServiceLevel.TariffCard tariffCard2, String str18, List list11, List list12, zvb zvbVar, AuctionInfo auctionInfo, fom0 fom0Var, String str19, String str20, AttributedDescription attributedDescription, List list13, int i4, int i5, int i6, int i7) {
        this(tariffSource, str, list, r9, list3, list4, r12, r13, r14, str3, r16, str5, r18, i, r20, r21, r22, r23, r24, z2, r26, r27, r28, r29, r30, r32, z7, z8, r34, r35, r37, r0, r39, r40, r41, r42, r43, r44, r45, r3, r46, r47, r48, r49, r50, r51, r52, r53, r54, z12, null, r57, r58, null, r60, r61, r62, r63, r64, r65, tariffCard, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, (i7 & 131072) != 0 ? null : fom0Var, (i7 & 262144) != 0 ? null : str19, (i7 & 524288) != 0 ? null : str20, (i7 & 1048576) != 0 ? null : attributedDescription, (i7 & 2097152) != 0 ? r4 : list13, (i7 & SelfTester_JCP.ENCRYPT_CBC) != 0 ? 0 : i4);
        AuctionInfo auctionInfo2;
        int i8 = i5 & 8;
        EmptyList emptyList = EmptyList.a;
        List list14 = i8 != 0 ? emptyList : list2;
        is60 is60Var2 = (i5 & 64) != 0 ? is60.c : is60Var;
        ybo yboVar2 = (i5 & 128) != 0 ? ybo.d : yboVar;
        String str21 = (i5 & 256) != 0 ? null : str2;
        String str22 = (i5 & 1024) != 0 ? null : str4;
        qze0 qze0Var2 = (i5 & 4096) != 0 ? null : qze0Var;
        String str23 = (i5 & 16384) != 0 ? null : str6;
        String str24 = (i5 & 32768) != 0 ? null : str7;
        String str25 = (i5 & 65536) != 0 ? null : str8;
        oox0 oox0Var2 = (i5 & 131072) != 0 ? oox0.d : oox0Var;
        int i9 = 0;
        boolean z14 = (i5 & 262144) != 0 ? false : z;
        boolean z15 = (i5 & 1048576) != 0 ? false : z3;
        boolean z16 = (i5 & 2097152) != 0 ? false : z4;
        boolean z17 = (i5 & SelfTester_JCP.ENCRYPT_CBC) != 0 ? false : z5;
        Boolean bool2 = (i5 & SelfTester_JCP.ENCRYPT_CNT) != 0 ? null : bool;
        String str26 = (i5 & 16777216) != 0 ? null : str9;
        boolean z18 = (i5 & SelfTester_JCP.DECRYPT_CFB) != 0 ? false : z6;
        boolean z19 = (i5 & SelfTester_JCP.IMITA) != 0 ? false : z9;
        String str27 = (i5 & 536870912) != 0 ? null : str10;
        String str28 = (i5 & 1073741824) != 0 ? null : str11;
        SuffixSpanType suffixSpanType2 = (i5 & Integer.MIN_VALUE) != 0 ? null : suffixSpanType;
        String str29 = (i6 & 1) != 0 ? null : str12;
        d2 d2Var2 = (i6 & 2) != 0 ? null : d2Var;
        ofa0 ofa0Var2 = (i6 & 4) != 0 ? null : ofa0Var;
        String str30 = (i6 & 8) != 0 ? null : str13;
        String str31 = (i6 & 16) != 0 ? null : str14;
        Set set = (i6 & 32) != 0 ? EmptySet.a : hashSet;
        int i10 = (i6 & 64) != 0 ? 0 : i2;
        Selector selector2 = (i6 & 128) != 0 ? Selector.i : selector;
        wu1 wu1Var2 = (i6 & 256) != 0 ? null : wu1Var;
        boolean z20 = (i6 & 512) != 0 ? false : z10;
        boolean z21 = (i6 & 1024) != 0 ? false : z11;
        String str32 = (i6 & 2048) != 0 ? null : str15;
        List list15 = (i6 & 4096) != 0 ? emptyList : list5;
        PriceMeta priceMeta2 = (i6 & 8192) != 0 ? null : priceMeta;
        List list16 = (i6 & 16384) != 0 ? null : list6;
        jn40 jn40Var2 = (i6 & 32768) != 0 ? null : jn40Var;
        ExtraContactPhonesRules extraContactPhonesRules2 = (i6 & 65536) != 0 ? ExtraContactPhonesRules.f : extraContactPhonesRules;
        ati atiVar2 = (i6 & 524288) != 0 ? null : atiVar;
        qjc qjcVar2 = (i6 & 1048576) != 0 ? null : qjcVar;
        b bVar2 = (i6 & SelfTester_JCP.ENCRYPT_CBC) != 0 ? null : bVar;
        List list17 = (i6 & SelfTester_JCP.ENCRYPT_CNT) != 0 ? emptyList : list7;
        PaidOptions paidOptions2 = (i6 & 16777216) != 0 ? PaidOptions.g : paidOptions;
        ComboOrder comboOrder2 = (i6 & SelfTester_JCP.DECRYPT_CFB) != 0 ? ComboOrder.b : comboOrder;
        boolean z22 = (i6 & SelfTester_JCP.DECRYPT_CBC) != 0 ? false : z13;
        String str33 = (i6 & SelfTester_JCP.DECRYPT_CNT) != 0 ? "" : str16;
        CouponCheckResult couponCheckResult2 = (i6 & 536870912) != 0 ? null : couponCheckResult;
        SearchScreen searchScreen2 = (i6 & 1073741824) != 0 ? null : searchScreen;
        ServiceLevel.QueueOnSearchDisplayInfo queueOnSearchDisplayInfo2 = (i6 & Integer.MIN_VALUE) != 0 ? null : queueOnSearchDisplayInfo;
        BrandingType brandingType2 = (i7 & 1) != 0 ? null : brandingType;
        String str34 = (i7 & 2) != 0 ? null : str17;
        int i11 = (i7 & 4) != 0 ? 1 : i3;
        Map f = (i7 & 8) != 0 ? kotlin.collections.b.f() : map;
        List list18 = (i7 & 16) != 0 ? emptyList : list8;
        List list19 = (i7 & 32) != 0 ? emptyList : list9;
        List list20 = (i7 & 64) != 0 ? emptyList : list10;
        a aVar2 = (i7 & 128) != 0 ? new a(i9) : aVar;
        TariffOrderFlow tariffOrderFlow2 = (i7 & 256) != 0 ? TariffOrderFlow.TAXI_FLOW : tariffOrderFlow;
        SummaryStyle summaryStyle2 = (i7 & 512) != 0 ? null : summaryStyle;
        f5 f5Var2 = (i7 & 1024) != 0 ? e5.INSTANCE : f5Var;
        ServiceLevel.TariffCard tariffCard3 = (i7 & 2048) != 0 ? ServiceLevel.TariffCard.d : tariffCard2;
        String str35 = (i7 & 4096) != 0 ? null : str18;
        List list21 = (i7 & 8192) != 0 ? emptyList : list11;
        List list22 = (i7 & 16384) != 0 ? emptyList : list12;
        zvb zvbVar2 = (i7 & 32768) != 0 ? zvb.c : zvbVar;
        if ((i7 & 65536) != 0) {
            AuctionInfo.Companion.getClass();
            auctionInfo2 = AuctionInfo.f;
        } else {
            auctionInfo2 = auctionInfo;
        }
    }

    public static pex0 a(pex0 pex0Var, String str, ArrayList arrayList, is60 is60Var, ybo yboVar, String str2, String str3, String str4, qze0 qze0Var, int i, String str5, String str6, oox0 oox0Var, boolean z, Boolean bool, String str7, boolean z2, Set set, Selector selector, boolean z3, String str8, jn40 jn40Var, dhm dhmVar, ati atiVar, String str9, List list, PaidOptions paidOptions, ComboOrder comboOrder, boolean z4, String str10, CouponCheckResult couponCheckResult, SearchScreen searchScreen, BrandingType brandingType, List list2, a aVar, SummaryStyle summaryStyle, int i2, int i3, int i4) {
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        String str11;
        SuffixSpanType suffixSpanType;
        String str12;
        String str13;
        Set set2;
        TariffSource tariffSource = pex0Var.a;
        String str14 = (i2 & 2) != 0 ? pex0Var.b : str;
        List list3 = (i2 & 4) != 0 ? pex0Var.c : arrayList;
        List list4 = pex0Var.d;
        String str15 = str14;
        List list5 = pex0Var.e;
        List list6 = list3;
        List list7 = pex0Var.f;
        is60 is60Var2 = (i2 & 64) != 0 ? pex0Var.g : is60Var;
        ybo yboVar2 = (i2 & 128) != 0 ? pex0Var.h : yboVar;
        String str16 = (i2 & 256) != 0 ? pex0Var.i : str2;
        String str17 = (i2 & 512) != 0 ? pex0Var.j : str3;
        ybo yboVar3 = yboVar2;
        String str18 = pex0Var.k;
        String str19 = (i2 & 2048) != 0 ? pex0Var.l : str4;
        qze0 qze0Var2 = (i2 & 4096) != 0 ? pex0Var.m : qze0Var;
        int i5 = (i2 & 8192) != 0 ? pex0Var.n : i;
        String str20 = str16;
        String str21 = str19;
        String str22 = pex0Var.o;
        String str23 = (i2 & 32768) != 0 ? pex0Var.p : str5;
        String str24 = (i2 & 65536) != 0 ? pex0Var.q : str6;
        oox0 oox0Var2 = (i2 & 131072) != 0 ? pex0Var.r : oox0Var;
        boolean z12 = pex0Var.s;
        boolean z13 = pex0Var.t;
        if ((i2 & 1048576) != 0) {
            z5 = z13;
            z6 = pex0Var.u;
        } else {
            z5 = z13;
            z6 = false;
        }
        boolean z14 = pex0Var.v;
        if ((i2 & SelfTester_JCP.ENCRYPT_CBC) != 0) {
            z7 = z14;
            z8 = pex0Var.w;
        } else {
            z7 = z14;
            z8 = z;
        }
        Boolean bool2 = (i2 & SelfTester_JCP.ENCRYPT_CNT) != 0 ? pex0Var.x : bool;
        String str25 = (i2 & 16777216) != 0 ? pex0Var.y : str7;
        boolean z15 = pex0Var.z;
        if ((i2 & SelfTester_JCP.DECRYPT_CBC) != 0) {
            z9 = z15;
            z10 = pex0Var.A;
        } else {
            z9 = z15;
            z10 = z2;
        }
        boolean z16 = pex0Var.B;
        boolean z17 = pex0Var.C;
        if ((i2 & 536870912) != 0) {
            z11 = z17;
            str11 = pex0Var.D;
        } else {
            z11 = z17;
            str11 = null;
        }
        String str26 = str11;
        String str27 = (i2 & 1073741824) != 0 ? pex0Var.E : null;
        SuffixSpanType suffixSpanType2 = pex0Var.F;
        if ((i3 & 1) != 0) {
            suffixSpanType = suffixSpanType2;
            str12 = pex0Var.G;
        } else {
            suffixSpanType = suffixSpanType2;
            str12 = null;
        }
        String str28 = str12;
        d2 d2Var = (i3 & 2) != 0 ? pex0Var.H : null;
        ofa0 ofa0Var = pex0Var.I;
        String str29 = pex0Var.J;
        String str30 = pex0Var.K;
        if ((i3 & 32) != 0) {
            str13 = str30;
            set2 = pex0Var.L;
        } else {
            str13 = str30;
            set2 = set;
        }
        int i6 = pex0Var.M;
        Selector selector2 = (i3 & 128) != 0 ? pex0Var.N : selector;
        wu1 wu1Var = (i3 & 256) != 0 ? pex0Var.O : null;
        boolean z18 = (i3 & 512) != 0 ? pex0Var.P : false;
        boolean z19 = (i3 & 1024) != 0 ? pex0Var.Q : z3;
        String str31 = (i3 & 2048) != 0 ? pex0Var.R : str8;
        List list8 = pex0Var.S;
        PriceMeta priceMeta = pex0Var.T;
        List list9 = pex0Var.U;
        jn40 jn40Var2 = (i3 & 32768) != 0 ? pex0Var.V : jn40Var;
        ExtraContactPhonesRules extraContactPhonesRules = pex0Var.W;
        boolean z20 = pex0Var.X;
        dhm dhmVar2 = (i3 & 262144) != 0 ? pex0Var.Y : dhmVar;
        ati atiVar2 = (524288 & i3) != 0 ? pex0Var.Z : atiVar;
        qjc qjcVar = pex0Var.a0;
        String str32 = (i3 & 2097152) != 0 ? pex0Var.b0 : str9;
        b bVar = pex0Var.c0;
        List list10 = (i3 & SelfTester_JCP.ENCRYPT_CNT) != 0 ? pex0Var.d0 : list;
        PaidOptions paidOptions2 = (i3 & 16777216) != 0 ? pex0Var.e0 : paidOptions;
        ComboOrder comboOrder2 = (33554432 & i3) != 0 ? pex0Var.f0 : comboOrder;
        boolean z21 = (i3 & SelfTester_JCP.DECRYPT_CBC) != 0 ? pex0Var.g0 : z4;
        String str33 = (134217728 & i3) != 0 ? pex0Var.h0 : str10;
        TariffCard tariffCard = pex0Var.i0;
        CouponCheckResult couponCheckResult2 = (i3 & 536870912) != 0 ? pex0Var.j0 : couponCheckResult;
        SearchScreen searchScreen2 = (i3 & 1073741824) != 0 ? pex0Var.k0 : searchScreen;
        ServiceLevel.QueueOnSearchDisplayInfo queueOnSearchDisplayInfo = pex0Var.l0;
        BrandingType brandingType2 = (i4 & 1) != 0 ? pex0Var.m0 : brandingType;
        String str34 = pex0Var.n0;
        int i7 = pex0Var.o0;
        Map map = pex0Var.p0;
        List list11 = pex0Var.q0;
        List list12 = (i4 & 32) != 0 ? pex0Var.r0 : list2;
        List list13 = pex0Var.s0;
        a aVar2 = (i4 & 128) != 0 ? pex0Var.t0 : aVar;
        TariffOrderFlow tariffOrderFlow = pex0Var.u0;
        SummaryStyle summaryStyle2 = (i4 & 512) != 0 ? pex0Var.v0 : summaryStyle;
        f5 f5Var = pex0Var.w0;
        ServiceLevel.TariffCard tariffCard2 = pex0Var.x0;
        String str35 = pex0Var.y0;
        List list14 = pex0Var.z0;
        List list15 = pex0Var.A0;
        zvb zvbVar = pex0Var.B0;
        AuctionInfo auctionInfo = pex0Var.C0;
        fom0 fom0Var = pex0Var.D0;
        String str36 = pex0Var.E0;
        String str37 = pex0Var.F0;
        AttributedDescription attributedDescription = pex0Var.G0;
        List list16 = pex0Var.H0;
        int i8 = pex0Var.I0;
        pex0Var.getClass();
        return new pex0(tariffSource, str15, list6, list4, list5, list7, is60Var2, yboVar3, str20, str17, str18, str21, qze0Var2, i5, str22, str23, str24, oox0Var2, z12, z5, z6, z7, z8, bool2, str25, z9, z10, z16, z11, str26, str27, suffixSpanType, str28, d2Var, ofa0Var, str29, str13, set2, i6, selector2, wu1Var, z18, z19, str31, list8, priceMeta, list9, jn40Var2, extraContactPhonesRules, z20, dhmVar2, atiVar2, qjcVar, str32, bVar, list10, paidOptions2, comboOrder2, z21, str33, tariffCard, couponCheckResult2, searchScreen2, queueOnSearchDisplayInfo, brandingType2, str34, i7, map, list11, list12, list13, aVar2, tariffOrderFlow, summaryStyle2, f5Var, tariffCard2, str35, list14, list15, zvbVar, auctionInfo, fom0Var, str36, str37, attributedDescription, list16, i8);
    }

    public final pex0 b() {
        return g() ? this : this.M0;
    }

    public final fef c() {
        qze0 qze0Var = this.m;
        if (qze0Var != null) {
            return qze0Var.c;
        }
        return null;
    }

    public final Double d() {
        qze0 qze0Var = this.m;
        if (qze0Var != null) {
            return qze0Var.b;
        }
        return null;
    }

    public final String e() {
        qze0 qze0Var = this.m;
        if (qze0Var != null) {
            return qze0Var.a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pex0)) {
            return false;
        }
        pex0 pex0Var = (pex0) obj;
        return this.a == pex0Var.a && jl40.l(this.b, pex0Var.b) && jl40.l(this.c, pex0Var.c) && jl40.l(this.d, pex0Var.d) && jl40.l(this.e, pex0Var.e) && jl40.l(this.f, pex0Var.f) && jl40.l(this.g, pex0Var.g) && jl40.l(this.h, pex0Var.h) && jl40.l(this.i, pex0Var.i) && jl40.l(this.j, pex0Var.j) && jl40.l(this.k, pex0Var.k) && jl40.l(this.l, pex0Var.l) && jl40.l(this.m, pex0Var.m) && this.n == pex0Var.n && jl40.l(this.o, pex0Var.o) && jl40.l(this.p, pex0Var.p) && jl40.l(this.q, pex0Var.q) && jl40.l(this.r, pex0Var.r) && this.s == pex0Var.s && this.t == pex0Var.t && this.u == pex0Var.u && this.v == pex0Var.v && this.w == pex0Var.w && jl40.l(this.x, pex0Var.x) && jl40.l(this.y, pex0Var.y) && this.z == pex0Var.z && this.A == pex0Var.A && this.B == pex0Var.B && this.C == pex0Var.C && jl40.l(this.D, pex0Var.D) && jl40.l(this.E, pex0Var.E) && this.F == pex0Var.F && jl40.l(this.G, pex0Var.G) && jl40.l(this.H, pex0Var.H) && jl40.l(this.I, pex0Var.I) && jl40.l(this.J, pex0Var.J) && jl40.l(this.K, pex0Var.K) && jl40.l(this.L, pex0Var.L) && this.M == pex0Var.M && jl40.l(this.N, pex0Var.N) && jl40.l(this.O, pex0Var.O) && this.P == pex0Var.P && this.Q == pex0Var.Q && jl40.l(this.R, pex0Var.R) && jl40.l(this.S, pex0Var.S) && jl40.l(this.T, pex0Var.T) && jl40.l(this.U, pex0Var.U) && jl40.l(this.V, pex0Var.V) && jl40.l(this.W, pex0Var.W) && this.X == pex0Var.X && jl40.l(this.Y, pex0Var.Y) && jl40.l(this.Z, pex0Var.Z) && jl40.l(this.a0, pex0Var.a0) && jl40.l(this.b0, pex0Var.b0) && jl40.l(this.c0, pex0Var.c0) && jl40.l(this.d0, pex0Var.d0) && jl40.l(this.e0, pex0Var.e0) && jl40.l(this.f0, pex0Var.f0) && this.g0 == pex0Var.g0 && jl40.l(this.h0, pex0Var.h0) && jl40.l(this.i0, pex0Var.i0) && jl40.l(this.j0, pex0Var.j0) && jl40.l(this.k0, pex0Var.k0) && jl40.l(this.l0, pex0Var.l0) && this.m0 == pex0Var.m0 && jl40.l(this.n0, pex0Var.n0) && this.o0 == pex0Var.o0 && jl40.l(this.p0, pex0Var.p0) && jl40.l(this.q0, pex0Var.q0) && jl40.l(this.r0, pex0Var.r0) && jl40.l(this.s0, pex0Var.s0) && jl40.l(this.t0, pex0Var.t0) && this.u0 == pex0Var.u0 && jl40.l(this.v0, pex0Var.v0) && jl40.l(this.w0, pex0Var.w0) && jl40.l(this.x0, pex0Var.x0) && jl40.l(this.y0, pex0Var.y0) && jl40.l(this.z0, pex0Var.z0) && jl40.l(this.A0, pex0Var.A0) && jl40.l(this.B0, pex0Var.B0) && jl40.l(this.C0, pex0Var.C0) && jl40.l(this.D0, pex0Var.D0) && jl40.l(this.E0, pex0Var.E0) && jl40.l(this.F0, pex0Var.F0) && jl40.l(this.G0, pex0Var.G0) && jl40.l(this.H0, pex0Var.H0) && this.I0 == pex0Var.I0;
    }

    public final List f() {
        return (List) this.L0.getValue();
    }

    public final boolean g() {
        return this.O == null;
    }

    public final boolean h() {
        return this.e0.equals(PaidOptions.g);
    }

    public final int hashCode() {
        int hashCode = (this.h.hashCode() + ((this.g.hashCode() + unr0.c(unr0.c(unr0.c(unr0.c(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31)) * 31;
        String str = this.i;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.j;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.k;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.l;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        qze0 qze0Var = this.m;
        int b = oyr.b(this.n, (hashCode5 + (qze0Var == null ? 0 : qze0Var.hashCode())) * 31, 31);
        String str5 = this.o;
        int hashCode6 = (b + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.p;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.q;
        int e = unr0.e(unr0.e(unr0.e(unr0.e(unr0.e((this.r.hashCode() + ((hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31)) * 31, 31, this.s), 31, this.t), 31, this.u), 31, this.v), 31, this.w);
        Boolean bool = this.x;
        int hashCode8 = (e + (bool == null ? 0 : bool.hashCode())) * 31;
        String str8 = this.y;
        int e2 = unr0.e(unr0.e(unr0.e(unr0.e((hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31, 31, this.z), 31, this.A), 31, this.B), 31, this.C);
        String str9 = this.D;
        int hashCode9 = (e2 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.E;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        SuffixSpanType suffixSpanType = this.F;
        int hashCode11 = (hashCode10 + (suffixSpanType == null ? 0 : suffixSpanType.hashCode())) * 31;
        String str11 = this.G;
        int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        d2 d2Var = this.H;
        int hashCode13 = (hashCode12 + (d2Var == null ? 0 : d2Var.hashCode())) * 31;
        ofa0 ofa0Var = this.I;
        int hashCode14 = (hashCode13 + (ofa0Var == null ? 0 : ofa0Var.hashCode())) * 31;
        String str12 = this.J;
        int hashCode15 = (hashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.K;
        int hashCode16 = (this.N.hashCode() + oyr.b(this.M, g8e.e(this.L, (hashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31, 31), 31)) * 31;
        wu1 wu1Var = this.O;
        int e3 = unr0.e(unr0.e((hashCode16 + (wu1Var == null ? 0 : wu1Var.hashCode())) * 31, 31, this.P), 31, this.Q);
        String str14 = this.R;
        int c = unr0.c((e3 + (str14 == null ? 0 : str14.hashCode())) * 31, 31, this.S);
        PriceMeta priceMeta = this.T;
        int hashCode17 = (c + (priceMeta == null ? 0 : priceMeta.hashCode())) * 31;
        List list = this.U;
        int hashCode18 = (hashCode17 + (list == null ? 0 : list.hashCode())) * 31;
        jn40 jn40Var = this.V;
        int e4 = unr0.e((this.W.hashCode() + ((hashCode18 + (jn40Var == null ? 0 : jn40Var.hashCode())) * 31)) * 31, 31, this.X);
        dhm dhmVar = this.Y;
        int hashCode19 = (e4 + (dhmVar == null ? 0 : dhmVar.hashCode())) * 31;
        ati atiVar = this.Z;
        int hashCode20 = (hashCode19 + (atiVar == null ? 0 : atiVar.hashCode())) * 31;
        qjc qjcVar = this.a0;
        int hashCode21 = (hashCode20 + (qjcVar == null ? 0 : qjcVar.hashCode())) * 31;
        String str15 = this.b0;
        int hashCode22 = (hashCode21 + (str15 == null ? 0 : str15.hashCode())) * 31;
        b bVar = this.c0;
        int b2 = unr0.b(unr0.e((this.f0.a.hashCode() + ((this.e0.hashCode() + unr0.c((hashCode22 + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.d0)) * 31)) * 31, 31, this.g0), 31, this.h0);
        TariffCard tariffCard = this.i0;
        int hashCode23 = (b2 + (tariffCard == null ? 0 : tariffCard.hashCode())) * 31;
        CouponCheckResult couponCheckResult = this.j0;
        int hashCode24 = (hashCode23 + (couponCheckResult == null ? 0 : couponCheckResult.hashCode())) * 31;
        SearchScreen searchScreen = this.k0;
        int hashCode25 = (hashCode24 + (searchScreen == null ? 0 : searchScreen.hashCode())) * 31;
        ServiceLevel.QueueOnSearchDisplayInfo queueOnSearchDisplayInfo = this.l0;
        int hashCode26 = (hashCode25 + (queueOnSearchDisplayInfo == null ? 0 : queueOnSearchDisplayInfo.a.hashCode())) * 31;
        BrandingType brandingType = this.m0;
        int hashCode27 = (hashCode26 + (brandingType == null ? 0 : brandingType.hashCode())) * 31;
        String str16 = this.n0;
        int hashCode28 = (this.u0.hashCode() + unr0.c(unr0.c(unr0.c(unr0.c(unr0.d(oyr.b(this.o0, (hashCode27 + (str16 == null ? 0 : str16.hashCode())) * 31, 31), 31, this.p0), 31, this.q0), 31, this.r0), 31, this.s0), 31, this.t0.a)) * 31;
        SummaryStyle summaryStyle = this.v0;
        int hashCode29 = (this.x0.hashCode() + ((this.w0.hashCode() + ((hashCode28 + (summaryStyle == null ? 0 : summaryStyle.hashCode())) * 31)) * 31)) * 31;
        String str17 = this.y0;
        int hashCode30 = (this.C0.hashCode() + ((this.B0.hashCode() + unr0.c(unr0.c((hashCode29 + (str17 == null ? 0 : str17.hashCode())) * 31, 31, this.z0), 31, this.A0)) * 31)) * 31;
        fom0 fom0Var = this.D0;
        int hashCode31 = (hashCode30 + (fom0Var == null ? 0 : fom0Var.hashCode())) * 31;
        String str18 = this.E0;
        int hashCode32 = (hashCode31 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.F0;
        int hashCode33 = (hashCode32 + (str19 == null ? 0 : str19.hashCode())) * 31;
        AttributedDescription attributedDescription = this.G0;
        return Integer.hashCode(this.I0) + unr0.c((hashCode33 + (attributedDescription != null ? attributedDescription.hashCode() : 0)) * 31, 31, this.H0);
    }

    public final String toString() {
        return "TariffDescription(tariffClass=" + this.b + ", offer=" + this.J0.b + Extension.C_BRAKE;
    }

    public pex0(TariffSource tariffSource, String str, List list, List list2, List list3, List list4, is60 is60Var, ybo yboVar, String str2, String str3, String str4, String str5, qze0 qze0Var, int i, String str6, String str7, String str8, oox0 oox0Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Boolean bool, String str9, boolean z6, boolean z7, boolean z8, boolean z9, String str10, String str11, SuffixSpanType suffixSpanType, String str12, d2 d2Var, ofa0 ofa0Var, String str13, String str14, Set set, int i2, Selector selector, wu1 wu1Var, boolean z10, boolean z11, String str15, List list5, PriceMeta priceMeta, List list6, jn40 jn40Var, ExtraContactPhonesRules extraContactPhonesRules, boolean z12, dhm dhmVar, ati atiVar, qjc qjcVar, String str16, b bVar, List list7, PaidOptions paidOptions, ComboOrder comboOrder, boolean z13, String str17, TariffCard tariffCard, CouponCheckResult couponCheckResult, SearchScreen searchScreen, ServiceLevel.QueueOnSearchDisplayInfo queueOnSearchDisplayInfo, BrandingType brandingType, String str18, int i3, Map map, List list8, List list9, List list10, a aVar, TariffOrderFlow tariffOrderFlow, SummaryStyle summaryStyle, f5 f5Var, ServiceLevel.TariffCard tariffCard2, String str19, List list11, List list12, zvb zvbVar, AuctionInfo auctionInfo, fom0 fom0Var, String str20, String str21, AttributedDescription attributedDescription, List list13, int i4) {
        this.a = tariffSource;
        this.b = str;
        this.c = list;
        this.d = list2;
        this.e = list3;
        this.f = list4;
        this.g = is60Var;
        this.h = yboVar;
        this.i = str2;
        this.j = str3;
        this.k = str4;
        this.l = str5;
        this.m = qze0Var;
        this.n = i;
        this.o = str6;
        this.p = str7;
        this.q = str8;
        this.r = oox0Var;
        this.s = z;
        this.t = z2;
        this.u = z3;
        this.v = z4;
        this.w = z5;
        this.x = bool;
        this.y = str9;
        this.z = z6;
        this.A = z7;
        this.B = z8;
        this.C = z9;
        this.D = str10;
        this.E = str11;
        this.F = suffixSpanType;
        this.G = str12;
        this.H = d2Var;
        this.I = ofa0Var;
        this.J = str13;
        this.K = str14;
        this.L = set;
        this.M = i2;
        this.N = selector;
        this.O = wu1Var;
        this.P = z10;
        this.Q = z11;
        this.R = str15;
        this.S = list5;
        this.T = priceMeta;
        this.U = list6;
        this.V = jn40Var;
        this.W = extraContactPhonesRules;
        this.X = z12;
        this.Y = dhmVar;
        this.Z = atiVar;
        this.a0 = qjcVar;
        this.b0 = str16;
        this.c0 = bVar;
        this.d0 = list7;
        this.e0 = paidOptions;
        this.f0 = comboOrder;
        this.g0 = z13;
        this.h0 = str17;
        this.i0 = tariffCard;
        this.j0 = couponCheckResult;
        this.k0 = searchScreen;
        this.l0 = queueOnSearchDisplayInfo;
        this.m0 = brandingType;
        this.n0 = str18;
        this.o0 = i3;
        this.p0 = map;
        this.q0 = list8;
        this.r0 = list9;
        this.s0 = list10;
        this.t0 = aVar;
        this.u0 = tariffOrderFlow;
        this.v0 = summaryStyle;
        this.w0 = f5Var;
        this.x0 = tariffCard2;
        this.y0 = str19;
        this.z0 = list11;
        this.A0 = list12;
        this.B0 = zvbVar;
        this.C0 = auctionInfo;
        this.D0 = fom0Var;
        this.E0 = str20;
        this.F0 = str21;
        this.G0 = attributedDescription;
        this.H0 = list13;
        this.I0 = i4;
        yw01 d = aVar.d();
        Iterator it = d.a.iterator();
        while (it.hasNext()) {
            pex0 pex0Var = (pex0) d.b.invoke(it.next());
            if (pex0Var.M0 == null) {
                pex0Var.M0 = this;
            }
        }
        this.J0 = new sgx0(this.b, this.g);
        List list14 = this.U;
        this.K0 = (list14 == null || list14.isEmpty() || this.V == null) ? false : true;
        this.L0 = kotlin.a.a(new qhq0(27, this));
    }
}
