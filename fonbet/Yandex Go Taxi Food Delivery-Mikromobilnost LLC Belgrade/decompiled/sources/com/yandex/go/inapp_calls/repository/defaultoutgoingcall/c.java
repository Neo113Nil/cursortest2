package com.yandex.go.inapp_calls.repository.defaultoutgoingcall;

import com.yandex.go.inapp_calls.api.defaultoutgoingcall.DefaultOutgoingCallType;
import defpackage.a8h;
import defpackage.ngh;
import defpackage.ny61;
import defpackage.ogh;
import defpackage.pgh;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ pgh b;
    public final /* synthetic */ ngh c;

    public c(vpr vprVar, pgh pghVar, ngh nghVar) {
        this.a = vprVar;
        this.b = pghVar;
        this.c = nghVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DefaultOutgoingCallTypeSettingsInteractorImpl$defaultOutgoingCallTypeUiStateFlow_delegate$lambda$0$1$$inlined$map$1$2$1 defaultOutgoingCallTypeSettingsInteractorImpl$defaultOutgoingCallTypeUiStateFlow_delegate$lambda$0$1$$inlined$map$1$2$1;
        int i;
        String str;
        if (continuation instanceof DefaultOutgoingCallTypeSettingsInteractorImpl$defaultOutgoingCallTypeUiStateFlow_delegate$lambda$0$1$$inlined$map$1$2$1) {
            defaultOutgoingCallTypeSettingsInteractorImpl$defaultOutgoingCallTypeUiStateFlow_delegate$lambda$0$1$$inlined$map$1$2$1 = (DefaultOutgoingCallTypeSettingsInteractorImpl$defaultOutgoingCallTypeUiStateFlow_delegate$lambda$0$1$$inlined$map$1$2$1) continuation;
            int i2 = defaultOutgoingCallTypeSettingsInteractorImpl$defaultOutgoingCallTypeUiStateFlow_delegate$lambda$0$1$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                defaultOutgoingCallTypeSettingsInteractorImpl$defaultOutgoingCallTypeUiStateFlow_delegate$lambda$0$1$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = defaultOutgoingCallTypeSettingsInteractorImpl$defaultOutgoingCallTypeUiStateFlow_delegate$lambda$0$1$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = defaultOutgoingCallTypeSettingsInteractorImpl$defaultOutgoingCallTypeUiStateFlow_delegate$lambda$0$1$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    this.b.getClass();
                    int i3 = ogh.a[((DefaultOutgoingCallType) obj).ordinal()];
                    ngh nghVar = this.c;
                    if (i3 == 1) {
                        str = nghVar.c;
                    } else if (i3 == 2) {
                        str = nghVar.b;
                    } else {
                        if (i3 != 3) {
                            w511.b();
                            return null;
                        }
                        str = nghVar.d;
                    }
                    a8h a8hVar = new a8h(nghVar.a, str);
                    defaultOutgoingCallTypeSettingsInteractorImpl$defaultOutgoingCallTypeUiStateFlow_delegate$lambda$0$1$$inlined$map$1$2$1.L$0 = null;
                    defaultOutgoingCallTypeSettingsInteractorImpl$defaultOutgoingCallTypeUiStateFlow_delegate$lambda$0$1$$inlined$map$1$2$1.L$1 = null;
                    defaultOutgoingCallTypeSettingsInteractorImpl$defaultOutgoingCallTypeUiStateFlow_delegate$lambda$0$1$$inlined$map$1$2$1.L$2 = null;
                    defaultOutgoingCallTypeSettingsInteractorImpl$defaultOutgoingCallTypeUiStateFlow_delegate$lambda$0$1$$inlined$map$1$2$1.L$3 = null;
                    defaultOutgoingCallTypeSettingsInteractorImpl$defaultOutgoingCallTypeUiStateFlow_delegate$lambda$0$1$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(a8hVar, defaultOutgoingCallTypeSettingsInteractorImpl$defaultOutgoingCallTypeUiStateFlow_delegate$lambda$0$1$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        defaultOutgoingCallTypeSettingsInteractorImpl$defaultOutgoingCallTypeUiStateFlow_delegate$lambda$0$1$$inlined$map$1$2$1 = new DefaultOutgoingCallTypeSettingsInteractorImpl$defaultOutgoingCallTypeUiStateFlow_delegate$lambda$0$1$$inlined$map$1$2$1(this, continuation);
        Object obj22 = defaultOutgoingCallTypeSettingsInteractorImpl$defaultOutgoingCallTypeUiStateFlow_delegate$lambda$0$1$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = defaultOutgoingCallTypeSettingsInteractorImpl$defaultOutgoingCallTypeUiStateFlow_delegate$lambda$0$1$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
