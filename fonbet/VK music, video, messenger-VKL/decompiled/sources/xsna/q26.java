package xsna;

import java.text.DecimalFormat;
import xsna.dt1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class q26 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ wh50 c;

    public /* synthetic */ q26(int i, wh50 wh50Var) {
        this.b = i;
        this.c = wh50Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        wh50 wh50Var = this.c;
        switch (i) {
            case 0:
                wh50Var.setValue(Boolean.valueOf(!((Boolean) wh50Var.getValue()).booleanValue()));
                return s3q0.a;
            case 1:
                wh50Var.setValue(Boolean.valueOf(!((Boolean) wh50Var.getValue()).booleanValue()));
                return s3q0.a;
            case 2:
                dt1.a.getClass();
                wh50Var.setValue(dt1.a.i);
                return s3q0.a;
            default:
                float f = com.vk.core.compose.component.defaults.f.a;
                int intValue = ((Number) wh50Var.getValue()).intValue();
                DecimalFormat decimalFormat = com.vk.core.compose.component.defaults.f.g;
                long j = intValue;
                if (j >= 1000000000) {
                    return decimalFormat.format(intValue / 1.0E9d) + 'B';
                }
                if (j >= 1000000) {
                    return decimalFormat.format(intValue / 1000000.0d) + 'M';
                }
                if (j < 1000) {
                    return l6g.a(intValue, "");
                }
                return decimalFormat.format(intValue / 1000.0d) + 'K';
        }
    }
}
