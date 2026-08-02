package com.yandex.plus.home.feature.webviews.internal.webview;

import com.yandex.plus.home.feature.webviews.internal.treasury.c;
import com.yandex.plus.log.api.LogPriority;
import defpackage.gov;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pgz;
import defpackage.tls;
import defpackage.tnv;
import defpackage.tse;
import defpackage.wls;
import defpackage.zv80;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.feature.webviews.internal.webview.BaseCommonWebViewContract$handleTreasuryStateRequest$2$1", f = "BaseCommonWebViewContract.kt", l = {468}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class BaseCommonWebViewContract$handleTreasuryStateRequest$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ zv80 $outMessage;
    final /* synthetic */ c $treasuryMessagesBridge;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.yandex.plus.home.feature.webviews.internal.webview.BaseCommonWebViewContract$handleTreasuryStateRequest$2$1$2, reason: invalid class name */
    final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements tls {
        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            ((a) this.receiver).z((gov) obj);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseCommonWebViewContract$handleTreasuryStateRequest$2$1(c cVar, zv80 zv80Var, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$treasuryMessagesBridge = cVar;
        this.$outMessage = zv80Var;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BaseCommonWebViewContract$handleTreasuryStateRequest$2$1 baseCommonWebViewContract$handleTreasuryStateRequest$2$1 = new BaseCommonWebViewContract$handleTreasuryStateRequest$2$1(this.$treasuryMessagesBridge, this.$outMessage, this.this$0, continuation);
        baseCommonWebViewContract$handleTreasuryStateRequest$2$1.L$0 = obj;
        return baseCommonWebViewContract$handleTreasuryStateRequest$2$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BaseCommonWebViewContract$handleTreasuryStateRequest$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            c cVar = this.$treasuryMessagesBridge;
            zv80 zv80Var = this.$outMessage;
            this.L$0 = tseVar;
            this.label = 1;
            obj = cVar.d(zv80Var, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        tnv tnvVar = (tnv) obj;
        a aVar = this.this$0;
        pgz pgzVar = aVar.u;
        String x = aVar.x();
        LogPriority logPriority = LogPriority.DEBUG;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, x, "handleTreasuryStateRequest() sendMessage");
        }
        this.this$0.z(tnvVar);
        this.$treasuryMessagesBridge.b(tseVar, new AnonymousClass2(1, this.this$0, a.class, "sendMessage", "sendMessage(Lcom/yandex/plus/home/feature/webviews/internalapi/bridge/dto/InMessage;)V", 0));
        return zy11.a;
    }
}
