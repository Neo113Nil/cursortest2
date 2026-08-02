package xsna;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: MusicClearStorageInteractorImpl.kt */
@b6l(c = "com.vk.music.offline.impl.domain.interactor.MusicClearStorageInteractorImpl$downloadsSizeFlow$1", f = "MusicClearStorageInteractorImpl.kt", l = {TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER, TokenParametersOuterClass$TokenParameters.GPP_FIELD_NUMBER, 79}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class hf40 extends SuspendLambda implements wzs<lsr<? super Long>, spj<? super s3q0>, Object> {
    long J$0;
    long J$1;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ if40 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hf40(if40 if40Var, spj<? super hf40> spjVar) {
        super(2, spjVar);
        this.this$0 = if40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        hf40 hf40Var = new hf40(this.this$0, spjVar);
        hf40Var.L$0 = obj;
        return hf40Var;
    }

    @Override // xsna.wzs
    public final Object invoke(lsr<? super Long> lsrVar, spj<? super s3q0> spjVar) {
        return ((hf40) create(lsrVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
    
        if (r15 != r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0074, code lost:
    
        if (r0.emit(r15, r14) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0074 -> B:7:0x001c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        long longValue;
        long j2;
        lsr lsrVar = (lsr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            j = 0;
            this.L$0 = lsrVar;
            this.J$0 = j;
            this.J$1 = j;
            this.label = 1;
            if (qsl.b(200L, this) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            j = this.J$1;
            j2 = this.J$0;
            kotlin.a.a(obj);
            if40 if40Var = this.this$0;
            this.L$0 = lsrVar;
            this.J$0 = j2;
            this.J$1 = j;
            this.label = 2;
            obj = if40Var.a(this);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.J$1;
                longValue = this.J$0;
                kotlin.a.a(obj);
                long j3 = longValue;
                long j4 = j;
                j = j3;
                if (j == j4 || j <= 0) {
                    return s3q0.a;
                }
                this.L$0 = lsrVar;
                this.J$0 = j;
                this.J$1 = j;
                this.label = 1;
                if (qsl.b(200L, this) != coroutineSingletons) {
                    j2 = j;
                    if40 if40Var2 = this.this$0;
                    this.L$0 = lsrVar;
                    this.J$0 = j2;
                    this.J$1 = j;
                    this.label = 2;
                    obj = if40Var2.a(this);
                }
                return coroutineSingletons;
            }
            j = this.J$1;
            kotlin.a.a(obj);
            longValue = ((Number) obj).longValue();
            Long l = new Long(longValue);
            this.L$0 = lsrVar;
            this.J$0 = longValue;
            this.J$1 = j;
            this.label = 3;
        }
    }
}
