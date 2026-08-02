package defpackage;

import com.vk.movika.tools.controls.seekbar.DefaultSeekBarView;
import defpackage.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.c5g;
import xsna.drm0;
import xsna.fpf0;
import xsna.j5g;

/* compiled from: EmojiUtils.kt */
/* loaded from: classes17.dex */
public final class b {
    public static MutablePropertyReference1Impl a(String str, String str2) {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(DefaultSeekBarView.class, str, str2, 0);
        fpf0.a.getClass();
        return mutablePropertyReference1Impl;
    }

    public static final boolean b(String str) {
        a.C0000a c0000a;
        Iterable aVar = new a(str);
        if ((aVar instanceof Collection) && ((Collection) aVar).isEmpty()) {
            return false;
        }
        Iterator<Integer> it = aVar.iterator();
        do {
            c0000a = (a.C0000a) it;
            if (!c0000a.hasNext()) {
                return false;
            }
        } while (!c(((Number) c0000a.next()).intValue()));
        return true;
    }

    public static final boolean c(int i) {
        if (8400 <= i && i < 8448) {
            return true;
        }
        if (8596 <= i && i < 8601) {
            return true;
        }
        if (9100 <= i && i < 9301) {
            return true;
        }
        if (9723 <= i && i < 9727) {
            return true;
        }
        if (9728 <= i && i < 9984) {
            return true;
        }
        if (9984 <= i && i < 10176) {
            return true;
        }
        if (65024 <= i && i < 65040) {
            return true;
        }
        if (127462 <= i && i < 127488) {
            return true;
        }
        if (127744 <= i && i < 128512) {
            return true;
        }
        if (128512 <= i && i < 128592) {
            return true;
        }
        if (128640 <= i && i < 128768) {
            return true;
        }
        if (128992 <= i && i < 129004) {
            return true;
        }
        if (129648 <= i && i < 129661) {
            return true;
        }
        if (129664 <= i && i < 129734) {
            return true;
        }
        if (129742 <= i && i < 129756) {
            return true;
        }
        if (129760 <= i && i < 129769) {
            return true;
        }
        if (129776 <= i && i < 129785) {
            return true;
        }
        if (129280 <= i && i < 129536) {
            return true;
        }
        if (127000 > i || i >= 127601) {
            return (917536 <= i && i < 917632) || i == 126980 || i == 129008 || i == 8252 || i == 8265 || i == 8482 || i == 8505 || i == 8601 || i == 8617 || i == 8618 || i == 8986 || i == 8987 || i == 9000 || i == 9410 || i == 9642 || i == 9643 || i == 9654 || i == 9664 || i == 10548 || i == 10549 || i == 11013 || i == 11014 || i == 11015 || i == 11035 || i == 11036 || i == 11088 || i == 11093 || i == 12336 || i == 12349 || i == 12951 || i == 12953 || i == 169 || i == 174;
        }
        return true;
    }

    public static final boolean d(int i) {
        if (i == 8205) {
            return true;
        }
        return (127995 <= i && i < 128000) || i == 65039 || i == 8419;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int e(String str) {
        Integer valueOf;
        int intValue;
        int intValue2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Integer num = null;
        int i = 0;
        Integer num2 = null;
        while (i < str.length()) {
            int length = str.length();
            if (i >= length) {
                throw new NoSuchElementException();
            }
            int i2 = i + 1;
            char charAt = str.charAt(i);
            if (Character.isHighSurrogate(charAt) && i2 < length) {
                char charAt2 = str.charAt(i2);
                if (Character.isLowSurrogate(charAt2)) {
                    i += 2;
                    valueOf = Integer.valueOf(Character.toCodePoint(charAt, charAt2));
                    intValue = valueOf.intValue();
                    if (num2 == null && ((num2.intValue() == 8205 && c(intValue)) || ((intValue2 = num2.intValue()) >= 0 && intValue2 < 128 && intValue == 65039))) {
                        arrayList3.add(num2);
                        arrayList3.add(Integer.valueOf(intValue));
                    } else if (!c(intValue)) {
                        arrayList3.add(Integer.valueOf(intValue));
                    }
                    num2 = Integer.valueOf(intValue);
                }
            }
            valueOf = Integer.valueOf(charAt);
            i = i2;
            intValue = valueOf.intValue();
            if (num2 == null) {
            }
            if (!c(intValue)) {
            }
            num2 = Integer.valueOf(intValue);
        }
        int[] N0 = j5g.N0(arrayList3);
        int length2 = N0.length;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            boolean z = true;
            if (i3 >= length2) {
                break;
            }
            int i5 = N0[i3];
            if (num != null) {
                int intValue3 = num.intValue();
                if (127462 <= intValue3 && intValue3 < 127488 && 127462 <= i5 && i5 < 127488 && i4 < 2) {
                    z = false;
                }
                if ((num.intValue() != 8205 && !d(i5) && z) || num.intValue() == 8419) {
                    arrayList.add(arrayList2);
                    arrayList2 = new ArrayList();
                    i4 = 0;
                }
            }
            arrayList2.add(Integer.valueOf(i5));
            num = Integer.valueOf(i5);
            if (127462 <= i5 && i5 < 127488) {
                i4++;
            }
            i3++;
        }
        arrayList.add(arrayList2);
        ArrayList arrayList4 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!((List) next).isEmpty()) {
                arrayList4.add(next);
            }
        }
        ArrayList arrayList5 = new ArrayList(c5g.u(arrayList4, 10));
        Iterator it2 = arrayList4.iterator();
        while (it2.hasNext()) {
            List list = (List) it2.next();
            arrayList5.add(new String(j5g.N0(list), 0, list.size()));
        }
        Iterator it3 = arrayList5.iterator();
        int i6 = 0;
        int i7 = 0;
        while (it3.hasNext()) {
            String str2 = (String) it3.next();
            int K = drm0.K(i7, 4, str, str2, false);
            i6 = (K - i7) + i6 + 1;
            i7 = str2.length() + K;
        }
        return (str.length() + i6) - i7;
    }
}
