package xsna;

import com.vk.api.generated.groups.dto.GroupsContentTabsDto;
import com.vk.api.generated.groups.dto.GroupsGetContentForTabsContentDto;
import com.vk.api.generated.groups.dto.GroupsGetContentForTabsResponseDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.GroupContentTabSetting;
import com.vk.dto.group.GroupContentTabType;
import com.vk.profile.community.impl.ui.profile.actions.d;
import com.vk.profile.community.impl.ui.profile.d;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileState;
import com.vk.profile.core.content.ContentTab;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.hg1;
import xsna.it80;

/* compiled from: CommunityProfileContentPhotoFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class fkh extends nfh<iea0, s3q0> {
    public final ynh j;
    public boolean k;

    /* compiled from: CommunityProfileContentPhotoFeatureDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GroupContentTabType.values().length];
            try {
                iArr[GroupContentTabType.PHOTOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GroupContentTabType.PHOTOS_ALBUMS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: RxExt.kt */
    public static final class b implements izs {
        public static final b b = new b();

        @Override // xsna.izs
        public final Object invoke(Object obj) {
            return Boolean.valueOf(obj instanceof nda0);
        }
    }

    /* compiled from: RxExt.kt */
    public static final class c implements izs {
        public static final c b = new c();

        @Override // xsna.izs
        public final nda0 invoke(Object obj) {
            if (obj != null) {
                return (nda0) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vkontakte.android.upload.events.PhotoUploadEvent");
        }
    }

    /* compiled from: RxExt.kt */
    public static final class d implements izs {
        public static final d b = new d();

        @Override // xsna.izs
        public final Object invoke(Object obj) {
            return Boolean.valueOf(obj instanceof dl1);
        }
    }

    /* compiled from: RxExt.kt */
    public static final class e implements izs {
        public static final e b = new e();

        @Override // xsna.izs
        public final dl1 invoke(Object obj) {
            if (obj != null) {
                return (dl1) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vkontakte.android.upload.events.AlbumUploadEvent");
        }
    }

    /* compiled from: CommunityProfileContentPhotoFeatureDelegate.kt */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements izs<GroupsGetContentForTabsResponseDto, it80<GroupsGetContentForTabsResponseDto>> {
        @Override // xsna.izs
        public final it80<GroupsGetContentForTabsResponseDto> invoke(GroupsGetContentForTabsResponseDto groupsGetContentForTabsResponseDto) {
            ((it80.a) this.receiver).getClass();
            return new it80<>(groupsGetContentForTabsResponseDto);
        }
    }

    /* compiled from: CommunityProfileContentPhotoFeatureDelegate.kt */
    public static final /* synthetic */ class g extends FunctionReferenceImpl implements izs<GroupsGetContentForTabsResponseDto, it80<GroupsGetContentForTabsResponseDto>> {
        @Override // xsna.izs
        public final it80<GroupsGetContentForTabsResponseDto> invoke(GroupsGetContentForTabsResponseDto groupsGetContentForTabsResponseDto) {
            ((it80.a) this.receiver).getClass();
            return new it80<>(groupsGetContentForTabsResponseDto);
        }
    }

    public fkh(UserId userId, io.reactivex.rxjava3.disposables.b bVar, bw6 bw6Var, p99 p99Var, po5 po5Var, ynh ynhVar) {
        super(userId, bVar, bw6Var, p99Var, po5Var, false);
        this.j = ynhVar;
    }

    public static void v(fkh fkhVar, iea0 iea0Var, CommunityProfileContentItem.State state, CommunityProfileContentItem.State state2, int i) {
        if ((i & 2) != 0) {
            state = null;
        }
        if ((i & 4) != 0) {
            state2 = null;
        }
        izs<com.vk.profile.community.impl.ui.profile.d, s3q0> izsVar = fkhVar.c;
        if (state == null) {
            state = iea0Var.s;
        }
        CommunityProfileContentItem.State state3 = state;
        if (state2 == null) {
            state2 = iea0Var.u;
        }
        izsVar.invoke(new d.f(iea0.i(iea0Var, null, null, null, null, false, false, null, state3, state2, 13823)));
    }

    @Override // xsna.nfh, xsna.jxg
    public final void b(ContentTab contentTab, ExtendedCommunityProfile extendedCommunityProfile) {
        GroupContentTabSetting s;
        this.i = true;
        if (this.k && (contentTab instanceof ContentTab.Photo) && (s = s(extendedCommunityProfile)) != null) {
            iea0 r = r(s, true);
            this.c.invoke(new d.f(r));
            k(r, extendedCommunityProfile);
        }
    }

    @Override // xsna.nfh, xsna.jxg
    public final void c(CommunityProfileState communityProfileState) {
        ExtendedCommunityProfile extendedCommunityProfile = communityProfileState.b;
        GroupContentTabSetting s = s(extendedCommunityProfile);
        if (s != null) {
            iea0 r = r(s, true);
            this.c.invoke(new d.f(r));
            if (this.i && (communityProfileState.e instanceof ContentTab.Photo)) {
                k(r, extendedCommunityProfile);
            } else {
                this.k = true;
            }
        }
    }

    @Override // xsna.jxg
    public final void d(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        k((iea0) communityProfileContentItem, extendedCommunityProfile);
    }

    @Override // xsna.nfh, xsna.jxg
    public final void e(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        if (extendedCommunityProfile != null) {
            this.d.invoke(new d.j.n.l(extendedCommunityProfile));
        }
    }

    @Override // xsna.jxg
    public final void f(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        iea0 iea0Var = (iea0) communityProfileContentItem;
        if (iea0Var.n) {
            v(this, iea0Var, null, CommunityProfileContentItem.State.LOADING, 2);
            t(iea0Var, false);
        }
    }

    @Override // xsna.jxg
    public final void g(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        if (extendedCommunityProfile != null) {
            this.d.invoke(new d.j.AbstractC1595d.g(extendedCommunityProfile));
        }
    }

    @Override // xsna.nfh, xsna.jxg
    public final void h(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        if (extendedCommunityProfile != null) {
            this.d.invoke(new d.j.n.k(extendedCommunityProfile));
        }
    }

    @Override // xsna.jxg
    public final void i(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        iea0 iea0Var = (iea0) communityProfileContentItem;
        if (iea0Var.n) {
            v(this, iea0Var, null, CommunityProfileContentItem.State.LOADING, 2);
            t(iea0Var, false);
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.nfh
    public final io.reactivex.rxjava3.core.q<s3q0> m() {
        ysg0<Object> ysg0Var = ysg0.b;
        io.reactivex.rxjava3.subjects.f<Object> fVar = ysg0Var.a;
        hg1.t0 t0Var = new hg1.t0(b.b);
        fVar.getClass();
        io.reactivex.rxjava3.internal.operators.observable.i0 i0Var = new io.reactivex.rxjava3.internal.operators.observable.i0(new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, t0Var).U(new hg1.s0(c.b)), new com.vk.movika.sdk.base.ui.p0(new ekh(this, 0), 13));
        io.reactivex.rxjava3.subjects.f<m7a0> fVar2 = ((qga0) this.j.x.getValue()).a().a;
        tp1 tp1Var = new tp1(new t9e(this, 6), 8);
        fVar2.getClass();
        io.reactivex.rxjava3.internal.operators.observable.d2 v0 = new io.reactivex.rxjava3.internal.operators.observable.i0(fVar2, tp1Var).v0(500L, TimeUnit.MILLISECONDS);
        io.reactivex.rxjava3.subjects.f<Object> fVar3 = ysg0Var.a;
        hg1.t0 t0Var2 = new hg1.t0(d.b);
        fVar3.getClass();
        return io.reactivex.rxjava3.core.q.V(i0Var, v0, new io.reactivex.rxjava3.internal.operators.observable.i0(new io.reactivex.rxjava3.internal.operators.observable.i0(fVar3, t0Var2).U(new hg1.s0(e.b)), new np1(new t6(this, 25), 12))).U(new io.reactivex.rxjava3.subjects.b(10));
    }

    public final iea0 r(GroupContentTabSetting groupContentTabSetting, boolean z) {
        GroupContentTabType groupContentTabType = groupContentTabSetting.b;
        List<GroupContentTabType> list = groupContentTabSetting.c;
        int i = a.$EnumSwitchMapping$0[groupContentTabType.ordinal()];
        return new iea0(i != 1 ? i != 2 ? CommunityProfileContentItem.ContentType.ITEMS : CommunityProfileContentItem.ContentType.ALBUMS : (list == null || !list.contains(GroupContentTabType.PHOTOS_ALBUMS)) ? CommunityProfileContentItem.ContentType.ITEMS : CommunityProfileContentItem.ContentType.MIXED, nfh.p(this, groupContentTabSetting, R.string.community_content_photos_empty, Integer.valueOf(R.string.community_content_add_photo), null, 12), new CommunityProfileContentItem.c(R.string.community_content_photos_error), z ? CommunityProfileContentItem.State.RELOAD : CommunityProfileContentItem.State.INITIAL, nfh.n(this, groupContentTabSetting, R.string.community_content_add_photo, 0, false, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE), CommunityProfileContentItem.State.INITIAL, false, 12288);
    }

    public final GroupContentTabSetting s(ExtendedCommunityProfile extendedCommunityProfile) {
        List<GroupContentTabSetting> list;
        Object obj = null;
        if (extendedCommunityProfile == null || (list = extendedCommunityProfile.U2) == null) {
            return null;
        }
        for (Object obj2 : list) {
            GroupContentTabType groupContentTabType = ((GroupContentTabSetting) obj2).b;
            if (groupContentTabType == GroupContentTabType.PHOTOS || groupContentTabType == GroupContentTabType.PHOTOS_ALBUMS) {
                obj = obj2;
                break;
            }
        }
        return (GroupContentTabSetting) obj;
    }

    public final void t(final iea0 iea0Var, final boolean z) {
        io.reactivex.rxjava3.core.b0 b2;
        CommunityProfileContentItem.ContentType contentType = iea0Var.l;
        boolean z2 = (contentType.i() && z) || contentType.h();
        boolean h = contentType.h();
        UserId userId = this.a;
        if (z2) {
            b2 = rsg0.W(yfb.x(xqu.i(new zqu(), fkq0.e(userId), Collections.singletonList(GroupsContentTabsDto.PHOTOS), null, iea0Var.m, GroupsGetContentForTabsContentDto.PHOTOS_ALBUMS, Integer.valueOf(contentType.h() ? 30 : 6), 60)), 7).l(new rx0(new f(1, it80.b, it80.a.class, "of", "of(Ljava/lang/Object;)Lcom/vk/core/util/Optional;", 0), 15));
        } else {
            b2 = tr.b(it80.b);
        }
        l(io.reactivex.rxjava3.core.x.B(!h ? rsg0.W(yfb.x(xqu.i(new zqu(), fkq0.e(userId), Collections.singletonList(GroupsContentTabsDto.PHOTOS), null, iea0Var.p, GroupsGetContentForTabsContentDto.PHOTOS, 60, 60)), 7).l(new ft0(new g(1, it80.b, it80.a.class, "of", "of(Ljava/lang/Object;)Lcom/vk/core/util/Optional;", 0), 20)) : tr.b(it80.b), b2, new ux0(new bkh(0), 19)), new ckh(this, iea0Var, z, 0), new izs() { // from class: xsna.dkh
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                fkh fkhVar = fkh.this;
                iea0 iea0Var2 = iea0Var;
                if (z) {
                    fkh.v(fkhVar, iea0Var2, CommunityProfileContentItem.State.ERROR, null, 4);
                } else {
                    fkh.v(fkhVar, iea0Var2, null, CommunityProfileContentItem.State.ERROR, 2);
                }
                return s3q0.a;
            }
        });
    }

    @Override // xsna.nfh, xsna.jxg
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void k(iea0 iea0Var, ExtendedCommunityProfile extendedCommunityProfile) {
        this.k = false;
        v(this, iea0Var, CommunityProfileContentItem.State.LOADING, null, 4);
        super.k(iea0Var, extendedCommunityProfile);
        t(iea0Var, true);
    }
}
