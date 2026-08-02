package com.yandex.messaging.internal;

import android.net.Uri;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import defpackage.tmj;

/* loaded from: classes15.dex */
public class UriJsonAdapter extends JsonAdapter<Uri> {
    public static final JsonAdapter.Factory FACTORY = new tmj(4);
    private final Moshi mMoshi;

    public UriJsonAdapter(Moshi moshi) {
        this.mMoshi = moshi;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Uri fromJson(JsonReader jsonReader) {
        return Uri.parse((String) this.mMoshi.adapter(String.class).fromJson(jsonReader));
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Uri uri) {
        Uri uri2 = uri;
        jsonWriter.value(uri2 == null ? null : uri2.toString());
    }
}
