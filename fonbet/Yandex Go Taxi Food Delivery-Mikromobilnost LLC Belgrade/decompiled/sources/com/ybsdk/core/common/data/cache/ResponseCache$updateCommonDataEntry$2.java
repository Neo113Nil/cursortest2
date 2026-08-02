package com.ybsdk.core.common.data.cache;

import com.yandex.passport.sloth.ui.dependencies.m;
import com.ybsdk.core.common.data.network.dto.cache.DataEntryDto;
import defpackage.dpp0;
import defpackage.e5z0;
import defpackage.g8e;
import defpackage.i5z0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/ybsdk/core/common/data/cache/b;", "Lzy11;", "<anonymous>", "(Lcom/ybsdk/core/common/data/cache/b;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.core.common.data.cache.ResponseCache$updateCommonDataEntry$2", f = "ResponseCache.kt", l = {192}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ResponseCache$updateCommonDataEntry$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $key;
    final /* synthetic */ DataEntryDto $value;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResponseCache$updateCommonDataEntry$2(String str, DataEntryDto dataEntryDto, Continuation continuation) {
        super(2, continuation);
        this.$key = str;
        this.$value = dataEntryDto;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ResponseCache$updateCommonDataEntry$2 responseCache$updateCommonDataEntry$2 = new ResponseCache$updateCommonDataEntry$2(this.$key, this.$value, continuation);
        responseCache$updateCommonDataEntry$2.L$0 = obj;
        return responseCache$updateCommonDataEntry$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ResponseCache$updateCommonDataEntry$2) create((b) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b bVar;
        Map map;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar2 = (b) this.L$0;
            e5z0 e5z0Var = i5z0.a;
            e5z0Var.m("ResponseCache");
            e5z0Var.a(g8e.o("Update common entry for ", this.$key), new Object[0]);
            DataEntryDto dataEntryDto = this.$value;
            dpp0 dpp0Var = bVar2.e;
            StoredDataEntry storedDataEntry = new StoredDataEntry(dataEntryDto.getTtl(), System.currentTimeMillis(), dataEntryDto.getType(), dataEntryDto.getValue(), false);
            r0 r0Var = bVar2.i;
            Map o = kotlin.collections.b.o((Map) r0Var.getValue(), new Pair(this.$key, storedDataEntry));
            this.L$0 = bVar2;
            this.L$1 = o;
            this.label = 1;
            r0Var.emit(o, this);
            if (zy11Var == coroutineSingletons) {
                return coroutineSingletons;
            }
            bVar = bVar2;
            map = o;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            map = (Map) this.L$1;
            bVar = (b) this.L$0;
            kotlin.b.b(obj);
        }
        m mVar = bVar.h;
        if (mVar == null) {
            return null;
        }
        mVar.c(map);
        return zy11Var;
    }
}
