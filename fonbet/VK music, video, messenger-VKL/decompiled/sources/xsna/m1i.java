package xsna;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.play.core.review.ReviewInfo;
import com.vk.auth.main.b;
import com.vk.auth.verification.libverify.LibverifyPresenter;
import com.vk.core.apps.BuildInfo;
import com.vk.ecomm.catalog.api.di.ClassifiedsComponent;
import com.vk.ecomm.market.album.MarketEditAlbumFinishedFragment;
import com.vk.ecomm.market.good.GoodFragment;
import com.vk.fave.entities.FaveEntry;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.friends.recommendations.api.di.FriendsRecommendationsComponent;
import com.vk.inappreview.ReviewActionResult$Failed;
import com.vk.music.pref.MusicPrefsComponent;
import com.vk.newsfeed.common.PostActions;
import com.vk.newsfeed.impl.presentation.newsfeed_geo.presentation.fragment.GeoPostsFragment;
import com.vk.profile.community.subscription.api.di.CommunitySubscriptionComponent;
import com.vk.search.fragment.DiscoverSearchFragment;
import com.vk.search.params.api.di.SearchParamsComponent;
import com.vk.superapp.vkworkout.VkWorkoutBridgeDelegatesFactory;
import com.vk.toggle.b;
import com.vk.toggle.features.CoreFeatures;
import com.vk.voip.ui.menu.ui.MainMenuView;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.friends.FriendsFragment;
import java.io.File;
import java.util.List;
import xsna.e3m;
import xsna.nyu;
import xsna.pz00;
import xsna.z0o;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class m1i implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m1i(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        PostActions postActions;
        int i = this.b;
        int i2 = 1;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((CommunitySubscriptionComponent) m7m.d(((o1i) obj).b).mo408a(fpf0.a(CommunitySubscriptionComponent.class))).E5();
            case 1:
                return ((MusicPrefsComponent) ((k7m) m7m.f((c7j) obj)).a(fpf0.a(MusicPrefsComponent.class))).Q0();
            case 2:
                return new gp80(((View) obj).getContext());
            case 3:
                e3k e3kVar = (e3k) obj;
                sqt0 sqt0Var = e3kVar.a;
                View view = new View(sqt0Var.getContext());
                view.setId(R.id.cover_overlay_view);
                view.setVisibility(8);
                Context context = sqt0Var.getContext();
                e3m.a aVar = e3m.a;
                view.setBackgroundColor(context.getColor(R.color.vk_black_alpha60));
                e3kVar.b.getClass();
                Integer num = 1;
                sqt0Var.addView(view, num.intValue(), new ViewGroup.LayoutParams(-1, -1));
                return view;
            case 4:
                pul pulVar = (pul) obj;
                if (((clg0) ovi.a(pulVar, jlg0.a)) == null) {
                    dc2 dc2Var = pulVar.v;
                    if (dc2Var != null) {
                        pulVar.j2(dc2Var);
                    }
                    pulVar.v = null;
                } else if (pulVar.v == null) {
                    mul mulVar = new mul(pulVar);
                    maj majVar = new maj(pulVar, i2);
                    wax waxVar = pulVar.r;
                    boolean z = pulVar.s;
                    float f = pulVar.t;
                    dtp0<Float> dtp0Var = hlg0.a;
                    dc2 dc2Var2 = new dc2(waxVar, z, f, mulVar, majVar);
                    pulVar.i2(dc2Var2);
                    pulVar.v = dc2Var2;
                }
                return s3q0.a;
            case 5:
                efm efmVar = ((cfm) obj).e;
                if (efmVar != null) {
                    efmVar.o(true);
                }
                return s3q0.a;
            case 6:
                return new z6g(0, ((Number) ((h1n) obj).j.getValue()).intValue());
            case 7:
                int i3 = DiscoverSearchFragment.s0;
                return ((SearchParamsComponent) m7m.d((DiscoverSearchFragment) obj).a(fpf0.a(SearchParamsComponent.class))).Db();
            case 8:
                ((z0o.a) obj).q6();
                return s3q0.a;
            case 9:
                ((nfu) obj).getClass();
                throw null;
            case 10:
                com.vk.attachpicker.screen.h hVar = (com.vk.attachpicker.screen.h) obj;
                boolean z2 = !BuildInfo.t();
                Context context2 = e43.a;
                Context context3 = context2 != null ? context2 : null;
                qiw qiwVar = hVar.G;
                b.d i4 = com.vk.toggle.b.A.i(CoreFeatures.PHOTO_EDITOR_ML_ENHANCE);
                return new gt20(z2, context3, qiwVar, epx.f(i4 != null ? i4.c.toString() : null, "fake"), (h7v) hVar.s.getValue());
            case 11:
                return "File " + ((File) obj) + " already exists";
            case 12:
                lqr lqrVar = (lqr) obj;
                return Float.valueOf(lqrVar.b - lqrVar.a);
            case 13:
                ((wh50) obj).setValue(Boolean.valueOf(!((Boolean) r4.getValue()).booleanValue()));
                return s3q0.a;
            case 14:
                FriendsFragment friendsFragment = (FriendsFragment) obj;
                int i5 = FriendsFragment.q0;
                ((FriendsRecommendationsComponent) m7m.d(friendsFragment).a(fpf0.a(FriendsRecommendationsComponent.class))).a().c(friendsFragment.kn());
                return s3q0.a;
            case 15:
                mss mssVar = (mss) obj;
                return new sgg(mssVar.h, mssVar.g.a, mssVar.i);
            case 16:
                qcy<Object>[] qcyVarArr = GeoPostsFragment.q0;
                return ((GeoPostsFragment) obj).eo();
            case 17:
                qcy<Object>[] qcyVarArr2 = GoodFragment.U0;
                ((GoodFragment) obj).Fo();
                return s3q0.a;
            case 18:
                nyu.a aVar2 = ((nyu) obj).K;
                if (aVar2 != null) {
                    aVar2.a();
                }
                return s3q0.a;
            case 19:
                return "    completionMarker = " + ((g8i) obj);
            case 20:
                mrw mrwVar = (mrw) obj;
                String str = mrwVar.g;
                r100.a(str, "Condition action is triggered");
                r100.a(str, "Request review");
                AppCompatActivity appCompatActivity = mrwVar.a;
                if (appCompatActivity.isDestroyed() || appCompatActivity.isFinishing()) {
                    r100.a(str, "Can't request review because activity is finishing or destroyed");
                    return io.reactivex.rxjava3.core.x.i(new ReviewActionResult$Failed(ReviewActionResult$Failed.ErrorReason.INTERNAL_ERROR));
                }
                ReviewInfo reviewInfo = mrwVar.d;
                if (reviewInfo == null) {
                    r100.a(str, "Can't request review, review info = null");
                    return io.reactivex.rxjava3.core.x.i(new ReviewActionResult$Failed(ReviewActionResult$Failed.ErrorReason.INTERNAL_ERROR));
                }
                r100.a(str, "Check in-app review service availability");
                Intent intent = new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE");
                intent.setPackage("com.android.vending");
                List<ResolveInfo> queryIntentServices = appCompatActivity.getPackageManager().queryIntentServices(intent, 128);
                r100.a(str, "In-app review service info = " + queryIntentServices);
                if (!queryIntentServices.isEmpty()) {
                    return new io.reactivex.rxjava3.internal.operators.single.b(new krw(mrwVar, reviewInfo));
                }
                r100.a(str, "Can't request review because in-app review service is not available");
                return io.reactivex.rxjava3.core.x.i(new ReviewActionResult$Failed(ReviewActionResult$Failed.ErrorReason.INTERNAL_ERROR));
            case 21:
                return ((l4y) obj).o(VkWorkoutBridgeDelegatesFactory.DelegateType.ASK_WORKOUT_PERMISSION_GF);
            case 22:
                x7y x7yVar = (x7y) obj;
                return new ojj0(x7yVar.g, new a8y(x7yVar, x7y.class, "presenter", "getPresenter()Lcom/vk/superapp/base/js/bridge/VkUiPresenter;", 0), x7yVar.X0(), x7yVar.L0());
            case 23:
                return Integer.valueOf(((mc90) obj).o());
            case 24:
                String[] strArr = LibverifyPresenter.d0;
                com.vk.auth.main.b bVar = ((LibverifyPresenter) obj).d;
                if (bVar == null) {
                    bVar = null;
                }
                b.a.a(bVar, true, false, null, 6);
                return s3q0.a;
            case 25:
                return (MainMenuView) ((mjw0) obj).findViewById(R.id.voip_call_view_slide_up_menu);
            case 26:
                ((no00) obj).e = false;
                return s3q0.a;
            case 27:
                int i6 = MarketEditAlbumFinishedFragment.Q;
                return ((ClassifiedsComponent) m7m.d((MarketEditAlbumFinishedFragment) obj).a(fpf0.a(ClassifiedsComponent.class))).dc();
            case 28:
                pz00 pz00Var = (pz00) obj;
                u1c0 J0 = pz00Var.J0();
                Object obj2 = J0 != null ? J0.h : null;
                if (!(obj2 instanceof py00)) {
                    return s3q0.a;
                }
                FaveEntry q6 = pz00Var.q6();
                if (q6 == null) {
                    return s3q0.a;
                }
                NewsEntry t6 = pz00Var.t6();
                if (t6 == null) {
                    t6 = q6;
                }
                u1c0 J02 = pz00Var.J0();
                int i7 = J02 != null ? J02.k : 0;
                int i8 = pz00.a.$EnumSwitchMapping$0[((py00) obj2).j.ordinal()];
                if (i8 == 1) {
                    postActions = PostActions.ACTION_MARKET_CTA_ADD_TO_CART;
                } else if (i8 == 2) {
                    postActions = PostActions.ACTION_MARKET_CTA_OPEN_CART;
                } else if (i8 == 3) {
                    postActions = PostActions.ACTION_MARKET_CTA_LINK;
                } else if (i8 == 4) {
                    postActions = PostActions.ACTION_MARKET_CTA_CHAT_WITH_OWNER;
                } else {
                    if (i8 != 5) {
                        return s3q0.a;
                    }
                    postActions = PostActions.ACTION_MARKET_CTA_CALL_TO_OWNER;
                }
                int h = postActions.h();
                s980 s980Var = pz00Var.y;
                if (s980Var != null) {
                    s980Var.d9(q6, t6, h, i7);
                }
                return s3q0.a;
            default:
                ae10 ae10Var = (ae10) obj;
                ae10Var.b.d(ae10Var.e);
                return s3q0.a;
        }
    }
}
