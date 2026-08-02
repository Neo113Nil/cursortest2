package com.yandex.go.inapp_calls.repository.defaultoutgoingcall;

import defpackage.ngh;
import defpackage.ny61;
import defpackage.pgh;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class d implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ pgh b;
    public final /* synthetic */ ngh c;

    public d(r0 r0Var, pgh pghVar, ngh nghVar) {
        this.a = r0Var;
        this.b = pghVar;
        this.c = nghVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        DefaultOutgoingCallTypeSettingsInteractorImpl$defaultOutgoingCallTypeUiStateFlow_delegate$lambda$0$1$$inlined$map$1$1 defaultOutgoingCallTypeSettingsInteractorImpl$defaultOutgoingCallTypeUiStateFlow_delegate$lambda$0$1$$inlined$map$1$1;
        int i;
        if (continuation instanceof DefaultOutgoingCallTypeSettingsInteractorImpl$defaultOutgoingCallTypeUiStateFlow_delegate$lambda$0$1$$inlined$map$1$1) {
            defaultOutgoingCallTypeSettingsInteractorImpl$defaultOutgoingCallTypeUiStateFlow_delegate$lambda$0$1$$inlined$map$1$1 = (DefaultOutgoingCallTypeSettingsInteractorImpl$defaultOutgoingCallTypeUiStateFlow_delegate$lambda$0$1$$inlined$map$1$1) continuation;
            int i2 = defaultOutgoingCallTypeSettingsInteractorImpl$defaultOutgoingCallTypeUiStateFlow_delegate$lambda$0$1$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                defaultOutgoingCallTypeSettingsInteractorImpl$defaultOutgoingCallTypeUiStateFlow_delegate$lambda$0$1$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = defaultOutgoingCallTypeSettingsInteractorImpl$defaultOutgoingCallTypeUiStateFlow_delegate$lambda$0$1$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = defaultOutgoingCallTypeSettingsInteractorImpl$defaultOutgoingCallTypeUiStateFlow_delegate$lambda$0$1$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = new c(vprVar, this.b, this.c);
                    defaultOutgoingCallTypeSettingsInteractorImpl$defaultOutgoingCallTypeUiStateFlow_delegate$lambda$0$1$$inlined$map$1$1.L$0 = null;
                    defaultOutgoingCallTypeSettingsInteractorImpl$defaultOutgoingCallTypeUiStateFlow_delegate$lambda$0$1$$inlined$map$1$1.L$1 = null;
                    defaultOutgoingCallTypeSettingsInteractorImpl$defaultOutgoingCallTypeUiStateFlow_delegate$lambda$0$1$$inlined$map$1$1.L$2 = null;
                    defaultOutgoingCallTypeSettingsInteractorImpl$defaultOutgoingCallTypeUiStateFlow_delegate$lambda$0$1$$inlined$map$1$1.label = 1;
                    if (this.a.collect(cVar, defaultOutgoingCallTypeSettingsInteractorImpl$defaultOutgoingCallTypeUiStateFlow_delegate$lambda$0$1$$inlined$map$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        defaultOutgoingCallTypeSettingsInteractorImpl$defaultOutgoingCallTypeUiStateFlow_delegate$lambda$0$1$$inlined$map$1$1 = new DefaultOutgoingCallTypeSettingsInteractorImpl$defaultOutgoingCallTypeUiStateFlow_delegate$lambda$0$1$$inlined$map$1$1(this, continuation);
        Object obj2 = defaultOutgoingCallTypeSettingsInteractorImpl$defaultOutgoingCallTypeUiStateFlow_delegate$lambda$0$1$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = defaultOutgoingCallTypeSettingsInteractorImpl$defaultOutgoingCallTypeUiStateFlow_delegate$lambda$0$1$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
