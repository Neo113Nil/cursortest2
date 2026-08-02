package ru.ok.android.api.json;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.util.Locale;
import xsna.rqi;
import xsna.tdj;

/* loaded from: classes11.dex */
public class JsonSyntaxException extends IOException {
    public JsonSyntaxException(String str) {
        super(str);
    }

    @NonNull
    public static JsonSyntaxException unexpectedChar(int i, long j, @NonNull String str) {
        if (i >= 0) {
            return i < 31 ? new JsonSyntaxException(String.format(Locale.US, "Unexpected char (U+%04x) at pos %d near `%s`", Integer.valueOf(i), Long.valueOf(j), str)) : new JsonSyntaxException(String.format(Locale.US, "Unexpected char '%s' (U+%04x) at pos %d near `%s`", Character.valueOf((char) i), Integer.valueOf(i), Long.valueOf(j), str));
        }
        Locale locale = Locale.US;
        return new JsonSyntaxException("Unexpected EOF at pos " + j + " after `" + str + "`");
    }

    @NonNull
    public static JsonSyntaxException unexpectedToken(int i, long j, @NonNull String str) throws IOException {
        if (i != 0) {
            String jsonTokens = JsonTokens.toString(i);
            Locale locale = Locale.US;
            return new JsonSyntaxException(tdj.a(rqi.d(j, "Unexpected ", jsonTokens, " at pos "), " near `", str, "`"));
        }
        Locale locale2 = Locale.US;
        return new JsonSyntaxException("Unexpected eof at pos " + j + " after `" + str + "`");
    }

    public JsonSyntaxException(Throwable th) {
        super(th);
    }
}
