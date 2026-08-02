package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import xsna.chs;
import xsna.phw;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class wai implements a0t {
    public final /* synthetic */ int b;

    public /* synthetic */ wai(int i) {
        this.b = i;
    }

    @Override // xsna.a0t
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        switch (this.b) {
            case 0:
                chs chsVar = (chs) obj2;
                lg90 lg90Var = (lg90) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj4;
                int intValue = ((Integer) obj5).intValue();
                if ((intValue & 48) == 0) {
                    i = (aVar.J(chsVar) ? 32 : 16) | intValue;
                } else {
                    i = intValue;
                }
                if ((intValue & 384) == 0) {
                    i |= (intValue & 512) == 0 ? aVar.J(lg90Var) : aVar.y(lg90Var) ? 256 : 128;
                }
                if (aVar.t(i & 1, (i & 1169) != 1168)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-358308798, i, -1, "com.vk.music.bottomsheets.artistlist.presentation.ComposableSingletons$ArtistListViewKt.lambda$-358308798.<anonymous> (ArtistListView.kt:143)");
                    }
                    if ((chsVar instanceof chs.b) || (chsVar instanceof chs.a)) {
                        aVar.K(-737366835);
                        xr3.c(0, 1, aVar, null);
                        aVar.j();
                    } else if (chsVar instanceof chs.c) {
                        aVar.K(-737364913);
                        xr3.d(0, 1, aVar, null);
                        aVar.j();
                    } else {
                        aVar.K(-737363541);
                        ldu0.b(phw.a.a(lg90Var, null, null, null, null, aVar, 196616 | ((i >> 6) & 14), 30), 48, null, null, null, false, null, null, null, aVar, 48, IronSourceError.ERROR_CODE_INIT_FAILED);
                        aVar.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            default:
                return e43.l((it80) obj, (it80) obj5, (it80) obj2, (it80) obj3, (it80) obj4);
        }
    }
}
