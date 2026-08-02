package xsna;

import com.unity3d.services.UnityAdsConstants;
import xsna.ebt;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class vk00 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ vk00(int i, Object obj, Object obj2, Object obj3, izs izsVar) {
        this.b = i;
        this.d = obj;
        this.e = obj2;
        this.c = izsVar;
        this.f = obj3;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                ebt ebtVar = (ebt) this.d;
                rha rhaVar = (rha) this.e;
                xvy xvyVar = (xvy) this.f;
                ksy ksyVar = (ksy) obj;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= aVar.J(ksyVar) ? 4 : 2;
                }
                if (aVar.t(intValue & 1, (intValue & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1055197488, intValue, -1, "com.vk.games.presentation.components.MapDetailItemsToView.<anonymous> (MapDetailItemsToView.kt:97)");
                    }
                    ebt.h hVar = (ebt.h) ebtVar;
                    hgt.a(hVar.a, rhaVar, this.c, xvyVar, s200.H(ksy.c(ksyVar, q630.a.a, 7), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, hVar.b ? 0 : 4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                bga bgaVar = (bga) this.d;
                zdb0 zdb0Var = (zdb0) this.e;
                ksr ksrVar = (ksr) this.f;
                s890 s890Var = (s890) obj;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= aVar2.J(s890Var) ? 4 : 2;
                }
                if (aVar2.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1547451502, intValue2, -1, "com.vk.video.playlist.playlistscreen.ui.view.PlaylistScreenView.<anonymous>.<anonymous> (PlaylistScreenView.kt:93)");
                    }
                    gdb0.b(bgaVar, zdb0Var, this.c, ksrVar, s200.C(q630.a.a, s890Var), aVar2, 0);
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
