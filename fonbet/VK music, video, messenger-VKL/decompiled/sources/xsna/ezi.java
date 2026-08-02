package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import com.ironsource.C4217a2;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.core.preference.Preference;
import kotlin.Pair;

/* compiled from: ConfigurationOverridingHelper.kt */
/* loaded from: classes.dex */
public final class ezi {

    /* compiled from: ConfigurationOverridingHelper.kt */
    public static final class a {
        public static final Object a = pn00.k(new Pair("system", null), new Pair("small", Float.valueOf(0.85f)), new Pair("normal", Float.valueOf(1.0f)), new Pair("large", Float.valueOf(1.15f)), new Pair("xlarge", Float.valueOf(1.3f)));
        public static final Object b = pn00.k(new Pair(C4217a2.f, "small"), new Pair("0", "normal"), new Pair("1", "large"));

        /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.Map] */
        public static final String a(Context context) {
            SharedPreferences h = Preference.h(context, 0, "ConfigurationOverridingHelper");
            if (!h.contains("fontScaleName")) {
                SharedPreferences g = Preference.g(context);
                String str = (String) b.get(g.getString(TtmlNode.ATTR_TTS_FONT_SIZE, "system"));
                if (str == null) {
                    str = "system";
                }
                g.edit().putString(TtmlNode.ATTR_TTS_FONT_SIZE, str).apply();
                Preference.h(context, 0, "ConfigurationOverridingHelper").edit().putString("fontScaleName", str).apply();
            }
            String string = h.getString("fontScaleName", "system");
            return string == null ? "system" : string;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public static final Configuration a(Context context, Configuration configuration) {
        Float f = (Float) a.a.get(a.a(context));
        if (f == null) {
            return configuration;
        }
        Configuration configuration2 = new Configuration(configuration);
        configuration2.fontScale = f.floatValue();
        return configuration2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public static final Context b(Context context) {
        if (((Float) a.a.get(a.a(context))) == null) {
            return context;
        }
        Configuration a2 = a(context, context.getResources().getConfiguration());
        a2.uiMode = 0;
        return context.createConfigurationContext(a2);
    }
}
