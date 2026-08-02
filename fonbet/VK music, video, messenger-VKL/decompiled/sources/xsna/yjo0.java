package xsna;

import com.ironsource.X3;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: TextMentionsHelper.kt */
/* loaded from: classes17.dex */
public final class yjo0 {
    public static final Pattern a = Pattern.compile("[@*](?!https?://)id[0-9]+\\s*\\([^)]+\\)");
    public static final Pattern b = Pattern.compile("[@*](?!https?://)club[0-9]+\\s*\\([^)]+\\)");
    public static final Pattern c = Pattern.compile("\\[(?!https?://)id[0-9]+\\|[^]]+]");
    public static final Pattern d = Pattern.compile("\\[(?!https?://)club[0-9]+\\|[^]]+]");
    public static final Pattern e = Pattern.compile("\\[((id|club)[0-9]+)(?::bp[-_0-9]+)?\\|([^]]+)]");
    public static final Pattern f = Pattern.compile("\\(.*\\)");
    public static final h g = new h();
    public static final c h = new c();
    public static final g i = new g();
    public static final b j = new b();
    public static final a k = new a();
    public static final e l = new e();
    public static final Pattern m = Pattern.compile("[@*]((?:https?://)?(?:(?:m\\.|dev\\.)?vk\\.(?:com|me|ru))(?!//)(?!/doc[\\d\\-])(?!/page[\\d\\-])(?!/away[.?])(?:/[-._~:/?#\\[\\]@!$&'()*+,;=%\\w]*)*)(?:[ ]*\\(([^)\\s]|[^)\\s][^)\\n\\t]*[^)\\s]+)\\))?");
    public static final d n = new d();
    public static final Pattern o = Pattern.compile("\\[((?:(?:https?://)?(?:m\\.|dev\\.|ads\\.|expert\\.)?vk\\.(?:com|me|ru)(?!//)(?!/page\\d+(?:$|[/?#]))(?!/away[.?])(?:/[-._~:/?#\\[\\]@!$&'()*+,;=%\\w]*)*)|(?:https://sun\\d*-\\d*\\.userapi\\.com(?:/[-._~:/?#\\[\\]@!$&'()*+,;=%\\w]*)*)|(?:https://r.mradx.net(?:/[-._~:/?#\\[\\]@!$&'()*+,;=%\\w]*)*)|(?:(?:https?://)?vkvideo.ru(?!//)(?:/[-._~:/?#\\[\\]@!$&'()*+,;=%\\w]*)*))\\|([^]\\n\\t]*)]");
    public static final f p = new f();
    public static final HashSet<Character> q = izi0.d(' ', ',', ';', '!', '?', '-', '\n', '(', ')', '[', ']');
    public static final HashSet<Character> r = izi0.d(' ', ',', ';', '!', '?', '\n', '(', ')', '[', ']');

    /* compiled from: TextMentionsHelper.kt */
    public static final class a extends ThreadLocal<Matcher> {
        @Override // java.lang.ThreadLocal
        public final Matcher initialValue() {
            return yjo0.e.matcher("");
        }
    }

    /* compiled from: TextMentionsHelper.kt */
    public static final class b extends ThreadLocal<Matcher> {
        @Override // java.lang.ThreadLocal
        public final Matcher initialValue() {
            return yjo0.d.matcher("");
        }
    }

    /* compiled from: TextMentionsHelper.kt */
    public static final class c extends ThreadLocal<Matcher> {
        @Override // java.lang.ThreadLocal
        public final Matcher initialValue() {
            return yjo0.b.matcher("");
        }
    }

    /* compiled from: TextMentionsHelper.kt */
    public static final class d extends ThreadLocal<Matcher> {
        @Override // java.lang.ThreadLocal
        public final Matcher initialValue() {
            return yjo0.m.matcher("");
        }
    }

    /* compiled from: TextMentionsHelper.kt */
    public static final class e extends ThreadLocal<Matcher> {
        @Override // java.lang.ThreadLocal
        public final Matcher initialValue() {
            return yjo0.f.matcher("");
        }
    }

    /* compiled from: TextMentionsHelper.kt */
    public static final class f extends ThreadLocal<Matcher> {
        @Override // java.lang.ThreadLocal
        public final Matcher initialValue() {
            return yjo0.o.matcher("");
        }
    }

