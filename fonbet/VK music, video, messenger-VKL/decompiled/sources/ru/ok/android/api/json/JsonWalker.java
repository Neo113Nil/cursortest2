package ru.ok.android.api.json;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.Reader;

/* loaded from: classes9.dex */
public final class JsonWalker {
    private JsonWalker() {
    }

    private static void skipArrayValue(@NonNull JsonIterator jsonIterator) throws IOException {
        jsonIterator.skipNext();
        boolean z = true;
        while (jsonIterator.whatsNext() != 93) {
            if (!z) {
                jsonIterator.expectNext(44);
                jsonIterator.skipNext();
            }
            skipValue(jsonIterator);
            z = false;
        }
        jsonIterator.skipNext();
    }

    private static void skipObjectValue(@NonNull JsonIterator jsonIterator) throws IOException {
        jsonIterator.skipNext();
        boolean z = true;
        while (jsonIterator.whatsNext() != 125) {
            if (!z) {
                jsonIterator.expectNext(44);
                jsonIterator.skipNext();
            }
            jsonIterator.expectNext(34);
            jsonIterator.skipNext();
            jsonIterator.expectNext(58);
            jsonIterator.skipNext();
            skipValue(jsonIterator);
            z = false;
        }
        jsonIterator.skipNext();
    }

    public static void skipValue(@NonNull JsonIterator jsonIterator) throws IOException {
        int whatsNext = jsonIterator.whatsNext();
        if (whatsNext != 34 && whatsNext != 49) {
            if (whatsNext == 91) {
                skipArrayValue(jsonIterator);
                return;
            } else if (whatsNext != 98 && whatsNext != 110) {
                if (whatsNext != 123) {
                    throw JsonSyntaxException.unexpectedToken(jsonIterator.whatsNext(), jsonIterator.getPosition(), jsonIterator.getSnippet());
                }
                skipObjectValue(jsonIterator);
                return;
            }
        }
        jsonIterator.skipNext();
    }

    private static void stepArrayValue(@NonNull JsonIterator jsonIterator, @NonNull Appendable appendable) throws IOException {
        jsonIterator.appendNextTo(appendable);
        boolean z = true;
        while (jsonIterator.whatsNext() != 93) {
            if (!z) {
                jsonIterator.expectNext(44);
                jsonIterator.appendNextTo(appendable);
            }
            stepValue(jsonIterator, appendable);
            z = false;
        }
        jsonIterator.appendNextTo(appendable);
    }

    private static void stepObjectValue(@NonNull JsonIterator jsonIterator, @NonNull Appendable appendable) throws IOException {
        jsonIterator.appendNextTo(appendable);
        boolean z = true;
        while (jsonIterator.whatsNext() != 125) {
            if (!z) {
                jsonIterator.expectNext(44);
                jsonIterator.appendNextTo(appendable);
            }
            jsonIterator.expectNext(34);
            jsonIterator.appendNextTo(appendable);
            jsonIterator.expectNext(58);
            jsonIterator.appendNextTo(appendable);
            stepValue(jsonIterator, appendable);
            z = false;
        }
        jsonIterator.appendNextTo(appendable);
    }

    public static void stepValue(@NonNull JsonIterator jsonIterator, @NonNull Appendable appendable) throws IOException {
        int whatsNext = jsonIterator.whatsNext();
        if (whatsNext != 34 && whatsNext != 49) {
            if (whatsNext == 91) {
                stepArrayValue(jsonIterator, appendable);
                return;
            } else if (whatsNext != 98 && whatsNext != 110) {
                if (whatsNext != 123) {
                    throw JsonSyntaxException.unexpectedToken(jsonIterator.whatsNext(), jsonIterator.getPosition(), jsonIterator.getSnippet());
                }
                stepObjectValue(jsonIterator, appendable);
                return;
            }
        }
        jsonIterator.appendNextTo(appendable);
    }

    public static void walkManyValues(@NonNull Reader reader, @NonNull Appendable appendable) throws IOException {
        JsonIterator jsonIterator = new JsonIterator(reader);
        stepValue(jsonIterator, appendable);
        while (jsonIterator.whatsNext() != 0) {
            jsonIterator.expectNext(44);
            jsonIterator.appendNextTo(appendable);
            stepValue(jsonIterator, appendable);
        }
    }

    public static void walkValue(@NonNull Reader reader, @NonNull Appendable appendable) throws IOException {
        JsonIterator jsonIterator = new JsonIterator(reader);
        stepValue(jsonIterator, appendable);
        if (jsonIterator.whatsNext() != 0) {
            throw JsonSyntaxException.unexpectedToken(jsonIterator.whatsNext(), jsonIterator.getPosition(), jsonIterator.getSnippet());
        }
    }

