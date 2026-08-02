package xsna;

import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.SharingCommand;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: SharingStarted.kt */
/* loaded from: classes8.dex */
public final class brk0 implements hcj0 {

    /* compiled from: SharingStarted.kt */
    @b6l(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", f = "SharingStarted.kt", l = {174, 176, 178, 179, 181}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements yzs<lsr<? super SharingCommand>, Integer, spj<? super s3q0>, Object> {
        /* synthetic */ int I$0;
        private /* synthetic */ Object L$0;
        int label;

        public a(spj<? super a> spjVar) {
            super(3, spjVar);
        }

        @Override // xsna.yzs
        public final Object invoke(lsr<? super SharingCommand> lsrVar, Integer num, spj<? super s3q0> spjVar) {
            int intValue = num.intValue();
            a aVar = brk0.this.new a(spjVar);
            aVar.L$0 = lsrVar;
            aVar.I$0 = intValue;
            return aVar.invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0095, code lost:
        
            if (r1.emit(r8, r7) == r0) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0087, code lost:
        
            if (xsna.qsl.b(Long.MAX_VALUE, r7) == r0) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0072, code lost:
        
            if (r1.emit(r8, r7) == r0) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x004e, code lost:
        
            if (r1.emit(r8, r7) == r0) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
        
            if (xsna.qsl.b(0, r7) == r0) goto L32;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            lsr lsrVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                lsrVar = (lsr) this.L$0;
                if (this.I$0 > 0) {
                    SharingCommand sharingCommand = SharingCommand.START;
                    this.label = 1;
                } else {
                    brk0.this.getClass();
                    this.L$0 = lsrVar;
                    this.label = 2;
                }
                return coroutineSingletons;
            }
            if (i != 1) {
                if (i == 2) {
                    lsrVar = (lsr) this.L$0;
                    kotlin.a.a(obj);
                    brk0.this.getClass();
                    SharingCommand sharingCommand2 = SharingCommand.STOP;
                    this.L$0 = lsrVar;
                    this.label = 3;
                } else if (i == 3) {
                    lsrVar = (lsr) this.L$0;
                    kotlin.a.a(obj);
                    brk0.this.getClass();
                    this.L$0 = lsrVar;
                    this.label = 4;
                } else if (i == 4) {
                    lsrVar = (lsr) this.L$0;
                    kotlin.a.a(obj);
                    SharingCommand sharingCommand3 = SharingCommand.STOP_AND_RESET_REPLAY_CACHE;
                    this.L$0 = null;
                    this.label = 5;
                } else if (i != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            kotlin.a.a(obj);
            return s3q0.a;
        }
    }

    /* compiled from: SharingStarted.kt */
    @b6l(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$2", f = "SharingStarted.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<SharingCommand, spj<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public b() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            b bVar = new b(2, spjVar);
            bVar.L$0 = obj;
            return bVar;
        }

        @Override // xsna.wzs
        public final Object invoke(SharingCommand sharingCommand, spj<? super Boolean> spjVar) {
            return ((b) create(sharingCommand, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            return Boolean.valueOf(((SharingCommand) this.L$0) != SharingCommand.START);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof brk0)) {
            return false;
        }
        ((brk0) obj).getClass();
        return true;
    }

    @IgnoreJRERequirement
    public final int hashCode() {
        return Long.hashCode(Long.MAX_VALUE) + (Long.hashCode(0L) * 31);
    }

    @Override // xsna.hcj0
    public final ksr<SharingCommand> i(ttk0<Integer> ttk0Var) {
        return rsr.l(new gtr(rsr.y(ttk0Var, new a(null)), new b(2, null)));
    }

    public final String toString() {
        return ho8.a(new StringBuilder("SharingStarted.WhileSubscribed("), j5g.g0(new ListBuilder(2).g(), null, null, null, 0, null, 63), ')');
    }
}
