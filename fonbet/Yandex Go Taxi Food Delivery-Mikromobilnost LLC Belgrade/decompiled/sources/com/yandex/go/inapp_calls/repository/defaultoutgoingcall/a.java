package com.yandex.go.inapp_calls.repository.defaultoutgoingcall;

import com.yandex.go.inapp_calls.experiment.InAppCallExperiment;
import defpackage.ngh;
import defpackage.ny61;
import defpackage.pgh;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar, pgh pghVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DefaultOutgoingCallTypeSettingsInteractorImpl$defaultOutgoingCallTypeUiStateFlow_delegate$lambda$0$$inlined$map$1$2$1 defaultOutgoingCallTypeSettingsInteractorImpl$defaultOutgoingCallTypeUiStateFlow_delegate$lambda$0$$inlined$map$1$2$1;
        int i;
        ngh nghVar;
        InAppCallExperiment.RememberMyChoice.SettingCardItem settingCardItem;
        Map b;
        InAppCallExperiment.RememberMyChoice.SettingCardItem settingCardItem2;
        Map b2;
        InAppCallExperiment.RememberMyChoice.SettingCardItem settingCardItem3;
        Map b3;
        InAppCallExperiment.RememberMyChoice.SettingCardItem settingCardItem4;
        if (continuation instanceof DefaultOutgoingCallTypeSettingsInteractorImpl$defaultOutgoingCallTypeUiStateFlow_delegate$lambda$0$$inlined$map$1$2$1) {
            defaultOutgoingCallTypeSettingsInteractorImpl$defaultOutgoingCallTypeUiStateFlow_delegate$lambda$0$$inlined$map$1$2$1 = (DefaultOutgoingCallTypeSettingsInteractorImpl$defaultOutgoingCallTypeUiStateFlow_delegate$lambda$0$$inlined$map$1$2$1) continuation;
            int i2 = defaultOutgoingCallTypeSettingsInteractorImpl$defaultOutgoingCallTypeUiStateFlow_delegate$lambda$0$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                defaultOutgoingCallTypeSettingsInteractorImpl$defaultOutgoingCallTypeUiStateFlow_delegate$lambda$0$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = defaultOutgoingCallTypeSettingsInteractorImpl$defaultOutgoingCallTypeUiStateFlow_delegate$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = defaultOutgoingCallTypeSettingsInteractorImpl$defaultOutgoingCallTypeUiStateFlow_delegate$lambda$0$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    InAppCallExperiment inAppCallExperiment = (InAppCallExperiment) obj;
                    boolean z = inAppCallExperiment.b;
                    InAppCallExperiment.RememberMyChoice rememberMyChoice = inAppCallExperiment.o;
                    if (z && rememberMyChoice != null) {
                        String i3 = InAppCallExperiment.i(inAppCallExperiment, (rememberMyChoice == null || (settingCardItem4 = rememberMyChoice.b) == null) ? null : settingCardItem4.getA());
                        if (i3 != null) {
                            String i4 = InAppCallExperiment.i(inAppCallExperiment, (rememberMyChoice == null || (settingCardItem3 = rememberMyChoice.b) == null || (b3 = settingCardItem3.getB()) == null) ? null : (String) b3.get("always_ask"));
                            if (i4 != null) {
                                String i5 = InAppCallExperiment.i(inAppCallExperiment, (rememberMyChoice == null || (settingCardItem2 = rememberMyChoice.b) == null || (b2 = settingCardItem2.getB()) == null) ? null : (String) b2.get("phone"));
                                if (i5 != null) {
                                    String i6 = InAppCallExperiment.i(inAppCallExperiment, (rememberMyChoice == null || (settingCardItem = rememberMyChoice.b) == null || (b = settingCardItem.getB()) == null) ? null : (String) b.get("voip"));
                                    if (i6 != null) {
                                        nghVar = new ngh(i3, i5, i6, i4);
                                        defaultOutgoingCallTypeSettingsInteractorImpl$defaultOutgoingCallTypeUiStateFlow_delegate$lambda$0$$inlined$map$1$2$1.L$0 = null;
                                        defaultOutgoingCallTypeSettingsInteractorImpl$defaultOutgoingCallTypeUiStateFlow_delegate$lambda$0$$inlined$map$1$2$1.L$1 = null;
                                        defaultOutgoingCallTypeSettingsInteractorImpl$defaultOutgoingCallTypeUiStateFlow_delegate$lambda$0$$inlined$map$1$2$1.L$2 = null;
                                        defaultOutgoingCallTypeSettingsInteractorImpl$defaultOutgoingCallTypeUiStateFlow_delegate$lambda$0$$inlined$map$1$2$1.L$3 = null;
                                        defaultOutgoingCallTypeSettingsInteractorImpl$defaultOutgoingCallTypeUiStateFlow_delegate$lambda$0$$inlined$map$1$2$1.label = 1;
                                        if (this.a.emit(nghVar, defaultOutgoingCallTypeSettingsInteractorImpl$defaultOutgoingCallTypeUiStateFlow_delegate$lambda$0$$inlined$map$1$2$1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    nghVar = null;
                    defaultOutgoingCallTypeSettingsInteractorImpl$defaultOutgoingCallTypeUiStateFlow_delegate$lambda$0$$inlined$map$1$2$1.L$0 = null;
                    defaultOutgoingCallTypeSettingsInteractorImpl$defaultOutgoingCallTypeUiStateFlow_delegate$lambda$0$$inlined$map$1$2$1.L$1 = null;
                    defaultOutgoingCallTypeSettingsInteractorImpl$defaultOutgoingCallTypeUiStateFlow_delegate$lambda$0$$inlined$map$1$2$1.L$2 = null;
                    defaultOutgoingCallTypeSettingsInteractorImpl$defaultOutgoingCallTypeUiStateFlow_delegate$lambda$0$$inlined$map$1$2$1.L$3 = null;
                    defaultOutgoingCallTypeSettingsInteractorImpl$defaultOutgoingCallTypeUiStateFlow_delegate$lambda$0$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(nghVar, defaultOutgoingCallTypeSettingsInteractorImpl$defaultOutgoingCallTypeUiStateFlow_delegate$lambda$0$$inlined$map$1$2$1) == coroutineSingletons) {
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
        defaultOutgoingCallTypeSettingsInteractorImpl$defaultOutgoingCallTypeUiStateFlow_delegate$lambda$0$$inlined$map$1$2$1 = new DefaultOutgoingCallTypeSettingsInteractorImpl$defaultOutgoingCallTypeUiStateFlow_delegate$lambda$0$$inlined$map$1$2$1(this, continuation);
        Object obj22 = defaultOutgoingCallTypeSettingsInteractorImpl$defaultOutgoingCallTypeUiStateFlow_delegate$lambda$0$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = defaultOutgoingCallTypeSettingsInteractorImpl$defaultOutgoingCallTypeUiStateFlow_delegate$lambda$0$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
