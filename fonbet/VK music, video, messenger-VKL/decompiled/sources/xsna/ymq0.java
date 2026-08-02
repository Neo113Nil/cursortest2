package xsna;

import android.content.Context;
import com.vk.api.generated.users.dto.UsersContentTypeDto;
import com.vk.api.generated.users.dto.UsersTabCollectionDto;
import com.vk.api.generated.users.dto.UsersTabSpecialValuesDto;
import com.vk.clips.entrypoints.di.ClipsEntryPointsComponent;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.profile.core.tabs.ui.clips.Clips;
import com.vk.profile.user.impl.ui.f;
import com.vk.toggle.features.ClipsFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.cvd0;
import xsna.it80;

/* compiled from: UserProfileContentClipsFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class ymq0 extends wmq0<Clips, xaf> {
    public final rnq0 m;
    public final loq0 n;
    public final boolean o;
    public Clips p;
    public final wi50 q;
    public final nm8 r;
    public yok0 s;
    public final String t;

    /* compiled from: UserProfileContentClipsFeatureDelegate.kt */
    public static final class a {
        public final VKList<VideoFile> a;
        public final VKList<ClipsPlaylist> b;
        public final gud c;
        public final List<ExtendedUserProfile.m> d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(VKList<VideoFile> vKList, VKList<ClipsPlaylist> vKList2, gud gudVar, List<? extends ExtendedUserProfile.m> list) {
            this.a = vKList;
            this.b = vKList2;
            this.c = gudVar;
            this.d = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            VKList<VideoFile> vKList = this.a;
            int hashCode = (vKList == null ? 0 : vKList.hashCode()) * 31;
            VKList<ClipsPlaylist> vKList2 = this.b;
            int hashCode2 = (hashCode + (vKList2 == null ? 0 : vKList2.hashCode())) * 31;
            gud gudVar = this.c;
            int hashCode3 = (hashCode2 + (gudVar == null ? 0 : gudVar.hashCode())) * 31;
            List<ExtendedUserProfile.m> list = this.d;
            return hashCode3 + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ClipsTabData(videoResponse=");
            sb.append(this.a);
            sb.append(", playlistsResponse=");
            sb.append(this.b);
            sb.append(", draftsResponse=");
            sb.append(this.c);
            sb.append(", tabSetting=");
            return ms9.a(')', sb, this.d);
        }
    }

    /* compiled from: UserProfileContentClipsFeatureDelegate.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<VKList<VideoFile>, it80<VKList<VideoFile>>> {
        @Override // xsna.izs
        public final it80<VKList<VideoFile>> invoke(VKList<VideoFile> vKList) {
            ((it80.a) this.receiver).getClass();
            return new it80<>(vKList);
        }
    }

    /* compiled from: UserProfileContentClipsFeatureDelegate.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<gud, it80<gud>> {
        @Override // xsna.izs
        public final it80<gud> invoke(gud gudVar) {
            ((it80.a) this.receiver).getClass();
            return new it80<>(gudVar);
        }
    }

    /* compiled from: UserProfileContentClipsFeatureDelegate.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<List<? extends ExtendedUserProfile.m>, it80<List<? extends ExtendedUserProfile.m>>> {
        @Override // xsna.izs
        public final it80<List<? extends ExtendedUserProfile.m>> invoke(List<? extends ExtendedUserProfile.m> list) {
            ((it80.a) this.receiver).getClass();
            return new it80<>(list);
        }
    }

    public ymq0(dvq0 dvq0Var, r0e0 r0e0Var, boolean z, rnq0 rnq0Var, loq0 loq0Var, boolean z2) {
        super(dvq0Var, r0e0Var, z);
        this.m = rnq0Var;
        this.n = loq0Var;
        this.o = z2;
        this.q = bay.a();
        this.r = w0b.a(-2, null, null, 6);
        this.t = "short_videos";
    }

    public static final void C(ymq0 ymq0Var, Clips clips) {
        cvd0.f fVar;
        Clips i;
        if (clips == null) {
            Clips clips2 = ymq0Var.p;
            if (clips2 != null) {
                wmq0.B(ymq0Var, clips2, null, CommunityProfileContentItem.State.ERROR, 2);
                return;
            }
            return;
        }
        cvd0.f fVar2 = clips.j;
        if (fVar2 == null || !fVar2.a.isEmpty()) {
            fVar = fVar2;
            i = Clips.i(clips, null, null, null, null, false, false, null, null, CommunityProfileContentItem.State.LOADED, null, null, null, true, 261631);
        } else {
            fVar = fVar2;
            i = Clips.i(clips, null, null, null, null, false, false, null, null, CommunityProfileContentItem.State.LOADED, null, null, null, true, 261589);
        }
        ymq0Var.z(i);
        E(i);
        cvd0.f fVar3 = fVar;
        if (fVar3 != null && fVar3.a.isEmpty()) {
            wmq0.B(ymq0Var, i, CommunityProfileContentItem.State.EMPTY, null, 4);
        }
        ymq0Var.p = i;
    }

    public static final io.reactivex.rxjava3.internal.operators.single.d0 D(ymq0 ymq0Var, Clips clips) {
        Clips F = F(clips);
        rnq0 rnq0Var = ymq0Var.m;
        r0e0 r0e0Var = ymq0Var.c;
        io.reactivex.rxjava3.internal.operators.single.y h = rnq0Var.h(r0e0Var.a(), F.p);
        it80.a aVar = it80.b;
        return new io.reactivex.rxjava3.internal.operators.single.d0(io.reactivex.rxjava3.core.x.B(h.l(new a840(new bnq0(1, aVar, it80.a.class, "of", "of(Ljava/lang/Object;)Lcom/vk/core/util/Optional;", 0), 14)), io.reactivex.rxjava3.core.x.j(rnq0Var.b(r0e0Var.a(), false).U(new qca0(new cnq0(1, aVar, it80.a.class, "of", "of(Ljava/lang/Object;)Lcom/vk/core/util/Optional;", 0), 10))), new yzt(new z9g(9), 17)).l(new pi40(new fo6(27, ymq0Var, clips), 14)), new yu50(12), null);
    }

    public static Clips E(Clips clips) {
        List<ClipsPlaylist> list;
        List<ClipsPlaylist> list2;
        CommunityProfileContentItem.ContentType contentType = clips.l;
        List<ClipsPlaylist> list3 = clips.k;
        return (contentType.l() && ((list2 = list3) == null || list2.isEmpty())) ? Clips.i(clips, null, null, CommunityProfileContentItem.ContentType.ITEMS, null, false, false, null, null, null, null, null, null, false, 524283) : (!contentType.j() || (list = list3) == null || list.isEmpty()) ? clips : Clips.i(clips, null, null, CommunityProfileContentItem.ContentType.MIXED, null, false, false, null, null, null, null, null, null, false, 524283);
    }

    public static Clips F(Clips clips) {
        CommunityProfileContentItem.State state = CommunityProfileContentItem.State.RELOAD;
        CommunityProfileContentItem.State state2 = CommunityProfileContentItem.State.INITIAL;
        return Clips.i(clips, null, null, null, null, false, false, null, null, state, state2, state2, null, false, 255364);
    }

    @Override // xsna.wmq0
    public final void A(Clips clips, CommunityProfileContentItem.State state, CommunityProfileContentItem.State state2) {
        Clips clips2 = clips;
        z(Clips.i(clips2, null, null, null, null, false, false, null, null, state == null ? clips2.s : state, state2 == null ? clips2.u : state2, null, null, false, 259583));
    }

    public final io.reactivex.rxjava3.internal.operators.single.y G(Clips clips) {
        r0e0 r0e0Var = this.c;
        return this.m.f(r0e0Var.a(), clips.m, this.b.a(r0e0Var.a())).l(new oq80(new zmq0(1, it80.b, it80.a.class, "of", "of(Ljava/lang/Object;)Lcom/vk/core/util/Optional;", 0), 9));
    }

    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, kotlin.Lazy] */
    public final void I(Clips clips, boolean z) {
        io.reactivex.rxjava3.core.x b2;
        boolean z2 = z && clips.l.i();
        r0e0 r0e0Var = this.c;
        UserId a2 = r0e0Var.a();
        String str = clips.p;
        rnq0 rnq0Var = this.m;
        io.reactivex.rxjava3.internal.operators.single.y h = rnq0Var.h(a2, str);
        it80.a aVar = it80.b;
        io.reactivex.rxjava3.internal.operators.single.y l = h.l(new nh40(new b(1, aVar, it80.a.class, "of", "of(Ljava/lang/Object;)Lcom/vk/core/util/Optional;", 0), 20));
        io.reactivex.rxjava3.core.x G = z2 ? G(clips) : tr.b(aVar);
        UserId a3 = r0e0Var.a();
        dvq0 dvq0Var = this.b;
        if (dvq0Var.a(a3)) {
            io.reactivex.rxjava3.core.q<List<ExtendedUserProfile.m>> b3 = rnq0Var.b(r0e0Var.a(), false);
            d dVar = new d(1, aVar, it80.a.class, "of", "of(Ljava/lang/Object;)Lcom/vk/core/util/Optional;", 0);
            aVar = aVar;
            b2 = io.reactivex.rxjava3.core.x.j(b3.U(new je40(dVar, 13)));
        } else {
            b2 = tr.b(aVar);
        }
        p(io.reactivex.rxjava3.core.x.z(l, G, b2, dvq0Var.a(r0e0Var.a()) ? ((ClipsEntryPointsComponent) this.n.e.getValue()).E6().a().l(new mau(new c(1, aVar, it80.a.class, "of", "of(Ljava/lang/Object;)Lcom/vk/core/util/Optional;", 0), 17)) : tr.b(aVar), new gwn0(new xmq0(), 1)), new pe70(this, clips, z, 1), new e5e(this, clips, z, 2));
    }

    public final void M(xaf xafVar) {
        this.r.f(xafVar);
    }

    @Override // xsna.wmq0, xsna.rgq0
    public final void b(CommunityProfileContentItem communityProfileContentItem) {
        Clips clips = (Clips) communityProfileContentItem;
        if (clips.n) {
            wmq0.B(this, clips, null, CommunityProfileContentItem.State.LOADING, 2);
            I(clips, false);
        }
    }

    @Override // xsna.wmq0, xsna.rgq0
    public final void e(CommunityProfileContentItem communityProfileContentItem) {
        z(Clips.i((Clips) communityProfileContentItem, null, null, null, null, false, false, null, null, null, null, null, null, false, 507903));
    }

    @Override // xsna.wmq0, xsna.rgq0
    public final void f(CommunityProfileContentItem communityProfileContentItem, ExtendedUserProfile extendedUserProfile) {
        if (extendedUserProfile != null) {
            fpq0 fpq0Var = this.g;
            if (fpq0Var == null) {
                fpq0Var = null;
            }
            fpq0Var.B(f.e.s.a);
        }
    }

    @Override // xsna.wmq0, xsna.rgq0
    public final void g(CommunityProfileContentItem communityProfileContentItem, ExtendedUserProfile extendedUserProfile) {
        if (extendedUserProfile != null) {
            fpq0 fpq0Var = this.g;
            if (fpq0Var == null) {
                fpq0Var = null;
            }
            fpq0Var.B(new f.e.e0(extendedUserProfile.a.c));
        }
    }

    @Override // xsna.wmq0, xsna.rgq0
    public final void n(CommunityProfileContentItem communityProfileContentItem, ExtendedUserProfile extendedUserProfile) {
        if (extendedUserProfile != null) {
            fpq0 fpq0Var = this.g;
            if (fpq0Var == null) {
                fpq0Var = null;
            }
            fpq0Var.B(new f.e.v(extendedUserProfile));
        }
    }

    @Override // xsna.wmq0, xsna.rgq0
    public final void o(CommunityProfileContentItem communityProfileContentItem) {
        Clips clips = (Clips) communityProfileContentItem;
        z(Clips.i(clips, null, null, null, null, false, false, null, null, null, null, CommunityProfileContentItem.State.LOADING, null, false, 258047));
        p(G(clips), new l1k0(2, this, clips), new nk0(29, this, clips));
    }

    @Override // xsna.wmq0, xsna.huq
    public final void onDestroy() {
        this.r.B(null);
        yok0 yok0Var = this.s;
        if (yok0Var != null) {
            yok0Var.b(null);
        }
    }

    @Override // xsna.wmq0
    public final /* bridge */ /* synthetic */ CommunityProfileContentItem q(CommunityProfileContentItem communityProfileContentItem) {
        return F((Clips) communityProfileContentItem);
    }

    @Override // xsna.wmq0
    public final Clips s(ExtendedUserProfile.m mVar, boolean z, boolean z2) {
        String str;
        yok0 yok0Var = this.s;
        ArrayList arrayList = null;
        if (yok0Var != null) {
            yok0Var.b(null);
        }
        this.s = myc0.h(zvj.a(hqu0.b()), null, null, new anq0(this, null), 3);
        UsersTabSpecialValuesDto usersTabSpecialValuesDto = mVar.h;
        Integer d2 = usersTabSpecialValuesDto != null ? usersTabSpecialValuesDto.d() : null;
        String str2 = mVar.a;
        String str3 = this.t;
        if (!str2.equals(str3)) {
            throw new IllegalArgumentException(("Provide " + mVar + " expected name was " + str3).toString());
        }
        List<UsersContentTypeDto> list = mVar.e;
        List<UsersContentTypeDto> list2 = list;
        CommunityProfileContentItem.ContentType contentType = (list2 == null || list2.isEmpty()) ? CommunityProfileContentItem.ContentType.ITEMS : (list.size() == 1 && list.contains(UsersContentTypeDto.SHORT_VIDEOS)) ? CommunityProfileContentItem.ContentType.ITEMS : CommunityProfileContentItem.ContentType.MIXED;
        Integer valueOf = Integer.valueOf(R.string.profile_content_add_clip);
        if (d2 != null) {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            str = context.getResources().getQuantityString(R.plurals.profile_content_clips_coauthors_invitation_count, d2.intValue(), d2);
        } else {
            str = null;
        }
        CommunityProfileContentItem.b y = wmq0.y(this, mVar, R.string.profile_content_clips_empty, valueOf, this.d, str, 8);
        CommunityProfileContentItem.c cVar = new CommunityProfileContentItem.c(R.string.profile_content_clips_error);
        CommunityProfileContentItem.State state = z ? CommunityProfileContentItem.State.RELOAD : CommunityProfileContentItem.State.INITIAL;
        CommunityProfileContentItem.d u = wmq0.u(this, mVar, R.string.profile_content_add_clip, this.o ? R.string.profile_custom_short_add_text : R.string.community_profile_fab_add, this.d, 56);
        CommunityProfileContentItem.State state2 = CommunityProfileContentItem.State.INITIAL;
        boolean z3 = mVar.b;
        List<UsersTabCollectionDto> list3 = mVar.g;
        if (list3 != null) {
            List<UsersTabCollectionDto> list4 = list3;
            arrayList = new ArrayList(c5g.u(list4, 10));
            Iterator<T> it = list4.iterator();
            while (it.hasNext()) {
                arrayList.add(Clips.a.b((UsersTabCollectionDto) it.next()));
            }
        }
        return new Clips(contentType, y, cVar, state, u, state2, state2, z3, arrayList, d2, this.b.a(this.c.a()), 278528);
    }

    @Override // xsna.wmq0
    public final io.reactivex.rxjava3.core.q<xaf> t() {
        return this.m.l();
    }

    @Override // xsna.wmq0
    public final String v() {
        return this.t;
    }

    @Override // xsna.wmq0
    public final /* bridge */ /* synthetic */ void w(CommunityProfileContentItem communityProfileContentItem) {
        I((Clips) communityProfileContentItem, true);
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.wmq0
    public final void x(Clips clips) {
        Clips clips2 = clips;
        ClipsFeatures clipsFeatures = ClipsFeatures.CLIPS_NEW_UPLOADER;
        clipsFeatures.getClass();
        boolean a2 = com.vk.toggle.b.A.a(clipsFeatures);
        loq0 loq0Var = this.n;
        if (a2) {
            io.reactivex.rxjava3.disposables.c subscribe = ((eef) loq0Var.c.getValue()).b().r0(asu0.a.c()).subscribe(new wmz(new wgm0(this, clips2), 27));
            io.reactivex.rxjava3.disposables.b bVar = this.e;
            if (bVar == null) {
                bVar = null;
            }
            bVar.b(subscribe);
        } else {
            io.reactivex.rxjava3.disposables.c subscribe2 = ((ylf) loq0Var.b.getValue()).b().r0(asu0.a.c()).subscribe(new rt10(new bl30(27, this, clips2), 19));
            io.reactivex.rxjava3.disposables.b bVar2 = this.e;
            if (bVar2 == null) {
                bVar2 = null;
            }
            bVar2.b(subscribe2);
        }
        io.reactivex.rxjava3.disposables.c subscribe3 = this.m.l().r0(asu0.a.c()).subscribe(new cl30(new arb0(this, clips2), 16));
        io.reactivex.rxjava3.disposables.b bVar3 = this.e;
        (bVar3 != null ? bVar3 : null).b(subscribe3);
    }
}
