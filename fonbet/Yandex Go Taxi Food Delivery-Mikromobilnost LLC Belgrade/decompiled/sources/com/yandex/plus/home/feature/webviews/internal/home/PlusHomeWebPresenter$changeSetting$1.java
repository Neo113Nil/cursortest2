package com.yandex.plus.home.feature.webviews.internal.home;

import com.yandex.plus.core.analytics.logging.PlusLogTag;
import com.yandex.plus.home.feature.webviews.internal.settings.domain.ChangePlusSettingsInteractor$ChangeSettingError;
import defpackage.ba6;
import defpackage.jse;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.omv;
import defpackage.skd0;
import defpackage.tje;
import defpackage.tse;
import defpackage.wio;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.feature.webviews.internal.home.PlusHomeWebPresenter$changeSetting$1", f = "PlusHomeWebPresenter.kt", l = {806}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PlusHomeWebPresenter$changeSetting$1 extends SuspendLambda implements wls {
    final /* synthetic */ ba6 $setting;
    int I$0;
    int I$1;
    int I$2;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusHomeWebPresenter$changeSetting$1(d dVar, ba6 ba6Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$setting = ba6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PlusHomeWebPresenter$changeSetting$1 plusHomeWebPresenter$changeSetting$1 = new PlusHomeWebPresenter$changeSetting$1(this.this$0, this.$setting, continuation);
        plusHomeWebPresenter$changeSetting$1.L$0 = obj;
        return plusHomeWebPresenter$changeSetting$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlusHomeWebPresenter$changeSetting$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        d dVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                d dVar2 = this.this$0;
                ba6 ba6Var = this.$setting;
                com.yandex.plus.home.feature.webviews.internal.settings.domain.b bVar = dVar2.m;
                jse jseVar = bVar.b;
                PlusHomeWebPresenter$changeSetting$1$invokeSuspend$lambda$0$$inlined$changeSetting$1 plusHomeWebPresenter$changeSetting$1$invokeSuspend$lambda$0$$inlined$changeSetting$1 = new PlusHomeWebPresenter$changeSetting$1$invokeSuspend$lambda$0$$inlined$changeSetting$1(ba6Var, bVar, null);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = dVar2;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.I$0 = 0;
                this.I$1 = 0;
                this.I$2 = 0;
                this.label = 1;
                Object k0 = tje.k0(jseVar, plusHomeWebPresenter$changeSetting$1$invokeSuspend$lambda$0$$inlined$changeSetting$1, this);
                if (k0 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                dVar = dVar2;
                obj = k0;
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dVar = (d) this.L$2;
                kotlin.b.b(obj);
            }
            skd0.e(PlusLogTag.UI, "changeSetting() success changedSetting=" + ((ba6) obj));
            dVar.p(new omv());
            failure = zy11Var;
        } catch (TimeoutCancellationException e) {
            failure = new Result.Failure(e);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        d dVar3 = this.this$0;
        ba6 ba6Var2 = this.$setting;
        Throwable a = Result.a(failure);
        if (a != null) {
            skd0.h(PlusLogTag.UI, "changeSetting() failure " + a, null);
            if ((a instanceof ChangePlusSettingsInteractor$ChangeSettingError.IllegalChangeDisabledSettingError) || (a instanceof ChangePlusSettingsInteractor$ChangeSettingError.UnsupportedSettingType) || (a instanceof ChangePlusSettingsInteractor$ChangeSettingError.UnSupportedSettingError)) {
                wio wioVar = dVar3.p;
                String str = ba6Var2.a;
                if (str == null) {
                    str = "";
                }
                wioVar.a(str, ((ChangePlusSettingsInteractor$ChangeSettingError) a).getMessage() + ", setting=" + ba6Var2, true);
            }
        }
        return zy11Var;
    }
}
