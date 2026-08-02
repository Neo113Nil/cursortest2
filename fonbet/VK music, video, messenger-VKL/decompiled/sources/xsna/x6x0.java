package xsna;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: VolumeChangeReporter.kt */
@b6l(c = "com.vk.music.player.core.stats.VolumeChangeReporter$paired$1", f = "VolumeChangeReporter.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class x6x0 extends SuspendLambda implements wzs<lsr<? super Pair<Object, Object>>, spj<? super s3q0>, Object> {
    final /* synthetic */ ksr<Object> $this_paired;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* compiled from: VolumeChangeReporter.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ Ref$ObjectRef<T> b;
        public final /* synthetic */ lsr<Pair<? extends T, ? extends T>> c;

        /* compiled from: VolumeChangeReporter.kt */
        @b6l(c = "com.vk.music.player.core.stats.VolumeChangeReporter$paired$1$1", f = "VolumeChangeReporter.kt", l = {TsExtractor.TS_STREAM_TYPE_DVBSUBS}, m = "emit")
        /* renamed from: xsna.x6x0$a$a, reason: collision with other inner class name */
        public static final class C3976a extends ContinuationImpl {
            Object L$0;
            Object L$1;
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ a<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C3976a(a<? super T> aVar, spj<? super C3976a> spjVar) {
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
        public a(Ref$ObjectRef<T> ref$ObjectRef, lsr<? super Pair<? extends T, ? extends T>> lsrVar) {
            this.b = ref$ObjectRef;
            this.c = lsrVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // xsna.lsr
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(T t, spj<? super s3q0> spjVar) {
            C3976a c3976a;
            int i;
            if (spjVar instanceof C3976a) {
                c3976a = (C3976a) spjVar;
                int i2 = c3976a.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c3976a.label = i2 - Integer.MIN_VALUE;
                    Object obj = c3976a.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = c3976a.label;
                    Ref$ObjectRef<T> ref$ObjectRef = this.b;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        T t2 = ref$ObjectRef.element;
                        if (t2 != null) {
                            Pair<? extends T, ? extends T> pair = new Pair<>(t2, t);
                            c3976a.L$0 = t;
                            c3976a.L$1 = null;
                            c3976a.label = 1;
                            if (this.c.emit(pair, c3976a) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t = (T) c3976a.L$0;
                        kotlin.a.a(obj);
                    }
                    ref$ObjectRef.element = t;
                    return s3q0.a;
                }
            }
            c3976a = new C3976a(this, spjVar);
            Object obj2 = c3976a.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = c3976a.label;
            Ref$ObjectRef<T> ref$ObjectRef2 = this.b;
            if (i != 0) {
            }
            ref$ObjectRef2.element = t;
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x6x0(ksr<Object> ksrVar, spj<? super x6x0> spjVar) {
        super(2, spjVar);
        this.$this_paired = ksrVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        x6x0 x6x0Var = new x6x0(this.$this_paired, spjVar);
        x6x0Var.L$0 = obj;
        return x6x0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(lsr<? super Pair<Object, Object>> lsrVar, spj<? super s3q0> spjVar) {
        return ((x6x0) create(lsrVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        lsr lsrVar = (lsr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ksr<Object> ksrVar = this.$this_paired;
            a aVar = new a(ref$ObjectRef, lsrVar);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (ksrVar.collect(aVar, this) == coroutineSingletons) {
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
