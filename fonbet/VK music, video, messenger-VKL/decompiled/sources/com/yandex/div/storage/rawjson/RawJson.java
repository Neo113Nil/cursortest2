package com.yandex.div.storage.rawjson;

import org.json.JSONObject;
import xsna.epx;

/* compiled from: RawJson.kt */
/* loaded from: classes7.dex */
public interface RawJson {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: RawJson.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final RawJson invoke(String str, JSONObject jSONObject) {
            return new Ready(str, jSONObject);
        }
    }

    /* compiled from: RawJson.kt */
    public static final class Ready implements RawJson {
        private final JSONObject data;
        private final String id;

        public Ready(String str, JSONObject jSONObject) {
            this.id = str;
            this.data = jSONObject;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Ready)) {
                return false;
            }
            Ready ready = (Ready) obj;
            return epx.f(this.id, ready.id) && epx.f(this.data, ready.data);
        }

        @Override // com.yandex.div.storage.rawjson.RawJson
        public JSONObject getData() {
            return this.data;
        }

        @Override // com.yandex.div.storage.rawjson.RawJson
        public String getId() {
            return this.id;
        }

        public int hashCode() {
            return this.data.hashCode() + (this.id.hashCode() * 31);
        }

        public String toString() {
            return "Ready(id=" + this.id + ", data=" + this.data + ')';
        }
    }

    JSONObject getData();

    String getId();
}
