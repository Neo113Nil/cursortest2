package ru.rustore.sdk.pushclient.w;

import com.vk.push.common.clientid.ClientId;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.rustore.sdk.pushclient.a.a;
import ru.rustore.sdk.pushclient.s.b;
import xsna.b6l;
import xsna.bdn;
import xsna.jay0;
import xsna.kay0;
import xsna.myc0;
import xsna.pvy0;
import xsna.s3q0;
import xsna.s9y0;
import xsna.spj;
import xsna.wgl;
import xsna.wzs;
import xsna.yvj;

/* loaded from: classes9.dex */
public final class c implements jay0 {
    public final pvy0 a;
    public final s9y0 b;
    public final wgl c;

    @b6l(c = "ru.rustore.sdk.pushclient.internal.push.PushTokenRepositoryImpl", f = "PushTokenRepositoryImpl.kt", l = {23}, m = "deletePushToken-gIAlu-s")
    public final class a extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public a(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            Object b = c.this.b(null, this);
            return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : new Result(b);
        }
    }

    @b6l(c = "ru.rustore.sdk.pushclient.internal.push.PushTokenRepositoryImpl$deletePushToken$2", f = "PushTokenRepositoryImpl.kt", l = {24, 25}, m = "invokeSuspend")
    public final class b extends SuspendLambda implements wzs<yvj, spj<? super Result<? extends s3q0>>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, spj<? super b> spjVar) {
            super(2, spjVar);
            this.d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return c.this.new b(this.d, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super Result<? extends s3q0>> spjVar) {
            return c.this.new b(this.d, spjVar).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
        
            if (r1.g(r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
        
            if (r5 == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object b;
            Object obj2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.b;
            if (i == 0) {
                kotlin.a.a(obj);
                pvy0 pvy0Var = c.this.a;
                String str = this.d;
                this.b = 1;
                b = pvy0Var.b(str, this);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = this.a;
                    kotlin.a.a(obj);
                    return new Result(obj2);
                }
                kotlin.a.a(obj);
                b = ((Result) obj).d();
            }
            c cVar = c.this;
            if (!(b instanceof Result.Failure)) {
                s9y0 s9y0Var = cVar.b;
                this.a = b;
                this.b = 2;
            }
            obj2 = b;
            return new Result(obj2);
        }
    }

    @b6l(c = "ru.rustore.sdk.pushclient.internal.push.PushTokenRepositoryImpl", f = "PushTokenRepositoryImpl.kt", l = {36}, m = "getCurrentPushToken-JT9GLNw")
    /* renamed from: ru.rustore.sdk.pushclient.w.c$c, reason: collision with other inner class name */
    public final class C2409c extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public C2409c(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            Object a = c.this.a(this);
            return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : new kay0((String) a);
        }
    }

    @b6l(c = "ru.rustore.sdk.pushclient.internal.push.PushTokenRepositoryImpl$getCurrentPushToken$2", f = "PushTokenRepositoryImpl.kt", l = {37}, m = "invokeSuspend")
    public final class d extends SuspendLambda implements wzs<yvj, spj<? super kay0>, Object> {
        public int a;

        public d(spj<? super d> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return c.this.new d(spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super kay0> spjVar) {
            return c.this.new d(spjVar).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object d;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.a;
            if (i == 0) {
                kotlin.a.a(obj);
                s9y0 s9y0Var = c.this.b;
                this.a = 1;
                d = s9y0Var.d(this);
                if (d == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                d = ((kay0) obj).a;
            }
            return new kay0((String) d);
        }
    }

    @b6l(c = "ru.rustore.sdk.pushclient.internal.push.PushTokenRepositoryImpl", f = "PushTokenRepositoryImpl.kt", l = {18}, m = "getNewPushToken-0E7RQCE")
    public static final class e extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public e(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            Object d = c.this.d(null, null, this);
            return d == CoroutineSingletons.COROUTINE_SUSPENDED ? d : new Result(d);
        }
    }

    @b6l(c = "ru.rustore.sdk.pushclient.internal.push.PushTokenRepositoryImpl$getNewPushToken$2", f = "PushTokenRepositoryImpl.kt", l = {19}, m = "invokeSuspend")
    public static final class f extends SuspendLambda implements wzs<yvj, spj<? super Result<? extends kay0>>, Object> {
        public int a;
        public final /* synthetic */ String c;
        public final /* synthetic */ ClientId d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, ClientId clientId, spj<? super f> spjVar) {
            super(2, spjVar);
            this.c = str;
            this.d = clientId;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return c.this.new f(this.c, this.d, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super Result<? extends kay0>> spjVar) {
            return ((f) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.a;
            if (i == 0) {
                kotlin.a.a(obj);
                pvy0 pvy0Var = c.this.a;
                String str = this.c;
                ClientId clientId = this.d;
                this.a = 1;
                a = pvy0Var.a(str, clientId, this);
                if (a == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                a = ((Result) obj).d();
            }
            return new Result(a);
        }
    }

    public c(pvy0 pvy0Var, s9y0 s9y0Var) {
        bdn bdnVar = bdn.a;
        wgl wglVar = wgl.c;
        this.a = pvy0Var;
        this.b = s9y0Var;
        this.c = wglVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xsna.jay0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        C2409c c2409c;
        int i;
        if (continuationImpl instanceof C2409c) {
            c2409c = (C2409c) continuationImpl;
            int i2 = c2409c.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2409c.c = i2 - Integer.MIN_VALUE;
                Object obj = c2409c.a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = c2409c.c;
                if (i != 0) {
                    kotlin.a.a(obj);
                    d dVar = new d(null);
                    c2409c.c = 1;
                    obj = myc0.k(this.c, dVar, c2409c);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return ((kay0) obj).a;
            }
        }
        c2409c = new C2409c(continuationImpl);
        Object obj2 = c2409c.a;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = c2409c.c;
        if (i != 0) {
        }
        return ((kay0) obj2).a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xsna.jay0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        a aVar;
        int i;
        if (continuationImpl instanceof a) {
            aVar = (a) continuationImpl;
            int i2 = aVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.c = i2 - Integer.MIN_VALUE;
                Object obj = aVar.a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aVar.c;
                if (i != 0) {
                    kotlin.a.a(obj);
                    b bVar = new b(str, null);
                    aVar.c = 1;
                    obj = myc0.k(this.c, bVar, aVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return ((Result) obj).d();
            }
        }
        aVar = new a(continuationImpl);
        Object obj2 = aVar.a;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.c;
        if (i != 0) {
        }
        return ((Result) obj2).d();
    }

    @Override // xsna.jay0
    public final Object c(b.a aVar) {
        Object k = myc0.k(this.c, new ru.rustore.sdk.pushclient.w.b(this, null), aVar);
        return k == CoroutineSingletons.COROUTINE_SUSPENDED ? k : s3q0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // xsna.jay0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, ClientId clientId, spj<? super Result<kay0>> spjVar) {
        e eVar;
        int i;
        if (spjVar instanceof e) {
            eVar = (e) spjVar;
            int i2 = eVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.c = i2 - Integer.MIN_VALUE;
                Object obj = eVar.a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = eVar.c;
                if (i != 0) {
                    kotlin.a.a(obj);
                    f fVar = new f(str, clientId, null);
                    eVar.c = 1;
                    obj = myc0.k(this.c, fVar, eVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return ((Result) obj).d();
            }
        }
        eVar = new e((ContinuationImpl) spjVar);
        Object obj2 = eVar.a;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = eVar.c;
        if (i != 0) {
        }
        return ((Result) obj2).d();
    }

    @Override // xsna.jay0
    public final Object e(String str, a.d dVar) {
        return myc0.k(this.c, new ru.rustore.sdk.pushclient.w.d(this, str, null), dVar);
    }
}
