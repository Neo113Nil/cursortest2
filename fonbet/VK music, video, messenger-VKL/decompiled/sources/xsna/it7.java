package xsna;

import android.os.SystemClock;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.api.generated.wall.dto.WallWallItemDto;
import com.vk.newsfeed.posting.impl.domain.model.LocalMediaEntry;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerSelectedItem;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.mediapicker.localmedia.LocalMediaPickerFragmentOld;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Map;
import xsna.cri;
import xsna.dt1;
import xsna.pbh;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class it7 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ it7(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                kt7 kt7Var = (kt7) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1718909776, intValue, -1, "com.vk.ecomm.onlinebooking.impl.common.ui.BookingRecordCellImpl.Content.<anonymous> (BookingRecordCell.kt:97)");
                    }
                    float f = 16;
                    q630.a aVar2 = q630.a.a;
                    q630 D = s200.D(aVar2, f);
                    a.m mVar = androidx.compose.foundation.layout.a.c;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar, 0);
                    int hashCode = Long.hashCode(n34.n(aVar));
                    sy90 D2 = aVar.D();
                    q630 c = qri.c(aVar, D);
                    cri.h7.getClass();
                    LayoutNode.a aVar3 = cri.a.b;
                    if (aVar.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar.H();
                    if (aVar.L()) {
                        aVar.I(aVar3);
                    } else {
                        aVar.f();
                    }
                    cri.a.c cVar = cri.a.f;
                    k9q0.w(aVar, a, cVar);
                    cri.a.e eVar = cri.a.e;
                    k9q0.w(aVar, D2, eVar);
                    Integer valueOf = Integer.valueOf(hashCode);
                    cri.a.b bVar = cri.a.g;
                    k9q0.w(aVar, valueOf, bVar);
                    cri.a.C2678a c2678a = cri.a.h;
                    k9q0.t(aVar, c2678a);
                    cri.a.d dVar = cri.a.d;
                    k9q0.w(aVar, c, dVar);
                    q630 f2 = txj0.f(aVar2, 1.0f);
                    androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.k, aVar, 0);
                    int hashCode2 = Long.hashCode(n34.n(aVar));
                    sy90 D3 = aVar.D();
                    q630 c2 = qri.c(aVar, f2);
                    if (aVar.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar.H();
                    if (aVar.L()) {
                        aVar.I(aVar3);
                    } else {
                        aVar.f();
                    }
                    k9q0.w(aVar, a2, cVar);
                    k9q0.w(aVar, D3, eVar);
                    ur.d(hashCode2, aVar, bVar, aVar, c2678a);
                    k9q0.w(aVar, c2, dVar);
                    kt7Var.b(6, aVar);
                    f9t.e(txj0.q(aVar2, f), aVar, 6);
                    kt7Var.c(0, aVar);
                    aVar.G();
                    f9t.e(txj0.q(aVar2, f), aVar, 6);
                    float f3 = 12;
                    androidx.compose.foundation.layout.e.a(null, androidx.compose.foundation.layout.a.g(f3), androidx.compose.foundation.layout.a.g(f3), null, 2, 0, kai.c(1691796907, new gt7(kt7Var, 0), aVar), aVar, 1597872, 41);
                    aVar.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                pbh.a aVar4 = (pbh.a) this.c;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar5.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(172376342, intValue2, -1, "com.vk.profile.community.impl.ui.item.header.CommunityOnboardingBannerItem.CommunityNewOnBoardingHolder.<anonymous>.<anonymous> (CommunityOnboardingBannerItem.kt:71)");
                    }
                    pbh pbhVar = (pbh) ((zak0) aVar4.q).getValue();
                    if (pbhVar == null) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        return s3q0.a;
                    }
                    aVar5.K(-1516745812);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar5.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    q630 m = hr80.m(q630.a.a, ylu0Var.getBackground().g, vog0.b(16));
                    nbh nbhVar = pbhVar.j;
                    nbh nbhVar2 = new nbh(nbhVar.a, nbhVar.b, nbhVar.c);
                    boolean y = aVar5.y(aVar4);
                    Object x = aVar5.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (y || x == c0012a) {
                        x = new com.vk.movika.sdk.base.logic.processor.actions.d(aVar4, 27);
                        aVar5.R(x);
                    }
                    gzs gzsVar = (gzs) x;
                    boolean y2 = aVar5.y(aVar4);
                    Object x2 = aVar5.x();
                    if (y2 || x2 == c0012a) {
                        x2 = new obh(aVar4, 0);
                        aVar5.R(x2);
                    }
                    gzs gzsVar2 = (gzs) x2;
                    boolean y3 = aVar5.y(aVar4);
                    Object x3 = aVar5.x();
                    if (y3 || x3 == c0012a) {
                        x3 = new com.vk.movika.sdk.base.logic.processor.actions.f(aVar4, 29);
                        aVar5.R(x3);
                    }
                    vbh.b(nbhVar2, gzsVar, gzsVar2, (gzs) x3, m, aVar5, 0);
                    aVar5.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
            case 2:
                ((Integer) obj2).getClass();
                ((giy) this.c).c(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 3:
                h2s h2sVar = ((LocalMediaPickerFragmentOld) this.c).Y;
                LocalMediaEntry localMediaEntry = (LocalMediaEntry) obj;
                if (((Boolean) obj2).booleanValue()) {
                    h2sVar.invoke(new PostingAction.MediaPicker.Selection.ToggleLocalMediaItemSelection(new MediaPickerSelectedItem.LocalMedia(localMediaEntry), SystemClock.elapsedRealtime()));
                } else {
                    h2sVar.invoke(new PostingAction.MediaPicker.Selection.ToggleLocalMediaItemSelection(new MediaPickerSelectedItem.LocalMedia(localMediaEntry), SystemClock.elapsedRealtime()));
                }
                return s3q0.a;
            case 4:
                com.vk.core.compose.component.cell.content.x xVar = (com.vk.core.compose.component.cell.content.x) this.c;
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar6.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1903067836, intValue3, -1, "com.vk.newsfeed.posting.music_picker.presentation.view.SnippetRightIcons.<anonymous>.<anonymous>.<anonymous> (MusicPickerItems.kt:821)");
                    }
                    xVar.a(tpg0.a, q630.a.a, aVar6, 48);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar6.h();
                }
                return s3q0.a;
            case 5:
                return ((r9x0) this.c).a((WallWallItemDto) obj, null, null, (Map) obj2);
            case 6:
                idi0 idi0Var = (idi0) this.c;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ((Boolean) obj2).booleanValue();
                idi0Var.b(booleanValue);
                return s3q0.a;
            case 7:
                voj0 voj0Var = (voj0) this.c;
                androidx.compose.runtime.a aVar7 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar7.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1685988571, intValue4, -1, "com.vk.video.ui.discovery.minimizable.recycler.similar.ui.SimilarViewHolder.<anonymous>.<anonymous> (SimilarViewHolder.kt:66)");
                    }
                    ooj0 ooj0Var = (ooj0) ((zak0) voj0Var.n).getValue();
                    if (ooj0Var == null) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        return s3q0.a;
                    }
                    voj0Var.l.a(ooj0Var.a, voj0Var.o, aVar7, 384);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar7.h();
                }
                return s3q0.a;
            default:
                bdn0 bdn0Var = (bdn0) this.c;
                androidx.compose.runtime.a aVar8 = (androidx.compose.runtime.a) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (aVar8.t(intValue5 & 1, (intValue5 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1585219831, intValue5, -1, "com.vk.superapp.holders.stub.SuperAppWidgetRedesignV6Holder.FirstHalfTile.<anonymous> (SuperAppWidgetRedesignV6Holder.kt:164)");
                    }
                    q630.a aVar9 = q630.a.a;
                    q630 D4 = s200.D(txj0.h(txj0.f(aVar9, 1.0f), Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE), 12);
                    dt1.a.getClass();
                    ty6 ty6Var = dt1.a.b;
                    cp10 d = ja8.d(ty6Var, false);
                    int hashCode3 = Long.hashCode(n34.n(aVar8));
                    sy90 D5 = aVar8.D();
                    q630 c3 = qri.c(aVar8, D4);
                    cri.h7.getClass();
                    LayoutNode.a aVar10 = cri.a.b;
                    if (aVar8.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar8.H();
                    if (aVar8.L()) {
                        aVar8.I(aVar10);
                    } else {
                        aVar8.f();
                    }
                    cri.a.c cVar2 = cri.a.f;
                    k9q0.w(aVar8, d, cVar2);
                    cri.a.e eVar2 = cri.a.e;
                    k9q0.w(aVar8, D5, eVar2);
                    Integer valueOf2 = Integer.valueOf(hashCode3);
                    cri.a.b bVar2 = cri.a.g;
                    k9q0.w(aVar8, valueOf2, bVar2);
                    cri.a.C2678a c2678a2 = cri.a.h;
                    k9q0.t(aVar8, c2678a2);
                    cri.a.d dVar2 = cri.a.d;
                    k9q0.w(aVar8, c3, dVar2);
                    ra8 ra8Var = ra8.a;
                    bdn0Var.g6(ra8Var.b(aVar9, ty6Var), aVar8, 0);
                    q630 b = ra8Var.b(aVar9, dt1.a.h);
                    androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.n, aVar8, 0);
                    int hashCode4 = Long.hashCode(n34.n(aVar8));
                    sy90 D6 = aVar8.D();
                    q630 c4 = qri.c(aVar8, b);
                    if (aVar8.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar8.H();
                    if (aVar8.L()) {
                        aVar8.I(aVar10);
                    } else {
                        aVar8.f();
                    }
                    k9q0.w(aVar8, a3, cVar2);
                    k9q0.w(aVar8, D6, eVar2);
                    ur.d(hashCode4, aVar8, bVar2, aVar8, c2678a2);
                    k9q0.w(aVar8, c4, dVar2);
                    float f4 = 100;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    iyk0 iyk0Var = rrv0.c;
                    wuv0 wuv0Var = (wuv0) aVar8.r(iyk0Var);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    erv0.a(1, wuv0Var.i0, null, f4, aVar8, 3078, 4);
                    float f5 = 48;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var2 = (wuv0) aVar8.r(iyk0Var);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    erv0.a(1, wuv0Var2.i0, null, f5, aVar8, 3078, 4);
                    if (kr.f(aVar8)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar8.h();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ it7(giy giyVar, int i) {
        this.b = 2;
        this.c = giyVar;
    }
}
