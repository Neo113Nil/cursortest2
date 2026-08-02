package com.yandex.fintechsdk.adapters.flex.sdk.impl.action.handler.delayed;

import defpackage.dw;
import defpackage.fw;
import defpackage.klc;
import defpackage.kr;
import defpackage.p85;
import defpackage.tse;
import defpackage.uph;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\u0012\u0012\u0006\b\u0001\u0012\u00020\t\u0018\u00010\u000bj\u0004\u0018\u0001`\f2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/action/handler/delayed/DelayedActionHandlerModule;", "Lfw;", "Lp85;", "Landroidx/fragment/app/FragmentActivity;", "activityProvider", "Ltse;", "coroutineScope", "<init>", "(Lp85;Ltse;)V", "Lkr;", "action", "Ldw;", "Lflex/actions/factory/handler/AnyActionHandler;", "handler", "(Lkr;)Ldw;", "Lp85;", "Ltse;", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DelayedActionHandlerModule implements fw {
    private final p85 activityProvider;
    private final tse coroutineScope;

    public DelayedActionHandlerModule(p85 p85Var, tse tseVar) {
        this.activityProvider = p85Var;
        this.coroutineScope = tseVar;
    }

    @Override // defpackage.fw
    public dw handler(kr action) {
        if (action instanceof uph) {
            return new DelayedActionHandler(this.activityProvider, this.coroutineScope);
        }
        return null;
    }

    @Override // defpackage.fw
    public dw handler(kr krVar, klc klcVar) {
        return handler(krVar);
    }
}
