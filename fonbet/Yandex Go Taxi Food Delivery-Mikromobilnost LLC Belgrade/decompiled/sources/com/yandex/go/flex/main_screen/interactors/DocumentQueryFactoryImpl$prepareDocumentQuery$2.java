package com.yandex.go.flex.main_screen.interactors;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.sls;
import defpackage.tse;
import defpackage.u1m;
import defpackage.ute0;
import defpackage.wls;
import defpackage.zir;
import defpackage.zy11;
import defpackage.zzs;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lute0;", "<anonymous>", "(Ltse;)Lute0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.flex.main_screen.interactors.DocumentQueryFactoryImpl$prepareDocumentQuery$2", f = "DocumentQueryFactoryImpl.kt", l = {33}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class DocumentQueryFactoryImpl$prepareDocumentQuery$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<String> $labels;
    final /* synthetic */ sls $params;
    final /* synthetic */ String $path;
    final /* synthetic */ zzs $selectedPosition;
    final /* synthetic */ boolean $usePayloadForCommonParams;
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocumentQueryFactoryImpl$prepareDocumentQuery$2(zzs zzsVar, b bVar, List list, boolean z, sls slsVar, String str, Continuation continuation) {
        super(2, continuation);
        this.$selectedPosition = zzsVar;
        this.this$0 = bVar;
        this.$labels = list;
        this.$usePayloadForCommonParams = z;
        this.$params = slsVar;
        this.$path = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DocumentQueryFactoryImpl$prepareDocumentQuery$2(this.$selectedPosition, this.this$0, this.$labels, this.$usePayloadForCommonParams, this.$params, this.$path, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DocumentQueryFactoryImpl$prepareDocumentQuery$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zzs zzsVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            zzs zzsVar2 = this.$selectedPosition;
            if (zzsVar2 == null) {
                zir b = com.yandex.go.flex.common.api.c.b(this.this$0.b);
                zzsVar2 = b != null ? b.a() : null;
            }
            a aVar = this.this$0.c;
            List<String> list = this.$labels;
            boolean z = this.$usePayloadForCommonParams;
            this.L$0 = zzsVar2;
            this.label = 1;
            Serializable c = aVar.c(zzsVar2, list, z, this);
            if (c == coroutineSingletons) {
                return coroutineSingletons;
            }
            zzsVar = zzsVar2;
            obj = c;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            zzsVar = (zzs) this.L$0;
            kotlin.b.b(obj);
        }
        Pair pair = (Pair) obj;
        return new ute0(new u1m((Map) this.$params.invoke(), this.$path, (Map) pair.getFirst()), zzsVar, (List) pair.getSecond());
    }
}
