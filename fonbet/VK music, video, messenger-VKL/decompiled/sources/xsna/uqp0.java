package xsna;

import androidx.room.RoomDatabase;
import java.util.ArrayList;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: InvalidationTracker.kt */
@b6l(c = "androidx.room.TriggerBasedInvalidationTracker$createFlow$1", f = "InvalidationTracker.kt", l = {233, 233, 237}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class uqp0 extends SuspendLambda implements wzs<lsr<? super Set<? extends String>>, spj<? super s3q0>, Object> {
    final /* synthetic */ boolean $emitInitialState;
    final /* synthetic */ String[] $resolvedTableNames;
    final /* synthetic */ int[] $tableIds;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ sqp0 this$0;

    /* compiled from: InvalidationTracker.kt */
    @b6l(c = "androidx.room.TriggerBasedInvalidationTracker$createFlow$1$1", f = "InvalidationTracker.kt", l = {233}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;
        final /* synthetic */ sqp0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(sqp0 sqp0Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.this$0 = sqp0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.this$0, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                sqp0 sqp0Var = this.this$0;
                this.label = 1;
                if (sqp0Var.f(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    /* compiled from: InvalidationTracker.kt */
    public static final class b<T> implements lsr {
        public final /* synthetic */ Ref$ObjectRef<int[]> b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ lsr<Set<String>> d;
        public final /* synthetic */ String[] e;
        public final /* synthetic */ int[] f;

        /* compiled from: InvalidationTracker.kt */
        @b6l(c = "androidx.room.TriggerBasedInvalidationTracker$createFlow$1$2", f = "InvalidationTracker.kt", l = {241, 250}, m = "emit")
        public static final class a extends ContinuationImpl {
            Object L$0;
            Object L$1;
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ b<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(b<? super T> bVar, spj<? super a> spjVar) {
                super(spjVar);
                this.this$0 = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(Ref$ObjectRef<int[]> ref$ObjectRef, boolean z, lsr<? super Set<String>> lsrVar, String[] strArr, int[] iArr) {
            this.b = ref$ObjectRef;
            this.c = z;
            this.d = lsrVar;
            this.e = strArr;
            this.f = iArr;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
        
            if (r6.emit(r15, r0) == r1) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00a0, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x009e, code lost:
        
            if (r6.emit(r15, r0) == r1) goto L37;
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        @Override // xsna.lsr
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(int[] iArr, spj<? super s3q0> spjVar) {
            a aVar;
            int i;
            b<T> bVar;
            Object obj;
            if (spjVar instanceof a) {
                aVar = (a) spjVar;
                int i2 = aVar.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.label = i2 - Integer.MIN_VALUE;
                    Object obj2 = aVar.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = aVar.label;
                    if (i != 0) {
                        kotlin.a.a(obj2);
                        Ref$ObjectRef<int[]> ref$ObjectRef = this.b;
                        int[] iArr2 = ref$ObjectRef.element;
                        String[] strArr = this.e;
                        lsr<Set<String>> lsrVar = this.d;
                        if (iArr2 == null) {
                            if (this.c) {
                                Set<String> y0 = rl3.y0(strArr);
                                aVar.L$0 = this;
                                aVar.L$1 = iArr;
                                aVar.label = 1;
                            }
                            bVar = this;
                            obj = iArr;
                        } else {
                            ArrayList arrayList = new ArrayList();
                            int length = strArr.length;
                            int i3 = 0;
                            int i4 = 0;
                            while (i3 < length) {
                                String str = strArr[i3];
                                int i5 = i4 + 1;
                                int[] iArr3 = ref$ObjectRef.element;
                                if (iArr3 == null) {
                                    throw new IllegalStateException("Required value was null.");
                                }
                                int i6 = this.f[i4];
                                if (iArr3[i6] != iArr[i6]) {
                                    arrayList.add(str);
                                }
                                i3++;
                                i4 = i5;
                            }
                            if (!arrayList.isEmpty()) {
                                Set<String> S0 = j5g.S0(arrayList);
                                aVar.L$0 = this;
                                aVar.L$1 = iArr;
                                aVar.label = 2;
                            }
                            bVar = this;
                            obj = iArr;
                        }
                    } else {
                        if (i != 1 && i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Object obj3 = (T) ((int[]) aVar.L$1);
                        bVar = (b) aVar.L$0;
                        kotlin.a.a(obj2);
                        obj = obj3;
                    }
                    bVar.b.element = (T) obj;
                    return s3q0.a;
                }
            }
            aVar = new a(this, spjVar);
            Object obj22 = aVar.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = aVar.label;
            if (i != 0) {
            }
            bVar.b.element = (T) obj;
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uqp0(sqp0 sqp0Var, int[] iArr, boolean z, String[] strArr, spj<? super uqp0> spjVar) {
        super(2, spjVar);
        this.this$0 = sqp0Var;
        this.$tableIds = iArr;
        this.$emitInitialState = z;
        this.$resolvedTableNames = strArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        uqp0 uqp0Var = new uqp0(this.this$0, this.$tableIds, this.$emitInitialState, this.$resolvedTableNames, spjVar);
        uqp0Var.L$0 = obj;
        return uqp0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(lsr<? super Set<? extends String>> lsrVar, spj<? super s3q0> spjVar) {
        return ((uqp0) create(lsrVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x008a, code lost:
    
        if (r12.a(r4, r11) != r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0068, code lost:
    
        if (xsna.myc0.k((kotlin.coroutines.d) r12, r5, r11) == r0) goto L28;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        lsr lsrVar;
        lsr lsrVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                lsr lsrVar3 = (lsr) this.L$0;
                if (this.this$0.h.a(this.$tableIds)) {
                    RoomDatabase roomDatabase = this.this$0.a;
                    this.L$0 = lsrVar3;
                    this.label = 1;
                    kotlin.coroutines.d b2 = u370.b(roomDatabase, false, this);
                    if (b2 != coroutineSingletons) {
                        lsrVar2 = lsrVar3;
                        obj = b2;
                    }
                    return coroutineSingletons;
                }
                lsrVar = lsrVar3;
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                dr70 dr70Var = this.this$0.i;
                b bVar = new b(ref$ObjectRef, this.$emitInitialState, lsrVar, this.$resolvedTableNames, this.$tableIds);
                this.L$0 = null;
                this.label = 3;
            } else if (i == 1) {
                lsrVar2 = (lsr) this.L$0;
                kotlin.a.a(obj);
            } else {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    throw new KotlinNothingValueException();
                }
                lsrVar2 = (lsr) this.L$0;
                kotlin.a.a(obj);
                lsrVar = lsrVar2;
                Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                dr70 dr70Var2 = this.this$0.i;
                b bVar2 = new b(ref$ObjectRef2, this.$emitInitialState, lsrVar, this.$resolvedTableNames, this.$tableIds);
                this.L$0 = null;
                this.label = 3;
            }
            a aVar = new a(this.this$0, null);
            this.L$0 = lsrVar2;
            this.label = 2;
        } catch (Throwable th) {
            this.this$0.h.b(this.$tableIds);
            throw th;
        }
    }
}
