package xsna;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.SSLException;

/* loaded from: classes13.dex */
public final class vey0 {
    public static final Pattern a = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");
    public static final String[] b;

    static {
        String[] strArr = {CampaignEx.KEY_ACTIVITY_PATH_AND_NAME, "co", "com", "ed", "edu", "go", "gouv", "gov", "info", "lg", "ne", "net", "or", "org"};
        b = strArr;
        Arrays.sort(strArr);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:0|1|(2:(2:115|(6:117|(2:119|(1:(1:185)(3:124|(2:125|(2:183|184)(15:127|(1:(1:163)(2:(1:(2:133|134)(2:160|136))(2:161|162)|135))(3:164|(2:165|(2:167|(1:169)(1:170))(1:182))|(1:1)(2:178|135))|4|(1:6)(1:114)|7|8|9|(3:11|(4:14|(3:20|21|22)(3:16|17|18)|19|12)|23)|24|(1:26)|27|(1:110)(2:31|(1:33))|(3:35|(3:37|(2:39|40)(1:42)|41)|43)|44|(4:46|(9:49|(1:51)|52|(1:106)(5:56|(2:60|(1:62))|105|75|(3:77|(7:79|(4:82|(2:84|85)(1:87)|86|80)|88|89|(4:92|(2:94|95)(1:97)|96|90)|98|(2:100|101)(2:102|103))(1:104)|(1:68)(1:74)))|64|65|66|(0)(0)|47)|107|(1:70)(2:72|73))(2:108|109)))|137))(2:186|(5:188|(2:189|(1:1)(1:(3:205|206|(2:207|(1:211)(2:212|226)))(3:196|(2:200|201)|202)))|228|213|(2:223|224)(4:217|(1:219)|220|221))(3:232|233|234)))(2:235|(2:236|(2:238|(4:247|248|(2:249|(1:1)(1:253))|255)(3:240|(2:242|243)(2:245|246)|244))(3:257|258|259)))|138|(3:140|(1:142)|143)|144|(15:159|4|(0)(0)|7|8|9|(0)|24|(0)|27|(1:29)|110|(0)|44|(0)(0))(2:146|(1:153)(3:150|151|152)))(1:260))|158)|3|4|(0)(0)|7|8|9|(0)|24|(0)|27|(0)|110|(0)|44|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x022f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0230, code lost:
    
        android.util.Log.e(xsna.n34.b(""), "Error parsing certificate.", r0);
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0321, code lost:
    
        if (java.util.Arrays.binarySearch(xsna.vey0.b, r4.substring(2, r6)) < 0) goto L176;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0376 A[EDGE_INSN: B:68:0x0376->B:69:0x0376 BREAK  A[LOOP:2: B:47:0x02c7->B:74:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[LOOP:2: B:47:0x02c7->B:74:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(String str, X509Certificate x509Certificate) throws SSLException {
        int i;
        int i2;
        String str2;
        int i3;
        char[] cArr;
        char c;
        char[] cArr2;
        int i4;
        char c2;
        String[] strArr;
        String[] strArr2;
        LinkedList linkedList;
        Collection<List<?>> collection;
        LinkedList linkedList2;
        int i5;
        f9y0 f9y0Var = new f9y0(x509Certificate.getSubjectX500Principal());
        f9y0Var.c = 0;
        f9y0Var.d = 0;
        f9y0Var.e = 0;
        f9y0Var.f = 0;
        String str3 = f9y0Var.a;
        f9y0Var.g = str3.toCharArray();
        List list = Collections.EMPTY_LIST;
        String c3 = f9y0Var.c();
        if (c3 != null) {
            do {
                int i6 = f9y0Var.c;
                int i7 = f9y0Var.b;
                if (i6 < i7) {
                    char c4 = f9y0Var.g[i6];
                    char c5 = '\\';
                    i = 1;
                    i2 = 2;
                    char c6 = '+';
                    if (c4 == '\"') {
                        int i8 = i6 + 1;
                        f9y0Var.c = i8;
                        f9y0Var.d = i8;
                        f9y0Var.e = i8;
                        while (true) {
                            int i9 = f9y0Var.c;
                            if (i9 == i7) {
                                throw new IllegalStateException("Unexpected end of DN: ".concat(str3));
                            }
                            char[] cArr3 = f9y0Var.g;
                            char c7 = cArr3[i9];
                            if (c7 == '\"') {
                                f9y0Var.c = i9 + 1;
                                while (true) {
                                    int i10 = f9y0Var.c;
                                    if (i10 >= i7 || f9y0Var.g[i10] != ' ') {
                                        break;
                                    } else {
                                        f9y0Var.c = i10 + 1;
                                    }
                                }
                                char[] cArr4 = f9y0Var.g;
                                int i11 = f9y0Var.d;
                                str2 = new String(cArr4, i11, f9y0Var.e - i11);
                            } else {
                                if (c7 == '\\') {
                                    cArr3[f9y0Var.e] = f9y0Var.b();
                                } else {
                                    cArr3[f9y0Var.e] = c7;
                                }
                                f9y0Var.c++;
                                f9y0Var.e++;
                                c6 = '+';
                            }
                        }
                    } else if (c4 == '#') {
                        if (i6 + 4 >= i7) {
                            throw new IllegalStateException("Unexpected end of DN: ".concat(str3));
                        }
                        f9y0Var.d = i6;
                        f9y0Var.c = i6 + 1;
                        while (true) {
                            i3 = f9y0Var.c;
                            if (i3 == i7 || (c = (cArr = f9y0Var.g)[i3]) == '+' || c == ',' || c == ';') {
                                break;
                            }
                            if (c == ' ') {
                                f9y0Var.e = i3;
                                f9y0Var.c = i3 + 1;
                                while (true) {
                                    int i12 = f9y0Var.c;
                                    if (i12 >= i7 || f9y0Var.g[i12] != ' ') {
                                        break;
                                    } else {
                                        f9y0Var.c = i12 + 1;
                                    }
                                }
                            } else {
                                if (c >= 'A' && c <= 'F') {
                                    cArr[i3] = (char) (c + ' ');
                                }
                                f9y0Var.c = i3 + 1;
                            }
                        }
                        f9y0Var.e = i3;
                        int i13 = f9y0Var.e;
                        int i14 = f9y0Var.d;
                        int i15 = i13 - i14;
                        if (i15 < 5 || (i15 & 1) == 0) {
                            throw new IllegalStateException("Unexpected end of DN: ".concat(str3));
                        }
                        int i16 = i15 / 2;
                        byte[] bArr = new byte[i16];
                        int i17 = i14 + 1;
                        for (int i18 = 0; i18 < i16; i18++) {
                            bArr[i18] = (byte) f9y0Var.a(i17);
                            i17 += 2;
                        }
                        str2 = new String(f9y0Var.g, f9y0Var.d, i15);
                    } else if (c4 == '+' || c4 == ',' || c4 == ';') {
                        str2 = "";
                    } else {
                        f9y0Var.d = i6;
                        f9y0Var.e = i6;
                        while (true) {
                            int i19 = f9y0Var.c;
                            if (i19 >= i7) {
                                char[] cArr5 = f9y0Var.g;
                                int i20 = f9y0Var.d;
                                str2 = new String(cArr5, i20, f9y0Var.e - i20);
                                break;
                            }
                            cArr2 = f9y0Var.g;
                            char c8 = cArr2[i19];
                            if (c8 == ' ') {
                                int i21 = f9y0Var.e;
                                f9y0Var.f = i21;
                                f9y0Var.c = i19 + 1;
                                f9y0Var.e = i21 + 1;
                                cArr2[i21] = ' ';
                                while (true) {
                                    i4 = f9y0Var.c;
                                    if (i4 >= i7) {
                                        break;
                                    }
                                    char[] cArr6 = f9y0Var.g;
                                    if (cArr6[i4] != ' ') {
                                        break;
                                    }
                                    int i22 = f9y0Var.e;
                                    f9y0Var.e = i22 + 1;
                                    cArr6[i22] = ' ';
                                    f9y0Var.c = i4 + 1;
                                }
                                if (i4 == i7 || (c2 = f9y0Var.g[i4]) == ',' || c2 == '+' || c2 == ';') {
                                    break;
                                } else {
                                    c5 = '\\';
                                }
                            } else {
                                if (c8 == ';') {
                                    break;
                                }
                                if (c8 == c5) {
                                    int i23 = f9y0Var.e;
                                    f9y0Var.e = i23 + 1;
                                    cArr2[i23] = f9y0Var.b();
                                    f9y0Var.c++;
                                } else {
                                    if (c8 == '+' || c8 == ',') {
                                        break;
                                    }
                                    int i24 = f9y0Var.e;
                                    f9y0Var.e = i24 + 1;
                                    cArr2[i24] = c8;
                                    f9y0Var.c = i19 + 1;
                                }
                                c5 = '\\';
                            }
                            strArr = null;
                            if (list.isEmpty()) {
                                strArr2 = null;
                            } else {
                                String[] strArr3 = new String[list.size()];
                                list.toArray(strArr3);
                                strArr2 = strArr3;
                            }
                            linkedList = new LinkedList();
                            collection = x509Certificate.getSubjectAlternativeNames();
                            if (collection != null) {
                                for (List<?> list2 : collection) {
                                    int i25 = i2;
                                    if (((Integer) list2.get(0)).intValue() == i25) {
                                        linkedList.add((String) list2.get(i));
                                        i = 1;
                                        i2 = 2;
                                    } else {
                                        i2 = i25;
                                        i = 1;
                                    }
                                }
                            }
                            if (!linkedList.isEmpty()) {
                                strArr = new String[linkedList.size()];
                                linkedList.toArray(strArr);
                            }
                            Arrays.toString(strArr2);
                            Arrays.toString(strArr);
                            linkedList2 = new LinkedList();
                            if (strArr2 != null || strArr2.length <= 0) {
                                i5 = 0;
                            } else {
                                i5 = 0;
                                String str4 = strArr2[0];
                                if (str4 != null) {
                                    linkedList2.add(str4);
                                }
                            }
                            if (strArr != null) {
                                int length = strArr.length;
                                for (int i26 = i5; i26 < length; i26++) {
                                    String str5 = strArr[i26];
                                    if (str5 != null) {
                                        linkedList2.add(str5);
                                    }
                                }
                            }
                            if (linkedList2.isEmpty()) {
                                throw new SSLException(zr.a("Certificate for <", str, "> doesn't contain CN or DNS subjectAlt"));
                            }
                            StringBuffer stringBuffer = new StringBuffer();
                            String lowerCase = str.trim().toLowerCase(Locale.ENGLISH);
                            Iterator it = linkedList2.iterator();
                            ?? r6 = i5;
                            while (it.hasNext()) {
                                String lowerCase2 = ((String) it.next()).toLowerCase(Locale.ENGLISH);
                                stringBuffer.append(" <");
                                stringBuffer.append(lowerCase2);
                                stringBuffer.append('>');
                                if (it.hasNext()) {
                                    stringBuffer.append(" OR");
                                }
                                if (lowerCase2.startsWith("*.") && lowerCase2.indexOf(46, 2) != -1) {
                                    int length2 = lowerCase2.length();
                                    if (length2 >= 7 && length2 <= 9) {
                                        int i27 = length2 - 3;
                                        if (lowerCase2.charAt(i27) == '.') {
                                        }
                                    }
                                    if (!a.matcher(str).matches()) {
                                        r6 = lowerCase.endsWith(lowerCase2.substring(1));
                                        if (r6 != 0) {
                                            int i28 = i5;
                                            int i29 = i28;
                                            while (i28 < lowerCase.length()) {
                                                if (lowerCase.charAt(i28) == '.') {
                                                    i29++;
                                                }
                                                i28++;
                                            }
                                            int i30 = i5;
                                            int i31 = i30;
                                            while (i30 < lowerCase2.length()) {
                                                if (lowerCase2.charAt(i30) == '.') {
                                                    i31++;
                                                }
                                                i30++;
                                            }
                                            r6 = i29 == i31 ? 1 : i5;
                                        }
                                        if (r6 == 0) {
                                            break;
                                        }
                                    }
                                }
                                r6 = lowerCase.equals(lowerCase2);
                                if (r6 == 0) {
                                }
                            }
                            if (r6 != 0) {
                                return;
                            }
                            throw new SSLException("hostname in certificate didn't match: <" + str + "> !=" + ((Object) stringBuffer));
                        }
                        int i32 = f9y0Var.d;
                        str2 = new String(cArr2, i32, f9y0Var.e - i32);
                    }
                    if ("cn".equalsIgnoreCase(c3)) {
                        if (list.isEmpty()) {
                            list = new ArrayList();
                        }
                        list.add(str2);
                    }
                    int i33 = f9y0Var.c;
                    if (i33 >= i7) {
                        strArr = null;
                        if (list.isEmpty()) {
                        }
                        linkedList = new LinkedList();
                        collection = x509Certificate.getSubjectAlternativeNames();
                        if (collection != null) {
                        }
                        if (!linkedList.isEmpty()) {
                        }
                        Arrays.toString(strArr2);
                        Arrays.toString(strArr);
                        linkedList2 = new LinkedList();
                        if (strArr2 != null) {
                        }
                        i5 = 0;
                        if (strArr != null) {
                        }
                        if (linkedList2.isEmpty()) {
                        }
                    } else {
                        char c9 = f9y0Var.g[i33];
                        if (c9 != ',' && c9 != ';' && c9 != c6) {
                            throw new IllegalStateException("Malformed DN: ".concat(str3));
                        }
                        f9y0Var.c = i33 + 1;
                        c3 = f9y0Var.c();
                    }
                }
            } while (c3 != null);
            throw new IllegalStateException("Malformed DN: ".concat(str3));
        }
        i = 1;
        i2 = 2;
        strArr = null;
        if (list.isEmpty()) {
        }
        linkedList = new LinkedList();
        collection = x509Certificate.getSubjectAlternativeNames();
        if (collection != null) {
        }
        if (!linkedList.isEmpty()) {
        }
        Arrays.toString(strArr2);
        Arrays.toString(strArr);
        linkedList2 = new LinkedList();
        if (strArr2 != null) {
        }
        i5 = 0;
        if (strArr != null) {
        }
        if (linkedList2.isEmpty()) {
        }
    }
}
