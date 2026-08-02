package xsna;

import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.StringReader;

/* compiled from: JsonParser.java */
/* loaded from: classes.dex */
public class bay implements xt50 {
    public static final con0 a = new con0("NO_OWNER");
    public static bpn0 b;

    public static wi50 a() {
        return new wi50(false);
    }

    public static void b(Appendable appendable, Object obj, izs izsVar) {
        if (izsVar != null) {
            appendable.append((CharSequence) izsVar.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(obj.toString());
        }
    }

    public static final u0y0 c() {
        bpn0 bpn0Var = b;
        if (bpn0Var == null) {
            bpn0Var = null;
        }
        return (u0y0) bpn0Var.getValue();
    }

    public static b9y d(JsonReader jsonReader) throws JsonIOException, JsonSyntaxException {
        boolean isLenient = jsonReader.isLenient();
        jsonReader.setLenient(true);
        try {
            try {
                return kpm0.a(jsonReader);
            } catch (OutOfMemoryError e) {
                throw new JsonParseException("Failed parsing JSON source: " + jsonReader + " to Json", e);
            } catch (StackOverflowError e2) {
                throw new JsonParseException("Failed parsing JSON source: " + jsonReader + " to Json", e2);
            }
        } finally {
            jsonReader.setLenient(isLenient);
        }
    }

    public static b9y e(String str) throws JsonSyntaxException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            b9y d = d(jsonReader);
            d.getClass();
            if (!(d instanceof u9y) && jsonReader.peek() != JsonToken.END_DOCUMENT) {
                throw new JsonSyntaxException("Did not consume the entire document.");
            }
            return d;
        } catch (MalformedJsonException e) {
            throw new JsonSyntaxException(e);
        } catch (IOException e2) {
            throw new JsonIOException(e2);
        } catch (NumberFormatException e3) {
            throw new JsonSyntaxException(e3);
        }
    }

    @Override // xsna.xt50
    public /* bridge */ /* synthetic */ Object get() {
        return "vkim_settings.sqlite";
    }
}
