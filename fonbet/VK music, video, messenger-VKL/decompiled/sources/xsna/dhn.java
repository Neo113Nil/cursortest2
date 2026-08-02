package xsna;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: Distinct.kt */
/* loaded from: classes11.dex */
public final class dhn<T> implements ksr<T> {
    public final ksr<T> b;
    public final izs<T, Object> c;
    public final wzs<Object, Object, Boolean> d;

    /* compiled from: Distinct.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ dhn<T> b;
        public final /* synthetic */ Ref$ObjectRef<Object> c;
        public final /* synthetic */ lsr<T> d;

        /* compiled from: Distinct.kt */
        @b6l(c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", f = "Distinct.kt", l = {TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER}, m = "emit")
        /* renamed from: xsna.dhn$a$a, reason: collision with other inner class name */
        public static final class C2734a extends ContinuationImpl {
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ a<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C2734a(a<? super T> aVar, spj<? super C2734a> spjVar) {
                super(spjVar);
                this.this$0 = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(dhn<T> dhnVar, Ref$ObjectRef<Object> ref$ObjectRef, lsr<? super T> lsrVar) {
            this.b = dhnVar;
            this.c = ref$ObjectRef;
            this.d = lsrVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // xsna.lsr
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(T t, spj<? super s3q0> spjVar) {
            C2734a c2734a;
            int i;
            if (spjVar instanceof C2734a) {
                c2734a = (C2734a) spjVar;
                int i2 = c2734a.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c2734a.label = i2 - Integer.MIN_VALUE;
                    Object obj = c2734a.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = c2734a.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        dhn<T> dhnVar = this.b;
                        T t2 = (T) dhnVar.c.invoke(t);
                        Ref$ObjectRef<Object> ref$ObjectRef = this.c;
                        Object obj2 = ref$ObjectRef.element;
                        if (obj2 != tyx.h && dhnVar.d.invoke(obj2, t2).booleanValue()) {
                            return s3q0.a;
                        }
                        ref$ObjectRef.element = t2;
                        c2734a.label = 1;
                        if (this.d.emit(t, c2734a) == coroutineSingletons) {
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
            c2734a = new C2734a(this, spjVar);
            Object obj3 = c2734a.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = c2734a.label;
            if (i != 0) {
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public dhn(ksr<? extends T> ksrVar, izs<? super T, ? extends Object> izsVar, wzs<Object, Object, Boolean> wzsVar) {
        this.b = ksrVar;
        this.c = izsVar;
        this.d = wzsVar;
    }

    @Override // xsna.ksr
    public final Object collect(lsr<? super T> lsrVar, spj<? super s3q0> spjVar) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = (T) tyx.h;
        Object collect = this.b.collect(new a(this, ref$ObjectRef, lsrVar), spjVar);
        return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
    }
}
