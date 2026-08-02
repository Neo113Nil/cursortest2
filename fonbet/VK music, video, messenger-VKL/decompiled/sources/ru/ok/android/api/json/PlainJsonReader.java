package ru.ok.android.api.json;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import ru.ok.android.api.util.SimpleIntStack;

/* loaded from: classes9.dex */
public class PlainJsonReader extends AbstractJsonReader {
    private final JsonIterator iter;
    private final int rootScope;
    private final SimpleIntStack stack;
    private int token;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface RootScope {
        public static final int OPTIONAL_VALUE = 1;
        public static final int SINGLE_VALUE = 0;
    }

    public PlainJsonReader(@NonNull String str) {
        this(str, 0);
    }

    private void afterValue() {
        int peek = this.stack.peek();
        if (peek == 0) {
            this.stack.popPush(1);
        } else if (peek != 1) {
            if (peek == 2) {
                this.stack.popPush(3);
            } else if (peek != 3) {
                if (peek != 5) {
                    throw new AssertionError();
                }
                this.stack.popPush(6);
            }
        }
        this.token = -1;
    }

    private int next() throws IOException {
        JsonIterator jsonIterator = this.iter;
        int peek = this.stack.peek();
        int whatsNext = jsonIterator.whatsNext();
        switch (peek) {
            case 0:
                if (whatsNext == 0) {
                    if (this.rootScope != 0) {
                        return 0;
                    }
                    throw JsonSyntaxException.unexpectedToken(whatsNext, jsonIterator.getPosition(), jsonIterator.getSnippet());
                }
                break;
            case 1:
                if (whatsNext == 0) {
                    return 0;
                }
                break;
            case 2:
                if (whatsNext == 93) {
                    return 93;
                }
                break;
            case 3:
                if (whatsNext != 93) {
                    jsonIterator.expectNext(44);
                    jsonIterator.skipNext();
                    break;
                } else {
                    return 93;
                }
            case 4:
                if (whatsNext != 125) {
                    jsonIterator.expectNext(34);
                    break;
                } else {
                    return 125;
                }
            case 5:
                jsonIterator.expectNext(58);
                jsonIterator.skipNext();
                break;
            case 6:
                if (whatsNext != 125) {
                    jsonIterator.expectNext(44);
                    jsonIterator.skipNext();
                    jsonIterator.expectNext(34);
                    break;
                } else {
                    return 125;
                }
        }
        int whatsNext2 = jsonIterator.whatsNext();
        if (whatsNext2 == 34) {
            return (peek == 4 || peek == 6) ? 39 : 34;
        }
        if (whatsNext2 == 49 || whatsNext2 == 91 || whatsNext2 == 98 || whatsNext2 == 110 || whatsNext2 == 123) {
            return whatsNext2;
        }
        throw JsonSyntaxException.unexpectedToken(whatsNext2, jsonIterator.getPosition(), jsonIterator.getSnippet());
    }

    @Override // ru.ok.android.api.json.JsonReader
    public void beginArray() throws IOException, JsonTypeMismatchException {
        int peek = peek();
        if (peek != 0) {
            if (peek != 34) {
                if (peek != 39) {
                    if (peek != 49) {
                        if (peek == 91) {
                            this.stack.push(2);
                            this.token = -1;
                            this.iter.skipNext();
                            return;
                        } else if (peek != 93) {
                            if (peek != 98 && peek != 110 && peek != 123) {
                                if (peek != 125) {
                                    return;
                                }
                            }
                        }
                    }
                }
            }
            throw unexpectedValue(91);
        }
        throw JsonStateException.notAtValue(peek);
    }

    @Override // ru.ok.android.api.json.JsonReader
    public void beginObject() throws IOException, JsonTypeMismatchException {
        int peek = peek();
        if (peek != 0) {
            if (peek != 34) {
                if (peek != 39) {
                    if (peek != 49 && peek != 91) {
                        if (peek != 93) {
                            if (peek != 98 && peek != 110) {
                                if (peek == 123) {
                                    this.stack.push(4);
                                    this.token = -1;
                                    this.iter.skipNext();
                                    return;
                                } else if (peek != 125) {
                                    return;
                                }
                            }
                        }
                    }
                }
            }
            throw unexpectedValue(123);
        }
        throw JsonStateException.notAtValue(peek);
    }

