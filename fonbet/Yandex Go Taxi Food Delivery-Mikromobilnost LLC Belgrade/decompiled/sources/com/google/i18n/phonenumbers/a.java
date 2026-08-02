package com.google.i18n.phonenumbers;

import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.Phonenumber$PhoneNumber;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import com.ybsdk.widgets.common.MoneyInputEditView;
import defpackage.ag1;
import defpackage.b64;
import defpackage.c9v;
import defpackage.d0c;
import defpackage.g8e;
import defpackage.hdu;
import defpackage.k1f;
import defpackage.m2v;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.v5c0;
import defpackage.vbb;
import defpackage.weh;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.JCP.tools.LicenseUtility;

/* loaded from: classes11.dex */
public final class a {
    public static final Logger h;
    public static final Map i;
    public static final Map j;
    public static final Map k;
    public static final Map l;
    public static final Map m;
    public static final Pattern n;
    public static final Pattern o;
    public static final Pattern p;
    public static final Pattern q;
    public static final Pattern r;
    public static final Pattern s;
    public static final Pattern t;
    public static final Pattern u;
    public static final Pattern v;
    public static final Pattern w;
    public static final Pattern x;
    public static final Pattern y;
    public static a z;
    public final c9v a;
    public final HashMap b;
    public final v5c0 c = new v5c0();
    public final HashSet d = new HashSet(35);
    public final com.google.i18n.phonenumbers.internal.a e = new com.google.i18n.phonenumbers.internal.a();
    public final HashSet f = new HashSet(320);
    public final HashSet g = new HashSet();

