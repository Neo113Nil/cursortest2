package sg.bigo.ads.cj;

import androidx.annotation.NonNull;
import org.json.JSONObject;
import sg.bigo.ads.api.core.i;

/* loaded from: classes9.dex */
public final class e implements i.a {
    private final boolean a;

    public e(@NonNull JSONObject jSONObject) {
        this.a = jSONObject.optInt("banner_pre_load", 0) == 1;
    }

    @Override // sg.bigo.ads.api.core.i.a
    public final boolean a() {
        return this.a;
    }

    @Override // sg.bigo.ads.api.core.i.a
    @NonNull
    public final String[] b() {
        return new String[0];
    }
}
