package defpackage;

import com.yandex.payment.sdk.flex.impl.b;
import flex.engine.a;
import java.lang.ref.WeakReference;
import kotlin.Pair;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

/* loaded from: classes2.dex */
public final class nzu0 implements icp0 {
    public final /* synthetic */ ozu0 a;

    public nzu0(ozu0 ozu0Var) {
        this.a = ozu0Var;
    }

    @Override // defpackage.icp0
    public final boolean a(hja1 hja1Var) {
        a aVar;
        ahr ahrVar = this.a.b;
        if (ahrVar != null) {
            if (hja1Var.equals(jui0.a)) {
                return ((b) ahrVar).g();
            }
            if (hja1Var.equals(jui0.b)) {
                b bVar = (b) ahrVar;
                try {
                    WeakReference weakReference = (WeakReference) kotlin.collections.a.b0(bVar.e);
                    if (weakReference != null && (aVar = (a) weakReference.get()) != null) {
                        xxl xxlVar = a.s0;
                        aVar.w(false);
                    }
                    return true;
                } catch (Exception e) {
                    bhr bhrVar = bVar.f;
                    if (bhrVar == null) {
                        bhrVar = null;
                    }
                    lir lirVar = bhrVar.e;
                    Pair pair = new Pair("issue", "document_reload_failed");
                    String message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    lirVar.a(new kir("transport_flex_health_issue", kotlin.collections.b.i(pair, new Pair(CRLReasonCodeExtension.REASON, message))));
                    return false;
                }
            }
            w511.b();
        }
        return false;
    }
}
