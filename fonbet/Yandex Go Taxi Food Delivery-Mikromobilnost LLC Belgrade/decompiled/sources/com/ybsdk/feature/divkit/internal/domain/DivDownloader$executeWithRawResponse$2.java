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
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "", "body", "headers", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.divkit.internal.domain.DivDownloader$executeWithRawResponse$2", f = "DivDownloader.kt", l = {HProv.PP_LCD_QUERY}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DivDownloader$executeWithRawResponse$2 extends SuspendLambda implements zls {
    final /* synthetic */ String $uri;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivDownloader$executeWithRawResponse$2(b bVar, String str, Continuation continuation) {
        super(3, continuation);
        this.this$0 = bVar;
        this.$uri = str;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        DivDownloader$executeWithRawResponse$2 divDownloader$executeWithRawResponse$2 = new DivDownloader$executeWithRawResponse$2(this.this$0, this.$uri, (Continuation) obj3);
        divDownloader$executeWithRawResponse$2.L$0 = (String) obj;
        divDownloader$executeWithRawResponse$2.L$1 = (Map) obj2;
        return divDownloader$executeWithRawResponse$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            String str = (String) this.L$0;
            Map<String, String> map = (Map) this.L$1;
            DivApi divApi = this.this$0.b;
            String str2 = this.$uri;
            this.L$0 = null;
            this.label = 1;
            b = divApi.b(str2, str, map, this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            b = ((Result) obj).getValue();
        }
        return new Result(b);
    }
}
