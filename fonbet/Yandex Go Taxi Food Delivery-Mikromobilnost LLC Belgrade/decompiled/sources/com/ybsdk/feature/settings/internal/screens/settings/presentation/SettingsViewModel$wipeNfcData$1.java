package com.ybsdk.feature.settings.internal.screens.settings.presentation;

import com.ybsdk.core.utils.text.Text;
import defpackage.dzh0;
import defpackage.mvg;
import defpackage.n0t0;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.ter0;
import defpackage.tse;
import defpackage.v4r0;
import defpackage.wdr0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.settings.internal.screens.settings.presentation.SettingsViewModel$wipeNfcData$1", f = "SettingsViewModel.kt", l = {371}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SettingsViewModel$wipeNfcData$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsViewModel$wipeNfcData$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SettingsViewModel$wipeNfcData$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SettingsViewModel$wipeNfcData$1 settingsViewModel$wipeNfcData$1 = (SettingsViewModel$wipeNfcData$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        settingsViewModel$wipeNfcData$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        wdr0 wdr0Var;
        r0 r0Var2;
        Object value2;
        wdr0 wdr0Var2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            pz40 Y = this.this$0.Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
                wdr0Var = (wdr0) value;
            } while (!r0Var.k(value, wdr0.a(wdr0Var, null, v4r0.i(wdr0Var.b, "nfc_wipe_sdk"), null, null, false, null, null, null, null, false, 4093)));
            this.this$0.getClass();
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            Object value3 = ((Result) obj).getValue();
            a aVar = this.this$0;
            if (!(value3 instanceof Result.Failure)) {
                pz40 Y2 = aVar.Y();
                do {
                    r0Var2 = (r0) Y2;
                    value2 = r0Var2.getValue();
                    wdr0Var2 = (wdr0) value2;
                } while (!r0Var2.k(value2, wdr0.a(wdr0Var2, null, v4r0.f(wdr0Var2.b, "nfc_wipe_sdk"), null, null, false, null, null, null, null, false, 4093)));
                aVar.Z(new ter0(new n0t0(new Text.Resource(dzh0.ybsdk_settings_wipe_nfc_success_snackbar), Text.Empty.INSTANCE)));
            }
        }
        return zy11.a;
    }
}