    /* compiled from: TextMentionsHelper.kt */
    public static final class g extends ThreadLocal<Matcher> {
        @Override // java.lang.ThreadLocal
        public final Matcher initialValue() {
            return yjo0.c.matcher("");
        }
    }

    /* compiled from: TextMentionsHelper.kt */
    public static final class h extends ThreadLocal<Matcher> {
        @Override // java.lang.ThreadLocal
        public final Matcher initialValue() {
            return yjo0.a.matcher("");
        }
    }

    public static Matcher a() {
        Matcher matcher = k.get();
        if (matcher != null) {
            return matcher;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static Matcher b() {
        Matcher matcher = j.get();
        if (matcher != null) {
            return matcher;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static Matcher c() {
        Matcher matcher = h.get();
        if (matcher != null) {
            return matcher;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static int d(int i2, String str) {
        while (i2 < str.length()) {
            if (q.contains(Character.valueOf(str.charAt(i2)))) {
                break;
            }
            i2++;
        }
        return i2;
    }

    public static int e(int i2, String str) {
        while (i2 > 0) {
            if (q.contains(Character.valueOf(str.charAt(i2 - 1)))) {
                break;
            }
            i2--;
        }
        return i2;
    }

    public static Matcher f() {
        return p.get();
    }

    public static int g(int i2, String str) {
        while (-1 < i2) {
            if (p(str.charAt(i2))) {
                return i2;
            }
            i2--;
        }
        return -1;
    }

    public static l9z h(int i2, int i3, String str) {
        String str2;
        List b0 = drm0.b0(drm0.W(drm0.U(str, X3.j.d), X3.j.e), new char[]{'|'}, 2, 2);
        String str3 = (String) j5g.b0(0, b0);
        if (str3 == null || (str2 = (String) j5g.b0(1, b0)) == null) {
            return null;
        }
        return new l9z(i2, i3, str2, str3);
    }

    public static Matcher i() {
        Matcher matcher = n.get();
        if (matcher != null) {
            return matcher;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static pgq0 j(int i2, int i3, String str, boolean z) {
        Long n2;
        List b0 = drm0.b0(drm0.W(drm0.U(str, X3.j.d.concat(z ? "club" : "id")), X3.j.e), new char[]{'|'}, 2, 2);
        String str2 = (String) j5g.b0(0, b0);
        if (str2 == null || (n2 = arm0.n(str2)) == null) {
            return null;
        }
        long longValue = n2.longValue();
        String str3 = (String) j5g.b0(1, b0);
        if (str3 == null) {
            return null;
        }
        if (z) {
            longValue = -longValue;
        }
        return new pgq0(i2, new UserId(longValue), i3, str3);
    }

    public static Matcher k() {
        Matcher matcher = l.get();
        if (matcher != null) {
            return matcher;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static pgq0 l(int i2, int i3, String str, boolean z) {
        int length = str.length();
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                i4 = -1;
                break;
            }
            if (!Character.isLetterOrDigit(str.charAt(i4))) {
                break;
            }
            i4++;
        }
        try {
            long parseLong = Long.parseLong(str.substring(0, i4));
            k().reset(str);
            String c2 = k().find() ? qoy.c(1, 1, k().group()) : null;
            if (c2 != null) {
                if (z) {
                    parseLong = -parseLong;
                }
                return new pgq0(i2, new UserId(parseLong), i3, c2);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x029b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01e7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0142 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00cb A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList m(CharSequence charSequence) {
        ei7 ei7Var;
        Long n2;
        String str;
        Integer m2;
        Long n3;
        l9z l9zVar;
        String substring;
        String c2;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= charSequence.length()) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (i3 == 0 && p(charAt)) {
                i3 |= 1;
            } else if (i3 != 1 || charAt != '(') {
                if (i3 == 3 && charAt == ')') {
                    i3 |= 4;
                    break;
                }
            } else {
                i3 |= 2;
            }
            i2++;
        }
        if (i3 == 7) {
            ArrayList arrayList2 = new ArrayList();
            o().reset(charSequence);
            while (o().find()) {
                pgq0 l2 = l(o().start(), o().end(), drm0.U(drm0.U(drm0.U(o().group(), "@"), "*"), "id"), false);
                if (l2 != null) {
                    arrayList2.add(l2);
                }
            }
            c().reset(charSequence);
            while (c().find()) {
                pgq0 l3 = l(c().start(), c().end(), drm0.U(drm0.U(drm0.U(c().group(), "@"), "*"), "club"), true);
                if (l3 != null) {
                    arrayList2.add(l3);
                }
            }
            i().reset(charSequence);
            while (i().find()) {
                String U = drm0.U(drm0.U(i().group(), "@"), "*");
                int start = i().start();
                int end = i().end();
                int length = U.length();
                int i4 = 0;
                try {
                    while (i4 < length) {
                        if (!r.contains(Character.valueOf(U.charAt(i4)))) {
                            i4++;
                        }
                        break;
                    }
                    break;
                    substring = U.substring(0, i4);
                    k().reset(U.substring(i4));
                    c2 = k().find() ? qoy.c(1, 1, k().group()) : null;
                } catch (Exception unused) {
                }
                i4 = -1;
                if (c2 != null) {
                    l9zVar = new l9z(start, end, c2, substring);
                    if (l9zVar == null) {
                        arrayList2.add(l9zVar);
                    }
                }
                l9zVar = null;
                if (l9zVar == null) {
                }
            }
            arrayList.addAll(arrayList2);
        }
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i5 >= charSequence.length()) {
                break;
            }
            char charAt2 = charSequence.charAt(i5);
            if (i6 == 0 && charAt2 == '[') {
                i6 |= 1;
            } else if (i6 != 1 || charAt2 != '|') {
                if (i6 == 3 && charAt2 == ']') {
                    i6 |= 4;
                    break;
                }
            } else {
                i6 |= 2;
            }
            i5++;
        }
        if (i6 == 7) {
            ArrayList arrayList3 = new ArrayList();
            n().reset(charSequence);
            while (n().find()) {
                pgq0 j2 = j(n().start(), n().end(), n().group(), false);
                if (j2 != null) {
                    arrayList3.add(j2);
                }
            }
            b().reset(charSequence);
            while (b().find()) {
                pgq0 j3 = j(b().start(), b().end(), b().group(), true);
                if (j3 != null) {
                    arrayList3.add(j3);
                }
            }
            a().reset(charSequence);
            while (a().find()) {
                int start2 = a().start();
                int end2 = a().end();
                String group = a().group();
                boolean B = brm0.B(group, "[club", false);
                List b0 = drm0.b0(drm0.W(drm0.U(drm0.U(group, "[id"), "[club"), X3.j.e), new char[]{':', '|'}, 3, 2);
                String str2 = (String) j5g.b0(0, b0);
                if (str2 != null && (n2 = arm0.n(str2)) != null) {
                    long longValue = n2.longValue();
                    if (B) {
                        longValue = -longValue;
                    }
                    UserId userId = new UserId(longValue);
                    String str3 = (String) j5g.b0(2, b0);
                    if (str3 != null && (str = (String) j5g.b0(1, b0)) != null) {
                        List b02 = drm0.b0(drm0.U(str, "bp"), new char[]{'_'}, 2, 2);
                        String str4 = (String) j5g.b0(1, b02);
                        if (str4 != null && (m2 = arm0.m(10, str4)) != null) {
                            int intValue = m2.intValue();
                            String str5 = (String) j5g.b0(0, b02);
                            if (str5 != null && (n3 = arm0.n(str5)) != null) {
                                ei7Var = new ei7(start2, end2, userId, str3, intValue, new UserId(n3.longValue()));
                                if (ei7Var == null) {
                                    arrayList3.add(ei7Var);
                                }
                            }
                        }
                    }
                }
                ei7Var = null;
                if (ei7Var == null) {
                }
            }
            f().reset(charSequence);
            while (f().find()) {
                l9z h2 = h(f().start(), f().end(), f().group());
                if (h2 != null) {
                    arrayList3.add(h2);
                }
            }
            arrayList.addAll(arrayList3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public static Matcher n() {
        Matcher matcher = i.get();
        if (matcher != null) {
            return matcher;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static Matcher o() {
        Matcher matcher = g.get();
        if (matcher != null) {
            return matcher;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static boolean p(char c2) {
        return c2 == '@' || c2 == '*';
    }
}
