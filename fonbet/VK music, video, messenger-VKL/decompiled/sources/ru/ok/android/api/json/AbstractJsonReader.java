package ru.ok.android.api.json;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.credentials.provider.CredentialEntry;
import java.io.IOException;
import java.math.BigInteger;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.go9;

/* loaded from: classes9.dex */
abstract class AbstractJsonReader extends AbstractJsonReaderContext {
    public AbstractJsonReader(@NonNull JsonReaderContext jsonReaderContext) {
        super(jsonReaderContext);
    }

    private static int parseInt(@NonNull String str) throws JsonTypeMismatchException {
        return (int) parseLong(str);
    }

    public static long parseLong(@NonNull String str) throws NumberFormatException {
        if (str.indexOf(46) >= 0 || str.indexOf(101) >= 0 || str.indexOf(69) >= 0) {
            return (long) Double.parseDouble(str);
        }
        int length = str.length();
        long j = 0;
        if (str.charAt(0) != '-') {
            if (length < 19) {
                return Long.parseLong(str);
            }
            if (length == 19 && str.compareTo("9223372036854775807") <= 0) {
                return Long.parseLong(str);
            }
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt < '0' || charAt > '9') {
                    throw new NumberFormatException("Cannot parse long from ".concat(str));
                }
                j = (j * 10) + (charAt - '0');
            }
            return j;
        }
        if (length < 20) {
            return Long.parseLong(str);
        }
        if (length == 20 && str.compareTo("-9223372036854775808") <= 0) {
            return Long.parseLong(str);
        }
        for (int i2 = 1; i2 < length; i2++) {
            char charAt2 = str.charAt(i2);
            if (charAt2 < '0' || charAt2 > '9') {
                throw new NumberFormatException("Cannot parse long from ".concat(str));
            }
            j = (j * 10) + (charAt2 - '0');
        }
        return -j;
    }

    @NonNull
    public static Number parseNumber(@NonNull String str) {
        if (str.indexOf(46) >= 0 || str.indexOf(101) >= 0 || str.indexOf(69) >= 0) {
            return Double.valueOf(Double.parseDouble(str));
        }
        int length = str.length();
        if (str.charAt(0) != '-') {
            if (length < 10) {
                return Integer.valueOf(Integer.parseInt(str));
            }
            if (length != 10) {
                return length < 19 ? Long.valueOf(Long.parseLong(str)) : (length != 19 || str.compareTo("9223372036854775807") > 0) ? new BigInteger(str) : Long.valueOf(Long.parseLong(str));
            }
            long parseLong = Long.parseLong(str);
            return parseLong <= 2147483647L ? Integer.valueOf((int) parseLong) : Long.valueOf(parseLong);
        }
        if (length < 11) {
            return Integer.valueOf(Integer.parseInt(str));
        }
        if (length != 11) {
            return length < 20 ? Long.valueOf(Long.parseLong(str)) : (length != 20 || str.compareTo("-9223372036854775808") > 0) ? new BigInteger(str) : Long.valueOf(Long.parseLong(str));
        }
        long parseLong2 = Long.parseLong(str);
        return parseLong2 >= -2147483648L ? Integer.valueOf((int) parseLong2) : Long.valueOf(parseLong2);
    }

    @Override // ru.ok.android.api.json.JsonReader
    public final boolean booleanValue() throws IOException, JsonTypeMismatchException {
        int peek = peek();
        if (peek == 34) {
            String unquotedScalarValue = unquotedScalarValue();
            String trim = unquotedScalarValue.trim();
            trim.getClass();
            if (trim.equals("true")) {
                return true;
            }
            if (trim.equals(CredentialEntry.FALSE_STRING)) {
                return false;
            }
            throw new JsonTypeMismatchException("Cannot parse boolean from string ".concat(unquotedScalarValue));
        }
        if (peek == 49) {
            return Double.parseDouble(scalarValue()) != ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        }
        if (peek != 91) {
            if (peek == 98) {
                return scalarValue().equals("true");
            }
            if (peek == 110) {
                scalarValue();
                return false;
            }
            if (peek != 123) {
                throw JsonStateException.notAtValue(peek);
            }
        }
        throw unexpectedValue(98);
    }

    @Override // ru.ok.android.api.json.JsonReader
    public final double doubleValue() throws IOException, JsonTypeMismatchException {
        int peek = peek();
        if (peek == 34) {
            String unquotedScalarValue = unquotedScalarValue();
            try {
                return Double.parseDouble(unquotedScalarValue.trim());
            } catch (NumberFormatException unused) {
                throw new JsonTypeMismatchException(go9.b("Cannot parse double from string ", unquotedScalarValue));
            }
        }
        if (peek == 49) {
            return Double.parseDouble(scalarValue());
        }
        if (peek != 91) {
            if (peek == 98) {
                if (scalarValue().equals("true")) {
                    return 1.0d;
                }
                return ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
            }
            if (peek == 110) {
                scalarValue();
                return ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
            }
            if (peek != 123) {
                throw JsonStateException.notAtValue(peek);
            }
        }
        throw unexpectedValue(49);
    }

    @Override // ru.ok.android.api.json.JsonReader
    public final boolean hasNext() throws IOException {
        int peek = peek();
        if (peek == 0) {
            return false;
        }
        if (peek == 34 || peek == 39 || peek == 49 || peek == 91) {
            return true;
        }
        if (peek == 93) {
            return false;
        }
        if (peek == 98 || peek == 110 || peek == 123) {
            return true;
        }
        if (peek == 125) {
            return false;
        }
        throw new AssertionError();
    }

    @Override // ru.ok.android.api.json.JsonReader
    public final int intValue() throws IOException, JsonTypeMismatchException {
        int peek = peek();
        if (peek == 34) {
            String unquotedScalarValue = unquotedScalarValue();
            try {
                return parseInt(unquotedScalarValue.trim());
            } catch (NumberFormatException unused) {
                throw new JsonTypeMismatchException(go9.b("Cannot parse int from string ", unquotedScalarValue));
            }
        }
        if (peek == 49) {
            return parseInt(scalarValue());
        }
        if (peek != 91) {
            if (peek == 98) {
                return scalarValue().equals("true") ? 1 : 0;
            }
            if (peek == 110) {
                scalarValue();
                return 0;
            }
            if (peek != 123) {
                throw JsonStateException.notAtValue(peek);
            }
        }
        throw unexpectedValue(49);
    }

    @Override // ru.ok.android.api.json.JsonReader
    @NonNull
    public String jsonValue() throws IOException {
        int peek = peek();
        if (peek == 0) {
            return "";
        }
        if (peek != 34 && peek != 49) {
            if (peek != 91) {
                if (peek != 98 && peek != 110) {
                    if (peek != 123) {
                        throw JsonStateException.notAtValue(peek);
                    }
                }
            }
            return structureValue();
        }
        return scalarValue();
    }

    @Override // ru.ok.android.api.json.JsonReader
    public final long longValue() throws IOException, JsonTypeMismatchException {
        int peek = peek();
        if (peek == 34) {
            String unquotedScalarValue = unquotedScalarValue();
            try {
                return parseLong(unquotedScalarValue.trim());
            } catch (NumberFormatException unused) {
                throw new JsonTypeMismatchException(go9.b("Cannot parse long from string ", unquotedScalarValue));
            }
        }
        if (peek == 49) {
            return parseLong(scalarValue());
        }
        if (peek != 91) {
            if (peek == 98) {
                return scalarValue().equals("true") ? 1L : 0L;
            }
            if (peek == 110) {
                scalarValue();
                return 0L;
            }
            if (peek != 123) {
                throw JsonStateException.notAtValue(peek);
            }
        }
        throw unexpectedValue(49);
    }

    @Override // ru.ok.android.api.json.JsonReader
    @Nullable
    public String nullableStringValue() throws IOException {
        int peek = peek();
        if (peek == 34) {
            return unquotedScalarValue();
        }
        if (peek != 49) {
            if (peek != 91) {
                if (peek != 98) {
                    if (peek == 110) {
                        scalarValue();
                        return null;
                    }
                    if (peek != 123) {
                        throw JsonStateException.notAtValue(peek);
                    }
                }
            }
            return structureValue();
        }
        return scalarValue();
    }

    @Override // ru.ok.android.api.json.JsonReader
    @NonNull
    public final Number numberValue() throws IOException, JsonTypeMismatchException {
        int peek = peek();
        if (peek == 34) {
            String unquotedScalarValue = unquotedScalarValue();
            try {
                return parseNumber(unquotedScalarValue.trim());
            } catch (NumberFormatException e) {
                throw new JsonTypeMismatchException(go9.b("Cannot parse number from string ", unquotedScalarValue), e);
            }
        }
        if (peek == 49) {
            return parseNumber(scalarValue());
        }
        if (peek != 91) {
            if (peek == 98) {
                return Integer.valueOf(scalarValue().equals("true") ? 1 : 0);
            }
            if (peek == 110) {
                scalarValue();
                return 0;
            }
            if (peek != 123) {
                throw JsonStateException.notAtValue(peek);
            }
        }
        throw unexpectedValue(49);
    }

    @NonNull
    public abstract String scalarValue() throws IOException;

    @Override // ru.ok.android.api.json.JsonReader
    public void skipValue() throws IOException {
        int peek = peek();
        if (peek != 34 && peek != 49) {
            if (peek == 91) {
                try {
                    beginArray();
                    while (hasNext()) {
                        skipValue();
                    }
                    endArray();
                    return;
                } catch (JsonTypeMismatchException e) {
                    throw new AssertionError(e);
                }
            }
            if (peek != 98 && peek != 110) {
                if (peek != 123) {
                    throw JsonStateException.notAtValue(peek);
                }
                try {
                    beginObject();
                    while (hasNext()) {
                        name();
                        skipValue();
                    }
                    endObject();
                    return;
                } catch (JsonTypeMismatchException e2) {
                    throw new AssertionError(e2);
                }
            }
        }
        scalarValue();
    }

    @Override // ru.ok.android.api.json.JsonReader
    @NonNull
    public String stringValue() throws IOException {
        int peek = peek();
        if (peek == 34) {
            return unquotedScalarValue();
        }
        if (peek != 49) {
            if (peek != 91) {
                if (peek != 98 && peek != 110) {
                    if (peek != 123) {
                        throw JsonStateException.notAtValue(peek);
                    }
                }
            }
            return structureValue();
        }
        return scalarValue();
    }

    @NonNull
    public abstract String structureValue() throws IOException;

    @NonNull
    public JsonTypeMismatchException unexpectedValue(int i) throws IOException {
        int peek = peek();
        if (peek == 34 || peek == 49 || peek == 91 || peek == 98 || peek == 110 || peek == 123) {
            return new JsonTypeMismatchException(i, peek);
        }
        throw JsonStateException.notAtValue(peek);
    }

    @NonNull
    public abstract String unquotedScalarValue() throws IOException;

    @Override // ru.ok.android.api.json.JsonReader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }
}
