package xsna;

import com.vk.voip.OKVoipEngine;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.VoipViewModelState;
import kotlin.collections.EmptyList;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import xsna.nhw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class tgl implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b = 1;

    public /* synthetic */ tgl() {
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                s3q0 s3q0Var = s3q0.a;
                break;
            default:
                if (!(obj instanceof fjw0)) {
                    if (obj instanceof jrw0) {
                        com.vk.voip.ui.c cVar = com.vk.voip.ui.c.b;
                        ((jrw0) obj).getClass();
                        cVar.getClass();
                        com.vk.voip.ui.c.H().getClass();
                        break;
                    }
                } else {
                    fjw0 fjw0Var = (fjw0) obj;
                    com.vk.voip.ui.c.b.getClass();
                    com.vk.voip.ui.c.H().h(fjw0Var.a, fjw0Var.b, com.vk.voip.ui.c.R);
                    if (fjw0Var.a != VoipViewModelState.Idle) {
                        if (com.vk.voip.ui.c.h == null) {
                            nhw0 nhw0Var = new nhw0();
                            nhw0Var.a = EmptyList.b;
                            com.vk.voip.ui.c.h = nhw0Var;
                        }
                        CallMemberId a = com.vk.voip.ui.c.r.a();
                        OKVoipEngine.b.getClass();
                        ConversationParticipant C = OKVoipEngine.C();
                        ParticipantId externalId = C != null ? C.getExternalId() : null;
                        com.vk.voip.ui.c.z(fjw0Var.a, null, com.vk.voip.ui.c.O, new nhw0.a(a, externalId != null ? mnh0.E(externalId) : null));
                        break;
                    } else {
                        com.vk.voip.ui.c.h = null;
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ tgl(k60 k60Var) {
    }
}
