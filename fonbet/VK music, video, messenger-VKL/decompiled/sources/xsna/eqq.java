package xsna;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetRecomResponseDto;
import com.vk.attachpicker.stickers.StickersRecyclerView;
import com.vk.audience.api.di.AudienceResearchComponent;
import com.vk.core.tips.Tooltip;
import com.vk.dto.common.data.VKList;
import com.vk.dto.music.Playlist;
import com.vk.dto.newsfeed.FaveTag;
import com.vk.dto.user.UserProfile;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.im.ui.fragments.ImSelectContactsFragment;
import com.vk.inappreview.InAppReviewConditionKey;
import com.vk.superapp.api.dto.identity.WebIdentityEmail;
import com.vk.superapp.api.dto.menu.Animation;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonActionCantUseInBackground;
import com.vk.superapp.base.js.bridge.VkUiView;
import com.vk.toggle.features.StoriesFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.friends.FriendsFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import xsna.e3m;
import xsna.fn20;
import xsna.inv;
import xsna.lbv;
import xsna.o360;
import xsna.ur20;
import xsna.yb00;
import xsna.ypt;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class eqq implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ eqq(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02cb  */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Pair pair;
        VkUiView vkUiView;
        Object failure;
        int i = this.b;
        int i2 = 3;
        int i3 = 1;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((fqq) obj2).f();
                return s3q0.a;
            case 1:
                FaveTag faveTag = (FaveTag) obj2;
                if (((Boolean) obj).booleanValue()) {
                    p870.f().e(1204, faveTag);
                } else {
                    p870.f().e(1200, s3q0.a);
                }
                return s3q0.a;
            case 2:
                return i0f.a((ShortVideoGetRecomResponseDto) obj, ((i4r) obj2).h);
            case 3:
                qhv0 qhv0Var = (qhv0) obj2;
                ojt ojtVar = (ojt) obj;
                if (qhv0Var != null) {
                    ojtVar.l = rhv0.b(qhv0Var);
                }
                return s3q0.a;
            case 4:
                FriendsFragment friendsFragment = (FriendsFragment) obj2;
                ArrayList<? extends Parcelable> arrayList = (ArrayList) obj;
                int i4 = FriendsFragment.q0;
                StoriesFeatures storiesFeatures = StoriesFeatures.FRIENDS_SELECTION_TO_FILE;
                storiesFeatures.getClass();
                if (com.vk.toggle.b.A.a(storiesFeatures)) {
                    io.reactivex.rxjava3.internal.operators.single.v vVar = new io.reactivex.rxjava3.internal.operators.single.v(new hfl(arrayList, i3));
                    asu0 asu0Var = asu0.a;
                    ver0.c(friendsFragment.requireContext(), vVar.q(asu0Var.c()).m(asu0Var.d()).subscribe(new m1r(new k22(6, arrayList, friendsFragment), 2)));
                } else {
                    Intent intent = new Intent();
                    intent.putParcelableArrayListExtra("result", arrayList);
                    ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                    Iterator<T> it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(Long.valueOf(((UserProfile) it.next()).c.b));
                    }
                    intent.putExtra("result_ids", j5g.P0(arrayList2));
                    friendsFragment.Mf(-1, intent);
                }
                return s3q0.a;
            case 5:
                return (WebIdentityEmail) obj2;
            case 6:
                ypt yptVar = (ypt) obj2;
                ypt.a aVar = (ypt.a) obj;
                l8c l8cVar = new l8c(aVar, new qpj(yptVar, 15), yptVar, 5);
                xwv0 xwv0Var = (xwv0) yptVar.a.get();
                if (xwv0Var != null && !xwv0Var.q()) {
                    try {
                        failure = xwv0Var.t();
                    } catch (Throwable th) {
                        failure = new Result.Failure(th);
                    }
                    if (failure instanceof Result.Failure) {
                        failure = null;
                    }
                    WebApiApplication webApiApplication = (WebApiApplication) failure;
                    if (webApiApplication != null) {
                        VkUiView view = xwv0Var.getView();
                        if (view == null) {
                            view = null;
                        }
                        pair = new Pair(webApiApplication, view);
                        vkUiView = pair == null ? (VkUiView) pair.j() : null;
                        if (vkUiView == null) {
                            l8cVar.invoke(pair.i(), vkUiView);
                        } else {
                            ypt.b(yptVar.e, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_ACTION_CANT_USE_IN_BACKGROUND, null, null, null, null, null, null, null, null, null, new Responses$ReasonActionCantUseInBackground(0, null, 3, null), null, null, null, null, null, null, 130046, null), aVar.b, 1, null));
                        }
                        return s3q0.a;
                    }
                }
                pair = null;
                if (pair == null) {
                }
                if (vkUiView == null) {
                }
                return s3q0.a;
            case 7:
                s7v s7vVar = (s7v) obj2;
                s7vVar.b.j0.setActionInProgress(true);
                s7vVar.b.j0.pause();
                return s3q0.a;
            case 8:
                ((cbv) obj2).p.onNext(lbv.d.a);
                return s3q0.a;
            case 9:
                gzs<s3q0> gzsVar = ((inv.a) obj2).e;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 10:
                ImSelectContactsFragment imSelectContactsFragment = (ImSelectContactsFragment) obj2;
                View view2 = imSelectContactsFragment.X;
                if (view2 == null) {
                    view2 = null;
                }
                view2.animate().translationY((imSelectContactsFragment.X != null ? r3 : null).getMeasuredHeight()).alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(150L).setInterpolator(new ilq()).withEndAction(new xw1(imSelectContactsFragment, 7)).start();
                return s3q0.a;
            case 11:
                return new com.vk.im.ui.components.viewcontrollers.msg_list.adapter.msgparts.carousel.a(LayoutInflater.from((Context) obj), ((q0w0) obj2).d.o());
            case 12:
                mrw mrwVar = (mrw) obj2;
                r100.a(mrwVar.g, "Fake condition action is triggered");
                com.vk.inappreview.impl.fake.a aVar2 = new com.vk.inappreview.impl.fake.a();
                Bundle bundle = new Bundle();
                bundle.putString("condition_key", ((InAppReviewConditionKey) obj).h());
                aVar2.setArguments(bundle);
                aVar2.Td(mrwVar.a.getSupportFragmentManager(), "FakeIar");
                return s3q0.a;
            case 13:
                return new bt00((ViewGroup) obj, ((wr00) obj2).i);
            case 14:
                ((com.vk.ecomm.reviews.impl.allreviews.presentation.d) obj2).d.getClass();
                ListBuilder e = e43.e();
                e.add(rs00.b);
                e.add(ts00.b);
                e.add(new ss00(R.drawable.market_all_reviews_first_item_view_holder_background));
                e.add(new ss00(R.drawable.market_all_reviews_item_view_holder_background));
                e.add(new ss00(R.drawable.market_all_reviews_item_view_holder_background));
                e.add(new ss00(R.drawable.market_all_reviews_item_view_holder_background));
                e.add(new ss00(R.drawable.market_all_reviews_item_view_holder_background));
                e.add(new ss00(R.drawable.market_all_reviews_item_view_holder_background));
                return e.g();
            case 15:
                return new j4g0(((n310) obj2).k, (ViewGroup) obj, null, null, 44);
            case 16:
                Pair pair2 = (Pair) obj;
                return new Triple(((Animation) obj2).f(), pair2.i(), pair2.j());
            case 17:
                ((zak0) ((fn20.a) obj2).c).setValue((String) obj);
                return s3q0.a;
            case 18:
                ((nr20) obj2).T(ur20.a.b.b);
                return s3q0.a;
            case 19:
                ((yb00.b) obj2).invoke((Throwable) obj);
                return s3q0.a;
            case 20:
                return Boolean.valueOf(((ij30) obj2).f.get(((lj30) obj).c) != null);
            case 21:
                return Boolean.valueOf(((Playlist) obj).b == ((n8b0) obj2).a.b);
            case 22:
                yos yosVar = (yos) obj2;
                int i5 = yosVar.a.i();
                VKList<zxq0> vKList = yosVar.a;
                VKList vKList2 = new VKList(i5, vKList.k());
                vKList2.n(vKList.j());
                vKList2.addAll((List) obj);
                return vKList2;
            case 23:
                o360 o360Var = (o360) obj2;
                for (o360.c cVar : (List) obj) {
                    o360Var.k(cVar.a, new ma(22, cVar, o360Var));
                }
                return s3q0.a;
            case 24:
                Context context = (Context) obj;
                e3m.a aVar3 = e3m.a;
                return new Tooltip.f(context.getColor(R.color.vk_tip_background), Integer.valueOf(context.getColor(R.color.vk_white)), null, 48, new f540((u5k0) obj2, i2), -cn70.b(8), 32489321);
            case 25:
                return ((AudienceResearchComponent) ((bs60) obj2).g.getValue()).b().d((List) obj);
            case 26:
                ((wx0) obj2).invoke();
                return s3q0.a;
            case 27:
                yp80 yp80Var = (yp80) obj2;
                Throwable th2 = (Throwable) obj;
                if (yp80Var != null) {
                    yp80Var.onError(th2);
                }
                return s3q0.a;
            case 28:
                return ((x6a0) obj2).w0((StickersRecyclerView) obj);
            default:
                return ((BaseOkResponseDto) obj) == BaseOkResponseDto.OK ? (List) obj2 : EmptyList.b;
        }
    }
}
