package com.yandex.go.walking.navigation.impl.ui.overlay;

import com.yandex.runtime.image.ImageProvider;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sq00;
import defpackage.tls;
import defpackage.vwg0;
import defpackage.wls;
import defpackage.xng0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", "Lcom/yandex/runtime/image/ImageProvider;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.walking.navigation.impl.ui.overlay.WalkNavPlacemarksPresenter$prepareStartEndPins$2", f = "WalkNavPlacemarksPresenter.kt", l = {139}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class WalkNavPlacemarksPresenter$prepareStartEndPins$2 extends SuspendLambda implements tls {
    int label;
    final /* synthetic */ e this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsq00;", "pinInfo", "Lbl00;", "<anonymous>", "(Lsq00;)Lbl00;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.walking.navigation.impl.ui.overlay.WalkNavPlacemarksPresenter$prepareStartEndPins$2$1", f = "WalkNavPlacemarksPresenter.kt", l = {144}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.walking.navigation.impl.ui.overlay.WalkNavPlacemarksPresenter$prepareStartEndPins$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ e this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(e eVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((sq00) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            sq00 sq00Var = (sq00) this.L$0;
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
            com.yandex.go.pin.api.widget.b bVar = this.this$0.D;
            this.L$0 = null;
            this.label = 1;
            Object e = bVar.e(sq00Var, this);
            return e == coroutineSingletons ? coroutineSingletons : e;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalkNavPlacemarksPresenter$prepareStartEndPins$2(e eVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new WalkNavPlacemarksPresenter$prepareStartEndPins$2(this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((WalkNavPlacemarksPresenter$prepareStartEndPins$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        WalkNavPlacemarksPresenter$prepareStartEndPins$2 walkNavPlacemarksPresenter$prepareStartEndPins$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            e eVar = this.this$0;
            int i2 = vwg0.ic_pin_destination_point;
            int i3 = xng0.controlMain;
            int i4 = xng0.textOnControl;
            ImageProvider imageProvider = eVar.L;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(eVar, null);
            this.label = 1;
            walkNavPlacemarksPresenter$prepareStartEndPins$2 = this;
            obj = e.Ng(eVar, i2, i3, i4, imageProvider, anonymousClass1, walkNavPlacemarksPresenter$prepareStartEndPins$2);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            walkNavPlacemarksPresenter$prepareStartEndPins$2 = this;
        }
        walkNavPlacemarksPresenter$prepareStartEndPins$2.this$0.L = (ImageProvider) obj;
        return obj;
    }
}
