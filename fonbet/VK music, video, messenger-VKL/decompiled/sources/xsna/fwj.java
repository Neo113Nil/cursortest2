package xsna;

import android.os.CancellationSignal;
import androidx.room.RoomDatabase;
import androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1;
import java.util.concurrent.Callable;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: CoroutinesRoom.android.kt */
/* loaded from: classes.dex */
public final class fwj {
    public static final a a = new a();

    /* compiled from: CoroutinesRoom.android.kt */
    public static final class a {

        /* compiled from: CoroutinesRoom.android.kt */
        @b6l(c = "androidx.room.CoroutinesRoom$Companion", f = "CoroutinesRoom.android.kt", l = {48, 49}, m = "execute")
        /* renamed from: xsna.fwj$a$a, reason: collision with other inner class name */
        /* loaded from: classes12.dex */
        public static final class C2897a<R> extends ContinuationImpl {
            Object L$0;
            int label;
            /* synthetic */ Object result;

            public C2897a(spj<? super C2897a> spjVar) {
                super(spjVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return a.this.b(null, false, null, this);
            }
        }

        /* JADX INFO: Add missing generic type declarations: [R] */
        /* compiled from: CoroutinesRoom.android.kt */
        @b6l(c = "androidx.room.CoroutinesRoom$Companion$execute$2", f = "CoroutinesRoom.android.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes12.dex */
        public static final class b<R> extends SuspendLambda implements wzs<yvj, spj<? super R>, Object> {
            final /* synthetic */ Callable<R> $callable;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Callable<R> callable, spj<? super b> spjVar) {
                super(2, spjVar);
                this.$callable = callable;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new b(this.$callable, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, Object obj) {
                return ((b) create(yvjVar, (spj) obj)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return this.$callable.call();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x0075, code lost:
        
            if (r9 == r1) goto L31;
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00ad A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00ae A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        @ozl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object a(RoomDatabase roomDatabase, CancellationSignal cancellationSignal, Callable callable, spj spjVar) {
            gwj gwjVar;
            int i;
            hpj hpjVar;
            if (spjVar instanceof gwj) {
                gwjVar = (gwj) spjVar;
                int i2 = gwjVar.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    gwjVar.label = i2 - Integer.MIN_VALUE;
                    Object obj = gwjVar.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = gwjVar.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        if (roomDatabase.s() && roomDatabase.p()) {
                            return callable.call();
                        }
                        gwjVar.L$0 = roomDatabase;
                        gwjVar.L$1 = cancellationSignal;
                        gwjVar.L$2 = callable;
                        gwjVar.label = 1;
                        obj = u370.b(roomDatabase, false, gwjVar);
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.a.a(obj);
                            return obj;
                        }
                        callable = (Callable) gwjVar.L$2;
                        cancellationSignal = (CancellationSignal) gwjVar.L$1;
                        roomDatabase = (RoomDatabase) gwjVar.L$0;
                        kotlin.a.a(obj);
                    }
                    kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj;
                    gwjVar.L$0 = roomDatabase;
                    gwjVar.L$1 = cancellationSignal;
                    gwjVar.L$2 = callable;
                    gwjVar.L$3 = dVar;
                    gwjVar.label = 2;
                    lq9 lq9Var = new lq9(1, s7s0.c(gwjVar));
                    lq9Var.o();
                    hpjVar = roomDatabase.b;
                    if (hpjVar == null) {
                        hpjVar = null;
                    }
                    lq9Var.r(new hwj(cancellationSignal, myc0.h(hpjVar, dVar, null, new iwj(callable, lq9Var, null), 2)));
                    Object n = lq9Var.n();
                    return n != obj2 ? obj2 : n;
                }
            }
            gwjVar = new gwj(this, spjVar);
            Object obj3 = gwjVar.result;
            Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = gwjVar.label;
            if (i != 0) {
            }
            kotlin.coroutines.d dVar2 = (kotlin.coroutines.d) obj3;
            gwjVar.L$0 = roomDatabase;
            gwjVar.L$1 = cancellationSignal;
            gwjVar.L$2 = callable;
            gwjVar.L$3 = dVar2;
            gwjVar.label = 2;
            lq9 lq9Var2 = new lq9(1, s7s0.c(gwjVar));
            lq9Var2.o();
            hpjVar = roomDatabase.b;
            if (hpjVar == null) {
            }
            lq9Var2.r(new hwj(cancellationSignal, myc0.h(hpjVar, dVar2, null, new iwj(callable, lq9Var2, null), 2)));
            Object n2 = lq9Var2.n();
            if (n2 != obj22) {
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0057, code lost:
        
            if (r9 == r1) goto L28;
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x006c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x006d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        @ozl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final <R> Object b(RoomDatabase roomDatabase, boolean z, Callable<R> callable, spj<? super R> spjVar) {
            C2897a c2897a;
            int i;
            if (spjVar instanceof C2897a) {
                c2897a = (C2897a) spjVar;
                int i2 = c2897a.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c2897a.label = i2 - Integer.MIN_VALUE;
                    Object obj = c2897a.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = c2897a.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        if (roomDatabase.s() && roomDatabase.p()) {
                            return callable.call();
                        }
                        c2897a.L$0 = callable;
                        c2897a.label = 1;
                        obj = u370.b(roomDatabase, z, c2897a);
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.a.a(obj);
                            return obj;
                        }
                        callable = (Callable) c2897a.L$0;
                        kotlin.a.a(obj);
                    }
                    b bVar = new b(callable, null);
                    c2897a.L$0 = null;
                    c2897a.label = 2;
                    Object k = myc0.k((kotlin.coroutines.d) obj, bVar, c2897a);
                    return k != obj2 ? obj2 : k;
                }
            }
            c2897a = new C2897a(spjVar);
            Object obj3 = c2897a.result;
            Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = c2897a.label;
            if (i != 0) {
            }
            b bVar2 = new b(callable, null);
            c2897a.L$0 = null;
            c2897a.label = 2;
            Object k2 = myc0.k((kotlin.coroutines.d) obj3, bVar2, c2897a);
            if (k2 != obj22) {
            }
        }
    }

    @ozl
    public static final FlowUtil$createFlow$$inlined$map$1 a(RoomDatabase roomDatabase, String[] strArr, Callable callable) {
        return qz9.d(roomDatabase, false, strArr, new zdf(callable, 1));
    }
}
