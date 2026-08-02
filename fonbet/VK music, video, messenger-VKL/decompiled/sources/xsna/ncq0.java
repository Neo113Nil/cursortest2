package xsna;

import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* compiled from: UploadServer.kt */
/* loaded from: classes18.dex */
public final class ncq0 {
    public static final ncq0 d = new ncq0("", null, null, null, null, 30);
    public final String a;
    public final String b;
    public final String c;

    /* compiled from: UploadServer.kt */
    public static final class a {
        public static void a() {
            ncq0 ncq0Var = ncq0.d;
        }

        public static ncq0 b(JSONObject jSONObject) {
            return new ncq0(jSONObject.getString(ApiProtocol.KEY_UPLOAD_URL), f370.D(jSONObject, "fallback_upload_url"), f370.D(jSONObject, "origin_upload_url"), f370.D(jSONObject, "origin_upload_description"), f370.D(jSONObject, "upload_result"));
        }
    }

    public ncq0(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str5;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public /* synthetic */ ncq0(String str, String str2, String str3, String str4, String str5, int i) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }
}
