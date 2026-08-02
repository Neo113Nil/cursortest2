package xsna;

import android.content.Context;
import android.os.Parcelable;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ContentBadgeAppearance;
import com.vk.core.compose.component.defaults.ContentBadgeMode;
import com.vk.core.compose.component.defaults.ContentBadgeSize;
import com.vk.core.compose.component.defaults.CounterAppearance;
import com.vk.core.compose.component.defaults.CounterMode;
import com.vk.core.compose.component.group.header.b;
import com.vk.core.compose.component.group.header.d;
import com.vk.core.compose.component.group.header.f;
import com.vk.core.voip.VoipCallSource;
import com.vk.dto.common.Good;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.design.compose.productattaches.ProductVideoAttach;
import com.vk.geo.impl.model.BoundingBox;
import com.vk.geo.impl.model.Coordinate;
import com.vk.geo.impl.model.ZoomLevel;
import com.vk.geo.impl.presentation.b;
import com.vk.libvideo.bottomsheet.about.delegate.f0;
import com.vk.libvideo.design.compose.base.preview.PreviewViewState;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.video.profile.presentation.views.VideoNewProfileHeaderViewV2;
import com.vk.video.profile.presentation.views.a;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import xsna.b4;
import xsna.cri;
import xsna.dg70;
import xsna.dt1;
import xsna.f8t0;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class yn7 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yn7(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object, xsna.f6s] */
    /* JADX WARN: Type inference failed for: r1v9, types: [androidx.compose.runtime.a] */
    /* JADX WARN: Type inference failed for: r2v27, types: [xsna.q630] */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        q630.a aVar;
        String str;
        int i = this.b;
        int i2 = 4;
        int i3 = 13;
        Object obj3 = a.C0011a.a;
        int i4 = 3;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                cvk.i((mtk0) obj5, (izs) obj4, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 1:
                VoipCallSource voipCallSource = (VoipCallSource) obj5;
                Set set = (Set) obj4;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                UserId userId = (UserId) obj2;
                if (userId != null) {
                    com.vk.common.links.c.f0(voipCallSource, mhw0.a(set), userId, booleanValue, 16);
                } else {
                    com.vk.common.links.c.f0(voipCallSource, mhw0.a(set), null, booleanValue, 20);
                }
                return s3q0.a;
            case 2:
                ?? r12 = (f6s) obj5;
                q6s q6sVar = (q6s) obj4;
                ?? r1 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (r1.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1840829168, intValue, -1, "com.vk.newsfeed.common.recycler.holders.FooterComposeHolder.Content.<anonymous> (FooterComposeHolder.kt:176)");
                    }
                    boolean z = r12.K;
                    q630.a aVar2 = q630.a.a;
                    if (z) {
                        r1.K(1999372205);
                        boolean y = r1.y(r12) | r1.J(q6sVar);
                        Object x = r1.x();
                        if (y || x == obj3) {
                            x = new hn0(i3, (Object) r12, q6sVar);
                            r1.R(x);
                        }
                        ?? b = com.vk.core.compose.component.semantics.b.b(aVar2, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3));
                        r1.j();
                        aVar = b;
                    } else {
                        r1.K(1999630218);
                        r1.j();
                        aVar = aVar2;
                    }
                    if (q6sVar.R && q6sVar.W && !q6sVar.Y) {
                        r1.K(1999768168);
                        a.m mVar = androidx.compose.foundation.layout.a.c;
                        dt1.a.getClass();
                        androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, r1, 0);
                        int hashCode = Long.hashCode(n34.n(r1));
                        sy90 D = r1.D();
                        q630 c = qri.c(r1, aVar2);
                        cri.h7.getClass();
                        LayoutNode.a aVar3 = cri.a.b;
                        if (r1.N() == null) {
                            n34.r();
                            throw null;
                        }
                        r1.H();
                        if (r1.L()) {
                            r1.I(aVar3);
                        } else {
                            r1.f();
                        }
                        k9q0.w(r1, a, cri.a.f);
                        k9q0.w(r1, D, cri.a.e);
                        k9q0.w(r1, Integer.valueOf(hashCode), cri.a.g);
                        k9q0.t(r1, cri.a.h);
                        k9q0.w(r1, c, cri.a.d);
                        r12.c7(q6sVar, r1, 0);
                        luu0.a(r12.k7(q6sVar, r1), r12.d7(q6sVar, r1), r12.r7(q6sVar, r1), r12.e7(q6sVar, r1), aVar, r12.f7(q6sVar, r1), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, r1, 0);
                        r1.G();
                        r1.j();
                    } else {
                        r1.K(2000193426);
                        luu0.a(r12.k7(q6sVar, r1), r12.d7(q6sVar, r1), r12.r7(q6sVar, r1), r12.e7(q6sVar, r1), aVar, r12.f7(q6sVar, r1), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, r1, 0);
                        r1.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    r1.h();
                }
                return s3q0.a;
            case 3:
                com.vk.geo.impl.presentation.b bVar = (com.vk.geo.impl.presentation.b) obj5;
                okt oktVar = (okt) obj4;
                double doubleValue = ((Double) obj).doubleValue();
                double doubleValue2 = ((Double) obj2).doubleValue();
                AtomicReference<b.a> atomicReference = bVar.w;
                while (true) {
                    b.a aVar4 = atomicReference.get();
                    Parcelable.Creator<Coordinate> creator = Coordinate.CREATOR;
                    float f = (float) doubleValue;
                    float f2 = (float) doubleValue2;
                    Coordinate coordinate = new Coordinate(gqr.a(f, f2));
                    Float f3 = oktVar.c.g;
                    b.a a2 = b.a.C1082a.a(null, coordinate, f3 != null ? new ZoomLevel(f3.floatValue()) : null, 1);
                    while (!atomicReference.compareAndSet(aVar4, a2)) {
                        if (atomicReference.get() != aVar4) {
                            break;
                        }
                    }
                    bVar.x = new BoundingBox(gqr.a(f, f2), 200.0f, (zcl) null);
                    return s3q0.a;
                    break;
                }
            case 4:
                ynd0 ynd0Var = (ynd0) obj5;
                i4u i4uVar = (i4u) obj4;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar5.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1952925161, intValue2, -1, "com.vk.ecomm.market.good.ui.holder.description.GoodDescriptionComposeViewHolder.onBind.<anonymous> (GoodDescriptionComposeViewHolders.kt:99)");
                    }
                    if (ynd0Var == null) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        return s3q0.a;
                    }
                    Object x2 = aVar5.x();
                    if (x2 == obj3) {
                        x2 = androidx.compose.runtime.k.b(Boolean.FALSE);
                        aVar5.R(x2);
                    }
                    rrv0.d(null, null, null, null, kai.c(-367634204, new v(i4uVar, ynd0Var, (wh50) x2), aVar5), aVar5, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
            case 5:
                g8u g8uVar = (g8u) obj5;
                h8u h8uVar = (h8u) obj4;
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar6.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1983296649, intValue3, -1, "com.vk.ecomm.market.good.marketitemreviews.GoodReviewsComposeHolder.setupHeaderBlock.<anonymous>.<anonymous> (GoodReviewsComposeHolder.kt:249)");
                    }
                    com.vk.core.compose.component.group.header.g.b(f.a.a(g8uVar.b6().getString(R.string.good_reviews_block_title), null, d.a.a(h8uVar.h, CounterAppearance.Design.Neutral, CounterMode.Tertiary, null, null, aVar6, 197040, 24), null, null, null, null, null, false, aVar6, 805306368, IronSourceError.ERROR_CODE_INVALID_KEY_VALUE), null, b.c.a, null, null, null, false, aVar6, 384, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar6.h();
                }
                return s3q0.a;
            case 6:
                ((Integer) obj2).getClass();
                ((go20) obj5).d((q630) obj4, (androidx.compose.runtime.a) obj, ne7.I(49));
                return s3q0.a;
            case 7:
                dv60 dv60Var = (dv60) obj5;
                iw60 iw60Var = (iw60) obj;
                io.reactivex.rxjava3.core.x<lu60> A = dv60Var.A(dv60Var.w().h(iw60Var, (jw60) obj2), ((mu60) obj4).b);
                int i5 = iw60Var.c;
                return dv60Var.N(gv60.b(dv60Var.O(dv60Var.J(new io.reactivex.rxjava3.internal.operators.single.r(dv60Var.t(gv60.a(dv60Var.L(gv60.c(dv60Var.H(A, i5).m(dv60Var.n), dv60Var.g)))), new iu4(new ux40(dv60Var, i2), 25)), iw60Var)), new vw4(dv60Var, 11), new v3n(dv60Var, 27)), i5, true);
            case 8:
                ((Integer) obj2).getClass();
                fg70.d((dg70.l) obj5, (izs) obj4, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 9:
                ((Integer) obj2).getClass();
                ((fgb0) obj5).a((q630) obj4, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 10:
                ((Integer) obj2).getClass();
                com.vk.libvideo.design.compose.base.preview.c.c((PreviewViewState.n) obj5, (q630) obj4, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 11:
                ird0 ird0Var = (ird0) obj5;
                rrd0 rrd0Var = (rrd0) obj4;
                androidx.compose.runtime.a aVar7 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar7.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1810754995, intValue4, -1, "com.vk.ecomm.market.good.ui.holder.properties.ProductPropertyVariantsTextHolder.onBind.<anonymous> (ProductPropertyVariantsTextHolder.kt:30)");
                    }
                    rrv0.d(null, null, null, null, kai.c(892497688, new wi4(rrd0Var, ird0Var, ird0Var, i4), aVar7), aVar7, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar7.h();
                }
                return s3q0.a;
            case 12:
                ((Integer) obj2).getClass();
                cef0.c((kef0) obj5, (q630) obj4, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 13:
                dll0 dll0Var = (dll0) obj5;
                izs izsVar = (izs) obj4;
                androidx.compose.runtime.a aVar8 = (androidx.compose.runtime.a) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (aVar8.t(intValue5 & 1, (intValue5 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1610081745, intValue5, -1, "com.vk.ecomm.storefront.impl.albums.presentation.fragment.ui.StorefrontAlbumsContent.<anonymous>.<anonymous> (StorefrontAlbumsScreen.kt:76)");
                    }
                    tkl0.c(dll0Var.c, izsVar, aVar8, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar8.h();
                }
                return s3q0.a;
            case 14:
                vno0 vno0Var = (vno0) obj5;
                izs izsVar2 = (izs) obj4;
                androidx.compose.runtime.a aVar9 = (androidx.compose.runtime.a) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if (aVar9.t(intValue6 & 1, (intValue6 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-292315880, intValue6, -1, "com.vk.video.profile.presentation.views.TextWithBadges.<anonymous> (TextWithBages.kt:38)");
                    }
                    a.l lVar = androidx.compose.foundation.layout.a.a;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, aVar9, 0);
                    int hashCode2 = Long.hashCode(n34.n(aVar9));
                    sy90 D2 = aVar9.D();
                    q630.a aVar10 = q630.a.a;
                    q630 c2 = qri.c(aVar9, aVar10);
                    cri.h7.getClass();
                    LayoutNode.a aVar11 = cri.a.b;
                    if (aVar9.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar9.H();
                    if (aVar9.L()) {
                        aVar9.I(aVar11);
                    } else {
                        aVar9.f();
                    }
                    k9q0.w(aVar9, a3, cri.a.f);
                    k9q0.w(aVar9, D2, cri.a.e);
                    k9q0.w(aVar9, Integer.valueOf(hashCode2), cri.a.g);
                    k9q0.t(aVar9, cri.a.h);
                    k9q0.w(aVar9, c2, cri.a.d);
                    aVar9.K(-1704355712);
                    for (com.vk.video.profile.presentation.views.a aVar12 : vno0Var.c) {
                        ContentBadgeSize contentBadgeSize = ContentBadgeSize.Small;
                        ContentBadgeMode contentBadgeMode = ContentBadgeMode.Primary;
                        ContentBadgeAppearance.Design design = ContentBadgeAppearance.Design.Neutral;
                        String N = d370.N(aVar12.a(), 0, aVar9);
                        q630.a aVar13 = aVar10;
                        q630 B = txj0.B(s200.H(aVar10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), null, 3);
                        Object x3 = aVar9.x();
                        if (x3 == obj3) {
                            x3 = ir.h(aVar9);
                        }
                        sg50 sg50Var = (sg50) x3;
                        boolean J = aVar9.J(izsVar2) | aVar9.J(aVar12);
                        Object x4 = aVar9.x();
                        if (J || x4 == obj3) {
                            x4 = new com.vk.movika.sdk.android.defaultplayer.container.e(26, izsVar2, aVar12);
                            aVar9.R(x4);
                        }
                        q630 b2 = ojc.b(B, sg50Var, null, false, null, (gzs) x4, 28);
                        if (aVar12 instanceof a.C1964a) {
                            str = "video_channel_a_plus_mark_badge";
                        } else {
                            if (!(aVar12 instanceof a.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            str = "video_channel_age_mark_badge";
                        }
                        rnu0.c(contentBadgeSize, contentBadgeMode, design, ahn.E(b2, str), null, null, N, null, null, null, true, null, false, null, aVar9, 438, 6, 15280);
                        aVar10 = aVar13;
                    }
                    if (gp.d(aVar9)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar9.h();
                }
                return s3q0.a;
            case 15:
                final f0.a aVar14 = (f0.a) obj5;
                final com.vk.libvideo.bottomsheet.about.delegate.f0 f0Var = (com.vk.libvideo.bottomsheet.about.delegate.f0) obj4;
                androidx.compose.runtime.a aVar15 = (androidx.compose.runtime.a) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if (aVar15.t(intValue7 & 1, (intValue7 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(671569022, intValue7, -1, "com.vk.libvideo.bottomsheet.about.delegate.VideoDescriptionDelegate.ViewHolder.<anonymous>.<anonymous> (VideoDescriptionDelegate.kt:128)");
                    }
                    n2m n2mVar = (n2m) ((zak0) aVar14.o).getValue();
                    if (n2mVar == null) {
                        aVar15.K(755177825);
                        aVar15.j();
                    } else {
                        aVar15.K(755177826);
                        c4 c4Var = f0Var.a;
                        boolean y2 = aVar15.y(aVar14) | aVar15.y(f0Var);
                        Object x5 = aVar15.x();
                        if (y2 || x5 == obj3) {
                            x5 = new yzs() { // from class: xsna.res0
                                @Override // xsna.yzs
                                public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                    ProductVideoAttach productVideoAttach = (ProductVideoAttach) obj6;
                                    Good good = (Good) obj7;
                                    int intValue8 = ((Integer) obj8).intValue();
                                    LinkedHashSet linkedHashSet = f0.a.this.n;
                                    if (linkedHashSet.contains(productVideoAttach)) {
                                        return s3q0.a;
                                    }
                                    linkedHashSet.add(productVideoAttach);
                                    f0Var.a.d(new b4.f.b(new rz00(good, CommonMarketStat$TypeRefSource.VIDEO_ATTACHED_ITEMS, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65532), intValue8));
                                    return s3q0.a;
                                }
                            };
                            aVar15.R(x5);
                        }
                        yzs yzsVar = (yzs) x5;
                        boolean y3 = aVar15.y(f0Var);
                        Object x6 = aVar15.x();
                        if (y3 || x6 == obj3) {
                            x6 = new com.vk.movika.tools.controls.seekbar.v(f0Var, 17);
                            aVar15.R(x6);
                        }
                        wzs wzsVar = (wzs) x6;
                        boolean y4 = aVar15.y(aVar14);
                        Object x7 = aVar15.x();
                        if (y4 || x7 == obj3) {
                            x7 = new hij0(aVar14, i3);
                            aVar15.R(x7);
                        }
                        izs izsVar3 = (izs) x7;
                        boolean y5 = aVar15.y(aVar14);
                        Object x8 = aVar15.x();
                        if (y5 || x8 == obj3) {
                            x8 = new whg0(aVar14, 18);
                            aVar15.R(x8);
                        }
                        ves0.b(n2mVar, c4Var, yzsVar, wzsVar, izsVar3, (izs) x8, null, aVar15, 0);
                        aVar15.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar15.h();
                }
                return s3q0.a;
            default:
                f8t0.c cVar = (f8t0.c) obj5;
                VideoNewProfileHeaderViewV2 videoNewProfileHeaderViewV2 = (VideoNewProfileHeaderViewV2) obj4;
                androidx.compose.runtime.a aVar16 = (androidx.compose.runtime.a) obj;
                int intValue8 = ((Integer) obj2).intValue();
                int i6 = VideoNewProfileHeaderViewV2.y;
                if (aVar16.t(intValue8 & 1, (intValue8 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-2124186363, intValue8, -1, "com.vk.video.profile.presentation.views.VideoNewProfileHeaderViewV2.bindTitleBadges.<anonymous> (VideoNewProfileHeaderViewV2.kt:442)");
                    }
                    rrv0.d(null, null, null, null, kai.c(864030976, new yku(10, cVar, videoNewProfileHeaderViewV2), aVar16), aVar16, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar16.h();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ yn7(Context context, VoipCallSource voipCallSource, Set set) {
        this.b = 1;
        this.c = voipCallSource;
        this.d = set;
    }

    public /* synthetic */ yn7(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }
}
