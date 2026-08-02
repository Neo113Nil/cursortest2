package xsna;

import androidx.compose.runtime.a;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class sab0 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ sab0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                us2 us2Var = (us2) this.c;
                tab0 tab0Var = (tab0) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1053251321, intValue, -1, "com.vk.music.playlist.framework.presentation.screen.PlaylistListContent.summaryItems.<anonymous> (PlaylistListContent.kt:50)");
                    }
                    q630 E = ahn.E(q630.a.a, "playlistDescriptionBlock");
                    boolean J = aVar.J(tab0Var);
                    Object x = aVar.x();
                    if (J || x == a.C0011a.a) {
                        x = new fa00(tab0Var, 16);
                        aVar.R(x);
                    }
                    h8q.a(us2Var, E, (izs) x, aVar, 48);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 1:
                u4i0 u4i0Var = (u4i0) this.c;
                wh50 wh50Var = (wh50) this.d;
                y4i0 y4i0Var = (y4i0) obj;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= aVar2.J(y4i0Var) ? 4 : 2;
                }
                if (aVar2.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1057988421, intValue2, -1, "com.vk.design.demo.presentation.screens.SegmentControlContent.ComposeContent.<anonymous>.<anonymous> (SegmentControlContent.kt:136)");
                    }
                    int intValue3 = ((Number) wh50Var.getValue()).intValue();
                    int intValue4 = ((Number) ((zak0) u4i0Var.d).getValue()).intValue();
                    Object x2 = aVar2.x();
                    if (x2 == a.C0011a.a) {
                        x2 = new y840(1, wh50Var);
                        aVar2.R(x2);
                    }
                    u4i0Var.d(y4i0Var, intValue3, intValue4, x2, aVar2, (intValue2 & 14) | 3072);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            default:
                sg50 sg50Var = (sg50) this.c;
                fqh0 fqh0Var = (fqh0) this.d;
                wzs wzsVar = (wzs) obj;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= aVar3.y(wzsVar) ? 4 : 2;
                }
                if (aVar3.t(intValue5 & 1, (intValue5 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1898835946, intValue5, -1, "com.vk.core.compose.component.VkSearchTextField.<anonymous> (VkSearchTextField.kt:133)");
                    }
                    jiv0.b(sg50Var, wzsVar, fqh0Var, aVar3, (intValue5 << 3) & 112);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
        }
        return s3q0.a;
    }
}
