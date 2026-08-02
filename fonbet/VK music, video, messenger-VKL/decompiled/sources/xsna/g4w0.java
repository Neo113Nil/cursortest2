package xsna;

import java.util.List;
import kotlin.jvm.internal.Lambda;

/* compiled from: VkpnsContinuousMessagesReceiver.kt */
/* loaded from: classes5.dex */
public final class g4w0 extends Lambda implements izs<List<? extends eje0>, s3q0> {
    final /* synthetic */ izs<List<eje0>, s3q0> $onDone;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g4w0(izs<? super List<eje0>, s3q0> izsVar) {
        super(1);
        this.$onDone = izsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final s3q0 invoke(List<? extends eje0> list) {
        this.$onDone.invoke(list);
        return s3q0.a;
    }
}
