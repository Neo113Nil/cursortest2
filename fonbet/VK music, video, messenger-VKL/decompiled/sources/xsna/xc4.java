package xsna;

import xsna.dz40;
import xsna.gfp0;
import xsna.jbb0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class xc4 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ xc4(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                bd4.a((gfp0.a) this.c, (dz40.a) this.d, (izs) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                k4u.a((g2m) this.c, this.d, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(385));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((kh00) this.c).m((lh00) this.d, (izs) this.e, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 3:
                wab0 wab0Var = (wab0) this.c;
                izs<? super vab0, s3q0> izsVar = (izs) this.e;
                mtk0 mtk0Var = (mtk0) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1353457322, intValue, -1, "com.vk.music.bottomsheets.playlist.redesigned.presentation.PlaylistMenuContentView.ThemedContent.<anonymous> (PlaylistMenuContentView.kt:81)");
                    }
                    wab0Var.i((jbb0.a) mtk0Var.getValue(), izsVar, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                gzs gzsVar = (gzs) this.c;
                gzs gzsVar2 = (gzs) this.d;
                q630 q630Var = (q630) this.e;
                ((Integer) obj2).getClass();
                gud0.g(ne7.I(385), (androidx.compose.runtime.a) obj, gzsVar, gzsVar2, q630Var);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ xc4(wab0 wab0Var, izs izsVar, wh50 wh50Var) {
        this.b = 3;
        this.c = wab0Var;
        this.e = izsVar;
        this.d = wh50Var;
    }
}
