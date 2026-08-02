package xsna;

import androidx.compose.runtime.a;
import xsna.a4b0;
import xsna.czf;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class azf implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ azf(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                String str = (String) this.c;
                yc8 yc8Var = (yc8) this.d;
                etv0 etv0Var = (etv0) obj;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1092904737, intValue, -1, "com.vk.newsfeed.posting.impl.presentation.base.view.steps.CoauthorsPickerEntryPointCell.<anonymous> (CoauthorsPickerEntryPointCell.kt:55)");
                }
                boolean y = aVar.y(yc8Var) | aVar.y(etv0Var);
                Object x = aVar.x();
                if (y || x == a.C0011a.a) {
                    x = new czf.a(yc8Var, etv0Var, null);
                    aVar.R(x);
                }
                bap.g(str, (wzs) x, aVar, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                break;
            case 1:
                g48 g48Var = (g48) this.c;
                izs izsVar = (izs) this.d;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1880288909, intValue2, -1, "com.vk.friends.groupinvite.impl.ui.InviteFriendsBottomBar.<anonymous> (InviteFriendsMviViewExt.kt:74)");
                }
                if (g48Var != null) {
                    arx arxVar = g48Var.b;
                    xrx xrxVar = g48Var.a;
                    boolean J = aVar2.J(g48Var) | aVar2.J(izsVar);
                    Object x2 = aVar2.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (J || x2 == c0012a) {
                        x2 = new pw(g48Var, izsVar);
                        aVar2.R(x2);
                    }
                    gzs gzsVar = (gzs) x2;
                    boolean J2 = aVar2.J(izsVar);
                    Object x3 = aVar2.x();
                    if (J2 || x3 == c0012a) {
                        x3 = new oe1(izsVar, 4);
                        aVar2.R(x3);
                    }
                    xqx.a(xrxVar, arxVar, gzsVar, null, (gzs) x3, aVar2, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    break;
                } else {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    break;
                }
            default:
                sg50 sg50Var = (sg50) this.c;
                i0k0 i0k0Var = (i0k0) this.d;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1614857151, intValue3, -1, "com.vk.music.bottomsheets.playermenu.PlayerSettingsMviView.VolumeRow.<anonymous>.<anonymous> (PlayerSettingsMviView.kt:458)");
                    }
                    float f = 2;
                    m0k0.a.a(sg50Var, kci.l(q630.a.a, f, f), i0k0Var, false, a4b0.b.b, aVar3, 221238, 8);
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
