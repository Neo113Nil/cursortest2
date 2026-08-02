package xsna;

import android.app.Activity;
import com.vk.core.tips.Tooltip;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class r4p0 implements izs {
    public final /* synthetic */ Tooltip b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ com.vk.core.tips.c d;
    public final /* synthetic */ Tooltip.g e;
    public final /* synthetic */ dq2 f;
    public final /* synthetic */ p4p0 g;

    public /* synthetic */ r4p0(Tooltip tooltip, Activity activity, com.vk.core.tips.c cVar, Tooltip.g gVar, dq2 dq2Var, p4p0 p4p0Var) {
        this.b = tooltip;
        this.c = activity;
        this.d = cVar;
        this.e = gVar;
        this.f = dq2Var;
        this.g = p4p0Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        final int intValue = ((Integer) obj).intValue();
        Tooltip tooltip = this.b;
        if (tooltip.l == 2) {
            tooltip.l = 3;
            if (!this.c.isDestroyed()) {
                dq2 a = this.f.a();
                final p4p0 p4p0Var = this.g;
                tooltip.o(this.d, this.e, a, new gzs() { // from class: xsna.u4p0
                    @Override // xsna.gzs
                    public final Object invoke() {
                        p4p0.this.invoke(Integer.valueOf(intValue));
                        return s3q0.a;
                    }
                });
            }
        }
        return s3q0.a;
    }
}
