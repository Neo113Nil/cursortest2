package defpackage;

import androidx.compose.foundation.lazy.b;

/* loaded from: classes14.dex */
public final /* synthetic */ class k0v implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k0v(Object obj, float f, int i) {
        this.a = i;
        this.c = obj;
        this.b = f;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        float f = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                b bVar = (b) obj;
                return Boolean.valueOf(bVar.h() > 0 || ((float) bVar.i()) > f);
            case 1:
                wg6 wg6Var = (wg6) obj;
                return Float.valueOf((-wg6Var.h.getFloatValue()) > f ? rfb1.e(wg6Var) : 0.0f);
            case 2:
                float floatValue = ((Number) ((m3u0) obj).getValue()).floatValue();
                if (f < 1.0f) {
                    f = 1.0f;
                }
                return Float.valueOf(y6i0.c(floatValue / f, 0.0f, 1.0f));
            case 3:
                int intValue = ((oip0) obj).e.getIntValue();
                if (intValue != 0 && intValue != Integer.MAX_VALUE) {
                    r2 = y6i0.c((intValue - r5.a.getIntValue()) / f, 0.0f, 1.0f);
                }
                return Float.valueOf(r2);
            default:
                ((tls) obj).invoke(Integer.valueOf((int) f));
                return zy11.a;
        }
    }
}
