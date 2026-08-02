package xsna;

import com.vk.core.view.components.banner.VkBanner;
import com.vk.donut.price.model.template.DonutPriceTemplate;
import com.vk.dto.common.Image;
import com.vk.dto.common.VideoFile;
import com.vk.profile.core.content.ContentTab;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import xsna.cvd0;

/* compiled from: Videos.kt */
/* loaded from: classes5.dex */
public final class sst0 extends CommunityProfileContentItem {
    public final List<b> j;
    public final cvd0.e k;
    public final CommunityProfileContentItem.ContentType l;
    public final String m;
    public final boolean n;
    public final boolean o;
    public final a p;
    public final String q;
    public final CommunityProfileContentItem.b r;
    public final CommunityProfileContentItem.c s;
    public final CommunityProfileContentItem.State t;
    public final CommunityProfileContentItem.d u;
    public final CommunityProfileContentItem.State v;
    public final boolean w;
    public final CommunityProfileContentItem.e x;

    /* compiled from: Videos.kt */
    public static final class a {
        public final VkBanner.b.C0806b a;
        public final VkBanner.e b;
        public final VkBanner.a.C0804a c;

        public a(VkBanner.b.C0806b c0806b, VkBanner.e eVar, VkBanner.a.C0804a c0804a) {
            this.a = c0806b;
            this.b = eVar;
            this.c = c0804a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b) && this.c.equals(aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "GrowthTrapBanner(before=" + this.a + ", middle=" + this.b + ", after=" + this.c + ')';
        }
    }

    /* compiled from: Videos.kt */
    public static final class b {
        public final VideoFile a;
        public final c b;
        public final C3688b c;
        public final d d;
        public final boolean e;

        /* compiled from: Videos.kt */
        public static final class a {
            public final String a;
            public final DonutPriceTemplate b;
            public final String c;

            public a(String str, DonutPriceTemplate donutPriceTemplate, String str2) {
                this.a = str;
                this.b = donutPriceTemplate;
                this.c = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                DonutPriceTemplate donutPriceTemplate = this.b;
                int hashCode2 = (hashCode + (donutPriceTemplate == null ? 0 : donutPriceTemplate.b.hashCode())) * 31;
                String str = this.c;
                return hashCode2 + (str != null ? str.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ActionButton(title=");
                sb.append(this.a);
                sb.append(", priceTemplate=");
                sb.append(this.b);
                sb.append(", actionUrl=");
                return ho8.a(sb, this.c, ')');
            }
        }

        /* compiled from: Videos.kt */
        /* renamed from: xsna.sst0$b$b, reason: collision with other inner class name */
        public static final class C3688b {
            public final String a;
            public final boolean b;

            public C3688b(String str, boolean z) {
                this.a = str;
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3688b)) {
                    return false;
                }
                C3688b c3688b = (C3688b) obj;
                return epx.f(this.a, c3688b.a) && this.b == c3688b.b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("DonutLevel(title=");
                sb.append(this.a);
                sb.append(", isMostExpensive=");
                return defpackage.q0.a(sb, this.b, ')');
            }
        }

        /* compiled from: Videos.kt */
        public static final class c {
            public final String a;
            public final Image b;
            public final a c;

            public c(String str, Image image, a aVar) {
                this.a = str;
                this.b = image;
                this.c = aVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c);
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                Image image = this.b;
                int hashCode2 = (hashCode + (image == null ? 0 : image.hashCode())) * 31;
                a aVar = this.c;
                return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
            }

            public final String toString() {
                return "DonutTeaser(text=" + this.a + ", image=" + this.b + ", button=" + this.c + ')';
            }
        }

        /* compiled from: Videos.kt */
        public static final class d {
            public final String a;

            public d(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                dVar.getClass();
                return epx.f(this.a, dVar.a);
            }

            public final int hashCode() {
                int hashCode = Integer.hashCode(R.drawable.vk_icon_donut_color_16) * 31;
                String str = this.a;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                return ho8.a(new StringBuilder("FooterIcon(icon=2131236957, contentDescription="), this.a, ')');
            }
        }

