package xsna;

import com.ironsource.X3;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.d1h0;

/* compiled from: DocsSave.kt */
/* loaded from: classes14.dex */
public final class wtn<T extends d1h0> extends rsg0<T> {
    public final aay<T> s;

    /* compiled from: DocsSave.kt */
    public static final class a extends aay<tq4> {
        @Override // xsna.aay
        public final tq4 a(JSONObject jSONObject) {
            int i = jSONObject.getInt("id");
            UserId userId = new UserId(jSONObject.getLong("owner_id"));
            int i2 = jSONObject.getInt("duration");
            String string = jSONObject.getString("link_ogg");
            String string2 = jSONObject.getString("link_mp3");
            JSONArray jSONArray = jSONObject.getJSONArray("waveform");
            byte[] bArr = new byte[jSONArray.length()];
            int length = jSONArray.length();
            for (int i3 = 0; i3 < length; i3++) {
                bArr[i3] = (byte) (jSONArray.getInt(i3) & 255);
            }
            return new tq4(i, userId, i2, bArr, string2, string, jSONObject.has("access_key") ? jSONObject.getString("access_key") : "");
        }
    }

    /* compiled from: DocsSave.kt */
    public static final class b {
        public static wtn a(String str) {
            return new wtn(str, new a());
        }

        public static wtn b(String str) {
            return new wtn(str, new c());
        }

        public static wtn c(String str) {
            return new wtn(str, new d());
        }
    }

    /* compiled from: DocsSave.kt */
    public static final class c extends aay<fun> {
        @Override // xsna.aay
        public final fun a(JSONObject jSONObject) {
            Image image;
            long j;
            String str;
            String str2;
            int i;
            int i2;
            JSONObject optJSONObject;
            JSONArray optJSONArray;
            int i3 = jSONObject.getInt("id");
            UserId userId = new UserId(jSONObject.getLong("owner_id"));
            String optString = jSONObject.optString("title", null);
            long j2 = jSONObject.getLong("size");
            String string = jSONObject.has("ext") ? jSONObject.getString("ext") : "";
            String string2 = jSONObject.getString("url");
            int i4 = jSONObject.getInt("date");
            int i5 = jSONObject.getInt("type");
            JSONObject optJSONObject2 = jSONObject.optJSONObject("preview");
            if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("photo")) == null || (optJSONArray = optJSONObject.optJSONArray("sizes")) == null) {
                image = null;
                j = j2;
                str = string;
                str2 = string2;
                i = i4;
                i2 = i5;
            } else {
                j = j2;
                str = string;
                str2 = string2;
                i = i4;
                i2 = i5;
                image = new Image(optJSONArray, null, 2, null);
            }
            return new fun(i3, userId, optString, j, str, str2, i, i2, image);
        }
    }

    /* compiled from: DocsSave.kt */
    public static final class d extends aay<bdu> {
        @Override // xsna.aay
        public final bdu a(JSONObject jSONObject) {
            return new bdu(jSONObject.getInt("id"), new UserId(jSONObject.getLong("owner_id")), jSONObject.getString("url"), jSONObject.getInt("width"), jSONObject.getInt("height"), jSONObject.getString("access_key"));
        }
    }

    public wtn(String str, aay aayVar) {
        super("docs.save");
        this.s = aayVar;
        K(X3.i.b, str);
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("response");
            return this.s.a(jSONObject2.getJSONObject(jSONObject2.getString("type")));
        } catch (Exception unused) {
            return null;
        }
    }
}
