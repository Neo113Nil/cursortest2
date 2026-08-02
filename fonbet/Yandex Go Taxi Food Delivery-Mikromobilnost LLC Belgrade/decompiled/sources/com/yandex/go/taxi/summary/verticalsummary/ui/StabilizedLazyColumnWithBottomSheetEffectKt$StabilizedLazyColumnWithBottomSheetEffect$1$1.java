package com.yandex.go.taxi.summary.verticalsummary.ui;

import defpackage.f62;
import defpackage.gp5;
import defpackage.gr5;
import defpackage.jj2;
import defpackage.m3u0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.rcc;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wg6;
import defpackage.wls;
import defpackage.zls;
import defpackage.zy11;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.m0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.verticalsummary.ui.StabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$1$1", f = "StabilizedLazyColumnWithBottomSheetEffect.kt", l = {186}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class StabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<f62> $anchors;
    final /* synthetic */ wg6 $bottomSheetState;
    final /* synthetic */ int $expandedSheetAnchor;
    final /* synthetic */ oz40 $isSelectedItemStabilizationEnabled;
    final /* synthetic */ androidx.compose.foundation.lazy.b $lazyListState;
    final /* synthetic */ m3u0 $listIsDraggedState;
    final /* synthetic */ tse $scope;
    final /* synthetic */ jj2 $scrollAnimationSpec;
    final /* synthetic */ androidx.compose.animation.core.a $scrollOffsetAnimatable;
    final /* synthetic */ m3u0 $selectedItemVisibleIndex;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "currentOffset", "<unused var>", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
    @mvg(c = "com.yandex.go.taxi.summary.verticalsummary.ui.StabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$1$1$2", f = "StabilizedLazyColumnWithBottomSheetEffect.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.summary.verticalsummary.ui.StabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$1$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements zls {
        /* synthetic */ float F$0;
        int label;

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            float floatValue = ((Number) obj).floatValue();
            ((Boolean) obj2).getClass();
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(3, (Continuation) obj3);
            anonymousClass2.F$0 = floatValue;
            return anonymousClass2.invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            float f = this.F$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                kotlin.b.b(obj);
                return new Float(f);
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$1$1(List list, int i, wg6 wg6Var, m3u0 m3u0Var, oz40 oz40Var, androidx.compose.animation.core.a aVar, androidx.compose.foundation.lazy.b bVar, m3u0 m3u0Var2, tse tseVar, jj2 jj2Var, Continuation continuation) {
        super(2, continuation);
        this.$anchors = list;
        this.$expandedSheetAnchor = i;
        this.$bottomSheetState = wg6Var;
        this.$listIsDraggedState = m3u0Var;
        this.$isSelectedItemStabilizationEnabled = oz40Var;
        this.$scrollOffsetAnimatable = aVar;
        this.$lazyListState = bVar;
        this.$selectedItemVisibleIndex = m3u0Var2;
        this.$scope = tseVar;
        this.$scrollAnimationSpec = jj2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$1$1(this.$anchors, this.$expandedSheetAnchor, this.$bottomSheetState, this.$listIsDraggedState, this.$isSelectedItemStabilizationEnabled, this.$scrollOffsetAnimatable, this.$lazyListState, this.$selectedItemVisibleIndex, this.$scope, this.$scrollAnimationSpec, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((StabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        if (i3 == 0) {
            kotlin.b.b(obj);
            List<f62> list = this.$anchors;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((f62) it.next()).a == -1) {
                        i = 1;
                        break;
                    }
                }
            }
            i = 0;
            List<f62> list2 = this.$anchors;
            int i4 = this.$expandedSheetAnchor;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (((f62) it2.next()).a == i4) {
                        i2 = 1;
                        break;
                    }
                }
            }
            i2 = 0;
            List<f62> list3 = this.$anchors;
            int i5 = this.$expandedSheetAnchor;
            ListBuilder a = rcc.a();
            if (i == 0) {
                a.add(f62.a((f62) kotlin.collections.a.P(list3), -1));
            }
            a.addAll(list3);
            if (i2 == 0) {
                a.add(f62.a((f62) kotlin.collections.a.Z(list3), i5));
            }
            tpr t = kotlinx.coroutines.flow.e.t(new c(new m0(androidx.compose.runtime.f.o(new gp5(this.$bottomSheetState, 20)), kotlinx.coroutines.flow.e.K(kotlinx.coroutines.flow.e.t(androidx.compose.runtime.f.o(new gp5(this.$bottomSheetState, 19))), kotlinx.coroutines.flow.e.t(androidx.compose.runtime.f.o(new gr5(this.$listIsDraggedState, 10)))), new AnonymousClass2(3, null)), this.$bottomSheetState, this.$expandedSheetAnchor, a.j(), this.$listIsDraggedState, this.$isSelectedItemStabilizationEnabled, this.$scrollOffsetAnimatable, this.$lazyListState, this.$selectedItemVisibleIndex));
            a aVar = new a(this.$scope, this.$scrollOffsetAnimatable, this.$scrollAnimationSpec);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.I$0 = i;
            this.I$1 = i2;
            this.label = 1;
            if (t.collect(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
