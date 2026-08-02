package xsna;

import com.huawei.hms.hihealth.data.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: VkWorkoutStore.kt */
@b6l(c = "com.vk.superapp.vkworkout.data.store.VkWorkoutStore$setMonthlyWorkouts$2", f = "VkWorkoutStore.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class q2w0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ List<com.vk.superapp.api.dto.vkworkout.a> $workouts;
    int label;
    final /* synthetic */ s2w0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2w0(s2w0 s2w0Var, List<com.vk.superapp.api.dto.vkworkout.a> list, spj<? super q2w0> spjVar) {
        super(2, spjVar);
        this.this$0 = s2w0Var;
        this.$workouts = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new q2w0(this.this$0, this.$workouts, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((q2w0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        s2w0 s2w0Var = this.this$0;
        List<com.vk.superapp.api.dto.vkworkout.a> list = this.$workouts;
        qcy<Object>[] qcyVarArr = s2w0.b;
        s2w0Var.getClass();
        qvo0.a.getClass();
        q500 q500Var = new q500(qvo0.d(), System.currentTimeMillis());
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            long j = ((com.vk.superapp.api.dto.vkworkout.a) obj2).b;
            if (q500Var.b <= j && j <= q500Var.c) {
                arrayList.add(obj2);
            }
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.vk.superapp.api.dto.vkworkout.a aVar = (com.vk.superapp.api.dto.vkworkout.a) it.next();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", aVar.a);
            jSONObject.put("timestamp", aVar.b);
            jSONObject.put("title", aVar.c);
            jSONObject.put(Field.NUTRIENTS_FACTS_CALORIES, aVar.d);
            jSONArray.put(jSONObject);
        }
        String jSONArray2 = jSONArray.toString();
        tw8 tw8Var = s2w0Var.a;
        qcy<Object> qcyVar = s2w0.b[0];
        tw8Var.g(jSONArray2);
        return s3q0.a;
    }
}
