package sg.bigo.ads.cj;

import androidx.annotation.NonNull;
import org.json.JSONObject;
import ru.ok.android.utils.Logger;
import sg.bigo.ads.api.core.o;

/* loaded from: classes9.dex */
public final class i implements o.a {
    private final int a;
    private final int b;
    private final String c;
    private final String d;

    public i(@NonNull JSONObject jSONObject) {
        this.a = jSONObject.optInt(Logger.METHOD_W);
        this.b = jSONObject.optInt("h");
        this.c = jSONObject.optString("url");
        this.d = jSONObject.optString("md5");
    }

    @Override // sg.bigo.ads.api.core.o.a
    public final int a() {
        return this.a;
    }

    @Override // sg.bigo.ads.api.core.o.a
    public final int b() {
        return this.b;
    }

    @Override // sg.bigo.ads.api.core.o.a
    public final String c() {
        return this.c;
    }
}
