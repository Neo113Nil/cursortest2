package xsna;

import android.app.Activity;
import com.vk.core.tips.Tooltip;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class h4p0 implements izs {
    public final /* synthetic */ Tooltip b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ com.vk.core.tips.c d;
    public final /* synthetic */ Tooltip.g e;
    public final /* synthetic */ dq2 f;
    public final /* synthetic */ g4p0 g;

    public /* synthetic */ h4p0(Tooltip tooltip, Activity activity, com.vk.core.tips.c cVar, Tooltip.g gVar, dq2 dq2Var, g4p0 g4p0Var) {
        this.b = tooltip;
        this.c = activity;
        this.d = cVar;
        this.e = gVar;
        this.f = dq2Var;
        this.g = g4p0Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int intValue = ((Integer) obj).intValue();
        Tooltip tooltip = this.b;
        if (tooltip.l == 2) {
            tooltip.l = 3;
            if (!this.c.isDestroyed()) {
                tooltip.o(this.d, this.e, this.f.a(), new q7v(this.g, intValue, 1));
            }
        }
        return s3q0.a;
    }
}
