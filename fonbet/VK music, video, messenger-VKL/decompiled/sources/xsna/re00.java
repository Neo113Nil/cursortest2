package xsna;

import com.vk.voip.ui.actions.menu.features.MainMenuBroadcastFeature;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ycw0;

/* compiled from: MainMenuBroadcastFeature.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class re00 extends FunctionReferenceImpl implements izs<ycw0.r, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(ycw0.r rVar) {
        ycw0.r rVar2 = rVar;
        MainMenuBroadcastFeature mainMenuBroadcastFeature = (MainMenuBroadcastFeature) this.receiver;
        wj8 a = mainMenuBroadcastFeature.a();
        mhf0 mhf0Var = a.b;
        boolean z = mhf0Var.a;
        boolean z2 = rVar2.b;
        boolean z3 = rVar2.d;
        boolean z4 = rVar2.a;
        boolean z5 = rVar2.c;
        if (z != z2 || mhf0Var.b != z5 || mhf0Var.d != z4 || mhf0Var.c != z3) {
            mainMenuBroadcastFeature.d(wj8.a(a, null, new mhf0(z2, z5, z3, z4), null, null, null, 29));
        }
        return s3q0.a;
    }
}
