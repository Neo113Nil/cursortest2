package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.X2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.d4k0;
import xsna.dt1;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class xhd implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ xhd(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                s61 s61Var = (s61) this.c;
                gzs gzsVar = (gzs) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1105830212, intValue, -1, "com.vk.clips.upload.ui.impl.compose.views.author.ClipsAuthorsPicker.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ClipsAuthorsPicker.kt:92)");
                    }
                    fid.a(s61Var, gzsVar, null, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                izs izsVar = (izs) this.c;
                String str = (String) this.d;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-998993022, intValue2, -1, "com.vk.ecomm.contentproducts.view.ProductsGreed.<anonymous>.<anonymous>.<anonymous> (ContentProductsBottomSheetContent.kt:245)");
                    }
                    q630 E = s200.E(q630.a.a, 6, 4);
                    ButtonAppearance buttonAppearance = ButtonAppearance.Neutral;
                    ButtonSize buttonSize = ButtonSize.Large;
                    ButtonStyle buttonStyle = ButtonStyle.Secondary;
                    String N = d370.N(R.string.content_product_all_products_in_shop_button, 0, aVar2);
                    boolean J = aVar2.J(izsVar) | aVar2.J(str);
                    Object x = aVar2.x();
                    if (J || x == a.C0011a.a) {
                        x = new oe5(6, izsVar, str);
                        aVar2.R(x);
                    }
                    bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance, E, null, false, false, null, null, null, N, null, null, null, null, false, null, null, null, aVar2, X2.b.f, 0, 0, 4190176);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 2:
                hwu hwuVar = (hwu) this.c;
                izs izsVar2 = (izs) this.d;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-771057873, intValue3, -1, "com.vk.music.stickyplayer.presentation.redesignedcomponents.TopHeaderBlock.<anonymous> (RedesignHeaderBlock.kt:64)");
                    }
                    vkf0.a(hwuVar.b, hwuVar.d, hwuVar.e, hwuVar.f, izsVar2, aVar3, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 3:
                o3j0 o3j0Var = (o3j0) this.c;
                izs izsVar3 = (izs) this.d;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if (aVar4.t(intValue4 & 1, (intValue4 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-344533758, intValue4, -1, "com.vk.video.ui.upload.impl.settings.presentation.compose.screen.itemsOther.<anonymous> (SettingsScreen.kt:190)");
                    }
                    uzi0 uzi0Var = o3j0Var.h;
                    boolean J2 = aVar4.J(izsVar3);
                    Object x2 = aVar4.x();
                    if (J2 || x2 == a.C0011a.a) {
                        x2 = new t9d(izsVar3, 5);
                        aVar4.R(x2);
                    }
                    tzi0.a(uzi0Var, (gzs) x2, ahn.E(q630.a.a, "ScreenTags.ORD"), null, aVar4, 384, 8);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            default:
                j5k0 j5k0Var = (j5k0) this.c;
                final izs izsVar4 = (izs) this.d;
                s890 s890Var = (s890) obj;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= aVar5.J(s890Var) ? 4 : 2;
                }
                if (aVar5.t(intValue5 & 1, (intValue5 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(652532407, intValue5, -1, "com.vk.video.ui.smartcrop.impl.presentation.compose.screen.SmartCropScreen.<anonymous> (SmartCropScreen.kt:73)");
                    }
                    q630.a aVar6 = q630.a.a;
                    q630 C = s200.C(aVar6, s890Var);
                    a.m mVar = androidx.compose.foundation.layout.a.c;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar5, 0);
                    int hashCode = Long.hashCode(n34.n(aVar5));
                    sy90 D = aVar5.D();
                    q630 c = qri.c(aVar5, C);
                    cri.h7.getClass();
                    LayoutNode.a aVar7 = cri.a.b;
                    if (aVar5.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar5.H();
                    if (aVar5.L()) {
                        aVar5.I(aVar7);
                    } else {
                        aVar5.f();
                    }
                    cri.a.c cVar = cri.a.f;
                    k9q0.w(aVar5, a, cVar);
                    cri.a.e eVar = cri.a.e;
                    k9q0.w(aVar5, D, eVar);
                    Integer valueOf = Integer.valueOf(hashCode);
                    cri.a.b bVar = cri.a.g;
                    k9q0.w(aVar5, valueOf, bVar);
                    cri.a.C2678a c2678a = cri.a.h;
                    k9q0.t(aVar5, c2678a);
                    cri.a.d dVar = cri.a.d;
                    k9q0.w(aVar5, c, dVar);
                    q630 c2 = txj0.c(aVar6, 1.0f);
                    if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                        szw.a("invalid weight; must be greater than zero");
                    }
                    q630 d = defpackage.j0.d(1.0f, c2, true);
                    cp10 d2 = ja8.d(dt1.a.b, false);
                    int hashCode2 = Long.hashCode(n34.n(aVar5));
                    sy90 D2 = aVar5.D();
                    q630 c3 = qri.c(aVar5, d);
                    if (aVar5.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar5.H();
                    if (aVar5.L()) {
                        aVar5.I(aVar7);
                    } else {
                        aVar5.f();
                    }
                    k9q0.w(aVar5, d2, cVar);
                    k9q0.w(aVar5, D2, eVar);
                    ur.d(hashCode2, aVar5, bVar, aVar5, c2678a);
                    k9q0.w(aVar5, c3, dVar);
                    x4k0.a(j5k0Var.b, ra8.a.b(aVar6, dt1.a.f), aVar5, 0);
                    aVar5.G();
                    xrp0 xrp0Var = j5k0Var.c;
                    boolean J3 = aVar5.J(izsVar4);
                    Object x3 = aVar5.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (J3 || x3 == c0012a) {
                        x3 = new krp0() { // from class: xsna.h5k0
                            @Override // xsna.krp0
                            public final void a(long j, q500 q500Var) {
                                izs.this.invoke(new d4k0.k.a(j, q500Var));
                            }
                        };
                        aVar5.R(x3);
                    }
                    krp0 krp0Var = (krp0) x3;
                    boolean J4 = aVar5.J(izsVar4);
                    Object x4 = aVar5.x();
                    if (J4 || x4 == c0012a) {
                        x4 = new t2(izsVar4, 3);
                        aVar5.R(x4);
                    }
                    trp0.a(xrp0Var, krp0Var, null, (gzs) x4, aVar5, 0);
                    p5k0.a(384, aVar5, izsVar4, s200.H(aVar6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 22, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), j5k0Var.d);
                    aVar5.G();
                    i5k0.c(j5k0Var, izsVar4, aVar5, 0);
                    i5k0.b(j5k0Var, izsVar4, aVar5, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ xhd(hwu hwuVar, izs izsVar) {
        this.b = 2;
        this.c = hwuVar;
        this.d = izsVar;
    }
}
