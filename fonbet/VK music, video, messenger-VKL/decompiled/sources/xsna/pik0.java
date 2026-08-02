package xsna;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import java.util.List;

/* compiled from: SpannableFromMaskBuilder.java */
/* loaded from: classes2.dex */
public final class pik0 {

    /* compiled from: SpannableFromMaskBuilder.java */
    public static class a {
        public String a;
        public String b;
        public List<?> c;
    }

    public static Spannable a(String str, List list) {
        int[] iArr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            a aVar = (a) list.get(i);
            int indexOf = str.indexOf(aVar.a);
            iArr[i] = indexOf;
            if (indexOf >= 0) {
                str = str.replace(aVar.a, aVar.b);
            }
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        for (int i2 = 0; i2 < list.size(); i2++) {
            a aVar2 = (a) list.get(i2);
            int i3 = iArr[i2];
            if (i3 >= 0) {
                int length = aVar2.b.length() + i3;
                List<?> list2 = aVar2.c;
                if (list2 != null && list2.size() > 0) {
                    for (int i4 = 0; i4 < list2.size(); i4++) {
                        spannableStringBuilder.setSpan(list2.get(i4), i3, length, 18);
                    }
                }
            }
        }
        return spannableStringBuilder;
    }
}
