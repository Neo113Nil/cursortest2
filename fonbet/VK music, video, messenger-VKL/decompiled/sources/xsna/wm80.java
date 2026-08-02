package xsna;

import android.content.DialogInterface;
import androidx.appcompat.app.AppCompatActivity;
import com.airbnb.lottie.LottieAnimationView;
import com.unity3d.ads.core.domain.HandleGatewayUniversalResponse;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.di.ServicesRegistry;
import com.unity3d.services.core.di.UnityAdsModule;
import com.unity3d.services.core.misc.JsonStorage;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.StickersPromoModel;
import com.vk.ecomm.orders.impl.order.presentation.OrderFragment;
import com.vk.music.podcast.impl.ui.episode.PodcastEpisodeFragment;
import com.vk.newsfeed.common.views.poster.PosterEditText;
import com.vk.newsfeed.impl.presentation.suggested.presentation.fragment.SuggestedPostsFragment;
import com.vk.newsfeed.posting.impl.presentation.base.fragment.PostingFragment;
import com.vk.photos.root.photoflow.presentation.PhotoFlowFragment;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.repository.internal.repos.stickers.database.StickersDatabase;
import com.vk.superapp.api.dto.account.ProfileNavigationInfo;
import com.vk.superapp.ui.SuperAppFragment;
import java.util.Collections;
import java.util.HashMap;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.android.api.core.ApiInvocationException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class wm80 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wm80(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        JsonStorage memoryJsonStorage;
        HandleGatewayUniversalResponse initialize$lambda$220$lambda$128;
        LottieAnimationView lottieAnimationView;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                break;
            case 1:
                OrderFragment orderFragment = (OrderFragment) obj;
                qcy<Object>[] qcyVarArr = OrderFragment.Y;
                break;
            case 2:
                yr90 yr90Var = (yr90) ((as90) obj).h;
                if (yr90Var != null) {
                    yr90Var.D();
                    break;
                }
                break;
            case 3:
                int i2 = PhotoFlowFragment.m0;
                UserId userId = (UserId) ((PhotoFlowFragment) obj).requireArguments().getParcelable("uid");
                if (userId == null) {
                    break;
                }
                break;
            case 4:
                int i3 = PodcastEpisodeFragment.u0;
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                mhy.j((PosterEditText) obj);
                break;
            case 8:
                int i4 = PostingFragment.L0;
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj;
                DialogInterface dialogInterface = (DialogInterface) ref$ObjectRef.element;
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
                ref$ObjectRef.element = null;
                break;
            case 12:
                ((d0g0) obj).x();
                break;
            case 13:
                break;
            case 14:
                int i5 = mhg0.l1;
                break;
            case 15:
                arg0 arg0Var = (arg0) obj;
                String str = arg0Var.f;
                r100.a(str, "Condition action is triggered");
                r100.a(str, "Request review");
                AppCompatActivity appCompatActivity = arg0Var.a;
                if (!appCompatActivity.isDestroyed() && !appCompatActivity.isFinishing()) {
                    lrg0 lrg0Var = arg0Var.c;
                    if (lrg0Var == null) {
                        lrg0Var = new lrg0(appCompatActivity.getApplicationContext());
                        arg0Var.c = lrg0Var;
                    }
                    break;
                } else {
                    r100.a(str, "Can't request review because activity is finishing or destroyed");
                    break;
                }
                break;
            case 16:
                ((Ref$BooleanRef) obj).element = true;
                break;
            case 17:
                memoryJsonStorage = ((UnityAdsModule) obj).memoryJsonStorage();
                break;
            case 18:
                initialize$lambda$220$lambda$128 = ServiceProvider.initialize$lambda$220$lambda$128((ServicesRegistry) obj);
                break;
            case 19:
                break;
            case 20:
                StickersPromoModel stickersPromoModel = (StickersPromoModel) obj;
                HashMap<UserId, StickersDatabase> hashMap = StickersDatabase.m;
                StickersDatabase.a.b().C().a(Collections.singletonList(new lbl0(stickersPromoModel.b, stickersPromoModel.c, stickersPromoModel.d, stickersPromoModel.e, stickersPromoModel.f, stickersPromoModel.g, 1)));
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                f7m0 f7m0Var = (f7m0) obj;
                if (f4m.h(f7m0Var.r) && (lottieAnimationView = f7m0Var.s) != null) {
                    lottieAnimationView.m0();
                }
                break;
            case 25:
                qcy<Object>[] qcyVarArr2 = SuggestedPostsFragment.r0;
                break;
            case 26:
                com.vk.superapp.ui.a aVar = (com.vk.superapp.ui.a) obj;
                if (aVar.i) {
                    aVar.t2(com.vk.superapp.ui.a.S1().z(), com.vk.superapp.ui.a.S1().e(), true);
                    SuperAppFragment superAppFragment = aVar.b;
                    ProfileNavigationInfo.SecurityRecommendationIndicator a = aVar.d.a();
                    if (a == null) {
                        a = ProfileNavigationInfo.SecurityRecommendationIndicator.NO_WARNING;
                    }
                    superAppFragment.xo(a);
                }
                break;
            case 27:
                break;
            case 28:
                u9q0 u9q0Var = ((y9q0) obj).a;
                int i6 = u9q0Var.m;
                if (i6 != 0) {
                    u9q0Var.c.put(Integer.valueOf(i6), Boolean.TRUE);
                }
                u9q0Var.d.onNext(new v9q0(null, 0, 0, false, false, false, false, true, ApiInvocationException.ErrorCodes.IDS_BLOCKED));
                break;
            default:
                ((hpq0) obj).a(UserProfileAction.q.b);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ wm80(m9l0 m9l0Var, StickersPromoModel stickersPromoModel) {
        this.b = 20;
        this.c = stickersPromoModel;
    }
}
