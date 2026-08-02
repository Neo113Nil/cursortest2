package sg.bigo.ads.cj;

import androidx.annotation.NonNull;
import org.json.JSONObject;
import sg.bigo.ads.api.core.b;

/* loaded from: classes9.dex */
public final class m implements b.c {
    private final String a;
    private final String b;
    private final String c;

    public m(@NonNull JSONObject jSONObject) {
        this.a = jSONObject.optString("vendor_url");
        this.b = jSONObject.optString("vendor_key");
        this.c = jSONObject.optString("params");
    }

    @Override // sg.bigo.ads.api.core.b.c
    public final String a() {
        return this.a;
    }

    @Override // sg.bigo.ads.api.core.b.c
    public final String b() {
        return this.b;
    }

    @Override // sg.bigo.ads.api.core.b.c
    public final String c() {
        return this.c;
    }
}
