package xsna;

import com.unity3d.services.UnityAdsConstants;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class no0 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ no0(int i, int i2, Object obj, Object obj2, boolean z) {
        this.b = i2;
        this.d = obj;
        this.c = z;
        this.e = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                izs izsVar = (izs) this.d;
                wh50 wh50Var = (wh50) this.e;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1284219157, intValue, -1, "com.vk.music.stickyplayer.presentation.components.AddToMyMusicButton.<anonymous> (AddToMyMusicButton.kt:67)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j = ylu0Var.getBackground().m;
                    boolean booleanValue = ((Boolean) wh50Var.getValue()).booleanValue();
                    Boolean bool = (Boolean) wh50Var.getValue();
                    bool.getClass();
                    nk2.d(j, booleanValue, txj0.k(txj0.p(s200.H(q630.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, 20, 3), 48), 60), this.c, Integer.valueOf(((Number) izsVar.invoke(bool)).intValue()), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                m6b0.a((v5b0) this.d, this.c, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(391));
                break;
            default:
                ((Integer) obj2).getClass();
                ((jgt0) this.d).b(this.c, (gzs) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ no0(izs izsVar, wh50 wh50Var, boolean z) {
        this.b = 0;
        this.d = izsVar;
        this.c = z;
        this.e = wh50Var;
    }
}