        public /* synthetic */ b(VideoFile videoFile, c cVar, C3688b c3688b, d dVar, int i) {
            this(videoFile, (i & 2) != 0 ? null : cVar, (i & 4) != 0 ? null : c3688b, (i & 8) != 0 ? null : dVar, false);
        }

        public final boolean equals(Object obj) {
            b bVar = obj instanceof b ? (b) obj : null;
            if (bVar == null) {
                return false;
            }
            VideoFile videoFile = bVar.a;
            VideoFile videoFile2 = this.a;
            return epx.f(videoFile2.r1(), videoFile.r1()) && epx.f(videoFile2.getPrivacy(), videoFile.getPrivacy()) && epx.f(videoFile2.i6(), videoFile.i6()) && epx.f(videoFile2.getTitle(), videoFile.getTitle()) && epx.f(videoFile2.getImage(), videoFile.getImage()) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && this.e == bVar.e;
        }

        public final int hashCode() {
            return Objects.hash(this.a, this.b, this.c, this.d, Boolean.valueOf(this.e));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VideoItem(videoFile=");
            sb.append(this.a);
            sb.append(", donutTeaser=");
            sb.append(this.b);
            sb.append(", donutLevel=");
            sb.append(this.c);
            sb.append(", footerIcon=");
            sb.append(this.d);
            sb.append(", isHidden=");
            return defpackage.q0.a(sb, this.e, ')');
        }

        public b(VideoFile videoFile, c cVar, C3688b c3688b, d dVar, boolean z) {
            this.a = videoFile;
            this.b = cVar;
            this.c = c3688b;
            this.d = dVar;
            this.e = z;
        }
    }

    public /* synthetic */ sst0(CommunityProfileContentItem.ContentType contentType, a aVar, CommunityProfileContentItem.b bVar, CommunityProfileContentItem.c cVar, CommunityProfileContentItem.State state, CommunityProfileContentItem.d dVar, CommunityProfileContentItem.State state2, boolean z, int i) {
        this(null, null, contentType, null, false, false, aVar, null, bVar, cVar, state, dVar, state2, (i & 8192) != 0 ? false : z, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static sst0 i(sst0 sst0Var, ArrayList arrayList, cvd0.e eVar, CommunityProfileContentItem.ContentType contentType, String str, boolean z, boolean z2, String str2, CommunityProfileContentItem.State state, CommunityProfileContentItem.State state2, int i) {
        List list = (i & 1) != 0 ? sst0Var.j : arrayList;
        cvd0.e eVar2 = (i & 2) != 0 ? sst0Var.k : eVar;
        CommunityProfileContentItem.ContentType contentType2 = (i & 4) != 0 ? sst0Var.l : contentType;
        String str3 = (i & 8) != 0 ? sst0Var.m : str;
        boolean z3 = (i & 16) != 0 ? sst0Var.n : z;
        boolean z4 = (i & 32) != 0 ? sst0Var.o : z2;
        a aVar = sst0Var.p;
        String str4 = (i & 128) != 0 ? sst0Var.q : str2;
        CommunityProfileContentItem.b bVar = sst0Var.r;
        CommunityProfileContentItem.c cVar = sst0Var.s;
        CommunityProfileContentItem.State state3 = (i & 1024) != 0 ? sst0Var.t : state;
        CommunityProfileContentItem.d dVar = sst0Var.u;
        CommunityProfileContentItem.State state4 = (i & 4096) != 0 ? sst0Var.v : state2;
        boolean z5 = sst0Var.w;
        CommunityProfileContentItem.e eVar3 = (i & 16384) != 0 ? sst0Var.x : null;
        sst0Var.getClass();
        return new sst0(list, eVar2, contentType2, str3, z3, z4, aVar, str4, bVar, cVar, state3, dVar, state4, z5, eVar3);
    }

    @Override // com.vk.profile.core.tabs.state.CommunityProfileContentItem
    public final CommunityProfileContentItem.b a() {
        return this.r;
    }

    @Override // com.vk.profile.core.tabs.state.CommunityProfileContentItem
    public final CommunityProfileContentItem.c b() {
        return this.s;
    }

    @Override // com.vk.profile.core.tabs.state.CommunityProfileContentItem
    public final CommunityProfileContentItem.d c() {
        return this.u;
    }

    @Override // com.vk.profile.core.tabs.state.CommunityProfileContentItem
    public final CommunityProfileContentItem.State d() {
        return this.v;
    }

    @Override // com.vk.profile.core.tabs.state.CommunityProfileContentItem
    public final CommunityProfileContentItem.e e() {
        return this.x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sst0)) {
            return false;
        }
        sst0 sst0Var = (sst0) obj;
        return epx.f(this.j, sst0Var.j) && epx.f(this.k, sst0Var.k) && this.l == sst0Var.l && epx.f(this.m, sst0Var.m) && this.n == sst0Var.n && this.o == sst0Var.o && epx.f(this.p, sst0Var.p) && epx.f(this.q, sst0Var.q) && epx.f(this.r, sst0Var.r) && epx.f(this.s, sst0Var.s) && this.t == sst0Var.t && epx.f(this.u, sst0Var.u) && this.v == sst0Var.v && this.w == sst0Var.w && epx.f(this.x, sst0Var.x);
    }

