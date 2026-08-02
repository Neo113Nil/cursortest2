package com.yandex.go.navigator.driving;

import android.graphics.drawable.BitmapDrawable;
import defpackage.bme;
import defpackage.cme;
import defpackage.g6u;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.vjm;
import defpackage.wls;
import defpackage.zy11;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.design.ListItemComponent;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.driving.DrivingButtonWithIconMapper$mapControlButton$2$1", f = "DrivingButtonWithIconMapper.kt", l = {90, 91}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class DrivingButtonWithIconMapper$mapControlButton$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ cme $icon;
    final /* synthetic */ WeakReference<ListItemComponent> $weakRef;
    Object L$0;
    int label;
    final /* synthetic */ vjm this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.navigator.driving.DrivingButtonWithIconMapper$mapControlButton$2$1$1", f = "DrivingButtonWithIconMapper.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.navigator.driving.DrivingButtonWithIconMapper$mapControlButton$2$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ BitmapDrawable $drawable;
        final /* synthetic */ WeakReference<ListItemComponent> $weakRef;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(WeakReference weakReference, BitmapDrawable bitmapDrawable, Continuation continuation) {
            super(2, continuation);
            this.$weakRef = weakReference;
            this.$drawable = bitmapDrawable;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$weakRef, this.$drawable, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((tse) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            ListItemComponent listItemComponent = this.$weakRef.get();
            if (listItemComponent != null) {
                listItemComponent.setLeadImage(this.$drawable);
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrivingButtonWithIconMapper$mapControlButton$2$1(vjm vjmVar, cme cmeVar, WeakReference weakReference, Continuation continuation) {
        super(2, continuation);
        this.this$0 = vjmVar;
        this.$icon = cmeVar;
        this.$weakRef = weakReference;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DrivingButtonWithIconMapper$mapControlButton$2$1(this.this$0, this.$icon, this.$weakRef, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DrivingButtonWithIconMapper$mapControlButton$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        if (r8 == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.widget.utils.e eVar = this.this$0.c;
            String str = ((bme) this.$icon).a;
            this.label = 1;
            obj = ru.yandex.taxi.widget.utils.e.f(eVar, str, null, this, 6);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11Var;
            }
            kotlin.b.b(obj);
        }
        BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
        if (bitmapDrawable != null) {
            this.this$0.a.getClass();
            sjh sjhVar = uyj.a;
            g6u g6uVar = o400.a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$weakRef, bitmapDrawable, null);
            this.L$0 = null;
            this.label = 2;
            if (tje.k0(g6uVar, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return zy11Var;
    }
}
