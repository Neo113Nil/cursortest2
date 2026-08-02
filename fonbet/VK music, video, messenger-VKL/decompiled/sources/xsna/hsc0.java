package xsna;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Matrix;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.catalog2.common.dto.ui.profile.UIBlockProfile;
import com.vk.clips.tool.view.nps.internal.moreless.MoreLessFeedbackView;
import com.vk.common.links.LaunchContext;
import com.vk.core.view.components.rating.RatingBar$Size;
import com.vk.core.view.components.rating.VkRatingBarSkeleton;
import com.vk.dto.common.id.UserId;
import com.vk.dto.fave.MarketFavable;
import com.vk.dto.group.Group;
import com.vk.ecomm.cart.api.router.models.CartCounterState;
import com.vk.ecomm.products_selection.api.model.SelectionProductId;
import com.vk.ecomm.products_selection.impl.ProductsSelectionBottomSheet;
import com.vk.im.reactions.api.BigReactionAnimationsView;
import com.vk.im.reactions.impl.assets.ReactionAssetDrawable;
import com.vk.im.reactions.impl.assets.a;
import com.vk.lists.ListDataSet;
import com.vk.log.L;
import com.vk.newsfeed.impl.requests.WallWithCounters;
import com.vk.photos.root.selectalbum.domain.h;
import com.vk.posting.presentation.video.search.c;
import com.vk.profile.design.view.profileheader.UserProfileBaseInfoState;
import com.vk.rlottie.RLottieDrawable;
import com.vk.stories.design.view.stats.tabs.stickers.mvi.a;
import com.vk.subscription.api.SubscribeStatus;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.js.bridge.events.AddToCommunity$Error;
import com.vk.superapp.js.bridge.events.EventNames;
import com.vk.video.profile.presentation.a;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.i;
import com.vk.video.ui.discovery.minimizable.doc2doc.onboarding.D2DOnboardingView;
import com.vk.video.ui.discovery.minimizable.n;
import com.vk.video.ui.discovery.minimizable.related_videos.VideoDiscoveryRelatedVideosSourceArgs;
import com.vk.video.ui.discovery.minimizable.s;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;
import ru.ok.android.externcalls.sdk.sessionroom.exceptions.SessionRoomInactiveException;
import ru.ok.android.externcalls.sdk.sessionroom.exceptions.SessionRoomNotAdminException;
import xsna.gpu;
import xsna.ijx;
import xsna.j2u0;
import xsna.jtd0;
import xsna.kmh0;
import xsna.qn60;
import xsna.r1r0;
import xsna.rwi0;
import xsna.smm0;
import xsna.tj50;
import xsna.tra0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class hsc0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hsc0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v48, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str;
        BigReactionAnimationsView bigReactionAnimationsView;
        boolean z;
        int i = this.b;
        int i2 = 2;
        int i3 = 1;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                isc0 isc0Var = (isc0) obj2;
                WallWithCounters wallWithCounters = (WallWithCounters) obj;
                ftc0 ftc0Var = isc0Var.f;
                return new io.reactivex.rxjava3.internal.operators.single.b(new m7j(ftc0Var.a, new qn60.b[]{new xc3(wallWithCounters, null, ftc0Var.b, isc0Var.g, null, false, null)})).l(new n8c0(new dn20(wallWithCounters, 18), i2));
            case 1:
                ProductsSelectionBottomSheet productsSelectionBottomSheet = (ProductsSelectionBottomSheet) obj2;
                jtd0 jtd0Var = (jtd0) obj;
                int i4 = ProductsSelectionBottomSheet.u1;
                if (jtd0Var instanceof jtd0.a) {
                    productsSelectionBottomSheet.dismiss();
                } else if (jtd0Var instanceof jtd0.c) {
                    jtd0.c cVar = (jtd0.c) jtd0Var;
                    fy9.a((fy9) productsSelectionBottomSheet.r1.getValue(), productsSelectionBottomSheet.requireContext(), null, new CartCounterState(cVar.a), cVar.b, 2);
                } else if (jtd0Var instanceof jtd0.d) {
                    jtd0.d dVar = (jtd0.d) jtd0Var;
                    ((sz00) productsSelectionBottomSheet.q1.getValue()).d(productsSelectionBottomSheet.requireContext(), new qz00(dVar.a, dVar.b, dVar.c, null, null, null, null, null, null, dVar.g, dVar.f, dVar.d, dVar.e, 987128));
                } else if (jtd0Var instanceof jtd0.e) {
                    maz.c((maz) productsSelectionBottomSheet.p1.getValue(), productsSelectionBottomSheet.requireContext(), ((jtd0.e) jtd0Var).a, LaunchContext.A, null, null, 24);
                } else {
                    if (!(jtd0Var instanceof jtd0.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    kei0 kei0Var = ((jtd0.b) jtd0Var).a;
                    SelectionProductId selectionProductId = kei0Var.a;
                    MarketFavable marketFavable = new MarketFavable(selectionProductId.b, selectionProductId.c, null, false, kei0Var.h);
                    isq.b(productsSelectionBottomSheet.o1, productsSelectionBottomSheet.requireContext(), marketFavable, null, new hp7(7, productsSelectionBottomSheet, marketFavable), new h630(productsSelectionBottomSheet, 22), false, null, null, 452);
                }
                return s3q0.a;
            case 2:
                aqe0 aqe0Var = (aqe0) obj2;
                int i5 = aqe0.m1;
                ((j2u0) aqe0Var.j1.getValue()).getClass();
                int i6 = j2u0.a.$EnumSwitchMapping$1[((MoreLessFeedbackView.FeedbackResult) obj).ordinal()];
                if (i6 == 1) {
                    str = "1";
                } else {
                    if (i6 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "0";
                }
                xn50.a.c(aqe0Var, new ijx.c(str));
                xn50.a.c(aqe0Var, ijx.a.b);
                return s3q0.a;
            case 3:
                ((VkRatingBarSkeleton) obj).setSize((RatingBar$Size) ((wh50) obj2).getValue());
                return s3q0.a;
            case 4:
                ReactionAssetDrawable reactionAssetDrawable = (ReactionAssetDrawable) obj2;
                a.C1134a c1134a = (a.C1134a) obj;
                reactionAssetDrawable.a(c1134a);
                if (c1134a.a != null) {
                    g0f0 g0f0Var = reactionAssetDrawable.b;
                    mh40 mh40Var = new mh40(reactionAssetDrawable, 10);
                    g0f0Var.getClass();
                    d0f0 d0f0Var = new d0f0(g0f0Var, mh40Var);
                    g0f0Var.h = d0f0Var;
                    RLottieDrawable rLottieDrawable = g0f0Var.d;
                    if (rLottieDrawable != null) {
                        rLottieDrawable.k.q = 1;
                    }
                    if (rLottieDrawable != null) {
                        rLottieDrawable.k.t = d0f0Var;
                    }
                    WeakReference<BigReactionAnimationsView> weakReference = g0f0Var.f;
                    if (weakReference != null && (bigReactionAnimationsView = weakReference.get()) != null) {
                        bigReactionAnimationsView.b.add(new e0f0(g0f0Var));
                        RLottieDrawable rLottieDrawable2 = g0f0Var.d;
                        if (rLottieDrawable2 != null) {
                            rLottieDrawable2.b(bigReactionAnimationsView);
                        }
                        bigReactionAnimationsView.invalidate();
                    }
                    reactionAssetDrawable.f = ReactionAssetDrawable.Stage.BIG_ANIMATION;
                    reactionAssetDrawable.invalidateSelf();
                } else {
                    reactionAssetDrawable.b();
                }
                return s3q0.a;
            case 5:
                kym0 kym0Var = (kym0) obj;
                UserId a = fkq0.a(kym0Var.b);
                int i7 = kym0Var.a.value;
                iru iruVar = ((jdf0) obj2).G;
                int w = ((ListDataSet) iruVar.c).w(new pu40(new xc50(a, 14), i3));
                Object c = iruVar.c.c(w);
                gpu.a aVar = c instanceof gpu.a ? (gpu.a) c : null;
                if (aVar != null) {
                    Group group = aVar.a.b;
                    if (group.C != i7) {
                        group.C = i7;
                        iruVar.notifyItemChanged(w);
                    }
                }
                return s3q0.a;
            case 6:
                Throwable th = (Throwable) obj;
                L.G(ms9.b("error: ", th));
                ((wug0) obj2).invoke(th);
                return s3q0.a;
            case 7:
                ((dmh0) obj2).T(new kmh0.c((n6n0) obj));
                return s3q0.a;
            case 8:
                boh0 boh0Var = (boh0) obj2;
                List list = (List) yfb.x(r1r0.a.b((s1r0) boh0Var.l.getValue(), (List) obj, Collections.singletonList(UsersFieldsDto.PHOTO_BASE), null, null, 58)).u(0L);
                if (list == null) {
                    return EmptyList.b;
                }
                List<UsersUserFullDto> list2 = list;
                j2r0 j2r0Var = boh0Var.m;
                ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                for (UsersUserFullDto usersUserFullDto : list2) {
                    j2r0Var.getClass();
                    arrayList.add(j2r0.a(usersUserFullDto));
                }
                return arrayList;
            case 9:
                rzh0 rzh0Var = (rzh0) obj2;
                wia0 wia0Var = (wia0) obj;
                rzh0Var.f.d(wia0Var.b);
                rzh0Var.T(new c.a.C1548c(wia0Var));
                return s3q0.a;
            case 10:
                tj50.a aVar2 = (tj50.a) obj;
                com.vk.photos.root.selectalbum.domain.d dVar2 = new com.vk.photos.root.selectalbum.domain.d(1, (com.vk.photos.root.selectalbum.domain.e) obj2, com.vk.photos.root.selectalbum.domain.e.class, "buildAlbumsListState", "buildAlbumsListState(Lcom/vk/photos/root/selectalbum/domain/SelectAlbumState;)Lcom/vk/photos/root/selectalbum/domain/SelectAlbumViewState$ListState;", 0);
                ao8 ao8Var = ao8.d;
                return new h.a(aVar2.a(dVar2, ao8Var), aVar2.a(l6i0.b, ao8Var), aVar2.a(new gvs(28), ao8Var));
            case 11:
                mwi0 mwi0Var = (mwi0) obj2;
                Throwable th2 = (Throwable) obj;
                if (th2 instanceof SessionRoomInactiveException) {
                    mwi0Var.V(rwi0.a.d.a);
                } else if (th2 instanceof SessionRoomNotAdminException) {
                    mwi0Var.V(rwi0.c.a.a);
                } else {
                    mwi0Var.V(rwi0.a.e.a);
                }
                return s3q0.a;
            case 12:
                tra0.a.x((tra0.a) obj, (tra0) obj2, 0, 0);
                return s3q0.a;
            case 13:
                ((xak0) obj2).p(((Long) obj).longValue());
                return s3q0.a;
            case 14:
                ((com.vk.stories.design.view.stats.tabs.stickers.mvi.c) obj2).c.invoke(a.c.f.b);
                return s3q0.a;
            case 15:
                ((gxs0) obj2).b((Matrix) obj);
                return s3q0.a;
            case 16:
                smm0.a aVar3 = (smm0.a) obj2;
                aVar3.b.isEmpty();
                otz otzVar = (otz) j5g.a0(aVar3.b);
                if (otzVar != null) {
                    aVar3.a.onNext(otzVar);
                }
                return s3q0.a;
            case 17:
                yzm0 yzm0Var = (yzm0) obj2;
                Boolean bool = (Boolean) obj;
                yzm0Var.a.g(4, !bool.booleanValue());
                if (bool.booleanValue()) {
                    xwk.e().T().m().b(new kym0(SubscribeStatus.MEMBER_STATUS_NOT_MEMBER, yzm0Var.a.b, null, null, 12));
                }
                return s3q0.a;
            case 18:
                ian0 ian0Var = (ian0) obj2;
                Throwable th3 = (Throwable) obj;
                VKApiExecutionException vKApiExecutionException = th3 instanceof VKApiExecutionException ? (VKApiExecutionException) th3 : null;
                if (vKApiExecutionException != null) {
                    rte0.z((Context) ian0Var.a.invoke(), vKApiExecutionException);
                }
                return s3q0.a;
            case 19:
                int intValue = ((Integer) obj).intValue();
                RecyclerView.Adapter adapter = ((RecyclerView) obj2).getAdapter();
                com.vk.libvideo.bottomsheet.about.delegate.c cVar2 = adapter instanceof com.vk.libvideo.bottomsheet.about.delegate.c ? (com.vk.libvideo.bottomsheet.about.delegate.c) adapter : null;
                if (cVar2 != null) {
                    return cVar2.h.f.get(intValue);
                }
                return null;
            case 20:
                ggj ggjVar = (ggj) obj;
                ggjVar.s1();
                oio.x1(ggjVar, (y7z) obj2, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 6, 62);
                return s3q0.a;
            case 21:
                return Boolean.valueOf(epx.f(((UIBlockProfile) obj).A.c, ((UIBlockProfile) obj2).A.c));
            case 22:
                UserProfileBaseInfoState.d dVar3 = (UserProfileBaseInfoState.d) obj2;
                tgi0 tgi0Var = (tgi0) obj;
                String str2 = dVar3.b;
                String str3 = str2.length() > 0 ? str2 : null;
                if (str3 == null) {
                    str3 = dVar3.a;
                }
                qgi0.h(tgi0Var, str3);
                return s3q0.a;
            case 23:
                WallWithCounters wallWithCounters2 = (WallWithCounters) obj2;
                qn60.c cVar3 = (qn60.c) obj;
                return new hxq0(cVar3.a, cVar3.b, wallWithCounters2, wallWithCounters2.i());
            case 24:
                kfr0 kfr0Var = (kfr0) obj2;
                Throwable th4 = (Throwable) obj;
                SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                if (superappUiRouterBridge == null) {
                    superappUiRouterBridge = null;
                }
                superappUiRouterBridge.j(((ggu0) kfr0Var.f.c).b.getString(R.string.vk_common_network_error));
                mfu0 mfu0Var = kfr0Var.c;
                EventNames eventNames = EventNames.AddToCommunity;
                int i8 = uyp.a;
                mfu0Var.x(eventNames, new AddToCommunity$Error(null, uyp.a(eventNames, mfu0Var, th4), 1, null));
                return s3q0.a;
            case 25:
                ((com.vk.video.ui.discovery.minimizable.g) obj2).T(new n.d0((VideoDiscoveryRelatedVideosSourceArgs) obj));
                return s3q0.a;
            case 26:
                VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = (VideoMinimizableDiscoveryFragment) obj2;
                s.b bVar = (s.b) obj;
                final hrk hrkVar = videoMinimizableDiscoveryFragment.D0;
                if (hrkVar != null) {
                    boolean z2 = bVar.a;
                    awt0.v(hrkVar.a, z2);
                    ValueAnimator valueAnimator = hrkVar.f;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    hrkVar.f = null;
                    hrkVar.d.removeCallbacks(hrkVar.g);
                    if (z2) {
                        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                        final Ref$IntRef ref$IntRef = new Ref$IntRef();
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1332.0f);
                        ofFloat.setDuration(1332L);
                        ofFloat.setInterpolator(null);
                        ofFloat.setRepeatCount(0);
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.erk
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                float z3;
                                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                hrk hrkVar2 = hrk.this;
                                D2DOnboardingView d2DOnboardingView = hrkVar2.a;
                                float f = hrkVar2.e;
                                d2DOnboardingView.setAnimationTime(floatValue);
                                if (floatValue < 666.0f) {
                                    z3 = q6x.z(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, srk.a.a(floatValue / 666));
                                } else {
                                    float f2 = 666L;
                                    z3 = q6x.z(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, srk.b.a((floatValue - f2) / f2));
                                }
                                int i9 = (int) z3;
                                Ref$IntRef ref$IntRef2 = ref$IntRef;
                                int i10 = i9 - ref$IntRef2.element;
                                if (i10 != 0) {
                                    hrkVar2.b.scrollBy(i10, 0);
                                    ref$IntRef2.element = i9;
                                }
                            }
                        });
                        ofFloat.addListener(new frk(ref$BooleanRef));
                        ofFloat.addListener(new grk(hrkVar, ref$IntRef, ref$BooleanRef));
                        ofFloat.start();
                        hrkVar.f = ofFloat;
                    }
                }
                trk trkVar = videoMinimizableDiscoveryFragment.E0;
                if (trkVar != null && trkVar.g != (z = bVar.c)) {
                    trkVar.g = z;
                    trkVar.f.clear();
                }
                drk drkVar = videoMinimizableDiscoveryFragment.F0;
                if (drkVar != null) {
                    drkVar.d = bVar.b;
                }
                return s3q0.a;
            case 27:
                cys0 cys0Var = (cys0) obj2;
                q9t0 q9t0Var = (q9t0) obj;
                cys0Var.getClass();
                if (q9t0Var != null && fxc0.B().J().W1()) {
                    cys0Var.b0.invoke(a.g0.b);
                }
                return s3q0.a;
            case 28:
                return new io.reactivex.rxjava3.internal.operators.single.v(new f7(((czs0) ((n0t0) obj2).m).a.I0, i2));
            default:
                ((com.vk.video.ui.discovery.minimizable.dialog.related_videos.d) obj2).j.b(i.e.a);
                return s3q0.a;
        }
    }
}
