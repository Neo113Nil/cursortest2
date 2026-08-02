package xsna;

import android.content.Context;
import android.content.ServiceConnection;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: AnalyticsEventProvider.kt */
/* loaded from: classes9.dex */
public final class vx1 extends Lambda implements gzs<s3q0> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Ref$ObjectRef<ServiceConnection> $serviceConnection;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vx1(Context context, Ref$ObjectRef<ServiceConnection> ref$ObjectRef) {
        super(0);
        this.$context = context;
        this.$serviceConnection = ref$ObjectRef;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        inj.b(this.$context, this.$serviceConnection.element);
        return s3q0.a;
    }
}
