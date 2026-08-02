package xsna;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.m0l0;

/* compiled from: VkStepsStore.kt */
@b6l(c = "com.vk.superapp.vksteps.data.store.VkStepsStore$getMonthlySteps$2", f = "VkStepsStore.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class ymv0 extends SuspendLambda implements wzs<yvj, spj<? super List<? extends m0l0>>, Object> {
    int label;
    final /* synthetic */ xmv0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ymv0(xmv0 xmv0Var, spj<? super ymv0> spjVar) {
        super(2, spjVar);
        this.this$0 = xmv0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ymv0(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super List<? extends m0l0>> spjVar) {
        return ((ymv0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v7, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ?? r7;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        tw8 tw8Var = this.this$0.a;
        qcy<Object> qcyVar = xmv0.b[0];
        String b = tw8Var.b();
        if (b.length() <= 0) {
            b = null;
        }
        if (b == null) {
            return EmptyList.b;
        }
        xmv0 xmv0Var = this.this$0;
        xmv0Var.getClass();
        try {
            JSONArray jSONArray = new JSONArray(b);
            r7 = new ArrayList(jSONArray.length());
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    SimpleDateFormat simpleDateFormat = m0l0.h;
                    r7.add(m0l0.a.a(optJSONObject));
                }
            }
        } catch (Throwable th) {
            xgx0.a.getClass();
            xgx0.c("VkStepsStore.toStepCounterInfoList() -> ", th);
            r7 = EmptyList.b;
        }
        return xmv0.a(xmv0Var, r7);
    }
}
