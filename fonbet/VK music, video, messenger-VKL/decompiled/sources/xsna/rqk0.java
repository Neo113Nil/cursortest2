package xsna;

import android.content.Context;
import android.content.Intent;
import com.vk.push.common.Logger;
import kotlin.jvm.internal.Lambda;

/* compiled from: StartPushServiceUseCase.kt */
/* loaded from: classes5.dex */
public final class rqk0 extends Lambda implements gzs<s3q0> {
    final /* synthetic */ Context $this_safeStartBackgroundService;
    final /* synthetic */ pqk0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rqk0(pqk0 pqk0Var, Context context) {
        super(0);
        this.this$0 = pqk0Var;
        this.$this_safeStartBackgroundService = context;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        pqk0 pqk0Var = this.this$0;
        Context context = this.$this_safeStartBackgroundService;
        Intent intent = pqk0Var.b;
        Logger logger = pqk0Var.e;
        try {
            context.startService(intent);
        } catch (IllegalStateException e) {
            logger.error("Unable to start push service", e);
        } catch (RuntimeException e2) {
            logger.error("Unable to start push service", e2);
        }
        return s3q0.a;
    }
}
