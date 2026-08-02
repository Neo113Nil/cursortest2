package com.yandex.fintechsdk.adapters.flex.sdk.impl.action.handler.delayed;

import defpackage.dw;
import defpackage.n6u;
import defpackage.p85;
import defpackage.tje;
import defpackage.tse;
import defpackage.uph;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/action/handler/delayed/DelayedActionHandler;", "Ldw;", "Luph;", "Lp85;", "Landroidx/fragment/app/FragmentActivity;", "activityProvider", "Ltse;", "coroutineScope", "<init>", "(Lp85;Ltse;)V", "action", "Ln6u;", "context", "Lzy11;", "handle", "(Luph;Ln6u;)V", "Lp85;", "Ltse;", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DelayedActionHandler implements dw {
    private final p85 activityProvider;
    private final tse coroutineScope;

    public DelayedActionHandler(p85 p85Var, tse tseVar) {
        this.activityProvider = p85Var;
        this.coroutineScope = tseVar;
    }

    @Override // defpackage.dw
    public void handle(uph action, n6u context) {
        tje.N(this.coroutineScope, null, null, new DelayedActionHandler$handle$1(action, this, context, null), 3);
    }
}
