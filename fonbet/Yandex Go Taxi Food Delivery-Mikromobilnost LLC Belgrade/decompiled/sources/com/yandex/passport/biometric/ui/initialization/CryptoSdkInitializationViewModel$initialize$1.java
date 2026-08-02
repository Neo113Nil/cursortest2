package com.yandex.passport.biometric.ui.initialization;

import com.yandex.passport.biometric.ui.initialization.d;
import com.yandex.passport.common.ebs.CryptoSdkProperties;
import com.yandex.passport.common.logger.LogLevel;
import defpackage.mvg;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.rt.ebs.cryptosdk.EbsCryptoSdk;
import ru.rt.ebs.cryptosdk.core.common.entities.models.Token;
import ru.rt.ebs.cryptosdk.core.security.entities.models.TLSOptions;
import ru.rt.ebs.cryptosdk.entities.models.ProdEbsCryptoSdkConfig;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.biometric.ui.initialization.CryptoSdkInitializationViewModel$initialize$1", f = "CryptoSdkInitializationViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class CryptoSdkInitializationViewModel$initialize$1 extends SuspendLambda implements wls {
    public final /* synthetic */ d a;
    public final /* synthetic */ CryptoSdkProperties b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoSdkInitializationViewModel$initialize$1(d dVar, CryptoSdkProperties cryptoSdkProperties, Continuation continuation) {
        super(2, continuation);
        this.a = dVar;
        this.b = cryptoSdkProperties;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CryptoSdkInitializationViewModel$initialize$1(this.a, this.b, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        CryptoSdkInitializationViewModel$initialize$1 cryptoSdkInitializationViewModel$initialize$1 = new CryptoSdkInitializationViewModel$initialize$1(this.a, this.b, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        cryptoSdkInitializationViewModel$initialize$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        kotlin.b.b(obj);
        try {
            EbsCryptoSdk.initialize(this.a.b, new ProdEbsCryptoSdkConfig(new Token(this.b.getJwt().getValue())), new TLSOptions.Builder(null, 1, null).certificates(EmptyList.a).build());
            this.a.c.l(d.a.b.a);
        } catch (Exception e) {
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "EbsCryptoSdk.initialize failed", e);
            }
            r0 r0Var = this.a.c;
            c cVar2 = new c(e);
            r0Var.getClass();
            r0Var.m(null, cVar2);
        }
        return zy11.a;
    }
}
