package xsna;

import com.vk.api.request.core.persistent.PersistentRequest;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.log.L;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* compiled from: RxPersistentRequestManager.kt */
/* loaded from: classes.dex */
public final class ivg0 extends y0a0 {
    public static final ivg0 e = new ivg0();

    @Override // xsna.y0a0
    public final boolean b(PersistentRequest persistentRequest) {
        rsg0 rsg0Var = new rsg0(persistentRequest.zb());
        for (Map.Entry<String, String> entry : persistentRequest.Ab().entrySet()) {
            rsg0Var.K(entry.getKey(), entry.getValue());
        }
        try {
            JSONObject jSONObject = (JSONObject) rsg0Var.u(0L);
            if (jSONObject == null) {
                throw new IOException();
            }
            jSONObject.toString();
            if (persistentRequest.Bb() != null) {
                try {
                    persistentRequest.Bb().invoke(null, jSONObject);
                    Objects.toString(persistentRequest.Bb());
                    return true;
                } catch (Throwable th) {
                    L.f("PersistentApi", "Callback (" + persistentRequest.Bb() + ") call fail", th);
                }
            }
            return true;
        } catch (VKApiExecutionException e2) {
            int s = e2.s();
            return (s == 1 || s == 6 || s == 10 || s <= 0) ? false : true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
