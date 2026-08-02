package io.michaelrocks.libphonenumber.android;

import io.michaelrocks.libphonenumber.android.Phonemetadata$PhoneMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import xsna.go9;
import xsna.rpf0;

/* compiled from: AsYouTypeFormatter.java */
/* loaded from: classes8.dex */
public final class a {
    public static final Phonemetadata$PhoneMetadata.Builder t;
    public static final Pattern u;
    public static final Pattern v;
    public static final Pattern w;
    public final PhoneNumberUtil i;
    public final String j;
    public final Phonemetadata$PhoneMetadata k;
    public Phonemetadata$PhoneMetadata l;
    public final StringBuilder a = new StringBuilder();
    public String b = "";
    public final StringBuilder c = new StringBuilder();
    public final StringBuilder d = new StringBuilder();
    public boolean e = true;
    public boolean f = false;
    public boolean g = false;
    public boolean h = false;
    public int m = 0;
    public final StringBuilder n = new StringBuilder();
    public boolean o = false;
    public String p = "";
    public final StringBuilder q = new StringBuilder();
    public final ArrayList r = new ArrayList();
    public final rpf0 s = new rpf0(64);

    static {
        Phonemetadata$PhoneMetadata.Builder builder = new Phonemetadata$PhoneMetadata.Builder();
        builder.E();
        builder.F();
        t = builder;
        u = Pattern.compile("[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]*\\$1[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]*(\\$\\d[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]*)*");
        v = Pattern.compile("[- ]");
        w = Pattern.compile("\u2008");
    }

    public a(PhoneNumberUtil phoneNumberUtil, String str) {
        this.i = phoneNumberUtil;
        this.j = str;
        Phonemetadata$PhoneMetadata g = g(str);
        this.l = g;
        this.k = g;
    }

    public final String a(String str) {
        StringBuilder sb = this.n;
        int length = sb.length();
        if (!this.o || length <= 0 || sb.charAt(length - 1) == ' ') {
            return ((Object) sb) + str;
        }
        return new String(sb) + ' ' + str;
    }

    public final String b() {
        StringBuilder sb = this.q;
        if (sb.length() < 3) {
            return a(sb.toString());
        }
        String sb2 = sb.toString();
        for (Phonemetadata$NumberFormat phonemetadata$NumberFormat : (this.g && this.p.length() == 0 && this.l.k() > 0) ? this.l.l() : this.l.q()) {
            if (this.p.length() > 0) {
                String g = phonemetadata$NumberFormat.g();
                if ((g.length() == 0 || PhoneNumberUtil.z.matcher(g).matches()) && !phonemetadata$NumberFormat.h() && !phonemetadata$NumberFormat.j()) {
                }
            }
            if (this.p.length() == 0 && !this.g) {
                String g2 = phonemetadata$NumberFormat.g();
                if (g2.length() != 0 && !PhoneNumberUtil.z.matcher(g2).matches() && !phonemetadata$NumberFormat.h()) {
                }
            }
            if (u.matcher(phonemetadata$NumberFormat.getFormat()).matches()) {
                this.r.add(phonemetadata$NumberFormat);
            }
        }
        l(sb2);
        String e = e();
        return e.length() > 0 ? e : k() ? h() : this.c.toString();
    }

    public final boolean c() {
        StringBuilder sb;
        PhoneNumberUtil phoneNumberUtil;
        int e;
        StringBuilder sb2 = this.q;
        if (sb2.length() == 0 || (e = (phoneNumberUtil = this.i).e(sb2, (sb = new StringBuilder()))) == 0) {
            return false;
        }
        sb2.setLength(0);
        sb2.append((CharSequence) sb);
        String k = phoneNumberUtil.k(e);
        if ("001".equals(k)) {
            this.l = phoneNumberUtil.f(e);
        } else if (!k.equals(this.j)) {
            this.l = g(k);
        }
        String num = Integer.toString(e);
        StringBuilder sb3 = this.n;
        sb3.append(num);
        sb3.append(' ');
        this.p = "";
        return true;
    }

