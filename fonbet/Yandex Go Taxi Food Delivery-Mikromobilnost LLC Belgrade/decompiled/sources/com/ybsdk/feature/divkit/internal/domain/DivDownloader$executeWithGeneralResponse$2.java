package com.ybsdk.feature.divkit.internal.domain;

import com.ybsdk.feature.divkit.internal.data.DivApi;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/divkit/internal/dto/DivPatchDto;", "body", "", "headers", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.divkit.internal.domain.DivDownloader$executeWithGeneralResponse$2", f = "DivDownloader.kt", l = {108}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DivDownloader$executeWithGeneralResponse$2 extends SuspendLambda implements zls {
    final /* synthetic */ String $uri;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivDownloader$executeWithGeneralResponse$2(b bVar, String str, Continuation continuation) {
        super(3, continuation);
        this.this$0 = bVar;
        this.$uri = str;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        DivDownloader$executeWithGeneralResponse$2 divDownloader$executeWithGeneralResponse$2 = new DivDownloader$executeWithGeneralResponse$2(this.this$0, this.$uri, (Continuation) obj3);
        divDownloader$executeWithGeneralResponse$2.L$0 = (String) obj;
        divDownloader$executeWithGeneralResponse$2.L$1 = (Map) obj2;
        return divDownloader$executeWithGeneralResponse$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            String str = (String) this.L$0;
            Map<String, String> map = (Map) this.L$1;
            DivApi divApi = this.this$0.b;
            String str2 = this.$uri;
            if (str == null) {
                str = "";
            }
            this.L$0 = null;
            this.label = 1;
            a = divApi.a(str2, str, map, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            a = ((Result) obj).getValue();
        }
        return new Result(a);
    }
}
