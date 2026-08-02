package defpackage;

import android.content.Context;
import android.view.View;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.customview.DivCustomActionHandlerImpl;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.expression.BduiExpressionResolverImpl;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class pmf {
    public final LinkedHashMap a;

    public pmf(LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
    }

    public final void a(DivCustomActionHandlerImpl divCustomActionHandlerImpl, String str, View view, BduiExpressionResolverImpl bduiExpressionResolverImpl) {
        c(str).a(divCustomActionHandlerImpl, view, bduiExpressionResolverImpl);
    }

    public final View b(String str, Context context, JSONObject jSONObject) {
        kz4 c = c(str);
        return c.b(context, jSONObject != null ? c.b.b(c.a, jSONObject.toString()) : null);
    }

    public final kz4 c(String str) {
        Object obj = this.a.get(str);
        kz4 kz4Var = obj instanceof kz4 ? (kz4) obj : null;
        if (kz4Var != null) {
            return kz4Var;
        }
        ny61.r(g8e.o("Cannot find creator for custom type ", str));
        return null;
    }

    public final boolean d(String str) {
        return this.a.containsKey(str);
    }
}
