package defpackage;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.builders.ListBuilder;
import ru.yandex.taxi.communications.api.dto.BannerWidgets;
import ru.yandex.taxi.communications.api.dto.TypedContentWidget;
import ru.yandex.taxi.promotions.model.Promotion;
import ru.yandex.taxi.promotions.model.PromotionBackground;
import ru.yandex.taxi.promotions.model.d;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcb8;", "Lru/yandex/taxi/promotions/model/Promotion;", "Companion", "ab8", "bb8", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class cb8 extends Promotion {
    public static final bb8 Companion = new bb8();
    public static final i3y[] v;
    public final String b;
    public final Map c;
    public final List d;
    public final int e;
    public final Calendar f;
    public final Calendar g;
    public final String h;
    public boolean i;
    public boolean j;
    public Set k;
    public final TypedContentWidget l;
    public final TypedContentWidget m;
    public final String n;
    public final String o;
    public final gr4 p;
    public final boolean q;
    public final List r;
    public final BannerWidgets s;
    public final boolean t;
    public hi2 u;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        v = new i3y[]{null, a.b(lazyThreadSafetyMode, new r66(17)), a.b(lazyThreadSafetyMode, new r66(18)), null, null, null, null, null, null, a.b(lazyThreadSafetyMode, new r66(19)), null, null, null, null, null, null, a.b(lazyThreadSafetyMode, new r66(20)), null, null, null};
    }

    public /* synthetic */ cb8(int i, String str, Map map, List list, int i2, Calendar calendar, Calendar calendar2, String str2, boolean z, boolean z2, Set set, TypedContentWidget typedContentWidget, TypedContentWidget typedContentWidget2, String str3, String str4, gr4 gr4Var, boolean z3, List list2, BannerWidgets bannerWidgets, boolean z4, hi2 hi2Var) {
        if ((i & 1) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 2) == 0) {
            this.c = null;
        } else {
            this.c = map;
        }
        if ((i & 4) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
        if ((i & 8) == 0) {
            this.e = 0;
        } else {
            this.e = i2;
        }
        if ((i & 16) == 0) {
            this.f = null;
        } else {
            this.f = calendar;
        }
        if ((i & 32) == 0) {
            this.g = null;
        } else {
            this.g = calendar2;
        }
        if ((i & 64) == 0) {
            this.h = "";
        } else {
            this.h = str2;
        }
        if ((i & 128) == 0) {
            this.i = false;
        } else {
            this.i = z;
        }
        if ((i & 256) == 0) {
            this.j = true;
        } else {
            this.j = z2;
        }
        if ((i & 512) == 0) {
            this.k = EmptySet.a;
        } else {
            this.k = set;
        }
        if ((i & 1024) == 0) {
            this.l = null;
        } else {
            this.l = typedContentWidget;
        }
        if ((i & 2048) == 0) {
            this.m = null;
        } else {
            this.m = typedContentWidget2;
        }
        if ((i & 4096) == 0) {
            this.n = null;
        } else {
            this.n = str3;
        }
        if ((i & 8192) == 0) {
            this.o = null;
        } else {
            this.o = str4;
        }
        if ((i & 16384) == 0) {
            this.p = null;
        } else {
            this.p = gr4Var;
        }
        if ((32768 & i) == 0) {
            this.q = false;
        } else {
            this.q = z3;
        }
        this.r = (65536 & i) == 0 ? EmptyList.a : list2;
        this.s = (131072 & i) == 0 ? BannerWidgets.j : bannerWidgets;
        if ((262144 & i) == 0) {
            this.t = false;
        } else {
            this.t = z4;
        }
        if ((i & 524288) == 0) {
            this.u = null;
        } else {
            this.u = hi2Var;
        }
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    public final Promotion a() {
        boolean z = this.i;
        boolean z2 = this.j;
        Set set = this.k;
        gr4 gr4Var = this.p;
        gr4 gr4Var2 = gr4Var != null ? new gr4(gr4Var.a, gr4Var.b) : null;
        List<PromotionBackground> list = this.r;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (PromotionBackground promotionBackground : list) {
            arrayList.add(new PromotionBackground(promotionBackground.a, promotionBackground.b, promotionBackground.c, promotionBackground.d, promotionBackground.e));
        }
        return new cb8(this.b, this.c, this.d, this.e, this.f, this.g, this.h, z, z2, set, this.l, this.m, this.n, this.o, gr4Var2, this.q, arrayList, this.s, this.t, this.u);
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    public final List b() {
        String str;
        ListBuilder a = rcc.a();
        ListBuilder a2 = rcc.a();
        String str2 = this.o;
        if (str2 != null && str2.length() != 0) {
            a2.add(str2);
        }
        String str3 = this.n;
        if (str3 != null && str3.length() != 0) {
            a2.add(str3);
        }
        gr4 gr4Var = this.p;
        if (gr4Var != null && (str = gr4Var.a) != null && str.length() != 0) {
            a2.add(str);
        }
        a.addAll(a2.j());
        PromotionBackground.Companion.getClass();
        a.addAll(d.a(this.r, false));
        return a.j();
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    public final List d() {
        String str;
        gr4 gr4Var = this.p;
        return (gr4Var == null || (str = gr4Var.a) == null || str.length() == 0) ? EmptyList.a : Collections.singletonList(gr4Var.a);
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    /* renamed from: e, reason: from getter */
    public final Calendar getG() {
        return this.g;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    /* renamed from: f, reason: from getter */
    public final boolean getI() {
        return this.i;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    /* renamed from: g, reason: from getter */
    public final String getB() {
        return this.b;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    public final List h() {
        ListBuilder a = rcc.a();
        String str = this.o;
        if (str != null && str.length() != 0) {
            a.add(str);
        }
        String str2 = this.n;
        if (str2 != null && str2.length() != 0) {
            a.add(str2);
        }
        PromotionBackground.Companion.getClass();
        a.addAll(d.a(this.r, true));
        return a.j();
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    /* renamed from: i, reason: from getter */
    public final int getE() {
        return this.e;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    /* renamed from: j, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    /* renamed from: k, reason: from getter */
    public final Set getK() {
        return this.k;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    /* renamed from: l, reason: from getter */
    public final Calendar getF() {
        return this.f;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    public final Promotion.Type m() {
        return Promotion.Type.CARD;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    /* renamed from: n, reason: from getter */
    public final List getD() {
        return this.d;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    public final void p() {
        this.i = true;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    public final void q(Set set) {
        this.k = set;
    }

    @Override // ru.yandex.taxi.promotions.model.Promotion
    public final void r(boolean z) {
        this.j = z;
    }

    public cb8() {
        this(null, null, null, null, 1048575);
    }

    public cb8(String str, Map map, List list, int i, Calendar calendar, Calendar calendar2, String str2, boolean z, boolean z2, Set set, TypedContentWidget typedContentWidget, TypedContentWidget typedContentWidget2, String str3, String str4, gr4 gr4Var, boolean z3, List list2, BannerWidgets bannerWidgets, boolean z4, hi2 hi2Var) {
        this.b = str;
        this.c = map;
        this.d = list;
        this.e = i;
        this.f = calendar;
        this.g = calendar2;
        this.h = str2;
        this.i = z;
        this.j = z2;
        this.k = set;
        this.l = typedContentWidget;
        this.m = typedContentWidget2;
        this.n = str3;
        this.o = str4;
        this.p = gr4Var;
        this.q = z3;
        this.r = list2;
        this.s = bannerWidgets;
        this.t = z4;
        this.u = hi2Var;
    }

    public /* synthetic */ cb8(String str, TypedContentWidget typedContentWidget, TypedContentWidget typedContentWidget2, BannerWidgets bannerWidgets, int i) {
        this((i & 1) != 0 ? "" : str, null, null, 0, null, null, "", false, true, EmptySet.a, (i & 1024) != 0 ? null : typedContentWidget, (i & 2048) != 0 ? null : typedContentWidget2, null, null, null, false, EmptyList.a, (i & 131072) != 0 ? BannerWidgets.j : bannerWidgets, false, null);
    }
}
