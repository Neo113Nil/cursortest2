package com.squareup.wire;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001¨\u0006\u0003"}, d2 = {"redacting", "Lcom/squareup/moshi/JsonAdapter;", "T", "wire-moshi-adapter"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RedactingJsonAdapterKt {
    public static final <T> JsonAdapter<T> redacting(final JsonAdapter<T> jsonAdapter) {
        return new JsonAdapter<T>() { // from class: com.squareup.wire.RedactingJsonAdapterKt$redacting$1
            @Override // com.squareup.moshi.JsonAdapter
            public T fromJson(JsonReader reader) {
                return jsonAdapter.fromJson(reader);
            }

            @Override // com.squareup.moshi.JsonAdapter
            public void toJson(JsonWriter writer, T value) {
                RedactedTag redactedTag = (RedactedTag) writer.tag(RedactedTag.class);
                if (redactedTag == null) {
                    redactedTag = new RedactedTag();
                    writer.setTag(RedactedTag.class, redactedTag);
                }
                boolean enabled = redactedTag.getEnabled();
                redactedTag.setEnabled(true);
                try {
                    jsonAdapter.toJson(writer, (JsonWriter) value);
                } finally {
                    redactedTag.setEnabled(enabled);
                }
            }
        };
    }
}
