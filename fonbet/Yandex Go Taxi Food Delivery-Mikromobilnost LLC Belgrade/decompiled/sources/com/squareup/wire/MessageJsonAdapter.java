package com.squareup.wire;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import com.squareup.wire.internal.RuntimeMessageAdapter;
import defpackage.ctq;
import defpackage.jl40;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0014\b\u0000\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001*\u0014\b\u0001\u0010\u0004*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\u0012\u0004\u0012\u00028\u00000\u0005BE\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00050\b\u0012\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\b0\u0005¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\"\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00050\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001aR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\b0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001bR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/squareup/wire/MessageJsonAdapter;", "Lcom/squareup/wire/Message;", "M", "Lcom/squareup/wire/Message$Builder;", "B", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/wire/internal/RuntimeMessageAdapter;", "messageAdapter", "", "", "jsonAdapters", "", "redactedFieldsAdapter", "<init>", "(Lcom/squareup/wire/internal/RuntimeMessageAdapter;Ljava/util/List;Lcom/squareup/moshi/JsonAdapter;)V", "Lcom/squareup/moshi/JsonWriter;", "out", Constants.KEY_MESSAGE, "Lzy11;", "toJson", "(Lcom/squareup/moshi/JsonWriter;Lcom/squareup/wire/Message;)V", "Lcom/squareup/moshi/JsonReader;", "input", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lcom/squareup/wire/Message;", "Lcom/squareup/wire/internal/RuntimeMessageAdapter;", "Ljava/util/List;", "Lcom/squareup/moshi/JsonAdapter;", "jsonNames", "jsonAlternateNames", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "wire-moshi-adapter"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MessageJsonAdapter<M extends Message<M, B>, B extends Message.Builder<M, B>> extends JsonAdapter<M> {
    private final List<JsonAdapter<Object>> jsonAdapters;
    private final List<String> jsonAlternateNames;
    private final List<String> jsonNames;
    private final RuntimeMessageAdapter<M, B> messageAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<List<String>> redactedFieldsAdapter;

    /* JADX WARN: Multi-variable type inference failed */
    public MessageJsonAdapter(RuntimeMessageAdapter<M, B> runtimeMessageAdapter, List<? extends JsonAdapter<Object>> list, JsonAdapter<List<String>> jsonAdapter) {
        this.messageAdapter = runtimeMessageAdapter;
        this.jsonAdapters = list;
        this.redactedFieldsAdapter = jsonAdapter;
        List<String> jsonNames = runtimeMessageAdapter.getJsonNames();
        this.jsonNames = jsonNames;
        this.jsonAlternateNames = runtimeMessageAdapter.getJsonAlternateNames();
        ArrayList arrayList = new ArrayList();
        int size = jsonNames.size();
        for (int i = 0; i < size; i++) {
            String str = this.jsonNames.get(i);
            arrayList.add(str);
            String str2 = this.jsonAlternateNames.get(i);
            if (str2 == null) {
                str2 = str + (char) 0;
            }
            arrayList.add(str2);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.options = JsonReader.Options.of((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 toJson$lambda$0(JsonWriter jsonWriter, String str, Object obj, JsonAdapter jsonAdapter) {
        jsonWriter.name(str);
        jsonAdapter.toJson(jsonWriter, (JsonWriter) obj);
        return zy11.a;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public M fromJson(JsonReader input) throws IOException {
        B newBuilder = this.messageAdapter.newBuilder();
        input.beginObject();
        while (input.hasNext()) {
            int selectName = input.selectName(this.options);
            if (selectName == -1) {
                input.skipName();
                input.skipValue();
            } else {
                int i = selectName / 2;
                Object fromJson = this.jsonAdapters.get(i).fromJson(input);
                if (fromJson != null) {
                    this.messageAdapter.getFieldBindingsArray()[i].set(newBuilder, fromJson);
                }
            }
        }
        input.endObject();
        return (M) newBuilder.build();
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter out, M message) throws IOException {
        RedactedTag redactedTag = (RedactedTag) out.tag(RedactedTag.class);
        JsonAdapter<List<String>> jsonAdapter = jl40.l(redactedTag != null ? Boolean.valueOf(redactedTag.getEnabled()) : null, Boolean.TRUE) ? this.redactedFieldsAdapter : null;
        out.beginObject();
        this.messageAdapter.writeAllFields(message, this.jsonAdapters, jsonAdapter, new ctq(26, out));
        out.endObject();
    }
}
