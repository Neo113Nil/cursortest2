package xsna;

import android.os.Bundle;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.catalog2.common.dto.api.CatalogCustomAttributes$Keys;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogLaunchOrigin;
import com.vk.catalog2.common.dto.api.CatalogOnboardingInfo;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ShowAllInfo;
import com.vk.catalog2.common.dto.api.block.CatalogBlockAnchorInfo;
import com.vk.catalog2.common.dto.api.layout.TopTitle;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockDragDropAction;
import com.vk.dto.common.id.UserId;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;

/* compiled from: MetaInfo.kt */
/* loaded from: classes16.dex */
public final class bi20 {
    public final String a;
    public final String b;
    public final CatalogDataType c;
    public final CatalogViewType d;
    public final UserId e;
    public final String f;
    public final String g;
    public final TopTitle h;
    public final String i;
    public final List<String> j;
    public final String k;
    public final List<UIBlockAction> l;
    public final Set<UIBlockDragDropAction> m;
    public final String n;
    public final UIBlockHint o;
    public final Bundle p;
    public final String q;
    public final CatalogOnboardingInfo r;
    public final ShowAllInfo s;
    public final String t;
    public final CatalogLaunchOrigin u;
    public final String v;
    public final String w;
    public final List<CatalogBlockAnchorInfo> x;
    public final boolean y;

    /* JADX WARN: Multi-variable type inference failed */
    public bi20(String str, String str2, CatalogDataType catalogDataType, CatalogViewType catalogViewType, UserId userId, String str3, String str4, TopTitle topTitle, String str5, List<String> list, String str6, List<? extends UIBlockAction> list2, Set<? extends UIBlockDragDropAction> set, String str7, UIBlockHint uIBlockHint, Bundle bundle, String str8, CatalogOnboardingInfo catalogOnboardingInfo, ShowAllInfo showAllInfo, String str9, CatalogLaunchOrigin catalogLaunchOrigin, String str10, String str11, List<CatalogBlockAnchorInfo> list3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = catalogDataType;
        this.d = catalogViewType;
        this.e = userId;
        this.f = str3;
        this.g = str4;
        this.h = topTitle;
        this.i = str5;
        this.j = list;
        this.k = str6;
        this.l = list2;
        this.m = set;
        this.n = str7;
        this.o = uIBlockHint;
        this.p = bundle;
        this.q = str8;
        this.r = catalogOnboardingInfo;
        this.s = showAllInfo;
        this.t = str9;
        this.u = catalogLaunchOrigin;
        this.v = str10;
        this.w = str11;
        this.x = list3;
        this.y = z;
    }

    public static bi20 a(bi20 bi20Var, CatalogDataType catalogDataType, CatalogViewType catalogViewType, List list, Set set, UIBlockHint uIBlockHint, String str, int i) {
        CatalogLaunchOrigin catalogLaunchOrigin;
        String str2;
        String str3 = bi20Var.a;
        String str4 = bi20Var.b;
        CatalogDataType catalogDataType2 = (i & 4) != 0 ? bi20Var.c : catalogDataType;
        CatalogViewType catalogViewType2 = (i & 8) != 0 ? bi20Var.d : catalogViewType;
        UserId userId = bi20Var.e;
        CatalogDataType catalogDataType3 = catalogDataType2;
        CatalogViewType catalogViewType3 = catalogViewType2;
        String str5 = bi20Var.f;
        String str6 = bi20Var.g;
        TopTitle topTitle = bi20Var.h;
        String str7 = bi20Var.i;
        List<String> list2 = bi20Var.j;
        String str8 = bi20Var.k;
        List list3 = (i & 2048) != 0 ? bi20Var.l : list;
        Set set2 = (i & 4096) != 0 ? bi20Var.m : set;
        String str9 = bi20Var.n;
        UIBlockHint uIBlockHint2 = (i & 16384) != 0 ? bi20Var.o : uIBlockHint;
        Bundle bundle = bi20Var.p;
        String str10 = bi20Var.q;
        CatalogOnboardingInfo catalogOnboardingInfo = bi20Var.r;
        ShowAllInfo showAllInfo = bi20Var.s;
        String str11 = bi20Var.t;
        CatalogLaunchOrigin catalogLaunchOrigin2 = bi20Var.u;
        if ((i & 2097152) != 0) {
            catalogLaunchOrigin = catalogLaunchOrigin2;
            str2 = bi20Var.v;
        } else {
            catalogLaunchOrigin = catalogLaunchOrigin2;
            str2 = str;
        }
        String str12 = bi20Var.w;
        List<CatalogBlockAnchorInfo> list4 = bi20Var.x;
        boolean z = bi20Var.y;
        bi20Var.getClass();
        return new bi20(str3, str4, catalogDataType3, catalogViewType3, userId, str5, str6, topTitle, str7, list2, str8, list3, set2, str9, uIBlockHint2, bundle, str10, catalogOnboardingInfo, showAllInfo, str11, catalogLaunchOrigin, str2, str12, list4, z);
    }

    public final com.vk.catalog2.common.dto.api.ui.a b() {
        return new com.vk.catalog2.common.dto.api.ui.a(this.a, this.b, this.d, this.c, this.k, this.e, this.j, this.m, this.o, (CatalogViewStyle) null, this.r, this.u, 1536);
    }

    public final com.vk.catalog2.common.dto.api.ui.a c(CatalogViewType catalogViewType) {
        return new com.vk.catalog2.common.dto.api.ui.a(this.a, this.b, catalogViewType, this.c, this.k, this.e, this.j, this.m, this.o, (CatalogViewStyle) null, this.r, this.u, 1536);
    }

