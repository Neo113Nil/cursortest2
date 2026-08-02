package xsna;

import com.vk.push.core.base.AsyncCallback;
import com.vk.push.core.work.WorkExecutor;
import com.vk.push.core.work.WorkModel;
import kotlin.jvm.internal.Lambda;

/* compiled from: WorkExecutorIPCClient.kt */
/* loaded from: classes5.dex */
public final class lvx0 extends Lambda implements wzs<WorkExecutor, AsyncCallback, s3q0> {
    final /* synthetic */ WorkModel $workModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lvx0(WorkModel workModel) {
        super(2);
        this.$workModel = workModel;
    }

    @Override // xsna.wzs
    public final s3q0 invoke(WorkExecutor workExecutor, AsyncCallback asyncCallback) {
        workExecutor.executeWork(this.$workModel, asyncCallback);
        return s3q0.a;
    }
}
