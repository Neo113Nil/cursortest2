package xsna;

import android.view.View;
import android.widget.ImageView;
import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.feature.music.ui.holder.MusicOfflineCatalogRootVh;
import com.vk.clips.design.view.timeline.TimelineBottomActionsView;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.donut.price.model.template.DonutPriceTemplate;
import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import com.vk.dto.common.ImageSize;
import com.vk.ecomm.design.compose.imagegallery.model.ImageGalleryItem;
import com.vk.libvideo.design.view.fullscreen.VideoTopBarView;
import com.vk.newsfeed.common.presentation.newsfeed.ListLoadingState;
import com.vk.newsfeed.impl.presentation.suggested.presentation.fragment.SuggestedPostsFragment;
import com.vk.poll.fragments.PollVotersFragment;
import com.vk.utils.vectordrawable.EnhancedAnimatedVectorDrawable;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import ru.ok.android.externcalls.sdk.api.retry.RetryKt;
import ru.ok.android.webrtc.RTCLog;
import xsna.igg0;
import xsna.jgg0;
import xsna.lg60;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class y6c implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y6c(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v35, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v36, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v39 */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        String str;
        String str2;
        lgg0 lgg0Var;
        tgg0 tgg0Var;
        dce0 dce0Var;
        String str3;
        us2 us2Var;
        odo0 odo0Var;
        odo0 odo0Var2;
        odo0 odo0Var3;
        ?? r5;
        List<y2u0> list;
        ImageGalleryItem.ImageGalleryImageItem imageGalleryImageItem;
        Float f;
        s3q0 retryApiWithBackoff$lambda$0;
        ImageView imageView;
        us2 a;
        int i = this.b;
        int i2 = 29;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        ?? r10 = 1;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                z6c.c((q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(7));
                return s3q0.a;
            case 1:
                ((Integer) obj2).getClass();
                ((yyc) obj3).A(ne7.I(9), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 2:
                View view = (View) obj3;
                float floatValue = ((Float) obj).floatValue();
                float floatValue2 = ((Float) obj2).floatValue();
                view.setTranslationX(floatValue);
                view.setTranslationY(floatValue2);
                return s3q0.a;
            case 3:
                kkm kkmVar = (kkm) obj2;
                ?? r2 = ((com.vk.im.ui.components.viewcontrollers.dialog_header.info.b) obj3).M;
                if (r2.isInitialized()) {
                    com.vk.utils.vectordrawable.a.b((EnhancedAnimatedVectorDrawable) r2.getValue(), "path_1", kkmVar.f(R.attr.vk_ui_icon_accent_themed));
                    com.vk.utils.vectordrawable.a.b((EnhancedAnimatedVectorDrawable) r2.getValue(), "path_2", kkmVar.f(R.attr.vk_ui_accent_green));
                }
                return s3q0.a;
            case 4:
                ((Integer) obj2).getClass();
                v8t.e((ut) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 5:
                g8u g8uVar = (g8u) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1357684630, intValue, -1, "com.vk.ecomm.market.good.marketitemreviews.GoodReviewsComposeHolder.setupFeedbackBlock.<anonymous> (GoodReviewsComposeHolder.kt:302)");
                    }
                    rrv0.d(null, null, null, null, kai.c(-773912431, new com.vk.movika.tools.controls.seekbar.h(g8uVar, 6), aVar), aVar, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 6:
                j210 j210Var = (j210) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1401692665, intValue2, -1, "com.vk.ecomm.reviews.impl.marketitem.reviews.presentation.adapter.review.MarketItemReviewItemComposeViewHolder.bind.<anonymous>.<anonymous> (MarketItemReviewItemComposeViewHolder.kt:48)");
                    }
                    q630 f2 = txj0.f(q630.a.a, 1.0f);
                    h210 h210Var = j210Var.n;
                    boolean z = h210Var != null && h210Var.l;
                    boolean y = aVar2.y(j210Var);
                    Object x = aVar2.x();
                    if (y || x == c0012a) {
                        x = new gbj(j210Var, 24);
                        aVar2.R(x);
                    }
                    q630 c = ojc.c(f2, z, null, null, (gzs) x, 14);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-338010080, 0, -1, "com.vk.ecomm.reviews.impl.marketitem.reviews.presentation.adapter.review.MarketItemReviewItemComposeViewHolder.createReviewBlockHeader (MarketItemReviewItemComposeViewHolder.kt:86)");
                    }
                    h210 h210Var2 = j210Var.n;
                    ?? r52 = (h210Var2 == null || h210Var2.m) ? false : true;
                    String str4 = "";
                    if (h210Var2 == null || (str = h210Var2.e) == null) {
                        str = "";
                    }
                    float floatValue3 = (h210Var2 == null || (f = h210Var2.f.b) == null) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : f.floatValue();
                    h210 h210Var3 = j210Var.n;
                    if (h210Var3 == null || (str2 = h210Var3.f.a) == null) {
                        str2 = "";
                    }
                    qgg0 qgg0Var = new qgg0(str, str2, floatValue3, h210Var3 != null ? h210Var3.f.f : false);
                    boolean y2 = aVar2.y(j210Var);
                    Object x2 = aVar2.x();
                    if (y2 || x2 == c0012a) {
                        x2 = new pp00(j210Var, r10 == true ? 1 : 0);
                        aVar2.R(x2);
                    }
                    gzs gzsVar = (gzs) x2;
                    if (r52 == false) {
                        gzsVar = null;
                    }
                    boolean y3 = aVar2.y(j210Var);
                    Object x3 = aVar2.x();
                    if (y3 || x3 == c0012a) {
                        x3 = new z0h(j210Var, 28);
                        aVar2.R(x3);
                    }
                    gzs gzsVar2 = (gzs) x3;
                    if (r52 == false) {
                        gzsVar2 = null;
                    }
                    rgg0 B = d370.B(qgg0Var, gzsVar, gzsVar2, aVar2);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    aVar2.K(172294832);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(172294832, 0, -1, "com.vk.ecomm.reviews.impl.marketitem.reviews.presentation.adapter.review.MarketItemReviewItemComposeViewHolder.createReviewBlockAttach (MarketItemReviewItemComposeViewHolder.kt:102)");
                    }
                    h210 h210Var4 = j210Var.n;
                    List<y2u0> list2 = h210Var4 != null ? h210Var4.g.a : null;
                    if (list2 == null || list2.isEmpty()) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        aVar2.j();
                        lgg0Var = null;
                    } else {
                        h210 h210Var5 = j210Var.n;
                        if (h210Var5 == null || (list = h210Var5.g.a) == null) {
                            r5 = 0;
                        } else {
                            r5 = new ArrayList();
                            for (y2u0 y2u0Var : list) {
                                ImageSize imageSize = (ImageSize) ixj0.b(y2u0Var.b);
                                if (imageSize != null) {
                                    Integer num = y2u0Var.c;
                                    imageGalleryImageItem = new ImageGalleryItem.ImageGalleryImageItem(num != null ? num.intValue() : 0, null, imageSize.d.d, 2, null);
                                } else {
                                    imageGalleryImageItem = null;
                                }
                                if (imageGalleryImageItem != null) {
                                    r5.add(imageGalleryImageItem);
                                }
                            }
                        }
                        if (r5 == 0) {
                            r5 = EmptyList.b;
                        }
                        kgg0 kgg0Var = new kgg0(r5);
                        boolean y4 = aVar2.y(j210Var);
                        Object x4 = aVar2.x();
                        if (y4 || x4 == c0012a) {
                            x4 = new b5h(j210Var, 27);
                            aVar2.R(x4);
                        }
                        lgg0 a2 = igg0.a.a(kgg0Var, (izs) x4, aVar2);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        aVar2.j();
                        lgg0Var = a2;
                    }
                    aVar2.K(-1700582564);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1700582564, 0, -1, "com.vk.ecomm.reviews.impl.marketitem.reviews.presentation.adapter.review.MarketItemReviewItemComposeViewHolder.createReviewBlockTextBody (MarketItemReviewItemComposeViewHolder.kt:125)");
                    }
                    h210 h210Var6 = j210Var.n;
                    us2 us2Var2 = (h210Var6 == null || (odo0Var3 = h210Var6.g.c) == null) ? null : odo0Var3.b;
                    if (us2Var2 == null || us2Var2.c.length() == 0) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        aVar2.j();
                        tgg0Var = null;
                    } else {
                        h210 h210Var7 = j210Var.n;
                        if (h210Var7 == null || (odo0Var2 = h210Var7.g.c) == null || (us2Var = odo0Var2.b) == null) {
                            us2Var = new us2("");
                        }
                        h210 h210Var8 = j210Var.n;
                        boolean z2 = (h210Var8 == null || (odo0Var = h210Var8.g.c) == null) ? false : odo0Var.c;
                        boolean y5 = aVar2.y(j210Var);
                        Object x5 = aVar2.x();
                        if (y5 || x5 == c0012a) {
                            x5 = new jcg(j210Var, i2);
                            aVar2.R(x5);
                        }
                        tgg0 a3 = jgg0.a.a(new sgg0(us2Var, z2, (gzs) x5), aVar2);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        aVar2.j();
                        tgg0Var = a3;
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-148733084, 0, -1, "com.vk.ecomm.reviews.impl.marketitem.reviews.presentation.adapter.review.MarketItemReviewItemComposeViewHolder.createReviewBlockBottom (MarketItemReviewItemComposeViewHolder.kt:138)");
                    }
                    h210 h210Var9 = j210Var.n;
                    if (h210Var9 != null && (dce0Var = h210Var9.g.b) != null && (str3 = dce0Var.a) != null) {
                        str4 = str3;
                    }
                    mgg0 mgg0Var = new mgg0(str4, h210Var9 != null ? h210Var9.g.d : false);
                    boolean y6 = aVar2.y(j210Var);
                    Object x6 = aVar2.x();
                    if (y6 || x6 == c0012a) {
                        x6 = new w8q(j210Var, 20);
                        aVar2.R(x6);
                    }
                    gzs gzsVar3 = (gzs) x6;
                    Object x7 = aVar2.x();
                    if (x7 == c0012a) {
                        x7 = new com.vk.movika.sdk.base.model.props.a(16);
                        aVar2.R(x7);
                    }
                    ngg0 B2 = f9t.B(mgg0Var, gzsVar3, (gzs) x7, aVar2);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    pgg0.a(B, B2, c, lgg0Var, tgg0Var, aVar2, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 7:
                f910 f910Var = (f910) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1421054393, intValue3, -1, "com.vk.ecomm.products_multipicker.impl.presentation.view.MarketMultiSelectPickerView.configureErrorStateView.<anonymous>.<anonymous> (MarketMultiSelectPickerView.kt:152)");
                    }
                    int intValue4 = ((wak0) f910Var.t).getIntValue();
                    boolean y7 = aVar3.y(f910Var);
                    Object x8 = aVar3.x();
                    if (y7 || x8 == c0012a) {
                        x8 = new u3k(f910Var, i2);
                        aVar3.R(x8);
                    }
                    kci.a(intValue4, 0, aVar3, (gzs) x8);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 8:
                MusicOfflineCatalogRootVh musicOfflineCatalogRootVh = (MusicOfflineCatalogRootVh) obj3;
                String str5 = (String) obj;
                MusicOfflineCatalogRootVh.a aVar4 = musicOfflineCatalogRootVh.B;
                if (aVar4 != null) {
                    aVar4.a(str5);
                }
                musicOfflineCatalogRootVh.z.d();
                return s3q0.a;
            case 9:
                wg60 wg60Var = (wg60) obj3;
                rui ruiVar = (rui) obj;
                nn50 nn50Var = (nn50) obj2;
                final f64 a4 = ruiVar.a(new sg60(wg60Var.k, wg60Var.l, wg60Var.a, wg60Var.g, wg60Var, nn50Var));
                tf60 tf60Var = wg60Var.j;
                es60 es60Var = wg60Var.m;
                final f64 a5 = ruiVar.a(new x5o0(es60Var, tf60Var, nn50Var));
                final f64 a6 = ruiVar.a(new w5o0(es60Var, tf60Var, nn50Var));
                final f64 a7 = ruiVar.a(new z5o0(es60Var, tf60Var, nn50Var));
                final f64 a8 = ruiVar.a(new y5o0(es60Var, tf60Var, nn50Var));
                final f64 a9 = ruiVar.a(new b6o0(es60Var, tf60Var, nn50Var));
                final f64 a10 = ruiVar.a(new v5o0(es60Var, tf60Var, nn50Var));
                final f64 a11 = ruiVar.a(new a6o0(es60Var, tf60Var, nn50Var));
                ruiVar.b = new wzs() { // from class: xsna.ag60
                    @Override // xsna.wzs
                    public final Object invoke(Object obj4, Object obj5) {
                        qk50 qk50Var = (qk50) obj4;
                        lg60 lg60Var = (lg60) obj5;
                        if (lg60Var instanceof lg60.a) {
                            return qk50Var.a(f64.this, lg60Var);
                        }
                        if (lg60Var instanceof eg60) {
                            return qk50Var.a(a5, lg60Var);
                        }
                        if (lg60Var instanceof gg60) {
                            return qk50Var.a(a7, lg60Var);
                        }
                        if (lg60Var instanceof dg60) {
                            return qk50Var.a(a6, lg60Var);
                        }
                        if (lg60Var instanceof fg60) {
                            return qk50Var.a(a8, lg60Var);
                        }
                        if (lg60Var instanceof ig60) {
                            return qk50Var.a(a9, lg60Var);
                        }
                        if (lg60Var instanceof cg60) {
                            return qk50Var.a(a10, lg60Var);
                        }
                        if (lg60Var instanceof hg60) {
                            return qk50Var.a(a11, lg60Var);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                };
                return s3q0.a;
            case 10:
                ((Integer) obj2).getClass();
                ((lv90) obj3).co(ne7.I(9), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 11:
                ((Integer) obj2).getClass();
                int i3 = PollVotersFragment.a0;
                ((PollVotersFragment) obj3).jo(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 12:
                retryApiWithBackoff$lambda$0 = RetryKt.retryApiWithBackoff$lambda$0((RTCLog) obj3, (Throwable) obj, ((Integer) obj2).intValue());
                return retryApiWithBackoff$lambda$0;
            case 13:
                ybk0 ybk0Var = (ybk0) obj3;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (((gmq) obj2).equals(ybk0Var.C) && (imageView = ybk0Var.M) != null) {
                    imageView.setActivated(booleanValue);
                }
                return s3q0.a;
            case 14:
                ((vb7) obj3).c = (String) obj;
                return s3q0.a;
            case 15:
                ListLoadingState listLoadingState = (ListLoadingState) obj2;
                SwipeDrawableRefreshLayout swipeDrawableRefreshLayout = ((SuggestedPostsFragment) obj3).c0;
                if (swipeDrawableRefreshLayout != null) {
                    swipeDrawableRefreshLayout.setRefreshing(listLoadingState == ListLoadingState.REFRESHING);
                }
                return s3q0.a;
            case 16:
                e5p0 e5p0Var = (e5p0) obj;
                View view2 = (View) obj2;
                wzs<e5p0, View, s3q0> showOnboardingTooltip$timeline_release = ((TimelineBottomActionsView) obj3).getShowOnboardingTooltip$timeline_release();
                if (showOnboardingTooltip$timeline_release != null) {
                    showOnboardingTooltip$timeline_release.invoke(e5p0Var, view2);
                }
                return s3q0.a;
            case 17:
                ((Integer) obj2).getClass();
                ((mzo0) obj3).a(ne7.I(7), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            default:
                DonutVideoUiModel.DescriptionChip descriptionChip = (DonutVideoUiModel.DescriptionChip) obj3;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue5 = ((Integer) obj2).intValue();
                int i4 = VideoTopBarView.m;
                aVar5.K(1019125931);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1019125931, intValue5, -1, "com.vk.libvideo.design.view.fullscreen.VideoTopBarView.bind.<anonymous>.<anonymous> (VideoTopBarView.kt:135)");
                }
                DonutPriceTemplate donutPriceTemplate = descriptionChip.c;
                if (donutPriceTemplate == null) {
                    aVar5.K(-343135531);
                    aVar5.j();
                    a = null;
                } else {
                    aVar5.K(127478444);
                    a = z1o.a(donutPriceTemplate, m4s.B(aVar5), aVar5, 0);
                    aVar5.j();
                }
                if (a == null) {
                    aVar5.K(127484262);
                    a = ws2.b(descriptionChip.b, aVar5, 0);
                    aVar5.j();
                } else {
                    aVar5.K(127477535);
                    aVar5.j();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar5.j();
                return a;
        }
    }

    public /* synthetic */ y6c(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
