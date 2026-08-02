package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ReportViewModel.kt */
@b6l(c = "com.vk.overlaymenu.feature.report.ReportViewModel$onSendClick$1", f = "ReportViewModel.kt", l = {101, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class k6g0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ n6g0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6g0(n6g0 n6g0Var, spj<? super k6g0> spjVar) {
        super(2, spjVar);
        this.this$0 = n6g0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new k6g0(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((k6g0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ad, code lost:
    
        if (r8 == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00af, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x004f, code lost:
    
        if (r8 == r0) goto L26;
     */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.a.a(obj);
            utk0 utk0Var = this.this$0.b;
            Boolean bool = Boolean.TRUE;
            utk0Var.getClass();
            utk0Var.i(null, bool);
            n6g0 n6g0Var = this.this$0;
            this.label = 1;
            n6g0Var.getClass();
            obj = myc0.k(hqu0.b(), new f6g0(2, null), this);
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                i = ((Result) obj).d();
                utk0 utk0Var2 = this.this$0.b;
                Boolean bool2 = Boolean.FALSE;
                utk0Var2.getClass();
                utk0Var2.i(null, bool2);
                if (i instanceof Result.Failure) {
                    Throwable a = Result.a(i);
                    if (a != null) {
                        l370 l370Var = x290.k;
                        if (l370Var == null) {
                            l370Var = null;
                        }
                        l370Var.v(a);
                    }
                    utk0 utk0Var3 = this.this$0.d;
                    Boolean bool3 = Boolean.TRUE;
                    utk0Var3.getClass();
                    utk0Var3.i(null, bool3);
                } else {
                    n6g0 n6g0Var2 = this.this$0;
                    kotlin.a.a(i);
                    n6g0Var2.h = ((Number) i).longValue();
                    utk0 utk0Var4 = this.this$0.c;
                    Boolean bool4 = Boolean.TRUE;
                    utk0Var4.getClass();
                    utk0Var4.i(null, bool4);
                }
                n6g0 n6g0Var3 = this.this$0;
                n6g0Var3.i = false;
                utk0 utk0Var5 = n6g0Var3.f;
                utk0Var5.getClass();
                utk0Var5.i(null, "");
                return s3q0.a;
            }
            kotlin.a.a(obj);
        }
        String str = (String) obj;
        n6g0 n6g0Var4 = this.this$0;
        StringBuilder sb = new StringBuilder();
        if (str == null || str.length() == 0) {
            sb.append("Не удалось автоматически собрать логи. Информация об устройстве:\n");
            sb.append((String) n6g0Var4.j.getValue());
            sb.append('\n');
        }
        String str2 = (String) n6g0Var4.f.getValue();
        if (!drm0.N(str2)) {
            if (sb.length() > 0) {
                sb.append('\n');
            }
            sb.append("Описание:");
            sb.append('\n');
            sb.append(str2);
            sb.append('\n');
        }
        String sb2 = sb.toString();
        n6g0 n6g0Var5 = this.this$0;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        i = n6g0.i(n6g0Var5, sb2, str, this);
    }
}
