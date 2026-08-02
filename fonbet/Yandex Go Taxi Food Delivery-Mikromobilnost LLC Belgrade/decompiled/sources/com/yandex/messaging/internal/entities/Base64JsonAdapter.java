package com.yandex.messaging.internal.entities;

import android.util.Base64;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import defpackage.cvw;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Set;
import okio.ByteString;

/* loaded from: classes15.dex */
public class Base64JsonAdapter {
    public static final JsonAdapter.Factory FACTORY = new AnonymousClass1();

    /* renamed from: com.yandex.messaging.internal.entities.Base64JsonAdapter$1, reason: invalid class name */
    public class AnonymousClass1 implements JsonAdapter.Factory {

        /* renamed from: com.yandex.messaging.internal.entities.Base64JsonAdapter$1$1, reason: invalid class name and collision with other inner class name */
        class C00871 extends JsonAdapter<ByteString> {
            @Override // com.squareup.moshi.JsonAdapter
            public final ByteString fromJson(JsonReader jsonReader) {
                return cvw.q(jsonReader.nextString());
            }

            @Override // com.squareup.moshi.JsonAdapter
            public final void toJson(JsonWriter jsonWriter, ByteString byteString) {
                ByteString byteString2 = byteString;
                if (byteString2 != null) {
                    jsonWriter.value(byteString2.a());
                } else {
                    jsonWriter.nullValue();
                }
            }
        }

        /* renamed from: com.yandex.messaging.internal.entities.Base64JsonAdapter$1$2, reason: invalid class name */
        class AnonymousClass2 extends JsonAdapter<byte[]> {
            @Override // com.squareup.moshi.JsonAdapter
            public final byte[] fromJson(JsonReader jsonReader) {
                return Base64.decode(jsonReader.nextString(), 2);
            }

            @Override // com.squareup.moshi.JsonAdapter
            public final void toJson(JsonWriter jsonWriter, byte[] bArr) {
                byte[] bArr2 = bArr;
                if (bArr2 != null) {
                    jsonWriter.value(Base64.encodeToString(bArr2, 2));
                } else {
                    jsonWriter.value("");
                }
            }
        }

        @Override // com.squareup.moshi.JsonAdapter.Factory
        public final JsonAdapter create(Type type, Set set, Moshi moshi) {
            if (type == ByteString.class) {
                return new C00871();
            }
            if (Byte.TYPE.equals(type instanceof GenericArrayType ? ((GenericArrayType) type).getGenericComponentType() : type instanceof Class ? ((Class) type).getComponentType() : null)) {
                return new AnonymousClass2();
            }
            return null;
        }
    }

    private Base64JsonAdapter() {
    }
}
