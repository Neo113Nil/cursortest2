package xsna;

import com.vk.push.core.base.AsyncCallback;
import com.vk.push.core.work.WorkRegistrator;
import kotlin.jvm.internal.Lambda;

/* compiled from: WorkRegistratorIPCClient.kt */
/* loaded from: classes5.dex */
public final class wwx0 extends Lambda implements wzs<WorkRegistrator, AsyncCallback, s3q0> {
    final /* synthetic */ String $workName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wwx0(String str) {
        super(2);
        this.$workName = str;
    }

    @Override // xsna.wzs
    public final s3q0 invoke(WorkRegistrator workRegistrator, AsyncCallback asyncCallback) {
        workRegistrator.cancelWork(this.$workName, asyncCallback);
        return s3q0.a;
    }
}
