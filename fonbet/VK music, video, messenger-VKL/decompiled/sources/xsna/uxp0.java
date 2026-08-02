package xsna;

import android.util.Base64;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* compiled from: USNationalPersonalDataSharingDelegate.kt */
/* loaded from: classes2.dex */
public final class uxp0 {
    public final mag a;

    public uxp0(mag magVar) {
        this.a = magVar;
    }

    public static int a(String str) {
        Collection collection;
        List b0 = drm0.b0(str, new char[]{'~'}, 0, 6);
        Pair pair = new Pair(j5g.a0(b0), j5g.S(b0, 1));
        String str2 = (String) pair.d();
        List list = (List) pair.g();
        if (str2 != null && str2.length() != 0 && !list.isEmpty()) {
            int length = str2.length() & 3;
            if (length != 0) {
                StringBuilder e = fw3.e(str2);
                e.append(brm0.x(4 - length, "A"));
                str2 = e.toString();
            }
            byte[] decode = Base64.decode(str2, 2);
            if ((decode[0] >> 2) == 3) {
                int length2 = decode.length - 3;
                if (length2 < 0) {
                    length2 = 0;
                }
                if (length2 < 0) {
                    throw new IllegalArgumentException(tgw.b(length2, "Requested element count ", " is less than zero.").toString());
                }
                if (length2 == 0) {
                    collection = EmptyList.b;
                } else {
                    int length3 = decode.length;
                    if (length2 >= length3) {
                        collection = rl3.r0(decode);
                    } else if (length2 == 1) {
                        collection = Collections.singletonList(Byte.valueOf(decode[length3 - 1]));
                    } else {
                        ArrayList arrayList = new ArrayList(length2);
                        for (int i = length3 - length2; i < length3; i++) {
                            arrayList.add(Byte.valueOf(decode[i]));
                        }
                        collection = arrayList;
                    }
                }
                StringBuilder sb = new StringBuilder();
                Iterator it = collection.iterator();
                while (true) {
                    int i2 = 7;
                    if (!it.hasNext()) {
                        break;
                    }
                    byte byteValue = ((Number) it.next()).byteValue();
                    int i3 = 0;
                    while (i3 < 8) {
                        sb.append(new jxp0((byteValue >>> i2) & 1));
                        i3++;
                        i2--;
                    }
                }
                Matcher matcher = Pattern.compile("((1[01]*?11)([01]*?11))|(0[01]*?11)").matcher(sb.toString());
                k9x o = kq01.o(matcher, 0);
                int i4 = 0;
                while (true) {
                    if (epx.f(o, k9x.e)) {
                        i4 = -1;
                        break;
                    }
                    int i5 = o.c;
                    int i6 = o.b;
                    if (i5 != i6) {
                        if (i5 > i6) {
                            if (7 <= i5 && i6 <= 7) {
                                i4 += j5g.c0(o, 7);
                                break;
                            }
                            i4 += (i5 - i6) + 1;
                        } else {
                            continue;
                        }
                        o = kq01.o(matcher, i5);
                    } else {
                        if (i5 == 7) {
                            break;
                        }
                        i4++;
                        o = kq01.o(matcher, i5);
                    }
                }
                if (i4 != -1 && i4 < list.size()) {
                    Character z0 = erm0.z0(3, (String) list.get(i4));
                    if (z0 != null && z0.charValue() == 'V') {
                        return 1;
                    }
                    if (z0 != null && z0.charValue() == 'q') {
                        return 2;
                    }
                }
            }
        }
        return 0;
    }
}
