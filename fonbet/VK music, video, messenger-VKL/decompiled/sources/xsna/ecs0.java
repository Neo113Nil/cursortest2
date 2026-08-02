package xsna;

import com.vk.voip.ui.call_by_link.ui.VoipCallByLinkFragment;
import com.vk.voip.ui.call_by_link.ui.VoipCallByLinkViewState;
import xsna.gm50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class ecs0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ecs0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((gcs0) obj3).Q8((String) obj2);
                break;
            default:
                VoipCallByLinkFragment.a aVar = (VoipCallByLinkFragment.a) obj3;
                VoipCallByLinkFragment voipCallByLinkFragment = (VoipCallByLinkFragment) obj2;
                VoipCallByLinkViewState.a aVar2 = (VoipCallByLinkViewState.a) obj;
                int i2 = VoipCallByLinkFragment.T;
                gm50.a.a(voipCallByLinkFragment, aVar2.a, new qjl0(aVar.a, 21));
                gm50.a.a(voipCallByLinkFragment, aVar2.b, new vcw0(aVar.b, 1));
                break;
        }
        return s3q0.a;
    }
}
