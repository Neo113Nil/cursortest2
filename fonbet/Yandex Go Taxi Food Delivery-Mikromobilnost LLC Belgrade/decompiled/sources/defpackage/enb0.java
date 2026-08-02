package defpackage;

import androidx.compose.runtime.internal.a;
import com.yandex.go.pickup_from_photo.navigation.b;

/* loaded from: classes13.dex */
public final /* synthetic */ class enb0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ enb0(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        b bVar = this.b;
        switch (i) {
            case 0:
                yfd yfdVar = (yfd) obj;
                ww90 ww90Var = new ww90(20, bVar, new oy80(bVar, (dnb0) ((agd) yfdVar).a, false, 12));
                agd agdVar = (agd) yfdVar;
                agdVar.e = ww90Var;
                agdVar.c = bVar.H.a();
                fpb1.e(yfdVar, new t9b0(5, bVar));
                agdVar.g = new a(426152015, new alb0(19, bVar), true);
                break;
            default:
                int intValue = ((Integer) obj).intValue();
                if (bVar.u()) {
                    tnb0 tnb0Var = bVar.R;
                    tnb0Var.a.Td(intValue, tnb0Var);
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
