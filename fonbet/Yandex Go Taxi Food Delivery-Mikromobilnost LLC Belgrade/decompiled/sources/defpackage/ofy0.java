package defpackage;

import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionReason;
import org.json.JSONObject;

/* loaded from: classes.dex */
public interface ofy0 {
    default hex b(String str, JSONObject jSONObject) {
        hex hexVar = get(str);
        if (hexVar != null) {
            return hexVar;
        }
        ParsingException parsingException = fg90.a;
        throw new ParsingException(ParsingExceptionReason.MISSING_TEMPLATE, oyr.p("Template '", str, "' is missing!"), null, new idx(jSONObject), cvw.i0(jSONObject), 4);
    }

    hex get(String str);
}
