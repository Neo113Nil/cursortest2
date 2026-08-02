package ru.mail.libverify.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import ru.mail.libverify.m.o;
import ru.mail.verify.core.utils.FileLog;

/* loaded from: classes9.dex */
final class h {
    private static final HashMap<String, b> a = new HashMap<>();

    public static class a {
        public String[] a;

        @Nullable
        public String[] b;
        public int c = 0;
        public o.a d;
    }

    public static class c {
        final String a;
        final String b;
        final String c;

        public c(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }
    }

    private static boolean a(@NonNull String str, @Nullable a aVar) {
        String[] strArr;
        if (TextUtils.isEmpty(str) || aVar == null || (strArr = aVar.b) == null || strArr.length == 0) {
            FileLog.e("CodeParser", "not enough arguments to parse code");
            return false;
        }
        if (aVar.c <= 0 || str.length() >= aVar.c) {
            return true;
        }
        FileLog.e("CodeParser", "message text is too small to start parsing");
        return false;
    }

    public static boolean b(@NonNull String str, @Nullable a aVar) {
        String[] strArr;
        if (TextUtils.isEmpty(str) || (strArr = aVar.a) == null || strArr.length == 0) {
            FileLog.v("CodeParser", "containsFragment return false. messageText: %s parseData: %s", str, aVar.a);
            return false;
        }
        for (String str2 : strArr) {
            if (str.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public static String c(@NonNull String str, @Nullable a aVar) {
        if (!a(str, aVar)) {
            return null;
        }
        for (String str2 : aVar.b) {
            FileLog.v("CodeParser", "try to parse using regular expression");
            if (str2.startsWith("^") && str2.endsWith("$") && str.matches(str2)) {
                String replaceFirst = str.replaceFirst(str2, "$1");
                if (!TextUtils.isEmpty(replaceFirst)) {
                    return replaceFirst;
                }
            } else {
                FileLog.v("CodeParser", "try to parse using template");
                int indexOf = str2.indexOf("%");
                if (indexOf < 0) {
                    continue;
                } else {
                    String substring = str2.substring(0, indexOf);
                    int indexOf2 = str2.indexOf("%", indexOf + 1);
                    if (indexOf2 >= 0 && indexOf2 > indexOf) {
                        String substring2 = indexOf2 != str2.length() + (-1) ? str2.substring(indexOf2 + 1) : "";
                        if (str.startsWith(substring) && str.endsWith(substring2)) {
                            String trim = str.substring(substring.length(), str.length() - substring2.length()).trim();
                            if (e(trim, aVar)) {
                                FileLog.v("CodeParser", "successfully extracted code %s", trim);
                                return trim;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    @Nullable
    public static String d(@NonNull String str, @NonNull a aVar) {
        if (!a(str, aVar)) {
            return null;
        }
        int i = 0;
        for (String str2 : aVar.b) {
            HashMap hashMap = new HashMap();
            b bVar = a.get(str2);
            if (bVar == null) {
                ArrayList arrayList = new ArrayList();
                b.a aVar2 = null;
                b.a aVar3 = null;
                for (int i2 = 0; i2 < str2.length(); i2++) {
                    if (str2.charAt(i2) == '%') {
                        if (aVar3 == null) {
                            if (aVar2 != null) {
                                aVar2.d = i2;
                                arrayList.add(new c(str2.substring(aVar2.a, aVar2.b), str2.substring(aVar2.c + 1, aVar2.d), str2.substring(aVar2.b + 1, aVar2.c)));
                            }
                            aVar3 = new b.a(i);
                            aVar3.b = i2;
                            if (aVar2 != null) {
                                aVar3.a = aVar2.d;
                            }
                        } else {
                            aVar3.c = i2;
                            aVar2 = aVar3;
                            aVar3 = null;
                        }
                    }
                }
                if (aVar2 != null) {
                    aVar2.d = str2.length();
                    arrayList.add(new c(str2.substring(aVar2.a, aVar2.b), str2.substring(aVar2.c + 1, aVar2.d), str2.substring(aVar2.b + 1, aVar2.c)));
                }
                bVar = arrayList.isEmpty() ? new b() : new b(arrayList);
                a.put(str2, bVar);
            }
            if (bVar.b && bVar.a != null) {
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    c[] cVarArr = bVar.a;
                    if (i3 >= cVarArr.length) {
                        break;
                    }
                    c cVar = cVarArr[i3];
                    int i5 = -1;
                    if (str.indexOf(cVar.a, i4) == -1) {
                        break;
                    }
                    int length = TextUtils.isEmpty(cVar.b) ? str.length() : str.indexOf(cVar.b, cVar.a.length() + i4);
                    if (length < 0) {
                        break;
                    }
                    int i6 = length - 1;
                    while (true) {
                        if (i6 < 0) {
                            break;
                        }
                        if (str.charAt(i6) != ' ') {
                            i5 = i6;
                            break;
                        }
                        i6--;
                    }
                    if (i5 < 0) {
                        break;
                    }
                    int lastIndexOf = str.lastIndexOf(32, i5);
                    if (lastIndexOf < 0) {
                        lastIndexOf = 0;
                    }
                    hashMap.put(cVar.c, str.substring(lastIndexOf, i5 + 1).trim());
                    i4 = length + cVar.b.length();
                    i3++;
                }
            }
            if (!hashMap.isEmpty()) {
                String str3 = (String) hashMap.get("code");
                if (e(str3, aVar)) {
                    return str3;
                }
                String str4 = (String) hashMap.get("verify_url");
                if (!TextUtils.isEmpty(str4)) {
                    return str4;
                }
            }
        }
        return null;
    }

    private static boolean e(@Nullable String str, @NonNull a aVar) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (aVar.c != 0 && str.length() != aVar.c) {
            return false;
        }
        if (aVar.d != o.a.NUMERIC) {
            return true;
        }
        for (char c2 : str.toCharArray()) {
            if (!Character.isDigit(c2)) {
                return false;
            }
        }
        return true;
    }

    public static class b {

        @Nullable
        final c[] a;
        final boolean b;

        public static class a {
            int a;
            int b;
            int c;
            int d;

            public /* synthetic */ a(int i) {
                this();
            }

            private a() {
            }
        }

        public b() {
            this.b = false;
            this.a = null;
        }

        public b(@NonNull ArrayList arrayList) {
            this.b = true;
            this.a = (c[]) arrayList.toArray(new c[arrayList.size()]);
        }
    }
}
