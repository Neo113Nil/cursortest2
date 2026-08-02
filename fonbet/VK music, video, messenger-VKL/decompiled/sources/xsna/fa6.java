package xsna;

import com.vk.voip.OKVoipEngine;
import com.vk.voip.ui.VoipViewModelState;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: BaseChannelLinkHandler.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class fa6 extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fa6(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ((e1b) this.receiver).g();
                return s3q0.a;
            case 1:
                pid.a((pid) this.receiver);
                return s3q0.a;
            case 2:
                ((kut) this.receiver).j();
                return s3q0.a;
            case 3:
                ((g3a) this.receiver).d();
                return s3q0.a;
            case 4:
                ((bp70) this.receiver).U0();
                return s3q0.a;
            case 5:
                gzs<s3q0> gzsVar = ((hpb0) this.receiver).M;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            default:
                ((com.vk.voip.ui.actions.feature.b) this.receiver).getClass();
                com.vk.voip.ui.c cVar = com.vk.voip.ui.c.b;
                cVar.getClass();
                boolean z = false;
                if (com.vk.voip.ui.c.K0 == VoipViewModelState.InCall || com.vk.voip.ui.c.K0 == VoipViewModelState.CallingPeer) {
                    dhw0 L = cVar.L();
                    if (L != null ? L.H : false) {
                        OKVoipEngine oKVoipEngine = OKVoipEngine.b;
                        if (oKVoipEngine.isMeCreatorOrAdmin() && oKVoipEngine.isGroupCall()) {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fa6(Object obj) {
        super(0, obj, bp70.class, "loadAndFallbackToAnotherVerificationMethod", "loadAndFallbackToAnotherVerificationMethod()V", 0);
        this.b = 4;
    }
}
