package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.narratives.Narrative;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.profile.user.impl.ui.f;
import com.vk.story.api.di.StoriesComponent;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import com.vungle.ads.internal.protos.Sdk;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.it80;

/* compiled from: UserProfileContentNarrativeFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class nnq0 extends wmq0<uu50, s3q0> {
    public final rnq0 m;
    public final gu50 n;
    public final StoriesComponent o;
    public final String p;

    /* compiled from: UserProfileContentNarrativeFeatureDelegate.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<VKList<Narrative>, it80<VKList<Narrative>>> {
        @Override // xsna.izs
        public final it80<VKList<Narrative>> invoke(VKList<Narrative> vKList) {
            ((it80.a) this.receiver).getClass();
            return new it80<>(vKList);
        }
    }

    public nnq0(dvq0 dvq0Var, r0e0 r0e0Var, boolean z, rnq0 rnq0Var, gu50 gu50Var, StoriesComponent storiesComponent) {
        super(dvq0Var, r0e0Var, z);
        this.m = rnq0Var;
        this.n = gu50Var;
        this.o = storiesComponent;
        this.p = "narratives";
    }

    public static s3q0 C(nnq0 nnq0Var, uu50 uu50Var, ExtendedUserProfile extendedUserProfile, List list) {
        Object obj;
        nnq0 nnq0Var2;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((ExtendedUserProfile.m) obj).a.equals(nnq0Var.p)) {
                break;
            }
        }
        ExtendedUserProfile.m mVar = (ExtendedUserProfile.m) obj;
        if (mVar != null) {
            List<String> list2 = mVar.f;
            boolean contains = list2 != null ? list2.contains("need_stories_to_create_narratives") : false;
            if (contains == uu50Var.s) {
                nnq0Var2 = nnq0Var;
            } else {
                nnq0Var2 = nnq0Var;
                uu50Var = uu50.i(uu50Var, null, false, null, wmq0.y(nnq0Var2, mVar, contains ? R.string.profile_content_narrative_add_stories_description : R.string.community_content_narratives_empty, Integer.valueOf(contains ? R.string.profile_content_narrative_add_stories : R.string.community_content_create_narrative), false, null, 28), null, null, contains, 1527);
            }
            super.c(uu50Var, extendedUserProfile);
        }
        return s3q0.a;
    }

    public static s3q0 D(nnq0 nnq0Var, uu50 uu50Var, ExtendedUserProfile extendedUserProfile) {
        super.c(uu50Var, extendedUserProfile);
        return s3q0.a;
    }

    @Override // xsna.wmq0
    public final void A(uu50 uu50Var, CommunityProfileContentItem.State state, CommunityProfileContentItem.State state2) {
        uu50 uu50Var2 = uu50Var;
        if (state == null) {
            state = uu50Var2.o;
        }
        CommunityProfileContentItem.State state3 = state;
        if (state2 == null) {
            state2 = uu50Var2.q;
        }
        z(uu50.i(uu50Var2, null, false, null, null, state3, state2, false, 1887));
    }

    public final void E(uu50 uu50Var, boolean z) {
        p(io.reactivex.rxjava3.core.x.j(this.m.p(this.c.a(), uu50Var.l)).l(new ao90(new a(1, it80.b, it80.a.class, "of", "of(Ljava/lang/Object;)Lcom/vk/core/util/Optional;", 0), 5)), new wkh(this, uu50Var, z, 2), new uw9(this, uu50Var, z));
    }

    @Override // xsna.wmq0, xsna.rgq0
    public final void b(CommunityProfileContentItem communityProfileContentItem) {
        uu50 uu50Var = (uu50) communityProfileContentItem;
        if (uu50Var.k) {
            wmq0.B(this, uu50Var, null, CommunityProfileContentItem.State.LOADING, 2);
            E(uu50Var, false);
        }
    }

    @Override // xsna.wmq0, xsna.rgq0
    public final void c(CommunityProfileContentItem communityProfileContentItem, ExtendedUserProfile extendedUserProfile) {
        uu50 uu50Var = (uu50) communityProfileContentItem;
        io.reactivex.rxjava3.core.q<List<ExtendedUserProfile.m>> b = this.m.b(this.c.a(), true);
        a8v a8vVar = new a8v(new o6i0(6, this, uu50Var), 24);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        io.reactivex.rxjava3.disposables.c subscribe = b.E(a8vVar, lVar, kVar, kVar).G(new an80(1, this, uu50Var)).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new fv70(new ogd(this, uu50Var, extendedUserProfile, 9), 21), new u0o0(new ki4(this, uu50Var, extendedUserProfile, 10), 2));
        io.reactivex.rxjava3.disposables.b bVar = this.e;
        if (bVar == null) {
            bVar = null;
        }
        bVar.b(subscribe);
    }

    @Override // xsna.wmq0, xsna.rgq0
    public final void e(CommunityProfileContentItem communityProfileContentItem) {
        z(uu50.i((uu50) communityProfileContentItem, null, false, null, null, null, null, false, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE));
    }

    @Override // xsna.wmq0, xsna.rgq0
    public final void f(CommunityProfileContentItem communityProfileContentItem, ExtendedUserProfile extendedUserProfile) {
        uu50 uu50Var = (uu50) communityProfileContentItem;
        if (extendedUserProfile != null) {
            if (uu50Var.s) {
                fpq0 fpq0Var = this.g;
                (fpq0Var != null ? fpq0Var : null).B(new f.e.j(extendedUserProfile));
            } else {
                fpq0 fpq0Var2 = this.g;
                (fpq0Var2 != null ? fpq0Var2 : null).B(f.e.j0.a);
            }
        }
    }

    @Override // xsna.wmq0, xsna.rgq0
    public final void n(CommunityProfileContentItem communityProfileContentItem, ExtendedUserProfile extendedUserProfile) {
        if (extendedUserProfile != null) {
            fpq0 fpq0Var = this.g;
            if (fpq0Var == null) {
                fpq0Var = null;
            }
            fpq0Var.B(f.e.w.a);
        }
    }

    @Override // xsna.wmq0
    public final CommunityProfileContentItem q(CommunityProfileContentItem communityProfileContentItem) {
        return uu50.i((uu50) communityProfileContentItem, null, false, null, null, CommunityProfileContentItem.State.RELOAD, CommunityProfileContentItem.State.INITIAL, false, 1880);
    }

    @Override // xsna.wmq0
    public final uu50 s(ExtendedUserProfile.m mVar, boolean z, boolean z2) {
        String str = mVar.a;
        String str2 = this.p;
        if (str.equals(str2)) {
            List<String> list = mVar.f;
            boolean contains = list != null ? list.contains("need_stories_to_create_narratives") : false;
            return new uu50(wmq0.y(this, mVar, contains ? R.string.profile_content_narrative_add_stories_description : R.string.community_content_narratives_empty, Integer.valueOf(contains ? R.string.profile_content_narrative_add_stories : R.string.community_content_create_narrative), false, null, 28), new CommunityProfileContentItem.c(R.string.community_content_narratives_error), z ? CommunityProfileContentItem.State.RELOAD : CommunityProfileContentItem.State.INITIAL, wmq0.u(this, mVar, 0, 0, false, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), CommunityProfileContentItem.State.INITIAL, mVar.b, contains, 1024);
        }
        throw new IllegalArgumentException(("Provide " + mVar + " expected name was " + str2).toString());
    }

    @Override // xsna.wmq0
    public final io.reactivex.rxjava3.core.q<s3q0> t() {
        io.reactivex.rxjava3.subjects.f<Pair<UserId, d5v>> fVar = this.n.a().a;
        o8c0 o8c0Var = new o8c0(new m2l0(this, 10), 7);
        fVar.getClass();
        io.reactivex.rxjava3.internal.operators.observable.i0 i0Var = new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, o8c0Var);
        io.reactivex.rxjava3.core.q<asl0> f6 = this.o.f6();
        e4t e4tVar = new e4t(new r6i0(this, 10), 16);
        f6.getClass();
        return io.reactivex.rxjava3.core.q.X(i0Var, new io.reactivex.rxjava3.internal.operators.observable.i0(f6, e4tVar)).a0(io.reactivex.rxjava3.android.schedulers.a.b()).U(new igj0(5));
    }

    @Override // xsna.wmq0
    public final String v() {
        return this.p;
    }

    @Override // xsna.wmq0
    public final /* bridge */ /* synthetic */ void w(CommunityProfileContentItem communityProfileContentItem) {
        E((uu50) communityProfileContentItem, true);
    }
}
