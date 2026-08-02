package defpackage;

import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* loaded from: classes6.dex */
public final class a4x implements rs10 {
    public static final a4x a = new a4x();

    @Override // defpackage.rs10
    public final Object a(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        try {
            zsu0.b.getClass();
            JSONTokener jSONTokener = new JSONTokener(zsu0.c(byteBuffer));
            Object nextValue = jSONTokener.nextValue();
            if (jSONTokener.more()) {
                throw new IllegalArgumentException("Invalid JSON");
            }
            return nextValue;
        } catch (JSONException e) {
            yci0.p("Invalid JSON", e);
            return null;
        }
    }

    @Override // defpackage.rs10
    public final ByteBuffer b(Object obj) {
        if (obj == null) {
            return null;
        }
        Object d = iab1.d(obj);
        if (d instanceof String) {
            zsu0 zsu0Var = zsu0.b;
            String quote = JSONObject.quote((String) d);
            zsu0Var.getClass();
            return zsu0.d(quote);
        }
        zsu0 zsu0Var2 = zsu0.b;
        String obj2 = d.toString();
        zsu0Var2.getClass();
        return zsu0.d(obj2);
    }
}
