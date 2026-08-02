package com.yandex.go.payments.shared.details.settings.limits.currencysettings;

import com.yandex.go.payments.shared.data.model.Account;
import com.yandex.go.payments.shared.v;
import defpackage.bef;
import defpackage.il;
import defpackage.jef;
import defpackage.jst;
import defpackage.mef;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pef;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.shared.details.settings.limits.currencysettings.CurrencySettingsPresenter$onSelectClick$1", f = "CurrencySettingsPresenter.kt", l = {HProv.PP_DHOID}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class CurrencySettingsPresenter$onSelectClick$1 extends SuspendLambda implements wls {
    final /* synthetic */ bef $selectedCurrency;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ mef this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CurrencySettingsPresenter$onSelectClick$1(mef mefVar, bef befVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mefVar;
        this.$selectedCurrency = befVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CurrencySettingsPresenter$onSelectClick$1(this.this$0, this.$selectedCurrency, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CurrencySettingsPresenter$onSelectClick$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        mef mefVar;
        mef mefVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                mef mefVar3 = this.this$0;
                bef befVar = this.$selectedCurrency;
                try {
                    v vVar = mefVar3.x;
                    String str = mefVar3.D.b().a;
                    String str2 = befVar.b;
                    this.L$0 = mefVar3;
                    this.L$1 = mefVar3;
                    this.label = 1;
                    Object s = vVar.s(str, str2, this);
                    if (s == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    mefVar = mefVar3;
                    obj = s;
                    mefVar2 = mefVar;
                } catch (Throwable th) {
                    th = th;
                    mefVar = mefVar3;
                    mefVar.getClass();
                    jst.e.j(th);
                    pef pefVar = mefVar.E;
                    pefVar.g = false;
                    pefVar.f = false;
                    pefVar.d = mefVar.B.c;
                    mefVar.C.a(mefVar.y.a(th));
                    ((jef) mefVar.Dg()).Gb(mefVar.E);
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mefVar = (mef) this.L$1;
                mefVar2 = (mef) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    mefVar.getClass();
                    jst.e.j(th);
                    pef pefVar2 = mefVar.E;
                    pefVar2.g = false;
                    pefVar2.f = false;
                    pefVar2.d = mefVar.B.c;
                    mefVar.C.a(mefVar.y.a(th));
                    ((jef) mefVar.Dg()).Gb(mefVar.E);
                    return zy11.a;
                }
            }
            il ilVar = mefVar2.D;
            ilVar.a = (Account) obj;
            mefVar2.C.b(ilVar, true);
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
