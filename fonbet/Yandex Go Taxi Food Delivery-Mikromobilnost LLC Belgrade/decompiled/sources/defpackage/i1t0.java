package defpackage;

import androidx.compose.foundation.gestures.snapping.b;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Ref$FloatRef;

/* loaded from: classes10.dex */
public final /* synthetic */ class i1t0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Ref$FloatRef c;
    public final /* synthetic */ iip0 w;
    public final /* synthetic */ tls x;

    public /* synthetic */ i1t0(float f, Ref$FloatRef ref$FloatRef, iip0 iip0Var, tls tlsVar, int i) {
        this.a = i;
        this.b = f;
        this.c = ref$FloatRef;
        this.w = iip0Var;
        this.x = tlsVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        float f;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        tls tlsVar = this.x;
        iip0 iip0Var = this.w;
        Ref$FloatRef ref$FloatRef = this.c;
        float f2 = this.b;
        xi2 xi2Var = (xi2) obj;
        switch (i) {
            case 0:
                float abs = Math.abs(((Number) xi2Var.e.getValue()).floatValue());
                float abs2 = Math.abs(f2);
                oz40 oz40Var = xi2Var.e;
                if (abs < abs2) {
                    b.c(xi2Var, iip0Var, tlsVar, ((Number) oz40Var.getValue()).floatValue() - ref$FloatRef.element);
                    ref$FloatRef.element = ((Number) oz40Var.getValue()).floatValue();
                    break;
                } else {
                    float d = b.d(((Number) oz40Var.getValue()).floatValue(), f2);
                    b.c(xi2Var, iip0Var, tlsVar, d - ref$FloatRef.element);
                    xi2Var.a();
                    ref$FloatRef.element = d;
                    break;
                }
            default:
                float d2 = b.d(((Number) xi2Var.e.getValue()).floatValue(), f2);
                float f3 = d2 - ref$FloatRef.element;
                try {
                    f = iip0Var.a(f3);
                } catch (CancellationException unused) {
                    xi2Var.a();
                    f = 0.0f;
                }
                tlsVar.invoke(Float.valueOf(f));
                if (Math.abs(f3 - f) > 0.5f || d2 != ((Number) xi2Var.e.getValue()).floatValue()) {
                    xi2Var.a();
                }
                ref$FloatRef.element += f;
                break;
        }
        return zy11Var;
    }
}
