package com.yandex.go.wallet.data;

import com.yandex.go.flex.common.api.c;
import com.yandex.go.wallet.data.dto.WalletFlexRequestDto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.scc;
import defpackage.tje;
import defpackage.tse;
import defpackage.u1m;
import defpackage.wls;
import defpackage.xnt;
import defpackage.zir;
import defpackage.zy11;
import defpackage.zzs;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lu1m;", "<anonymous>", "(Ltse;)Lu1m;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.wallet.data.WalletDocumentQueryFactory$prepareDocumentQuery$2", f = "WalletDocumentQueryFactory.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes10.dex */
final class WalletDocumentQueryFactory$prepareDocumentQuery$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $path;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletDocumentQueryFactory$prepareDocumentQuery$2(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$path = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WalletDocumentQueryFactory$prepareDocumentQuery$2(this.this$0, this.$path, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WalletDocumentQueryFactory$prepareDocumentQuery$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        zir b = c.b(this.this$0.b);
        zzs a = b != null ? b.a() : null;
        a aVar = this.this$0;
        aVar.getClass();
        return new u1m(kotlin.collections.b.f(), this.$path, ((xnt) this.this$0.d).f(new WalletFlexRequestDto(a != null ? scc.g(Double.valueOf(a.b), Double.valueOf(a.a)) : null, UUID.randomUUID().toString(), new WalletFlexRequestDto.Accessibility(tje.L(aVar.c))), WalletFlexRequestDto.Companion.serializer()));
    }
}