    @Override // com.vk.profile.core.tabs.state.CommunityProfileContentItem
    public final CommunityProfileContentItem.State f() {
        return this.t;
    }

    @Override // com.vk.profile.core.tabs.state.CommunityProfileContentItem
    public final boolean g() {
        return this.w;
    }

    @Override // com.vk.profile.core.tabs.state.CommunityProfileContentItem
    public final int h() {
        int h = super.h() * 31;
        List<b> list = this.j;
        return h + (list != null ? list.hashCode() : 0);
    }

    public final int hashCode() {
        List<b> list = this.j;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        cvd0.e eVar = this.k;
        int hashCode2 = (this.l.hashCode() + ((hashCode + (eVar == null ? 0 : eVar.a.hashCode())) * 31)) * 31;
        String str = this.m;
        int b2 = qoy.b(qoy.b((hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.n), 31, this.o);
        a aVar = this.p;
        int hashCode3 = (b2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str2 = this.q;
        int a2 = io.reactivex.rxjava3.internal.operators.mixed.j.a(this.t, shy.a(this.s.a, (this.r.hashCode() + ((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31), 31);
        CommunityProfileContentItem.d dVar = this.u;
        int b3 = qoy.b(io.reactivex.rxjava3.internal.operators.mixed.j.a(this.v, (a2 + (dVar == null ? 0 : dVar.hashCode())) * 31, 31), 31, this.w);
        CommunityProfileContentItem.e eVar2 = this.x;
        return b3 + (eVar2 != null ? eVar2.hashCode() : 0);
    }

    public final String toString() {
        return "Videos(videos=" + this.j + ", playlists=" + this.k + ", contentType=" + this.l + ", playlistsNextFrom=" + this.m + ", hasMore=" + this.n + ", hasMoreMixedAlbums=" + this.o + ", growthTrapBanner=" + this.p + ", nextFrom=" + this.q + ", empty=" + this.r + ", error=" + this.s + ", state=" + this.t + ", fabState=" + this.u + ", loadMoreState=" + this.v + ", isPinned=" + this.w + ", onboardingState=" + this.x + ')';
    }

    public sst0(List<b> list, cvd0.e eVar, CommunityProfileContentItem.ContentType contentType, String str, boolean z, boolean z2, a aVar, String str2, CommunityProfileContentItem.b bVar, CommunityProfileContentItem.c cVar, CommunityProfileContentItem.State state, CommunityProfileContentItem.d dVar, CommunityProfileContentItem.State state2, boolean z3, CommunityProfileContentItem.e eVar2) {
        super(new ContentTab.Video(z3, 2), list != null ? list.size() : 0, bVar, cVar, state, dVar, state2, 2, eVar2, 512);
        this.j = list;
        this.k = eVar;
        this.l = contentType;
        this.m = str;
        this.n = z;
        this.o = z2;
        this.p = aVar;
        this.q = str2;
        this.r = bVar;
        this.s = cVar;
        this.t = state;
        this.u = dVar;
        this.v = state2;
        this.w = z3;
        this.x = eVar2;
    }
}
