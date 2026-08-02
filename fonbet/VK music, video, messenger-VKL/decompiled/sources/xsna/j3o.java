package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.input.InputSelect$State;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.compose.generated.VkColorToken;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.video.playlist.playlistscreen.ui.view.PlaylistButtonsStyle;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.cri;
import xsna.dt1;
import xsna.f8s;
import xsna.g8s;
import xsna.q630;
import xsna.us2;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class j3o implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ j3o(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        us2 j;
        long c;
        int i = this.b;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.c;
        switch (i) {
            case 0:
                m3o m3oVar = (m3o) obj7;
                rwr rwrVar = (rwr) obj6;
                izs izsVar = (izs) obj5;
                wh50 wh50Var = (wh50) obj4;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(913460221, intValue, -1, "com.vk.newsfeed.posting.donut_teaser.presentation.DonutTeaserContentView.ThemedContent.<anonymous> (DonutTeaserContentView.kt:74)");
                    }
                    tlo0 tlo0Var = ((x3o) wh50Var.getValue()).f;
                    CharSequence a = tlo0Var != null ? tlo0Var.a(m3oVar.c) : null;
                    boolean z = a != null && (drm0.N(a) ^ true);
                    InputSelect$State inputSelect$State = z ? InputSelect$State.Error : InputSelect$State.Default;
                    if (!z || a == null) {
                        aVar.K(-18952578);
                        int length = ((x3o) wh50Var.getValue()).c.length();
                        boolean z2 = ((x3o) wh50Var.getValue()).e;
                        boolean z3 = ((x3o) wh50Var.getValue()).a;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(745618163, 4096, -1, "com.vk.newsfeed.posting.donut_teaser.presentation.DonutTeaserContentView.buildTeaserFieldCaptionText (DonutTeaserContentView.kt:164)");
                        }
                        aVar.K(-720477314);
                        s8u0 s8u0Var = new s8u0(0);
                        s8u0Var.e(d370.O(R.string.post_teaser_symbols_counter, new Object[]{Integer.valueOf(length), 112}, aVar));
                        if (z2) {
                            s8u0Var.e(" · ");
                            StringBuilder sb = s8u0Var.a;
                            int length2 = sb.length();
                            s8u0Var.e(d370.N(R.string.post_teaser_modal_reset_text, 0, aVar));
                            int length3 = sb.length();
                            if (!z3) {
                                s8u0Var.c(length2, length3, "clickable_tag", "reset_to_default");
                                s8u0Var.d(new klv0(VkTypographyToken.Footnote, VkColorToken.TextLink), length2, length3);
                            }
                            klv0 klv0Var = new klv0(VkTypographyToken.Footnote, VkColorToken.TextSecondary);
                            if (z3) {
                                length2 = sb.length();
                            }
                            s8u0Var.d(klv0Var, 0, length2);
                        }
                        aVar.j();
                        j = s8u0Var.j(8, aVar);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        aVar.j();
                    } else {
                        aVar.K(-19034790);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1843792647, 64, -1, "com.vk.newsfeed.posting.donut_teaser.presentation.DonutTeaserContentView.buildErrorTeaserFieldCaptionText (DonutTeaserContentView.kt:201)");
                        }
                        aVar.K(1936763680);
                        us2.b bVar = new us2.b();
                        bVar.f(a);
                        bVar.d(bkt0.c(new klv0(VkTypographyToken.Footnote, VkColorToken.TextNegative), aVar), 0, a.length());
                        j = bVar.n();
                        aVar.j();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        aVar.j();
                    }
                    boolean o = aVar.o(((x3o) wh50Var.getValue()).g);
                    Object x = aVar.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (o || x == c0012a) {
                        qko0 qko0Var = ((x3o) wh50Var.getValue()).d;
                        if (qko0Var != null) {
                            c = qko0Var.a;
                        } else {
                            int length4 = ((x3o) wh50Var.getValue()).c.length();
                            c = jgz.c(length4, length4);
                        }
                        x = androidx.compose.runtime.k.b(new tho0(((x3o) wh50Var.getValue()).c, c, 4));
                        aVar.R(x);
                    }
                    wh50 wh50Var2 = (wh50) x;
                    q630 d = jvi.d(txj0.f(q630.a.a, 1.0f), rwrVar);
                    tho0 tho0Var = (tho0) wh50Var2.getValue();
                    boolean z4 = !((x3o) wh50Var.getValue()).a;
                    rgy rgyVar = new rgy(0, 0, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                    SemanticsConfiguration.Mode mode = SemanticsConfiguration.Mode.Merge;
                    Object x2 = aVar.x();
                    if (x2 == c0012a) {
                        x2 = new tb4(21);
                        aVar.R(x2);
                    }
                    com.vk.core.compose.component.semantics.a a2 = com.vk.core.compose.component.semantics.b.a(mode, (izs) x2, 2);
                    boolean J = aVar.J(wh50Var2) | aVar.J(izsVar);
                    Object x3 = aVar.x();
                    if (J || x3 == c0012a) {
                        x3 = new np5(8, izsVar, wh50Var2);
                        aVar.R(x3);
                    }
                    ybo0 a3 = g8s.e.a.a(tho0Var, (izs) x3, null, inputSelect$State, 4, 4, z4, rgyVar, null, null, a2, aVar, 113467392, 24576, 7684);
                    boolean J2 = aVar.J(j) | aVar.J(izsVar);
                    Object x4 = aVar.x();
                    if (J2 || x4 == c0012a) {
                        x4 = new qt5(8, j, izsVar);
                        aVar.R(x4);
                    }
                    izs izsVar2 = (izs) x4;
                    Object x5 = aVar.x();
                    if (x5 == c0012a) {
                        x5 = new vt1(22);
                        aVar.R(x5);
                    }
                    nvu0.a(a3, d, null, null, f8s.a.b(j, izsVar2, com.vk.core.compose.component.semantics.b.a(mode, (izs) x5, 2), aVar, 2), aVar, 0, 12);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            default:
                PlaylistButtonsStyle playlistButtonsStyle = (PlaylistButtonsStyle) obj7;
                lg90 lg90Var = (lg90) obj6;
                String str = (String) obj5;
                String str2 = (String) obj4;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1839699225, intValue2, -1, "com.vk.video.playlist.playlistscreen.ui.view.PlaylistButtonWithIcon.<anonymous> (PlaylistButtonWithIcon.kt:55)");
                    }
                    float f = 4;
                    q630 H = s200.H(q630.a.a, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
                    a.l lVar = androidx.compose.foundation.layout.a.a;
                    hr80.z().getClass();
                    op8.h();
                    a.j g = androidx.compose.foundation.layout.a.g(kqu0.s);
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.k a4 = androidx.compose.foundation.layout.j.a(g, dt1.a.l, aVar2, 48);
                    int hashCode = Long.hashCode(n34.n(aVar2));
                    sy90 D = aVar2.D();
                    q630 c2 = qri.c(aVar2, H);
                    cri.h7.getClass();
                    LayoutNode.a aVar3 = cri.a.b;
                    if (aVar2.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar2.H();
                    if (aVar2.L()) {
                        aVar2.I(aVar3);
                    } else {
                        aVar2.f();
                    }
                    k9q0.w(aVar2, a4, cri.a.f);
                    k9q0.w(aVar2, D, cri.a.e);
                    k9q0.w(aVar2, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar2, cri.a.h);
                    k9q0.w(aVar2, c2, cri.a.d);
                    if (playlistButtonsStyle == PlaylistButtonsStyle.Lego) {
                        aVar2.K(847797548);
                        pzu0.b(lg90Var, str, null, 0L, aVar2, 8, 12);
                        aVar2.j();
                    } else {
                        aVar2.K(847957136);
                        pzu0.b(lg90Var, str, null, s7g.a(R.color.vk_white, aVar2), aVar2, 8, 4);
                        aVar2.j();
                    }
                    if (str2.length() > 0) {
                        aVar2.K(848202408);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        yqv0.c(str2, null, ylu0Var.getText().e, null, null, 0, 0, null, 0, false, 0, 0, null, null, aVar2, 0, 0, 16378);
                    } else {
                        aVar2.K(845220549);
                    }
                    aVar2.j();
                    aVar2.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
        }
    }
}
