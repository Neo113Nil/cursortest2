package xsna;

import com.ironsource.C4671z8;
import com.vk.dto.stories.model.web.StoryBoxPrepared;
import com.vk.voip.ui.VoipViewModelState;
import kotlin.NoWhenBranchMatchedException;
import xsna.fxw0;
import xsna.tww0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class gqw0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gqw0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object d;
        switch (this.b) {
            case 0:
                hqw0 hqw0Var = (hqw0) this.c;
                VoipViewModelState voipViewModelState = (VoipViewModelState) obj;
                if (hqw0Var.b) {
                    if (!voipViewModelState.i()) {
                        hqw0Var.b = false;
                    } else if (voipViewModelState != VoipViewModelState.ReceivingCallFromPeer) {
                        hqw0Var.b = false;
                        hqw0Var.a.invoke();
                    }
                }
                return s3q0.a;
            case 1:
                fxw0.a aVar = (fxw0.a) obj;
                tww0.i iVar = (tww0.i) ((tww0) this.c);
                if (iVar instanceof tww0.i.a) {
                    return fxw0.a.a(aVar, null, null, 0L, 0L, null, null, null, null, false, false, false, false, false, null, null, null, null, false, null, null, false, false, 33538047);
                }
                if (iVar instanceof tww0.i.b) {
                    return fxw0.a.a(aVar, null, null, 0L, 0L, null, null, null, null, false, false, false, true, false, null, null, null, null, false, null, null, false, false, 33538047);
                }
                throw new NoWhenBranchMatchedException();
            case 2:
                int i = 10;
                iok0.y0(qfx0.d, new lyb0(i, (StoryBoxPrepared) obj, (zhx0) this.c));
                return s3q0.a;
            default:
                d = ((com.ironsource.sdk.controller.v) this.c).d((C4671z8) obj);
                return d;
        }
    }

    public /* synthetic */ gqw0(www0 www0Var, tww0 tww0Var) {
        this.b = 1;
        this.c = tww0Var;
    }
}
