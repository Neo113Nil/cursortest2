package yads;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.s3q0;
import xsna.wzs;

/* loaded from: classes10.dex */
public final class ii0 extends Lambda implements wzs {
    public final /* synthetic */ ji0 b;
    public final /* synthetic */ List c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ii0(ji0 ji0Var, ArrayList arrayList) {
        super(2);
        this.b = ji0Var;
        this.c = arrayList;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        JSONObject jSONObject = (JSONObject) obj;
        yh0 yh0Var = (yh0) obj2;
        this.b.getClass();
        String str = null;
        if (jSONObject.has("view_name")) {
            try {
                obj3 = jSONObject.get("view_name");
            } catch (JSONException unused) {
                obj3 = null;
            }
            if (obj3 instanceof String) {
                str = (String) obj3;
            }
        }
        if (str != null) {
            this.c.add(new xh0(yh0Var, str));
        }
        return s3q0.a;
    }
}
