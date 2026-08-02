package ru.ok.android.api.json;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public abstract class ListJsonParser<T> extends ArrayJsonParser<ArrayList<T>, List<T>> {

    public static final class Wrapped<T> extends ListJsonParser<T> {
        private final JsonParser<? extends T> parser;

        public /* synthetic */ Wrapped(JsonParser jsonParser, int i) {
            this(jsonParser);
        }

        @Override // ru.ok.android.api.json.ListJsonParser, ru.ok.android.api.json.ArrayJsonParser
        public /* bridge */ /* synthetic */ void accumulateValue(@NonNull Object obj, int i, @NonNull JsonReader jsonReader) throws JsonParseException, IOException {
            accumulateValue((ArrayList) obj, i, jsonReader);
        }

        @Override // ru.ok.android.api.json.ListJsonParser, ru.ok.android.api.json.ArrayJsonParser
        public /* bridge */ /* synthetic */ Object convertResult(@NonNull Object obj) throws JsonParseException {
            return convertResult((ArrayList) obj);
        }

        @Override // ru.ok.android.api.json.ListJsonParser, ru.ok.android.api.json.ArrayJsonParser
        @NonNull
        public /* bridge */ /* synthetic */ Object createAccumulator() {
            return createAccumulator();
        }

        @Override // ru.ok.android.api.json.ListJsonParser
        public T parseValue(int i, @NonNull JsonReader jsonReader) throws JsonParseException, IOException {
            return this.parser.parse(jsonReader);
        }

        private Wrapped(@NonNull JsonParser<? extends T> jsonParser) {
            this.parser = jsonParser;
        }
    }

    public static <T> JsonParser<List<T>> wrap(@NonNull JsonParser<? extends T> jsonParser) {
        return new Wrapped(jsonParser, 0);
    }

    public abstract T parseValue(int i, @NonNull JsonReader jsonReader) throws JsonParseException, IOException;

    @Override // ru.ok.android.api.json.ArrayJsonParser
    public final void accumulateValue(@NonNull ArrayList<T> arrayList, int i, @NonNull JsonReader jsonReader) throws JsonParseException, IOException {
        arrayList.add(parseValue(i, jsonReader));
    }

    @Override // ru.ok.android.api.json.ArrayJsonParser
    public final ArrayList<T> convertResult(@NonNull ArrayList<T> arrayList) throws JsonParseException {
        checkResult(arrayList);
        return arrayList;
    }

    @Override // ru.ok.android.api.json.ArrayJsonParser
    @NonNull
    public final ArrayList<T> createAccumulator() {
        return new ArrayList<>();
    }

    public void checkResult(@NonNull ArrayList<T> arrayList) throws JsonParseException {
    }
}
