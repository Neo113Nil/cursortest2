package xsna;

import io.requery.android.database.sqlite.SQLiteStatementType;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.yhp0;

/* compiled from: TrackpadScrollingLogic.kt */
@b6l(c = "androidx.compose.foundation.gestures.TrackpadScrollingLogic$startReceivingEvents$1", f = "TrackpadScrollingLogic.kt", l = {SQLiteStatementType.STATEMENT_OTHER, SQLiteStatementType.STATEMENT_OTHER}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class bip0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ yhp0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bip0(yhp0 yhp0Var, spj<? super bip0> spjVar) {
        super(2, spjVar);
        this.this$0 = yhp0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        bip0 bip0Var = new bip0(this.this$0, spjVar);
        bip0Var.L$0 = obj;
        return bip0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((bip0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x006a -> B:9:0x0037). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        yvj yvjVar;
        yvj yvjVar2;
        yhp0 yhp0Var;
        zhh0 zhh0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                yvjVar = (yvj) this.L$0;
            } else {
                if (i == 1) {
                    zhh0Var = (zhh0) this.L$2;
                    yhp0Var = (yhp0) this.L$1;
                    yvjVar2 = (yvj) this.L$0;
                    kotlin.a.a(obj);
                    this.L$0 = yvjVar2;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 2;
                    if (yhp0.c(yhp0Var, zhh0Var, (yhp0.a) obj, this) != coroutineSingletons) {
                        yvjVar = yvjVar2;
                    }
                    return coroutineSingletons;
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yvj yvjVar3 = (yvj) this.L$0;
                kotlin.a.a(obj);
                yvjVar = yvjVar3;
            }
            if (!iyx.h(yvjVar.getCoroutineContext())) {
                this.this$0.g = null;
                return s3q0.a;
            }
            yhp0Var = this.this$0;
            zhh0Var = yhp0Var.a;
            nm8 nm8Var = yhp0Var.f;
            this.L$0 = yvjVar;
            this.L$1 = yhp0Var;
            this.L$2 = zhh0Var;
            this.label = 1;
            Object a = nm8Var.a(this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
            yvjVar2 = yvjVar;
            obj = a;
            this.L$0 = yvjVar2;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
            if (yhp0.c(yhp0Var, zhh0Var, (yhp0.a) obj, this) != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th) {
            this.this$0.g = null;
            throw th;
        }
    }
}
