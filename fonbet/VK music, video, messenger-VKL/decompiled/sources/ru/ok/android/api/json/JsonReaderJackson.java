package ru.ok.android.api.json;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.credentials.provider.CredentialEntry;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.io.ContentReference;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.p3y0;

/* loaded from: classes9.dex */
public class JsonReaderJackson extends AbstractJsonReaderContext {
    private static final JsonFactory FACTORY = new JsonFactory();

    @NonNull
    private final com.fasterxml.jackson.core.JsonParser parser;

    /* renamed from: ru.ok.android.api.json.JsonReaderJackson$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType;

        static {
            int[] iArr = new int[JsonParser.NumberType.values().length];
            $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType = iArr;
            try {
                iArr[JsonParser.NumberType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[JsonParser.NumberType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private JsonReaderJackson(@NonNull com.fasterxml.jackson.core.JsonParser jsonParser, @NonNull JsonReaderContext jsonReaderContext) throws IOException {
        super(jsonReaderContext);
        this.parser = jsonParser;
        try {
            jsonParser.N();
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
            throw new JsonSyntaxException(e);
        }
    }

    public static JsonReader create(@NonNull Reader reader) throws IOException {
        return new JsonReaderJackson(createParser(reader), new SimpleJsonReaderContext());
    }

    private static com.fasterxml.jackson.core.JsonParser createParser(@NonNull Reader reader) throws IOException {
        try {
            return FACTORY.e(reader);
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
            throw new JsonSyntaxException(e);
        }
    }

    @NonNull
    private static String getStructure(@NonNull com.fasterxml.jackson.core.JsonParser jsonParser) throws IOException {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        JsonFactory jsonFactory = FACTORY;
        jsonFactory.getClass();
        p3y0 b = jsonFactory.b(charArrayWriter, jsonFactory.a(new ContentReference(true, charArrayWriter), false));
        b.j(jsonParser);
        b.close();
        return charArrayWriter.toString();
    }

    @NonNull
    private static JsonTypeMismatchException typeMismatch(int i, int i2) {
        return new JsonTypeMismatchException(i, i2);
    }

    @Override // ru.ok.android.api.json.JsonReader
    public void beginArray() throws IOException, JsonTypeMismatchException {
        try {
            switch (this.parser.n()) {
                case -1:
                    throw new UnsupportedOperationException("Non-blocking parsing not supported");
                case 0:
                    throw JsonStateException.notAtValue(0);
                case 1:
                    throw typeMismatch(91, 123);
                case 2:
                    throw JsonStateException.notAtValue(125);
                case 3:
                    this.parser.N();
                    return;
                case 4:
                    throw JsonStateException.notAtValue(93);
                case 5:
                    throw JsonStateException.notAtValue(39);
                case 6:
                    throw typeMismatch(91, 34);
                case 7:
                case 8:
                    throw typeMismatch(91, 49);
                case 9:
                case 10:
                    throw typeMismatch(91, 98);
                case 11:
                    throw typeMismatch(91, 110);
                case 12:
                    throw new UnsupportedOperationException("Embedded objects not supported");
                default:
                    throw new AssertionError("Unknown JsonTokenId " + this.parser.n());
            }
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
            throw new JsonSyntaxException(e);
        }
    }

    @Override // ru.ok.android.api.json.JsonReader
    public void beginObject() throws IOException, JsonTypeMismatchException {
        try {
            switch (this.parser.n()) {
                case -1:
                    throw new UnsupportedOperationException("Non-blocking parsing not supported");
                case 0:
                    throw JsonStateException.notAtValue(0);
                case 1:
                    this.parser.N();
                    return;
                case 2:
                    throw JsonStateException.notAtValue(125);
                case 3:
                    throw typeMismatch(123, 91);
                case 4:
                    throw JsonStateException.notAtValue(93);
                case 5:
                    throw JsonStateException.notAtValue(39);
                case 6:
                    throw typeMismatch(123, 34);
                case 7:
                case 8:
                    throw typeMismatch(123, 49);
                case 9:
                case 10:
                    throw typeMismatch(123, 98);
                case 11:
                    throw typeMismatch(123, 110);
                case 12:
                    throw new UnsupportedOperationException("Embedded objects not supported");
                default:
                    throw new AssertionError("Unknown JsonTokenId " + this.parser.n());
            }
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
            throw new JsonSyntaxException(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009f  */
    @Override // ru.ok.android.api.json.JsonReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean booleanValue() throws IOException, JsonTypeMismatchException {
        char c;
        try {
            switch (this.parser.n()) {
                case -1:
                    throw new UnsupportedOperationException("Non-blocking parsing not supported");
                case 0:
                    throw JsonStateException.notAtValue(0);
                case 1:
                    throw typeMismatch(98, 123);
                case 2:
                    throw JsonStateException.notAtValue(125);
                case 3:
                    throw typeMismatch(98, 91);
                case 4:
                    throw JsonStateException.notAtValue(93);
                case 5:
                    throw JsonStateException.notAtValue(39);
                case 6:
                    String E = this.parser.E();
                    this.parser.N();
                    String trim = E.trim();
                    int hashCode = trim.hashCode();
                    if (hashCode == 3569038) {
                        if (trim.equals("true")) {
                            c = 0;
                            if (c != 0) {
                            }
                            return true;
                        }
                        c = 65535;
                        if (c != 0) {
                        }
                        return true;
                    }
                    if (hashCode == 97196323 && trim.equals(CredentialEntry.FALSE_STRING)) {
                        c = 1;
                        if (c != 0) {
                            if (c != 1) {
                                throw new JsonTypeMismatchException("Cannot parse boolean from string ".concat(E));
                            }
                            return false;
                        }
                        return true;
                    }
                    c = 65535;
                    if (c != 0) {
                    }
                    return true;
                case 7:
                    long y = this.parser.y();
                    this.parser.N();
                    if (y != 0) {
                        return true;
                    }
                    return false;
                case 8:
                    double v = this.parser.v();
                    this.parser.N();
                    if (v != ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                        return true;
                    }
                    return false;
                case 9:
                    this.parser.N();
                    return true;
                case 10:
                    this.parser.N();
                    return false;
                case 11:
                    this.parser.N();
                    return false;
                case 12:
                    throw new UnsupportedOperationException("Embedded objects not supported");
                default:
                    throw new AssertionError("Unknown JsonTokenId " + this.parser.n());
            }
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
            throw new JsonSyntaxException(e);
        }
    }

    @Override // ru.ok.android.api.json.JsonReader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.parser.close();
    }

    @Override // ru.ok.android.api.json.JsonReader
    public double doubleValue() throws IOException, JsonTypeMismatchException {
        try {
            switch (this.parser.n()) {
                case -1:
                    throw new UnsupportedOperationException("Non-blocking parsing not supported");
                case 0:
                    throw JsonStateException.notAtValue(0);
                case 1:
                    throw typeMismatch(49, 123);
                case 2:
                    throw JsonStateException.notAtValue(125);
                case 3:
                    throw typeMismatch(49, 91);
                case 4:
                    throw JsonStateException.notAtValue(93);
                case 5:
                    throw JsonStateException.notAtValue(39);
                case 6:
                    String E = this.parser.E();
                    this.parser.N();
                    try {
                        return Double.parseDouble(E.trim());
                    } catch (NumberFormatException unused) {
                        throw new JsonTypeMismatchException("Cannot parse double from string " + E);
                    }
                case 7:
                    long y = this.parser.y();
                    this.parser.N();
                    return y;
                case 8:
                    double v = this.parser.v();
                    this.parser.N();
                    return v;
                case 9:
                    this.parser.N();
                    return 1.0d;
                case 10:
                    this.parser.N();
                    return ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
                case 11:
                    this.parser.N();
                    return ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
                case 12:
                    throw new UnsupportedOperationException("Embedded objects not supported");
                default:
                    throw new AssertionError("Unknown JsonTokenId " + this.parser.n());
            }
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
            throw new JsonSyntaxException(e);
        }
        throw new JsonSyntaxException(e);
    }

    @Override // ru.ok.android.api.json.JsonReader
    public void endArray() throws IOException {
        try {
            switch (this.parser.n()) {
                case -1:
                    throw new UnsupportedOperationException("Non-blocking parsing not supported");
                case 0:
                    throw JsonStateException.notAtEndArray(0);
                case 1:
                    throw JsonStateException.notAtEndArray(123);
                case 2:
                    throw JsonStateException.notAtEndArray(125);
                case 3:
                    throw JsonStateException.notAtEndArray(91);
                case 4:
                    this.parser.N();
                    return;
                case 5:
                    throw JsonStateException.notAtEndArray(39);
                case 6:
                    throw JsonStateException.notAtEndArray(34);
                case 7:
                case 8:
                    throw JsonStateException.notAtEndArray(49);
                case 9:
                case 10:
                    throw JsonStateException.notAtEndArray(98);
                case 11:
                    throw JsonStateException.notAtEndArray(110);
                case 12:
                    throw new UnsupportedOperationException("Embedded objects not supported");
                default:
                    throw new AssertionError("Unknown JsonTokenId " + this.parser.n());
            }
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
            throw new JsonSyntaxException(e);
        }
    }

    @Override // ru.ok.android.api.json.JsonReader
    public void endObject() throws IOException {
        try {
            switch (this.parser.n()) {
                case -1:
                    throw new UnsupportedOperationException("Non-blocking parsing not supported");
                case 0:
                    throw JsonStateException.notAtEndObject(0);
                case 1:
                    throw JsonStateException.notAtEndObject(123);
                case 2:
                    this.parser.N();
                    return;
                case 3:
                    throw JsonStateException.notAtEndObject(91);
                case 4:
                    throw JsonStateException.notAtEndObject(93);
                case 5:
                    throw JsonStateException.notAtEndObject(39);
                case 6:
                    throw JsonStateException.notAtEndObject(34);
                case 7:
                case 8:
                    throw JsonStateException.notAtEndObject(49);
                case 9:
                case 10:
                    throw JsonStateException.notAtEndObject(98);
                case 11:
                    throw JsonStateException.notAtEndObject(110);
                case 12:
                    throw new UnsupportedOperationException("Embedded objects not supported");
                default:
                    throw new AssertionError("Unknown JsonTokenId " + this.parser.n());
            }
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
            throw new JsonSyntaxException(e);
        }
    }

    @Override // ru.ok.android.api.json.JsonReader
    public boolean hasNext() throws IOException {
        switch (this.parser.n()) {
            case -1:
                throw new UnsupportedOperationException("Non-blocking parsing not supported");
            case 0:
            case 2:
            case 4:
                return false;
            case 1:
            case 3:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                return true;
            case 12:
                throw new UnsupportedOperationException("Embedded objects not supported");
            default:
                throw new AssertionError("Unknown JsonTokenId " + this.parser.n());
        }
    }

    @Override // ru.ok.android.api.json.JsonReader
    public int intValue() throws IOException, JsonTypeMismatchException {
        return (int) longValue();
    }

    @Override // ru.ok.android.api.json.JsonReader
    @NonNull
    public String jsonValue() throws IOException {
        try {
            switch (this.parser.n()) {
                case -1:
                    throw new UnsupportedOperationException("Non-blocking parsing not supported");
                case 0:
                    return "";
                case 1:
                case 3:
                case 6:
                    String structure = getStructure(this.parser);
                    this.parser.N();
                    return structure;
                case 2:
                    throw JsonStateException.notAtValue(125);
                case 4:
                    throw JsonStateException.notAtValue(93);
                case 5:
                    throw JsonStateException.notAtValue(39);
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                    String E = this.parser.E();
                    this.parser.N();
                    return E;
                case 12:
                    throw new UnsupportedOperationException("Embedded objects not supported");
                default:
                    throw new AssertionError("Unknown JsonTokenId " + this.parser.n());
            }
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
            throw new JsonSyntaxException(e);
        }
    }

    @Override // ru.ok.android.api.json.JsonReader
    public long longValue() throws IOException, JsonTypeMismatchException {
        try {
            switch (this.parser.n()) {
                case -1:
                    throw new UnsupportedOperationException("Non-blocking parsing not supported");
                case 0:
                    throw JsonStateException.notAtValue(0);
                case 1:
                    throw typeMismatch(49, 123);
                case 2:
                    throw JsonStateException.notAtValue(125);
                case 3:
                    throw typeMismatch(49, 91);
                case 4:
                    throw JsonStateException.notAtValue(93);
                case 5:
                    throw JsonStateException.notAtValue(39);
                case 6:
                    String E = this.parser.E();
                    this.parser.N();
                    try {
                        return AbstractJsonReader.parseLong(E.trim());
                    } catch (NumberFormatException unused) {
                        throw new JsonTypeMismatchException("Cannot parse long from string " + E);
                    }
                case 7:
                    int i = AnonymousClass1.$SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[this.parser.z().ordinal()];
                    long y = (i == 1 || i == 2) ? this.parser.y() : this.parser.A().longValue();
                    this.parser.N();
                    return y;
                case 8:
                    double v = this.parser.v();
                    this.parser.N();
                    return (long) v;
                case 9:
                    this.parser.N();
                    return 1L;
                case 10:
                    this.parser.N();
                    return 0L;
                case 11:
                    this.parser.N();
                    return 0L;
                case 12:
                    throw new UnsupportedOperationException("Embedded objects not supported");
                default:
                    throw new AssertionError("Unknown JsonTokenId " + this.parser.n());
            }
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
            throw new JsonSyntaxException(e);
        }
        throw new JsonSyntaxException(e);
    }

    @Override // ru.ok.android.api.json.JsonReader
    @NonNull
    public String name() throws IOException {
        try {
            switch (this.parser.n()) {
                case -1:
                    throw new UnsupportedOperationException("Non-blocking parsing not supported");
                case 0:
                    throw JsonStateException.notAtName(0);
                case 1:
                    throw JsonStateException.notAtName(123);
                case 2:
                    throw JsonStateException.notAtName(125);
                case 3:
                    throw JsonStateException.notAtName(91);
                case 4:
                    throw JsonStateException.notAtName(93);
                case 5:
                    String q = this.parser.q();
                    this.parser.N();
                    return q;
                case 6:
                    throw JsonStateException.notAtName(34);
                case 7:
                case 8:
                    throw JsonStateException.notAtName(49);
                case 9:
                case 10:
                    throw JsonStateException.notAtName(98);
                case 11:
                    throw JsonStateException.notAtName(110);
                case 12:
                    throw new UnsupportedOperationException("Embedded objects not supported");
                default:
                    throw new AssertionError("Unknown JsonTokenId " + this.parser.n());
            }
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
            throw new JsonSyntaxException(e);
        }
    }

    @Override // ru.ok.android.api.json.JsonReader
    @Nullable
    public String nullableStringValue() throws IOException {
        try {
            switch (this.parser.n()) {
                case -1:
                    throw new UnsupportedOperationException("Non-blocking parsing not supported");
                case 0:
                    throw JsonStateException.notAtValue(0);
                case 1:
                case 3:
                    String structure = getStructure(this.parser);
                    this.parser.N();
                    return structure;
                case 2:
                    throw JsonStateException.notAtValue(125);
                case 4:
                    throw JsonStateException.notAtValue(93);
                case 5:
                    throw JsonStateException.notAtValue(39);
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    String E = this.parser.E();
                    this.parser.N();
                    return E;
                case 11:
                    this.parser.N();
                    return null;
                case 12:
                    throw new UnsupportedOperationException("Embedded objects not supported");
                default:
                    throw new AssertionError("Unknown JsonTokenId " + this.parser.n());
            }
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
            throw new JsonSyntaxException(e);
        }
    }

    @Override // ru.ok.android.api.json.JsonReader
    @NonNull
    public Number numberValue() throws IOException, JsonTypeMismatchException {
        try {
            switch (this.parser.n()) {
                case -1:
                    throw new UnsupportedOperationException("Non-blocking parsing not supported");
                case 0:
                    throw JsonStateException.notAtValue(0);
                case 1:
                    throw typeMismatch(49, 123);
                case 2:
                    throw JsonStateException.notAtValue(125);
                case 3:
                    throw typeMismatch(49, 91);
                case 4:
                    throw JsonStateException.notAtValue(93);
                case 5:
                    throw JsonStateException.notAtValue(39);
                case 6:
                    String E = this.parser.E();
                    this.parser.N();
                    try {
                        return AbstractJsonReader.parseNumber(E.trim());
                    } catch (NumberFormatException unused) {
                        throw new JsonTypeMismatchException("Cannot parse number from string " + E);
                    }
                case 7:
                case 8:
                    Number A = this.parser.A();
                    this.parser.N();
                    return A;
                case 9:
                    this.parser.N();
                    return 1;
                case 10:
                    this.parser.N();
                    return 0;
                case 11:
                    this.parser.N();
                    return 0;
                case 12:
                    throw new UnsupportedOperationException("Embedded objects not supported");
                default:
                    throw new AssertionError("Unknown JsonTokenId " + this.parser.n());
            }
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
            throw new JsonSyntaxException(e);
        }
        throw new JsonSyntaxException(e);
    }

    @Override // ru.ok.android.api.json.JsonReader
    public int peek() throws IOException {
        switch (this.parser.n()) {
            case -1:
                throw new UnsupportedOperationException("Non-blocking parsing not supported");
            case 0:
                return 0;
            case 1:
                return 123;
            case 2:
                return 125;
            case 3:
                return 91;
            case 4:
                return 93;
            case 5:
                return 39;
            case 6:
                return 34;
            case 7:
            case 8:
                return 49;
            case 9:
            case 10:
                return 98;
            case 11:
                return 110;
            case 12:
                throw new UnsupportedOperationException("Embedded objects not supported");
            default:
                throw new AssertionError("Unknown JsonTokenId " + this.parser.n());
        }
    }

    @Override // ru.ok.android.api.json.JsonReader
    public void skipValue() throws IOException {
        try {
            switch (this.parser.n()) {
                case -1:
                    throw new UnsupportedOperationException("Non-blocking parsing not supported");
                case 0:
                    throw JsonStateException.notAtValue(0);
                case 1:
                case 3:
                    this.parser.O();
                    this.parser.N();
                    return;
                case 2:
                    throw JsonStateException.notAtValue(125);
                case 4:
                    throw JsonStateException.notAtValue(93);
                case 5:
                    throw JsonStateException.notAtValue(39);
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                    this.parser.N();
                    return;
                case 12:
                    throw new UnsupportedOperationException("Embedded objects not supported");
                default:
                    throw new AssertionError("Unknown JsonTokenId " + this.parser.n());
            }
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
            throw new JsonSyntaxException(e);
        }
    }

    @Override // ru.ok.android.api.json.JsonReader
    @NonNull
    public String stringValue() throws IOException {
        try {
            switch (this.parser.n()) {
                case -1:
                    throw new UnsupportedOperationException("Non-blocking parsing not supported");
                case 0:
                    throw JsonStateException.notAtValue(0);
                case 1:
                case 3:
                    String structure = getStructure(this.parser);
                    this.parser.N();
                    return structure;
                case 2:
                    throw JsonStateException.notAtValue(125);
                case 4:
                    throw JsonStateException.notAtValue(93);
                case 5:
                    throw JsonStateException.notAtValue(39);
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    String E = this.parser.E();
                    this.parser.N();
                    return E;
                case 11:
                    this.parser.N();
                    return "null";
                case 12:
                    throw new UnsupportedOperationException("Embedded objects not supported");
                default:
                    throw new AssertionError("Unknown JsonTokenId " + this.parser.n());
            }
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
            throw new JsonSyntaxException(e);
        }
    }

    public static JsonReader create(@NonNull InputStream inputStream) throws IOException {
        return new JsonReaderJackson(createParser(inputStream), new SimpleJsonReaderContext());
    }

    public static JsonReader create(@NonNull String str) throws IOException {
        return new JsonReaderJackson(createParser(str), new SimpleJsonReaderContext());
    }

    private static com.fasterxml.jackson.core.JsonParser createParser(@NonNull InputStream inputStream) throws IOException {
        try {
            return FACTORY.d(inputStream);
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
            throw new JsonSyntaxException(e);
        }
    }

    public static JsonReader create(@NonNull Reader reader, @NonNull JsonReaderContext jsonReaderContext) throws IOException {
        return new JsonReaderJackson(createParser(reader), jsonReaderContext);
    }

    public static JsonReader create(@NonNull InputStream inputStream, @NonNull JsonReaderContext jsonReaderContext) throws IOException {
        return new JsonReaderJackson(createParser(inputStream), jsonReaderContext);
    }

    private static com.fasterxml.jackson.core.JsonParser createParser(@NonNull String str) throws IOException {
        try {
            return FACTORY.f(str);
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
            throw new JsonSyntaxException(e);
        }
    }

    public static JsonReader create(@NonNull String str, @NonNull JsonReaderContext jsonReaderContext) throws IOException {
        return new JsonReaderJackson(createParser(str), jsonReaderContext);
    }
}
