package com.yandex.go.taxi.summary.verticalsummary.ui;

import defpackage.ah30;
import defpackage.b7y;
import defpackage.gyt0;
import defpackage.m3u0;
import defpackage.mvg;
import defpackage.n6y;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.rol0;
import defpackage.t6y;
import defpackage.tje;
import defpackage.tse;
import defpackage.w511;
import defpackage.wg6;
import defpackage.wls;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.verticalsummary.ui.StabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$2$1", f = "StabilizedLazyColumnWithBottomSheetEffect.kt", l = {208}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class StabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ wg6 $bottomSheetState;
    final /* synthetic */ oz40 $isSelectedItemStabilizationEnabled;
    final /* synthetic */ androidx.compose.foundation.lazy.b $lazyListState;
    final /* synthetic */ m3u0 $listIsDraggedState;
    final /* synthetic */ tse $scope;
    final /* synthetic */ androidx.compose.animation.core.a $scrollOffsetAnimatable;
    final /* synthetic */ Integer $stabilizedItemIndex;
    int I$0;
    int I$1;
    int label;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.taxi.summary.verticalsummary.ui.StabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$2$1$1", f = "StabilizedLazyColumnWithBottomSheetEffect.kt", l = {201}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.summary.verticalsummary.ui.StabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$2$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ int $initialOffset;
        final /* synthetic */ androidx.compose.animation.core.a $scrollOffsetAnimatable;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(androidx.compose.animation.core.a aVar, int i, Continuation continuation) {
            super(2, continuation);
            this.$scrollOffsetAnimatable = aVar;
            this.$initialOffset = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$scrollOffsetAnimatable, this.$initialOffset, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                androidx.compose.animation.core.a aVar = this.$scrollOffsetAnimatable;
                Float f = new Float(-this.$initialOffset);
                this.label = 1;
                if (aVar.f(f, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$2$1(Integer num, androidx.compose.foundation.lazy.b bVar, tse tseVar, androidx.compose.animation.core.a aVar, wg6 wg6Var, m3u0 m3u0Var, oz40 oz40Var, Continuation continuation) {
        super(2, continuation);
        this.$stabilizedItemIndex = num;
        this.$lazyListState = bVar;
        this.$scope = tseVar;
        this.$scrollOffsetAnimatable = aVar;
        this.$bottomSheetState = wg6Var;
        this.$listIsDraggedState = m3u0Var;
        this.$isSelectedItemStabilizationEnabled = oz40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$2$1(this.$stabilizedItemIndex, this.$lazyListState, this.$scope, this.$scrollOffsetAnimatable, this.$bottomSheetState, this.$listIsDraggedState, this.$isSelectedItemStabilizationEnabled, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((StabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        int i;
        long e;
        int i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        zy11 zy11Var = zy11.a;
        if (i3 != 0) {
            if (i3 == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        Integer num = this.$stabilizedItemIndex;
        if (num != null) {
            int intValue = num.intValue();
            androidx.compose.foundation.lazy.b bVar = this.$lazyListState;
            Iterator it = bVar.j().k.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (((t6y) ((n6y) obj2)).a == intValue) {
                    break;
                }
            }
            n6y n6yVar = (n6y) obj2;
            if (n6yVar != null) {
                i2 = ((t6y) n6yVar).o;
            } else {
                n6y n6yVar2 = (n6y) kotlin.collections.a.R(bVar.j().k);
                boolean z = (n6yVar2 != null ? ((t6y) n6yVar2).a : 0) < intValue;
                if (z) {
                    i = -1;
                } else {
                    if (z) {
                        w511.b();
                        return null;
                    }
                    i = 1;
                }
                int i4 = b7y.a[bVar.j().o.ordinal()];
                if (i4 == 1) {
                    e = bVar.j().e() >> 32;
                } else {
                    if (i4 != 2) {
                        w511.b();
                        return null;
                    }
                    e = bVar.j().e() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                }
                i2 = ((int) e) * i;
            }
            tje.N(this.$scope, null, CoroutineStart.UNDISPATCHED, new AnonymousClass1(this.$scrollOffsetAnimatable, i2, null), 1);
            rol0 o = androidx.compose.runtime.f.o(new gyt0(0, this.$bottomSheetState, this.$scrollOffsetAnimatable));
            ah30 ah30Var = new ah30(intValue, this.$isSelectedItemStabilizationEnabled, this.$listIsDraggedState, this.$lazyListState);
            this.I$0 = intValue;
            this.I$1 = i2;
            this.label = 1;
            if (o.collect(ah30Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return zy11Var;
    }
}
