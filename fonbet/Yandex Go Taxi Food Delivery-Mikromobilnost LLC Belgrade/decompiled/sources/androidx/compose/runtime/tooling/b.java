package androidx.compose.runtime.tooling;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import defpackage.cvu0;
import defpackage.edz;
import defpackage.m991;
import defpackage.wc90;
import defpackage.zf0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes10.dex */
public abstract class b {
    public static final zf0 a(String str) {
        if (str.length() == 0) {
            return null;
        }
        try {
            return b(str);
        } catch (ParseException e) {
            m991.b(e.getMessage(), e);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    public static final zf0 b(String str) {
        String str2;
        boolean z;
        boolean z2;
        EmptyList emptyList;
        ?? r3;
        Integer num;
        String str3;
        String str4;
        boolean z3;
        a aVar = new a(str);
        char c = '(';
        int i = 1;
        ?? r7 = 0;
        if (aVar.c('C')) {
            aVar.b++;
            if (aVar.c('C')) {
                aVar.b++;
                z3 = true;
            } else {
                z3 = false;
            }
            if (aVar.c('(')) {
                aVar.b++;
                String e = aVar.e(Extension.C_BRAKE);
                aVar.b();
                aVar.b++;
                z2 = z3;
                str2 = e;
                z = true;
            } else {
                z2 = z3;
                z = true;
                str2 = null;
            }
        } else {
            str2 = null;
            z = false;
            z2 = false;
        }
        EmptyList emptyList2 = EmptyList.a;
        ?? r14 = emptyList2;
        while (aVar.b < str.length() - i && Character.isLetter(str.charAt(aVar.b)) && str.charAt(aVar.b + i) == c) {
            char charAt = str.charAt(aVar.b);
            int i2 = i;
            char c2 = ')';
            if (charAt != 'N') {
                int i3 = aVar.b;
                if (charAt != 'P') {
                    aVar.b = i3 + 2;
                    int i4 = 0;
                    while (true) {
                        if (i4 <= 0 && aVar.c(')')) {
                            aVar.b();
                            aVar.b++;
                            i = i2;
                            break;
                        }
                        if (aVar.a()) {
                            aVar.f("unexpected end");
                            throw r7;
                        }
                        if (aVar.c(c)) {
                            i4++;
                        } else if (aVar.c(')')) {
                            i4--;
                        }
                        aVar.b++;
                    }
                } else {
                    aVar.b = i3 + 2;
                    r14 = new ArrayList();
                    int i5 = 0;
                    boolean z4 = r7;
                    while (!aVar.a() && !aVar.c(c2)) {
                        if (aVar.c('!')) {
                            aVar.b++;
                            String e2 = aVar.e("!,)");
                            if (e2.length() == 0) {
                                i5 = i2;
                            } else {
                                int parseInt = Integer.parseInt(e2);
                                int i6 = 0;
                                z4 = z4;
                                while (parseInt > 0) {
                                    int size = r14.size();
                                    int i7 = 0;
                                    while (true) {
                                        if (i7 >= size) {
                                            r14.add(new wc90(i6, (String) null, 6));
                                            parseInt--;
                                            break;
                                        }
                                        if (((wc90) r14.get(i7)).a == i6) {
                                            i6++;
                                            break;
                                        }
                                        i7++;
                                    }
                                    z4 = false;
                                }
                            }
                        } else {
                            int d = aVar.d("!:,)");
                            if (aVar.c(':')) {
                                aVar.b++;
                                str4 = cvu0.w(aVar.e("!,)"), "c#", "androidx.compose.");
                            } else {
                                str4 = null;
                            }
                            if (i5 != 0) {
                                int i8 = 0;
                                while (i8 < d) {
                                    int size2 = r14.size();
                                    int i9 = 0;
                                    while (true) {
                                        if (i9 >= size2) {
                                            r14.add(new wc90(i8, (String) null, 6));
                                            break;
                                        }
                                        if (((wc90) r14.get(i9)).a == i8) {
                                            i8++;
                                            break;
                                        }
                                        i9++;
                                    }
                                }
                                i5 = 0;
                            }
                            z4 = false;
                            r14.add(new wc90(d, str4, 2));
                        }
                        if (aVar.c(HexString.CHAR_COMMA)) {
                            aVar.b++;
                        }
                        c2 = ')';
                        z4 = z4;
                    }
                    aVar.b();
                    aVar.b++;
                    r7 = z4;
                }
            } else {
                aVar.b += 2;
                r14 = new ArrayList();
                while (!aVar.a() && !aVar.c(')')) {
                    String e3 = aVar.e(":,)");
                    if (aVar.c(':')) {
                        aVar.b++;
                        str3 = cvu0.w(aVar.e(",)"), "c#", "androidx.compose.");
                    } else {
                        str3 = r7;
                    }
                    r14.add(new wc90(r14.size(), e3, str3));
                    if (aVar.c(HexString.CHAR_COMMA)) {
                        aVar.b++;
                    }
                }
                aVar.b();
                aVar.b++;
                r7 = r7;
            }
            i = i2;
            c = '(';
        }
        int i10 = i;
        if (aVar.c(':')) {
            aVar.b++;
            emptyList = emptyList2;
        } else {
            ?? arrayList = new ArrayList();
            while (!aVar.a() && !aVar.c(':')) {
                if (aVar.c('*')) {
                    aVar.b++;
                    r3 = i10;
                } else {
                    r3 = 0;
                }
                Integer valueOf = !aVar.c('@') ? Integer.valueOf(aVar.d("@") + 1) : r7;
                aVar.b++;
                int d2 = aVar.d("L,:");
                if (aVar.c('L')) {
                    aVar.b++;
                    num = Integer.valueOf(aVar.d(",:"));
                } else {
                    num = r7;
                }
                arrayList.add(new edz(valueOf != null ? valueOf.intValue() : -1, d2, num != null ? num.intValue() : -1, r3));
                if (aVar.c(HexString.CHAR_COMMA)) {
                    aVar.b++;
                }
            }
            aVar.b++;
            emptyList = arrayList;
        }
        String e4 = aVar.e(ShimmerDivHandler.NUMBER_SING);
        String str5 = e4.length() > 0 ? e4 : r7;
        String str6 = r7;
        if (aVar.c('#')) {
            int i11 = aVar.b + 1;
            aVar.b = i11;
            str6 = str.substring(i11, str.length());
        }
        return new zf0(z, z2, str2, str5, (List) r14, str6, emptyList);
    }
}
