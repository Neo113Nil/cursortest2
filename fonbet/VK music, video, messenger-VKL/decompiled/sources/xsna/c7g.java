package xsna;

import android.graphics.Color;
import android.text.TextUtils;
import com.ironsource.X3;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: ColorParser.java */
/* loaded from: classes12.dex */
public final class c7g {
    public static final Pattern a = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    public static final Pattern b = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    public static final Pattern c = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");
    public static final HashMap d;

    static {
        HashMap hashMap = new HashMap();
        d = hashMap;
        a7g.a(-984833, hashMap, "aliceblue", -332841, "antiquewhite");
        vq.f(hashMap, "aqua", -16711681, -8388652, "aquamarine");
        a7g.a(-983041, hashMap, "azure", -657956, "beige");
        a7g.a(-6972, hashMap, "bisque", -16777216, "black");
        a7g.a(-5171, hashMap, "blanchedalmond", -16776961, "blue");
        a7g.a(-7722014, hashMap, "blueviolet", -5952982, "brown");
        a7g.a(-2180985, hashMap, "burlywood", -10510688, "cadetblue");
        a7g.a(-8388864, hashMap, "chartreuse", -2987746, "chocolate");
        a7g.a(-32944, hashMap, "coral", -10185235, "cornflowerblue");
        a7g.a(-1828, hashMap, "cornsilk", -2354116, "crimson");
        vq.f(hashMap, "cyan", -16711681, -16777077, "darkblue");
        a7g.a(-16741493, hashMap, "darkcyan", -4684277, "darkgoldenrod");
        vq.f(hashMap, "darkgray", -5658199, -16751616, "darkgreen");
        vq.f(hashMap, "darkgrey", -5658199, -4343957, "darkkhaki");
        a7g.a(-7667573, hashMap, "darkmagenta", -11179217, "darkolivegreen");
        a7g.a(-29696, hashMap, "darkorange", -6737204, "darkorchid");
        a7g.a(-7667712, hashMap, "darkred", -1468806, "darksalmon");
        a7g.a(-7357297, hashMap, "darkseagreen", -12042869, "darkslateblue");
        hashMap.put("darkslategray", -13676721);
        hashMap.put("darkslategrey", -13676721);
        vq.f(hashMap, "darkturquoise", -16724271, -7077677, "darkviolet");
        a7g.a(-60269, hashMap, "deeppink", -16728065, "deepskyblue");
        hashMap.put("dimgray", -9868951);
        hashMap.put("dimgrey", -9868951);
        vq.f(hashMap, "dodgerblue", -14774017, -5103070, "firebrick");
        a7g.a(-1296, hashMap, "floralwhite", -14513374, "forestgreen");
        vq.f(hashMap, "fuchsia", -65281, -2302756, "gainsboro");
        a7g.a(-460545, hashMap, "ghostwhite", -10496, "gold");
        hashMap.put("goldenrod", -2448096);
        hashMap.put("gray", -8355712);
        a7g.a(-16744448, hashMap, "green", -5374161, "greenyellow");
        vq.f(hashMap, "grey", -8355712, -983056, "honeydew");
        a7g.a(-38476, hashMap, "hotpink", -3318692, "indianred");
        a7g.a(-11861886, hashMap, "indigo", -16, "ivory");
        a7g.a(-989556, hashMap, "khaki", -1644806, "lavender");
        a7g.a(-3851, hashMap, "lavenderblush", -8586240, "lawngreen");
        a7g.a(-1331, hashMap, "lemonchiffon", -5383962, "lightblue");
        a7g.a(-1015680, hashMap, "lightcoral", -2031617, "lightcyan");
        hashMap.put("lightgoldenrodyellow", -329006);
        hashMap.put("lightgray", -2894893);
        hashMap.put("lightgreen", -7278960);
        hashMap.put("lightgrey", -2894893);
        a7g.a(-18751, hashMap, "lightpink", -24454, "lightsalmon");
        a7g.a(-14634326, hashMap, "lightseagreen", -7876870, "lightskyblue");
        hashMap.put("lightslategray", -8943463);
        hashMap.put("lightslategrey", -8943463);
        vq.f(hashMap, "lightsteelblue", -5192482, -32, "lightyellow");
        a7g.a(-16711936, hashMap, "lime", -13447886, "limegreen");
        hashMap.put("linen", -331546);
        hashMap.put("magenta", -65281);
        a7g.a(-8388608, hashMap, "maroon", -10039894, "mediumaquamarine");
        a7g.a(-16777011, hashMap, "mediumblue", -4565549, "mediumorchid");
        a7g.a(-7114533, hashMap, "mediumpurple", -12799119, "mediumseagreen");
        a7g.a(-8689426, hashMap, "mediumslateblue", -16713062, "mediumspringgreen");
        a7g.a(-12004916, hashMap, "mediumturquoise", -3730043, "mediumvioletred");
        a7g.a(-15132304, hashMap, "midnightblue", -655366, "mintcream");
        a7g.a(-6943, hashMap, "mistyrose", -6987, "moccasin");
        a7g.a(-8531, hashMap, "navajowhite", -16777088, "navy");
        a7g.a(-133658, hashMap, "oldlace", -8355840, "olive");
        a7g.a(-9728477, hashMap, "olivedrab", -23296, "orange");
        a7g.a(-47872, hashMap, "orangered", -2461482, "orchid");
        a7g.a(-1120086, hashMap, "palegoldenrod", -6751336, "palegreen");
        a7g.a(-5247250, hashMap, "paleturquoise", -2396013, "palevioletred");
        a7g.a(-4139, hashMap, "papayawhip", -9543, "peachpuff");
        a7g.a(-3308225, hashMap, "peru", -16181, "pink");
        a7g.a(-2252579, hashMap, "plum", -5185306, "powderblue");
        a7g.a(-8388480, hashMap, "purple", -10079335, "rebeccapurple");
        a7g.a(-65536, hashMap, "red", -4419697, "rosybrown");
        a7g.a(-12490271, hashMap, "royalblue", -7650029, "saddlebrown");
        a7g.a(-360334, hashMap, "salmon", -744352, "sandybrown");
        a7g.a(-13726889, hashMap, "seagreen", -2578, "seashell");
        a7g.a(-6270419, hashMap, "sienna", -4144960, "silver");
        a7g.a(-7876885, hashMap, "skyblue", -9807155, "slateblue");
        hashMap.put("slategray", -9404272);
        hashMap.put("slategrey", -9404272);
        vq.f(hashMap, "snow", -1286, -16711809, "springgreen");
        a7g.a(-12156236, hashMap, "steelblue", -2968436, "tan");
        a7g.a(-16744320, hashMap, "teal", -2572328, "thistle");
        a7g.a(-40121, hashMap, "tomato", 0, X3.i.T);
        a7g.a(-12525360, hashMap, "turquoise", -1146130, "violet");
        a7g.a(-663885, hashMap, "wheat", -1, "white");
        a7g.a(-657931, hashMap, "whitesmoke", -256, "yellow");
        hashMap.put("yellowgreen", -6632142);
    }

