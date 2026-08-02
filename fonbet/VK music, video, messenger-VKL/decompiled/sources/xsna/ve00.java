package xsna;

import com.vk.voip.ui.actions.menu.features.MainMenuBroadcastFeature;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: MainMenuBroadcastFeature.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class ve00 extends FunctionReferenceImpl implements izs<Boolean, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        MainMenuBroadcastFeature mainMenuBroadcastFeature = (MainMenuBroadcastFeature) this.receiver;
        wj8 a = mainMenuBroadcastFeature.a();
        tah0 tah0Var = a.a;
        if (tah0Var.a != booleanValue) {
            mainMenuBroadcastFeature.d(wj8.a(a, new tah0(booleanValue, tah0Var.b), null, null, null, null, 30));
        }
        return s3q0.a;
    }
}
