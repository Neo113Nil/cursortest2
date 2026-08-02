package defpackage;

import java.util.Arrays;
import org.json.JSONObject;
import yads.d02;

/* loaded from: classes7.dex */
public final class oe81 implements s191 {
    public final kn71 a = new kn71();

    @Override // defpackage.s191
    public final Object a(JSONObject jSONObject) {
        String optString = jSONObject.optString("name");
        if (optString == null || optString.length() == 0 || optString.equals("null")) {
            yx61.e("Native Ad json has not required attributes");
            return null;
        }
        String optString2 = jSONObject.optString("value");
        if (optString2 == null || optString2.length() == 0 || optString2.equals("null")) {
            yx61.e("Native Ad json has not required attributes");
            return null;
        }
        if (!"review_count".equals(optString)) {
            return optString2;
        }
        kn71 kn71Var = this.a;
        kn71Var.getClass();
        try {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < optString2.length(); i++) {
                char charAt = optString2.charAt(i);
                if (!rza.b(charAt)) {
                    sb.append(charAt);
                }
            }
            return kn71Var.a.format(Long.parseLong(sb.toString()));
        } catch (NumberFormatException unused) {
            String.format("Could not parse review count value. Review Count value is %s", Arrays.copyOf(new Object[]{optString2}, 1));
            throw new d02("Native Ad json has not required attributes");
        }
    }
}
