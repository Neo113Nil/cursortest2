package xsna;

import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.profile.core.content.ContentTab;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.cvd0;

/* compiled from: Audios.kt */
/* loaded from: classes5.dex */
public final class j15 extends CommunityProfileContentItem {
    public final cvd0.a j;
    public final CommunityProfileContentItem.ContentType k;
    public final String l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final String p;
    public final CommunityProfileContentItem.b q;
    public final CommunityProfileContentItem.c r;
    public final CommunityProfileContentItem.State s;
    public final CommunityProfileContentItem.d t;
    public final CommunityProfileContentItem.State u;
    public final CommunityProfileContentItem.State v;
    public final boolean w;
    public final CommunityProfileContentItem.e x;

    /* compiled from: Audios.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CommunityProfileContentItem.ContentType.values().length];
            try {
                iArr[CommunityProfileContentItem.ContentType.ALBUMS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommunityProfileContentItem.ContentType.ITEMS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CommunityProfileContentItem.ContentType.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ j15(CommunityProfileContentItem.ContentType contentType, CommunityProfileContentItem.b bVar, CommunityProfileContentItem.c cVar, CommunityProfileContentItem.State state, CommunityProfileContentItem.d dVar, CommunityProfileContentItem.State state2, CommunityProfileContentItem.State state3, boolean z) {
        this(null, contentType, null, false, false, false, null, bVar, cVar, state, dVar, state2, state3, z, null);
    }

    public static j15 i(j15 j15Var, cvd0.a aVar, CommunityProfileContentItem.ContentType contentType, String str, boolean z, boolean z2, boolean z3, String str2, CommunityProfileContentItem.State state, CommunityProfileContentItem.State state2, CommunityProfileContentItem.State state3, int i) {
        cvd0.a aVar2 = (i & 1) != 0 ? j15Var.j : aVar;
        CommunityProfileContentItem.ContentType contentType2 = (i & 2) != 0 ? j15Var.k : contentType;
        String str3 = (i & 4) != 0 ? j15Var.l : str;
        boolean z4 = (i & 8) != 0 ? j15Var.m : z;
        boolean z5 = (i & 16) != 0 ? j15Var.n : z2;
        boolean z6 = (i & 32) != 0 ? j15Var.o : z3;
        String str4 = (i & 64) != 0 ? j15Var.p : str2;
        CommunityProfileContentItem.b bVar = j15Var.q;
        CommunityProfileContentItem.c cVar = j15Var.r;
        CommunityProfileContentItem.State state4 = (i & 512) != 0 ? j15Var.s : state;
        CommunityProfileContentItem.d dVar = j15Var.t;
        CommunityProfileContentItem.State state5 = (i & 2048) != 0 ? j15Var.u : state2;
        CommunityProfileContentItem.State state6 = (i & 4096) != 0 ? j15Var.v : state3;
        boolean z7 = j15Var.w;
        CommunityProfileContentItem.e eVar = (i & 16384) != 0 ? j15Var.x : null;
        j15Var.getClass();
        return new j15(aVar2, contentType2, str3, z4, z5, z6, str4, bVar, cVar, state4, dVar, state5, state6, z7, eVar);
    }

    @Override // com.vk.profile.core.tabs.state.CommunityProfileContentItem
    public final CommunityProfileContentItem.b a() {
        return this.q;
    }

    @Override // com.vk.profile.core.tabs.state.CommunityProfileContentItem
    public final CommunityProfileContentItem.c b() {
        return this.r;
    }

    @Override // com.vk.profile.core.tabs.state.CommunityProfileContentItem
    public final CommunityProfileContentItem.d c() {
        return this.t;
    }

    @Override // com.vk.profile.core.tabs.state.CommunityProfileContentItem
    public final CommunityProfileContentItem.State d() {
        return this.u;
    }

    @Override // com.vk.profile.core.tabs.state.CommunityProfileContentItem
    public final CommunityProfileContentItem.e e() {
        return this.x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j15)) {
            return false;
        }
        j15 j15Var = (j15) obj;
        return epx.f(this.j, j15Var.j) && this.k == j15Var.k && epx.f(this.l, j15Var.l) && this.m == j15Var.m && this.n == j15Var.n && this.o == j15Var.o && epx.f(this.p, j15Var.p) && epx.f(this.q, j15Var.q) && epx.f(this.r, j15Var.r) && this.s == j15Var.s && epx.f(this.t, j15Var.t) && this.u == j15Var.u && this.v == j15Var.v && this.w == j15Var.w && epx.f(this.x, j15Var.x);
    }

    @Override // com.vk.profile.core.tabs.state.CommunityProfileContentItem
    public final CommunityProfileContentItem.State f() {
        return this.s;
    }

    @Override // com.vk.profile.core.tabs.state.CommunityProfileContentItem
    public final boolean g() {
        return this.w;
    }

    @Override // com.vk.profile.core.tabs.state.CommunityProfileContentItem
    public final int h() {
        return this.v.hashCode() + qoy.b(super.h() * 31, 31, this.o);
    }

    public final int hashCode() {
        cvd0.a aVar = this.j;
        int hashCode = (this.k.hashCode() + ((aVar == null ? 0 : aVar.hashCode()) * 31)) * 31;
        String str = this.l;
        int b = qoy.b(qoy.b(qoy.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.m), 31, this.n), 31, this.o);
        String str2 = this.p;
        int a2 = io.reactivex.rxjava3.internal.operators.mixed.j.a(this.s, shy.a(this.r.a, (this.q.hashCode() + ((b + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31), 31);
        CommunityProfileContentItem.d dVar = this.t;
        int b2 = qoy.b(io.reactivex.rxjava3.internal.operators.mixed.j.a(this.v, io.reactivex.rxjava3.internal.operators.mixed.j.a(this.u, (a2 + (dVar == null ? 0 : dVar.hashCode())) * 31, 31), 31), 31, this.w);
        CommunityProfileContentItem.e eVar = this.x;
        return b2 + (eVar != null ? eVar.hashCode() : 0);
    }

    public final String toString() {
        return "Audios(musics=" + this.j + ", contentType=" + this.k + ", playlistsNextFrom=" + this.l + ", hasMore=" + this.m + ", hasMoreMixedAlbums=" + this.n + ", hasMorePlaylists=" + this.o + ", nextFrom=" + this.p + ", empty=" + this.q + ", error=" + this.r + ", state=" + this.s + ", fabState=" + this.t + ", loadMoreState=" + this.u + ", loadMorePlaylistsState=" + this.v + ", isPinned=" + this.w + ", onboardingState=" + this.x + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j15(cvd0.a aVar, CommunityProfileContentItem.ContentType contentType, String str, boolean z, boolean z2, boolean z3, String str2, CommunityProfileContentItem.b bVar, CommunityProfileContentItem.c cVar, CommunityProfileContentItem.State state, CommunityProfileContentItem.d dVar, CommunityProfileContentItem.State state2, CommunityProfileContentItem.State state3, boolean z4, CommunityProfileContentItem.e eVar) {
        super(r2, r4, bVar, cVar, state, dVar, state2, 4, eVar, 512);
        List<Playlist> list;
        List<MusicTrack> list2;
        List<MusicTrack> list3;
        ContentTab.Music music = new ContentTab.Music(z4, 2);
        int i = a.$EnumSwitchMapping$0[contentType.ordinal()];
        int i2 = 0;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (aVar != null && (list3 = aVar.b) != null) {
                    i2 = list3.size();
                }
                i2++;
            } else if (aVar != null && (list2 = aVar.b) != null) {
                i2 = list2.size();
            }
        } else if (aVar != null && (list = aVar.a) != null) {
            i2 = list.size();
        }
        this.j = aVar;
        this.k = contentType;
        this.l = str;
        this.m = z;
        this.n = z2;
        this.o = z3;
        this.p = str2;
        this.q = bVar;
        this.r = cVar;
        this.s = state;
        this.t = dVar;
        this.u = state2;
        this.v = state3;
        this.w = z4;
        this.x = eVar;
    }
}
