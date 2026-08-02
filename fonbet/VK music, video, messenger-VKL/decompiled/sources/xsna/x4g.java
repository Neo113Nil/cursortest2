package xsna;

import com.vk.log.L;
import java.util.Iterator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class x4g implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ x4g(Object obj, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                y4g y4gVar = (y4g) this.d;
                String str = (String) obj;
                L.LogType logType = L.LogType.w;
                Iterator it = y4gVar.b.iterator();
                while (it.hasNext()) {
                    ((u000) it.next()).b(logType, "Thread Debug", str, this.c);
                }
                break;
            case 1:
                nxb0 nxb0Var = (nxb0) this.d;
                nyb0 nyb0Var = nxb0Var.b;
                nyb0Var.a.getClass();
                nxb0Var.b(nyb0.a(nyb0Var, new zp2(this.c, false), null, false, 2));
                break;
            default:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.h(tgi0Var, (String) this.d);
                qgi0.o(tgi0Var, this.c);
                break;
        }
        return s3q0.a;
    }
}
