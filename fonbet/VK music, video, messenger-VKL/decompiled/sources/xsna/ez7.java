package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.fragment.app.FragmentActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.o;
import com.vk.libvideo.bottomsheet.videoplaylist.VideoPlaylistBottomSheetRedesign;
import java.util.List;
import kotlin.Pair;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.us2;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class ez7 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ez7(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.e = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02a5  */
    @Override // xsna.wzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        coo0 coo0Var;
        float f;
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                vz7.b((o.a) this.e, (izs) this.c, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(385));
                return s3q0.a;
            case 1:
                ((Integer) obj2).getClass();
                x3c.b((x7i) this.e, (izs) this.c, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(385));
                return s3q0.a;
            case 2:
                ((Integer) obj2).getClass();
                ((jve) this.e).g((kve) this.d, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(513));
                return s3q0.a;
            case 3:
                us2 us2Var = (us2) this.e;
                final List list = (List) this.c;
                String str = (String) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1448322616, intValue, -1, "com.vk.community.design.compose.components.channel.CommunityChannelTextCell.<anonymous> (CommunityChannelTextCell.kt:95)");
                    }
                    q630.a aVar2 = q630.a.a;
                    q630 D = s200.D(txj0.d(aVar2, 1.0f), kqu0.u);
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
                    k9q0.w(aVar, a, cri.a.f);
                    k9q0.w(aVar, D2, cri.a.e);
                    k9q0.w(aVar, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar, cri.a.h);
                    k9q0.w(aVar, c, cri.a.d);
                    final long j = wlb0.l(aVar).d0.a.b.c;
                    final uog0 b = vog0.b(kqu0.m);
                    wow wowVar = list != null ? new wow(list) : null;
                    if (wowVar == null || wowVar.b.isEmpty()) {
                        coo0Var = new coo0(us2Var, jgp.b);
                    } else if (list.size() == 1) {
                        final String str2 = (String) j5g.Y(new wow(list));
                        us2.b bVar = new us2.b();
                        s0x.a(bVar, "one_image_content", "�");
                        bVar.h(us2Var);
                        coo0Var = new coo0(bVar.n(), on00.f(new Pair("one_image_content", new r0x(new esa0(l2l0.n(fno0.d(j) + 6, 4294967296L), j, 7), new jai(1744371086, new yzs() { // from class: xsna.tug
                            @Override // xsna.yzs
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj4;
                                int intValue2 = ((Integer) obj5).intValue();
                                if (aVar4.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(1744371086, intValue2, -1, "com.vk.community.design.compose.components.channel.getOneImageTextContent.<anonymous> (CommunityChannelTextCell.kt:160)");
                                    }
                                    final float O0 = ((azl) aVar4.r(uvi.h)).O0(j);
                                    q630 q = txj0.q(q630.a.a, O0);
                                    final uog0 uog0Var = b;
                                    q4h.a(str2, q, uog0Var, kai.c(-2073782778, new wzs() { // from class: xsna.uug
                                        @Override // xsna.wzs
                                        public final Object invoke(Object obj6, Object obj7) {
                                            androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj6;
                                            int intValue3 = ((Integer) obj7).intValue();
                                            if (aVar5.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.f(-2073782778, intValue3, -1, "com.vk.community.design.compose.components.channel.getOneImageTextContent.<anonymous>.<anonymous> (CommunityChannelTextCell.kt:166)");
                                                }
                                                yug.b(O0, uog0Var, aVar5, 0);
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.e();
                                                }
                                            } else {
                                                aVar5.h();
                                            }
                                            return s3q0.a;
                                        }
                                    }, aVar4), aVar4, 24576, 8);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                } else {
                                    aVar4.h();
                                }
                                return s3q0.a;
                            }
                        }, true)))));
                        f = 1.0f;
                        q630 f2 = txj0.f(aVar2, f);
                        if (f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                            szw.a("invalid weight; must be greater than zero");
                        }
                        yqv0.d(coo0Var.a, defpackage.j0.d(f, f2, true), wlb0.h(aVar).getText().m, 0, null, 2, false, 4, null, coo0Var.b, wlb0.l(aVar).d0, aVar, 100663296, 6, 2808);
                        yqv0.c(str, s200.H(txj0.f(aVar2, f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.r, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), wlb0.h(aVar).getText().p, null, null, 0, 0, null, 2, false, 0, 1, null, wlb0.l(aVar).C0, aVar, 100663296, 48, 5880);
                        aVar.G();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        us2.b bVar2 = new us2.b();
                        s0x.a(bVar2, "two_image_content", "�");
                        bVar2.h(us2Var);
                        coo0Var = new coo0(bVar2.n(), on00.f(new Pair("two_image_content", new r0x(new esa0(l2l0.j((fno0.d(j) * 0.77d) + fno0.d(j) + 6), j, 7), new jai(-890587226, new yzs() { // from class: xsna.sug
                            @Override // xsna.yzs
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj4;
                                int intValue2 = ((Integer) obj5).intValue();
                                if (aVar4.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(-890587226, intValue2, -1, "com.vk.community.design.compose.components.channel.getTwoImagesTextContent.<anonymous> (CommunityChannelTextCell.kt:193)");
                                    }
                                    azl azlVar = (azl) aVar4.r(uvi.h);
                                    float O0 = azlVar.O0(l2l0.l(6));
                                    q630.a aVar5 = q630.a.a;
                                    q630 H = s200.H(txj0.d(aVar5, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, O0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11);
                                    dt1.a.getClass();
                                    cp10 d = ja8.d(dt1.a.b, false);
                                    int hashCode2 = Long.hashCode(n34.n(aVar4));
                                    sy90 D3 = aVar4.D();
                                    q630 c2 = qri.c(aVar4, H);
                                    cri.h7.getClass();
                                    LayoutNode.a aVar6 = cri.a.b;
                                    if (aVar4.N() == null) {
                                        n34.r();
                                        throw null;
                                    }
                                    aVar4.H();
                                    if (aVar4.L()) {
                                        aVar4.I(aVar6);
                                    } else {
                                        aVar4.f();
                                    }
                                    k9q0.w(aVar4, d, cri.a.f);
                                    k9q0.w(aVar4, D3, cri.a.e);
                                    k9q0.w(aVar4, Integer.valueOf(hashCode2), cri.a.g);
                                    k9q0.t(aVar4, cri.a.h);
                                    k9q0.w(aVar4, c2, cri.a.d);
                                    long j2 = j;
                                    final float O02 = azlVar.O0(j2);
                                    float O03 = azlVar.O0(l2l0.l(2)) + azlVar.O0(j2);
                                    List list2 = list;
                                    String str3 = (String) j5g.b0(1, new wow(list2));
                                    q630 q = txj0.q(aVar5, O02);
                                    ty6 ty6Var = dt1.a.g;
                                    ra8 ra8Var = ra8.a;
                                    q630 b2 = ra8Var.b(q, ty6Var);
                                    final uog0 uog0Var = b;
                                    q4h.a(str3, b2, uog0Var, kai.c(1603851940, new wzs() { // from class: xsna.vug
                                        @Override // xsna.wzs
                                        public final Object invoke(Object obj6, Object obj7) {
                                            androidx.compose.runtime.a aVar7 = (androidx.compose.runtime.a) obj6;
                                            int intValue3 = ((Integer) obj7).intValue();
                                            if (aVar7.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.f(1603851940, intValue3, -1, "com.vk.community.design.compose.components.channel.getTwoImagesTextContent.<anonymous>.<anonymous>.<anonymous> (CommunityChannelTextCell.kt:210)");
                                                }
                                                yug.b(O02, uog0Var, aVar7, 0);
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.e();
                                                }
                                            } else {
                                                aVar7.h();
                                            }
                                            return s3q0.a;
                                        }
                                    }, aVar4), aVar4, 24576, 8);
                                    q630 d2 = rte0.d(txj0.v(txj0.c(aVar5, 1.0f), O03), uog0Var);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                    }
                                    ylu0 ylu0Var = (ylu0) aVar4.r(rrv0.a);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                    f9t.e(hr80.m(d2, ylu0Var.getBackground().B, androidx.compose.ui.graphics.e.a), aVar4, 0);
                                    q4h.a((String) j5g.b0(0, new wow(list2)), ra8Var.b(txj0.q(aVar5, O02), dt1.a.e), uog0Var, kai.c(1486939099, new wzs() { // from class: xsna.wug
                                        @Override // xsna.wzs
                                        public final Object invoke(Object obj6, Object obj7) {
                                            androidx.compose.runtime.a aVar7 = (androidx.compose.runtime.a) obj6;
                                            int intValue3 = ((Integer) obj7).intValue();
                                            if (aVar7.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.f(1486939099, intValue3, -1, "com.vk.community.design.compose.components.channel.getTwoImagesTextContent.<anonymous>.<anonymous>.<anonymous> (CommunityChannelTextCell.kt:232)");
                                                }
                                                yug.b(O02, uog0Var, aVar7, 0);
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.e();
                                                }
                                            } else {
                                                aVar7.h();
                                            }
                                            return s3q0.a;
                                        }
                                    }, aVar4), aVar4, 24576, 8);
                                    aVar4.G();
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                } else {
                                    aVar4.h();
                                }
                                return s3q0.a;
                            }
                        }, true)))));
                    }
                    f = 1.0f;
                    q630 f22 = txj0.f(aVar2, f);
                    if (f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    }
                    yqv0.d(coo0Var.a, defpackage.j0.d(f, f22, true), wlb0.h(aVar).getText().m, 0, null, 2, false, 4, null, coo0Var.b, wlb0.l(aVar).d0, aVar, 100663296, 6, 2808);
                    yqv0.c(str, s200.H(txj0.f(aVar2, f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.r, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), wlb0.h(aVar).getText().p, null, null, 0, 0, null, 2, false, 0, 1, null, wlb0.l(aVar).C0, aVar, 100663296, 48, 5880);
                    aVar.G();
                    if (androidx.compose.runtime.b.d()) {
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 4:
                ((Integer) obj2).getClass();
                r6l.g((rh90) this.e, (izs) this.c, (gzs) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 5:
                ((Integer) obj2).getClass();
                ((rkq) this.e).j((skq) this.d, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(513));
                return s3q0.a;
            case 6:
                oei0 oei0Var = (oei0) this.e;
                jai jaiVar = (jai) this.c;
                bei0 bei0Var = (bei0) this.d;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-284825865, intValue2, -1, "androidx.compose.foundation.text.selection.SelectionContainer.<anonymous>.<anonymous> (SelectionContainer.kt:137)");
                    }
                    rvi.a(pei0.a.b(oei0Var), kai.c(610483127, new d6(9, jaiVar, bei0Var), aVar4), aVar4, 56);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            default:
                gzs gzsVar = (gzs) this.e;
                VideoPlaylistBottomSheetRedesign videoPlaylistBottomSheetRedesign = (VideoPlaylistBottomSheetRedesign) this.c;
                FragmentActivity fragmentActivity = (FragmentActivity) this.d;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar5.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(882156585, intValue3, -1, "com.vk.libvideo.bottomsheet.videoplaylist.VideoPlaylistBottomSheetRedesign.Content.<anonymous> (VideoPlaylistBottomSheetRedesign.kt:74)");
                    }
                    b5v0.a(gzsVar, null, null, null, kai.c(-1593305908, new zl3(videoPlaylistBottomSheetRedesign, fragmentActivity, gzsVar, 8), aVar5), null, false, false, null, aVar5, 14180352, 302);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ ez7(Object obj, izs izsVar, Object obj2, int i, int i2) {
        this.b = i2;
        this.e = obj;
        this.c = izsVar;
        this.d = obj2;
    }

    public /* synthetic */ ez7(kk50 kk50Var, ao50 ao50Var, izs izsVar, int i, int i2) {
        this.b = i2;
        this.e = kk50Var;
        this.d = ao50Var;
        this.c = izsVar;
    }
}
