package xsna;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.articles.authorpage.ArticleAuthorPageSortType;
import com.vk.articles.authorpage.ui.ArticleAuthorPageFragment;
import com.vk.articles.authorpage.ui.ArticleAuthorPageRecyclerPaginatedView;
import com.vk.dto.common.id.UserId;
import com.vk.lists.c;
import com.vk.log.L;
import com.vk.profile.provider.di.ProfileFragmentProviderComponent;
import com.vk.toggle.anonymous.SakFeatures;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ArticleAuthorPagePresenter.kt */
/* loaded from: classes15.dex */
public final class gn3 implements tm3, c.l<ro3> {
    public final ArticleAuthorPageFragment b;
    public UserId c;
    public String d;
    public pm3 e;
    public com.vk.lists.c g;
    public ArticleAuthorPageSortType f = ArticleAuthorPageSortType.DATE;
    public final io.reactivex.rxjava3.disposables.b h = new io.reactivex.rxjava3.disposables.b();
    public final cn3 i = new cn3(this, 0);

    /* compiled from: ArticleAuthorPagePresenter.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            Throwable th2 = th;
            gn3 gn3Var = (gn3) this.receiver;
            gn3Var.getClass();
            L.i(th2);
            ArticleAuthorPageFragment articleAuthorPageFragment = gn3Var.b;
            articleAuthorPageFragment.mo(false);
            if (th2 instanceof VKApiExecutionException) {
                VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) th2;
                if (vKApiExecutionException.J()) {
                    Toolbar toolbar = articleAuthorPageFragment.U;
                    if (toolbar != null) {
                        toolbar.setTitle("");
                    }
                    MenuItem menuItem = articleAuthorPageFragment.X;
                    if (menuItem != null) {
                        menuItem.setVisible(false);
                    }
                    ArticleAuthorPageRecyclerPaginatedView articleAuthorPageRecyclerPaginatedView = articleAuthorPageFragment.Y;
                    if (articleAuthorPageRecyclerPaginatedView != null) {
                        articleAuthorPageRecyclerPaginatedView.setSwipeRefreshEnabled(false);
                    }
                    ArticleAuthorPageRecyclerPaginatedView articleAuthorPageRecyclerPaginatedView2 = articleAuthorPageFragment.Y;
                    if (articleAuthorPageRecyclerPaginatedView2 != null) {
                        articleAuthorPageRecyclerPaginatedView2.fj(th2, null);
                    }
                } else if (vKApiExecutionException.s() == 13300 && SakFeatures.Type.NEW_GEOBLOCK_ERROR.h()) {
                    Bundle w = vKApiExecutionException.w();
                    long j = w != null ? w.getLong("owner_id") : 0L;
                    if (j != 0) {
                        UserId userId = new UserId(j);
                        ProfileFragmentProviderComponent profileFragmentProviderComponent = (ProfileFragmentProviderComponent) m7m.d(articleAuthorPageFragment).a(fpf0.a(ProfileFragmentProviderComponent.class));
                        ProfileFragmentProviderComponent.Companion companion = ProfileFragmentProviderComponent.Companion;
                        profileFragmentProviderComponent.ye(userId, null).l(articleAuthorPageFragment);
                        articleAuthorPageFragment.finish();
                        s3q0 s3q0Var = s3q0.a;
                    }
                }
            }
            return s3q0.a;
        }
    }

    public gn3(ArticleAuthorPageFragment articleAuthorPageFragment) {
        this.b = articleAuthorPageFragment;
    }

    @Override // xsna.gm6
    public final boolean a0() {
        return false;
    }

    @Override // xsna.gm6
    public final void d() {
        c.h hVar = new c.h(this);
        hVar.i = 30;
        hVar.j = 50;
        this.g = com.vk.lists.f.a(hVar, this.b.Y);
        ce60.b.getClass();
        p870.f().b(Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, this.i);
    }

    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<ro3> hj(com.vk.lists.c cVar, boolean z) {
        return ui(0, cVar);
    }

    @Override // xsna.gm6
    public final void onDestroyView() {
        this.h.e();
        com.vk.lists.c cVar = this.g;
        if (cVar != null) {
            cVar.v();
        }
        this.g = null;
        ce60.b.getClass();
        p870.f().g(this.i);
    }

    @Override // com.vk.lists.c.l
    public final io.reactivex.rxjava3.core.q<ro3> ui(int i, com.vk.lists.c cVar) {
        String str;
        cub0 cub0Var;
        String str2;
        String str3;
        if (this.c == null && ((str3 = this.d) == null || str3.length() <= 0)) {
            throw new IllegalArgumentException("ArticleAuthorPagePresenter should have valid author or domain to load data");
        }
        UserId userId = this.c;
        if (userId != null) {
            int i2 = fn3.$EnumSwitchMapping$0[this.f.ordinal()];
            if (i2 == 1) {
                str2 = "date";
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str2 = "views";
            }
            cub0Var = new cub0(i, cVar.k(), userId, (String) null, str2);
        } else {
            String str4 = this.d;
            int i3 = fn3.$EnumSwitchMapping$0[this.f.ordinal()];
            if (i3 == 1) {
                str = "date";
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "views";
            }
            cub0Var = new cub0(i, cVar.k(), (UserId) null, str4, str);
        }
        return rsg0.y0(cub0Var, null, null, 3);
    }

    @Override // com.vk.lists.c.k
    public final void wd(io.reactivex.rxjava3.core.q<ro3> qVar, boolean z, com.vk.lists.c cVar) {
        this.h.b(qVar.subscribe(new n20(new zm3(z, this, cVar, 0), 2), new bn3(new a(1, this, gn3.class, "processError", "processError(Ljava/lang/Throwable;)V", 0), 0)));
    }

    @Override // xsna.cc6
    public final void onDestroy() {
    }

    @Override // xsna.cc6
    public final void onPause() {
    }

    @Override // xsna.cc6
    public final void onResume() {
    }

    @Override // xsna.gm6
    public final void onStart() {
    }

    @Override // xsna.gm6
    public final void onStop() {
    }
}