    @Override // ru.ok.android.api.json.AbstractJsonReader, ru.ok.android.api.json.JsonReader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.iter.close();
    }

    @Override // ru.ok.android.api.json.JsonReader
    public void endArray() throws IOException {
        int peek = peek();
        if (peek != 93) {
            throw JsonStateException.notAtEndArray(peek);
        }
        this.stack.pop();
        afterValue();
        this.iter.skipNext();
    }

    @Override // ru.ok.android.api.json.JsonReader
    public void endObject() throws IOException {
        int peek = peek();
        if (peek != 125) {
            throw JsonStateException.notAtEndObject(peek);
        }
        this.stack.pop();
        afterValue();
        this.iter.skipNext();
    }

    @Override // ru.ok.android.api.json.AbstractJsonReader, ru.ok.android.api.json.JsonReader
    @NonNull
    public /* bridge */ /* synthetic */ String jsonValue() throws IOException {
        return super.jsonValue();
    }

    @Override // ru.ok.android.api.json.JsonReader
    @NonNull
    public String name() throws IOException {
        int peek = peek();
        if (peek != 39) {
            throw JsonStateException.notAtName(peek);
        }
        this.stack.popPush(5);
        this.token = -1;
        return this.iter.nextUnquotedString();
    }

    @Override // ru.ok.android.api.json.AbstractJsonReader, ru.ok.android.api.json.JsonReader
    @Nullable
    public /* bridge */ /* synthetic */ String nullableStringValue() throws IOException {
        return super.nullableStringValue();
    }

    @Override // ru.ok.android.api.json.JsonReader
    public int peek() throws IOException {
        int i = this.token;
        if (i != -1) {
            return i;
        }
        int next = next();
        this.token = next;
        return next;
    }

    @Override // ru.ok.android.api.json.AbstractJsonReader
    @NonNull
    public String scalarValue() throws IOException {
        afterValue();
        return this.iter.next();
    }

    @Override // ru.ok.android.api.json.AbstractJsonReader, ru.ok.android.api.json.JsonReader
    public void skipValue() throws IOException {
        int peek = peek();
        if (peek != 34 && peek != 49 && peek != 91 && peek != 98 && peek != 110 && peek != 123) {
            throw JsonStateException.notAtValue(peek);
        }
        afterValue();
        JsonWalker.skipValue(this.iter);
    }

    @Override // ru.ok.android.api.json.AbstractJsonReader, ru.ok.android.api.json.JsonReader
    @NonNull
    public /* bridge */ /* synthetic */ String stringValue() throws IOException {
        return super.stringValue();
    }

    @Override // ru.ok.android.api.json.AbstractJsonReader
    @NonNull
    public String structureValue() throws IOException {
        afterValue();
        StringBuilder sb = new StringBuilder();
        JsonWalker.stepValue(this.iter, sb);
        return sb.toString();
    }

    @Override // ru.ok.android.api.json.AbstractJsonReader
    @NonNull
    public String unquotedScalarValue() throws IOException {
        afterValue();
        return this.iter.nextUnquotedString();
    }

    public PlainJsonReader(@NonNull Reader reader) {
        this(reader, 0);
    }

    public PlainJsonReader(@NonNull String str, int i) {
        this(new StringReader(str), i);
    }

    public PlainJsonReader(@NonNull Reader reader, int i) {
        this(reader, i, new SimpleJsonReaderContext());
    }

    public PlainJsonReader(@NonNull String str, @NonNull JsonReaderContext jsonReaderContext) {
        this(str, 0, jsonReaderContext);
    }

    public PlainJsonReader(@NonNull Reader reader, @NonNull JsonReaderContext jsonReaderContext) {
        this(reader, 0, jsonReaderContext);
    }

    public PlainJsonReader(@NonNull String str, int i, @NonNull JsonReaderContext jsonReaderContext) {
        this(new StringReader(str), i, jsonReaderContext);
    }

    public PlainJsonReader(@NonNull Reader reader, int i, @NonNull JsonReaderContext jsonReaderContext) {
        super(jsonReaderContext);
        SimpleIntStack simpleIntStack = new SimpleIntStack();
        this.stack = simpleIntStack;
        this.token = -1;
        this.iter = new JsonIterator(reader);
        simpleIntStack.push(0);
        this.rootScope = i;
    }
}
