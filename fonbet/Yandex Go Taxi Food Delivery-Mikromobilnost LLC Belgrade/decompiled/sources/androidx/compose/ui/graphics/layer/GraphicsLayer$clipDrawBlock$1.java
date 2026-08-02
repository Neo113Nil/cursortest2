package androidx.compose.ui.graphics.layer;

import defpackage.b64;
import defpackage.cot;
import defpackage.nfh;
import defpackage.qam;
import defpackage.rq90;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqam;", "Lzy11;", "invoke", "(Lqam;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
/* loaded from: classes.dex */
final class GraphicsLayer$clipDrawBlock$1 extends Lambda implements tls {
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphicsLayer$clipDrawBlock$1(a aVar) {
        super(1);
        this.this$0 = aVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        qam qamVar = (qam) obj;
        a aVar = this.this$0;
        rq90 rq90Var = aVar.l;
        if (aVar.n && aVar.w && rq90Var != null) {
            nfh N = qamVar.N();
            long v = N.v();
            N.q().save();
            try {
                ((cot) N.a).e(rq90Var);
                aVar.d(qamVar);
            } finally {
                b64.C(N, v);
            }
        } else {
            aVar.d(qamVar);
        }
        return zy11.a;
    }
}
