package com.ybsdk.core.common.data.cache;

import com.yandex.passport.sloth.ui.dependencies.m;
import defpackage.l8x;
import defpackage.lrp0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.x4c;
import defpackage.zy11;
import java.io.File;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.core.common.data.cache.ResponseCache$dropAll$1", f = "ResponseCache.kt", l = {303}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ResponseCache$dropAll$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.ybsdk.core.common.data.cache.ResponseCache$dropAll$1$1", f = "ResponseCache.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.ybsdk.core.common.data.cache.ResponseCache$dropAll$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(b bVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
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
            Object failure;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            r0 r0Var = this.this$0.i;
            Map f = kotlin.collections.b.f();
            r0Var.getClass();
            r0Var.m(null, f);
            this.this$0.j.clear();
            m mVar = this.this$0.h;
            zy11 zy11Var = zy11.a;
            if (mVar != null) {
                File file = (File) mVar.h;
                File file2 = (File) mVar.g;
                File file3 = (File) mVar.f;
                File file4 = (File) mVar.e;
                try {
                    file4.delete();
                    file3.delete();
                    kotlin.io.b.l(file2);
                    kotlin.io.b.l(file);
                    file4.createNewFile();
                    file3.createNewFile();
                    file2.mkdir();
                    file.mkdir();
                    failure = zy11Var;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    x4c.g("Failed to clean persistent storage", a, null, Collections.singletonList(lrp0.z), 4);
                }
            }
            this.this$0.k.clear();
            Iterator it = this.this$0.l.entrySet().iterator();
            while (it.hasNext()) {
                ((l8x) ((Map.Entry) it.next()).getValue()).a(null);
            }
            this.this$0.l.clear();
            return zy11Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResponseCache$dropAll$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ResponseCache$dropAll$1 responseCache$dropAll$1 = new ResponseCache$dropAll$1(this.this$0, continuation);
        responseCache$dropAll$1.L$0 = obj;
        return responseCache$dropAll$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ResponseCache$dropAll$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tse tseVar = (tse) this.L$0;
            b bVar = this.this$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(bVar, null);
            this.label = 1;
            if (bVar.f(tseVar, "Failed to drop all cache", null, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            ((Result) obj).getClass();
        }
        return zy11.a;
    }
}
