package xsna;

import com.vk.dto.common.data.VKList;
import com.vk.dto.reactions.ReactionSet;
import org.json.JSONObject;
import xsna.rtt;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class kjb implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ kjb(int i, int i2) {
        this.b = i2;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return bdb.a((bdb) obj, 0, 0, 0, 0, 0, 0, null, null, null, false, false, null, null, 0, null, null, null, Integer.valueOf(this.c), null, null, null, null, null, false, false, -8388609, 7);
            case 1:
                ((Integer) obj).intValue();
                return Integer.valueOf(this.c);
            default:
                JSONObject jSONObject = (JSONObject) obj;
                stt.a.getClass();
                JSONObject optJSONObject = jSONObject.optJSONObject("reaction_set");
                ReactionSet d = optJSONObject != null ? h1f0.d(optJSONObject) : null;
                VKList c = d != null ? h1f0.c(jSONObject.getJSONObject("response"), d) : h1f0.b(jSONObject.getJSONObject("response"));
                return new rtt(new rtt.a(c, this.c, c.i()), null, null, null, null);
        }
    }
}