    public static void walkValue(@NonNull Reader reader, @NonNull JsonWriter jsonWriter) throws IOException {
        JsonIterator jsonIterator = new JsonIterator(reader);
        stepValue(jsonIterator, jsonWriter);
        if (jsonIterator.whatsNext() != 0) {
            throw JsonSyntaxException.unexpectedToken(jsonIterator.whatsNext(), jsonIterator.getPosition(), jsonIterator.getSnippet());
        }
    }

    private static void stepValue(@NonNull JsonIterator jsonIterator, @NonNull JsonWriter jsonWriter) throws IOException {
        int whatsNext = jsonIterator.whatsNext();
        if (whatsNext == 34) {
            jsonWriter.value(jsonIterator.nextUnquotedString());
            return;
        }
        if (whatsNext == 49) {
            jsonWriter.value(AbstractJsonReader.parseNumber(jsonIterator.next()));
            return;
        }
        if (whatsNext == 91) {
            stepArrayValue(jsonIterator, jsonWriter);
            return;
        }
        if (whatsNext == 98) {
            jsonWriter.value(jsonIterator.next().equals("true"));
        } else if (whatsNext == 110) {
            jsonWriter.nullValue();
        } else {
            if (whatsNext == 123) {
                stepObjectValue(jsonIterator, jsonWriter);
                return;
            }
            throw JsonSyntaxException.unexpectedToken(jsonIterator.whatsNext(), jsonIterator.getPosition(), jsonIterator.getSnippet());
        }
    }

    private static void stepArrayValue(@NonNull JsonIterator jsonIterator, @NonNull JsonWriter jsonWriter) throws IOException {
        jsonWriter.beginArray();
        boolean z = true;
        while (jsonIterator.whatsNext() != 93) {
            if (!z) {
                jsonIterator.expectNext(44);
                jsonIterator.skipNext();
            }
            stepValue(jsonIterator, jsonWriter);
            z = false;
        }
        jsonWriter.endArray();
    }

    public static void walkManyValues(@NonNull Reader reader, @NonNull JsonWriter jsonWriter) throws IOException {
        JsonIterator jsonIterator = new JsonIterator(reader);
        stepValue(jsonIterator, jsonWriter);
        while (jsonIterator.whatsNext() != 0) {
            jsonIterator.expectNext(44);
            jsonIterator.skipNext();
            stepValue(jsonIterator, jsonWriter);
        }
    }

    public static void walkValue(@NonNull JsonReader jsonReader, @NonNull JsonWriter jsonWriter) throws IOException {
        try {
            int peek = jsonReader.peek();
            if (peek == 34) {
                jsonWriter.value(jsonReader.stringValue());
                return;
            }
            if (peek == 49) {
                jsonWriter.value(jsonReader.numberValue());
                return;
            }
            if (peek == 91) {
                jsonReader.beginArray();
                jsonWriter.beginArray();
                while (jsonReader.peek() != 93) {
                    walkValue(jsonReader, jsonWriter);
                }
                jsonReader.endArray();
                jsonWriter.endArray();
                return;
            }
            if (peek == 98) {
                jsonWriter.value(jsonReader.booleanValue());
                return;
            }
            if (peek == 110) {
                jsonReader.skipValue();
                jsonWriter.nullValue();
            } else {
                if (peek == 123) {
                    jsonReader.beginObject();
                    jsonWriter.beginObject();
                    while (jsonReader.peek() != 125) {
                        jsonWriter.name(jsonReader.name());
                        walkValue(jsonReader, jsonWriter);
                    }
                    jsonReader.endObject();
                    jsonWriter.endObject();
                    return;
                }
                throw JsonStateException.notAtValue(jsonReader.peek());
            }
        } catch (JsonTypeMismatchException e) {
            throw new AssertionError("Can't be", e);
        }
    }

    private static void stepObjectValue(@NonNull JsonIterator jsonIterator, @NonNull JsonWriter jsonWriter) throws IOException {
        jsonWriter.beginObject();
        boolean z = true;
        while (jsonIterator.whatsNext() != 125) {
            if (!z) {
                jsonIterator.expectNext(44);
                jsonIterator.skipNext();
            }
            jsonIterator.expectNext(34);
            jsonWriter.name(jsonIterator.nextUnquotedString());
            jsonIterator.expectNext(58);
            jsonIterator.skipNext();
            stepValue(jsonIterator, jsonWriter);
            z = false;
        }
        jsonWriter.endObject();
    }
}
