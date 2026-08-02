package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: GamesCatalogDetailFeature.kt */
@b6l(c = "com.vk.games.presentation.detail.mvi.GamesCatalogDetailFeature$loadDetail$1", f = "GamesCatalogDetailFeature.kt", l = {204, 171, 174}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class qat extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ boolean $isNextLoading;
    final /* synthetic */ int $offset;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    final /* synthetic */ tat this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qat(tat tatVar, int i, boolean z, spj<? super qat> spjVar) {
        super(2, spjVar);
        this.this$0 = tatVar;
        this.$offset = i;
        this.$isNextLoading = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new qat(this.this$0, this.$offset, this.$isNextLoading, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((qat) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0089, code lost:
    
        if (xsna.tat.U(r6, r10, r1, r9) == r0) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARN: Type inference failed for: r7v2, types: [xsna.zgi0] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        tat tatVar;
        dhi0 dhi0Var;
        boolean z;
        int i;
        int i2;
        zgi0 zgi0Var;
        Throwable th;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        if (i3 == 0) {
            kotlin.a.a(obj);
            tatVar = this.this$0;
            if (tatVar.j) {
                dhi0Var = tatVar.m;
                int i4 = this.$offset;
                z = this.$isNextLoading;
                this.L$0 = dhi0Var;
                this.L$1 = tatVar;
                this.I$0 = i4;
                this.Z$0 = z;
                this.I$1 = 0;
                this.label = 1;
                if (dhi0Var.a(this) != coroutineSingletons) {
                    i = i4;
                    i2 = 0;
                    this.L$0 = dhi0Var;
                    this.L$1 = null;
                    this.I$0 = i2;
                    this.I$1 = 0;
                    this.label = 2;
                    if (tat.U(tatVar, i, z, this) != coroutineSingletons) {
                    }
                }
            } else {
                int i5 = this.$offset;
                boolean z2 = this.$isNextLoading;
                this.label = 3;
            }
            return coroutineSingletons;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return s3q0.a;
            }
            zgi0Var = (zgi0) this.L$0;
            try {
                kotlin.a.a(obj);
                s3q0 s3q0Var = s3q0.a;
                zgi0Var.release();
                return s3q0.a;
            } catch (Throwable th2) {
                th = th2;
                zgi0Var.release();
                throw th;
            }
        }
        i2 = this.I$1;
        z = this.Z$0;
        i = this.I$0;
        tatVar = (tat) this.L$1;
        ?? r7 = (zgi0) this.L$0;
        kotlin.a.a(obj);
        dhi0Var = r7;
        try {
            this.L$0 = dhi0Var;
            this.L$1 = null;
            this.I$0 = i2;
            this.I$1 = 0;
            this.label = 2;
            if (tat.U(tatVar, i, z, this) != coroutineSingletons) {
                zgi0Var = dhi0Var;
                s3q0 s3q0Var2 = s3q0.a;
                zgi0Var.release();
                return s3q0.a;
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            zgi0Var = dhi0Var;
            th = th3;
            zgi0Var.release();
            throw th;
        }
    }
}
