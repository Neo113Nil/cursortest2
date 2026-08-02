package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.stories.design.view.stickerbutton.ReactionStickerButton;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class qc50 implements zzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qc50(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        long j;
        int i2 = this.b;
        Object obj5 = this.c;
        switch (i2) {
            case 0:
                sb50 sb50Var = (sb50) obj5;
                q630 q630Var = (q630) obj2;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
                int intValue = ((Integer) obj4).intValue();
                if ((intValue & 48) == 0) {
                    intValue |= aVar.J(q630Var) ? 32 : 16;
                }
                if (aVar.t(intValue & 1, (intValue & 145) != 144)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1252904024, intValue, -1, "com.vk.music.bottomsheets.track.redesigned.presentation.components.MusicTrackMenuHeader.<anonymous>.<anonymous> (MusicTrackMenuHeader.kt:65)");
                    }
                    q630 q = txj0.q(q630Var, 48);
                    Object x = aVar.x();
                    if (x == a.C0011a.a) {
                        x = new gvs(15);
                        aVar.R(x);
                    }
                    bc50.a(sb50Var.a, egi0.b(q, false, (izs) x), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar, 0, 12);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                v5v v5vVar = (v5v) obj5;
                izs izsVar = (izs) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                int i3 = ReactionStickerButton.c;
                if ((intValue2 & 6) == 0) {
                    i = (aVar2.y(izsVar) ? 4 : 2) | intValue2;
                } else {
                    i = intValue2;
                }
                if ((48 & intValue2) == 0) {
                    i |= aVar2.l(booleanValue) ? 32 : 16;
                }
                if (aVar2.t(i & 1, (i & 147) != 146)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-816060689, i, -1, "com.vk.stories.design.view.stickerbutton.ReactionStickerButton.setupHighlight.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ReactionStickerButton.kt:85)");
                    }
                    String str = v5vVar.a;
                    if (booleanValue) {
                        aVar2.K(-1748902963);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        j = ylu0Var.getText().e;
                        aVar2.j();
                    } else {
                        aVar2.K(-1748796013);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var2 = (ylu0) aVar2.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        j = ylu0Var2.getText().d;
                        aVar2.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) aVar2.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yqv0.c(str, null, j, null, null, 0, 0, null, 0, false, 0, 0, izsVar, wuv0Var.s.b(aVar2), aVar2, 0, (i << 6) & 896, 4090);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
        }
        return s3q0.a;
    }
}
