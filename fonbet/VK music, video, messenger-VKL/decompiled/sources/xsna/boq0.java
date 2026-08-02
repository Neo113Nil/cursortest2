package xsna;

import com.vk.api.generated.donut.dto.DonutGetLevelsResponseDto;
import com.vk.api.generated.users.dto.UsersContentTypeDto;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.video.VideoAlbum;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.profile.user.impl.ui.f;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.it80;
import xsna.sst0;

/* compiled from: UserProfileContentVideoFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class boq0 extends wmq0<sst0, s3q0> {
    public final rnq0 m;
    public final loq0 n;
    public final boolean o;
    public final String p;
    public List<sst0.b> q;
    public final Object r;
    public final Object s;

    /* compiled from: UserProfileContentVideoFeatureDelegate.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<DonutGetLevelsResponseDto, it80<DonutGetLevelsResponseDto>> {
        @Override // xsna.izs
        public final it80<DonutGetLevelsResponseDto> invoke(DonutGetLevelsResponseDto donutGetLevelsResponseDto) {
            ((it80.a) this.receiver).getClass();
            return new it80<>(donutGetLevelsResponseDto);
        }
    }

    /* compiled from: UserProfileContentVideoFeatureDelegate.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<List<? extends VideoAlbum>, it80<List<? extends VideoAlbum>>> {
        @Override // xsna.izs
        public final it80<List<? extends VideoAlbum>> invoke(List<? extends VideoAlbum> list) {
            ((it80.a) this.receiver).getClass();
            return new it80<>(list);
        }
    }

    /* compiled from: UserProfileContentVideoFeatureDelegate.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<VKList<VideoFile>, it80<VKList<VideoFile>>> {
        @Override // xsna.izs
        public final it80<VKList<VideoFile>> invoke(VKList<VideoFile> vKList) {
            ((it80.a) this.receiver).getClass();
            return new it80<>(vKList);
        }
    }

    public boq0(dvq0 dvq0Var, r0e0 r0e0Var, boolean z, rnq0 rnq0Var, loq0 loq0Var, boolean z2, wjs0 wjs0Var) {
        super(dvq0Var, r0e0Var, z);
        this.m = rnq0Var;
        this.n = loq0Var;
        this.o = z2;
        this.p = "videos";
        u110 u110Var = new u110(this, 23);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.r = msy.a(lazyThreadSafetyMode, u110Var);
        this.s = msy.a(lazyThreadSafetyMode, new im80(8));
    }

    @Override // xsna.wmq0
    public final void A(sst0 sst0Var, CommunityProfileContentItem.State state, CommunityProfileContentItem.State state2) {
        sst0 sst0Var2 = sst0Var;
        if (state == null) {
            state = sst0Var2.t;
        }
        CommunityProfileContentItem.State state3 = state;
        if (state2 == null) {
            state2 = sst0Var2.v;
        }
        z(sst0.i(sst0Var2, null, null, null, null, false, false, null, state3, state2, 27647));
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
    public final void C(sst0 sst0Var, boolean z) {
        io.reactivex.rxjava3.core.x b2;
        io.reactivex.rxjava3.core.x b3;
        CommunityProfileContentItem.ContentType contentType = sst0Var.l;
        boolean z2 = true;
        boolean z3 = z || contentType.k();
        if ((!contentType.l() || !z) && !contentType.h()) {
            z2 = false;
        }
        rnq0 rnq0Var = this.m;
        r0e0 r0e0Var = this.c;
        io.reactivex.rxjava3.core.b0 l = z3 ? rnq0Var.r(r0e0Var.a(), sst0Var.q).l(new utg0(new c(1, it80.b, it80.a.class, "of", "of(Ljava/lang/Object;)Lcom/vk/core/util/Optional;", 0), 6)) : tr.b(it80.b);
        if (z2) {
            UserId a2 = r0e0Var.a();
            String str = sst0Var.m;
            b2 = rnq0Var.k(a2, str != null ? Integer.valueOf(Integer.parseInt(str)) : null).l(new oyr(new b(1, it80.b, it80.a.class, "of", "of(Ljava/lang/Object;)Lcom/vk/core/util/Optional;", 0), 26));
        } else {
            b2 = tr.b(it80.b);
        }
        if (z3 && ((Boolean) this.s.getValue()).booleanValue()) {
            io.reactivex.rxjava3.internal.operators.observable.f0 W = rsg0.W(yfb.x(dy2.c(new dy2(), r0e0Var.a(), null, 26)), 7);
            it80.a aVar = it80.b;
            io.reactivex.rxjava3.internal.operators.single.y l2 = W.l(new vtg0(new a(1, aVar, it80.a.class, "of", "of(Ljava/lang/Object;)Lcom/vk/core/util/Optional;", 0), 5));
            aVar.getClass();
            b3 = l2.o(it80.a.a());
        } else {
            b3 = tr.b(it80.b);
        }
        p(io.reactivex.rxjava3.core.x.A(l, b2, b3, new f0j0(new smi(4), 3)), new n360(this, sst0Var, z), new ii3(this, sst0Var, z, 6));
    }

    @Override // xsna.wmq0
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final void z(sst0 sst0Var) {
        super.z(sst0Var);
        this.q = sst0Var.j;
    }

    @Override // xsna.wmq0, xsna.rgq0
    public final void b(CommunityProfileContentItem communityProfileContentItem) {
        sst0 sst0Var = (sst0) communityProfileContentItem;
        if (sst0Var.n) {
            wmq0.B(this, sst0Var, null, CommunityProfileContentItem.State.LOADING, 2);
            C(sst0Var, false);
        }
    }

    @Override // xsna.wmq0, xsna.rgq0
    public final void e(CommunityProfileContentItem communityProfileContentItem) {
        z(sst0.i((sst0) communityProfileContentItem, null, null, null, null, false, false, null, null, null, 16383));
    }

    @Override // xsna.wmq0, xsna.rgq0
    public final void f(CommunityProfileContentItem communityProfileContentItem, ExtendedUserProfile extendedUserProfile) {
        if (extendedUserProfile != null) {
            fpq0 fpq0Var = this.g;
            if (fpq0Var == null) {
                fpq0Var = null;
            }
            fpq0Var.B(new f.e.s1(this.b.c()));
        }
    }

    @Override // xsna.wmq0, xsna.rgq0
    public final void l(CommunityProfileContentItem communityProfileContentItem, ExtendedUserProfile extendedUserProfile) {
        if (extendedUserProfile != null) {
            fpq0 fpq0Var = this.g;
            if (fpq0Var == null) {
                fpq0Var = null;
            }
            fpq0Var.B(new f.e.g1(this.c.a()));
        }
    }

    @Override // xsna.wmq0, xsna.rgq0
    public final void n(CommunityProfileContentItem communityProfileContentItem, ExtendedUserProfile extendedUserProfile) {
        if (extendedUserProfile != null) {
            UserId userId = extendedUserProfile.a.c;
            dvq0 dvq0Var = this.b;
            String string = dvq0Var.getString(dvq0Var.a(userId) ? R.string.profile_content_my_video_chapter_title : R.string.profile_content_video_chapter_title, new Object[0]);
            fpq0 fpq0Var = this.g;
            if (fpq0Var == null) {
                fpq0Var = null;
            }
            fpq0Var.B(new f.e.h1(userId, string));
        }
    }

    @Override // xsna.wmq0
    public final CommunityProfileContentItem q(CommunityProfileContentItem communityProfileContentItem) {
        return sst0.i((sst0) communityProfileContentItem, null, null, null, null, false, false, null, CommunityProfileContentItem.State.RELOAD, CommunityProfileContentItem.State.INITIAL, 27460);
    }

    @Override // xsna.wmq0
    public final sst0 s(ExtendedUserProfile.m mVar, boolean z, boolean z2) {
        String str = mVar.a;
        String str2 = this.p;
        if (str.equals(str2)) {
            List<UsersContentTypeDto> list = mVar.e;
            List<UsersContentTypeDto> list2 = list;
            CommunityProfileContentItem.ContentType contentType = (list2 == null || list2.isEmpty()) ? CommunityProfileContentItem.ContentType.ITEMS : (list.size() == 1 && list.contains(UsersContentTypeDto.VIDEOS_PLAYLISTS)) ? CommunityProfileContentItem.ContentType.ALBUMS : (list.size() == 1 && list.contains(UsersContentTypeDto.VIDEOS)) ? CommunityProfileContentItem.ContentType.ITEMS : CommunityProfileContentItem.ContentType.MIXED;
            boolean z3 = this.o;
            return new sst0(contentType, null, wmq0.y(this, mVar, z3 ? R.string.profile_content_videos_empty_new : R.string.profile_content_videos_empty, Integer.valueOf(z3 ? R.string.profile_content_create_video : R.string.profile_content_add_video), false, null, 28), new CommunityProfileContentItem.c(R.string.profile_content_videos_error), z ? CommunityProfileContentItem.State.RELOAD : CommunityProfileContentItem.State.INITIAL, wmq0.u(this, mVar, z3 ? R.string.profile_content_create_video : R.string.profile_content_add_video, z3 ? R.string.profile_custom_short_add_text : R.string.community_profile_fab_add, false, 120), CommunityProfileContentItem.State.INITIAL, mVar.b, 16384);
        }
        throw new IllegalArgumentException(("Provide " + mVar + " expected name was " + str2).toString());
    }

    @Override // xsna.wmq0
    public final io.reactivex.rxjava3.core.q<s3q0> t() {
        return new io.reactivex.rxjava3.internal.operators.observable.i0(wjs0.b.a0(asu0.a.d()), new l340(new dso0(this, 4), 17)).U(new aoq0(new t6c0(10), 0));
    }

    @Override // xsna.wmq0
    public final String v() {
        return this.p;
    }

    @Override // xsna.wmq0
    public final /* bridge */ /* synthetic */ void w(CommunityProfileContentItem communityProfileContentItem) {
        C((sst0) communityProfileContentItem, true);
    }
}
