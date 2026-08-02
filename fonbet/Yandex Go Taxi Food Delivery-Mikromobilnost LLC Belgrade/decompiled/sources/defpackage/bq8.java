package defpackage;

import com.ybsdk.feature.card.internal.presentation.carddetails.InitialPosition;
import com.ybsdk.feature.card.internal.samsungpay.SamsungPayState;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class bq8 {
    public final u8j0 a;
    public final Map b;
    public final boolean c;
    public final Map d;
    public final nhq0 e;
    public final InitialPosition f;
    public final boolean g;
    public final e7r0 h;
    public final Map i;
    public final SamsungPayState j;
    public final zqj0 k;
    public final boolean l;
    public final boolean m;

    public bq8(u8j0 u8j0Var, Map map, boolean z, Map map2, nhq0 nhq0Var, InitialPosition initialPosition, boolean z2, e7r0 e7r0Var, Map map3, SamsungPayState samsungPayState, zqj0 zqj0Var, boolean z3, boolean z4) {
        this.a = u8j0Var;
        this.b = map;
        this.c = z;
        this.d = map2;
        this.e = nhq0Var;
        this.f = initialPosition;
        this.g = z2;
        this.h = e7r0Var;
        this.i = map3;
        this.j = samsungPayState;
        this.k = zqj0Var;
        this.l = z3;
        this.m = z4;
    }

    public static bq8 a(bq8 bq8Var, u8j0 u8j0Var, Map map, boolean z, Map map2, nhq0 nhq0Var, e7r0 e7r0Var, Map map3, SamsungPayState samsungPayState, zqj0 zqj0Var, int i) {
        u8j0 u8j0Var2 = (i & 1) != 0 ? bq8Var.a : u8j0Var;
        Map map4 = (i & 2) != 0 ? bq8Var.b : map;
        boolean z2 = (i & 4) != 0 ? bq8Var.c : z;
        Map map5 = (i & 8) != 0 ? bq8Var.d : map2;
        nhq0 nhq0Var2 = (i & 16) != 0 ? bq8Var.e : nhq0Var;
        bq8Var.getClass();
        InitialPosition initialPosition = (i & 64) != 0 ? bq8Var.f : null;
        boolean z3 = bq8Var.g;
        e7r0 e7r0Var2 = (i & 256) != 0 ? bq8Var.h : e7r0Var;
        Map map6 = (i & 512) != 0 ? bq8Var.i : map3;
        SamsungPayState samsungPayState2 = (i & 1024) != 0 ? bq8Var.j : samsungPayState;
        zqj0 zqj0Var2 = (i & 2048) != 0 ? bq8Var.k : zqj0Var;
        boolean z4 = (i & 4096) != 0 ? bq8Var.l : false;
        boolean z5 = (i & 8192) != 0 ? bq8Var.m : true;
        bq8Var.getClass();
        return new bq8(u8j0Var2, map4, z2, map5, nhq0Var2, initialPosition, z3, e7r0Var2, map6, samsungPayState2, zqj0Var2, z4, z5);
    }

    public final bq51 b() {
        ae8 d = d();
        yd8 yd8Var = d instanceof yd8 ? (yd8) d : null;
        if (yd8Var != null) {
            return yd8Var.a;
        }
        return null;
    }

    public final String c() {
        bq51 b = b();
        if (b != null) {
            return b.d;
        }
        return null;
    }

    public final ae8 d() {
        List list;
        u8j0 u8j0Var = this.a;
        if (u8j0Var == null || (list = (List) u8j0Var.a()) == null) {
            return null;
        }
        ae8 ae8Var = (ae8) a.u0(list);
        return ae8Var == null ? (ae8) a.S(this.e.a, list) : ae8Var;
    }

    public final gq51 e() {
        ae8 d = d();
        zd8 zd8Var = d instanceof zd8 ? (zd8) d : null;
        if (zd8Var == null) {
            return null;
        }
        ArrayList arrayList = zd8Var.b;
        Integer num = (Integer) this.i.get(zd8Var.a);
        return (gq51) a.S(num != null ? num.intValue() : 0, arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bq8)) {
            return false;
        }
        bq8 bq8Var = (bq8) obj;
        return jl40.l(this.a, bq8Var.a) && this.b.equals(bq8Var.b) && this.c == bq8Var.c && this.d.equals(bq8Var.d) && this.e.equals(bq8Var.e) && jl40.l(this.f, bq8Var.f) && this.g == bq8Var.g && this.h.equals(bq8Var.h) && this.i.equals(bq8Var.i) && this.j.equals(bq8Var.j) && jl40.l(this.k, bq8Var.k) && this.l == bq8Var.l && this.m == bq8Var.m;
    }

    public final int hashCode() {
        u8j0 u8j0Var = this.a;
        int e = unr0.e((this.e.hashCode() + unr0.d(unr0.e(unr0.d((u8j0Var == null ? 0 : u8j0Var.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d)) * 31, 31, false);
        InitialPosition initialPosition = this.f;
        int hashCode = (this.j.hashCode() + unr0.d((this.h.hashCode() + unr0.e((e + (initialPosition == null ? 0 : initialPosition.hashCode())) * 31, 31, this.g)) * 31, 31, this.i)) * 31;
        zqj0 zqj0Var = this.k;
        return Boolean.hashCode(this.m) + unr0.e((hashCode + (zqj0Var != null ? zqj0Var.hashCode() : 0)) * 31, 31, this.l);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardsDetailsState(cardsAndPromos=");
        sb.append(this.a);
        sb.append(", cardsDetails=");
        sb.append(this.b);
        sb.append(", cardDetailsVisible=");
        sb.append(this.c);
        sb.append(", freezingInProgress=");
        sb.append(this.d);
        sb.append(", selectedPagePosition=");
        sb.append(this.e);
        sb.append(", isEnabledCardFooter=false, initialPosition=");
        sb.append(this.f);
        sb.append(", plasticPromoAvailable=");
        sb.append(this.g);
        sb.append(", settingsChanging=");
        sb.append(this.h);
        sb.append(", promoSelectedTabsMap=");
        sb.append(this.i);
        sb.append(", samsungPayState=");
        sb.append(this.j);
        sb.append(", requisites2faData=");
        sb.append(this.k);
        sb.append(", isNfcSettingsAvailable=");
        sb.append(this.l);
        sb.append(", autoTokenizationPushed=");
        return x4e.i(sb, this.m, Extension.C_BRAKE);
    }
}
