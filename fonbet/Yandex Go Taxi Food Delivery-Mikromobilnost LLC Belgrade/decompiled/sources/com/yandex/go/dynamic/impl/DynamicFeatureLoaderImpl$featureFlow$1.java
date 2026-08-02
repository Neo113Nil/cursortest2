package com.yandex.go.dynamic.impl;

import com.yandex.go.dynamic.api.DynamicFeature;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lh7n;", "T", "Lvpr;", "Ld8n;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.dynamic.impl.DynamicFeatureLoaderImpl$featureFlow$1", f = "DynamicFeatureLoaderImpl.kt", l = {HProv.PP_DHOID, HProv.PP_DHOID}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class DynamicFeatureLoaderImpl$featureFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ DynamicFeature $feature;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicFeatureLoaderImpl$featureFlow$1(DynamicFeature dynamicFeature, b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$feature = dynamicFeature;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DynamicFeatureLoaderImpl$featureFlow$1 dynamicFeatureLoaderImpl$featureFlow$1 = new DynamicFeatureLoaderImpl$featureFlow$1(this.$feature, this.this$0, continuation);
        dynamicFeatureLoaderImpl$featureFlow$1.L$0 = obj;
        return dynamicFeatureLoaderImpl$featureFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DynamicFeatureLoaderImpl$featureFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        if (kotlinx.coroutines.flow.e.u((defpackage.tpr) r7, r0, r6) == r1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if (r7 == r1) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            DynamicFeature dynamicFeature = this.$feature;
            this.L$0 = null;
            this.L$1 = vprVar;
            this.label = 1;
            obj = b.i(bVar, dynamicFeature, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vprVar = (vpr) this.L$1;
            kotlin.b.b(obj);
        }
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
    }
}
