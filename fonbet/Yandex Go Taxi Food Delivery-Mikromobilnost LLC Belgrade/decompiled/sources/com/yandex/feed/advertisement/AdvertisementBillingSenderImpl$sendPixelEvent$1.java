package com.yandex.feed.advertisement;

import defpackage.je1;
import defpackage.jse;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zse;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.feed.advertisement.AdvertisementBillingSenderImpl$sendPixelEvent$1", f = "AdvertisementBillingSenderImpl.kt", l = {MSException.ERROR_INVALID_PARAMETER}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class AdvertisementBillingSenderImpl$sendPixelEvent$1 extends SuspendLambda implements wls {
    final /* synthetic */ Map<String, String> $headers;
    final /* synthetic */ boolean $sendYaCookies;
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ je1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvertisementBillingSenderImpl$sendPixelEvent$1(je1 je1Var, String str, boolean z, Map map, Continuation continuation) {
        super(2, continuation);
        this.this$0 = je1Var;
        this.$url = str;
        this.$sendYaCookies = z;
        this.$headers = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AdvertisementBillingSenderImpl$sendPixelEvent$1(this.this$0, this.$url, this.$sendYaCookies, this.$headers, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AdvertisementBillingSenderImpl$sendPixelEvent$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            b.b(obj);
            je1 je1Var = this.this$0;
            String str = this.$url;
            boolean z = this.$sendYaCookies;
            Map<String, String> map = this.$headers;
            this.label = 1;
            je1Var.getClass();
            sjh sjhVar = uyj.a;
            Object k0 = tje.k0((jse) zse.a.c, new AdvertisementBillingSenderImpl$send$2(str, z, je1Var, map, true, null), this);
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
