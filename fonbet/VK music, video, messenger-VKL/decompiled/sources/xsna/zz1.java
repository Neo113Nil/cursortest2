package xsna;

import androidx.compose.material3.internal.AnchoredDragFinishedSignal;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineStart;

/* compiled from: AnchoredDraggable.kt */
@b6l(c = "androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2", f = "AnchoredDraggable.kt", l = {708}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class zz1 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ wzs<Object, spj<? super s3q0>, Object> $block;
    final /* synthetic */ gzs<Object> $inputs;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: AnchoredDraggable.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ Ref$ObjectRef<eyx> b;
        public final /* synthetic */ yvj c;
        public final /* synthetic */ wzs<Object, spj<? super s3q0>, Object> d;

        /* compiled from: AnchoredDraggable.kt */
        @b6l(c = "androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1$2", f = "AnchoredDraggable.kt", l = {IronSourceError.ERROR_NT_LOAD_NO_CONFIG}, m = "invokeSuspend")
        /* renamed from: xsna.zz1$a$a, reason: collision with other inner class name */
        public static final class C4210a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            final /* synthetic */ yvj $$this$coroutineScope;
            final /* synthetic */ wzs<Object, spj<? super s3q0>, Object> $block;
            final /* synthetic */ Object $latestInputs;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C4210a(wzs<Object, ? super spj<? super s3q0>, ? extends Object> wzsVar, Object obj, yvj yvjVar, spj<? super C4210a> spjVar) {
                super(2, spjVar);
                this.$block = wzsVar;
                this.$latestInputs = obj;
                this.$$this$coroutineScope = yvjVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new C4210a(this.$block, this.$latestInputs, this.$$this$coroutineScope, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                return ((C4210a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.a.a(obj);
                    wzs<Object, spj<? super s3q0>, Object> wzsVar = this.$block;
                    Object obj2 = this.$latestInputs;
                    this.label = 1;
                    if (wzsVar.invoke(obj2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                zvj.c(this.$$this$coroutineScope, new AnchoredDragFinishedSignal());
                return s3q0.a;
            }
        }

        /* compiled from: AnchoredDraggable.kt */
        @b6l(c = "androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1", f = "AnchoredDraggable.kt", l = {IronSourceError.ERROR_NT_INSTANCE_LOAD_EMPTY_ADAPTER}, m = "emit")
        public static final class b extends ContinuationImpl {
            Object L$0;
            Object L$1;
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ a<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(a<? super T> aVar, spj<? super b> spjVar) {
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
        public a(Ref$ObjectRef<eyx> ref$ObjectRef, yvj yvjVar, wzs<Object, ? super spj<? super s3q0>, ? extends Object> wzsVar) {
            this.b = ref$ObjectRef;
            this.c = yvjVar;
            this.d = wzsVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // xsna.lsr
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, spj<? super s3q0> spjVar) {
            b bVar;
            int i;
            if (spjVar instanceof b) {
                bVar = (b) spjVar;
                int i2 = bVar.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    bVar.label = i2 - Integer.MIN_VALUE;
                    Object obj2 = bVar.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = bVar.label;
                    Ref$ObjectRef<eyx> ref$ObjectRef = this.b;
                    if (i != 0) {
                        kotlin.a.a(obj2);
                        eyx eyxVar = ref$ObjectRef.element;
                        if (eyxVar != null) {
                            eyxVar.b(new AnchoredDragFinishedSignal());
                            bVar.L$0 = obj;
                            bVar.L$1 = eyxVar;
                            bVar.label = 1;
                            if (eyxVar.y(bVar) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj = bVar.L$0;
                        kotlin.a.a(obj2);
                    }
                    CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
                    wzs<Object, spj<? super s3q0>, Object> wzsVar = this.d;
                    yvj yvjVar = this.c;
                    ref$ObjectRef.element = (T) myc0.h(yvjVar, null, coroutineStart, new C4210a(wzsVar, obj, yvjVar, null), 1);
                    return s3q0.a;
                }
            }
            bVar = new b(this, spjVar);
            Object obj22 = bVar.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = bVar.label;
            Ref$ObjectRef<eyx> ref$ObjectRef2 = this.b;
            if (i != 0) {
            }
            CoroutineStart coroutineStart2 = CoroutineStart.UNDISPATCHED;
            wzs<Object, spj<? super s3q0>, Object> wzsVar2 = this.d;
            yvj yvjVar2 = this.c;
            ref$ObjectRef2.element = (T) myc0.h(yvjVar2, null, coroutineStart2, new C4210a(wzsVar2, obj, yvjVar2, null), 1);
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public zz1(gzs<Object> gzsVar, wzs<Object, ? super spj<? super s3q0>, ? extends Object> wzsVar, spj<? super zz1> spjVar) {
        super(2, spjVar);
        this.$inputs = gzsVar;
        this.$block = wzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        zz1 zz1Var = new zz1(this.$inputs, this.$block, spjVar);
        zz1Var.L$0 = obj;
        return zz1Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((zz1) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            yvj yvjVar = (yvj) this.L$0;
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            izg0 M = nr2.M(this.$inputs);
            a aVar = new a(ref$ObjectRef, yvjVar, this.$block);
            this.label = 1;
            if (M.collect(aVar, this) == coroutineSingletons) {
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
