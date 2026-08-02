package com.yandex.go.lootbox.impl.domain.interactors.activation;

import com.yandex.go.lootbox.api.domain.entities.lootbox.content.LootBoxContentTypeEntity;
import com.yandex.go.lootbox.impl.data.entities.network.common.error.LootBoxErrorDto;
import defpackage.avj0;
import defpackage.jl40;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.opz;
import defpackage.s8o;
import defpackage.tse;
import defpackage.wls;
import defpackage.xnt;
import defpackage.xoz;
import defpackage.xpz;
import defpackage.zoz;
import defpackage.zxh0;
import defpackage.zy11;
import java.io.BufferedInputStream;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import retrofit2.HttpException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lyoz;", "<anonymous>", "(Ltse;)Lyoz;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.lootbox.impl.domain.interactors.activation.LootBoxActivationInteractorImpl$activateLootBox$2", f = "LootBoxActivationInteractorImpl.kt", l = {40}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class LootBoxActivationInteractorImpl$activateLootBox$2 extends SuspendLambda implements wls {
    final /* synthetic */ LootBoxContentTypeEntity $contentType;
    final /* synthetic */ String $id;
    final /* synthetic */ String $tariff;
    final /* synthetic */ String $zone;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LootBoxActivationInteractorImpl$activateLootBox$2(a aVar, String str, LootBoxContentTypeEntity lootBoxContentTypeEntity, String str2, String str3, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$id = str;
        this.$contentType = lootBoxContentTypeEntity;
        this.$tariff = str2;
        this.$zone = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LootBoxActivationInteractorImpl$activateLootBox$2(this.this$0, this.$id, this.$contentType, this.$tariff, this.$zone, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LootBoxActivationInteractorImpl$activateLootBox$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        LootBoxActivationInteractorImpl$activateLootBox$2 lootBoxActivationInteractorImpl$activateLootBox$2;
        a aVar;
        com.yandex.go.lootbox.impl.data.repository.activation.a aVar2;
        String str;
        LootBoxContentTypeEntity lootBoxContentTypeEntity;
        String str2;
        String str3;
        a aVar3;
        HttpException httpException;
        BufferedInputStream N;
        LootBoxErrorDto lootBoxErrorDto;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        String str4 = null;
        if (i == 0) {
            b.b(obj);
            try {
                aVar = this.this$0;
                aVar2 = aVar.a;
                str = this.$id;
                lootBoxContentTypeEntity = this.$contentType;
                str2 = this.$tariff;
                str3 = this.$zone;
                this.L$0 = aVar;
                this.label = 1;
                lootBoxActivationInteractorImpl$activateLootBox$2 = this;
            } catch (Throwable th) {
                th = th;
                lootBoxActivationInteractorImpl$activateLootBox$2 = this;
                httpException = th;
                a aVar4 = lootBoxActivationInteractorImpl$activateLootBox$2.this$0;
                aVar4.getClass();
                jst.e.k(httpException, "Loot box activation has failed");
                String h = ((avj0) aVar4.b).h(zxh0.error_text);
                if ((httpException instanceof HttpException) || httpException.a() == 409) {
                    N = s8o.N(httpException);
                    if (N == null) {
                        lootBoxErrorDto = (LootBoxErrorDto) ((xnt) aVar4.c).b(N, LootBoxErrorDto.Companion.serializer());
                    } else {
                        lootBoxErrorDto = null;
                    }
                    if (lootBoxErrorDto != null) {
                        str4 = lootBoxErrorDto.b;
                    }
                }
                if (str4 != null) {
                    h = str4;
                }
                return new xoz(h);
            }
            try {
                Object a = aVar2.a(str, lootBoxContentTypeEntity, str2, str3, lootBoxActivationInteractorImpl$activateLootBox$2);
                if (a == coroutineSingletons) {
                    return coroutineSingletons;
                }
                aVar3 = aVar;
                obj = a;
            } catch (Throwable th2) {
                th = th2;
                httpException = th;
                a aVar42 = lootBoxActivationInteractorImpl$activateLootBox$2.this$0;
                aVar42.getClass();
                jst.e.k(httpException, "Loot box activation has failed");
                String h2 = ((avj0) aVar42.b).h(zxh0.error_text);
                if (httpException instanceof HttpException) {
                }
                N = s8o.N(httpException);
                if (N == null) {
                }
                if (lootBoxErrorDto != null) {
                }
                if (str4 != null) {
                }
                return new xoz(h2);
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVar3 = (a) this.L$0;
            try {
                b.b(obj);
                lootBoxActivationInteractorImpl$activateLootBox$2 = this;
            } catch (Throwable th3) {
                httpException = th3;
                lootBoxActivationInteractorImpl$activateLootBox$2 = this;
                a aVar422 = lootBoxActivationInteractorImpl$activateLootBox$2.this$0;
                aVar422.getClass();
                jst.e.k(httpException, "Loot box activation has failed");
                String h22 = ((avj0) aVar422.b).h(zxh0.error_text);
                if (httpException instanceof HttpException) {
                }
                N = s8o.N(httpException);
                if (N == null) {
                }
                if (lootBoxErrorDto != null) {
                }
                if (str4 != null) {
                }
                return new xoz(h22);
            }
        }
        opz opzVar = (opz) obj;
        try {
            aVar3.getClass();
            if (!jl40.l(opzVar, xpz.a)) {
                return new zoz(opzVar);
            }
            jst.e.getClass();
            return new xoz(null);
        } catch (Throwable th4) {
            httpException = th4;
            a aVar4222 = lootBoxActivationInteractorImpl$activateLootBox$2.this$0;
            aVar4222.getClass();
            jst.e.k(httpException, "Loot box activation has failed");
            String h222 = ((avj0) aVar4222.b).h(zxh0.error_text);
            if (httpException instanceof HttpException) {
            }
            N = s8o.N(httpException);
            if (N == null) {
            }
            if (lootBoxErrorDto != null) {
            }
            if (str4 != null) {
            }
            return new xoz(h222);
        }
    }
}
