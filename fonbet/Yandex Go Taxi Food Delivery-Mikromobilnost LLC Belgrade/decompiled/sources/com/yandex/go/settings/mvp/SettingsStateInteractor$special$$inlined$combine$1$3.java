package com.yandex.go.settings.mvp;

import com.yandex.go.settings.hidephoneinfo.experiments.InAppOnlySettingsToggleExperiment;
import com.yandex.go.user_profile.main_menu.profile.repository.logout.presentation.MainMenuLogOutUiState;
import defpackage.a8h;
import defpackage.d6z;
import defpackage.mvg;
import defpackage.ner0;
import defpackage.ny61;
import defpackage.oer0;
import defpackage.p3g0;
import defpackage.qmp;
import defpackage.r8r0;
import defpackage.vpr;
import defpackage.xdr0;
import defpackage.zdr0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lvpr;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Lkotlin/Array;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.settings.mvp.SettingsStateInteractor$special$$inlined$combine$1$3", f = "SettingsStateInteractor.kt", l = {MSException.ERROR_MORE_DATA}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class SettingsStateInteractor$special$$inlined$combine$1$3 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ xdr0 receiver$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsStateInteractor$special$$inlined$combine$1$3(Continuation continuation, xdr0 xdr0Var) {
        super(3, continuation);
        this.receiver$inlined = xdr0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SettingsStateInteractor$special$$inlined$combine$1$3 settingsStateInteractor$special$$inlined$combine$1$3 = new SettingsStateInteractor$special$$inlined$combine$1$3((Continuation) obj3, this.receiver$inlined);
        settingsStateInteractor$special$$inlined$combine$1$3.L$0 = (vpr) obj;
        settingsStateInteractor$special$$inlined$combine$1$3.L$1 = (Object[]) obj2;
        return settingsStateInteractor$special$$inlined$combine$1$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        Object[] objArr = (Object[]) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            Object obj4 = objArr[2];
            Object obj5 = objArr[3];
            Object obj6 = objArr[4];
            Object obj7 = objArr[5];
            Object obj8 = objArr[6];
            Object obj9 = objArr[7];
            Object obj10 = objArr[8];
            boolean booleanValue = ((Boolean) objArr[9]).booleanValue();
            boolean booleanValue2 = ((Boolean) obj10).booleanValue();
            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
            String str = (String) obj8;
            MainMenuLogOutUiState mainMenuLogOutUiState = (MainMenuLogOutUiState) obj7;
            boolean booleanValue4 = ((Boolean) obj6).booleanValue();
            p3g0 p3g0Var = (p3g0) obj5;
            a8h a8hVar = (a8h) obj4;
            r8r0 r8r0Var = (r8r0) obj3;
            zdr0 zdr0Var = (zdr0) obj2;
            xdr0 xdr0Var = this.receiver$inlined;
            qmp qmpVar = xdr0Var.j;
            InAppOnlySettingsToggleExperiment inAppOnlySettingsToggleExperiment = (InAppOnlySettingsToggleExperiment) xdr0Var.i.a.b();
            String Y = d6z.Y(inAppOnlySettingsToggleExperiment, inAppOnlySettingsToggleExperiment.e);
            boolean z = inAppOnlySettingsToggleExperiment.b && Y.length() > 0 && booleanValue2;
            qmpVar.getClass();
            if (z) {
                xdr0Var.k.update(false);
            }
            oer0 oer0Var = new oer0(zdr0Var, r8r0Var, a8hVar, p3g0Var, booleanValue4, mainMenuLogOutUiState, str, !z, new ner0(z, booleanValue3, Y), booleanValue);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (vprVar.emit(oer0Var, this) == coroutineSingletons) {
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