    static {
        Character valueOf = Character.valueOf(HexString.CHAR_SPACE);
        Character valueOf2 = Character.valueOf(LicenseUtility.SEPARATOR);
        h = Logger.getLogger(a.class.getName());
        HashMap hashMap = new HashMap();
        hashMap.put(54, "9");
        i = Collections.unmodifiableMap(hashMap);
        HashSet hashSet = new HashSet();
        hashSet.add(86);
        Collections.unmodifiableSet(hashSet);
        HashSet hashSet2 = new HashSet();
        hashSet2.add(52);
        Collections.unmodifiableSet(hashSet2);
        HashSet hashSet3 = new HashSet();
        hashSet3.add(52);
        hashSet3.add(54);
        hashSet3.add(55);
        hashSet3.add(62);
        hashSet3.addAll(hashSet);
        Collections.unmodifiableSet(hashSet3);
        HashMap hashMap2 = new HashMap();
        Character valueOf3 = Character.valueOf(MoneyInputEditView.DEFAULT_VALUE);
        hashMap2.put(valueOf3, valueOf3);
        hashMap2.put('1', '1');
        hashMap2.put('2', '2');
        hashMap2.put('3', '3');
        hashMap2.put('4', '4');
        hashMap2.put('5', '5');
        hashMap2.put('6', '6');
        hashMap2.put('7', '7');
        hashMap2.put('8', '8');
        hashMap2.put('9', '9');
        HashMap hashMap3 = new HashMap(40);
        hashMap3.put('A', '2');
        hashMap3.put('B', '2');
        hashMap3.put('C', '2');
        hashMap3.put('D', '3');
        hashMap3.put('E', '3');
        hashMap3.put('F', '3');
        hashMap3.put('G', '4');
        hashMap3.put('H', '4');
        hashMap3.put('I', '4');
        hashMap3.put('J', '5');
        hashMap3.put('K', '5');
        hashMap3.put('L', '5');
        hashMap3.put('M', '6');
        hashMap3.put('N', '6');
        hashMap3.put('O', '6');
        hashMap3.put('P', '7');
        hashMap3.put('Q', '7');
        hashMap3.put('R', '7');
        hashMap3.put('S', '7');
        hashMap3.put('T', '8');
        hashMap3.put('U', '8');
        hashMap3.put('V', '8');
        hashMap3.put('W', '9');
        hashMap3.put('X', '9');
        hashMap3.put('Y', '9');
        hashMap3.put('Z', '9');
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap3);
        k = unmodifiableMap;
        HashMap hashMap4 = new HashMap(100);
        hashMap4.putAll(unmodifiableMap);
        hashMap4.putAll(hashMap2);
        l = Collections.unmodifiableMap(hashMap4);
        HashMap hashMap5 = new HashMap();
        hashMap5.putAll(hashMap2);
        hashMap5.put('+', '+');
        hashMap5.put('*', '*');
        hashMap5.put('#', '#');
        j = Collections.unmodifiableMap(hashMap5);
        HashMap hashMap6 = new HashMap();
        for (Character ch : unmodifiableMap.keySet()) {
            hashMap6.put(Character.valueOf(Character.toLowerCase(ch.charValue())), ch);
            hashMap6.put(ch, ch);
        }
        hashMap6.putAll(hashMap2);
        hashMap6.put(valueOf2, valueOf2);
        hashMap6.put((char) 65293, valueOf2);
        hashMap6.put((char) 8208, valueOf2);
        hashMap6.put((char) 8209, valueOf2);
        hashMap6.put((char) 8210, valueOf2);
        hashMap6.put((char) 8211, valueOf2);
        hashMap6.put((char) 8212, valueOf2);
        hashMap6.put((char) 8213, valueOf2);
        hashMap6.put((char) 8722, valueOf2);
        hashMap6.put('/', '/');
        hashMap6.put((char) 65295, '/');
        hashMap6.put(valueOf, valueOf);
        hashMap6.put((char) 12288, valueOf);
        hashMap6.put((char) 8288, valueOf);
        hashMap6.put('.', '.');
        hashMap6.put((char) 65294, '.');
        m = Collections.unmodifiableMap(hashMap6);
        Pattern.compile("[\\d]+(?:[~⁓∼～][\\d]+)?");
        StringBuilder sb = new StringBuilder();
        Map map = k;
        sb.append(Arrays.toString(map.keySet().toArray()).replaceAll("[, \\[\\]]", ""));
        sb.append(Arrays.toString(map.keySet().toArray()).toLowerCase().replaceAll("[, \\[\\]]", ""));
        String sb2 = sb.toString();
        n = Pattern.compile("[+＋]+");
        o = Pattern.compile("[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]+");
        p = Pattern.compile("(\\p{Nd})");
        q = Pattern.compile("[+＋\\p{Nd}]");
        r = Pattern.compile("[\\\\/] *x");
        s = Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");
        t = Pattern.compile("(?:.*?[A-Za-z]){3}.*");
        String p2 = oyr.p("\\p{Nd}{2}|[+＋]*+(?:[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*]*\\p{Nd}){3,}[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*", sb2, "\\p{Nd}]*");
        String a = a(true);
        a(false);
        u = Pattern.compile("^\\+(\\p{Nd}|[\\-\\.\\(\\)]?)*\\p{Nd}(\\p{Nd}|[\\-\\.\\(\\)]?)*$");
        String concat = sb2.concat("\\p{Nd}");
        v = Pattern.compile("^(" + unr0.p("[", concat, "]+((\\-)*[", concat, "])*") + "\\.)*" + unr0.p("[", sb2, "]+((\\-)*[", concat, "])*") + "\\.?$");
        StringBuilder sb3 = new StringBuilder("(?:");
        sb3.append(a);
        sb3.append(")$");
        w = Pattern.compile(sb3.toString(), 66);
        x = Pattern.compile(p2 + "(?:" + a + ")?", 66);
        Pattern.compile("(\\D+)");
        y = Pattern.compile("(\\$\\d)");
        Pattern.compile("\\(?\\$1\\)?");
        z = null;
    }

    public a(c9v c9vVar, HashMap hashMap) {
        this.a = c9vVar;
        this.b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            List list = (List) entry.getValue();
            if (list.size() == 1 && "001".equals(list.get(0))) {
                this.g.add((Integer) entry.getKey());
            } else {
                this.f.addAll(list);
            }
        }
        if (this.f.remove("001")) {
            h.log(Level.WARNING, "invalid metadata (country calling code was mapped to the non-geo entity as well as specific region(s))");
        }
        this.d.addAll((Collection) hashMap.get(1));
    }

    public static String a(boolean z2) {
        String t2 = oyr.t(oyr.w(";ext=".concat(b(20)), "|", "[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|доб|anexo)[:\\.．]?[  \\t,-]*" + b(20) + "#?", "|", "[  \\t,]*(?:[xｘ#＃~～]|int|ｉｎｔ)[:\\.．]?[  \\t,-]*" + b(9) + "#?"), "|", "[- ]+" + b(6) + ShimmerDivHandler.NUMBER_SING);
        if (!z2) {
            return t2;
        }
        return oyr.q(t2, "|", "[  \\t]*(?:,{2}|;)[:\\.．]?[  \\t,-]*" + b(15) + "#?", "|", "[  \\t]*(?:,)+[:\\.．]?[  \\t,-]*" + b(9) + "#?");
    }

    public static String b(int i2) {
        return oyr.j(i2, "(\\p{Nd}{1,", "})");
    }

    public static synchronized a d() {
        a aVar;
        synchronized (a.class) {
            try {
                if (z == null) {
                    weh wehVar = weh.d;
                    d0c d0cVar = wehVar.b;
                    if (d0cVar == null) {
                        throw new IllegalArgumentException("metadataLoader could not be null.");
                    }
                    a aVar2 = new a(new c9v(wehVar.c, d0cVar, wehVar.a), k1f.a());
                    synchronized (a.class) {
                        z = aVar2;
                    }
                }
                aVar = z;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    public static String g(Phonenumber$PhoneNumber phonenumber$PhoneNumber) {
        StringBuilder sb = new StringBuilder();
        if (phonenumber$PhoneNumber.j() && phonenumber$PhoneNumber.f() > 0) {
            char[] cArr = new char[phonenumber$PhoneNumber.f()];
            Arrays.fill(cArr, MoneyInputEditView.DEFAULT_VALUE);
            sb.append(new String(cArr));
        }
        sb.append(phonenumber$PhoneNumber.c());
        return sb.toString();
    }

    public static Phonemetadata$PhoneNumberDesc h(Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata, PhoneNumberUtil$PhoneNumberType phoneNumberUtil$PhoneNumberType) {
        switch (phoneNumberUtil$PhoneNumberType.ordinal()) {
            case 0:
            case 2:
                return phonemetadata$PhoneMetadata.b();
            case 1:
                return phonemetadata$PhoneMetadata.j();
            case 3:
                return phonemetadata$PhoneMetadata.u();
            case 4:
                return phonemetadata$PhoneMetadata.r();
            case 5:
                return phonemetadata$PhoneMetadata.t();
            case 6:
                return phonemetadata$PhoneMetadata.x();
            case 7:
                return phonemetadata$PhoneMetadata.p();
            case 8:
                return phonemetadata$PhoneMetadata.n();
            case 9:
                return phonemetadata$PhoneMetadata.v();
            case 10:
                return phonemetadata$PhoneMetadata.w();
            default:
                return phonemetadata$PhoneMetadata.c();
        }
    }

    public static void n(StringBuilder sb) {
        if (!t.matcher(sb).matches()) {
            sb.replace(0, sb.length(), o(sb));
            return;
        }
        int length = sb.length();
        StringBuilder sb2 = new StringBuilder(sb.length());
        for (int i2 = 0; i2 < sb.length(); i2++) {
            Character ch = (Character) l.get(Character.valueOf(Character.toUpperCase(sb.charAt(i2))));
            if (ch != null) {
                sb2.append(ch);
            }
        }
        sb.replace(0, length, sb2.toString());
    }

    public static String o(CharSequence charSequence) {
        StringBuilder sb = new StringBuilder(charSequence.length());
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            int digit = Character.digit(charSequence.charAt(i2), 10);
            if (digit != -1) {
                sb.append(digit);
            }
        }
        return sb.toString();
    }

    public static void q(int i2, PhoneNumberUtil$PhoneNumberFormat phoneNumberUtil$PhoneNumberFormat, StringBuilder sb) {
        int ordinal = phoneNumberUtil$PhoneNumberFormat.ordinal();
        if (ordinal == 0) {
            sb.insert(0, i2).insert(0, '+');
        } else if (ordinal == 1) {
            sb.insert(0, " ").insert(0, i2).insert(0, '+');
        } else {
            if (ordinal != 3) {
                return;
            }
            sb.insert(0, "-").insert(0, i2).insert(0, '+').insert(0, "tel:");
        }
    }

    public static PhoneNumberUtil$ValidationResult r(StringBuilder sb, Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata, PhoneNumberUtil$PhoneNumberType phoneNumberUtil$PhoneNumberType) {
        Phonemetadata$PhoneNumberDesc h2 = h(phonemetadata$PhoneMetadata, phoneNumberUtil$PhoneNumberType);
        List f = h2.f().isEmpty() ? phonemetadata$PhoneMetadata.c().f() : h2.f();
        List g = h2.g();
        if (phoneNumberUtil$PhoneNumberType == PhoneNumberUtil$PhoneNumberType.FIXED_LINE_OR_MOBILE) {
            Phonemetadata$PhoneNumberDesc h3 = h(phonemetadata$PhoneMetadata, PhoneNumberUtil$PhoneNumberType.FIXED_LINE);
            if (h3.c() == 1 && h3.b() == -1) {
                return r(sb, phonemetadata$PhoneMetadata, PhoneNumberUtil$PhoneNumberType.MOBILE);
            }
            Phonemetadata$PhoneNumberDesc h4 = h(phonemetadata$PhoneMetadata, PhoneNumberUtil$PhoneNumberType.MOBILE);
            if (h4.c() != 1 || h4.b() != -1) {
                ArrayList arrayList = new ArrayList(f);
                arrayList.addAll(h4.c() == 0 ? phonemetadata$PhoneMetadata.c().f() : h4.f());
                Collections.sort(arrayList);
                if (g.isEmpty()) {
                    g = h4.g();
                } else {
                    ArrayList arrayList2 = new ArrayList(g);
                    arrayList2.addAll(h4.g());
                    Collections.sort(arrayList2);
                    g = arrayList2;
                }
                f = arrayList;
            }
        }
        if (((Integer) f.get(0)).intValue() == -1) {
            return PhoneNumberUtil$ValidationResult.INVALID_LENGTH;
        }
        int length = sb.length();
        if (g.contains(Integer.valueOf(length))) {
            return PhoneNumberUtil$ValidationResult.IS_POSSIBLE_LOCAL_ONLY;
        }
        int intValue = ((Integer) f.get(0)).intValue();
        return intValue == length ? PhoneNumberUtil$ValidationResult.IS_POSSIBLE : intValue > length ? PhoneNumberUtil$ValidationResult.TOO_SHORT : ((Integer) b64.c(1, f)).intValue() < length ? PhoneNumberUtil$ValidationResult.TOO_LONG : f.subList(1, f.size()).contains(Integer.valueOf(length)) ? PhoneNumberUtil$ValidationResult.IS_POSSIBLE : PhoneNumberUtil$ValidationResult.INVALID_LENGTH;
    }

    public final String c(Phonenumber$PhoneNumber phonenumber$PhoneNumber, PhoneNumberUtil$PhoneNumberFormat phoneNumberUtil$PhoneNumberFormat) {
        com.google.i18n.phonenumbers.internal.a aVar;
        Phonemetadata$NumberFormat phonemetadata$NumberFormat;
        if (phonenumber$PhoneNumber.c() == 0) {
            String g = phonenumber$PhoneNumber.g();
            if (g.length() > 0 || !phonenumber$PhoneNumber.h()) {
                return g;
            }
        }
        StringBuilder sb = new StringBuilder(20);
        sb.setLength(0);
        int a = phonenumber$PhoneNumber.a();
        String g2 = g(phonenumber$PhoneNumber);
        PhoneNumberUtil$PhoneNumberFormat phoneNumberUtil$PhoneNumberFormat2 = PhoneNumberUtil$PhoneNumberFormat.E164;
        if (phoneNumberUtil$PhoneNumberFormat == phoneNumberUtil$PhoneNumberFormat2) {
            sb.append(g2);
            q(a, phoneNumberUtil$PhoneNumberFormat2, sb);
        } else {
            Integer valueOf = Integer.valueOf(a);
            HashMap hashMap = this.b;
            if (hashMap.containsKey(valueOf)) {
                List list = (List) hashMap.get(Integer.valueOf(a));
                Phonemetadata$PhoneMetadata f = f(a, list == null ? "ZZ" : (String) list.get(0));
                Iterator it = ((f.h().size() == 0 || phoneNumberUtil$PhoneNumberFormat == PhoneNumberUtil$PhoneNumberFormat.NATIONAL) ? f.m() : f.h()).iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    aVar = this.e;
                    if (!hasNext) {
                        phonemetadata$NumberFormat = null;
                        break;
                    }
                    phonemetadata$NumberFormat = (Phonemetadata$NumberFormat) it.next();
                    int b = phonemetadata$NumberFormat.b();
                    if (b == 0 || aVar.a(phonemetadata$NumberFormat.a(b - 1)).matcher(g2).lookingAt()) {
                        if (aVar.a(phonemetadata$NumberFormat.f()).matcher(g2).matches()) {
                            break;
                        }
                    }
                }
                if (phonemetadata$NumberFormat != null) {
                    String format = phonemetadata$NumberFormat.getFormat();
                    Matcher matcher = aVar.a(phonemetadata$NumberFormat.f()).matcher(g2);
                    PhoneNumberUtil$PhoneNumberFormat phoneNumberUtil$PhoneNumberFormat3 = PhoneNumberUtil$PhoneNumberFormat.NATIONAL;
                    String c = phonemetadata$NumberFormat.c();
                    g2 = (phoneNumberUtil$PhoneNumberFormat != phoneNumberUtil$PhoneNumberFormat3 || c == null || c.length() <= 0) ? matcher.replaceAll(format) : matcher.replaceAll(y.matcher(format).replaceFirst(c));
                    if (phoneNumberUtil$PhoneNumberFormat == PhoneNumberUtil$PhoneNumberFormat.RFC3966) {
                        Matcher matcher2 = o.matcher(g2);
                        if (matcher2.lookingAt()) {
                            g2 = matcher2.replaceFirst("");
                        }
                        g2 = matcher2.reset(g2).replaceAll("-");
                    }
                }
                sb.append(g2);
                if (phonenumber$PhoneNumber.i() && phonenumber$PhoneNumber.b().length() > 0) {
                    if (phoneNumberUtil$PhoneNumberFormat == PhoneNumberUtil$PhoneNumberFormat.RFC3966) {
                        sb.append(";ext=");
                        sb.append(phonenumber$PhoneNumber.b());
                    } else if (f.z()) {
                        sb.append(f.q());
                        sb.append(phonenumber$PhoneNumber.b());
                    } else {
                        sb.append(" ext. ");
                        sb.append(phonenumber$PhoneNumber.b());
                    }
                }
                q(a, phoneNumberUtil$PhoneNumberFormat, sb);
            } else {
                sb.append(g2);
            }
        }
        return sb.toString();
    }

    public final Phonemetadata$PhoneMetadata e(String str) {
        if (str != null && this.f.contains(str)) {
            c9v c9vVar = this.a;
            c9vVar.getClass();
            if (!str.equals("001")) {
                Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata = (Phonemetadata$PhoneMetadata) ((ConcurrentHashMap) ((hdu) ((vbb) ((m2v) c9vVar.c).s(((ag1) c9vVar.b).e(str))).b).a).get(str);
                String concat = "Missing metadata for region code ".concat(str);
                if (phonemetadata$PhoneMetadata != null) {
                    return phonemetadata$PhoneMetadata;
                }
                throw new MissingMetadataException(concat);
            }
            ny61.g(str.concat(" region code is a non-geo entity"));
        }
        return null;
    }

    public final Phonemetadata$PhoneMetadata f(int i2, String str) {
        if (!"001".equals(str)) {
            return e(str);
        }
        if (!this.g.contains(Integer.valueOf(i2))) {
            return null;
        }
        c9v c9vVar = this.a;
        c9vVar.getClass();
        List list = (List) k1f.a().get(Integer.valueOf(i2));
        if (list != null && !list.contains("001")) {
            ny61.g(b64.e(i2, " calling code belongs to a geo entity"));
            return null;
        }
        hdu hduVar = (hdu) ((vbb) ((m2v) c9vVar.c).s(((ag1) c9vVar.b).e(Integer.valueOf(i2)))).a;
        Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata = (Phonemetadata$PhoneMetadata) ((ConcurrentHashMap) hduVar.a).get(Integer.valueOf(i2));
        String i3 = oyr.i(i2, "Missing metadata for country code ");
        if (phonemetadata$PhoneMetadata != null) {
            return phonemetadata$PhoneMetadata;
        }
        throw new MissingMetadataException(i3);
    }

    public final PhoneNumberUtil$PhoneNumberType i(String str, Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata) {
        if (!j(str, phonemetadata$PhoneMetadata.c())) {
            return PhoneNumberUtil$PhoneNumberType.UNKNOWN;
        }
        if (j(str, phonemetadata$PhoneMetadata.r())) {
            return PhoneNumberUtil$PhoneNumberType.PREMIUM_RATE;
        }
        if (j(str, phonemetadata$PhoneMetadata.u())) {
            return PhoneNumberUtil$PhoneNumberType.TOLL_FREE;
        }
        if (j(str, phonemetadata$PhoneMetadata.t())) {
            return PhoneNumberUtil$PhoneNumberType.SHARED_COST;
        }
        if (j(str, phonemetadata$PhoneMetadata.x())) {
            return PhoneNumberUtil$PhoneNumberType.VOIP;
        }
        if (j(str, phonemetadata$PhoneMetadata.p())) {
            return PhoneNumberUtil$PhoneNumberType.PERSONAL_NUMBER;
        }
        if (j(str, phonemetadata$PhoneMetadata.n())) {
            return PhoneNumberUtil$PhoneNumberType.PAGER;
        }
        if (j(str, phonemetadata$PhoneMetadata.v())) {
            return PhoneNumberUtil$PhoneNumberType.UAN;
        }
        if (j(str, phonemetadata$PhoneMetadata.w())) {
            return PhoneNumberUtil$PhoneNumberType.VOICEMAIL;
        }
        if (!j(str, phonemetadata$PhoneMetadata.b())) {
            return (phonemetadata$PhoneMetadata.s() || !j(str, phonemetadata$PhoneMetadata.j())) ? PhoneNumberUtil$PhoneNumberType.UNKNOWN : PhoneNumberUtil$PhoneNumberType.MOBILE;
        }
        if (!phonemetadata$PhoneMetadata.s() && !j(str, phonemetadata$PhoneMetadata.j())) {
            return PhoneNumberUtil$PhoneNumberType.FIXED_LINE;
        }
        return PhoneNumberUtil$PhoneNumberType.FIXED_LINE_OR_MOBILE;
    }

    public final boolean j(String str, Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc) {
        int length = str.length();
        List f = phonemetadata$PhoneNumberDesc.f();
        if (f.size() <= 0 || f.contains(Integer.valueOf(length))) {
            return this.c.J(str, phonemetadata$PhoneNumberDesc);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0096, code lost:
    
        if (r0 != r5.a()) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean k(Phonenumber$PhoneNumber phonenumber$PhoneNumber) {
        int a = phonenumber$PhoneNumber.a();
        List<String> list = (List) this.b.get(Integer.valueOf(a));
        String str = null;
        if (list != null) {
            if (list.size() != 1) {
                String g = g(phonenumber$PhoneNumber);
                for (String str2 : list) {
                    Phonemetadata$PhoneMetadata e = e(str2);
                    if (!e.y()) {
                        if (i(g, e) != PhoneNumberUtil$PhoneNumberType.UNKNOWN) {
                            str = str2;
                            break;
                        }
                    } else {
                        if (this.e.a(e.i()).matcher(g).lookingAt()) {
                            str = str2;
                            break;
                        }
                    }
                }
            } else {
                str = (String) list.get(0);
            }
        } else {
            h.log(Level.INFO, "Missing/invalid country_code (" + a + Extension.C_BRAKE);
        }
        int a2 = phonenumber$PhoneNumber.a();
        Phonemetadata$PhoneMetadata f = f(a2, str);
        if (f != null) {
            if (!"001".equals(str)) {
                Phonemetadata$PhoneMetadata e2 = e(str);
                if (e2 == null) {
                    ny61.g(g8e.o("Invalid region code: ", str));
                    return false;
                }
            }
            if (i(g(phonenumber$PhoneNumber), f) != PhoneNumberUtil$PhoneNumberType.UNKNOWN) {
                return true;
            }
        }
        return false;
    }

    public final int l(CharSequence charSequence, Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata, StringBuilder sb, Phonenumber$PhoneNumber phonenumber$PhoneNumber) {
        Phonenumber$PhoneNumber.CountryCodeSource countryCodeSource;
        int i2 = 0;
        if (charSequence.length() == 0) {
            return 0;
        }
        StringBuilder sb2 = new StringBuilder(charSequence);
        String g = phonemetadata$PhoneMetadata != null ? phonemetadata$PhoneMetadata.g() : "NonMatch";
        int i3 = 1;
        if (sb2.length() == 0) {
            countryCodeSource = Phonenumber$PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY;
        } else {
            Matcher matcher = n.matcher(sb2);
            if (matcher.lookingAt()) {
                sb2.delete(0, matcher.end());
                n(sb2);
                countryCodeSource = Phonenumber$PhoneNumber.CountryCodeSource.FROM_NUMBER_WITH_PLUS_SIGN;
            } else {
                Pattern a = this.e.a(g);
                n(sb2);
                Matcher matcher2 = a.matcher(sb2);
                if (matcher2.lookingAt()) {
                    int end = matcher2.end();
                    Matcher matcher3 = p.matcher(sb2.substring(end));
                    if (!matcher3.find() || !o(matcher3.group(1)).equals("0")) {
                        sb2.delete(0, end);
                        countryCodeSource = Phonenumber$PhoneNumber.CountryCodeSource.FROM_NUMBER_WITH_IDD;
                    }
                }
                countryCodeSource = Phonenumber$PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY;
            }
        }
        if (countryCodeSource == Phonenumber$PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY) {
            if (phonemetadata$PhoneMetadata != null) {
                int a2 = phonemetadata$PhoneMetadata.a();
                String valueOf = String.valueOf(a2);
                String sb3 = sb2.toString();
                if (sb3.startsWith(valueOf)) {
                    StringBuilder sb4 = new StringBuilder(sb3.substring(valueOf.length()));
                    Phonemetadata$PhoneNumberDesc c = phonemetadata$PhoneMetadata.c();
                    m(sb4, phonemetadata$PhoneMetadata, null);
                    v5c0 v5c0Var = this.c;
                    if ((!v5c0Var.J(sb2, c) && v5c0Var.J(sb4, c)) || r(sb2, phonemetadata$PhoneMetadata, PhoneNumberUtil$PhoneNumberType.UNKNOWN) == PhoneNumberUtil$ValidationResult.TOO_LONG) {
                        sb.append((CharSequence) sb4);
                        phonenumber$PhoneNumber.k(a2);
                        return a2;
                    }
                }
            }
            phonenumber$PhoneNumber.k(0);
            return 0;
        }
        if (sb2.length() <= 2) {
            throw new NumberParseException(NumberParseException.ErrorType.TOO_SHORT_AFTER_IDD, "Phone number had an IDD, but after this was not long enough to be a viable phone number.");
        }
        if (sb2.length() != 0 && sb2.charAt(0) != '0') {
            int length = sb2.length();
            while (true) {
                if (i3 > 3 || i3 > length) {
                    break;
                }
                int parseInt = Integer.parseInt(sb2.substring(0, i3));
                if (this.b.containsKey(Integer.valueOf(parseInt))) {
                    sb.append(sb2.substring(i3));
                    i2 = parseInt;
                    break;
                }
                i3++;
            }
        }
        if (i2 == 0) {
            throw new NumberParseException(NumberParseException.ErrorType.INVALID_COUNTRY_CODE, "Country calling code supplied was not recognised.");
        }
        phonenumber$PhoneNumber.k(i2);
        return i2;
    }

    public final void m(StringBuilder sb, Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata, StringBuilder sb2) {
        int length = sb.length();
        String k2 = phonemetadata$PhoneMetadata.k();
        if (length == 0 || k2.length() == 0) {
            return;
        }
        Matcher matcher = this.e.a(k2).matcher(sb);
        if (matcher.lookingAt()) {
            Phonemetadata$PhoneNumberDesc c = phonemetadata$PhoneMetadata.c();
            v5c0 v5c0Var = this.c;
            boolean J = v5c0Var.J(sb, c);
            int groupCount = matcher.groupCount();
            String l2 = phonemetadata$PhoneMetadata.l();
            if (l2 == null || l2.length() == 0 || matcher.group(groupCount) == null) {
                if (!J || v5c0Var.J(sb.substring(matcher.end()), c)) {
                    if (sb2 != null && groupCount > 0 && matcher.group(groupCount) != null) {
                        sb2.append(matcher.group(1));
                    }
                    sb.delete(0, matcher.end());
                    return;
                }
                return;
            }
            StringBuilder sb3 = new StringBuilder(sb);
            sb3.replace(0, length, matcher.replaceFirst(l2));
            if (!J || v5c0Var.J(sb3.toString(), c)) {
                if (sb2 != null && groupCount > 1) {
                    sb2.append(matcher.group(1));
                }
                sb.replace(0, sb.length(), sb3.toString());
            }
        }
    }

    public final Phonenumber$PhoneNumber p(CharSequence charSequence, String str) {
        String substring;
        CharSequence charSequence2;
        int l2;
        Phonenumber$PhoneNumber phonenumber$PhoneNumber = new Phonenumber$PhoneNumber();
        if (charSequence == null) {
            throw new NumberParseException(NumberParseException.ErrorType.NOT_A_NUMBER, "The phone number supplied was null.");
        }
        if (charSequence.length() > 250) {
            throw new NumberParseException(NumberParseException.ErrorType.TOO_LONG, "The string supplied was too long to parse.");
        }
        StringBuilder sb = new StringBuilder();
        String charSequence3 = charSequence.toString();
        int indexOf = charSequence3.indexOf(";phone-context=");
        String str2 = "";
        if (indexOf == -1) {
            substring = null;
        } else {
            int i2 = indexOf + 15;
            if (i2 >= charSequence3.length()) {
                substring = "";
            } else {
                int indexOf2 = charSequence3.indexOf(59, i2);
                substring = indexOf2 != -1 ? charSequence3.substring(i2, indexOf2) : charSequence3.substring(i2);
            }
        }
        if (substring != null && (substring.length() == 0 || !(u.matcher(substring).matches() || v.matcher(substring).matches()))) {
            throw new NumberParseException(NumberParseException.ErrorType.NOT_A_NUMBER, "The phone-context value is invalid.");
        }
        if (substring != null) {
            if (substring.charAt(0) == '+') {
                sb.append(substring);
            }
            int indexOf3 = charSequence3.indexOf("tel:");
            sb.append(charSequence3.substring(indexOf3 >= 0 ? indexOf3 + 4 : 0, indexOf));
        } else {
            Matcher matcher = q.matcher(charSequence3);
            if (matcher.find()) {
                charSequence2 = charSequence3.subSequence(matcher.start(), charSequence3.length());
                Matcher matcher2 = s.matcher(charSequence2);
                if (matcher2.find()) {
                    charSequence2 = charSequence2.subSequence(0, matcher2.start());
                }
                Matcher matcher3 = r.matcher(charSequence2);
                if (matcher3.find()) {
                    charSequence2 = charSequence2.subSequence(0, matcher3.start());
                }
            } else {
                charSequence2 = "";
            }
            sb.append(charSequence2);
        }
        int indexOf4 = sb.indexOf(";isub=");
        if (indexOf4 > 0) {
            sb.delete(indexOf4, sb.length());
        }
        int length = sb.length();
        Pattern pattern = x;
        if (!(length < 2 ? false : pattern.matcher(sb).matches())) {
            throw new NumberParseException(NumberParseException.ErrorType.NOT_A_NUMBER, "The string supplied did not seem to be a phone number.");
        }
        Pattern pattern2 = n;
        if ((str == null || !this.f.contains(str)) && (sb.length() == 0 || !pattern2.matcher(sb).lookingAt())) {
            throw new NumberParseException(NumberParseException.ErrorType.INVALID_COUNTRY_CODE, "Missing or invalid default region.");
        }
        Matcher matcher4 = w.matcher(sb);
        if (matcher4.find()) {
            String substring2 = sb.substring(0, matcher4.start());
            if (substring2.length() < 2 ? false : pattern.matcher(substring2).matches()) {
                int groupCount = matcher4.groupCount();
                int i3 = 1;
                while (true) {
                    if (i3 > groupCount) {
                        break;
                    }
                    if (matcher4.group(i3) != null) {
                        str2 = matcher4.group(i3);
                        sb.delete(matcher4.start(), sb.length());
                        break;
                    }
                    i3++;
                }
            }
        }
        if (str2.length() > 0) {
            phonenumber$PhoneNumber.l(str2);
        }
        Phonemetadata$PhoneMetadata e = e(str);
        StringBuilder sb2 = new StringBuilder();
        try {
            l2 = l(sb, e, sb2, phonenumber$PhoneNumber);
        } catch (NumberParseException e2) {
            Matcher matcher5 = pattern2.matcher(sb);
            if (e2.a() != NumberParseException.ErrorType.INVALID_COUNTRY_CODE || !matcher5.lookingAt()) {
                throw new NumberParseException(e2.a(), e2.getMessage());
            }
            l2 = l(sb.substring(matcher5.end()), e, sb2, phonenumber$PhoneNumber);
            if (l2 == 0) {
                throw new NumberParseException(NumberParseException.ErrorType.INVALID_COUNTRY_CODE, "Could not interpret numbers after plus-sign.");
            }
        }
        if (l2 != 0) {
            List list = (List) this.b.get(Integer.valueOf(l2));
            String str3 = list == null ? "ZZ" : (String) list.get(0);
            if (!str3.equals(str)) {
                e = f(l2, str3);
            }
        } else {
            n(sb);
            sb2.append((CharSequence) sb);
            if (str != null) {
                phonenumber$PhoneNumber.k(e.a());
            }
        }
        if (sb2.length() < 2) {
            throw new NumberParseException(NumberParseException.ErrorType.TOO_SHORT_NSN, "The string supplied is too short to be a phone number.");
        }
        if (e != null) {
            StringBuilder sb3 = new StringBuilder();
            StringBuilder sb4 = new StringBuilder(sb2);
            m(sb4, e, sb3);
            PhoneNumberUtil$ValidationResult r2 = r(sb4, e, PhoneNumberUtil$PhoneNumberType.UNKNOWN);
            if (r2 != PhoneNumberUtil$ValidationResult.TOO_SHORT && r2 != PhoneNumberUtil$ValidationResult.IS_POSSIBLE_LOCAL_ONLY && r2 != PhoneNumberUtil$ValidationResult.INVALID_LENGTH) {
                sb2 = sb4;
            }
        }
        int length2 = sb2.length();
        if (length2 < 2) {
            throw new NumberParseException(NumberParseException.ErrorType.TOO_SHORT_NSN, "The string supplied is too short to be a phone number.");
        }
        if (length2 > 17) {
            throw new NumberParseException(NumberParseException.ErrorType.TOO_LONG, "The string supplied is too long to be a phone number.");
        }
        if (sb2.length() > 1 && sb2.charAt(0) == '0') {
            phonenumber$PhoneNumber.m();
            int i4 = 1;
            while (i4 < sb2.length() - 1 && sb2.charAt(i4) == '0') {
                i4++;
            }
            if (i4 != 1) {
                phonenumber$PhoneNumber.p(i4);
            }
        }
        phonenumber$PhoneNumber.n(Long.parseLong(sb2.toString()));
        return phonenumber$PhoneNumber;
    }
}
