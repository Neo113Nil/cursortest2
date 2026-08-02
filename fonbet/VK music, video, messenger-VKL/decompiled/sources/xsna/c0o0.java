package xsna;

import androidx.core.app.NotificationCompat;
import com.coremedia.iso.boxes.MetaBox;
import com.huawei.hms.hihealth.HiHealthActivities;
import com.ironsource.B5;
import com.ironsource.O6;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import io.jsonwebtoken.Claims;
import java.util.HashMap;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import ru.ok.tracer.base.ucum.UcumUtils;

/* compiled from: Tag.java */
/* loaded from: classes8.dex */
public final class c0o0 implements Cloneable {
    public static final HashMap k = new HashMap();
    public static final String[] l;
    public static final String[] m;
    public static final String[] n;
    public static final String[] o;
    public static final String[] p;
    public static final String[] q;
    public String b;
    public final String c;
    public boolean d = true;
    public boolean e = true;
    public boolean f = false;
    public boolean g = false;
    public boolean h = false;
    public boolean i = false;
    public boolean j = false;

    static {
        String[] strArr = {"html", TtmlNode.TAG_HEAD, "body", "frameset", "script", "noscript", TtmlNode.TAG_STYLE, MetaBox.TYPE, "link", "title", "frame", "noframes", "section", "nav", "aside", "hgroup", "header", "footer", TtmlNode.TAG_P, "h1", "h2", "h3", "h4", "h5", "h6", "ul", "ol", "pre", TtmlNode.TAG_DIV, "blockquote", "hr", RTCStatsConstants.KEY_ADDRESS, "figure", "figcaption", "form", "fieldset", "ins", "del", "dl", O6.w0, "dd", "li", B5.R, "caption", "thead", "tfoot", "tbody", "colgroup", "col", "tr", "th", "td", "video", "audio", "canvas", "details", "menu", "plaintext", "template", "article", X3.i.Z, "svg", "math", TtmlNode.CENTER, "template", "dir", "applet", "marquee", "listing"};
        l = new String[]{"object", "base", "font", TtmlNode.TAG_TT, "i", "b", "u", "big", "small", "em", "strong", "dfn", "code", "samp", "kbd", "var", "cite", "abbr", "time", "acronym", "mark", "ruby", "rt", "rp", "rtc", "a", "img", TtmlNode.TAG_BR, "wbr", "map", CampaignEx.JSON_KEY_AD_Q, Claims.SUBJECT, HiHealthActivities.SUP, "bdo", "iframe", "embed", TtmlNode.TAG_SPAN, "input", "select", "textarea", "label", "button", "optgroup", "option", "legend", "datalist", "keygen", "output", NotificationCompat.CATEGORY_PROGRESS, "meter", "area", "param", "source", "track", "summary", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track", "data", "bdi", UcumUtils.UCUM_SECONDS, "strike", "nobr", "rb"};
        m = new String[]{MetaBox.TYPE, "link", "base", "frame", "img", TtmlNode.TAG_BR, "wbr", "embed", "hr", "input", "keygen", "col", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track"};
        n = new String[]{"title", "a", TtmlNode.TAG_P, "h1", "h2", "h3", "h4", "h5", "h6", "pre", RTCStatsConstants.KEY_ADDRESS, "li", "th", "td", "script", TtmlNode.TAG_STYLE, "ins", "del", UcumUtils.UCUM_SECONDS};
        o = new String[]{"pre", "plaintext", "title", "textarea"};
        p = new String[]{"button", "fieldset", "input", "keygen", "object", "output", "select", "textarea"};
        q = new String[]{"input", "keygen", "object", "select", "textarea"};
        for (int i = 0; i < 69; i++) {
            c0o0 c0o0Var = new c0o0(strArr[i]);
            k.put(c0o0Var.b, c0o0Var);
        }
        for (String str : l) {
            c0o0 c0o0Var2 = new c0o0(str);
            c0o0Var2.d = false;
            c0o0Var2.e = false;
            k.put(c0o0Var2.b, c0o0Var2);
        }
        for (String str2 : m) {
            c0o0 c0o0Var3 = (c0o0) k.get(str2);
            kir0.c(c0o0Var3);
            c0o0Var3.f = true;
        }
        for (String str3 : n) {
            c0o0 c0o0Var4 = (c0o0) k.get(str3);
            kir0.c(c0o0Var4);
            c0o0Var4.e = false;
        }
        for (String str4 : o) {
            c0o0 c0o0Var5 = (c0o0) k.get(str4);
            kir0.c(c0o0Var5);
            c0o0Var5.h = true;
        }
        for (String str5 : p) {
            c0o0 c0o0Var6 = (c0o0) k.get(str5);
            kir0.c(c0o0Var6);
            c0o0Var6.i = true;
        }
        for (String str6 : q) {
            c0o0 c0o0Var7 = (c0o0) k.get(str6);
            kir0.c(c0o0Var7);
            c0o0Var7.j = true;
        }
    }

    public c0o0(String str) {
        this.b = str;
        this.c = ad0.C(str);
    }

    public static c0o0 a(String str, cj90 cj90Var) {
        kir0.c(str);
        HashMap hashMap = k;
        c0o0 c0o0Var = (c0o0) hashMap.get(str);
        if (c0o0Var != null) {
            return c0o0Var;
        }
        cj90Var.getClass();
        boolean z = cj90Var.a;
        String trim = str.trim();
        if (!z) {
            trim = ad0.C(trim);
        }
        kir0.b(trim);
        String C = ad0.C(trim);
        c0o0 c0o0Var2 = (c0o0) hashMap.get(C);
        if (c0o0Var2 == null) {
            c0o0 c0o0Var3 = new c0o0(trim);
            c0o0Var3.d = false;
            return c0o0Var3;
        }
        if (!z || trim.equals(C)) {
            return c0o0Var2;
        }
        try {
            c0o0 c0o0Var4 = (c0o0) super.clone();
            c0o0Var4.b = trim;
            return c0o0Var4;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final Object clone() throws CloneNotSupportedException {
        try {
            return (c0o0) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0o0)) {
            return false;
        }
        c0o0 c0o0Var = (c0o0) obj;
        return this.b.equals(c0o0Var.b) && this.f == c0o0Var.f && this.e == c0o0Var.e && this.d == c0o0Var.d && this.h == c0o0Var.h && this.g == c0o0Var.g && this.i == c0o0Var.i && this.j == c0o0Var.j;
    }

    public final int hashCode() {
        return (((((((((((((this.b.hashCode() * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.j ? 1 : 0);
    }

    public final String toString() {
        return this.b;
    }
}
