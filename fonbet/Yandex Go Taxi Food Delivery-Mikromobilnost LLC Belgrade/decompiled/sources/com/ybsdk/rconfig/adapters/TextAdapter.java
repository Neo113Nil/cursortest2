package com.ybsdk.rconfig.adapters;

import android.content.Context;
import com.squareup.moshi.FromJson;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.ToJson;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import defpackage.g8e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/rconfig/adapters/TextAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/utils/text/Text;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lcom/ybsdk/core/utils/text/Text;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value", "Lzy11;", "toJson", "(Lcom/squareup/moshi/JsonWriter;Lcom/ybsdk/core/utils/text/Text;)V", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TextAdapter extends JsonAdapter<Text> {
    public final Context a;

    public TextAdapter(Context context) {
        this.a = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    @FromJson
    public Text fromJson(JsonReader reader) {
        return g8e.i(Text.Companion, reader.nextString());
    }

    @Override // com.squareup.moshi.JsonAdapter
    @ToJson
    public void toJson(JsonWriter writer, Text value) {
        if (value != null) {
            writer.value(d.a(this.a, value).toString());
        }
    }
}
