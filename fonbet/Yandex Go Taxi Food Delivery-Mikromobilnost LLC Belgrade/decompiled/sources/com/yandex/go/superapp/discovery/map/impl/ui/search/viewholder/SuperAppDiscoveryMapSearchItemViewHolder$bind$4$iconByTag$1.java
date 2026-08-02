package com.yandex.go.superapp.discovery.map.impl.ui.search.viewholder;

import defpackage.bxv0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.widget.utils.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Landroid/graphics/drawable/BitmapDrawable;", "<anonymous>", "(Ltse;)Landroid/graphics/drawable/BitmapDrawable;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.discovery.map.impl.ui.search.viewholder.SuperAppDiscoveryMapSearchItemViewHolder$bind$4$iconByTag$1", f = "SuperAppDiscoveryMapSearchItemViewHolder.kt", l = {114}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SuperAppDiscoveryMapSearchItemViewHolder$bind$4$iconByTag$1 extends SuspendLambda implements wls {
    final /* synthetic */ bxv0 $data;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppDiscoveryMapSearchItemViewHolder$bind$4$iconByTag$1(a aVar, bxv0 bxv0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$data = bxv0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperAppDiscoveryMapSearchItemViewHolder$bind$4$iconByTag$1(this.this$0, this.$data, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperAppDiscoveryMapSearchItemViewHolder$bind$4$iconByTag$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        e eVar = this.this$0.S;
        String str = this.$data.c;
        this.label = 1;
        Object f = e.f(eVar, str, null, this, 6);
        return f == coroutineSingletons ? coroutineSingletons : f;
    }
}
