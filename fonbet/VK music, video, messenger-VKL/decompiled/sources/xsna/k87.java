package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.media3.common.StreamKey;
import com.vk.catalog2.common.dto.ui.market.UIBlockMarketGroupInfoItem;
import com.vk.catalog2.common.ui.mvp.holder.market.MarketGroupItemLargeVh;
import com.vk.core.compose.component.group.header.f;
import com.vk.dto.common.Good;
import com.vk.dzenarticle.impl.ui.DzenArticleFragment;
import com.vk.music.screens.about.CommunityProfileLinksFragment;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import one.video.player.model.FrameSize;
import ru.ok.gl.tf.Tensorflow;
import xsna.cri;
import xsna.dt1;
import xsna.hfr;
import xsna.ldj0;
import xsna.q630;
import xsna.xrg;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class k87 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k87(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        int i2 = 9;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                izs izsVar = (izs) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(772406371, intValue, -1, "com.vk.biometrics.lock.impl.presentation.base.mvi.setup.BiometricsLockSecuritySetupView.MainScreen.<anonymous> (BiometricsLockSecuritySetupView.kt:64)");
                    }
                    boolean J = aVar.J(izsVar);
                    Object x = aVar.x();
                    if (J || x == c0012a) {
                        x = new ux(izsVar, r9 ? 1 : 0);
                        aVar.R(x);
                    }
                    b57.a((gzs) x, null, false, null, 0L, aVar, 0, 30);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                xrg.a aVar2 = (xrg.a) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1287106, intValue2, -1, "com.vk.profile.community.impl.ui.item.header.CommunityArtistPageItem.CommunityArtistPageViewHolder.<anonymous>.<anonymous> (CommunityArtistPageItem.kt:49)");
                    }
                    rrv0.d(null, null, null, null, kai.c(1146373219, new l71(aVar2, 3), aVar3), aVar3, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 2:
                ((Integer) obj2).getClass();
                qcy<Object>[] qcyVarArr = CommunityProfileLinksFragment.P;
                ((CommunityProfileLinksFragment) obj3).eo(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 3:
                final int intValue3 = ((Integer) obj).intValue();
                jx90 jx90Var = (jx90) obj2;
                bli0 bli0Var = new bli0(new eli0(new bli0(new zsk(jx90Var, null)), new wzs() { // from class: xsna.xsk
                    @Override // xsna.wzs
                    public final Object invoke(Object obj4, Object obj5) {
                        int intValue4 = ((Integer) obj4).intValue();
                        int size = ((cj0) obj5).c.size();
                        ArrayList arrayList = new ArrayList(size);
                        for (int i3 = 0; i3 < size; i3++) {
                            arrayList.add(new StreamKey(intValue3, intValue4, i3));
                        }
                        return arrayList;
                    }
                }, mli0.b, null));
                hfr j = rli0.j(bli0Var, new mp3(i2, jx90Var, (ysk) obj3));
                hfr.a aVar4 = new hfr.a(j);
                while (aVar4.hasNext()) {
                    if (jx90Var.c.get(((StreamKey) aVar4.next()).c).b == 2) {
                        return j;
                    }
                }
                return bli0Var;
            case 4:
                DzenArticleFragment dzenArticleFragment = (DzenArticleFragment) obj3;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                qcy<Object>[] qcyVarArr2 = DzenArticleFragment.R;
                if (aVar5.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-551913931, intValue4, -1, "com.vk.dzenarticle.impl.ui.DzenArticleFragment.onCreateView.<anonymous>.<anonymous> (DzenArticleFragment.kt:104)");
                    }
                    dzenArticleFragment.eo(0, aVar5);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
            case 5:
                ((Integer) obj2).getClass();
                ((tyq) obj3).e(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 6:
                ((Integer) obj2).getClass();
                uau.f((q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(7));
                return s3q0.a;
            case 7:
                MarketGroupItemLargeVh marketGroupItemLargeVh = (MarketGroupItemLargeVh) obj3;
                Good good = (Good) obj;
                Integer num = (Integer) obj2;
                num.intValue();
                UIBlockMarketGroupInfoItem uIBlockMarketGroupInfoItem = marketGroupItemLargeVh.k;
                if (uIBlockMarketGroupInfoItem != null) {
                    marketGroupItemLargeVh.b.b.d.j(new tu00(uIBlockMarketGroupInfoItem, good, num));
                }
                return s3q0.a;
            case 8:
                ((Integer) obj2).getClass();
                ((co20) obj3).a(ne7.I(7), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 9:
                ((Integer) obj2).getClass();
                ((fm70) obj3).A(ne7.I(9), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 10:
                kg50 kg50Var = (kg50) obj3;
                float floatValue = ((Float) obj2).floatValue();
                ((xlb0) obj).a();
                kg50Var.g(kg50Var.getFloatValue() + floatValue);
                return s3q0.a;
            case 11:
                bdn0 bdn0Var = (bdn0) obj3;
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (aVar6.t(intValue5 & 1, (intValue5 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(545304598, intValue5, -1, "com.vk.superapp.holders.stub.SuperAppWidgetRedesignV6Holder.bindData.<anonymous>.<anonymous> (SuperAppWidgetRedesignV6Holder.kt:54)");
                    }
                    a.m mVar = androidx.compose.foundation.layout.a.c;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar6, 0);
                    int hashCode = Long.hashCode(n34.n(aVar6));
                    sy90 D = aVar6.D();
                    q630.a aVar7 = q630.a.a;
                    q630 c = qri.c(aVar6, aVar7);
                    cri.h7.getClass();
                    LayoutNode.a aVar8 = cri.a.b;
                    if (aVar6.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar6.H();
                    if (aVar6.L()) {
                        aVar6.I(aVar8);
                    } else {
                        aVar6.f();
                    }
                    k9q0.w(aVar6, a, cri.a.f);
                    k9q0.w(aVar6, D, cri.a.e);
                    k9q0.w(aVar6, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar6, cri.a.h);
                    k9q0.w(aVar6, c, cri.a.d);
                    jdj0 b = ckv0.b(ldj0.c.a, aVar6, 0);
                    com.vk.core.compose.component.group.header.f a2 = f.a.a(d370.N(R.string.vk_grid_title, 0, aVar6), null, null, null, null, null, null, null, false, aVar6, 805306368, 510);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(958254720, Tensorflow.FRAME_WIDTH, -1, "com.vk.core.compose.component.group.header.GroupHeader.Middle.Companion.invoke (GroupHeader.kt:1088)");
                    }
                    Object x2 = aVar6.x();
                    if (x2 == c0012a) {
                        x2 = new com.vk.core.compose.component.group.header.a(a2, null);
                        aVar6.R(x2);
                    }
                    com.vk.core.compose.component.group.header.a aVar9 = (com.vk.core.compose.component.group.header.a) x2;
                    ((zak0) aVar9.a).setValue(a2);
                    ((zak0) aVar9.b).setValue(null);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    com.vk.core.compose.component.group.header.g.a(aVar9, null, null, null, null, false, aVar6, 0, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                    f9t.e(txj0.h(aVar7, 4), aVar6, 6);
                    bdn0Var.l6(b, aVar6, 8);
                    bdn0Var.i6(b, aVar6, 8);
                    aVar6.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar6.h();
                }
                return s3q0.a;
            case 12:
                ((Integer) obj2).getClass();
                com.vk.profile.design.view.profileheader.b.i((String) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 13:
                ((Integer) obj2).getClass();
                ((rpq0) obj3).q6(ne7.I(7), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            default:
                FrameSize frameSize = (FrameSize) obj3;
                one.video.player.tracks.c cVar = (one.video.player.tracks.c) obj;
                one.video.player.tracks.c cVar2 = (one.video.player.tracks.c) obj2;
                int abs = Math.abs(((cms0) cVar.c).b().ordinal() - frameSize.ordinal());
                int abs2 = Math.abs(((cms0) cVar2.c).b().ordinal() - frameSize.ordinal());
                return Integer.valueOf(abs == abs2 ? ((cms0) cVar2.c).b().getHeight() - ((cms0) cVar.c).b().getHeight() : abs - abs2);
        }
    }

    public /* synthetic */ k87(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
