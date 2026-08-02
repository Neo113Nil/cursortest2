package xsna;

import android.graphics.Color;
import android.text.TextUtils;
import com.vk.dto.common.id.UserId;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.StartPlaySource;
import com.vk.music.stats.AdsAudioPixelsContainer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: AudioFetchController.kt */
/* loaded from: classes3.dex */
public abstract class wn4 {
    public static int a(JSONObject jSONObject, int i, String str) {
        String optString = jSONObject.optString(str);
        if (TextUtils.isEmpty(optString)) {
            return i;
        }
        try {
            return Color.parseColor(optString);
        } catch (Throwable unused) {
            gu8.e(null, "JsonParser: Error parsing color " + optString);
            return i;
        }
    }

    public static int b(boolean z, int i) {
        return qoy.b(i, 31, z);
    }

    public static Integer c(JSONObject jSONObject, String str) {
        int optInt;
        if (!jSONObject.has(str) || jSONObject.isNull(str) || (optInt = jSONObject.optInt(str, -1)) == -1) {
            return null;
        }
        return Integer.valueOf(optInt);
    }

    public static fiz0 d(dhz0 dhz0Var) {
        if (dhz0Var instanceof viy0) {
            viy0 viy0Var = (viy0) dhz0Var;
            int i = viy0Var.a;
            z9z0 z9z0Var = viy0Var.b;
            return new fiz0(z9z0Var.a(), z9z0Var.b(), i);
        }
        if (dhz0Var instanceof ejz0) {
            new y9z0();
            int i2 = ((ejz0) dhz0Var).a;
            return new fiz0(1.0f, 1.0f, i2 >= 0 ? 1 << i2 : -1);
        }
        if (!(dhz0Var instanceof w9y0)) {
            return null;
        }
        new y9z0();
        fiz0 fiz0Var = new fiz0(1.0f, 1.0f, -1);
        fiz0Var.e = ((w9y0) dhz0Var).a;
        return fiz0Var;
    }

    public static ArrayList e(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("labels");
        if (optJSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            int optInt = optJSONArray.optInt(i, -1);
            if (optInt != -1) {
                arrayList.add(Integer.valueOf(optInt));
            }
        }
        return arrayList;
    }

    public static String f(String str, JSONObject jSONObject) {
        if (jSONObject.has(str)) {
            return jSONObject.optString(str);
        }
        return null;
    }

    public abstract void g();

    public i420 h(vg6 vg6Var) {
        if (vg6Var instanceof l9z) {
            String str = ((l9z) vg6Var).d;
            Integer k = k();
            return new b9z(k != null ? k.intValue() : 0, str, null);
        }
        if (vg6Var instanceof pgq0) {
            return j(((pgq0) vg6Var).d);
        }
        return null;
    }

    public i420 i(i420 i420Var) {
        if (i420Var instanceof b9z) {
            String str = ((b9z) i420Var).b;
            Integer k = k();
            return new b9z(k != null ? k.intValue() : 0, str, null);
        }
        if (i420Var instanceof ogq0) {
            return j(((ogq0) i420Var).b);
        }
        return null;
    }

    public abstract i420 j(UserId userId);

    public abstract Integer k();

    public abstract boolean l();

    public abstract void m(int i, izs izsVar, izs izsVar2);

    public void n(StartPlaySource startPlaySource, MusicPlaybackLaunchContext musicPlaybackLaunchContext, AdsAudioPixelsContainer adsAudioPixelsContainer, zxa0 zxa0Var) {
        zxa0Var.invoke(EmptyList.b, null);
    }

    public int o() {
        return 5;
    }

    public abstract void r(vq70 vq70Var);

    public void p(izs izsVar) {
    }

    public void q(ArrayList arrayList, LinkedHashMap linkedHashMap, int i) {
    }
}
