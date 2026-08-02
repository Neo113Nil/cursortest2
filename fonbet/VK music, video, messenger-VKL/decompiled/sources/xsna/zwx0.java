package xsna;

import com.vk.push.core.base.AsyncCallback;
import com.vk.push.core.work.WorkModel;
import com.vk.push.core.work.WorkRegistrator;
import kotlin.jvm.internal.Lambda;

/* compiled from: WorkRegistratorIPCClient.kt */
/* loaded from: classes5.dex */
public final class zwx0 extends Lambda implements wzs<WorkRegistrator, AsyncCallback, s3q0> {
    final /* synthetic */ WorkModel $workModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zwx0(WorkModel workModel) {
        super(2);
        this.$workModel = workModel;
    }

    @Override // xsna.wzs
    public final s3q0 invoke(WorkRegistrator workRegistrator, AsyncCallback asyncCallback) {
        workRegistrator.registerWork(this.$workModel, asyncCallback);
        return s3q0.a;
    }
}
