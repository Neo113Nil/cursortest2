package xsna;

import com.ironsource.X3;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ResponseBodyJsonConverter.kt */
/* loaded from: classes15.dex */
public final class lbg0 {
    public final List<nay> a;

    /* JADX WARN: Multi-variable type inference failed */
    public lbg0(List<? extends nay> list) {
        this.a = list;
    }

    public final JSONObject a(InputStream inputStream, String str, String str2) {
        Object obj;
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                Iterator<T> it = this.a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((nay) obj).a(str)) {
                        break;
                    }
                }
                nay nayVar = (nay) obj;
                if (nayVar != null) {
                    jSONObject = nayVar.b(inputStream);
                }
            } catch (JSONException e) {
                throw new VKApiExecutionException(-3, str2, true, y57.a(X3.j.d, str2, "] ", e.getLocalizedMessage()), null, null, null, null, 0, null, str, null, 3056);
            }
        }
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("root_response", fto0.p(inputStream));
        return jSONObject2;
    }
}
