package xsna;

import com.vk.donut.video.api.di.DonutVideoComponent;
import com.vk.voip.calls.join.api.di.VoipCallsJoinRouterComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class lia implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ g8m c;

    public /* synthetic */ lia(g8m g8mVar, int i) {
        this.b = i;
        this.c = g8mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return (DonutVideoComponent) this.c.a(fpf0.a(DonutVideoComponent.class));
            default:
                return (VoipCallsJoinRouterComponent) this.c.a(fpf0.a(VoipCallsJoinRouterComponent.class));
        }
    }
}
