package xsna;

import androidx.compose.runtime.a;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class umo implements yzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ izs c;
    public final /* synthetic */ Object d;

    public /* synthetic */ umo(izs izsVar, mtk0 mtk0Var) {
        this.c = izsVar;
        this.d = mtk0Var;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                s930 s930Var = (s930) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1156096353, intValue, -1, "com.vk.clips.playlists.playlist_ui.ui.PlaylistsDropdownMenu.<anonymous> (DropdownMenu.kt:34)");
                    }
                    androidx.compose.runtime.a aVar2 = aVar;
                    for (vqe vqeVar : s930Var.b) {
                        lqv B = znk0.B(pg90.a(vqeVar.getIcon(), 0, aVar2), vqeVar.j(aVar2), 0L, aVar2, 196616, 28);
                        lzo0 d = nzo.d(3072, 6, aVar2, d370.N(vqeVar.getTitle(), 0, aVar2), false);
                        q630 E = ahn.E(q630.a.a, vqeVar.i());
                        Object obj4 = this.c;
                        boolean J = aVar2.J(obj4) | aVar2.J(vqeVar);
                        Object x = aVar2.x();
                        if (J || x == a.C0011a.a) {
                            x = new dy0(12, obj4, vqeVar);
                            aVar2.R(x);
                        }
                        androidx.compose.runtime.a aVar3 = aVar2;
                        aou0.h((gzs) x, E, false, null, B, d, null, aVar3, 0, 76);
                        aVar2 = aVar3;
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                mtk0 mtk0Var = (mtk0) this.d;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar4.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-622009452, intValue2, -1, "com.vk.music.bottomsheets.equalizer.PlayerEqualizerSettingsMviView.LandscapeOrientationContent.<anonymous>.<anonymous>.<anonymous> (PlayerEqualizerSettingsMviView.kt:206)");
                    }
                    boolean booleanValue = ((Boolean) mtk0Var.getValue()).booleanValue();
                    izs izsVar = this.c;
                    boolean J2 = aVar4.J(izsVar);
                    Object x2 = aVar4.x();
                    if (J2 || x2 == a.C0011a.a) {
                        x2 = new azd(izsVar, 2);
                        aVar4.R(x2);
                    }
                    sup.a(0, aVar4, (izs) x2, null, booleanValue);
                    if (a690.d(q630.a.a, 16, aVar4, 6)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ umo(s930 s930Var, izs izsVar) {
        this.d = s930Var;
        this.c = izsVar;
    }
}
