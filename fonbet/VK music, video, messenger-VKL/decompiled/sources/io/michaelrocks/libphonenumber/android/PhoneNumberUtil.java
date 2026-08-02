package io.michaelrocks.libphonenumber.android;

import android.content.Context;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ironsource.X3;
import com.vk.dto.common.ImageSizeKey;
import io.jsonwebtoken.JwtParser;
import io.michaelrocks.libphonenumber.android.NumberParseException;
import io.michaelrocks.libphonenumber.android.Phonenumber$PhoneNumber;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import xsna.e540;
import xsna.eo9;
import xsna.fh9;
import xsna.fo8;
import xsna.g6o0;
import xsna.go9;
import xsna.i3a0;
import xsna.i5s;
import xsna.ji;
import xsna.l6g;
import xsna.lhg;
import xsna.qil;
import xsna.rpf0;
import xsna.rti;
import xsna.sj00;
import xsna.sni;
import xsna.ss9;
import xsna.tgw;
import xsna.ti20;
import xsna.uf7;
import xsna.zr;

/* loaded from: classes8.dex */
public final class PhoneNumberUtil {
    public static final Logger h;
    public static final Map<Integer, String> i;
    public static final Set<Integer> j;
    public static final Set<Integer> k;
    public static final Map<Character, Character> l;
    public static final Map<Character, Character> m;
    public static final Map<Character, Character> n;
    public static final Map<Character, Character> o;
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
    public static final Pattern z;
    public final fh9 a;
    public final HashMap b;
    public final eo9 c = new eo9(4);
    public final HashSet d = new HashSet(35);
    public final rpf0 e = new rpf0(100);
    public final HashSet f = new HashSet(320);
    public final HashSet g = new HashSet();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class PhoneNumberFormat {
        private static final /* synthetic */ PhoneNumberFormat[] $VALUES;
        public static final PhoneNumberFormat E164;
        public static final PhoneNumberFormat INTERNATIONAL;
        public static final PhoneNumberFormat NATIONAL;
        public static final PhoneNumberFormat RFC3966;

        static {
            PhoneNumberFormat phoneNumberFormat = new PhoneNumberFormat("E164", 0);
            E164 = phoneNumberFormat;
            PhoneNumberFormat phoneNumberFormat2 = new PhoneNumberFormat("INTERNATIONAL", 1);
            INTERNATIONAL = phoneNumberFormat2;
            PhoneNumberFormat phoneNumberFormat3 = new PhoneNumberFormat("NATIONAL", 2);
            NATIONAL = phoneNumberFormat3;
            PhoneNumberFormat phoneNumberFormat4 = new PhoneNumberFormat("RFC3966", 3);
            RFC3966 = phoneNumberFormat4;
            $VALUES = new PhoneNumberFormat[]{phoneNumberFormat, phoneNumberFormat2, phoneNumberFormat3, phoneNumberFormat4};
        }

        public PhoneNumberFormat() {
            throw null;
        }

        public static PhoneNumberFormat valueOf(String str) {
            return (PhoneNumberFormat) Enum.valueOf(PhoneNumberFormat.class, str);
        }

        public static PhoneNumberFormat[] values() {
            return (PhoneNumberFormat[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class PhoneNumberType {
        private static final /* synthetic */ PhoneNumberType[] $VALUES;
        public static final PhoneNumberType FIXED_LINE;
        public static final PhoneNumberType FIXED_LINE_OR_MOBILE;
        public static final PhoneNumberType MOBILE;
        public static final PhoneNumberType PAGER;
        public static final PhoneNumberType PERSONAL_NUMBER;
        public static final PhoneNumberType PREMIUM_RATE;
        public static final PhoneNumberType SHARED_COST;
        public static final PhoneNumberType TOLL_FREE;
        public static final PhoneNumberType UAN;
        public static final PhoneNumberType UNKNOWN;
        public static final PhoneNumberType VOICEMAIL;
        public static final PhoneNumberType VOIP;

        static {
            PhoneNumberType phoneNumberType = new PhoneNumberType("FIXED_LINE", 0);
            FIXED_LINE = phoneNumberType;
            PhoneNumberType phoneNumberType2 = new PhoneNumberType("MOBILE", 1);
            MOBILE = phoneNumberType2;
            PhoneNumberType phoneNumberType3 = new PhoneNumberType("FIXED_LINE_OR_MOBILE", 2);
            FIXED_LINE_OR_MOBILE = phoneNumberType3;
            PhoneNumberType phoneNumberType4 = new PhoneNumberType("TOLL_FREE", 3);
            TOLL_FREE = phoneNumberType4;
            PhoneNumberType phoneNumberType5 = new PhoneNumberType("PREMIUM_RATE", 4);
            PREMIUM_RATE = phoneNumberType5;
            PhoneNumberType phoneNumberType6 = new PhoneNumberType("SHARED_COST", 5);
            SHARED_COST = phoneNumberType6;
            PhoneNumberType phoneNumberType7 = new PhoneNumberType("VOIP", 6);
            VOIP = phoneNumberType7;
            PhoneNumberType phoneNumberType8 = new PhoneNumberType("PERSONAL_NUMBER", 7);
            PERSONAL_NUMBER = phoneNumberType8;
            PhoneNumberType phoneNumberType9 = new PhoneNumberType("PAGER", 8);
            PAGER = phoneNumberType9;
            PhoneNumberType phoneNumberType10 = new PhoneNumberType("UAN", 9);
            UAN = phoneNumberType10;
            PhoneNumberType phoneNumberType11 = new PhoneNumberType("VOICEMAIL", 10);
            VOICEMAIL = phoneNumberType11;
            PhoneNumberType phoneNumberType12 = new PhoneNumberType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 11);
            UNKNOWN = phoneNumberType12;
            $VALUES = new PhoneNumberType[]{phoneNumberType, phoneNumberType2, phoneNumberType3, phoneNumberType4, phoneNumberType5, phoneNumberType6, phoneNumberType7, phoneNumberType8, phoneNumberType9, phoneNumberType10, phoneNumberType11, phoneNumberType12};
        }

        public PhoneNumberType() {
            throw null;
        }

        public static PhoneNumberType valueOf(String str) {
            return (PhoneNumberType) Enum.valueOf(PhoneNumberType.class, str);
        }

        public static PhoneNumberType[] values() {
            return (PhoneNumberType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ValidationResult {
        private static final /* synthetic */ ValidationResult[] $VALUES;
        public static final ValidationResult INVALID_COUNTRY_CODE;
        public static final ValidationResult INVALID_LENGTH;
        public static final ValidationResult IS_POSSIBLE;
        public static final ValidationResult IS_POSSIBLE_LOCAL_ONLY;
        public static final ValidationResult TOO_LONG;
        public static final ValidationResult TOO_SHORT;

        static {
            ValidationResult validationResult = new ValidationResult("IS_POSSIBLE", 0);
            IS_POSSIBLE = validationResult;
            ValidationResult validationResult2 = new ValidationResult("IS_POSSIBLE_LOCAL_ONLY", 1);
            IS_POSSIBLE_LOCAL_ONLY = validationResult2;
            ValidationResult validationResult3 = new ValidationResult("INVALID_COUNTRY_CODE", 2);
            INVALID_COUNTRY_CODE = validationResult3;
            ValidationResult validationResult4 = new ValidationResult("TOO_SHORT", 3);
            TOO_SHORT = validationResult4;
            ValidationResult validationResult5 = new ValidationResult("INVALID_LENGTH", 4);
            INVALID_LENGTH = validationResult5;
            ValidationResult validationResult6 = new ValidationResult("TOO_LONG", 5);
            TOO_LONG = validationResult6;
            $VALUES = new ValidationResult[]{validationResult, validationResult2, validationResult3, validationResult4, validationResult5, validationResult6};
        }

        public ValidationResult() {
            throw null;
        }

        public static ValidationResult valueOf(String str) {
            return (ValidationResult) Enum.valueOf(ValidationResult.class, str);
        }

        public static ValidationResult[] values() {
            return (ValidationResult[]) $VALUES.clone();
        }
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[PhoneNumberType.values().length];
            c = iArr;
            try {
                iArr[PhoneNumberType.PREMIUM_RATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[PhoneNumberType.TOLL_FREE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                c[PhoneNumberType.MOBILE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                c[PhoneNumberType.FIXED_LINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                c[PhoneNumberType.FIXED_LINE_OR_MOBILE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                c[PhoneNumberType.SHARED_COST.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                c[PhoneNumberType.VOIP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                c[PhoneNumberType.PERSONAL_NUMBER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                c[PhoneNumberType.PAGER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                c[PhoneNumberType.UAN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                c[PhoneNumberType.VOICEMAIL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            int[] iArr2 = new int[PhoneNumberFormat.values().length];
            b = iArr2;
            try {
                iArr2[PhoneNumberFormat.E164.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                b[PhoneNumberFormat.INTERNATIONAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                b[PhoneNumberFormat.RFC3966.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                b[PhoneNumberFormat.NATIONAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            int[] iArr3 = new int[Phonenumber$PhoneNumber.CountryCodeSource.values().length];
            a = iArr3;
            try {
                iArr3[Phonenumber$PhoneNumber.CountryCodeSource.FROM_NUMBER_WITH_PLUS_SIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[Phonenumber$PhoneNumber.CountryCodeSource.FROM_NUMBER_WITH_IDD.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[Phonenumber$PhoneNumber.CountryCodeSource.FROM_NUMBER_WITHOUT_PLUS_SIGN.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                a[Phonenumber$PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY.ordinal()] = 4;
            } catch (NoSuchFieldError unused19) {
            }
        }
    }

    static {
        Character valueOf = Character.valueOf(JwtParser.SEPARATOR_CHAR);
        h = Logger.getLogger(PhoneNumberUtil.class.getName());
        HashMap hashMap = new HashMap();
        hashMap.put(54, "9");
        i = Collections.unmodifiableMap(hashMap);
        HashSet hashSet = new HashSet();
        hashSet.add(86);
        j = Collections.unmodifiableSet(hashSet);
        HashSet hashSet2 = new HashSet();
        hashSet2.add(52);
        hashSet2.add(54);
        hashSet2.add(55);
        hashSet2.add(62);
        hashSet2.addAll(hashSet);
        k = Collections.unmodifiableSet(hashSet2);
        HashMap hashMap2 = new HashMap();
        Character valueOf2 = Character.valueOf(ImageSizeKey.SIZE_KEY_UNDEFINED);
        hashMap2.put(valueOf2, valueOf2);
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
        Map<Character, Character> unmodifiableMap = Collections.unmodifiableMap(hashMap3);
        m = unmodifiableMap;
        HashMap hashMap4 = new HashMap(100);
        hashMap4.putAll(unmodifiableMap);
        hashMap4.putAll(hashMap2);
        n = Collections.unmodifiableMap(hashMap4);
        HashMap hashMap5 = new HashMap();
        hashMap5.putAll(hashMap2);
        hashMap5.put('+', '+');
        Character valueOf3 = Character.valueOf(ImageSizeKey.SIZE_KEY_BASE);
        hashMap5.put(valueOf3, valueOf3);
        hashMap5.put('#', '#');
        l = Collections.unmodifiableMap(hashMap5);
        HashMap hashMap6 = new HashMap();
        for (Character ch : unmodifiableMap.keySet()) {
            hashMap6.put(Character.valueOf(Character.toLowerCase(ch.charValue())), ch);
            hashMap6.put(ch, ch);
        }
        hashMap6.putAll(hashMap2);
        hashMap6.put('-', '-');
        hashMap6.put((char) 65293, '-');
        hashMap6.put((char) 8208, '-');
        hashMap6.put((char) 8209, '-');
        hashMap6.put((char) 8210, '-');
        hashMap6.put((char) 8211, '-');
        hashMap6.put((char) 8212, '-');
        hashMap6.put((char) 8213, '-');
        hashMap6.put((char) 8722, '-');
        hashMap6.put('/', '/');
        hashMap6.put((char) 65295, '/');
        hashMap6.put(' ', ' ');
        hashMap6.put((char) 12288, ' ');
        hashMap6.put((char) 8288, ' ');
        hashMap6.put(valueOf, valueOf);
        hashMap6.put((char) 65294, valueOf);
        o = Collections.unmodifiableMap(hashMap6);
        Pattern.compile("[\\d]+(?:[~⁓∼～][\\d]+)?");
        StringBuilder sb = new StringBuilder();
        Map<Character, Character> map = m;
        sb.append(Arrays.toString(map.keySet().toArray()).replaceAll("[, \\[\\]]", ""));
        sb.append(Arrays.toString(map.keySet().toArray()).toLowerCase().replaceAll("[, \\[\\]]", ""));
        String sb2 = sb.toString();
        p = Pattern.compile("[+＋]+");
        Pattern.compile("[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]+");
        q = Pattern.compile("(\\p{Nd})");
        r = Pattern.compile("[+＋\\p{Nd}]");
        s = Pattern.compile("[\\\\/] *x");
        t = Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");
        u = Pattern.compile("(?:.*?[A-Za-z]){3}.*");
        String a2 = zr.a("\\p{Nd}{2}|[+＋]*+(?:[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*]*\\p{Nd}){3,}[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*", sb2, "\\p{Nd}]*");
        String a3 = a(true);
        a(false);
        v = Pattern.compile("^\\+(\\p{Nd}|[\\-\\.\\(\\)]?)*\\p{Nd}(\\p{Nd}|[\\-\\.\\(\\)]?)*$");
        String a4 = fo8.a(sb2, "\\p{Nd}");
        w = Pattern.compile("^(" + ss9.a(X3.j.d, a4, "]+((\\-)*[", a4, "])*") + "\\.)*" + ss9.a(X3.j.d, sb2, "]+((\\-)*[", a4, "])*") + "\\.?$");
        StringBuilder sb3 = new StringBuilder("(?:");
        sb3.append(a3);
        sb3.append(")$");
        x = Pattern.compile(sb3.toString(), 66);
        y = Pattern.compile(a2 + "(?:" + a3 + ")?", 66);
        Pattern.compile("(\\D+)");
        Pattern.compile("(\\$\\d)");
        z = Pattern.compile("\\(?\\$1\\)?");
    }

    public PhoneNumberUtil(fh9 fh9Var, HashMap hashMap) {
        this.a = fh9Var;
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
        String a2 = i5s.a(i5s.b(";ext=" + d(20), HiAnalyticsConstant.REPORT_VAL_SEPARATOR, "[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|доб|anexo)[:\\.．]?[  \\t,-]*" + d(20) + "#?", HiAnalyticsConstant.REPORT_VAL_SEPARATOR, "[  \\t,]*(?:[xｘ#＃~～]|int|ｉｎｔ)[:\\.．]?[  \\t,-]*" + d(9) + "#?"), HiAnalyticsConstant.REPORT_VAL_SEPARATOR, "[- ]+" + d(6) + "#");
        if (!z2) {
            return a2;
        }
        return a2 + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + ("[  \\t]*(?:,{2}|;)[:\\.．]?[  \\t,-]*" + d(15) + "#?") + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + ("[  \\t]*(?:,)+[:\\.．]?[  \\t,-]*" + d(9) + "#?");
    }

    public static PhoneNumberUtil b(Context context) {
        if (context != null) {
            return c(new g6o0(context.getAssets()));
        }
        throw new IllegalArgumentException("context could not be null.");
    }

    public static PhoneNumberUtil c(ti20 ti20Var) {
        qil qilVar = new qil(ti20Var);
        return new PhoneNumberUtil(new fh9(qilVar.b, ti20Var, qilVar.a), sni.h());
    }

    public static String d(int i2) {
        return tgw.b(i2, "(\\p{Nd}{1,", "})");
    }

    public static String h(Phonenumber$PhoneNumber phonenumber$PhoneNumber) {
        StringBuilder sb = new StringBuilder();
        if (phonenumber$PhoneNumber.k() && phonenumber$PhoneNumber.i() > 0) {
            char[] cArr = new char[phonenumber$PhoneNumber.i()];
            Arrays.fill(cArr, ImageSizeKey.SIZE_KEY_UNDEFINED);
            sb.append(new String(cArr));
        }
        sb.append(phonenumber$PhoneNumber.h());
        return sb.toString();
    }

    public static Phonemetadata$PhoneNumberDesc i(Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata, PhoneNumberType phoneNumberType) {
        switch (a.c[phoneNumberType.ordinal()]) {
            case 1:
                return phonemetadata$PhoneMetadata.t();
            case 2:
                return phonemetadata$PhoneMetadata.w();
            case 3:
                return phonemetadata$PhoneMetadata.n();
            case 4:
            case 5:
                return phonemetadata$PhoneMetadata.g();
            case 6:
                return phonemetadata$PhoneMetadata.v();
            case 7:
                return phonemetadata$PhoneMetadata.z();
            case 8:
                return phonemetadata$PhoneMetadata.s();
            case 9:
                return phonemetadata$PhoneMetadata.r();
            case 10:
                return phonemetadata$PhoneMetadata.x();
            case 11:
                return phonemetadata$PhoneMetadata.y();
            default:
                return phonemetadata$PhoneMetadata.h();
        }
    }

    public static void p(StringBuilder sb) {
        if (u.matcher(sb).matches()) {
            sb.replace(0, sb.length(), r(sb, n));
        } else {
            sb.replace(0, sb.length(), q(sb));
        }
    }

    public static String q(CharSequence charSequence) {
        StringBuilder sb = new StringBuilder(charSequence.length());
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            int digit = Character.digit(charSequence.charAt(i2), 10);
            if (digit != -1) {
                sb.append(digit);
            }
        }
        return sb.toString();
    }

    public static String r(CharSequence charSequence, Map map) {
        StringBuilder sb = new StringBuilder(charSequence.length());
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            Character ch = (Character) map.get(Character.valueOf(Character.toUpperCase(charSequence.charAt(i2))));
            if (ch != null) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static ValidationResult t(StringBuilder sb, Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata, PhoneNumberType phoneNumberType) {
        Phonemetadata$PhoneNumberDesc i2 = i(phonemetadata$PhoneMetadata, phoneNumberType);
        List<Integer> i3 = i2.i().isEmpty() ? phonemetadata$PhoneMetadata.h().i() : i2.i();
        List<Integer> j2 = i2.j();
        if (phoneNumberType == PhoneNumberType.FIXED_LINE_OR_MOBILE) {
            Phonemetadata$PhoneNumberDesc i4 = i(phonemetadata$PhoneMetadata, PhoneNumberType.FIXED_LINE);
            if (i4.h() == 1 && i4.g() == -1) {
                return t(sb, phonemetadata$PhoneMetadata, PhoneNumberType.MOBILE);
            }
            Phonemetadata$PhoneNumberDesc i5 = i(phonemetadata$PhoneMetadata, PhoneNumberType.MOBILE);
            if (i5.h() != 1 || i5.g() != -1) {
                ArrayList arrayList = new ArrayList(i3);
                arrayList.addAll(i5.h() == 0 ? phonemetadata$PhoneMetadata.h().i() : i5.i());
                Collections.sort(arrayList);
                if (j2.isEmpty()) {
                    j2 = i5.j();
                } else {
                    ArrayList arrayList2 = new ArrayList(j2);
                    arrayList2.addAll(i5.j());
                    Collections.sort(arrayList2);
                    j2 = arrayList2;
                }
                i3 = arrayList;
            }
        }
        if (i3.get(0).intValue() == -1) {
            return ValidationResult.INVALID_LENGTH;
        }
        int length = sb.length();
        if (j2.contains(Integer.valueOf(length))) {
            return ValidationResult.IS_POSSIBLE_LOCAL_ONLY;
        }
        int intValue = i3.get(0).intValue();
        return intValue == length ? ValidationResult.IS_POSSIBLE : intValue > length ? ValidationResult.TOO_SHORT : ((Integer) ji.a(1, i3)).intValue() < length ? ValidationResult.TOO_LONG : i3.subList(1, i3.size()).contains(Integer.valueOf(length)) ? ValidationResult.IS_POSSIBLE : ValidationResult.INVALID_LENGTH;
    }

    public final int e(StringBuilder sb, StringBuilder sb2) {
        if (sb.length() != 0 && sb.charAt(0) != '0') {
            int length = sb.length();
            for (int i2 = 1; i2 <= 3 && i2 <= length; i2++) {
                int parseInt = Integer.parseInt(sb.substring(0, i2));
                if (this.b.containsKey(Integer.valueOf(parseInt))) {
                    sb2.append(sb.substring(i2));
                    return parseInt;
                }
            }
        }
        return 0;
    }

    public final Phonemetadata$PhoneMetadata f(int i2) {
        if (!this.g.contains(Integer.valueOf(i2))) {
            return null;
        }
        fh9 fh9Var = this.a;
        fh9Var.getClass();
        List list = (List) sni.h().get(Integer.valueOf(i2));
        if (list != null && !list.contains("001")) {
            throw new IllegalArgumentException(l6g.a(i2, " calling code belongs to a geo entity"));
        }
        sj00<Integer> sj00Var = ((rti) ((uf7) fh9Var.c).a(((e540) ((i3a0) fh9Var.b)).a(Integer.valueOf(i2)))).a;
        Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata = (Phonemetadata$PhoneMetadata) sj00Var.a.get(Integer.valueOf(i2));
        String a2 = lhg.a(i2, "Missing metadata for country code ");
        if (phonemetadata$PhoneMetadata != null) {
            return phonemetadata$PhoneMetadata;
        }
        throw new MissingMetadataException(a2);
    }

    public final Phonemetadata$PhoneMetadata g(String str) {
        if (str == null || !this.f.contains(str)) {
            return null;
        }
        fh9 fh9Var = this.a;
        fh9Var.getClass();
        if (str.equals("001")) {
            throw new IllegalArgumentException(str.concat(" region code is a non-geo entity"));
        }
        Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata = (Phonemetadata$PhoneMetadata) ((rti) ((uf7) fh9Var.c).a(((e540) ((i3a0) fh9Var.b)).a(str))).b.a.get(str);
        String concat = "Missing metadata for region code ".concat(str);
        if (phonemetadata$PhoneMetadata != null) {
            return phonemetadata$PhoneMetadata;
        }
        throw new MissingMetadataException(concat);
    }

    public final PhoneNumberType j(String str, Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata) {
        return !l(str, phonemetadata$PhoneMetadata.h()) ? PhoneNumberType.UNKNOWN : l(str, phonemetadata$PhoneMetadata.t()) ? PhoneNumberType.PREMIUM_RATE : l(str, phonemetadata$PhoneMetadata.w()) ? PhoneNumberType.TOLL_FREE : l(str, phonemetadata$PhoneMetadata.v()) ? PhoneNumberType.SHARED_COST : l(str, phonemetadata$PhoneMetadata.z()) ? PhoneNumberType.VOIP : l(str, phonemetadata$PhoneMetadata.s()) ? PhoneNumberType.PERSONAL_NUMBER : l(str, phonemetadata$PhoneMetadata.r()) ? PhoneNumberType.PAGER : l(str, phonemetadata$PhoneMetadata.x()) ? PhoneNumberType.UAN : l(str, phonemetadata$PhoneMetadata.y()) ? PhoneNumberType.VOICEMAIL : l(str, phonemetadata$PhoneMetadata.g()) ? phonemetadata$PhoneMetadata.u() ? PhoneNumberType.FIXED_LINE_OR_MOBILE : l(str, phonemetadata$PhoneMetadata.n()) ? PhoneNumberType.FIXED_LINE_OR_MOBILE : PhoneNumberType.FIXED_LINE : (phonemetadata$PhoneMetadata.u() || !l(str, phonemetadata$PhoneMetadata.n())) ? PhoneNumberType.UNKNOWN : PhoneNumberType.MOBILE;
    }

    public final String k(int i2) {
        List list = (List) this.b.get(Integer.valueOf(i2));
        return list == null ? "ZZ" : (String) list.get(0);
    }

    public final boolean l(String str, Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc) {
        int length = str.length();
        List<Integer> i2 = phonemetadata$PhoneNumberDesc.i();
        if (i2.size() <= 0 || i2.contains(Integer.valueOf(length))) {
            return this.c.b(str, phonemetadata$PhoneNumberDesc);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a1, code lost:
    
        if (r0 != r1.d()) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m(Phonenumber$PhoneNumber phonenumber$PhoneNumber) {
        int g = phonenumber$PhoneNumber.g();
        List<String> list = (List) this.b.get(Integer.valueOf(g));
        String str = null;
        if (list != null) {
            if (list.size() != 1) {
                String h2 = h(phonenumber$PhoneNumber);
                for (String str2 : list) {
                    Phonemetadata$PhoneMetadata g2 = g(str2);
                    if (!g2.A()) {
                        if (j(h2, g2) != PhoneNumberType.UNKNOWN) {
                            str = str2;
                            break;
                        }
                    } else {
                        if (this.e.a(g2.m()).matcher(h2).lookingAt()) {
                            str = str2;
                            break;
                        }
                    }
                }
            } else {
                str = (String) list.get(0);
            }
        } else {
            h.log(Level.INFO, "Missing/invalid country_code (" + g + ")");
        }
        int g3 = phonenumber$PhoneNumber.g();
        Phonemetadata$PhoneMetadata f = "001".equals(str) ? f(g3) : g(str);
        if (f != null) {
            if (!"001".equals(str)) {
                Phonemetadata$PhoneMetadata g4 = g(str);
                if (g4 == null) {
                    throw new IllegalArgumentException(go9.b("Invalid region code: ", str));
                }
            }
            if (j(h(phonenumber$PhoneNumber), f) != PhoneNumberType.UNKNOWN) {
                return true;
            }
        }
        return false;
    }

    public final int n(CharSequence charSequence, Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata, StringBuilder sb, boolean z2, Phonenumber$PhoneNumber phonenumber$PhoneNumber) throws NumberParseException {
        Phonenumber$PhoneNumber.CountryCodeSource countryCodeSource;
        if (charSequence.length() == 0) {
            return 0;
        }
        StringBuilder sb2 = new StringBuilder(charSequence);
        String j2 = phonemetadata$PhoneMetadata != null ? phonemetadata$PhoneMetadata.j() : "NonMatch";
        if (sb2.length() == 0) {
            countryCodeSource = Phonenumber$PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY;
        } else {
            Matcher matcher = p.matcher(sb2);
            if (matcher.lookingAt()) {
                sb2.delete(0, matcher.end());
                p(sb2);
                countryCodeSource = Phonenumber$PhoneNumber.CountryCodeSource.FROM_NUMBER_WITH_PLUS_SIGN;
            } else {
                Pattern a2 = this.e.a(j2);
                p(sb2);
                Matcher matcher2 = a2.matcher(sb2);
                if (matcher2.lookingAt()) {
                    int end = matcher2.end();
                    Matcher matcher3 = q.matcher(sb2.substring(end));
                    if (!matcher3.find() || !q(matcher3.group(1)).equals("0")) {
                        sb2.delete(0, end);
                        countryCodeSource = Phonenumber$PhoneNumber.CountryCodeSource.FROM_NUMBER_WITH_IDD;
                    }
                }
                countryCodeSource = Phonenumber$PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY;
            }
        }
        if (z2) {
            phonenumber$PhoneNumber.m(countryCodeSource);
        }
        if (countryCodeSource != Phonenumber$PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY) {
            if (sb2.length() <= 2) {
                throw new NumberParseException(NumberParseException.ErrorType.TOO_SHORT_AFTER_IDD, "Phone number had an IDD, but after this was not long enough to be a viable phone number.");
            }
            int e = e(sb2, sb);
            if (e == 0) {
                throw new NumberParseException(NumberParseException.ErrorType.INVALID_COUNTRY_CODE, "Country calling code supplied was not recognised.");
            }
            phonenumber$PhoneNumber.l(e);
            return e;
        }
        if (phonemetadata$PhoneMetadata != null) {
            int d = phonemetadata$PhoneMetadata.d();
            String valueOf = String.valueOf(d);
            String sb3 = sb2.toString();
            if (sb3.startsWith(valueOf)) {
                StringBuilder sb4 = new StringBuilder(sb3.substring(valueOf.length()));
                Phonemetadata$PhoneNumberDesc h2 = phonemetadata$PhoneMetadata.h();
                o(sb4, phonemetadata$PhoneMetadata, null);
                eo9 eo9Var = this.c;
                if ((!eo9Var.b(sb2, h2) && eo9Var.b(sb4, h2)) || t(sb2, phonemetadata$PhoneMetadata, PhoneNumberType.UNKNOWN) == ValidationResult.TOO_LONG) {
                    sb.append((CharSequence) sb4);
                    if (z2) {
                        phonenumber$PhoneNumber.m(Phonenumber$PhoneNumber.CountryCodeSource.FROM_NUMBER_WITHOUT_PLUS_SIGN);
                    }
                    phonenumber$PhoneNumber.l(d);
                    return d;
                }
            }
        }
        phonenumber$PhoneNumber.l(0);
        return 0;
    }

    public final void o(StringBuilder sb, Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata, StringBuilder sb2) {
        int length = sb.length();
        String o2 = phonemetadata$PhoneMetadata.o();
        if (length == 0 || o2.length() == 0) {
            return;
        }
        Matcher matcher = this.e.a(o2).matcher(sb);
        if (matcher.lookingAt()) {
            Phonemetadata$PhoneNumberDesc h2 = phonemetadata$PhoneMetadata.h();
            eo9 eo9Var = this.c;
            boolean b = eo9Var.b(sb, h2);
            int groupCount = matcher.groupCount();
            String p2 = phonemetadata$PhoneMetadata.p();
            if (p2 == null || p2.length() == 0 || matcher.group(groupCount) == null) {
                if (!b || eo9Var.b(sb.substring(matcher.end()), h2)) {
                    if (sb2 != null && groupCount > 0 && matcher.group(groupCount) != null) {
                        sb2.append(matcher.group(1));
                    }
                    sb.delete(0, matcher.end());
                    return;
                }
                return;
            }
            StringBuilder sb3 = new StringBuilder(sb);
            sb3.replace(0, length, matcher.replaceFirst(p2));
            if (!b || eo9Var.b(sb3.toString(), h2)) {
                if (sb2 != null && groupCount > 1) {
                    sb2.append(matcher.group(1));
                }
                sb.replace(0, sb.length(), sb3.toString());
            }
        }
    }

    public final void s(CharSequence charSequence, String str, boolean z2, Phonenumber$PhoneNumber phonenumber$PhoneNumber) throws NumberParseException {
        String substring;
        CharSequence charSequence2;
        StringBuilder sb;
        Phonenumber$PhoneNumber phonenumber$PhoneNumber2;
        int n2;
        if (charSequence == null) {
            throw new NumberParseException(NumberParseException.ErrorType.NOT_A_NUMBER, "The phone number supplied was null.");
        }
        if (charSequence.length() > 250) {
            throw new NumberParseException(NumberParseException.ErrorType.TOO_LONG, "The string supplied was too long to parse.");
        }
        StringBuilder sb2 = new StringBuilder();
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
        if (substring != null && (substring.length() == 0 || !(v.matcher(substring).matches() || w.matcher(substring).matches()))) {
            throw new NumberParseException(NumberParseException.ErrorType.NOT_A_NUMBER, "The phone-context value is invalid.");
        }
        if (substring != null) {
            if (substring.charAt(0) == '+') {
                sb2.append(substring);
            }
            int indexOf3 = charSequence3.indexOf("tel:");
            sb2.append(charSequence3.substring(indexOf3 >= 0 ? indexOf3 + 4 : 0, indexOf));
        } else {
            Matcher matcher = r.matcher(charSequence3);
            if (matcher.find()) {
                charSequence2 = charSequence3.subSequence(matcher.start(), charSequence3.length());
                Matcher matcher2 = t.matcher(charSequence2);
                if (matcher2.find()) {
                    charSequence2 = charSequence2.subSequence(0, matcher2.start());
                }
                Matcher matcher3 = s.matcher(charSequence2);
                if (matcher3.find()) {
                    charSequence2 = charSequence2.subSequence(0, matcher3.start());
                }
            } else {
                charSequence2 = "";
            }
            sb2.append(charSequence2);
        }
        int indexOf4 = sb2.indexOf(";isub=");
        if (indexOf4 > 0) {
            sb2.delete(indexOf4, sb2.length());
        }
        int length = sb2.length();
        Pattern pattern = y;
        if (!(length < 2 ? false : pattern.matcher(sb2).matches())) {
            throw new NumberParseException(NumberParseException.ErrorType.NOT_A_NUMBER, "The string supplied did not seem to be a phone number.");
        }
        boolean z3 = str != null && this.f.contains(str);
        Pattern pattern2 = p;
        if (!z3 && (sb2.length() == 0 || !pattern2.matcher(sb2).lookingAt())) {
            throw new NumberParseException(NumberParseException.ErrorType.INVALID_COUNTRY_CODE, "Missing or invalid default region.");
        }
        if (z2) {
            phonenumber$PhoneNumber.s(charSequence3);
        }
        Matcher matcher4 = x.matcher(sb2);
        if (matcher4.find()) {
            String substring2 = sb2.substring(0, matcher4.start());
            if (substring2.length() < 2 ? false : pattern.matcher(substring2).matches()) {
                int groupCount = matcher4.groupCount();
                int i3 = 1;
                while (true) {
                    if (i3 > groupCount) {
                        break;
                    }
                    if (matcher4.group(i3) != null) {
                        str2 = matcher4.group(i3);
                        sb2.delete(matcher4.start(), sb2.length());
                        break;
                    }
                    i3++;
                }
            }
        }
        if (str2.length() > 0) {
            phonenumber$PhoneNumber.n(str2);
        }
        Phonemetadata$PhoneMetadata g = g(str);
        StringBuilder sb3 = new StringBuilder();
        try {
            n2 = n(sb2, g, sb3, z2, phonenumber$PhoneNumber);
            sb = sb2;
            phonenumber$PhoneNumber2 = phonenumber$PhoneNumber;
        } catch (NumberParseException e) {
            sb = sb2;
            Matcher matcher5 = pattern2.matcher(sb);
            if (e.d() != NumberParseException.ErrorType.INVALID_COUNTRY_CODE || !matcher5.lookingAt()) {
                throw new NumberParseException(e.d(), e.getMessage());
            }
            phonenumber$PhoneNumber2 = phonenumber$PhoneNumber;
            n2 = n(sb.substring(matcher5.end()), g, sb3, z2, phonenumber$PhoneNumber2);
            if (n2 == 0) {
                throw new NumberParseException(NumberParseException.ErrorType.INVALID_COUNTRY_CODE, "Could not interpret numbers after plus-sign.");
            }
        }
        if (n2 != 0) {
            String k2 = k(n2);
            if (!k2.equals(str)) {
                g = "001".equals(k2) ? f(n2) : g(k2);
            }
        } else {
            p(sb);
            sb3.append((CharSequence) sb);
            if (str != null) {
                phonenumber$PhoneNumber2.l(g.d());
            } else if (z2) {
                phonenumber$PhoneNumber2.d();
            }
        }
        if (sb3.length() < 2) {
            throw new NumberParseException(NumberParseException.ErrorType.TOO_SHORT_NSN, "The string supplied is too short to be a phone number.");
        }
        if (g != null) {
            StringBuilder sb4 = new StringBuilder();
            StringBuilder sb5 = new StringBuilder(sb3);
            o(sb5, g, sb4);
            ValidationResult t2 = t(sb5, g, PhoneNumberType.UNKNOWN);
            if (t2 != ValidationResult.TOO_SHORT && t2 != ValidationResult.IS_POSSIBLE_LOCAL_ONLY && t2 != ValidationResult.INVALID_LENGTH) {
                if (z2 && sb4.length() > 0) {
                    phonenumber$PhoneNumber2.r(sb4.toString());
                }
                sb3 = sb5;
            }
        }
        int length2 = sb3.length();
        if (length2 < 2) {
            throw new NumberParseException(NumberParseException.ErrorType.TOO_SHORT_NSN, "The string supplied is too short to be a phone number.");
        }
        if (length2 > 17) {
            throw new NumberParseException(NumberParseException.ErrorType.TOO_LONG, "The string supplied is too long to be a phone number.");
        }
        if (sb3.length() > 1 && sb3.charAt(0) == '0') {
            phonenumber$PhoneNumber2.o();
            int i4 = 1;
            while (i4 < sb3.length() - 1 && sb3.charAt(i4) == '0') {
                i4++;
            }
            if (i4 != 1) {
                phonenumber$PhoneNumber2.q(i4);
            }
        }
        phonenumber$PhoneNumber2.p(Long.parseLong(sb3.toString()));
    }
}
