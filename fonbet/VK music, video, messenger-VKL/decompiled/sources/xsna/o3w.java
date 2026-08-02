package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.compose.ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.widget.NestedScrollView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.vk.api.generated.video.dto.VideoGetVideoQualitiesDownloadInfoResponseDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.auth.validation.VkChangePhoneRouterInfo;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.placeholder.VkPlaceholder;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.dto.market.MarketItemType;
import com.vk.ecomm.reviews.impl.marketitem.reviews.presentation.MarketItemReviewsFragment;
import com.vk.log.L;
import com.vk.newsfeed.api.data.NewsfeedSearchList;
import com.vk.newsfeed.impl.postmodal.reactions.ModalPostReactionsFragment;
import com.vk.search.params.impl.presentation.modal.location.mvi.model.LocationSearchState;
import com.vk.search.params.impl.presentation.modal.location.mvi.model.a;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.superapp.vkpay.checkout.core.ui.views.VkCardForm;
import com.vk.voip.ui.settings.LinkFragment;
import com.vkontakte.android.R;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.aex;
import xsna.b230;
import xsna.bex0;
import xsna.gm50;
import xsna.jw00;
import xsna.lc50;
import xsna.nn20;
import xsna.no90;
import xsna.t1z;
import xsna.utl0;
import xsna.uv40;
import xsna.wf20;
import xsna.y410;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class o3w implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o3w(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v40 */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ComposeView composeView;
        ComposeView composeView2;
        int i = 9;
        int i2 = 24;
        int i3 = 4;
        int i4 = 1;
        int i5 = 0;
        switch (this.b) {
            case 0:
                e1w e1wVar = (e1w) this.c;
                Throwable th = (Throwable) obj;
                if (th instanceof CancellationException) {
                    CancellationException cancellationException = (CancellationException) th;
                    mla mlaVar = e1wVar.a;
                    nr2.L(cancellationException, (mlaVar != null ? mlaVar : null).b());
                }
                return s3q0.a;
            case 1:
                k4x k4xVar = (k4x) ((npp0) obj);
                zpx0 zpx0Var = ((k4x) this.c).q;
                if (!epx.f(k4xVar.p, zpx0Var)) {
                    k4xVar.p = zpx0Var;
                    k4xVar.j2();
                }
                return TraversableNode$Companion$TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
            case 2:
                qex qexVar = (qex) this.c;
                dex.a((ImageView) qexVar.r.getValue(), ((aex.a.C2538a) qexVar.m).d.c0);
                return s3q0.a;
            case 3:
                x6y x6yVar = ((y2y) this.c).a;
                Throwable th2 = (Throwable) obj;
                if (th2 instanceof IllegalArgumentException) {
                    bex0.a.a(x6yVar, JsApiMethodType.CREATE_HASH, VkAppsErrors.Client.INVALID_PARAMS, null, null, null, 60);
                } else {
                    x6yVar.z(JsApiMethodType.CREATE_HASH, th2);
                }
                return s3q0.a;
            case 4:
                t1z.a aVar = (t1z.a) this.c;
                g2v.d().v().e(xhr0.b(aVar.b, g2v.d().v().d()));
                gau.e(aVar.b, 4, g2v.d().v().d());
                return s3q0.a;
            case 5:
                LinkFragment linkFragment = (LinkFragment) this.c;
                int i6 = LinkFragment.R;
                nr4.b().k(linkFragment.requireContext(), (String) obj);
                return s3q0.a;
            case 6:
                hzz hzzVar = (hzz) this.c;
                return new io.reactivex.rxjava3.internal.operators.observable.o0(kzz.c(5000L, hzzVar.a), new mm6(new cu4(hzzVar, 5), 23)).U(new xlz(gzz.b, 1)).d0(new a.b(LocationSearchState.LocationErrorType.FETCH_FAILED));
            case 7:
                m210 m210Var = (m210) this.c;
                h210 h210Var = m210Var.q;
                if (h210Var != null) {
                    m210Var.l.c(new f210(h210Var.d, h210Var.b, h210Var.c, h210Var.g.c.a.toString(), h210Var.h, h210Var.i, h210Var.j));
                }
                return s3q0.a;
            case 8:
                MarketItemReviewsFragment marketItemReviewsFragment = (MarketItemReviewsFragment) this.c;
                y410.a aVar2 = (y410.a) obj;
                int i7 = MarketItemReviewsFragment.w0;
                mzp0 mzp0Var = marketItemReviewsFragment.J;
                if (mzp0Var != null) {
                    mzp0Var.d(null);
                }
                marketItemReviewsFragment.On().a();
                SwipeRefreshLayout swipeRefreshLayout = marketItemReviewsFragment.g0;
                if (swipeRefreshLayout == null) {
                    swipeRefreshLayout = null;
                }
                bwt0.p0(swipeRefreshLayout, true);
                SwipeRefreshLayout swipeRefreshLayout2 = marketItemReviewsFragment.g0;
                if (swipeRefreshLayout2 == null) {
                    swipeRefreshLayout2 = null;
                }
                swipeRefreshLayout2.setEnabled(true);
                VkSpinner vkSpinner = marketItemReviewsFragment.b0;
                if (vkSpinner == null) {
                    vkSpinner = null;
                }
                bwt0.p0(vkSpinner, false);
                NestedScrollView nestedScrollView = marketItemReviewsFragment.h0;
                if (nestedScrollView == null) {
                    nestedScrollView = null;
                }
                bwt0.p0(nestedScrollView, false);
                VkPlaceholder vkPlaceholder = marketItemReviewsFragment.i0;
                if (vkPlaceholder == null) {
                    vkPlaceholder = null;
                }
                bwt0.p0(vkPlaceholder, false);
                View view = marketItemReviewsFragment.j0;
                if (view == null) {
                    view = null;
                }
                bwt0.p0(view, false);
                yzt0<MarketItemType> yzt0Var = aVar2.l;
                yzt0<Boolean> yzt0Var2 = aVar2.a;
                ?? r8 = yzt0Var.a() == MarketItemType.OZON || aVar2.m.a() != null;
                if (r8 == true) {
                    q48 a = aVar2.c.a();
                    if (a != null) {
                        ComposeView composeView3 = marketItemReviewsFragment.f0;
                        if (composeView3 == null) {
                            composeView3 = null;
                        }
                        composeView3.setVisibility(0);
                        LinearLayout linearLayout = marketItemReviewsFragment.d0;
                        if (linearLayout == null) {
                            linearLayout = null;
                        }
                        linearLayout.setVisibility(0);
                        VkButton vkButton = marketItemReviewsFragment.e0;
                        if (vkButton == null) {
                            vkButton = null;
                        }
                        vkButton.setVisibility(8);
                        ComposeView composeView4 = marketItemReviewsFragment.f0;
                        (composeView4 != null ? composeView4 : null).setContent(kai.b(-1777640514, new p70(2, a, marketItemReviewsFragment)));
                    } else {
                        ComposeView composeView5 = marketItemReviewsFragment.f0;
                        if (composeView5 == null) {
                            composeView5 = null;
                        }
                        composeView5.setVisibility(8);
                        LinearLayout linearLayout2 = marketItemReviewsFragment.d0;
                        (linearLayout2 != null ? linearLayout2 : null).setVisibility(8);
                    }
                } else {
                    if (r8 == true) {
                        throw new NoWhenBranchMatchedException();
                    }
                    LinearLayout linearLayout3 = marketItemReviewsFragment.d0;
                    if (linearLayout3 == null) {
                        linearLayout3 = null;
                    }
                    Boolean a2 = yzt0Var2.a();
                    bwt0.p0(linearLayout3, a2 != null ? a2.booleanValue() : false);
                    gm50.a.a(marketItemReviewsFragment, yzt0Var2, new cws(marketItemReviewsFragment, 19));
                    ComposeView composeView6 = marketItemReviewsFragment.f0;
                    (composeView6 != null ? composeView6 : null).setContent(kai.b(1945747857, new zd0(i3, aVar2, marketItemReviewsFragment)));
                }
                gm50.a.a(marketItemReviewsFragment, aVar2.j, new o010(marketItemReviewsFragment, i4));
                gm50.a.a(marketItemReviewsFragment, aVar2.e, new p010(marketItemReviewsFragment, i4));
                gm50.a.a(marketItemReviewsFragment, aVar2.d, new d410(marketItemReviewsFragment, i5));
                gm50.a.a(marketItemReviewsFragment, aVar2.b, new frg(marketItemReviewsFragment, 29));
                gm50.a.a(marketItemReviewsFragment, aVar2.g, new bgy(marketItemReviewsFragment, i3));
                gm50.a.a(marketItemReviewsFragment, aVar2.i, new lxz(marketItemReviewsFragment, 3));
                gm50.a.a(marketItemReviewsFragment, aVar2.h, new sop(marketItemReviewsFragment, 26));
                gm50.a.a(marketItemReviewsFragment, aVar2.k, new com.vk.repository.internal.repos.stickers.suggests.a(marketItemReviewsFragment, 9));
                return s3q0.a;
            case 9:
                f910 f910Var = (f910) this.c;
                i810 i810Var = (i810) f910Var.v.getValue();
                o810 o810Var = (o810) f910Var.B.getValue();
                la10 la10Var = new la10(((ViewGroup) obj).getContext());
                la10Var.setAdapter(i810Var);
                la10Var.setOnScrollListener(new ef90(o810Var));
                f910Var.r.add(la10Var);
                la10Var.setType(0);
                la10Var.setRepeatButtonAction(new s1m(f910Var, i2));
                return la10Var;
            case 10:
                cxo cxoVar = (cxo) this.c;
                Map map = (Map) obj;
                jw00 jw00Var = (jw00) map.get(jw00.a.c);
                if (jw00Var != null) {
                    cxoVar.w = jw00Var.a();
                    ymd0 ymd0Var = cxoVar.Y;
                    if (ymd0Var != null && (composeView2 = cxoVar.e0) != null && f4m.h(composeView2)) {
                        ymd0Var.a(composeView2, gnd0.a(cxoVar));
                    }
                }
                jw00 jw00Var2 = (jw00) map.get(jw00.c.c);
                if (jw00Var2 != null) {
                    cxoVar.t = jw00Var2.a();
                    ymd0 ymd0Var2 = cxoVar.Y;
                    if (ymd0Var2 != null && (composeView = cxoVar.e0) != null && f4m.h(composeView)) {
                        ymd0Var2.a(composeView, gnd0.a(cxoVar));
                    }
                }
                return s3q0.a;
            case 11:
                ((vf20) this.c).f.onNext(new wf20.a((Throwable) obj));
                return s3q0.a;
            case 12:
                ((zak0) ((nn20.a) this.c).d).setValue((String) obj);
                return s3q0.a;
            case 13:
                Ref$IntRef ref$IntRef = (Ref$IntRef) this.c;
                ViewGroup.LayoutParams layoutParams = ((View) obj).getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = ref$IntRef.element;
                }
                return s3q0.a;
            case 14:
                ModalPostReactionsFragment modalPostReactionsFragment = (ModalPostReactionsFragment) this.c;
                int i8 = ModalPostReactionsFragment.f0;
                gm50.a.a(modalPostReactionsFragment, ((b230.a) obj).a, new rop(modalPostReactionsFragment, 18));
                return s3q0.a;
            case 15:
                Throwable th3 = (Throwable) obj;
                enj.q(((th3 instanceof VKApiExecutionException) && ((VKApiExecutionException) th3).J()) ? R.string.access_error : R.string.error, 0, ((com.vk.im.ui.components.msg_list.a) this.c).k);
                L.i(th3);
                return s3q0.a;
            case 16:
                ((d98) ((e140) this.c).l.getValue()).d();
                return s3q0.a;
            case 17:
                s840 s840Var = (s840) this.c;
                s840Var.o.Ig(s840Var.n, null);
                return s3q0.a;
            case 18:
                return rv40.k((rv40) this.c, (uv40.b) obj);
            case 19:
                ((hd50) this.c).d.invoke(lc50.b.c.b);
                return s3q0.a;
            case 20:
                return Boolean.valueOf(epx.f(((utl0.c.a) obj).a(), ((ep50) this.c).N));
            case 21:
                ((l660) this.c).l.b((VkCardForm.b) obj);
                return s3q0.a;
            case 22:
                ((yp80) this.c).onError((Throwable) obj);
                return s3q0.a;
            case 23:
                py60 py60Var = (py60) this.c;
                NewsfeedSearchList newsfeedSearchList = (NewsfeedSearchList) obj;
                qy60 qy60Var = py60Var.h;
                return py60Var.t(newsfeedSearchList, new xc3(newsfeedSearchList, null, qy60Var.c, qy60Var.d, null, false, null));
            case 24:
                io.reactivex.rxjava3.subjects.a aVar3 = (io.reactivex.rxjava3.subjects.a) this.c;
                aVar3.onNext((VideoGetVideoQualitiesDownloadInfoResponseDto) obj);
                aVar3.onComplete();
                return s3q0.a;
            case 25:
                ((im90) this.c).a((vgg) obj, false);
                return s3q0.a;
            case 26:
                ((bo90) this.c).T(new no90.c.a((Throwable) obj));
                return s3q0.a;
            case 27:
                Object obj2 = ((v3a0) this.c).o;
                x3a0 x3a0Var = (x3a0) (obj2 != null ? obj2 : null);
                x3a0Var.y.a(new VkChangePhoneRouterInfo(x3a0Var.x.f));
                return s3q0.a;
            case 28:
                ((wh50) this.c).setValue(new q9x(((q9x) obj).a));
                return s3q0.a;
            default:
                y8c0 y8c0Var = (y8c0) this.c;
                gom0 gom0Var = (gom0) obj;
                gom0.a(gom0Var, new y8m(i2), new com.vk.movika.tools.controls.seekbar.v(y8c0Var, 12));
                gom0.a(gom0Var, new u620(13), new xk6(y8c0Var, i));
                gom0.a(gom0Var, new xht(21), new nq1(y8c0Var, 11));
                return s3q0.a;
        }
    }
}
