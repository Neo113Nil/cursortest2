package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.SharingCommand;
import xsna.hcj0;

/* compiled from: Share.kt */
@b6l(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", l = {Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE, Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class utr extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ Object $initialValue;
    final /* synthetic */ sh50<Object> $shared;
    final /* synthetic */ hcj0 $started;
    final /* synthetic */ ksr<Object> $upstream;
    int label;

    /* compiled from: Share.kt */
    @b6l(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<Integer, spj<? super Boolean>, Object> {
        /* synthetic */ int I$0;
        int label;

        public a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = new a(2, spjVar);
            aVar.I$0 = ((Number) obj).intValue();
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(Integer num, spj<? super Boolean> spjVar) {
            return ((a) create(Integer.valueOf(num.intValue()), spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            return Boolean.valueOf(this.I$0 > 0);
        }
    }

    /* compiled from: Share.kt */
    @b6l(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<SharingCommand, spj<? super s3q0>, Object> {
        final /* synthetic */ Object $initialValue;
        final /* synthetic */ sh50<Object> $shared;
        final /* synthetic */ ksr<Object> $upstream;
        /* synthetic */ Object L$0;
        int label;

        /* compiled from: Share.kt */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[SharingCommand.values().length];
                try {
                    iArr[SharingCommand.START.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SharingCommand.STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[SharingCommand.STOP_AND_RESET_REPLAY_CACHE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ksr<Object> ksrVar, sh50<Object> sh50Var, Object obj, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$upstream = ksrVar;
            this.$shared = sh50Var;
            this.$initialValue = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            b bVar = new b(this.$upstream, this.$shared, this.$initialValue, spjVar);
            bVar.L$0 = obj;
            return bVar;
        }

        @Override // xsna.wzs
        public final Object invoke(SharingCommand sharingCommand, spj<? super s3q0> spjVar) {
            return ((b) create(sharingCommand, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                int i2 = a.$EnumSwitchMapping$0[((SharingCommand) this.L$0).ordinal()];
                if (i2 == 1) {
                    ksr<Object> ksrVar = this.$upstream;
                    sh50<Object> sh50Var = this.$shared;
                    this.label = 1;
                    if (ksrVar.collect(sh50Var, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else if (i2 != 2) {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Object obj2 = this.$initialValue;
                    if (obj2 == lyd.c) {
                        this.$shared.d();
                    } else {
                        this.$shared.e(obj2);
                    }
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public utr(hcj0 hcj0Var, ksr<Object> ksrVar, sh50<Object> sh50Var, Object obj, spj<? super utr> spjVar) {
        super(2, spjVar);
        this.$started = hcj0Var;
        this.$upstream = ksrVar;
        this.$shared = sh50Var;
        this.$initialValue = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new utr(this.$started, this.$upstream, this.$shared, this.$initialValue, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((utr) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x005c, code lost:
    
        if (r8.collect(r1, r7) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0036, code lost:
    
        if (r8.collect(r1, r7) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
    
        if (xsna.rsr.o(r8, r1, r7) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007e, code lost:
    
        if (xsna.rsr.k(r8, r1, r7) == r0) goto L28;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    kotlin.a.a(obj);
                    ksr<Object> ksrVar = this.$upstream;
                    sh50<Object> sh50Var = this.$shared;
                    this.label = 3;
                } else if (i != 3 && i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            kotlin.a.a(obj);
            return s3q0.a;
        }
        kotlin.a.a(obj);
        hcj0 hcj0Var = this.$started;
        if (hcj0Var == hcj0.a.a) {
            ksr<Object> ksrVar2 = this.$upstream;
            sh50<Object> sh50Var2 = this.$shared;
            this.label = 1;
        } else if (hcj0Var == hcj0.a.b) {
            xxm0 g = this.$shared.g();
            a aVar = new a(2, null);
            this.label = 2;
        } else {
            ksr l = rsr.l(hcj0Var.i(this.$shared.g()));
            b bVar = new b(this.$upstream, this.$shared, this.$initialValue, null);
            this.label = 4;
        }
        return coroutineSingletons;
    }
}
