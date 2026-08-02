package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.util.ArrayMap;
import com.huawei.hms.framework.common.BundleUtil;
import com.vk.core.ui.themes.VKTheme;
import java.util.List;
import org.json.JSONObject;

/* compiled from: DialogThemeParser.kt */
/* loaded from: classes2.dex */
public abstract class blm {
    public final Context a;
    public final List<VKTheme> b;
    public final Resources c;
    public final String d;

    /* compiled from: DialogThemeParser.kt */
    public interface a {
        String getKey();
    }

    /* compiled from: DialogThemeParser.kt */
    public interface b {
        String getKey();
    }

    public blm(Context context, List<VKTheme> list) {
        this.a = context;
        this.b = list;
        this.c = context.getResources();
        this.d = context.getPackageName();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
    
        if (r7 == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(JSONObject jSONObject, ArrayMap arrayMap, a aVar, com.vk.im.engine.models.dialogs.c cVar, b bVar) {
        String key;
        String str;
        String concat = (cVar == null || (str = cVar.a) == null) ? null : str.concat(BundleUtil.UNDERLINE_TAG);
        if (concat == null) {
            concat = "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(b());
        sb.append(concat);
        sb.append("theme_");
        if (bVar != null) {
            key = bVar.getKey() + '_' + aVar.getKey();
        }
        key = aVar.getKey();
        sb.append(key);
        JSONObject jSONObject2 = jSONObject.getJSONObject(sb.toString());
        int a2 = an10.a(jSONObject2.optDouble("alpha_multiplier", 1.0d) * 255);
        String string = jSONObject2.getString("color_identifier");
        Object obj = arrayMap.get(string);
        if (obj == null) {
            com.vk.metrics.eventtracking.b.a.a(new IllegalStateException("Using resource identifier instead of getting color from json scheme"));
            String a3 = tdj.a(new StringBuilder(), this.d, ":color/", string);
            Resources resources = this.c;
            obj = Integer.valueOf(resources.getColor(resources.getIdentifier(a3, null, null)));
            arrayMap.put(string, obj);
        }
        return n8g.l(((Number) obj).intValue(), a2);
    }

    public abstract String b();
}
