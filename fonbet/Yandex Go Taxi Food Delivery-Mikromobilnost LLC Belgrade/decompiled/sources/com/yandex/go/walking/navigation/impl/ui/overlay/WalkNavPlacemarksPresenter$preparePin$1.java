package com.yandex.go.walking.navigation.impl.ui.overlay;

import com.yandex.mapkit.geometry.Point;
import com.yandex.runtime.image.ImageProvider;
import defpackage.g541;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.walking.navigation.impl.ui.overlay.WalkNavPlacemarksPresenter$preparePin$1", f = "WalkNavPlacemarksPresenter.kt", l = {156}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class WalkNavPlacemarksPresenter$preparePin$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $pinIcon;
    final /* synthetic */ Point $point;
    final /* synthetic */ WaypointType $type;
    int label;
    final /* synthetic */ e this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/runtime/image/ImageProvider;", "<anonymous>", "(Ltse;)Lcom/yandex/runtime/image/ImageProvider;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.walking.navigation.impl.ui.overlay.WalkNavPlacemarksPresenter$preparePin$1$1", f = "WalkNavPlacemarksPresenter.kt", l = {157}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.walking.navigation.impl.ui.overlay.WalkNavPlacemarksPresenter$preparePin$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ tls $pinIcon;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(tls tlsVar, Continuation continuation) {
            super(2, continuation);
            this.$pinIcon = tlsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$pinIcon, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
            tls tlsVar = this.$pinIcon;
            this.label = 1;
            Object invoke = tlsVar.invoke(this);
            return invoke == coroutineSingletons ? coroutineSingletons : invoke;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalkNavPlacemarksPresenter$preparePin$1(e eVar, tls tlsVar, Point point, WaypointType waypointType, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$pinIcon = tlsVar;
        this.$point = point;
        this.$type = waypointType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WalkNavPlacemarksPresenter$preparePin$1(this.this$0, this.$pinIcon, this.$point, this.$type, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WalkNavPlacemarksPresenter$preparePin$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.this$0.A.getClass();
            sjh sjhVar = uyj.a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$pinIcon, null);
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
        ImageProvider imageProvider = (ImageProvider) obj;
        if (imageProvider != null) {
            e eVar = this.this$0;
            ((g541) eVar.Dg()).xc(this.$point, imageProvider, this.$type);
        }
        return zy11.a;
    }
}
