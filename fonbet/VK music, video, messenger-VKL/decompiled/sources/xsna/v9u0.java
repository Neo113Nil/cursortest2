package xsna;

import com.vk.im.engine.models.b;
import kotlin.Result;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.json.JSONObject;

/* compiled from: VkAppExperiments.kt */
/* loaded from: classes11.dex */
public final /* synthetic */ class v9u0 extends FunctionReferenceImpl implements izs<String, com.vk.im.engine.models.b> {
    @Override // xsna.izs
    public final com.vk.im.engine.models.b invoke(String str) {
        Object failure;
        String str2 = str;
        ((b.a) this.receiver).getClass();
        try {
            JSONObject jSONObject = new JSONObject(str2);
            failure = new com.vk.im.engine.models.b((float) jSONObject.getDouble("sampleRate"), jSONObject.getLong("elapsedMs"));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Object obj = com.vk.im.engine.models.b.d;
        if (failure instanceof Result.Failure) {
            failure = obj;
        }
        return (com.vk.im.engine.models.b) failure;
    }
}
