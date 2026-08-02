package com.yandex.quark.webchat.dialogcontext;

import defpackage.h10;
import defpackage.i10;
import defpackage.jaa1;
import defpackage.jl40;
import defpackage.jyj0;
import defpackage.k10;
import defpackage.lyj0;
import defpackage.mc41;
import defpackage.nc41;
import defpackage.ny61;
import defpackage.oc41;
import defpackage.odj;
import defpackage.pc41;
import defpackage.puf0;
import defpackage.suf0;
import defpackage.syj0;
import defpackage.tuf0;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zwf0;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.alice.protos.data.dialog_state.quark.webchat.TDialogState;
import ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatCapability;

/* loaded from: classes2.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ zwf0 b;

    public a(vpr vprVar, k10 k10Var, zwf0 zwf0Var) {
        this.a = vprVar;
        this.b = zwf0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ActiveChatDialogContextProvider$special$$inlined$map$1$2$1 activeChatDialogContextProvider$special$$inlined$map$1$2$1;
        int i;
        TDialogState activeChatDialogContext;
        syj0 jyj0Var;
        if (continuation instanceof ActiveChatDialogContextProvider$special$$inlined$map$1$2$1) {
            activeChatDialogContextProvider$special$$inlined$map$1$2$1 = (ActiveChatDialogContextProvider$special$$inlined$map$1$2$1) continuation;
            int i2 = activeChatDialogContextProvider$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                activeChatDialogContextProvider$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = activeChatDialogContextProvider$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activeChatDialogContextProvider$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    b.b(obj2);
                    pc41 pc41Var = (pc41) obj;
                    boolean z = pc41Var instanceof oc41;
                    zwf0 zwf0Var = this.b;
                    Object obj3 = i10.a;
                    if (z) {
                        TAliceChatCapability.TState state = ((TAliceChatCapability) ((oc41) pc41Var).a).getState();
                        if (state == null || (activeChatDialogContext = state.getActiveChatDialogContext()) == null) {
                            zwf0Var.info("ActiveChatDialogContextProvider", "No dialog context in capability state");
                        } else {
                            syj0 a = jaa1.a(ru.yandex.alice.protos.data.dialog_state.platform.utils.TDialogState.ADAPTER, activeChatDialogContext.encode());
                            if (a instanceof lyj0) {
                                jyj0Var = new lyj0(new suf0((ru.yandex.alice.protos.data.dialog_state.platform.utils.TDialogState) ((lyj0) a).a));
                            } else {
                                if (!(a instanceof jyj0)) {
                                    w511.b();
                                    return null;
                                }
                                jyj0Var = new jyj0(new tuf0(((puf0) ((jyj0) a).a).a));
                            }
                            if (jyj0Var instanceof lyj0) {
                                obj3 = new h10((odj) ((lyj0) jyj0Var).a);
                            } else {
                                if (!(jyj0Var instanceof jyj0)) {
                                    w511.b();
                                    return null;
                                }
                                zwf0Var.f("ActiveChatDialogContextProvider", "Failed to get dialog context: ".concat(((tuf0) ((jyj0) jyj0Var).a).a));
                            }
                        }
                    } else if (pc41Var instanceof mc41) {
                        zwf0Var.f("ActiveChatDialogContextProvider", "Failed to get dialog context: " + ((mc41) pc41Var).a);
                    } else if (!jl40.l(pc41Var, nc41.a)) {
                        w511.b();
                        return null;
                    }
                    activeChatDialogContextProvider$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(obj3, activeChatDialogContextProvider$special$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj2);
                }
                return zy11.a;
            }
        }
        activeChatDialogContextProvider$special$$inlined$map$1$2$1 = new ActiveChatDialogContextProvider$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = activeChatDialogContextProvider$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activeChatDialogContextProvider$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
