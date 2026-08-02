package com.yandex.go.preorder.deeplinks.route;

import com.yandex.go.taxi.order.models.api.affiliate.AffiliateInfo;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.lsw;
import defpackage.nnm;
import defpackage.oyr;
import defpackage.qq80;
import defpackage.tse0;
import defpackage.unr0;
import defpackage.vfc;
import defpackage.zzs;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class IntentData {
    public final zzs a;
    public final zzs b;
    public final List c;
    public final List d;
    public final AffiliateInfo e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final SummaryState n;
    public final boolean o;
    public final String p;
    public final boolean q;
    public final String r;
    public final int s;
    public final boolean t;
    public final boolean u;
    public final lsw v;
    public final String w;
    public final qq80 x;
    public final Set y;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/go/preorder/deeplinks/route/IntentData$SummaryState;", "", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Companion", "com/yandex/go/preorder/deeplinks/route/a", "COLLAPSED", "EXPANDED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class SummaryState {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ SummaryState[] $VALUES;
        public static final SummaryState COLLAPSED;
        public static final a Companion;
        public static final SummaryState EXPANDED;
        private final String value;

        static {
            SummaryState summaryState = new SummaryState("COLLAPSED", 0, "collapsed");
            COLLAPSED = summaryState;
            SummaryState summaryState2 = new SummaryState("EXPANDED", 1, "expanded");
            EXPANDED = summaryState2;
            SummaryState[] summaryStateArr = {summaryState, summaryState2};
            $VALUES = summaryStateArr;
            $ENTRIES = kotlin.enums.a.a(summaryStateArr);
            Companion = new a();
        }

        public SummaryState(String str, int i, String str2) {
            this.value = str2;
        }

        public static SummaryState valueOf(String str) {
            return (SummaryState) Enum.valueOf(SummaryState.class, str);
        }

        public static SummaryState[] values() {
            return (SummaryState[]) $VALUES.clone();
        }

        /* renamed from: a, reason: from getter */
        public final String getValue() {
            return this.value;
        }
    }

    public IntentData(zzs zzsVar, zzs zzsVar2, List list, List list2, AffiliateInfo affiliateInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, SummaryState summaryState, boolean z, String str9, boolean z2, String str10, int i, boolean z3, boolean z4, lsw lswVar, String str11, qq80 qq80Var, Set set) {
        this.a = zzsVar;
        this.b = zzsVar2;
        this.c = list;
        this.d = list2;
        this.e = affiliateInfo;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = str5;
        this.k = str6;
        this.l = str7;
        this.m = str8;
        this.n = summaryState;
        this.o = z;
        this.p = str9;
        this.q = z2;
        this.r = str10;
        this.s = i;
        this.t = z3;
        this.u = z4;
        this.v = lswVar;
        this.w = str11;
        this.x = qq80Var;
        this.y = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntentData)) {
            return false;
        }
        IntentData intentData = (IntentData) obj;
        return jl40.l(this.a, intentData.a) && jl40.l(this.b, intentData.b) && jl40.l(this.c, intentData.c) && jl40.l(this.d, intentData.d) && jl40.l(this.e, intentData.e) && jl40.l(this.f, intentData.f) && jl40.l(this.g, intentData.g) && jl40.l(this.h, intentData.h) && jl40.l(this.i, intentData.i) && jl40.l(this.j, intentData.j) && jl40.l(this.k, intentData.k) && jl40.l(this.l, intentData.l) && jl40.l(this.m, intentData.m) && this.n == intentData.n && this.o == intentData.o && jl40.l(this.p, intentData.p) && this.q == intentData.q && jl40.l(this.r, intentData.r) && this.s == intentData.s && this.t == intentData.t && this.u == intentData.u && jl40.l(this.v, intentData.v) && jl40.l(this.w, intentData.w) && jl40.l(this.x, intentData.x) && jl40.l(this.y, intentData.y);
    }

    public final int hashCode() {
        zzs zzsVar = this.a;
        int hashCode = (zzsVar == null ? 0 : zzsVar.hashCode()) * 31;
        zzs zzsVar2 = this.b;
        int c = unr0.c(unr0.c((hashCode + (zzsVar2 == null ? 0 : zzsVar2.hashCode())) * 31, 31, this.c), 31, this.d);
        AffiliateInfo affiliateInfo = this.e;
        int hashCode2 = (c + (affiliateInfo == null ? 0 : affiliateInfo.hashCode())) * 31;
        String str = this.f;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.j;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.k;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.l;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.m;
        int e = unr0.e((this.n.hashCode() + ((hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31)) * 31, 31, this.o);
        String str9 = this.p;
        int e2 = unr0.e((e + (str9 == null ? 0 : str9.hashCode())) * 31, 31, this.q);
        String str10 = this.r;
        int e3 = unr0.e(unr0.e(oyr.b(this.s, (e2 + (str10 == null ? 0 : str10.hashCode())) * 31, 31), 31, this.t), 31, this.u);
        lsw lswVar = this.v;
        int hashCode10 = (e3 + (lswVar == null ? 0 : lswVar.hashCode())) * 31;
        String str11 = this.w;
        int b = unr0.b((hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31, 31, this.x.a);
        Set set = this.y;
        return b + (set != null ? set.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntentData(sourcePoint=");
        sb.append(this.a);
        sb.append(", destinationPoint=");
        sb.append(this.b);
        sb.append(", additionalPoints=");
        nnm.w(sb, this.c, ", requirements=", this.d, ", affiliateInfo=");
        sb.append(this.e);
        sb.append(", verticalId=");
        sb.append(this.f);
        sb.append(", tariffClass=");
        g8e.D(sb, this.g, ", requirementAlternativeKey=", this.h, ", analyticsEventForRouteDeeplink=");
        g8e.D(sb, this.i, ", courierComment=", this.j, ", srcPhoneNumber=");
        g8e.D(sb, this.k, ", destPhoneNumber=", this.l, ", extraContactPhone=");
        sb.append(this.m);
        sb.append(", summaryState=");
        sb.append(this.n);
        sb.append(", trapMode=");
        unr0.A(", continuation=", this.p, ", isSticky=", sb, this.o);
        unr0.A(", organizationNameUri=", this.r, ", serviceLevel=", sb, this.q);
        tse0.z(sb, this.s, ", isMulticlass=", this.t, ", waitRouteStats=");
        sb.append(this.u);
        sb.append(", originDeeplinkRedirect=");
        sb.append(this.v);
        sb.append(", marketplaceChatId=");
        sb.append(this.w);
        sb.append(", originType=");
        sb.append(this.x);
        sb.append(", multiclassSelectedClasses=");
        return vfc.q(sb, this.y, Extension.C_BRAKE);
    }

    public IntentData() {
        this(null, null, 33554431);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public IntentData(zzs zzsVar, AffiliateInfo affiliateInfo, int i) {
        this(null, r4, r5, r5, r7, null, null, null, null, null, null, null, null, r16, false, null, false, null, -1, false, false, null, null, r26, null);
        zzs zzsVar2 = (i & 2) != 0 ? null : zzsVar;
        AffiliateInfo affiliateInfo2 = (i & 16) != 0 ? null : affiliateInfo;
        SummaryState summaryState = SummaryState.COLLAPSED;
        qq80 qq80Var = qq80.b;
        EmptyList emptyList = EmptyList.a;
    }
}
