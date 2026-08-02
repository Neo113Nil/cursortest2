package xsna;

import com.vk.dto.common.id.UserId;
import kotlin.NoWhenBranchMatchedException;
import xsna.fis;
import xsna.wml0;
import xsna.x7j0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class x8j0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ x8j0(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        gqx iqxVar;
        switch (this.b) {
            case 0:
                this.c.invoke(x7j0.l.b);
                return s3q0.a;
            case 1:
                this.c.invoke(new wml0.e((String) obj));
                return s3q0.a;
            default:
                fis fisVar = (fis) obj;
                if (fisVar instanceof fis.a) {
                    jis jisVar = ((fis.a) fisVar).a;
                    boolean z = jisVar.e;
                    UserId userId = jisVar.a;
                    iqxVar = z ? new hqx(userId) : new jqx(userId);
                } else {
                    if (!(fisVar instanceof fis.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jis jisVar2 = ((fis.b) fisVar).a;
                    iqxVar = new iqx(jisVar2.a, jisVar2.c, jisVar2.b);
                }
                this.c.invoke(iqxVar);
                return s3q0.a;
        }
    }
}
