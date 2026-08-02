package com.yandex.plus.home.feature.webviews.internal.bridge;

import com.yandex.plus.core.analytics.logging.PlusLogTag;
import com.yandex.plus.home.feature.webviews.internal.settings.domain.ChangePlusSettingsInteractor$ChangeSettingError;
import defpackage.amv;
import defpackage.ba6;
import defpackage.fs80;
import defpackage.jse;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.skd0;
import defpackage.tje;
import defpackage.tse;
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
@mvg(c = "com.yandex.plus.home.feature.webviews.internal.bridge.BasePlusWebMessagesHandler$handleChangeOptionStatusRequestMessage$1", f = "BasePlusWebMessagesHandler.kt", l = {541}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class BasePlusWebMessagesHandler$handleChangeOptionStatusRequestMessage$1 extends SuspendLambda implements wls {
    final /* synthetic */ fs80 $outMessage;
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
    Object L$8;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasePlusWebMessagesHandler$handleChangeOptionStatusRequestMessage$1(a aVar, fs80 fs80Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$outMessage = fs80Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BasePlusWebMessagesHandler$handleChangeOptionStatusRequestMessage$1 basePlusWebMessagesHandler$handleChangeOptionStatusRequestMessage$1 = new BasePlusWebMessagesHandler$handleChangeOptionStatusRequestMessage$1(this.this$0, this.$outMessage, continuation);
        basePlusWebMessagesHandler$handleChangeOptionStatusRequestMessage$1.L$0 = obj;
        return basePlusWebMessagesHandler$handleChangeOptionStatusRequestMessage$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BasePlusWebMessagesHandler$handleChangeOptionStatusRequestMessage$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        amv amvVar;
        a aVar;
        Object k0;
        fs80 fs80Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                aVar = this.this$0;
                fs80 fs80Var2 = this.$outMessage;
                com.yandex.plus.home.feature.webviews.internal.settings.domain.b bVar = aVar.f;
                String str = fs80Var2.b;
                ba6 ba6Var = new ba6(str, aVar.e.h(str), fs80Var2.c);
                jse jseVar = bVar.b;
                BasePlusWebMessagesHandler$handleChangeOptionStatusRequestMessage$1$invokeSuspend$lambda$0$$inlined$changeSetting$1 basePlusWebMessagesHandler$handleChangeOptionStatusRequestMessage$1$invokeSuspend$lambda$0$$inlined$changeSetting$1 = new BasePlusWebMessagesHandler$handleChangeOptionStatusRequestMessage$1$invokeSuspend$lambda$0$$inlined$changeSetting$1(ba6Var, bVar, null);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = aVar;
                this.L$3 = fs80Var2;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = null;
                this.I$0 = 0;
                this.I$1 = 0;
                this.I$2 = 0;
                this.label = 1;
                k0 = tje.k0(jseVar, basePlusWebMessagesHandler$handleChangeOptionStatusRequestMessage$1$invokeSuspend$lambda$0$$inlined$changeSetting$1, this);
                if (k0 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                fs80Var = fs80Var2;
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fs80Var = (fs80) this.L$3;
                aVar = (a) this.L$2;
                kotlin.b.b(obj);
                k0 = obj;
            }
            skd0.b(PlusLogTag.JS, "handleChangeOptionStatusRequestMessage() change success");
            aVar.A(new amv(fs80Var.a, fs80Var.b, Boolean.valueOf(((ba6) k0).c), !r8.b, true, null));
            failure = zy11Var;
        } catch (TimeoutCancellationException e) {
            failure = new Result.Failure(e);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        fs80 fs80Var3 = this.$outMessage;
        a aVar2 = this.this$0;
        Throwable a = Result.a(failure);
        if (a != null) {
            skd0.h(PlusLogTag.JS, "handleChangeOptionStatusRequestMessage() change error", null);
            if (a instanceof ChangePlusSettingsInteractor$ChangeSettingError.HostChangeSettingError) {
                amvVar = new amv(fs80Var3.a, fs80Var3.b, Boolean.valueOf(((ChangePlusSettingsInteractor$ChangeSettingError.HostChangeSettingError) a).getSettingData().c), !r2.getSettingData().b, true, "HostChangeError");
            } else if (a instanceof ChangePlusSettingsInteractor$ChangeSettingError.IllegalChangeDisabledSettingError) {
                ChangePlusSettingsInteractor$ChangeSettingError.IllegalChangeDisabledSettingError illegalChangeDisabledSettingError = (ChangePlusSettingsInteractor$ChangeSettingError.IllegalChangeDisabledSettingError) a;
                aVar2.h.a(fs80Var3.b, illegalChangeDisabledSettingError.getMessage(), false);
                amvVar = new amv(fs80Var3.a, fs80Var3.b, Boolean.valueOf(illegalChangeDisabledSettingError.getSettingData().c), true, true, "OptionIsDisabled");
            } else if (a instanceof ChangePlusSettingsInteractor$ChangeSettingError.UnsupportedSettingType) {
                aVar2.h.a(fs80Var3.b, ((ChangePlusSettingsInteractor$ChangeSettingError.UnsupportedSettingType) a).getMessage(), false);
                amvVar = new amv(fs80Var3.a, fs80Var3.b, null, true, false, "UnsupportedSettingType");
            } else if (a instanceof ChangePlusSettingsInteractor$ChangeSettingError.UnSupportedSettingError) {
                aVar2.h.a(fs80Var3.b, ((ChangePlusSettingsInteractor$ChangeSettingError.UnSupportedSettingError) a).getMessage(), false);
                amvVar = new amv(fs80Var3.a, fs80Var3.b, null, true, false, "OptionIsNotSupported");
            } else {
                aVar2.h.a(fs80Var3.b, "Unexpected exception=" + a, false);
                amvVar = new amv(fs80Var3.a, fs80Var3.b, null, true, false, "Unknown");
            }
            aVar2.A(amvVar);
        }
        return zy11Var;
    }
}
