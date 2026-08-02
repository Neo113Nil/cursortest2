package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import org.chromium.net.telemetry.CronetStatsLog;

/* compiled from: AndroidViewHolder.android.kt */
@b6l(c = "androidx.compose.ui.viewinterop.BringIntoViewNode$requester$1$1", f = "AndroidViewHolder.android.kt", l = {CronetStatsLog.CRONET_INITIALIZED}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class nc8 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ zhf0 $rect;
    int label;
    final /* synthetic */ pc8 this$0;

    /* compiled from: AndroidViewHolder.android.kt */
    public static final class a extends Lambda implements gzs<zhf0> {
        final /* synthetic */ zhf0 $rect;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(zhf0 zhf0Var) {
            super(0);
            this.$rect = zhf0Var;
        }

        @Override // xsna.gzs
        public final zhf0 invoke() {
            return this.$rect;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc8(pc8 pc8Var, zhf0 zhf0Var, spj<? super nc8> spjVar) {
        super(2, spjVar);
        this.this$0 = pc8Var;
        this.$rect = zhf0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new nc8(this.this$0, this.$rect, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((nc8) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            pc8 pc8Var = this.this$0;
            a aVar = new a(this.$rect);
            this.label = 1;
            if (mc8.a(pc8Var, aVar, this) == coroutineSingletons) {
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
