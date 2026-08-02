package com.yandex.go.taxi.order.chat.web_preloading;

import android.view.ViewGroup;
import defpackage.b2k;
import defpackage.bkx0;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.vng;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.chat.web_preloading.TaxiOrderWebMessengerPreloaderImpl$attach$1", f = "TaxiOrderWebMessengerPreloaderImpl.kt", l = {35, 43}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TaxiOrderWebMessengerPreloaderImpl$attach$1 extends SuspendLambda implements wls {
    final /* synthetic */ ViewGroup $preloadContainer;
    boolean Z$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiOrderWebMessengerPreloaderImpl$attach$1(ViewGroup viewGroup, b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$preloadContainer = viewGroup;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TaxiOrderWebMessengerPreloaderImpl$attach$1(this.$preloadContainer, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TaxiOrderWebMessengerPreloaderImpl$attach$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002a, code lost:
    
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
            com.yandex.go.taxi.order.chat.experiments.b bVar = this.this$0.f;
            this.label = 1;
            obj = bVar.a(this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (booleanValue) {
            b2k l = vng.l(e.X(new mth(((com.yandex.go.taxi.order.provider.a) this.this$0.d).v(), 6), new TaxiOrderWebMessengerPreloaderImpl$attach$1$invokeSuspend$$inlined$flatMapLatest$1(3, null)), new bkx0(26), vng.c);
            a aVar = new a(this.this$0, this.$preloadContainer);
            this.Z$0 = booleanValue;
            this.label = 2;
            if (l.collect(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return zy11Var;
    }
}
