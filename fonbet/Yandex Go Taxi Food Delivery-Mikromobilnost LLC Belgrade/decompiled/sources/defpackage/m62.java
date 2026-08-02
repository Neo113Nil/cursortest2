package defpackage;

import androidx.compose.foundation.gestures.FlingCancellationException;
import androidx.compose.foundation.gestures.d;
import androidx.compose.foundation.gestures.e;
import androidx.compose.foundation.gestures.y;
import androidx.compose.material3.w;

/* loaded from: classes10.dex */
public final class m62 implements iip0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m62(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.iip0
    public final float a(float f) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                d dVar = (d) obj2;
                float f2 = dVar.O.f(f);
                float floatValue = f2 - dVar.O.j.getFloatValue();
                ((o62) obj).a(f2, 0.0f);
                return floatValue;
            case 1:
                y yVar = (y) obj2;
                if (Math.abs(f) == 0.0f || ((Boolean) yVar.h.invoke()).booleanValue()) {
                    return yVar.d(yVar.g(((clp0) obj).a(2, yVar.e(yVar.h(f)))));
                }
                throw new FlingCancellationException();
            default:
                w wVar = (w) obj2;
                e eVar = wVar.e;
                e eVar2 = wVar.e;
                float c = y6i0.c((Float.isNaN(eVar.j.getFloatValue()) ? 0.0f : eVar2.j.getFloatValue()) + f, eVar.d().e(), eVar.d().d());
                float floatValue2 = c - eVar2.j.getFloatValue();
                ((o62) obj).a(c, 0.0f);
                return floatValue2;
        }
    }
}
