package xsna;

import android.content.Context;
import com.vk.catalog2.common.dto.api.CatalogButtonMusicSubscription;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.CatalogStateInfo;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.replacement.CatalogReplacementResponse;
import com.vk.catalog2.common.ui.mvp.util.ButtonStyle;
import com.vk.catalog2.feature.music.myaudio.MusicCollectionType;
import com.vk.catalog2.feature.music.offline.content.OfflineCatalogCategories;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* compiled from: CatalogMusicOfflineProviderImpl.kt */
/* loaded from: classes16.dex */
public final class z9a implements t9a, q9a {
    public final /* synthetic */ zp40 a;
    public final /* synthetic */ r9a b;
    public final pq40 c;
    public final g950 d;
    public final String e;
    public volatile String f;
    public volatile String g;
    public volatile String h;
    public final lu70 i;
    public final vua0 j;
    public final bpn0 k;
    public final bpn0 l;
    public final bpn0 m;

    /* compiled from: CatalogMusicOfflineProviderImpl.kt */
    public static final class a {
        public static final String a(int i) {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            return context.getString(i);
        }

        public static final LinkedHashMap b(List list) {
            List list2 = list;
            HashMap hashMap = new HashMap(list2.size());
            for (Object obj : list2) {
                hashMap.put(((Playlist) obj).Ib(), obj);
            }
            return new LinkedHashMap(hashMap);
        }
    }

    public z9a(lq40 lq40Var, g950 g950Var, boolean z, String str, r9a r9aVar) {
        Context context = e43.a;
        this.a = new zp40(context == null ? null : context);
        this.b = r9aVar;
        this.c = lq40Var;
        this.d = g950Var;
        this.e = str;
        this.f = "offline_music_replacement_default";
        this.g = "";
        this.h = "";
        this.i = new lu70(g950Var, new c24(0), new c24(0), new c24(0), new i9(9));
        this.j = new vua0();
        this.k = new bpn0(new d1(6));
        this.l = new bpn0(new s5(this, 17));
        this.m = new bpn0(new t5(this, 15));
    }

    public static CatalogStateInfo o(z9a z9aVar, String str, CatalogButtonMusicSubscription catalogButtonMusicSubscription, int i) {
        CatalogButtonMusicSubscription catalogButtonMusicSubscription2 = (i & 2) != 0 ? null : catalogButtonMusicSubscription;
        String str2 = (i & 4) != 0 ? "placeholder_id" : "synthetic_offline_placeholder_id";
        z9aVar.getClass();
        return new CatalogStateInfo(str2, "", null, null, str, catalogButtonMusicSubscription2 != null ? Collections.singletonList(catalogButtonMusicSubscription2) : EmptyList.b, null, null, dhr0.t.c(R.attr.vk_ui_field_background), null, null, null, null, null, null, null, null, 126976, null);
    }

