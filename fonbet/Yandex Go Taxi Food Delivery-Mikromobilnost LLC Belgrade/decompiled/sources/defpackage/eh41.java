package defpackage;

import com.yandex.messenger.websdk.api.ChatRequest;
import com.yandex.messenger.websdk.internal.web.MessageType;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class eh41 {
    public final String a;
    public final im3 b;
    public final /* synthetic */ fh41 c;

    public eh41(final fh41 fh41Var, ChatRequest chatRequest) {
        String F = udq0.F();
        String F2 = udq0.F();
        this.c = fh41Var;
        this.a = F2;
        rax raxVar = fh41Var.e;
        dh41 dh41Var = new dh41(fh41Var, this);
        raxVar.getClass();
        jl40.m();
        raxVar.h.put(F2, dh41Var);
        this.b = new im3(1, raxVar, F2);
        tj41 tj41Var = new tj41() { // from class: ch41
            @Override // defpackage.tj41
            public final void a(fqv fqvVar) {
                List list;
                String str = this.a;
                ct10 ct10Var = fqvVar.b;
                if (ct10Var != null) {
                    String str2 = ct10Var.a;
                    fh41 fh41Var2 = fh41.this;
                    fh41Var2.f.b("wm_js_lastmessage_error " + str2);
                    new IllegalStateException(str2);
                    ChatRequest a = fh41Var2.a(str);
                    if (a != null) {
                        qsx qsxVar = fh41Var2.b;
                        if (qsxVar != null && (list = (List) qsxVar.a.get(a)) != null) {
                            Iterator it = a.J0(list).iterator();
                            if (it.hasNext()) {
                                throw unr0.i(it);
                            }
                        }
                        String str3 = (String) fh41Var2.a.remove(a);
                        if (str3 != null) {
                            fh41Var2.b(str3);
                        }
                    }
                    fh41Var2.b(str);
                }
            }
        };
        raxVar.getClass();
        jl40.m();
        raxVar.g.put(F, tj41Var);
        hdu hduVar = fh41Var.c.a;
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        if (chatRequest instanceof f8b) {
            jSONArray.put(((f8b) chatRequest).a);
        } else if (chatRequest instanceof j8b) {
            jSONArray2.put(((j8b) chatRequest).a);
        } else {
            jl40.x("Only chat id or bot id are supported for last message");
        }
        JSONObject put = new JSONObject().put("objectName", "chatsLastMessageChanged").put("observerId", F2).put("params", new JSONObject().put("chatIds", jSONArray).put("guids", jSONArray2));
        MessageType messageType = MessageType.Observe;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("channelId", (String) hduVar.b);
        jSONObject.put("id", F);
        jSONObject.put("type", messageType.getRawValue());
        jSONObject.put("refId", F2);
        if (put != null) {
            jSONObject.put(Constants.KEY_DATA, put);
        }
        c9v.h(fh41Var.d, nax.b(jSONObject));
    }
}
