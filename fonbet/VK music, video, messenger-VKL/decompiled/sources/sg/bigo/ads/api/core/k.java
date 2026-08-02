package sg.bigo.ads.api.core;

import androidx.annotation.NonNull;
import org.json.JSONObject;
import ru.ok.android.utils.Logger;

/* loaded from: classes9.dex */
public final class k implements sg.bigo.ads.ai.f {
    private final int a;
    private final int b;
    private final String c;
    private final String d;

    public k(@NonNull JSONObject jSONObject) {
        this.a = jSONObject.optInt(Logger.METHOD_W);
        this.b = jSONObject.optInt("h");
        this.c = jSONObject.optString("url");
        this.d = jSONObject.optString("md5");
    }

    @Override // sg.bigo.ads.ai.f
    public final int a() {
        return this.a;
    }

    @Override // sg.bigo.ads.ai.f
    public final int b() {
        return this.b;
    }

    @Override // sg.bigo.ads.ai.f
    public final String c() {
        return this.c;
    }
}
