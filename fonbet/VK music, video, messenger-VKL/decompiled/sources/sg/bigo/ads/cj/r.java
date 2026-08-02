package sg.bigo.ads.cj;

import androidx.annotation.NonNull;
import org.json.JSONObject;
import ru.ok.android.utils.Logger;
import sg.bigo.ads.api.core.o;

/* loaded from: classes9.dex */
public final class r implements o.c {
    private final int a;
    private final int b;
    private final String c;

    public r(@NonNull JSONObject jSONObject) {
        this.a = jSONObject.optInt(Logger.METHOD_W);
        this.b = jSONObject.optInt("h");
        this.c = jSONObject.optString("data");
    }

    @Override // sg.bigo.ads.api.core.o.c
    public final int a() {
        return this.a;
    }

    @Override // sg.bigo.ads.api.core.o.c
    public final int b() {
        return this.b;
    }

    @Override // sg.bigo.ads.api.core.o.c
    public final String c() {
        return this.c;
    }
}
