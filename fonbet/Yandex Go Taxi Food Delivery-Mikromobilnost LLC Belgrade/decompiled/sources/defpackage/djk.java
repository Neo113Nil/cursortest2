package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivCollectionItemBuilder;
import com.yandex.div2.JsonParserComponent;
import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class djk implements zsq0, nyi {
    public final JsonParserComponent a;

    public djk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        Expression a = a.a(yf90Var, jSONObject, Constants.KEY_DATA, wm11.g);
        Object opt = jSONObject.opt("data_element_name");
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        String str = (String) (opt != null ? opt : null);
        if (str == null) {
            str = "it";
        }
        return new DivCollectionItemBuilder(a, str, wwg.J(yf90Var, jSONObject, "prototypes", this.a.p2, u991.a));
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, DivCollectionItemBuilder divCollectionItemBuilder) {
        JSONObject jSONObject = new JSONObject();
        a.g(yf90Var, jSONObject, Constants.KEY_DATA, divCollectionItemBuilder.a);
        wwg.Z(yf90Var, jSONObject, "data_element_name", divCollectionItemBuilder.b);
        wwg.c0(yf90Var, jSONObject, "prototypes", divCollectionItemBuilder.c, this.a.p2);
        return jSONObject;
    }
}
