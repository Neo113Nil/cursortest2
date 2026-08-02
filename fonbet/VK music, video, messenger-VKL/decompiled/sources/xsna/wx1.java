package xsna;

import android.content.Context;
import android.content.ServiceConnection;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.rustore.sdk.core.exception.RuStoreException;

/* compiled from: AnalyticsEventProvider.kt */
/* loaded from: classes9.dex */
public final class wx1 extends Lambda implements izs<RuStoreException, s3q0> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Ref$ObjectRef<ServiceConnection> $serviceConnection;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wx1(Context context, Ref$ObjectRef<ServiceConnection> ref$ObjectRef) {
        super(1);
        this.$context = context;
        this.$serviceConnection = ref$ObjectRef;
    }

    @Override // xsna.izs
    public final s3q0 invoke(RuStoreException ruStoreException) {
        inj.b(this.$context, this.$serviceConnection.element);
        return s3q0.a;
    }
}
