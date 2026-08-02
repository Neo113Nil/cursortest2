package xsna;

import android.net.Uri;
import com.vk.im.engine.models.sync.MaxEntryPointsConfig;
import java.util.LinkedHashMap;
import kotlin.Result;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.json.JSONObject;

/* compiled from: VkAppExperiments.kt */
/* loaded from: classes11.dex */
public final /* synthetic */ class x9u0 extends FunctionReferenceImpl implements izs<String, MaxEntryPointsConfig> {
    @Override // xsna.izs
    public final MaxEntryPointsConfig invoke(String str) {
        Object failure;
        String str2 = str;
        ((MaxEntryPointsConfig.a) this.receiver).getClass();
        try {
            JSONObject jSONObject = new JSONObject(str2);
            Uri g = jeq0.g(f370.C("fallback", "https://trk.mail.ru/c/vva9z7", jSONObject));
            zrp<MaxEntryPointsConfig.AvailableEntryPoint> h = MaxEntryPointsConfig.AvailableEntryPoint.h();
            int e = on00.e(c5g.u(h, 10));
            if (e < 16) {
                e = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(e);
            for (Object obj : h) {
                linkedHashMap.put(obj, jeq0.g(jSONObject.getString(((MaxEntryPointsConfig.AvailableEntryPoint) obj).i())));
            }
            failure = new MaxEntryPointsConfig(true, linkedHashMap, g);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        return (MaxEntryPointsConfig) failure;
    }
}
