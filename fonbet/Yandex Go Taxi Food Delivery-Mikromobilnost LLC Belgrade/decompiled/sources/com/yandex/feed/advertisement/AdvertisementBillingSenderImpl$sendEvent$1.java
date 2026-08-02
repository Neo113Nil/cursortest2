package com.yandex.feed.advertisement;

import com.yandex.go.mob.HostMobSupportedApiNames;
import defpackage.evu0;
import defpackage.g8e;
import defpackage.je1;
import defpackage.jse;
import defpackage.mvg;
import defpackage.not;
import defpackage.ny61;
import defpackage.ra10;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zse;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.feed.advertisement.AdvertisementBillingSenderImpl$sendEvent$1", f = "AdvertisementBillingSenderImpl.kt", l = {HProv.ALG_SID_SHA3_224}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class AdvertisementBillingSenderImpl$sendEvent$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $payload;
    int label;
    final /* synthetic */ je1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvertisementBillingSenderImpl$sendEvent$1(je1 je1Var, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = je1Var;
        this.$payload = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AdvertisementBillingSenderImpl$sendEvent$1(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AdvertisementBillingSenderImpl$sendEvent$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            b.b(obj);
            je1 je1Var = this.this$0;
            String str = this.$payload;
            ra10 ra10Var = je1Var.b;
            String str2 = "https://media-adv.market.yandex.ru";
            if (ra10Var != null) {
                not notVar = (not) ra10Var.a;
                notVar.getClass();
                String b = notVar.b(HostMobSupportedApiNames.MEDIAADV);
                if (b == null) {
                    notVar.c.getClass();
                    b = "https://media-adv.market.yandex.ru";
                }
                String str3 = evu0.J(b) ? null : b;
                if (str3 != null) {
                    str2 = str3;
                }
            }
            String p = g8e.p(str2, "/events?click=", str);
            this.label = 1;
            sjh sjhVar = uyj.a;
            Object k0 = tje.k0((jse) zse.a.c, new AdvertisementBillingSenderImpl$send$2(p, true, je1Var, null, false, null), this);
            if (k0 != coroutineSingletons) {
                k0 = zy11Var;
            }
            if (k0 == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11Var;
    }
}
