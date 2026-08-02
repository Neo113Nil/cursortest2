package org.jsoup.nodes;

import com.ironsource.C4217a2;
import com.unity3d.ads.BuildConfig;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Pattern;
import org.jsoup.SerializationException;
import org.jsoup.nodes.Document;
import xsna.ad0;
import xsna.sqm0;

/* compiled from: Attribute.java */
/* loaded from: classes8.dex */
public final class a implements Map.Entry<String, String>, Cloneable {
    public static final String[] e = {"allowfullscreen", "async", "autofocus", "checked", "compact", "declare", BuildConfig.FLAVOR, "defer", C4217a2.e, "formnovalidate", "hidden", "inert", "ismap", "itemscope", "multiple", "muted", "nohref", "noresize", "noshade", "novalidate", "nowrap", "open", "readonly", "required", "reversed", "seamless", "selected", "sortable", "truespeed", "typemustmatch"};
    public static final Pattern f = Pattern.compile("[a-zA-Z_:][-a-zA-Z0-9_:.]*");
    public static final Pattern g = Pattern.compile("[^-a-zA-Z0-9_:.]");
    public static final Pattern h = Pattern.compile("[^\\x00-\\x1f\\x7f-\\x9f \"'/=]+");
    public static final Pattern i = Pattern.compile("[\\x00-\\x1f\\x7f-\\x9f \"'/=]");
    public String b;
    public String c;
    public b d;

    public static String a(String str, Document.OutputSettings.Syntax syntax) {
        if (syntax == Document.OutputSettings.Syntax.xml) {
            Pattern pattern = f;
            if (!pattern.matcher(str).matches()) {
                String replaceAll = g.matcher(str).replaceAll("");
                if (pattern.matcher(replaceAll).matches()) {
                    return replaceAll;
                }
                return null;
            }
        }
        if (syntax == Document.OutputSettings.Syntax.html) {
            Pattern pattern2 = h;
            if (!pattern2.matcher(str).matches()) {
                String replaceAll2 = i.matcher(str).replaceAll("");
                if (pattern2.matcher(replaceAll2).matches()) {
                    return replaceAll2;
                }
                return null;
            }
        }
        return str;
    }

    public static void b(String str, String str2, Appendable appendable, Document.OutputSettings outputSettings) throws IOException {
        appendable.append(str);
        if (outputSettings.i == Document.OutputSettings.Syntax.html) {
            if (str2 == null) {
                return;
            }
            if ((str2.isEmpty() || str2.equalsIgnoreCase(str)) && Arrays.binarySearch(e, ad0.C(str)) >= 0) {
                return;
            }
        }
        appendable.append("=\"");
        if (str2 == null) {
            str2 = "";
        }
        Entities.b(appendable, str2, outputSettings, true, false, false, false);
        appendable.append('\"');
    }

    public final Object clone() throws CloneNotSupportedException {
        try {
            return (a) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            String str = aVar.b;
            String str2 = this.b;
            if (str2 == null ? str != null : !str2.equals(str)) {
                return false;
            }
            String str3 = this.c;
            String str4 = aVar.c;
            if (str3 != null) {
                return str3.equals(str4);
            }
            if (str4 == null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final String getKey() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final String getValue() {
        String str = this.c;
        return str == null ? "" : str;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        String str = this.b;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.c;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final String setValue(String str) {
        int h2;
        String str2 = str;
        String str3 = this.b;
        String str4 = this.c;
        b bVar = this.d;
        if (bVar != null && (h2 = bVar.h(str3)) != -1) {
            str4 = this.d.f(str3);
            this.d.d[h2] = str2;
        }
        this.c = str2;
        return str4 == null ? "" : str4;
    }

    public final String toString() {
        StringBuilder a = sqm0.a();
        try {
            Document.OutputSettings outputSettings = new Document("").k;
            String str = this.b;
            String str2 = this.c;
            String a2 = a(str, outputSettings.i);
            if (a2 != null) {
                b(a2, str2, a, outputSettings);
            }
            return sqm0.d(a);
        } catch (IOException e2) {
            throw new SerializationException(e2);
        }
    }
}
