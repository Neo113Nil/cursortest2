package com.yandex.messaging.internal;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import defpackage.t3z;
import defpackage.u3z;
import defpackage.v3z;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00052\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/yandex/messaging/internal/LocalMessageRefJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/internal/LocalMessageRef;", "<init>", "()V", "Companion", "u3z", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class LocalMessageRefJsonAdapter extends JsonAdapter<LocalMessageRef> {
    public static final int $stable = 0;
    public static final u3z Companion = new u3z();
    private static final JsonReader.Options NAME_OPTIONS = JsonReader.Options.of(ClidProvider.TIMESTAMP, "local");

    @Override // com.squareup.moshi.JsonAdapter
    public final LocalMessageRef fromJson(JsonReader jsonReader) {
        JsonReader.Token peek = jsonReader.peek();
        int i = peek == null ? -1 : v3z.a[peek.ordinal()];
        if (i == 1) {
            t3z t3zVar = LocalMessageRef.Companion;
            String nextString = jsonReader.nextString();
            t3zVar.getClass();
            return t3z.b(nextString);
        }
        if (i != 2) {
            if (i != 3) {
                throw new JsonDataException();
            }
            t3z t3zVar2 = LocalMessageRef.Companion;
            long nextLong = jsonReader.nextLong();
            t3zVar2.getClass();
            return t3z.a(nextLong);
        }
        jsonReader.beginObject();
        long j = 0;
        String str = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(NAME_OPTIONS);
            if (selectName == 0) {
                j = jsonReader.nextLong();
            } else {
                if (selectName != 1) {
                    throw new JsonDataException();
                }
                str = jsonReader.nextString();
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw new JsonDataException();
        }
        LocalMessageRef.Companion.getClass();
        return t3z.a(j);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, LocalMessageRef localMessageRef) {
        LocalMessageRef localMessageRef2 = localMessageRef;
        if (localMessageRef2 == null) {
            jsonWriter.nullValue();
            return;
        }
        if (localMessageRef2.getMessageId() == null && localMessageRef2.getTimestamp() != 0) {
            jsonWriter.value(localMessageRef2.getTimestamp());
        } else if (localMessageRef2.getMessageId() == null || localMessageRef2.getTimestamp() != 0) {
            jsonWriter.nullValue();
        } else {
            jsonWriter.value(localMessageRef2.getMessageId());
        }
    }
}
