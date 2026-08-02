package xsna;

import android.util.LruCache;
import com.vk.voip.dto.profiles.VoipSex;
import org.json.JSONObject;
import xsna.sew0;

/* compiled from: ProfileParser.kt */
/* loaded from: classes7.dex */
public final class vyd0 {
    public static rvw0 a(JSONObject jSONObject) {
        sew0 c;
        String valueOf = String.valueOf(-jSONObject.getInt("id"));
        String string = jSONObject.has("name") ? jSONObject.getString("name") : "";
        String optString = jSONObject.optString("photo_base");
        if (optString.length() > 0) {
            LruCache<String, fxj0> lruCache = sew0.a;
            c = sew0.a.d(m4s.G(string + ':' + valueOf), jSONObject.has("is_nft_photo") ? jSONObject.getBoolean("is_nft_photo") : false, optString, true, string);
        } else {
            LruCache<String, fxj0> lruCache2 = sew0.a;
            c = sew0.a.c(m4s.G(string + ':' + valueOf), jSONObject.has("photo_100") ? jSONObject.getString("photo_100") : "", f370.D(jSONObject, "photo_max"), string, jSONObject.has("is_nft_photo") ? jSONObject.getBoolean("is_nft_photo") : false);
        }
        return new rvw0(valueOf, c, string, (jSONObject.has("is_closed") ? jSONObject.getInt("is_closed") : 0) != 0);
    }

    public static svw0 b(JSONObject jSONObject, boolean z) {
        sew0 c;
        boolean z2;
        boolean z3;
        String C = f370.C("first_name", "", jSONObject);
        String string = jSONObject.has("last_name") ? jSONObject.getString("last_name") : "";
        String string2 = jSONObject.has("contact_name") ? jSONObject.getString("contact_name") : "";
        if (!z) {
            string2 = v1v.a(' ', C, string);
        }
        String string3 = jSONObject.getString("id");
        String string4 = jSONObject.has("photo_base") ? jSONObject.getString("photo_base") : "";
        boolean z4 = false;
        if (string4.length() > 0) {
            LruCache<String, fxj0> lruCache = sew0.a;
            c = sew0.a.d(m4s.G(string2 + ':' + string3), jSONObject.has("is_nft") ? jSONObject.getBoolean("is_nft") : false, string4, false, string2);
        } else {
            LruCache<String, fxj0> lruCache2 = sew0.a;
            c = sew0.a.c(m4s.G(string2 + ':' + string3), jSONObject.has("photo_100") ? jSONObject.getString("photo_100") : "", f370.D(jSONObject, "photo_max"), string2, jSONObject.has("is_nft") ? jSONObject.getBoolean("is_nft") : false);
        }
        int i = jSONObject.has("sex") ? jSONObject.getInt("sex") : 0;
        boolean z5 = true;
        VoipSex voipSex = i != 1 ? i != 2 ? VoipSex.UNKNOWN : VoipSex.MALE : VoipSex.FEMALE;
        if ((jSONObject.has("verified") ? jSONObject.getInt("verified") : 0) == 1) {
            z2 = true;
        } else {
            z2 = true;
            z5 = false;
        }
        if ((jSONObject.has("friend_status") ? jSONObject.getInt("friend_status") : 0) == 3) {
            boolean z6 = z2;
            z3 = false;
            z4 = z6;
        } else {
            z3 = false;
        }
        boolean has = jSONObject.has("deactivated");
        boolean z7 = jSONObject.has("is_closed") ? jSONObject.getBoolean("is_closed") : z3;
        if (jSONObject.has("can_call")) {
            z3 = jSONObject.getBoolean("can_call");
        }
        return new svw0(string3, c, voipSex, z5, z4, has, z7, z3, C, string, jSONObject.has("contact_name") ? jSONObject.getString("contact_name") : "", z);
    }
}
