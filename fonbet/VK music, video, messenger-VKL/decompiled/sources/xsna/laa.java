package xsna;

import com.vk.catalog2.common.dto.api.replacement.CatalogReplacementResponse;
import com.vk.catalog2.feature.music.myaudio.MusicCollectionType;
import com.vk.catalog2.feature.music.offline.content.OfflineCatalogCategories;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.podcast.OfflinePodcast;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;

/* compiled from: CatalogMusicOfflineProviderNewImpl.kt */
/* loaded from: classes16.dex */
public final class laa implements t9a, q9a {
    public final /* synthetic */ r9a a;
    public final lq40 b;
    public final df5 c;
    public final g950 d;
    public final String e;
    public final ri40 f;
    public final qi40 g;
    public volatile String h;
    public volatile String i;
    public volatile String j;
    public final vua0 k;
    public final bpn0 l;
    public final bpn0 m;
    public final bpn0 n;
    public final bpn0 o;
    public final bpn0 p;
    public final nq40 q;
    public final aq40 r;
    public final ld20 s;

    /* compiled from: CatalogMusicOfflineProviderNewImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OfflineCatalogCategories.values().length];
            try {
                iArr[OfflineCatalogCategories.All.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OfflineCatalogCategories.Tracks.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OfflineCatalogCategories.AutoDownload.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OfflineCatalogCategories.Albums.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OfflineCatalogCategories.Playlists.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[OfflineCatalogCategories.Podcasts.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[OfflineCatalogCategories.Audiobooks.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: CatalogMusicOfflineProviderNewImpl.kt */
    public static final class b implements izs<List<? extends AudioBook>, List<? extends AudioBook>> {
        @Override // xsna.izs
        public final List<? extends AudioBook> invoke(List<? extends AudioBook> list) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (jnj.b(((AudioBook) obj).u)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    /* compiled from: CatalogMusicOfflineProviderNewImpl.kt */
    public static final class c implements io.reactivex.rxjava3.functions.l {
        public final /* synthetic */ b b;

        public c(b bVar) {
            this.b = bVar;
        }

        @Override // io.reactivex.rxjava3.functions.l
        public final /* synthetic */ Object apply(Object obj) {
            return this.b.invoke(obj);
        }
    }

    public laa(lq40 lq40Var, df5 df5Var, g950 g950Var, String str, lq40 lq40Var2, r9a r9aVar) {
        qi40 qi40Var = new qi40();
        this.a = r9aVar;
        this.b = lq40Var;
        this.c = df5Var;
        this.d = g950Var;
        this.e = str;
        this.f = lq40Var2;
        this.g = qi40Var;
        this.h = "offline_music_replacement_default";
        this.i = "";
        this.j = "";
        Class<laa> cls = laa.class;
        String str2 = "isEpisodeDownloadEnabled";
        lu70 lu70Var = new lu70(g950Var, new maa(this, laa.class, "isChapterDownloadEnabled", "isChapterDownloadEnabled()Z", 0), new naa(this, cls, str2, "isEpisodeDownloadEnabled()Z", 0), new oaa(0, this, laa.class, "isAutoDownloadEnabled", "isAutoDownloadEnabled()Z", 0), new defpackage.f(this, 8));
        this.k = new vua0();
        this.l = new bpn0(new iz3(3));
        bpn0 bpn0Var = new bpn0(new wv0(3));
        this.m = bpn0Var;
        bpn0 bpn0Var2 = new bpn0(new xv0(2));
        this.n = bpn0Var2;
        bpn0 bpn0Var3 = new bpn0(new vi0(5));
        this.o = bpn0Var3;
        this.p = new bpn0(new ac(this, 11));
        this.q = new nq40(r(), lu70Var, str, new f5(this, 11));
        this.r = new aq40(r(), ((Boolean) bpn0Var.getValue()).booleanValue(), ((Boolean) bpn0Var2.getValue()).booleanValue(), ((Boolean) bpn0Var3.getValue()).booleanValue(), lu70Var, str, new g5(this, 8), new i70(this, 12), new j70(this, 11));
        this.s = new ld20(lu70Var, str, new defpackage.h(this, 11));
    }

    public static hda s(laa laaVar, String str, List list, List list2, List list3, List list4, List list5, List list6, List list7, Map map, int i) {
        List list8 = (i & 2) != 0 ? EmptyList.b : list;
        List list9 = (i & 4) != 0 ? EmptyList.b : list2;
        List list10 = (i & 8) != 0 ? EmptyList.b : list3;
        List list11 = (i & 16) != 0 ? EmptyList.b : list4;
        List list12 = (i & 32) != 0 ? EmptyList.b : list5;
        List list13 = (i & 64) != 0 ? EmptyList.b : list6;
        List list14 = (i & 128) != 0 ? EmptyList.b : list7;
        Map map2 = (i & 256) != 0 ? jgp.b : map;
        aq40 aq40Var = laaVar.r;
        aq40Var.getClass();
        if (str == null) {
            str = "synthetic_offline_section";
        }
        return aq40.a(aq40Var, list8, list9, true, list10, list11, list12, list13, list14, map2, str, 1024);
    }

    @Override // xsna.q9a
    public final io.reactivex.rxjava3.core.x a(io.reactivex.rxjava3.internal.operators.single.r rVar) {
        return this.a.a(rVar);
    }

    @Override // xsna.q9a
    public final io.reactivex.rxjava3.core.q<hda> b(io.reactivex.rxjava3.core.q<hda> qVar) {
        return this.a.b(qVar);
    }

    @Override // xsna.t9a
    public final boolean c(String str) {
        if (epx.f(this.j, str)) {
            return false;
        }
        this.j = str;
        return true;
    }

    @Override // xsna.t9a
    public final io.reactivex.rxjava3.core.q<CatalogReplacementResponse> d(String str) {
        return v(str).l(new l8(new k8(4, this, str), 11)).w();
    }

    @Override // xsna.t9a
    public final io.reactivex.rxjava3.core.q<hda> e() {
        return io.reactivex.rxjava3.core.x.C(v(this.h), t(this.h), n(this.h), u(this.h), o(this.h), new yi2(new kaa(this, 0), 8)).w();
    }

    @Override // xsna.t9a
    public final void f(String str) {
        this.i = str;
    }

    @Override // xsna.t9a
    public final io.reactivex.rxjava3.core.q<hda> g() {
        return n(this.h).l(new lp0(new com.vk.movika.sdk.base.hooks.p(this, 22), 11)).w();
    }

    @Override // xsna.q9a
    public final io.reactivex.rxjava3.core.q<CatalogReplacementResponse> h(io.reactivex.rxjava3.core.q<CatalogReplacementResponse> qVar) {
        return this.a.h(qVar);
    }

    @Override // xsna.t9a
    public final void i(String str) {
        this.h = str;
    }

    @Override // xsna.t9a
    public final io.reactivex.rxjava3.core.q<hda> j(String str) {
        OfflineCatalogCategories.Companion.getClass();
        OfflineCatalogCategories a2 = OfflineCatalogCategories.c.a(str);
        switch (a2 == null ? -1 : a.$EnumSwitchMapping$0[a2.ordinal()]) {
            case -1:
                return q(str);
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return epx.f(a2.n(), str) ? io.reactivex.rxjava3.core.x.C(v(this.h), t(this.h), n(this.h), u(this.h), o(this.h), new g7(new iaa(this, str), 8)).w() : q(str);
            case 2:
                return v(this.h).l(new p7(new aq1(4, this, str), 10)).w();
            case 3:
                return p().l(new e7(new ma(2, this, str), 9)).w();
            case 4:
                return n(this.h).l(new tt0(new g86(2, this, str), 8)).w();
            case 5:
                return t(this.h).l(new ux0(new rh4(5, this, str), 9)).w();
            case 6:
                return u(this.h).l(new com.vk.movika.sdk.base.hooks.k(new z5a(1, this, str), 8)).w();
            case 7:
                return o(this.h).l(new np1(new na7(5, this, str), 6)).w();
        }
    }

    @Override // xsna.t9a
    public final io.reactivex.rxjava3.core.q<hda> k() {
        return io.reactivex.rxjava3.core.x.y(v(this.h), t(this.h), n(this.h), u(this.h), o(this.h), p(), new ft0(new faa(this), 9)).w();
    }

    @Override // xsna.t9a
    public final io.reactivex.rxjava3.core.q<hda> l() {
        return t(this.h).l(new j7(new g20(this, 14), 11)).w();
    }

    @Override // xsna.t9a
    public final io.reactivex.rxjava3.core.q<hda> m() {
        char c2;
        io.reactivex.rxjava3.core.x vVar;
        io.reactivex.rxjava3.internal.operators.single.a aVar = new io.reactivex.rxjava3.internal.operators.single.a(v(this.h));
        io.reactivex.rxjava3.internal.operators.single.a aVar2 = new io.reactivex.rxjava3.internal.operators.single.a(t(this.h));
        io.reactivex.rxjava3.internal.operators.single.a aVar3 = new io.reactivex.rxjava3.internal.operators.single.a(n(this.h));
        io.reactivex.rxjava3.internal.operators.single.a aVar4 = new io.reactivex.rxjava3.internal.operators.single.a(u(this.h));
        io.reactivex.rxjava3.internal.operators.single.a aVar5 = new io.reactivex.rxjava3.internal.operators.single.a(o(this.h));
        io.reactivex.rxjava3.internal.operators.single.a aVar6 = new io.reactivex.rxjava3.internal.operators.single.a(p());
        io.reactivex.rxjava3.core.q w = io.reactivex.rxjava3.core.x.y(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, new ai3(new gaa(this), 5)).w();
        qi40 qi40Var = this.g;
        qi40Var.getClass();
        com.vk.core.utils.newtork.b.a.getClass();
        int i = 0;
        int i2 = 3;
        int i3 = 7;
        if (com.vk.core.utils.newtork.b.d() && qi40Var.c.isEmpty()) {
            c2 = 5;
            vVar = new io.reactivex.rxjava3.internal.operators.single.e0(rsg0.w0(yfb.x(wga.o(qi40Var.a, null, (String) qi40.d.getValue(), 25))).l(new pi40(new pj1(qi40Var.b, 9), i)).l(new tuz(new rxz(qi40Var, i3), 3)), new he40(new bl30(qi40Var, i2), 1));
        } else {
            c2 = 5;
            vVar = new io.reactivex.rxjava3.internal.operators.single.v(new ekl(qi40Var, 1));
        }
        io.reactivex.rxjava3.internal.operators.single.b0 m = vVar.m(asu0.a.c());
        a.g gVar = new a.g(new com.vk.movika.sdk.base.ui.p0(new haa(this), i3));
        io.reactivex.rxjava3.core.b0[] b0VarArr = new io.reactivex.rxjava3.core.b0[7];
        b0VarArr[0] = aVar;
        b0VarArr[1] = aVar2;
        b0VarArr[2] = aVar3;
        b0VarArr[3] = aVar4;
        b0VarArr[4] = aVar5;
        b0VarArr[c2] = aVar6;
        b0VarArr[6] = m;
        return io.reactivex.rxjava3.core.x.E(gVar, b0VarArr).w().n0(w);
    }

    public final io.reactivex.rxjava3.internal.operators.single.f0 n(String str) {
        io.reactivex.rxjava3.core.x<List<Playlist>> b2 = this.b.b();
        if (r()) {
            b2 = b2.l(new mj1(new oj(4), 5));
        } else {
            String str2 = this.e;
            if (str2 != null && drm0.D(str2, MusicCollectionType.ALBUMS.m(), false)) {
                b2 = b2.l(new e05(new f57(3), 6));
            }
        }
        return w(b2, str);
    }

    public final io.reactivex.rxjava3.core.x<List<AudioBook>> o(String str) {
        if (!((Boolean) this.n.getValue()).booleanValue()) {
            return io.reactivex.rxjava3.core.x.k(EmptyList.b);
        }
        io.reactivex.rxjava3.core.x<List<AudioBook>> i = this.b.i();
        if (r()) {
            i = i.l(new c(new b()));
        }
        return i.l(new mm6(new ll1(3, this, str), 7)).q(asu0.a.c());
    }

    public final io.reactivex.rxjava3.core.x<List<MusicTrack>> p() {
        if (!((Boolean) this.o.getValue()).booleanValue()) {
            return io.reactivex.rxjava3.core.x.k(EmptyList.b);
        }
        String valueOf = String.valueOf(o25.a().c().b);
        return new io.reactivex.rxjava3.internal.operators.single.r(new io.reactivex.rxjava3.internal.operators.single.v(new t72(1, this, valueOf)), new kb(new bi0(4, this, valueOf), 10)).q(asu0.a.c());
    }

    public final io.reactivex.rxjava3.core.q<hda> q(String str) {
        io.reactivex.rxjava3.internal.operators.single.f0 v = v(this.h);
        io.reactivex.rxjava3.internal.operators.single.f0 t = t(this.h);
        io.reactivex.rxjava3.internal.operators.single.f0 n = n(this.h);
        io.reactivex.rxjava3.core.x<List<MusicTrack>> p = p();
        qi40 qi40Var = this.g;
        qi40Var.getClass();
        com.vk.core.utils.newtork.b.a.getClass();
        return io.reactivex.rxjava3.core.x.C(v, t, n, p, ((com.vk.core.utils.newtork.b.d() && qi40Var.c.isEmpty()) ? new io.reactivex.rxjava3.internal.operators.single.e0(rsg0.w0(yfb.x(wga.o(qi40Var.a, null, (String) qi40.d.getValue(), 25))).l(new pi40(new pj1(qi40Var.b, 9), 0)).l(new tuz(new rxz(qi40Var, 7), 3)), new he40(new bl30(qi40Var, 3), 1)) : new io.reactivex.rxjava3.internal.operators.single.v(new ekl(qi40Var, 1))).m(asu0.a.c()), new pa(new jaa(this, str), 6)).w();
    }

    public final boolean r() {
        return ((Boolean) this.p.getValue()).booleanValue();
    }

    public final io.reactivex.rxjava3.internal.operators.single.f0 t(String str) {
        io.reactivex.rxjava3.core.x<List<Playlist>> l = this.b.l();
        if (r()) {
            l = l.l(new l7(new wh6(4), 8));
        } else {
            String str2 = this.e;
            if (str2 != null && drm0.D(str2, MusicCollectionType.PLAYLISTS.m(), false)) {
                l = l.l(new o7(new gt(3), 8));
            }
        }
        return w(l, str);
    }

    public final io.reactivex.rxjava3.core.x<List<OfflinePodcast>> u(String str) {
        return !((Boolean) this.m.getValue()).booleanValue() ? io.reactivex.rxjava3.core.x.k(EmptyList.b) : this.b.h().l(new nu0(new com.vk.libvideo.b(8, this, str), 5)).q(asu0.a.c());
    }

    public final io.reactivex.rxjava3.internal.operators.single.f0 v(String str) {
        io.reactivex.rxjava3.core.x<List<MusicTrack>> A = this.b.A();
        if (r()) {
            A = A.l(new t7(new e60(9), 5));
        } else {
            String str2 = this.e;
            if (str2 != null && drm0.D(str2, MusicCollectionType.AUDIOS.m(), false)) {
                A = A.l(new aa6(new nt(11), 4));
            }
        }
        int i = 6;
        return A.l(new y7(new o43(i, this, str), i)).l(new v20(new com.vk.im.ui.fragments.b(this, 16), 10)).q(asu0.a.c());
    }

    public final io.reactivex.rxjava3.internal.operators.single.f0 w(io.reactivex.rxjava3.core.x xVar, String str) {
        int i = 5;
        return xVar.l(new nb(new lh(i, this, str), i)).l(new pb(new iz(this, 8), 3)).q(asu0.a.c());
    }
}
