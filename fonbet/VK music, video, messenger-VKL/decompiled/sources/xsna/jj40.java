package xsna;

import xsna.jbb0;
import xsna.lj40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class jj40 implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ jj40(lj40.a aVar, q630 q630Var, gzs gzsVar, int i) {
        this.c = aVar;
        this.d = q630Var;
        this.e = gzsVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                kj40.b((lj40.a) this.c, (q630) this.d, (gzs) this.e, (androidx.compose.runtime.a) obj, ne7.I(385));
                break;
            default:
                wab0 wab0Var = (wab0) this.c;
                izs<? super vab0, s3q0> izsVar = (izs) this.d;
                mtk0 mtk0Var = (mtk0) this.e;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1100649397, intValue, -1, "com.vk.music.bottomsheets.playlist.redesigned.presentation.PlaylistMenuContentView.ThemedContent.<anonymous> (PlaylistMenuContentView.kt:88)");
                    }
                    wab0Var.i((jbb0.a) mtk0Var.getValue(), izsVar, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ jj40(wab0 wab0Var, izs izsVar, wh50 wh50Var) {
        this.c = wab0Var;
        this.d = izsVar;
        this.e = wh50Var;
    }
}