    public static int a(String str, boolean z) {
        int parseInt;
        fxc0.p(!TextUtils.isEmpty(str));
        String replace = str.replace(" ", "");
        if (replace.charAt(0) == '#') {
            int parseLong = (int) Long.parseLong(replace.substring(1), 16);
            if (replace.length() == 7) {
                return (-16777216) | parseLong;
            }
            if (replace.length() == 9) {
                return ((parseLong & 255) << 24) | (parseLong >>> 8);
            }
            throw new IllegalArgumentException();
        }
        if (replace.startsWith("rgba")) {
            Matcher matcher = (z ? c : b).matcher(replace);
            if (matcher.matches()) {
                if (z) {
                    String group = matcher.group(4);
                    group.getClass();
                    parseInt = (int) (Float.parseFloat(group) * 255.0f);
                } else {
                    String group2 = matcher.group(4);
                    group2.getClass();
                    parseInt = Integer.parseInt(group2, 10);
                }
                String group3 = matcher.group(1);
                group3.getClass();
                int parseInt2 = Integer.parseInt(group3, 10);
                String group4 = matcher.group(2);
                group4.getClass();
                int parseInt3 = Integer.parseInt(group4, 10);
                String group5 = matcher.group(3);
                group5.getClass();
                return Color.argb(parseInt, parseInt2, parseInt3, Integer.parseInt(group5, 10));
            }
        } else if (replace.startsWith("rgb")) {
            Matcher matcher2 = a.matcher(replace);
            if (matcher2.matches()) {
                String group6 = matcher2.group(1);
                group6.getClass();
                int parseInt4 = Integer.parseInt(group6, 10);
                String group7 = matcher2.group(2);
                group7.getClass();
                int parseInt5 = Integer.parseInt(group7, 10);
                String group8 = matcher2.group(3);
                group8.getClass();
                return Color.rgb(parseInt4, parseInt5, Integer.parseInt(group8, 10));
            }
        } else {
            Integer num = (Integer) d.get(o19.u(replace));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalArgumentException();
    }
}
