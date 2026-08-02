package xsna;

import com.vk.log.L;
import java.util.concurrent.CancellationException;
import xsna.dug0;
import xsna.ltv;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class jtv implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ jtv(int i, ktv ktvVar) {
        this.c = i;
        this.d = ktvVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ktv ktvVar = (ktv) this.d;
                StringBuilder sb = new StringBuilder("ideas: prepare failed for index=");
                int i = this.c;
                sb.append(i);
                L.C(sb.toString(), (Throwable) obj);
                ktvVar.T(new ltv.b(i));
                return s3q0.a;
            default:
                dug0.c cVar = (dug0.c) obj;
                if (((com.vk.ml.b) this.d).f.get() == this.c) {
                    return cVar;
                }
                throw new CancellationException();
        }
    }

    public /* synthetic */ jtv(com.vk.ml.b bVar, int i) {
        this.d = bVar;
        this.c = i;
    }
}
