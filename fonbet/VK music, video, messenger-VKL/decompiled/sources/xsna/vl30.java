package xsna;

import com.vk.im.engine.models.messages.Msg;
import com.vk.instantjobs.InstantJob;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class vl30 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Msg c;

    public /* synthetic */ vl30(Msg msg, int i) {
        this.b = i;
        this.c = msg;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return xl30.a((xl30) obj, 0, this.c.b, null, null, false, false, null, 149);
            default:
                InstantJob instantJob = (InstantJob) obj;
                return Boolean.valueOf((instantJob instanceof ri30) && ((ri30) instantJob).c == this.c.b);
        }
    }
}
