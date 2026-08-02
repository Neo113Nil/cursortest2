package sg.bigo.ads.cn;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class d {
    @Nullable
    public static String a(@Nullable sg.bigo.ads.api.b bVar, @NonNull sg.bigo.ads.an.g gVar) {
        int i;
        long j;
        int i2;
        if (bVar != null) {
            i = bVar.c;
            i2 = bVar.d;
            j = bVar.e;
        } else {
            i = 0;
            j = 0;
            i2 = 0;
        }
        if (i <= 0) {
            i = gVar.f();
        }
        if (i2 <= 0) {
            i2 = gVar.g();
        }
        if (j <= 0) {
            j = gVar.h();
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("ad_a", Integer.valueOf(i));
            jSONObject.putOpt("ad_g", Integer.valueOf(i2));
            jSONObject.putOpt("ad_channel", gVar.e());
            jSONObject.putOpt("ad_active", Long.valueOf(j));
            jSONObject.putOpt("ad_ins", Long.valueOf(gVar.Y()));
            jSONObject.putOpt("ad_upd", Long.valueOf(gVar.Z()));
            return jSONObject.toString();
        } catch (Exception unused) {
            return null;
        }
    }
}
