package xsna;

import com.huawei.hms.hihealth.data.Field;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: VkWorkoutStore.kt */
@b6l(c = "com.vk.superapp.vkworkout.data.store.VkWorkoutStore$getMonthlyWorkouts$2", f = "VkWorkoutStore.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class o2w0 extends SuspendLambda implements wzs<yvj, spj<? super List<? extends com.vk.superapp.api.dto.vkworkout.a>>, Object> {
    int label;
    final /* synthetic */ s2w0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2w0(s2w0 s2w0Var, spj<? super o2w0> spjVar) {
        super(2, spjVar);
        this.this$0 = s2w0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new o2w0(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super List<? extends com.vk.superapp.api.dto.vkworkout.a>> spjVar) {
        return ((o2w0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        tw8 tw8Var = this.this$0.a;
        qcy<Object> qcyVar = s2w0.b[0];
        String b = tw8Var.b();
        if (b.length() <= 0) {
            b = null;
        }
        if (b == null) {
            return EmptyList.b;
        }
        this.this$0.getClass();
        JSONArray jSONArray = new JSONArray(b);
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                arrayList.add(new com.vk.superapp.api.dto.vkworkout.a(optJSONObject.optInt(Field.NUTRIENTS_FACTS_CALORIES, 0), optJSONObject.getString("id"), f370.D(optJSONObject, "title"), optJSONObject.getLong("timestamp")));
            }
        }
        return arrayList;
    }
}
