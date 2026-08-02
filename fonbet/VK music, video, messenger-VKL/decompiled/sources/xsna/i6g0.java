package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.k5g0;

/* compiled from: ReportViewModel.kt */
@b6l(c = "com.vk.overlaymenu.feature.report.ReportViewModel$onEditScreenshotClick$1", f = "ReportViewModel.kt", l = {TsExtractor.TS_STREAM_TYPE_DVBSUBS}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class i6g0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ String $path;
    int label;
    final /* synthetic */ n6g0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6g0(n6g0 n6g0Var, String str, spj<? super i6g0> spjVar) {
        super(2, spjVar);
        this.this$0 = n6g0Var;
        this.$path = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new i6g0(this.this$0, this.$path, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((i6g0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            caj0 caj0Var = this.this$0.l;
            k5g0.b bVar = new k5g0.b(this.$path);
            this.label = 1;
            if (caj0Var.emit(bVar, this) == coroutineSingletons) {
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
