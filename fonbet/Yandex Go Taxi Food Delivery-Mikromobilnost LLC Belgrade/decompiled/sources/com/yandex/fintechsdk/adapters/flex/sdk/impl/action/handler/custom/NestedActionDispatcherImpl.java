package com.yandex.fintechsdk.adapters.flex.sdk.impl.action.handler.custom;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.action.NestedActionImpl;
import defpackage.pxl;
import defpackage.vm50;
import defpackage.wm50;
import defpackage.wu;
import kotlin.Metadata;
import kotlin.collections.b;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/action/handler/custom/NestedActionDispatcherImpl;", "Lwm50;", "Lwu;", "flexActionDispatcher", "Lpxl;", "context", "<init>", "(Lwu;Lpxl;)V", "Lvm50;", "action", "Lzy11;", "dispatch", "(Lvm50;)V", "Lwu;", "Lpxl;", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class NestedActionDispatcherImpl implements wm50 {
    private final pxl context;
    private final wu flexActionDispatcher;

    public NestedActionDispatcherImpl(wu wuVar, pxl pxlVar) {
        this.flexActionDispatcher = wuVar;
        this.context = pxlVar;
    }

    @Override // defpackage.wm50
    public void dispatch(vm50 action) {
        this.flexActionDispatcher.b(((NestedActionImpl) action).getNestedAction(), this.context, b.f());
    }
}