    public final boolean d() {
        Pattern a = this.s.a("\\+|" + this.l.j());
        StringBuilder sb = this.d;
        Matcher matcher = a.matcher(sb);
        if (!matcher.lookingAt()) {
            return false;
        }
        this.g = true;
        int end = matcher.end();
        StringBuilder sb2 = this.q;
        sb2.setLength(0);
        sb2.append(sb.substring(end));
        StringBuilder sb3 = this.n;
        sb3.setLength(0);
        sb3.append(sb.substring(0, end));
        if (sb.charAt(0) != '+') {
            sb3.append(' ');
        }
        return true;
    }

    public final String e() {
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            Phonemetadata$NumberFormat phonemetadata$NumberFormat = (Phonemetadata$NumberFormat) it.next();
            Matcher matcher = this.s.a(phonemetadata$NumberFormat.i()).matcher(this.q);
            if (matcher.matches()) {
                this.o = v.matcher(phonemetadata$NumberFormat.g()).find();
                String a = a(matcher.replaceAll(phonemetadata$NumberFormat.getFormat()));
                if (PhoneNumberUtil.r(a, PhoneNumberUtil.l).contentEquals(this.d)) {
                    return a;
                }
            }
        }
        return "";
    }

    public final void f() {
        this.c.setLength(0);
        this.d.setLength(0);
        this.a.setLength(0);
        this.m = 0;
        this.b = "";
        this.n.setLength(0);
        this.p = "";
        this.q.setLength(0);
        this.e = true;
        this.f = false;
        this.g = false;
        this.h = false;
        this.r.clear();
        this.o = false;
        if (this.l.equals(this.k)) {
            return;
        }
        this.l = g(this.j);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0048 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Phonemetadata$PhoneMetadata g(String str) {
        boolean z;
        int i = 0;
        PhoneNumberUtil phoneNumberUtil = this.i;
        if (str == null) {
            phoneNumberUtil.getClass();
        } else if (phoneNumberUtil.f.contains(str)) {
            z = true;
            if (z) {
                Logger logger = PhoneNumberUtil.h;
                Level level = Level.WARNING;
                StringBuilder sb = new StringBuilder("Invalid or missing region code (");
                if (str == null) {
                    str = "null";
                }
                sb.append(str);
                sb.append(") provided.");
                logger.log(level, sb.toString());
            } else {
                Phonemetadata$PhoneMetadata g = phoneNumberUtil.g(str);
                if (g == null) {
                    throw new IllegalArgumentException(go9.b("Invalid region code: ", str));
                }
                i = g.d();
            }
            Phonemetadata$PhoneMetadata g2 = phoneNumberUtil.g(phoneNumberUtil.k(i));
            return g2 == null ? g2 : t;
        }
        z = false;
        if (z) {
        }
        Phonemetadata$PhoneMetadata g22 = phoneNumberUtil.g(phoneNumberUtil.k(i));
        if (g22 == null) {
        }
    }

    public final String h() {
        StringBuilder sb = this.q;
        int length = sb.length();
        if (length <= 0) {
            return this.n.toString();
        }
        String str = "";
        for (int i = 0; i < length; i++) {
            str = j(sb.charAt(i));
        }
        return this.e ? a(str) : this.c.toString();
    }

    public final String i(char c) {
        StringBuilder sb = this.c;
        sb.append(c);
        boolean isDigit = Character.isDigit(c);
        StringBuilder sb2 = this.d;
        StringBuilder sb3 = this.q;
        if (!isDigit && (sb.length() != 1 || !PhoneNumberUtil.p.matcher(Character.toString(c)).matches())) {
            this.e = false;
            this.f = true;
        } else if (c == '+') {
            sb2.append(c);
        } else {
            c = Character.forDigit(Character.digit(c, 10), 10);
            sb2.append(c);
            sb3.append(c);
        }
        boolean z = this.e;
        StringBuilder sb4 = this.n;
        if (!z) {
            if (this.f) {
                return sb.toString();
            }
            if (!d()) {
                if (this.p.length() > 0) {
                    sb3.insert(0, this.p);
                    sb4.setLength(sb4.lastIndexOf(this.p));
                }
                if (!this.p.equals(m())) {
                    sb4.append(' ');
                    this.e = true;
                    this.h = false;
                    this.r.clear();
                    this.m = 0;
                    this.a.setLength(0);
                    this.b = "";
                    return b();
                }
            } else if (c()) {
                this.e = true;
                this.h = false;
                this.r.clear();
                this.m = 0;
                this.a.setLength(0);
                this.b = "";
                return b();
            }
            return sb.toString();
        }
        int length = sb2.length();
        if (length == 0 || length == 1 || length == 2) {
            return sb.toString();
        }
        if (length == 3) {
            if (!d()) {
                this.p = m();
                return b();
            }
            this.h = true;
        }
        if (this.h) {
            if (c()) {
                this.h = false;
            }
            return ((Object) sb4) + sb3.toString();
        }
        if (this.r.size() <= 0) {
            return b();
        }
        String j = j(c);
        String e = e();
        if (e.length() > 0) {
            return e;
        }
        l(sb3.toString());
        return k() ? h() : this.e ? a(j) : sb.toString();
    }

    public final String j(char c) {
        Pattern pattern = w;
        StringBuilder sb = this.a;
        Matcher matcher = pattern.matcher(sb);
        if (!matcher.find(this.m)) {
            if (this.r.size() == 1) {
                this.e = false;
            }
            this.b = "";
            return this.c.toString();
        }
        String replaceFirst = matcher.replaceFirst(Character.toString(c));
        sb.replace(0, replaceFirst.length(), replaceFirst);
        int start = matcher.start();
        this.m = start;
        return sb.substring(0, start + 1);
    }

    public final boolean k() {
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            Phonemetadata$NumberFormat phonemetadata$NumberFormat = (Phonemetadata$NumberFormat) it.next();
            String i = phonemetadata$NumberFormat.i();
            if (this.b.equals(i)) {
                return false;
            }
            String i2 = phonemetadata$NumberFormat.i();
            StringBuilder sb = this.a;
            sb.setLength(0);
            String format = phonemetadata$NumberFormat.getFormat();
            Matcher matcher = this.s.a(i2).matcher("999999999999999");
            matcher.find();
            String group = matcher.group();
            String replaceAll = group.length() < this.q.length() ? "" : group.replaceAll(i2, format).replaceAll("9", "\u2008");
            if (replaceAll.length() > 0) {
                sb.append(replaceAll);
                this.b = i;
                this.o = v.matcher(phonemetadata$NumberFormat.g()).find();
                this.m = 0;
                return true;
            }
            it.remove();
        }
        this.e = false;
        return false;
    }

    public final void l(String str) {
        int length = str.length() - 3;
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            Phonemetadata$NumberFormat phonemetadata$NumberFormat = (Phonemetadata$NumberFormat) it.next();
            if (phonemetadata$NumberFormat.d() != 0) {
                if (!this.s.a(phonemetadata$NumberFormat.a(Math.min(length, phonemetadata$NumberFormat.d() - 1))).matcher(str).lookingAt()) {
                    it.remove();
                }
            }
        }
    }

    public final String m() {
        int d = this.l.d();
        StringBuilder sb = this.n;
        StringBuilder sb2 = this.q;
        int i = 1;
        if (d != 1 || sb2.charAt(0) != '1' || sb2.charAt(1) == '0' || sb2.charAt(1) == '1') {
            if (this.l.B()) {
                Matcher matcher = this.s.a(this.l.o()).matcher(sb2);
                if (matcher.lookingAt() && matcher.end() > 0) {
                    this.g = true;
                    i = matcher.end();
                    sb.append(sb2.substring(0, i));
                }
            }
            i = 0;
        } else {
            sb.append('1');
            sb.append(' ');
            this.g = true;
        }
        String substring = sb2.substring(0, i);
        sb2.delete(0, i);
        return substring;
    }
}
