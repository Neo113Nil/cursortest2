package com.ybsdk.core.common.data.cache;

import com.ybsdk.core.common.data.network.dto.cache.CacheableResponseDto;
import com.ybsdk.core.common.data.network.dto.cache.DataEntryDto;
import com.ybsdk.core.common.data.network.dto.cache.MvLayoutInfoDto;
import defpackage.e5z0;
import defpackage.i5z0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vvj0;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/ybsdk/core/common/data/cache/b;", "Lzy11;", "<anonymous>", "(Lcom/ybsdk/core/common/data/cache/b;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.core.common.data.cache.ResponseCache$put$2", f = "ResponseCache.kt", l = {111, 112}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ResponseCache$put$2 extends SuspendLambda implements wls {
    final /* synthetic */ vvj0 $key;
    final /* synthetic */ CacheableResponseDto<Object> $new;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResponseCache$put$2(vvj0 vvj0Var, CacheableResponseDto cacheableResponseDto, Continuation continuation) {
        super(2, continuation);
        this.$key = vvj0Var;
        this.$new = cacheableResponseDto;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ResponseCache$put$2 responseCache$put$2 = new ResponseCache$put$2(this.$key, this.$new, continuation);
        responseCache$put$2.L$0 = obj;
        return responseCache$put$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ResponseCache$put$2) create((b) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0065, code lost:
    
        if (com.ybsdk.core.common.data.cache.b.c(r1, r9, r4, r8) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0067, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        if (com.ybsdk.core.common.data.cache.b.b(r1, r9, r8) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        b bVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            bVar = (b) this.L$0;
            e5z0 e5z0Var = i5z0.a;
            e5z0Var.m("ResponseCache");
            e5z0Var.a("Update cache for " + this.$key, new Object[0]);
            Map<String, DataEntryDto> commonData = this.$new.getCommonData();
            this.L$0 = bVar;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bVar = (b) this.L$0;
            kotlin.b.b(obj);
        }
        vvj0 vvj0Var = this.$key;
        MvLayoutInfoDto<Object> layoutInfo = this.$new.getLayoutInfo();
        this.L$0 = null;
        this.label = 2;
    }
}
