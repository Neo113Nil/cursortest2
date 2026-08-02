package xsna;

import com.vk.api.sdk.utils.clientagent.model.ClientAgentKey;
import java.util.Map;
import xsna.r7x;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class dlc implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ dlc(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                ClientAgentKey clientAgentKey = (ClientAgentKey) entry.getKey();
                boolean z = entry.getValue() instanceof CharSequence;
                Object value = entry.getValue();
                return clientAgentKey + "=" + (z ? so.a(value, "\"", "\"") : String.valueOf(value));
            case 1:
                rgl.f.remove(((c7x) obj).c);
                return s3q0.a;
            default:
                return r7x.a.a((r7x.a) obj, false, null, 5);
        }
    }
}