    public static hda r(z9a z9aVar, List list, List list2, boolean z, List list3, List list4, String str, int i) {
        List list5 = (i & 16) != 0 ? null : list4;
        String str2 = (i & 32) != 0 ? "synthetic_offline_section" : str;
        boolean z2 = (i & 64) == 0;
        nt70 nt70Var = new nt70(z9aVar.e);
        nt70Var.l = list;
        nt70Var.n = list3;
        nt70Var.m = list2;
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += ((MusicTrack) it.next()).f;
        }
        long j = i2;
        Iterator it2 = list2.iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            Iterator<T> it3 = ((Playlist) it2.next()).y.iterator();
            int i4 = 0;
            while (it3.hasNext()) {
                i4 += ((MusicTrack) it3.next()).f;
            }
            i3 += i4;
        }
        long j2 = i3;
        List list6 = list3;
        ArrayList arrayList = new ArrayList();
        Iterator it4 = list6.iterator();
        while (it4.hasNext()) {
            g5g.y(((Playlist) it4.next()).y, arrayList);
        }
        Iterator it5 = arrayList.iterator();
        int i5 = 0;
        while (it5.hasNext()) {
            i5 += ((MusicTrack) it5.next()).f;
        }
        String str3 = str2;
        yp40 yp40Var = new yp40(j, 0L, j2, i5, 0L, 0L);
        if (z9aVar.p()) {
            nt70Var.f = z2;
            nt70Var.r = list5 == null ? EmptyList.b : list5;
            nt70Var.g = myc0.f(z9aVar.g);
            nt70Var.k = yp40Var;
        }
        if (z9aVar.q()) {
            nt70Var.i = R.string.catalog_kids_offline_empty;
        }
        mt70 a2 = nt70Var.a(z9aVar.f);
        Object g = z ? lu70.g(z9aVar.i, a2, str3, 4) : z9aVar.i.e(a2);
        List list7 = list;
        HashMap hashMap = new HashMap(list7.size());
        for (Object obj : list7) {
            hashMap.put(((MusicTrack) obj).Fb(), obj);
        }
        Pair pair = new Pair(new LinkedHashMap(hashMap), a.b(j5g.u0(list5 != null ? list5 : EmptyList.b, j5g.u0(list6, list2))));
        Map map = (Map) pair.d();
        Map map2 = (Map) pair.g();
        Pair pair2 = new Pair("empty_placeholder", o(z9aVar, z9aVar.h.length() == 0 ? a.a(a2.a("synthetic_offline_placeholder_id")) : a.a(a2.k), null, 2));
        com.vk.core.utils.newtork.b.a.getClass();
        Pair pair3 = com.vk.core.utils.newtork.b.d() ? new Pair(a.a(R.string.catalog_offline_expired_subscription), new CatalogButtonMusicSubscription(CatalogViewType.SYNTHETIC_OFFLINE_MUSIC_SUBSCRIPTION_BTN.getId(), null, a.a(R.string.catalog_offline_subscribe), ButtonStyle.PRIMARY.h())) : new Pair(a.a(R.string.catalog_offline_no_subscription_no_network), null);
        Pair pair4 = new Pair("subscription_placeholder_small", o(z9aVar, (String) pair3.d(), (CatalogButtonMusicSubscription) pair3.g(), 4));
        Pair pair5 = com.vk.core.utils.newtork.b.d() ? new Pair(new CatalogButtonMusicSubscription(CatalogViewType.SYNTHETIC_OFFLINE_MUSIC_SUBSCRIPTION_BTN.getId(), null, a.a(R.string.catalog_offline_subscribe), ButtonStyle.PRIMARY.h()), a.a(z9aVar.q() ? R.string.catalog_offline_kids_absent_subscription : z9aVar.p() ? R.string.catalog_offline_absent_subscription_redesign : R.string.catalog_offline_absent_subscription)) : new Pair(null, a.a(R.string.catalog_offline_no_subscription_no_network));
        return new hda(g, new CatalogExtendedData(null, null, null, null, null, null, null, null, map2, null, null, null, null, map, null, z9aVar.p() ? new LinkedHashMap(z9aVar.a.a(yp40Var, e43.l(OfflineCatalogCategories.Playlists, OfflineCatalogCategories.Albums))) : new LinkedHashMap(), null, null, null, null, null, null, null, null, pn00.m(pair2, pair4, new Pair("subscription_placeholder_big", o(z9aVar, (String) pair5.g(), (CatalogButtonMusicSubscription) pair5.d(), 4)), new Pair("status_item", o(z9aVar, "", null, 6))), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16818433, -1, 7, null), null);
    }

    public static hda s(z9a z9aVar, String str, List list, List list2, List list3, int i) {
        if ((i & 2) != 0) {
            list = EmptyList.b;
        }
        List list4 = list;
        if ((i & 4) != 0) {
            list2 = EmptyList.b;
        }
        List list5 = list2;
        if ((i & 8) != 0) {
            list3 = EmptyList.b;
        }
        return r(z9aVar, list4, list5, true, list3, null, str, 64);
    }

    @Override // xsna.q9a
    public final io.reactivex.rxjava3.core.x a(io.reactivex.rxjava3.internal.operators.single.r rVar) {
        return this.b.a(rVar);
    }

    @Override // xsna.q9a
    public final io.reactivex.rxjava3.core.q<hda> b(io.reactivex.rxjava3.core.q<hda> qVar) {
        return this.b.b(qVar);
    }

    @Override // xsna.t9a
    public final boolean c(String str) {
        if (epx.f(this.h, str)) {
            return false;
        }
        this.h = str;
        return true;
    }

    @Override // xsna.t9a
    public final io.reactivex.rxjava3.core.q<CatalogReplacementResponse> d(String str) {
        return u(str).l(new yi2(new nv2(6, this, str), 7)).w();
    }

    @Override // xsna.t9a
    public final io.reactivex.rxjava3.core.q<hda> e() {
        return io.reactivex.rxjava3.core.x.A(u(this.f), t(this.f), n(this.f), new y7(new u9a(this, 0), 5)).w();
    }

    @Override // xsna.t9a
    public final void f(String str) {
        this.g = str;
    }

    @Override // xsna.t9a
    public final io.reactivex.rxjava3.core.q<hda> g() {
        return n(this.f).l(new mm6(new hb(this, 17), 6)).w();
    }

    @Override // xsna.q9a
    public final io.reactivex.rxjava3.core.q<CatalogReplacementResponse> h(io.reactivex.rxjava3.core.q<CatalogReplacementResponse> qVar) {
        return this.b.h(qVar);
    }

    @Override // xsna.t9a
    public final void i(String str) {
        this.f = str;
    }

    @Override // xsna.t9a
    public final io.reactivex.rxjava3.core.q<hda> j(String str) {
        return str.equals(OfflineCatalogCategories.Tracks.o()) ? u(this.f).l(new w7(new uf1(9, this, str), 10)).w() : str.equals(OfflineCatalogCategories.Albums.o()) ? n(this.f).l(new v20(new sf4(1, this, str), 9)).w() : str.equals(OfflineCatalogCategories.Playlists.o()) ? t(this.f).l(new lh3(new zf1(3, this, str), 3)).w() : io.reactivex.rxjava3.core.x.A(u(this.f), t(this.f), n(this.f), new fq1(new v9a(0, this, str), 5)).w();
    }

    @Override // xsna.t9a
    public final io.reactivex.rxjava3.core.q<hda> k() {
        return io.reactivex.rxjava3.core.x.A(u(this.f), t(this.f), n(this.f), new u5(new y9a(this, 0), 2)).w();
    }

    @Override // xsna.t9a
    public final io.reactivex.rxjava3.core.q<hda> l() {
        return t(this.f).l(new ps2(new vl1(this, 14), 5)).w();
    }

    @Override // xsna.t9a
    public final io.reactivex.rxjava3.core.q<hda> m() {
        return p() ? io.reactivex.rxjava3.core.x.A(u(this.f), t(this.f), n(this.f), new ju1(new w9a(this, 0), 9)).w() : io.reactivex.rxjava3.core.x.A(u(this.f), t(this.f), n(this.f), new gv(new x9a(this, 0), 7)).w();
    }

    public final io.reactivex.rxjava3.internal.operators.single.f0 n(String str) {
        io.reactivex.rxjava3.core.x<List<Playlist>> b = this.c.b();
        if (q()) {
            b = b.l(new qj4(new g53(5), 4));
        } else {
            String str2 = this.e;
            if (str2 != null && drm0.D(str2, MusicCollectionType.ALBUMS.m(), false)) {
                b = b.l(new d9(new sm(5), 4));
            }
        }
        return v(b, str);
    }

    public final boolean p() {
        return ((Boolean) this.m.getValue()).booleanValue();
    }

    public final boolean q() {
        return ((Boolean) this.l.getValue()).booleanValue();
    }

    public final io.reactivex.rxjava3.internal.operators.single.f0 t(String str) {
        io.reactivex.rxjava3.core.x<List<Playlist>> l = this.c.l();
        if (q()) {
            l = l.l(new vj0(new kz0(6), 5));
        } else {
            String str2 = this.e;
            if (str2 != null && drm0.D(str2, MusicCollectionType.PLAYLISTS.m(), false)) {
                l = l.l(new do3(new com.vk.movika.sdk.base.observable.e0(8), 5));
            }
        }
        return v(l, str);
    }

    public final io.reactivex.rxjava3.internal.operators.single.f0 u(String str) {
        io.reactivex.rxjava3.core.x<List<MusicTrack>> A = this.c.A();
        if (q()) {
            A = A.l(new pi0(new qb(7), 4));
        } else {
            String str2 = this.e;
            if (str2 != null && drm0.D(str2, MusicCollectionType.AUDIOS.m(), false)) {
                A = A.l(new iu4(new g54(6), 5));
            }
        }
        return A.l(new nz(new oh3(4, this, str), 7)).l(new pj4(new e5(this, 18), 10)).q(io.reactivex.rxjava3.schedulers.a.b());
    }

    public final io.reactivex.rxjava3.internal.operators.single.f0 v(io.reactivex.rxjava3.core.x xVar, String str) {
        return xVar.l(new e8(new fh1(4, this, str), 9)).l(new b9(new com.vk.movika.sdk.base.observable.o(this, 13), 5)).q(io.reactivex.rxjava3.schedulers.a.b());
    }
}
