package defpackage;

import com.yandex.go.payments.common.a;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class ahv0 implements w9a0 {
    public final wiq0 a;
    public final a b;

    public ahv0(wiq0 wiq0Var, a aVar) {
        this.a = wiq0Var;
        this.b = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        if (r2 == null) goto L17;
     */
    @Override // defpackage.w9a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(u0k u0kVar, Continuation continuation) {
        pex0 m;
        Double d;
        fef fefVar;
        BigDecimal bigDecimal = null;
        if ((u0kVar instanceof u19) && (m = ((k) this.a).m()) != null) {
            u19 u19Var = (u19) u0kVar;
            String str = u19Var.a;
            if (str == null) {
                qze0 qze0Var = m.m;
                str = (qze0Var == null || (fefVar = qze0Var.c) == null) ? null : fefVar.b;
            }
            if (!m.u) {
                if (m.K0) {
                    List list = m.U;
                    if (list != null) {
                        Iterator it = list.iterator();
                        if (!it.hasNext()) {
                            ny61.p();
                            return null;
                        }
                        Double d2 = ((pex0) it.next()).d();
                        double doubleValue = d2 != null ? d2.doubleValue() : 0.0d;
                        while (it.hasNext()) {
                            Double d3 = ((pex0) it.next()).d();
                            doubleValue = Math.max(doubleValue, d3 != null ? d3.doubleValue() : 0.0d);
                        }
                        d = Double.valueOf(doubleValue);
                    } else {
                        d = null;
                    }
                } else {
                    d = m.d();
                }
                if (d != null) {
                    bigDecimal = new BigDecimal(String.valueOf(d.doubleValue()));
                }
            }
            return this.b.b(u19Var, bigDecimal, str, (ContinuationImpl) continuation);
        }
        return null;
    }
}
