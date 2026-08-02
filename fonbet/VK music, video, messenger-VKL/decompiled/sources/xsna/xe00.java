package xsna;

import com.vk.voip.ui.actions.menu.features.MainMenuBroadcastFeature;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ycw0;

/* compiled from: MainMenuBroadcastFeature.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class xe00 extends FunctionReferenceImpl implements izs<ycw0.d, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(ycw0.d dVar) {
        ycw0.d dVar2 = dVar;
        MainMenuBroadcastFeature mainMenuBroadcastFeature = (MainMenuBroadcastFeature) this.receiver;
        wj8 a = mainMenuBroadcastFeature.a();
        ipm0 ipm0Var = a.c;
        boolean z = ipm0Var.b;
        boolean z2 = dVar2.b;
        boolean z3 = dVar2.a;
        boolean z4 = dVar2.e;
        boolean z5 = dVar2.c;
        if (z != z2 || ipm0Var.c != z5 || ipm0Var.a != z4 || ipm0Var.d != z3) {
            mainMenuBroadcastFeature.d(wj8.a(a, null, null, new ipm0(z4, z2, z5, z3), null, null, 27));
        }
        return s3q0.a;
    }
}
