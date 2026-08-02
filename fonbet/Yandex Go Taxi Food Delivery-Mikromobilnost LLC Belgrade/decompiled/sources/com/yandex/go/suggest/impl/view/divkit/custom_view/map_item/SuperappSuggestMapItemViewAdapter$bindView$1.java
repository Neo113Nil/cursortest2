package com.yandex.go.suggest.impl.view.divkit.custom_view.map_item;

import android.view.View;
import android.widget.FrameLayout;
import defpackage.clk;
import defpackage.mvg;
import defpackage.not;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.xnt;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.suggest.impl.view.divkit.custom_view.map_item.SuperappSuggestMapItemViewAdapter$bindView$1", f = "SuperappSuggestMapItemViewAdapter.kt", l = {60}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SuperappSuggestMapItemViewAdapter$bindView$1 extends SuspendLambda implements wls {
    final /* synthetic */ clk $div;
    final /* synthetic */ View $view;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/go/suggest/impl/view/divkit/custom_view/map_item/SuperappSuggestMapItemViewProperties;", "<anonymous>", "(Ltse;)Lcom/yandex/go/suggest/impl/view/divkit/custom_view/map_item/SuperappSuggestMapItemViewProperties;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.suggest.impl.view.divkit.custom_view.map_item.SuperappSuggestMapItemViewAdapter$bindView$1$1", f = "SuperappSuggestMapItemViewAdapter.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.suggest.impl.view.divkit.custom_view.map_item.SuperappSuggestMapItemViewAdapter$bindView$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ clk $div;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(clk clkVar, a aVar, Continuation continuation) {
            super(2, continuation);
            this.$div = clkVar;
            this.this$0 = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$div, this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            JSONObject jSONObject = this.$div.i;
            if (jSONObject == null) {
                return null;
            }
            return (SuperappSuggestMapItemViewProperties) ((xnt) this.this$0.j).c(jSONObject.toString(), SuperappSuggestMapItemViewProperties.Companion.serializer());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperappSuggestMapItemViewAdapter$bindView$1(a aVar, clk clkVar, View view, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$div = clkVar;
        this.$view = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperappSuggestMapItemViewAdapter$bindView$1(this.this$0, this.$div, this.$view, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperappSuggestMapItemViewAdapter$bindView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.this$0.b.getClass();
            sjh sjhVar = uyj.a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$div, this.this$0, null);
            this.label = 1;
            obj = tje.k0(sjhVar, anonymousClass1, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        SuperappSuggestMapItemViewProperties superappSuggestMapItemViewProperties = (SuperappSuggestMapItemViewProperties) obj;
        if (superappSuggestMapItemViewProperties != null) {
            View view = this.$view;
            a aVar = this.this$0;
            FrameLayout frameLayout = (FrameLayout) view;
            if (frameLayout instanceof SuperappSuggestMapItemView) {
                ((SuperappSuggestMapItemView) view).bindData(superappSuggestMapItemViewProperties, ((not) aVar.g).d(), aVar.d, aVar.e, aVar.f, aVar.h, aVar.i);
            } else if (frameLayout instanceof OptimizedSuperappSuggestMapItemView) {
                ((OptimizedSuperappSuggestMapItemView) view).bindData(superappSuggestMapItemViewProperties, ((not) aVar.g).d(), aVar.d, aVar.e, aVar.f, aVar.h, aVar.i);
            }
        }
        return zy11.a;
    }
}
