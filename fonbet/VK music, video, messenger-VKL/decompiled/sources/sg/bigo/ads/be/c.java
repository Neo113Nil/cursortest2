package sg.bigo.ads.be;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.ai.e;
import sg.bigo.ads.be.a;
import sg.bigo.ads.common.form.render.c;
import sg.bigo.ads.common.view.PrivacyCheckBox;

/* loaded from: classes9.dex */
public final class c implements a.InterfaceC2436a {

    @NonNull
    public Context a;

    @Nullable
    public Map<String, Object> b;
    public e c;
    public e.c[] d;
    public View e;
    public PrivacyCheckBox f;
    public c.a h;

    @NonNull
    private Map<String, String> i = new ConcurrentHashMap();
    public List<a> g = new ArrayList();

    public c(@NonNull e eVar, @Nullable Map<String, Object> map, @NonNull Context context, c.a aVar) {
        this.a = context;
        this.c = eVar;
        this.b = map;
        this.d = eVar.m();
        this.h = aVar;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, String> entry : this.i.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                try {
                    jSONObject.putOpt(entry.getKey(), entry.getValue());
                } catch (JSONException unused) {
                }
            }
        }
        return jSONObject;
    }

    public final boolean b() {
        PrivacyCheckBox privacyCheckBox = this.f;
        return privacyCheckBox != null && privacyCheckBox.a;
    }

    @Override // sg.bigo.ads.be.a.InterfaceC2436a
    public final void a(String str, String str2) {
        this.i.put(str, str2);
        c.a aVar = this.h;
        if (aVar != null) {
            aVar.a();
        }
    }
}
