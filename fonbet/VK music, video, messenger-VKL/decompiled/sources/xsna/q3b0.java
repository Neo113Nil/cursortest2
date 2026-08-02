package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import xsna.jhk0;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class q3b0 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q3b0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                a4b0 a4b0Var = (a4b0) this.c;
                i0k0 i0k0Var = (i0k0) this.d;
                g1k0 g1k0Var = (g1k0) obj;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= (intValue & 8) == 0 ? aVar.J(g1k0Var) : aVar.y(g1k0Var) ? 4 : 2;
                }
                boolean z = false;
                if (aVar.t(intValue & 1, (intValue & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-2099802400, intValue, -1, "com.vk.music.bottomsheets.playermenu.PlayerSettingsMviView.VolumeRow.<anonymous>.<anonymous> (PlayerSettingsMviView.kt:466)");
                    }
                    int i = intValue & 14;
                    boolean y = aVar.y(a4b0Var) | (i == 4 || ((intValue & 8) != 0 && aVar.y(g1k0Var)));
                    Object x = aVar.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (y || x == c0012a) {
                        x = new ye80(a4b0Var, g1k0Var);
                        aVar.R(x);
                    }
                    gzs gzsVar = (gzs) x;
                    if (i == 4 || ((intValue & 8) != 0 && aVar.y(g1k0Var))) {
                        z = true;
                    }
                    boolean y2 = aVar.y(a4b0Var) | z;
                    Object x2 = aVar.x();
                    if (y2 || x2 == c0012a) {
                        x2 = new cty(a4b0Var, g1k0Var);
                        aVar.R(x2);
                    }
                    a4b0Var.p(gzsVar, (gzs) x2, i0k0Var, null, aVar, 32768);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            default:
                jhk0 jhk0Var = (jhk0) this.c;
                yjl yjlVar = (yjl) this.d;
                jj jjVar = (jj) obj;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= aVar2.J(jjVar) ? 4 : 2;
                }
                int i2 = intValue2;
                if (aVar2.t(i2 & 1, (i2 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(344761887, i2, -1, "com.vk.design.demo.presentation.screens.SpacingAndSeparatorScreenContent.Content.<anonymous>.<anonymous> (SpacingAndSeparatorScreenContent.kt:119)");
                    }
                    int i3 = 0;
                    for (Object obj4 : jhk0Var.b) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            e43.t();
                            throw null;
                        }
                        final jhk0.a aVar3 = (jhk0.a) obj4;
                        boolean z2 = yjlVar.k() == i3;
                        boolean J = aVar2.J(yjlVar) | aVar2.o(i3);
                        Object x3 = aVar2.x();
                        if (J || x3 == a.C0011a.a) {
                            x3 = new oif(yjlVar, i3, 1);
                            aVar2.R(x3);
                        }
                        jjVar.b(z2, (gzs) x3, kai.c(1980168261, new zzs() { // from class: xsna.ghk0
                            @Override // xsna.zzs
                            public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                                jj jjVar2 = (jj) obj5;
                                ((Boolean) obj6).getClass();
                                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj7;
                                int intValue3 = ((Integer) obj8).intValue();
                                if ((intValue3 & 6) == 0) {
                                    intValue3 |= aVar4.J(jjVar2) ? 4 : 2;
                                }
                                if (aVar4.t(intValue3 & 1, (intValue3 & Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE) != 130)) {
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(1980168261, intValue3, -1, "com.vk.design.demo.presentation.screens.SpacingAndSeparatorScreenContent.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SpacingAndSeparatorScreenContent.kt:126)");
                                    }
                                    String str = jhk0.a.this.a;
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                                    }
                                    wuv0 wuv0Var = (wuv0) aVar4.r(rrv0.c);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                    jjVar2.d(str, wuv0Var.P, aVar4, (intValue3 << 6) & 896);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                } else {
                                    aVar4.h();
                                }
                                return s3q0.a;
                            }
                        }, aVar2), s200.F(8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630.a.a), aVar2, ((i2 << 12) & 57344) | 3456, 0);
                        i3 = i4;
                    }
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
