package com.yandex.go.design.compose.images;

import androidx.compose.runtime.f;
import defpackage.b2k;
import defpackage.igd;
import defpackage.jl40;
import defpackage.mgd;
import defpackage.mvg;
import defpackage.n8v;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.tbv;
import defpackage.tse;
import defpackage.vng;
import defpackage.vwy;
import defpackage.wls;
import defpackage.wwy;
import defpackage.xpy;
import defpackage.xwy;
import defpackage.yow;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.design.compose.images.LoadingImageModelStateHolder$onRemembered$1", f = "LoadImageStateExtentions.kt", l = {HProv.PP_NK_SYNC}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class LoadingImageModelStateHolder$onRemembered$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Pair;", "Ltbv;", "Lmgd;", "<destruct>", "Lzy11;", "<anonymous>", "(Lkotlin/Pair;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.design.compose.images.LoadingImageModelStateHolder$onRemembered$1$3", f = "LoadImageStateExtentions.kt", l = {HProv.PP_PASSWD_TERM}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.design.compose.images.LoadingImageModelStateHolder$onRemembered$1$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(b bVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((Pair) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            oz40 oz40Var;
            Pair pair = (Pair) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            Object obj2 = vwy.a;
            if (i == 0) {
                kotlin.b.b(obj);
                tbv tbvVar = (tbv) pair.getFirst();
                mgd mgdVar = (mgd) pair.getSecond();
                if (jl40.l(this.this$0.y.getValue(), obj2)) {
                    this.this$0.y.setValue(wwy.a);
                }
                b bVar = this.this$0;
                oz40 oz40Var2 = bVar.y;
                igd igdVar = bVar.c;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = oz40Var2;
                this.label = 1;
                obj = a.a(igdVar, tbvVar, null, mgdVar, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                oz40Var = oz40Var2;
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oz40Var = (oz40) this.L$3;
                kotlin.b.b(obj);
            }
            n8v n8vVar = (n8v) obj;
            if (n8vVar != null) {
                obj2 = new xwy(n8vVar);
            }
            oz40Var.setValue(obj2);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingImageModelStateHolder$onRemembered$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LoadingImageModelStateHolder$onRemembered$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LoadingImageModelStateHolder$onRemembered$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b2k l = vng.l(f.o(new yow(17, this.this$0)), new xpy(5), vng.c);
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
            this.label = 1;
            if (e.k(l, anonymousClass3, this) == coroutineSingletons) {
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
