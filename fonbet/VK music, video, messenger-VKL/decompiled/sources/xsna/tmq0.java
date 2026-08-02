package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.dto.articles.Article;
import com.vk.dto.common.data.VKList;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.profile.user.impl.ui.f;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.it80;

/* compiled from: UserProfileContentArticlesFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class tmq0 extends wmq0<fq3, s3q0> {
    public final rnq0 m;
    public final String n;

    /* compiled from: UserProfileContentArticlesFeatureDelegate.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<VKList<Article>, it80<VKList<Article>>> {
        @Override // xsna.izs
        public final it80<VKList<Article>> invoke(VKList<Article> vKList) {
            ((it80.a) this.receiver).getClass();
            return new it80<>(vKList);
        }
    }

    public tmq0(dvq0 dvq0Var, r0e0 r0e0Var, boolean z, rnq0 rnq0Var) {
        super(dvq0Var, r0e0Var, z);
        this.m = rnq0Var;
        this.n = "articles";
    }

    @Override // xsna.wmq0
    public final void A(fq3 fq3Var, CommunityProfileContentItem.State state, CommunityProfileContentItem.State state2) {
        fq3 fq3Var2 = fq3Var;
        if (state == null) {
            state = fq3Var2.o;
        }
        CommunityProfileContentItem.State state3 = state;
        if (state2 == null) {
            state2 = fq3Var2.p;
        }
        z(fq3.i(fq3Var2, null, false, null, state3, state2, 1855));
    }

    public final void C(fq3 fq3Var, boolean z) {
        p(io.reactivex.rxjava3.core.x.j(this.m.o(this.c.a(), fq3Var.l)).l(new cfz(new a(1, it80.b, it80.a.class, "of", "of(Ljava/lang/Object;)Lcom/vk/core/util/Optional;", 0), 15)), new mh1(this, fq3Var, z, 3), new q4i0(this, fq3Var, z));
    }

    @Override // xsna.wmq0, xsna.rgq0
    public final void b(CommunityProfileContentItem communityProfileContentItem) {
        fq3 fq3Var = (fq3) communityProfileContentItem;
        if (fq3Var.k) {
            wmq0.B(this, fq3Var, null, CommunityProfileContentItem.State.LOADING, 2);
            C(fq3Var, false);
        }
    }

    @Override // xsna.wmq0, xsna.rgq0
    public final void e(CommunityProfileContentItem communityProfileContentItem) {
        z(fq3.i((fq3) communityProfileContentItem, null, false, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE));
    }

    @Override // xsna.wmq0, xsna.rgq0
    public final void f(CommunityProfileContentItem communityProfileContentItem, ExtendedUserProfile extendedUserProfile) {
        if (extendedUserProfile != null) {
            fpq0 fpq0Var = this.g;
            if (fpq0Var == null) {
                fpq0Var = null;
            }
            fpq0Var.B(f.e.i0.a);
        }
    }

    @Override // xsna.wmq0, xsna.rgq0
    public final void n(CommunityProfileContentItem communityProfileContentItem, ExtendedUserProfile extendedUserProfile) {
        if (extendedUserProfile != null) {
            fpq0 fpq0Var = this.g;
            if (fpq0Var == null) {
                fpq0Var = null;
            }
            fpq0Var.B(f.e.u.a);
        }
    }

    @Override // xsna.wmq0
    public final CommunityProfileContentItem q(CommunityProfileContentItem communityProfileContentItem) {
        return fq3.i((fq3) communityProfileContentItem, null, false, null, CommunityProfileContentItem.State.RELOAD, CommunityProfileContentItem.State.INITIAL, 1844);
    }

    @Override // xsna.wmq0
    public final fq3 s(ExtendedUserProfile.m mVar, boolean z, boolean z2) {
        String str = mVar.a;
        String str2 = this.n;
        if (str.equals(str2)) {
            return new fq3(wmq0.y(this, mVar, R.string.community_content_articles_empty, null, false, null, 30), new CommunityProfileContentItem.c(R.string.community_content_articles_error), z ? CommunityProfileContentItem.State.RELOAD : CommunityProfileContentItem.State.INITIAL, CommunityProfileContentItem.State.INITIAL, wmq0.u(this, mVar, 0, 0, false, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), mVar.b);
        }
        throw new IllegalArgumentException(("Provide " + mVar + " expected name was " + str2).toString());
    }

    @Override // xsna.wmq0
    public final io.reactivex.rxjava3.core.q<s3q0> t() {
        return this.m.a();
    }

    @Override // xsna.wmq0
    public final String v() {
        return this.n;
    }

    @Override // xsna.wmq0
    public final /* bridge */ /* synthetic */ void w(CommunityProfileContentItem communityProfileContentItem) {
        C((fq3) communityProfileContentItem, true);
    }
}
