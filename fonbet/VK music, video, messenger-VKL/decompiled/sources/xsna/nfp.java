package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.vk.clips.viewer.impl.feed.wrapper.ui.topbar.RedesignedClipsTopBar;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class nfp implements yzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ nfp(boolean z, String str) {
        this.c = z;
        this.d = str;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j;
        int i = this.b;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                gzs gzsVar = (gzs) obj4;
                va8 va8Var = (va8) obj;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= aVar.J(va8Var) ? 4 : 2;
                }
                if (aVar.t(intValue & 1, (intValue & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1322793715, intValue, -1, "com.vk.profile.user.impl.ui.edit.mvi.view.main.settings.photo.cover.EmptyCover.<anonymous> (EmptyCover.kt:33)");
                    }
                    float j1 = ((azl) aVar.r(uvi.h)).j1((int) (wa8.a(va8Var) & 4294967295L));
                    dt1.a.getClass();
                    q630 h = txj0.h(txj0.f(va8Var.b(q630.a.a, dt1.a.c), 1.0f), j1 - (vq5.a / 2));
                    cp10 d = ja8.d(dt1.a.f, false);
                    int hashCode = Long.hashCode(n34.n(aVar));
                    sy90 D = aVar.D();
                    q630 c = qri.c(aVar, h);
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
                    k9q0.w(aVar, d, cri.a.f);
                    k9q0.w(aVar, D, cri.a.e);
                    k9q0.w(aVar, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar, cri.a.h);
                    k9q0.w(aVar, c, cri.a.d);
                    String N = d370.N(R.string.user_profile_edit_actions_load_cover, 0, aVar);
                    ButtonSize buttonSize = ButtonSize.Medium;
                    ButtonStyle buttonStyle = ButtonStyle.Tertiary;
                    ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                    qzu0.a.getClass();
                    bhu0.e(gzsVar, buttonSize, buttonStyle, buttonAppearance, null, null, false, false, qzu0.Z0(aVar), null, null, N, null, null, null, null, this.c, null, null, null, aVar, 1073745328, 0, 0, 4058608);
                    aVar.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            default:
                String str = (String) obj4;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                int i2 = RedesignedClipsTopBar.N;
                if (aVar3.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1293511410, intValue2, -1, "com.vk.clips.viewer.impl.feed.wrapper.ui.topbar.RedesignedClipsTopBar.ClipTab.<anonymous> (RedesignedClipsTopBar.kt:186)");
                    }
                    if (this.c) {
                        aVar3.K(551981052);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar3.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        j = ylu0Var.getText().c;
                        aVar3.j();
                    } else {
                        aVar3.K(552070332);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var2 = (ylu0) aVar3.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        j = ylu0Var2.getText().n;
                        aVar3.j();
                    }
                    long j2 = j;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) aVar3.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yqv0.c(str, q630.a.a, j2, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var.q, aVar3, 48, 0, 8184);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ nfp(boolean z, gzs gzsVar) {
        this.d = gzsVar;
        this.c = z;
    }
}
