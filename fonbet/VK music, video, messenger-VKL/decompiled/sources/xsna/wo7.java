package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.defaults.SegmentSize;
import com.vk.ecomm.orders.impl.orderlist.presentation.mvi.viewstate.a;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class wo7 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ wo7(int i, int i2, Object obj, izs izsVar, q630 q630Var) {
        this.b = i2;
        this.d = obj;
        this.c = izsVar;
        this.e = q630Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                xo7.a((mtk0) this.d, (mtk0) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 1:
                ((Integer) obj2).getClass();
                f48.a((p48) this.d, (izs) this.c, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 2:
                ((Integer) obj2).getClass();
                ((qfk) this.d).h((l7a0) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(513));
                return s3q0.a;
            case 3:
                ((Integer) obj2).getClass();
                cw80.e((a.d) this.d, (izs) this.c, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(385));
                return s3q0.a;
            case 4:
                us2 us2Var = (us2) this.d;
                gzs gzsVar = (gzs) this.e;
                gzs gzsVar2 = (gzs) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1558858481, intValue, -1, "com.vk.video.playlist.playlistscreen.ui.view.PlaylistUnsubscribeBottomSheet.<anonymous> (PlaylistUnsubscribeBottomSheet.kt:36)");
                    }
                    q630 H = s200.H(q630.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12, 5);
                    a.m mVar = androidx.compose.foundation.layout.a.c;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar, 0);
                    int hashCode = Long.hashCode(n34.n(aVar));
                    sy90 D = aVar.D();
                    q630 c = qri.c(aVar, H);
                    cri.h7.getClass();
                    LayoutNode.a aVar2 = cri.a.b;
                    if (aVar.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar.H();
                    if (aVar.L()) {
                        aVar.I(aVar2);
                    } else {
                        aVar.f();
                    }
                    k9q0.w(aVar, a, cri.a.f);
                    k9q0.w(aVar, D, cri.a.e);
                    k9q0.w(aVar, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar, cri.a.h);
                    k9q0.w(aVar, c, cri.a.d);
                    wiu0.b(null, false, null, Cell$Middle.a.a(null, Cell$Middle.c.b.b(d370.N(R.string.unsubscribe_video_playlist_title, 0, aVar), 0, null, null, null, aVar, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, aVar, 196608, 29), null, null, null, aVar, 0, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
                    wiu0.b(null, false, null, Cell$Middle.a.a(Cell$Middle.d.b.b(us2Var, null, null, null, 0, 0, null, null, null, aVar, 0, 6, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW), null, null, null, aVar, 196608, 30), null, gzsVar, null, aVar, 0, 87);
                    wiu0.b(null, false, null, Cell$Middle.a.a(Cell$Middle.d.b.a(d370.N(R.string.friends_catalog_snackbar_button_undo, 0, aVar), null, null, 0, null, null, aVar, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, null, aVar, 196608, 30), null, gzsVar2, null, aVar, 0, 87);
                    aVar.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 5:
                ((Integer) obj2).getClass();
                ((cfl0) this.d).h((dz40) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(513));
                return s3q0.a;
            default:
                Integer num = (Integer) this.d;
                qow qowVar = (qow) this.e;
                m5i0 m5i0Var = (m5i0) this.c;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1002161679, intValue2, -1, "com.vk.core.compose.component.VkSegmentedControl.<anonymous>.<anonymous>.<anonymous> (VkSegmentedControl.kt:98)");
                    }
                    if (num != null) {
                        aVar3.K(-1080802136);
                        q630 f = txj0.f(txj0.h(s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, m5i0Var.a, 1, kci.m(((pco) hg2.a(((j5i0) ((List) qowVar.a).get(num.intValue())).a, jq2.d(250, 0, luo.a, 2), "Segment Control indicator offset", aVar3, 384, 8).getValue()).b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630.a.a)), m5i0Var.e((SegmentSize) aVar3.r(bjv0.b))), 1.0f);
                        float b = m5i0Var.b(aVar3);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar3.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        uov0.a(r18.a(b, ylu0Var.getImage().a, f, m5i0Var.f(aVar3)), m5i0Var.f(aVar3), m5i0Var.c(aVar3), m5i0Var.c(aVar3), null, m5i0Var.d(aVar3), uoi.a, aVar3, 1597440, 0);
                    } else {
                        aVar3.K(-1084638479);
                    }
                    aVar3.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ wo7(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
    }

    public /* synthetic */ wo7(Object obj, Object obj2, izs izsVar, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = izsVar;
    }
}
