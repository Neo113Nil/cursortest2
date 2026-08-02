package com.yandex.quark.webchat.js;

import defpackage.mih;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.uhg0;
import defpackage.wls;
import defpackage.xhg0;
import defpackage.zls;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.quark.webchat.js.QuarkJsFacadeRegistryImpl$observeWebCapabilities$1", f = "QuarkJsFacadeRegistry.kt", l = {HProv.PP_DELETE_SAVED_PASSWD}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class QuarkJsFacadeRegistryImpl$observeWebCapabilities$1 extends SuspendLambda implements wls {
    final /* synthetic */ uhg0 $quarkJs;
    int label;
    final /* synthetic */ d this$0;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lvpr;", "", "Lu28;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.yandex.quark.webchat.js.QuarkJsFacadeRegistryImpl$observeWebCapabilities$1$1", f = "QuarkJsFacadeRegistry.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.yandex.quark.webchat.js.QuarkJsFacadeRegistryImpl$observeWebCapabilities$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements zls {
        final /* synthetic */ uhg0 $quarkJs;
        int label;
        final /* synthetic */ d this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(uhg0 uhg0Var, d dVar, Continuation continuation) {
            super(3, continuation);
            this.this$0 = dVar;
            this.$quarkJs = uhg0Var;
        }

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            d dVar = this.this$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$quarkJs, dVar, (Continuation) obj3);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            LinkedHashMap linkedHashMap;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            r0 r0Var = this.this$0.C;
            uhg0 uhg0Var = this.$quarkJs;
            do {
                value = r0Var.getValue();
                linkedHashMap = new LinkedHashMap((Map) value);
                linkedHashMap.remove(uhg0Var);
            } while (!r0Var.k(value, linkedHashMap));
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuarkJsFacadeRegistryImpl$observeWebCapabilities$1(uhg0 uhg0Var, d dVar, Continuation continuation) {
        super(2, continuation);
        this.$quarkJs = uhg0Var;
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new QuarkJsFacadeRegistryImpl$observeWebCapabilities$1(this.$quarkJs, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((QuarkJsFacadeRegistryImpl$observeWebCapabilities$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            uhg0 uhg0Var = this.$quarkJs;
            k kVar = new k(((mih) uhg0Var).w.y, new AnonymousClass1(uhg0Var, this.this$0, null));
            xhg0 xhg0Var = new xhg0(this.this$0, this.$quarkJs, 2);
            this.label = 1;
            if (kVar.collect(xhg0Var, this) == coroutineSingletons) {
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
