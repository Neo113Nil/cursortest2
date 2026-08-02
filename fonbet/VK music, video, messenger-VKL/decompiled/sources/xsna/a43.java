package xsna;

import com.vk.metrics.performance.power.a;
import org.json.JSONObject;
import xsna.trw;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a43 implements izs {
    public final /* synthetic */ int b;

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                com.vk.metrics.eventtracking.b.a.a(new a.C1279a((Throwable) obj));
                return s3q0.a;
            case 1:
                return s3q0.a;
            case 2:
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject == null) {
                    return null;
                }
                ((trw.a) trw.a.getValue()).a();
                return jSONObject;
            default:
                return Boolean.valueOf(((awd0) obj) instanceof oju);
        }
    }
}
