package ru.rustore.sdk.pushclient.n;

import com.vk.push.common.Logger;
import com.vk.push.common.component.TopicComponent;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.d5o0;
import xsna.go9;
import xsna.i6z0;
import xsna.r7z0;
import xsna.s3q0;
import xsna.spj;

/* loaded from: classes9.dex */
public final class h implements TopicComponent {
    public final i6z0 b;
    public final r7z0 c;
    public final Logger d;

    @b6l(c = "ru.rustore.sdk.pushclient.internal.domain.component.TopicComponentImpl", f = "TopicComponentImpl.kt", l = {22}, m = "subscribeToTopic")
    public static final class a extends ContinuationImpl {
        public d5o0.a a;
        public /* synthetic */ Object b;
        public int d;

        public a(spj<? super a> spjVar) {
            super(spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return h.this.subscribeToTopic(null, null, this);
        }
    }

    @b6l(c = "ru.rustore.sdk.pushclient.internal.domain.component.TopicComponentImpl", f = "TopicComponentImpl.kt", l = {32}, m = "unsubscribeFromTopic")
    public static final class b extends ContinuationImpl {
        public d5o0.a a;
        public /* synthetic */ Object b;
        public int d;

        public b(spj<? super b> spjVar) {
            super(spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return h.this.unsubscribeFromTopic(null, null, this);
        }
    }

    public h(i6z0 i6z0Var, r7z0 r7z0Var, Logger logger) {
        this.b = i6z0Var;
        this.c = r7z0Var;
        this.d = logger.createLogger("TopicComponent");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.vk.push.common.component.TopicComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object subscribeToTopic(String str, d5o0<s3q0>.a aVar, spj<? super s3q0> spjVar) {
        a aVar2;
        int i;
        Object a2;
        Throwable a3;
        if (spjVar instanceof a) {
            aVar2 = (a) spjVar;
            int i2 = aVar2.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar2.d = i2 - Integer.MIN_VALUE;
                Object obj = aVar2.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aVar2.d;
                if (i != 0) {
                    kotlin.a.a(obj);
                    Logger.DefaultImpls.info$default(this.d, go9.b("Subscribe To Topic ", str), null, 2, null);
                    aVar2.a = aVar;
                    aVar2.d = 1;
                    a2 = this.b.a(str, aVar2);
                    if (a2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = aVar2.a;
                    kotlin.a.a(obj);
                    a2 = ((Result) obj).d();
                }
                if (!(a2 instanceof Result.Failure)) {
                    aVar.b((s3q0) a2);
                }
                a3 = Result.a(a2);
                if (a3 != null) {
                    aVar.a(a3);
                }
                return s3q0.a;
            }
        }
        aVar2 = new a(spjVar);
        Object obj2 = aVar2.b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar2.d;
        if (i != 0) {
        }
        if (!(a2 instanceof Result.Failure)) {
        }
        a3 = Result.a(a2);
        if (a3 != null) {
        }
        return s3q0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.vk.push.common.component.TopicComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object unsubscribeFromTopic(String str, d5o0<s3q0>.a aVar, spj<? super s3q0> spjVar) {
        b bVar;
        int i;
        Object a2;
        Throwable a3;
        if (spjVar instanceof b) {
            bVar = (b) spjVar;
            int i2 = bVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.d = i2 - Integer.MIN_VALUE;
                Object obj = bVar.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bVar.d;
                if (i != 0) {
                    kotlin.a.a(obj);
                    Logger.DefaultImpls.info$default(this.d, go9.b("Unsubscribe From Topic ", str), null, 2, null);
                    bVar.a = aVar;
                    bVar.d = 1;
                    a2 = this.c.a(str, bVar);
                    if (a2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = bVar.a;
                    kotlin.a.a(obj);
                    a2 = ((Result) obj).d();
                }
                if (!(a2 instanceof Result.Failure)) {
                    aVar.b((s3q0) a2);
                }
                a3 = Result.a(a2);
                if (a3 != null) {
                    aVar.a(a3);
                }
                return s3q0.a;
            }
        }
        bVar = new b(spjVar);
        Object obj2 = bVar.b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bVar.d;
        if (i != 0) {
        }
        if (!(a2 instanceof Result.Failure)) {
        }
        a3 = Result.a(a2);
        if (a3 != null) {
        }
        return s3q0.a;
    }
}
