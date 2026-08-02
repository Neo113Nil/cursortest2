package com.yandex.plus.home.feature.webviews.internal.webview;

import com.yandex.plus.home.feature.webviews.internal.settings.domain.ChangePlusSettingsInteractor$ChangeSettingError;
import com.yandex.plus.log.api.LogPriority;
import defpackage.amv;
import defpackage.ba6;
import defpackage.fs80;
import defpackage.jse;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pgz;
import defpackage.tje;
import defpackage.tse;
import defpackage.wio;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.feature.webviews.internal.webview.BaseCommonWebViewContract$handleChangeOptionStatusRequest$2", f = "BaseCommonWebViewContract.kt", l = {541}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class BaseCommonWebViewContract$handleChangeOptionStatusRequest$2 extends SuspendLambda implements wls {
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
    public BaseCommonWebViewContract$handleChangeOptionStatusRequest$2(a aVar, fs80 fs80Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$outMessage = fs80Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BaseCommonWebViewContract$handleChangeOptionStatusRequest$2 baseCommonWebViewContract$handleChangeOptionStatusRequest$2 = new BaseCommonWebViewContract$handleChangeOptionStatusRequest$2(this.this$0, this.$outMessage, continuation);
        baseCommonWebViewContract$handleChangeOptionStatusRequest$2.L$0 = obj;
        return baseCommonWebViewContract$handleChangeOptionStatusRequest$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BaseCommonWebViewContract$handleChangeOptionStatusRequest$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        amv v;
        a aVar;
        fs80 fs80Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        try {
            if (i == 0) {
                b.b(obj);
                aVar = this.this$0;
                fs80 fs80Var2 = this.$outMessage;
                com.yandex.plus.home.feature.webviews.internal.settings.domain.b bVar = aVar.j;
                String str = fs80Var2.b;
                ba6 ba6Var = new ba6(str, aVar.i.h(str), fs80Var2.c);
                jse jseVar = bVar.b;
                BaseCommonWebViewContract$handleChangeOptionStatusRequest$2$invokeSuspend$lambda$1$$inlined$changeSetting$1 baseCommonWebViewContract$handleChangeOptionStatusRequest$2$invokeSuspend$lambda$1$$inlined$changeSetting$1 = new BaseCommonWebViewContract$handleChangeOptionStatusRequest$2$invokeSuspend$lambda$1$$inlined$changeSetting$1(ba6Var, bVar, null);
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
                Object k0 = tje.k0(jseVar, baseCommonWebViewContract$handleChangeOptionStatusRequest$2$invokeSuspend$lambda$1$$inlined$changeSetting$1, this);
                if (k0 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                fs80Var = fs80Var2;
                obj = k0;
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fs80 fs80Var3 = (fs80) this.L$3;
                aVar = (a) this.L$2;
                b.b(obj);
                fs80Var = fs80Var3;
            }
            a aVar2 = aVar;
            ba6 ba6Var2 = (ba6) obj;
            pgz pgzVar = aVar2.u;
            String x = aVar2.x();
            LogPriority logPriority = LogPriority.DEBUG;
            if (pgzVar.e(logPriority)) {
                pgzVar.a(logPriority, x, "handleChangeOptionStatusRequest() change success");
            }
            aVar2.z(a.v(aVar2, fs80Var, Boolean.valueOf(ba6Var2.c), !ba6Var2.b, true, null));
            failure = zy11Var;
        } catch (TimeoutCancellationException e) {
            failure = new Result.Failure(e);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        a aVar3 = this.this$0;
        fs80 fs80Var4 = this.$outMessage;
        Throwable a = Result.a(failure);
        if (a != null) {
            pgz pgzVar2 = aVar3.u;
            wio wioVar = aVar3.l;
            String x2 = aVar3.x();
            LogPriority logPriority2 = LogPriority.DEBUG;
            if (pgzVar2.e(logPriority2)) {
                pgzVar2.a(logPriority2, x2, "handleChangeOptionStatusRequest() change error");
            }
            if (a instanceof ChangePlusSettingsInteractor$ChangeSettingError.HostChangeSettingError) {
                v = a.v(aVar3, fs80Var4, Boolean.valueOf(((ChangePlusSettingsInteractor$ChangeSettingError.HostChangeSettingError) a).getSettingData().c), !r11.getSettingData().b, true, "HostChangeError");
            } else if (a instanceof ChangePlusSettingsInteractor$ChangeSettingError.IllegalChangeDisabledSettingError) {
                ChangePlusSettingsInteractor$ChangeSettingError.IllegalChangeDisabledSettingError illegalChangeDisabledSettingError = (ChangePlusSettingsInteractor$ChangeSettingError.IllegalChangeDisabledSettingError) a;
                wioVar.a(fs80Var4.b, illegalChangeDisabledSettingError.getMessage(), false);
                v = a.v(aVar3, fs80Var4, Boolean.valueOf(illegalChangeDisabledSettingError.getSettingData().c), true, true, "OptionIsDisabled");
            } else if (a instanceof ChangePlusSettingsInteractor$ChangeSettingError.UnsupportedSettingType) {
                wioVar.a(fs80Var4.b, ((ChangePlusSettingsInteractor$ChangeSettingError.UnsupportedSettingType) a).getMessage(), false);
                v = a.v(aVar3, fs80Var4, null, true, false, "UnsupportedSettingType");
            } else if (a instanceof ChangePlusSettingsInteractor$ChangeSettingError.UnSupportedSettingError) {
                wioVar.a(fs80Var4.b, ((ChangePlusSettingsInteractor$ChangeSettingError.UnSupportedSettingError) a).getMessage(), false);
                v = a.v(aVar3, fs80Var4, null, true, false, "OptionIsNotSupported");
            } else {
                wioVar.a(fs80Var4.b, "Unexpected exception=" + a, false);
                v = a.v(aVar3, fs80Var4, null, true, false, "Unknown");
            }
            aVar3.z(v);
        }
        return zy11Var;
    }
}
