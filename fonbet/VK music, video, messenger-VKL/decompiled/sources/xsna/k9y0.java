package xsna;

import com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class k9y0 extends IIgniteServiceCallback.Stub {
    public final fuy0 e;

    public k9y0(fuy0 fuy0Var) {
        this.e = fuy0Var;
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onError(String str) {
        this.e.a(str);
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onSuccess(String str) {
        String str2;
        try {
            str2 = new JSONObject(str).getJSONObject("data").getString("token");
        } catch (Exception e) {
            ofy0.f(com.digitalturbine.ignite.authenticator.events.d.ONE_DT_GENERAL_ERROR, e);
            vay0.d("%s : resolveClientToken : %s", "IgniteAuthenticationCallback", e.toString());
            str2 = null;
        }
        this.e.c(str2);
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onProgress(String str) {
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onScheduled(String str) {
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onStart(String str) {
    }
}
