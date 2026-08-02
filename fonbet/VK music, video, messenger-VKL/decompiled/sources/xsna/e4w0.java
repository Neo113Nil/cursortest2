package xsna;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import xsna.ake0;
import xsna.zje0;

/* compiled from: VkpnsContinuousMessagesReceiver.kt */
/* loaded from: classes5.dex */
public final class e4w0 extends Lambda implements izs<List<? extends eje0>, s3q0> {
    final /* synthetic */ h4w0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4w0(h4w0 h4w0Var) {
        super(1);
        this.this$0 = h4w0Var;
    }

    @Override // xsna.izs
    public final s3q0 invoke(List<? extends eje0> list) {
        List<? extends eje0> list2 = list;
        h4w0 h4w0Var = this.this$0;
        h4w0Var.getClass();
        try {
            h4w0Var.f.c(null);
        } catch (IllegalStateException unused) {
        }
        h4w0 h4w0Var2 = this.this$0;
        h4w0Var2.getClass();
        ake0.a aVar = new ake0.a(list2);
        Iterator<zje0.a> it = h4w0Var2.i.iterator();
        while (it.hasNext()) {
            it.next().a(aVar);
        }
        return s3q0.a;
    }
}
