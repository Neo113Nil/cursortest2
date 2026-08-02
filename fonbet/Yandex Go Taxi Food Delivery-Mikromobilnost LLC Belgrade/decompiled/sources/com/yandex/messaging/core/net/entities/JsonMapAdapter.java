package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.FromJson;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.ToJson;
import defpackage.b64;
import defpackage.kbs;
import defpackage.unr0;
import defpackage.yp6;
import java.io.IOException;
import java.util.Map;
import ru.CryptoPro.reprov.x509.PolicyMappingsExtension;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0014\b\u0001\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0002\b\u0003\u0018\u00010\u00062\u001a\u0010\n\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00060\tH\u0007¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0002\b\u0003\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/yandex/messaging/core/net/entities/JsonMapAdapter;", "", "<init>", "()V", "Lcom/squareup/moshi/JsonWriter;", "writer", "", "", PolicyMappingsExtension.MAP, "Lcom/squareup/moshi/JsonAdapter;", "delegate", "Lzy11;", "toJson", "(Lcom/squareup/moshi/JsonWriter;Ljava/util/Map;Lcom/squareup/moshi/JsonAdapter;)V", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Ljava/util/Map;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class JsonMapAdapter {

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[JsonReader.Token.values().length];
            try {
                iArr[JsonReader.Token.BEGIN_OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JsonReader.Token.STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[JsonReader.Token.NULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    @JsonMap
    @FromJson
    public final Map<String, ?> fromJson(JsonReader reader) throws IOException {
        JsonReader.Token peek = reader.peek();
        int i = peek == null ? -1 : WhenMappings.a[peek.ordinal()];
        if (i == 1) {
            return (Map) reader.readJsonValue();
        }
        if (i != 2) {
            if (i == 3) {
                return (Map) reader.nextNull();
            }
            kbs.k("Expected BEGIN_OBJECT or STRING at ", reader.getPath(), ", but found ", reader.peek());
            return null;
        }
        String nextString = reader.nextString();
        yp6 yp6Var = new yp6();
        yp6Var.x0(nextString);
        try {
            Object readJsonValue = JsonReader.of(yp6Var).readJsonValue();
            if (readJsonValue instanceof Map) {
                return (Map) readJsonValue;
            }
            throw new JsonDataException(b64.l("Expected a JSON Object inside string at ", reader.getPath(), ", but found: ", readJsonValue != null ? readJsonValue.getClass().getSimpleName() : "null"));
        } catch (Exception e) {
            throw new JsonDataException(unr0.p("Cannot parse stringified JSON at ", reader.getPath(), ". String received: '", nextString, "'"), e);
        }
    }

    @ToJson
    public final void toJson(JsonWriter writer, @JsonMap Map<String, ?> map, JsonAdapter<Map<String, Object>> delegate) {
        delegate.toJson(writer, (JsonWriter) map);
    }
}
