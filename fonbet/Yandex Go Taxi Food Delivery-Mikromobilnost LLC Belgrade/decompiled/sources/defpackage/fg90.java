package defpackage;

import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionReason;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class fg90 {
    public static final ParsingException a = new ParsingException(ParsingExceptionReason.MISSING_VARIABLE, "", null, null, null, 28);

    public static final ParsingException a(JSONArray jSONArray, String str, int i, Exception exc) {
        return new ParsingException(ParsingExceptionReason.DEPENDENCY_FAILED, oyr.l(i, "Value at ", " position of '", str, "' is failed to create"), exc, new vbx(jSONArray), cvw.h0(jSONArray));
    }

    public static final ParsingException b(JSONObject jSONObject, String str, Exception exc) {
        return new ParsingException(ParsingExceptionReason.DEPENDENCY_FAILED, oyr.p("Value for key '", str, "' is failed to create"), exc, new idx(jSONObject), cvw.i0(jSONObject));
    }

    public static final ParsingException c(Object obj, String str) {
        return new ParsingException(ParsingExceptionReason.INVALID_VALUE, "Value '" + j(obj) + "' at path '" + str + "' is not valid", null, null, null, 28);
    }

    public static final ParsingException d(JSONArray jSONArray, String str, int i, Object obj) {
        ParsingExceptionReason parsingExceptionReason = ParsingExceptionReason.INVALID_VALUE;
        StringBuilder sb = new StringBuilder("Value '");
        sb.append(j(obj));
        sb.append("' at ");
        sb.append(i);
        sb.append(" position of '");
        return new ParsingException(parsingExceptionReason, oyr.t(sb, str, "' is not valid"), null, new vbx(jSONArray), cvw.h0(jSONArray), 4);
    }

    public static final ParsingException e(JSONArray jSONArray, String str, int i, Object obj, Exception exc) {
        ParsingExceptionReason parsingExceptionReason = ParsingExceptionReason.INVALID_VALUE;
        StringBuilder sb = new StringBuilder("Value '");
        sb.append(j(obj));
        sb.append("' at ");
        sb.append(i);
        sb.append(" position of '");
        return new ParsingException(parsingExceptionReason, oyr.t(sb, str, "' is not valid"), exc, new vbx(jSONArray), null, 16);
    }

    public static final ParsingException f(JSONObject jSONObject, String str, Object obj) {
        return new ParsingException(ParsingExceptionReason.INVALID_VALUE, "Value '" + j(obj) + "' for key '" + str + "' is not valid", null, new idx(jSONObject), cvw.i0(jSONObject), 4);
    }

    public static final ParsingException g(JSONObject jSONObject, String str, Object obj, Exception exc) {
        return new ParsingException(ParsingExceptionReason.INVALID_VALUE, "Value '" + j(obj) + "' for key '" + str + "' is not valid", exc, new idx(jSONObject), null, 16);
    }

    public static final ParsingException h(String str, JSONObject jSONObject) {
        return new ParsingException(ParsingExceptionReason.MISSING_VALUE, oyr.p("Value for key '", str, "' is missing"), null, new idx(jSONObject), cvw.i0(jSONObject), 4);
    }

    public static final ParsingException i(String str, Object obj, Exception exc) {
        return new ParsingException(ParsingExceptionReason.INVALID_VALUE, "Value '" + j(obj) + "' for key '" + str + "' could not be resolved", exc, null, null, 24);
    }

    public static final String j(Object obj) {
        String valueOf = String.valueOf(obj);
        return valueOf.length() > 100 ? gvu0.A0(97, valueOf).concat("...") : valueOf;
    }

    public static final ParsingException k(String str, String str2, Object obj, ClassCastException classCastException) {
        return new ParsingException(ParsingExceptionReason.TYPE_MISMATCH, qv10.r(b64.v("Expression '", str, "': '", str2, "' received value of wrong type: '"), obj, '\''), classCastException, null, null, 24);
    }

    public static final ParsingException l(JSONArray jSONArray, String str, int i, Object obj) {
        ParsingExceptionReason parsingExceptionReason = ParsingExceptionReason.TYPE_MISMATCH;
        StringBuilder v = unr0.v(i, "Value at ", " position of '", str, "' has wrong type ");
        v.append(obj.getClass().getName());
        return new ParsingException(parsingExceptionReason, v.toString(), null, new vbx(jSONArray), cvw.h0(jSONArray), 4);
    }

    public static final ParsingException m(JSONObject jSONObject, String str, Object obj) {
        ParsingExceptionReason parsingExceptionReason = ParsingExceptionReason.TYPE_MISMATCH;
        StringBuilder x = unr0.x("Value for key '", str, "' has wrong type ");
        x.append(obj.getClass().getName());
        return new ParsingException(parsingExceptionReason, x.toString(), null, new idx(jSONObject), cvw.i0(jSONObject), 4);
    }
}
