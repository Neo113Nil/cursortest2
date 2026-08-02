package defpackage;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.navigation.FlexRouteHandlerImpl;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes11.dex */
public final class a791 implements Iterable, r691 {
    public final String a;

    public a791(String str) {
        if (str != null) {
            this.a = str;
        } else {
            ny61.g("StringValue cannot be null.");
            throw null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02e2, code lost:
    
        if (r4[r1].isEmpty() == false) goto L104;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.r691
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r691 b(String str, cr71 cr71Var, ArrayList arrayList) {
        String str2;
        String str3;
        int i;
        int i2;
        int i3;
        cr71 cr71Var2;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || FlexRouteHandlerImpl.FLEX_CUSTOM_PROPS_REPLACE.equals(str) || "search".equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str) || "toLocaleUpperCase".equals(str)) {
            str2 = "hasOwnProperty";
            str3 = "trim";
        } else {
            str2 = "hasOwnProperty";
            str3 = "trim";
            if (!str3.equals(str)) {
                ny61.g(str.concat(" is not a String function"));
                return null;
            }
        }
        int hashCode = str.hashCode();
        String str4 = StringUtils.UNDEFINED;
        String str5 = this.a;
        r8 = false;
        boolean z = false;
        switch (hashCode) {
            case -1789698943:
                String str6 = str2;
                if (str.equals(str6)) {
                    cwa1.e(1, str6, arrayList);
                    r691 b = ((p791) cr71Var.c).b(cr71Var, (r691) arrayList.get(0));
                    boolean equals = "length".equals(b.zzc());
                    b591 b591Var = r691.E5;
                    if (equals) {
                        return b591Var;
                    }
                    double doubleValue = b.zzd().doubleValue();
                    return (doubleValue != Math.floor(doubleValue) || (i = (int) doubleValue) < 0 || i >= str5.length()) ? r691.F5 : b591Var;
                }
                ny61.g("Command not supported");
                return null;
            case -1776922004:
                if (str.equals("toString")) {
                    cwa1.e(0, "toString", arrayList);
                    return this;
                }
                ny61.g("Command not supported");
                return null;
            case -1464939364:
                if (str.equals("toLocaleLowerCase")) {
                    cwa1.e(0, "toLocaleLowerCase", arrayList);
                    return new a791(str5.toLowerCase());
                }
                ny61.g("Command not supported");
                return null;
            case -1361633751:
                if (str.equals("charAt")) {
                    cwa1.g(1, "charAt", arrayList);
                    int l = arrayList.isEmpty() ? 0 : (int) cwa1.l(((p791) cr71Var.c).b(cr71Var, (r691) arrayList.get(0)).zzd().doubleValue());
                    return (l < 0 || l >= str5.length()) ? r691.G5 : new a791(String.valueOf(str5.charAt(l)));
                }
                ny61.g("Command not supported");
                return null;
            case -1354795244:
                if (str.equals("concat")) {
                    if (!arrayList.isEmpty()) {
                        StringBuilder sb = new StringBuilder(str5);
                        for (int i4 = 0; i4 < arrayList.size(); i4++) {
                            sb.append(((p791) cr71Var.c).b(cr71Var, (r691) arrayList.get(i4)).zzc());
                        }
                        return new a791(sb.toString());
                    }
                    return this;
                }
                ny61.g("Command not supported");
                return null;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    cwa1.e(0, "toLowerCase", arrayList);
                    return new a791(str5.toLowerCase(Locale.ENGLISH));
                }
                ny61.g("Command not supported");
                return null;
            case -906336856:
                if (str.equals("search")) {
                    cwa1.g(1, "search", arrayList);
                    if (!arrayList.isEmpty()) {
                        str4 = ((p791) cr71Var.c).b(cr71Var, (r691) arrayList.get(0)).zzc();
                    }
                    return Pattern.compile(str4).matcher(str5).find() ? new n591(Double.valueOf(r0.start())) : new n591(Double.valueOf(-1.0d));
                }
                ny61.g("Command not supported");
                return null;
            case -726908483:
                if (str.equals("toLocaleUpperCase")) {
                    cwa1.e(0, "toLocaleUpperCase", arrayList);
                    return new a791(str5.toUpperCase());
                }
                ny61.g("Command not supported");
                return null;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    cwa1.g(2, "lastIndexOf", arrayList);
                    if (arrayList.size() > 0) {
                        str4 = ((p791) cr71Var.c).b(cr71Var, (r691) arrayList.get(0)).zzc();
                    }
                    String str7 = str4;
                    return new n591(Double.valueOf(str5.lastIndexOf(str7, (int) (Double.isNaN(arrayList.size() < 2 ? Double.NaN : ((p791) cr71Var.c).b(cr71Var, (r691) arrayList.get(1)).zzd().doubleValue()) ? Double.POSITIVE_INFINITY : cwa1.l(r1)))));
                }
                ny61.g("Command not supported");
                return null;
            case -399551817:
                if (str.equals("toUpperCase")) {
                    cwa1.e(0, "toUpperCase", arrayList);
                    return new a791(str5.toUpperCase(Locale.ENGLISH));
                }
                ny61.g("Command not supported");
                return null;
            case 3568674:
                if (str.equals(str3)) {
                    cwa1.e(0, "toUpperCase", arrayList);
                    return new a791(str5.trim());
                }
                ny61.g("Command not supported");
                return null;
            case 103668165:
                if (str.equals("match")) {
                    cwa1.g(1, "match", arrayList);
                    Matcher matcher = Pattern.compile(arrayList.size() <= 0 ? "" : ((p791) cr71Var.c).b(cr71Var, (r691) arrayList.get(0)).zzc()).matcher(str5);
                    return matcher.find() ? new w491(Arrays.asList(new a791(matcher.group()))) : r691.A5;
                }
                ny61.g("Command not supported");
                return null;
            case 109526418:
                if (str.equals("slice")) {
                    cwa1.g(2, "slice", arrayList);
                    double l2 = cwa1.l(!arrayList.isEmpty() ? ((p791) cr71Var.c).b(cr71Var, (r691) arrayList.get(0)).zzd().doubleValue() : 0.0d);
                    double max = l2 < 0.0d ? Math.max(str5.length() + l2, 0.0d) : Math.min(l2, str5.length());
                    double l3 = cwa1.l(arrayList.size() > 1 ? ((p791) cr71Var.c).b(cr71Var, (r691) arrayList.get(1)).zzd().doubleValue() : str5.length());
                    int i5 = (int) max;
                    return new a791(str5.substring(i5, Math.max(0, ((int) (l3 < 0.0d ? Math.max(str5.length() + l3, 0.0d) : Math.min(l3, str5.length()))) - i5) + i5));
                }
                ny61.g("Command not supported");
                return null;
            case 109648666:
                if (str.equals("split")) {
                    cwa1.g(2, "split", arrayList);
                    if (str5.length() == 0) {
                        return new w491(Arrays.asList(this));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    if (arrayList.isEmpty()) {
                        arrayList2.add(this);
                    } else {
                        String zzc = ((p791) cr71Var.c).b(cr71Var, (r691) arrayList.get(0)).zzc();
                        long k = arrayList.size() > 1 ? cwa1.k(((p791) cr71Var.c).b(cr71Var, (r691) arrayList.get(1)).zzd().doubleValue()) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD : 2147483647L;
                        if (k == 0) {
                            return new w491();
                        }
                        String[] split = str5.split(Pattern.quote(zzc), ((int) k) + 1);
                        int length = split.length;
                        if (zzc.isEmpty() && length > 0) {
                            boolean isEmpty = split[0].isEmpty();
                            i2 = length - 1;
                            i3 = isEmpty;
                            z = isEmpty;
                            break;
                        }
                        i2 = length;
                        i3 = z;
                        if (length > k) {
                            i2--;
                        }
                        while (i3 < i2) {
                            arrayList2.add(new a791(split[i3]));
                            i3++;
                        }
                    }
                    return new w491(arrayList2);
                }
                ny61.g("Command not supported");
                return null;
            case 530542161:
                if (str.equals("substring")) {
                    cwa1.g(2, "substring", arrayList);
                    int l4 = !arrayList.isEmpty() ? (int) cwa1.l(((p791) cr71Var.c).b(cr71Var, (r691) arrayList.get(0)).zzd().doubleValue()) : 0;
                    int l5 = arrayList.size() > 1 ? (int) cwa1.l(((p791) cr71Var.c).b(cr71Var, (r691) arrayList.get(1)).zzd().doubleValue()) : str5.length();
                    int min = Math.min(Math.max(l4, 0), str5.length());
                    int min2 = Math.min(Math.max(l5, 0), str5.length());
                    return new a791(str5.substring(Math.min(min, min2), Math.max(min, min2)));
                }
                ny61.g("Command not supported");
                return null;
            case 1094496948:
                if (str.equals(FlexRouteHandlerImpl.FLEX_CUSTOM_PROPS_REPLACE)) {
                    cwa1.g(2, FlexRouteHandlerImpl.FLEX_CUSTOM_PROPS_REPLACE, arrayList);
                    boolean isEmpty2 = arrayList.isEmpty();
                    r691 r691Var = r691.z5;
                    if (!isEmpty2) {
                        str4 = ((p791) cr71Var.c).b(cr71Var, (r691) arrayList.get(0)).zzc();
                        if (arrayList.size() > 1) {
                            r691Var = ((p791) cr71Var.c).b(cr71Var, (r691) arrayList.get(1));
                        }
                    }
                    String str8 = str4;
                    int indexOf = str5.indexOf(str8);
                    if (indexOf >= 0) {
                        if (r691Var instanceof s591) {
                            r691Var = ((s591) r691Var).c(cr71Var, Arrays.asList(new a791(str8), new n591(Double.valueOf(indexOf)), this));
                        }
                        String substring = str5.substring(0, indexOf);
                        String zzc2 = r691Var.zzc();
                        String substring2 = str5.substring(str8.length() + indexOf);
                        return new a791(unr0.r(new StringBuilder(substring.length() + String.valueOf(zzc2).length() + substring2.length()), substring, zzc2, substring2));
                    }
                    return this;
                }
                ny61.g("Command not supported");
                return null;
            case 1943291465:
                if (str.equals("indexOf")) {
                    cwa1.g(2, "indexOf", arrayList);
                    if (arrayList.size() <= 0) {
                        cr71Var2 = cr71Var;
                    } else {
                        cr71Var2 = cr71Var;
                        str4 = ((p791) cr71Var2.c).b(cr71Var2, (r691) arrayList.get(0)).zzc();
                    }
                    return new n591(Double.valueOf(str5.indexOf(str4, (int) cwa1.l(arrayList.size() < 2 ? 0.0d : ((p791) cr71Var2.c).b(cr71Var2, (r691) arrayList.get(1)).zzd().doubleValue()))));
                }
                ny61.g("Command not supported");
                return null;
            default:
                ny61.g("Command not supported");
                return null;
        }
    }

    @Override // defpackage.r691
    public final r691 e() {
        return new a791(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a791) {
            return this.a.equals(((a791) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new v691(1, this);
    }

    public final String toString() {
        String str = this.a;
        return unr0.r(new StringBuilder(str.length() + 2), "\"", str, "\"");
    }

    @Override // defpackage.r691
    public final String zzc() {
        return this.a;
    }

    @Override // defpackage.r691
    public final Double zzd() {
        String str = this.a;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // defpackage.r691
    public final Boolean zze() {
        return Boolean.valueOf(!this.a.isEmpty());
    }

    @Override // defpackage.r691
    public final Iterator zzf() {
        return new v691(0, this);
    }
}
