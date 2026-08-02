package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivVisibilityAction;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class eql implements zsq0, nyi {
    public final JsonParserComponent a;

    public eql(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    @Override // defpackage.nyi
    public final java.lang.Object a(defpackage.yf90 r20, org.json.JSONObject r21) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eql.a(yf90, org.json.JSONObject):java.lang.Object");
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, DivVisibilityAction divVisibilityAction) {
        JSONObject jSONObject = new JSONObject();
        tnk tnkVar = divVisibilityAction.a;
        JsonParserComponent jsonParserComponent = this.a;
        wwg.b0(yf90Var, jSONObject, "download_callbacks", tnkVar, jsonParserComponent.a3);
        a.g(yf90Var, jSONObject, "is_enabled", divVisibilityAction.b);
        a.g(yf90Var, jSONObject, "log_id", divVisibilityAction.c);
        a.g(yf90Var, jSONObject, "log_limit", divVisibilityAction.d);
        wwg.Z(yf90Var, jSONObject, "payload", divVisibilityAction.e);
        Expression expression = divVisibilityAction.f;
        tls tlsVar = b.c;
        a.h(yf90Var, jSONObject, "referer", expression, tlsVar);
        wwg.Z(yf90Var, jSONObject, "scope_id", divVisibilityAction.g);
        wwg.b0(yf90Var, jSONObject, "typed", divVisibilityAction.h, jsonParserComponent.k1);
        a.h(yf90Var, jSONObject, "url", divVisibilityAction.i, tlsVar);
        a.g(yf90Var, jSONObject, "visibility_duration", divVisibilityAction.j);
        a.g(yf90Var, jSONObject, "visibility_percentage", divVisibilityAction.k);
        return jSONObject;
    }
}