    public final com.vk.catalog2.common.dto.api.ui.a d(UserId userId, String str) {
        if (userId == null) {
            userId = this.e;
        }
        return new com.vk.catalog2.common.dto.api.ui.a(this.a, str, this.d, this.c, this.k, userId, this.j, this.m, this.o, (CatalogViewStyle) null, (CatalogOnboardingInfo) null, this.u, 3584);
    }

    public final List<UIBlockAction> e() {
        return this.l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bi20)) {
            return false;
        }
        bi20 bi20Var = (bi20) obj;
        return epx.f(this.a, bi20Var.a) && epx.f(this.b, bi20Var.b) && this.c == bi20Var.c && this.d == bi20Var.d && epx.f(this.e, bi20Var.e) && epx.f(this.f, bi20Var.f) && epx.f(this.g, bi20Var.g) && epx.f(this.h, bi20Var.h) && epx.f(this.i, bi20Var.i) && epx.f(this.j, bi20Var.j) && epx.f(this.k, bi20Var.k) && epx.f(this.l, bi20Var.l) && epx.f(this.m, bi20Var.m) && epx.f(this.n, bi20Var.n) && epx.f(this.o, bi20Var.o) && epx.f(this.p, bi20Var.p) && epx.f(this.q, bi20Var.q) && epx.f(this.r, bi20Var.r) && epx.f(this.s, bi20Var.s) && epx.f(this.t, bi20Var.t) && this.u == bi20Var.u && epx.f(this.v, bi20Var.v) && epx.f(this.w, bi20Var.w) && epx.f(this.x, bi20Var.x) && this.y == bi20Var.y;
    }

    public final String f() {
        return this.p.getString(CatalogCustomAttributes$Keys.STYLE.h());
    }

    public final CatalogViewType g() {
        return this.d;
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a(bh10.a((this.d.hashCode() + ((this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31, 31, this.e.b), 31, this.f), 31, this.g);
        TopTitle topTitle = this.h;
        int hashCode = (a + (topTitle == null ? 0 : topTitle.hashCode())) * 31;
        String str = this.i;
        int b = fw3.b(fw3.a(urd0.a(fw3.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.j), 31, this.k), 31, this.l), 31, this.m);
        String str2 = this.n;
        int hashCode2 = (b + (str2 == null ? 0 : str2.hashCode())) * 31;
        UIBlockHint uIBlockHint = this.o;
        int hashCode3 = (this.p.hashCode() + ((hashCode2 + (uIBlockHint == null ? 0 : uIBlockHint.hashCode())) * 31)) * 31;
        String str3 = this.q;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        CatalogOnboardingInfo catalogOnboardingInfo = this.r;
        int hashCode5 = (hashCode4 + (catalogOnboardingInfo == null ? 0 : catalogOnboardingInfo.hashCode())) * 31;
        ShowAllInfo showAllInfo = this.s;
        int hashCode6 = (hashCode5 + (showAllInfo == null ? 0 : showAllInfo.hashCode())) * 31;
        String str4 = this.t;
        int hashCode7 = (this.u.hashCode() + ((hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31;
        String str5 = this.v;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.w;
        return Boolean.hashCode(this.y) + fw3.a((hashCode8 + (str6 != null ? str6.hashCode() : 0)) * 31, 31, this.x);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MetaInfo(id=");
        sb.append(this.a);
        sb.append(", sectionId=");
        sb.append(this.b);
        sb.append(", dataType=");
        sb.append(this.c);
        sb.append(", viewType=");
        sb.append(this.d);
        sb.append(", ownerId=");
        sb.append(this.e);
        sb.append(", title=");
        sb.append(this.f);
        sb.append(", subtitle=");
        sb.append(this.g);
        sb.append(", topTitle=");
        sb.append(this.h);
        sb.append(", icon=");
        sb.append(this.i);
        sb.append(", reactOnEvents=");
        sb.append(this.j);
        sb.append(", ref=");
        sb.append(this.k);
        sb.append(", clickActions=");
        sb.append(this.l);
        sb.append(", dragNDropActions=");
        sb.append(this.m);
        sb.append(", nextFrom=");
        sb.append(this.n);
        sb.append(", hint=");
        sb.append(this.o);
        sb.append(", styleAttributes=");
        sb.append(this.p);
        sb.append(", anchor=");
        sb.append(this.q);
        sb.append(", audioOnboarding=");
        sb.append(this.r);
        sb.append(", showAllInfo=");
        sb.append(this.s);
        sb.append(", sectionUrl=");
        sb.append(this.t);
        sb.append(", launchOrigin=");
        sb.append(this.u);
        sb.append(", subtitleIcon=");
        sb.append(this.v);
        sb.append(", campaignName=");
        sb.append(this.w);
        sb.append(", anchorInfo=");
        sb.append(this.x);
        sb.append(", noConsecutivePlay=");
        return defpackage.q0.a(sb, this.y, ')');
    }

    public bi20(String str, String str2, CatalogDataType catalogDataType, CatalogViewType catalogViewType, UserId userId, String str3, String str4, TopTitle topTitle, String str5, List list, String str6, List list2, Set set, String str7, Bundle bundle, String str8, CatalogOnboardingInfo catalogOnboardingInfo, ShowAllInfo showAllInfo, String str9, CatalogLaunchOrigin catalogLaunchOrigin, String str10, List list3, boolean z, int i) {
        this(str, str2, catalogDataType, catalogViewType, userId, str3, str4, topTitle, str5, list, str6, list2, set, str7, null, bundle, str8, (i & 131072) != 0 ? null : catalogOnboardingInfo, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : showAllInfo, str9, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? CatalogLaunchOrigin.UNKNOWN : catalogLaunchOrigin, null, (i & 4194304) != 0 ? null : str10, (i & 8388608) != 0 ? EmptyList.b : list3, (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? false : z);
    }
}
