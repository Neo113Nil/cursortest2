package xsna;

import com.vk.dto.common.Source;
import com.vk.im.engine.models.dialogs.DialogsCounters;
import java.util.concurrent.Callable;

/* compiled from: StorageTriggerHandler.kt */
/* loaded from: classes2.dex */
public final class gil0<V> implements Callable {
    public final /* synthetic */ fil0 b;

    public gil0(fil0 fil0Var) {
        this.b = fil0Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        fil0 fil0Var = this.b;
        return (DialogsCounters) fil0Var.a.J0(fil0Var, new gnm(2, Source.CACHE)).await();
    }
}
