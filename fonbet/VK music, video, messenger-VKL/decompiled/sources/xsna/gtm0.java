package xsna;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import com.ironsource.X3;
import com.vk.superapp.ui.uniwidgets.blocks.WidgetColor;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Pair;

/* compiled from: StyleParser.kt */
/* loaded from: classes6.dex */
public final class gtm0 {
    public static final Pattern c = Pattern.compile("(\\[style[^]]*])(((?!\\[/style]).)*)(\\[/style])");
    public static final Pattern d = Pattern.compile("font-weight\\s*=\\s*\"(\\w+)\"");
    public static final Pattern e = Pattern.compile("line-through\\s*=\\s*\"1\"");
    public static final Pattern f = Pattern.compile("color\\s*=\\s*\"(\\w+|#(?:[0-9a-fA-F]{3,8}))\"");
    public static final Pattern g = Pattern.compile("dark\\s*:\\s*(\\w+|#(?:[0-9a-fA-F]{3,8}))");
    public static final Pattern h = Pattern.compile("light\\s*:\\s*(\\w+|#(?:[0-9a-fA-F]{3,8}))");
    public static final Object i = pn00.k(new Pair("regular", new z410(29)), new Pair("medium", new d7l0(5)));
    public static final Object j = pn00.k(new Pair("primary", WidgetColor.PRIMARY), new Pair(X3.i.Y, WidgetColor.SECONDARY), new Pair("accent", WidgetColor.ACCENT), new Pair("dynamic_blue", WidgetColor.DYNAMIC_BLUE), new Pair("dynamic_gray", WidgetColor.DYNAMIC_GRAY), new Pair("dynamic_red", WidgetColor.DYNAMIC_RED), new Pair("dynamic_green", WidgetColor.DYNAMIC_GREEN), new Pair("dynamic_orange", WidgetColor.DYNAMIC_ORANGE), new Pair("dynamic_violet", WidgetColor.DYNAMIC_VIOLET));
    public final Context a;
    public final yfb b;

    public gtm0(Context context, yfb yfbVar) {
        this.a = context;
        this.b = yfbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0100 A[LOOP:1: B:34:0x00fa->B:36:0x0100, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008b  */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence a(String str) {
        pup0 pup0Var;
        Matcher matcher;
        Matcher matcher2;
        Integer b;
        Iterator it;
        izs izsVar;
        ucp ucpVar = ucp.a;
        CharSequence i2 = ucp.i(str);
        if (!drm0.D(i2, "[/style]", false)) {
            return i2;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Matcher matcher3 = c.matcher(i2);
        int i3 = 0;
        while (matcher3.find()) {
            spannableStringBuilder.append((CharSequence) i2.subSequence(i3, matcher3.start()).toString());
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) matcher3.group(2));
            String group = matcher3.group(1);
            if (group != null) {
                int length2 = spannableStringBuilder.length();
                Matcher matcher4 = d.matcher(group);
                if (matcher4.find()) {
                    String group2 = matcher4.group(1);
                    Typeface typeface = (group2 == null || (izsVar = (izs) i.get(group2)) == null) ? null : (Typeface) izsVar.invoke(this.a);
                    if (typeface != null) {
                        pup0Var = new pup0(typeface);
                        StrikethroughSpan strikethroughSpan = !e.matcher(group).find() ? new StrikethroughSpan() : null;
                        matcher = g.matcher(group);
                        matcher2 = h.matcher(group);
                        Matcher matcher5 = f.matcher(group);
                        if (matcher.find()) {
                            gfx0 gfx0Var = e370.b;
                            if (gfx0Var == null) {
                                gfx0Var = null;
                            }
                            gfx0Var.getClass();
                            if (dhr0.M()) {
                                b = b(matcher);
                                it = rl3.I(new CharacterStyle[]{pup0Var, strikethroughSpan, b != null ? new ForegroundColorSpan(b.intValue()) : null}).iterator();
                                while (it.hasNext()) {
                                    spannableStringBuilder.setSpan((CharacterStyle) it.next(), length, length2, 33);
                                }
                                i3 = matcher3.end();
                            }
                        }
                        if (matcher2.find()) {
                            gfx0 gfx0Var2 = e370.b;
                            if (gfx0Var2 == null) {
                                gfx0Var2 = null;
                            }
                            gfx0Var2.getClass();
                            if (!dhr0.M()) {
                                b = b(matcher2);
                                it = rl3.I(new CharacterStyle[]{pup0Var, strikethroughSpan, b != null ? new ForegroundColorSpan(b.intValue()) : null}).iterator();
                                while (it.hasNext()) {
                                }
                                i3 = matcher3.end();
                            }
                        }
                        b = !matcher5.find() ? b(matcher5) : null;
                        it = rl3.I(new CharacterStyle[]{pup0Var, strikethroughSpan, b != null ? new ForegroundColorSpan(b.intValue()) : null}).iterator();
                        while (it.hasNext()) {
                        }
                        i3 = matcher3.end();
                    }
                }
                pup0Var = null;
                if (!e.matcher(group).find()) {
                }
                matcher = g.matcher(group);
                matcher2 = h.matcher(group);
                Matcher matcher52 = f.matcher(group);
                if (matcher.find()) {
                }
                if (matcher2.find()) {
                }
                if (!matcher52.find()) {
                }
                it = rl3.I(new CharacterStyle[]{pup0Var, strikethroughSpan, b != null ? new ForegroundColorSpan(b.intValue()) : null}).iterator();
                while (it.hasNext()) {
                }
                i3 = matcher3.end();
            }
        }
        spannableStringBuilder.append((CharSequence) i2.subSequence(i3, i2.length()).toString());
        return new SpannableString(spannableStringBuilder);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    public final Integer b(Matcher matcher) {
        WidgetColor widgetColor;
        String group = matcher.group(1);
        Integer a = (group == null || (widgetColor = (WidgetColor) j.get(group)) == null) ? null : widgetColor.a(this.a, this.b);
        if (a != null) {
            return a;
        }
        try {
            return Integer.valueOf(Color.parseColor(group));
        } catch (Throwable unused) {
            return null;
        }
    }
}
