package com.ybsdk.feature.pfm.internal.data;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.feature.pfm.internal.data.network.PfmApi;
import com.ybsdk.feature.pfm.internal.data.network.dto.PfmRequest;
import defpackage.h9b0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/Result;", "Lr9b0;", "<anonymous>", "()Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.pfm.internal.data.PfmRepository$getPfmFeed$2", f = "PfmRepository.kt", l = {46, 53}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PfmRepository$getPfmFeed$2 extends SuspendLambda implements tls {
    final /* synthetic */ PfmRequest.BaseFilters $baseFilters;
    final /* synthetic */ List<h9b0> $categories;
    final /* synthetic */ String $cursor;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PfmRepository$getPfmFeed$2(a aVar, String str, PfmRequest.BaseFilters baseFilters, List list, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$cursor = str;
        this.$baseFilters = baseFilters;
        this.$categories = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new PfmRepository$getPfmFeed$2(this.this$0, this.$cursor, this.$baseFilters, this.$categories, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((PfmRepository$getPfmFeed$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x007c, code lost:
    
        if (r9 == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        if (r10 == r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            PfmApi pfmApi = this.this$0.a;
            String str = this.$cursor;
            PfmRequest.BaseFilters baseFilters = this.$baseFilters;
            List<h9b0> list = this.$categories;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((h9b0) it.next()).a);
            }
            PfmRequest pfmRequest = new PfmRequest(str, baseFilters, kotlin.collections.a.N0(arrayList));
            this.label = 1;
            a = pfmApi.a(pfmRequest, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                failure = ((Result) obj).getValue();
                return new Result(failure);
            }
            b.b(obj);
            a = ((Result) obj).getValue();
        }
        Throwable a2 = Result.a(a);
        if (a2 == null) {
            PfmRepository$getPfmFeed$2$2$1 pfmRepository$getPfmFeed$2$2$1 = new PfmRepository$getPfmFeed$2$2$1(2, null);
            this.label = 2;
            failure = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) a, pfmRepository$getPfmFeed$2$2$1, this);
        } else {
            failure = new Result.Failure(a2);
        }
        return new Result(failure);
    }
}
