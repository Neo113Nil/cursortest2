package xsna;

import android.app.Activity;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.vk.reefton.protocol.ReefProtocol$Event;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ReportViewModel.kt */
@b6l(c = "com.vk.overlaymenu.feature.report.ReportViewModel$onCreate$1", f = "ReportViewModel.kt", l = {TokenParametersOuterClass$TokenParameters.TOPICS_FIELD_NUMBER, TokenParametersOuterClass$TokenParameters.ADSERVICESVERSION_FIELD_NUMBER, ReefProtocol$Event.Type.IMAGES_IMAGE_LOADED_VALUE}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class h6g0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ Activity $activity;
    long J$0;
    long J$1;
    Object L$0;
    int label;
    final /* synthetic */ n6g0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6g0(n6g0 n6g0Var, Activity activity, spj<? super h6g0> spjVar) {
        super(2, spjVar);
        this.this$0 = n6g0Var;
        this.$activity = activity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new h6g0(this.this$0, this.$activity, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((h6g0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x009e, code lost:
    
        if (xsna.qsl.b(r8, r10) != r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        if (r11 == r0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0091  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long currentTimeMillis;
        long j;
        long currentTimeMillis2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            utk0 utk0Var = this.this$0.b;
            Boolean bool = Boolean.TRUE;
            utk0Var.getClass();
            utk0Var.i(null, bool);
            currentTimeMillis = System.currentTimeMillis();
            n6g0 n6g0Var = this.this$0;
            this.J$0 = currentTimeMillis;
            this.label = 1;
            n6g0Var.getClass();
            Object k = myc0.k(hqu0.b(), new e6g0(2, null), this);
            if (k != coroutineSingletons) {
                k = s3q0.a;
            }
        } else if (i == 1) {
            currentTimeMillis = this.J$0;
            kotlin.a.a(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                utk0 utk0Var2 = this.this$0.b;
                Boolean bool2 = Boolean.FALSE;
                utk0Var2.getClass();
                utk0Var2.i(null, bool2);
                return s3q0.a;
            }
            j = this.J$0;
            kotlin.a.a(obj);
            this.this$0.e.setValue((String) obj);
            currentTimeMillis2 = 300 - (System.currentTimeMillis() - j);
            if (currentTimeMillis2 < 0) {
                currentTimeMillis2 = 0;
            }
            this.L$0 = null;
            this.J$0 = j;
            this.J$1 = currentTimeMillis2;
            this.label = 3;
        }
        n6g0 n6g0Var2 = this.this$0;
        Activity activity = this.$activity;
        this.J$0 = currentTimeMillis;
        this.label = 2;
        n6g0Var2.getClass();
        obj = myc0.k(hqu0.a(), new g6g0(activity, null), this);
        if (obj != coroutineSingletons) {
            j = currentTimeMillis;
            this.this$0.e.setValue((String) obj);
            currentTimeMillis2 = 300 - (System.currentTimeMillis() - j);
            if (currentTimeMillis2 < 0) {
            }
            this.L$0 = null;
            this.J$0 = j;
            this.J$1 = currentTimeMillis2;
            this.label = 3;
        }
        return coroutineSingletons;
    }
}
