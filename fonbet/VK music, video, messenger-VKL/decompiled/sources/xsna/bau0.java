package xsna;

import com.vk.im.engine.models.e;
import kotlin.Result;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.json.JSONObject;

/* compiled from: VkAppExperiments.kt */
/* loaded from: classes11.dex */
public final /* synthetic */ class bau0 extends FunctionReferenceImpl implements izs<String, com.vk.im.engine.models.e> {
    @Override // xsna.izs
    public final com.vk.im.engine.models.e invoke(String str) {
        Object failure;
        String str2 = str;
        ((e.a) this.receiver).getClass();
        try {
            JSONObject jSONObject = new JSONObject(str2);
            failure = new com.vk.im.engine.models.e(jSONObject.optBoolean("bg_sync_manager"), jSONObject.optBoolean("custom_interruptions"));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        return (com.vk.im.engine.models.e) failure;
    }
}
