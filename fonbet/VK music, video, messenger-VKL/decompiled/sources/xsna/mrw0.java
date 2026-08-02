package xsna;

import com.vk.core.fragments.FragmentImpl;
import com.vk.voip.ui.actions.menu.features.MainMenuBroadcastFeature;
import xsna.duw0;
import xsna.tj50;
import xsna.tww0;
import xsna.z0x0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class mrw0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mrw0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((nrw0) this.c).K.c(MainMenuBroadcastFeature.Option.ASR_RECORD);
                return s3q0.a;
            case 1:
                return new duw0.b(((tj50.a) obj).a(new ztw0(1, (auw0) this.c, auw0.class, "composeContent", "composeContent(Lcom/vk/voip/ui/settings/participant/presentation/feature/VoipParticipantSettingsState;)Lcom/vk/voip/ui/settings/participant/presentation/ui/state/VoipParticipantSettingsViewState$Content;", 0), ao8.d));
            case 2:
                ((pww0) this.c).T(new tww0.k.a((Throwable) obj));
                return s3q0.a;
            case 3:
                u6x0 u6x0Var = (u6x0) obj;
                return ((w0x0) this.c).k ? new z0x0.c.b(String.valueOf(u6x0Var.b.size()), u6x0Var.b, u6x0Var.c) : new z0x0.c.b((String) u6x0Var.a, u6x0Var.b, u6x0Var.c);
            default:
                co0 co0Var = (co0) this.c;
                nr4.b().z(new jbs((FragmentImpl) obj), new do0(co0Var.a, co0Var.c, co0Var.b, co0Var.d, co0Var.e));
                return s3q0.a;
        }
    }
}
