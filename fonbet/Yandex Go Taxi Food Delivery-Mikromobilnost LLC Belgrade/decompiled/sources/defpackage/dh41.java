package defpackage;

import com.yandex.messenger.websdk.api.ChatRequest;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;
import org.json.JSONObject;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes15.dex */
public final class dh41 extends yh41 {
    public final /* synthetic */ fh41 a;
    public final /* synthetic */ eh41 b;

    public dh41(fh41 fh41Var, eh41 eh41Var) {
        this.a = fh41Var;
        this.b = eh41Var;
    }

    @Override // defpackage.yh41
    public final void a(JSONObject jSONObject) {
        qsx qsxVar;
        List list;
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            JSONObject optJSONObject = jSONObject.optJSONObject(next);
            if (optJSONObject != null) {
                this.a.f.b("wm_js_lastmessage_chat " + next);
                optJSONObject.optString("text");
                long optLong = optJSONObject.optLong(ClidProvider.TIMESTAMP);
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("from");
                if (optJSONObject2 != null) {
                    optJSONObject2.optString("display_name");
                }
                optJSONObject.optBoolean("own");
                new Date(optLong / 1000);
                eh41 eh41Var = this.b;
                fh41 fh41Var = eh41Var.c;
                ChatRequest a = fh41Var.a(eh41Var.a);
                if (a != null && (qsxVar = fh41Var.b) != null && (list = (List) qsxVar.a.get(a)) != null) {
                    Iterator it = a.J0(list).iterator();
                    if (it.hasNext()) {
                        throw unr0.i(it);
                    }
                }
            }
        }
    }
}
