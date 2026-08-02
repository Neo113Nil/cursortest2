package xsna;

import com.vk.catalog2.common.dto.api.link.CatalogLink;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: MusicCategoryOfflineDataProviderImpl.kt */
/* loaded from: classes16.dex */
public final class te40 implements qe40 {
    public final lq40 a;
    public final df5 b;
    public final g950 c;
    public final bpn0 d = new bpn0(new ig(19));
    public final bpn0 e = new bpn0(new lg(23));
    public final bpn0 f = new bpn0(new m1o(this, 25));
    public final bpn0 g = new bpn0(new btm(this, 25));
    public final bpn0 h = new bpn0(new b010(this, 8));
    public final bpn0 i = new bpn0(new s1m(this, 28));
    public final bpn0 j = new bpn0(new gd40(this, 1));
    public final bpn0 k = new bpn0(new re40(this, 0));
    public final bpn0 l = new bpn0(new rf20(this, 4));
    public final bpn0 m = new bpn0(new nef(this, 23));
    public final bpn0 n = new bpn0(new sim(this, 24));

    /* compiled from: MusicCategoryOfflineDataProviderImpl.kt */
    public static final class a implements qe40 {
        public final List<qe40> a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends qe40> list) {
            this.a = list;
        }

        @Override // xsna.qe40
        public final io.reactivex.rxjava3.core.x<tt70> a(UIBlockLink uIBlockLink) {
            List<qe40> list = this.a;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((qe40) it.next()).a(uIBlockLink));
            }
            return io.reactivex.rxjava3.core.x.D(arrayList, new b());
        }

        @Override // xsna.qe40
        public final boolean b(UIBlockLink uIBlockLink, yj40 yj40Var) {
            List<qe40> list = this.a;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((qe40) it.next()).b(uIBlockLink, yj40Var)) {
                    return true;
                }
            }
            return false;
        }

        @Override // xsna.qe40
        public final io.reactivex.rxjava3.core.x<tt70> c(UIBlockLink uIBlockLink) {
            List<qe40> list = this.a;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((qe40) it.next()).c(uIBlockLink));
            }
            return io.reactivex.rxjava3.core.x.D(arrayList, new b());
        }
    }

    /* compiled from: MusicCategoryOfflineDataProviderImpl.kt */
    public static final class b implements io.reactivex.rxjava3.functions.l {
        @Override // io.reactivex.rxjava3.functions.l
        public final /* synthetic */ Object apply(Object obj) {
            return se40.b.invoke(obj);
        }
    }

    public te40(lq40 lq40Var, df5 df5Var, g950 g950Var) {
        this.a = lq40Var;
        this.b = df5Var;
        this.c = g950Var;
    }

    @Override // xsna.qe40
    public final io.reactivex.rxjava3.core.x<tt70> a(UIBlockLink uIBlockLink) {
        return d(uIBlockLink).a(uIBlockLink);
    }

    @Override // xsna.qe40
    public final boolean b(UIBlockLink uIBlockLink, yj40 yj40Var) {
        return d(uIBlockLink).b(uIBlockLink, yj40Var);
    }

    @Override // xsna.qe40
    public final io.reactivex.rxjava3.core.x<tt70> c(UIBlockLink uIBlockLink) {
        return d(uIBlockLink).c(uIBlockLink);
    }

    public final qe40 d(UIBlockLink uIBlockLink) {
        String str = uIBlockLink.b;
        CatalogLink catalogLink = uIBlockLink.y;
        boolean f = epx.f(str, "synthetic_offline_categories");
        bpn0 bpn0Var = this.n;
        if (!f) {
            return (a) bpn0Var.getValue();
        }
        String str2 = catalogLink.b;
        String str3 = catalogLink.b;
        return epx.f(str2, "synthetic_offline_music_album_all") ? (ke40) this.i.getValue() : epx.f(str3, "synthetic_offline_music_playlist_all") ? (ze40) this.h.getValue() : epx.f(str3, "synthetic_offline_music_audiobook_all") ? (le40) this.k.getValue() : epx.f(str3, "synthetic_offline_music_podcast_all") ? (af40) this.l.getValue() : epx.f(str3, "synthetic_offline_music_autodownload_all") ? (pe40) this.m.getValue() : (a) bpn0Var.getValue();
    }
}
