package xsna;

import com.vk.voip.ui.scheduled.callslist.VoipScheduledCallsFragment;
import xsna.v7h0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class tyw0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ tyw0(int i, Object obj, Object obj2) {
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
                int i2 = VoipScheduledCallsFragment.c0;
                ((VoipScheduledCallsFragment) obj3).fo((v7h0.d) obj, (VoipScheduledCallsFragment.b) obj2);
                break;
            default:
                ((n6w0) obj3).l.a(((o6w0) obj2).b);
                break;
        }
        return s3q0.a;
    }
}
