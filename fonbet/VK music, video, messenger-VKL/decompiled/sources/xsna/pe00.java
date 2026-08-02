package xsna;

import com.vk.voip.ui.actions.menu.features.MainMenuBroadcastFeature;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ycw0;

/* compiled from: MainMenuBroadcastFeature.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class pe00 extends FunctionReferenceImpl implements izs<ycw0.b, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(ycw0.b bVar) {
        ycw0.b bVar2 = bVar;
        MainMenuBroadcastFeature mainMenuBroadcastFeature = (MainMenuBroadcastFeature) this.receiver;
        wj8 a = mainMenuBroadcastFeature.a();
        sw3 sw3Var = a.e;
        boolean z = sw3Var.a;
        boolean z2 = bVar2.a;
        boolean z3 = bVar2.c;
        boolean z4 = bVar2.b;
        if (z != z2 || sw3Var.b != z4 || sw3Var.c != z3) {
            mainMenuBroadcastFeature.d(wj8.a(a, null, null, null, null, new sw3(z2, z4, z3), 15));
        }
        return s3q0.a;
    }
}
