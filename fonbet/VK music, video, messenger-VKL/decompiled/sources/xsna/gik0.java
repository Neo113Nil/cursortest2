package xsna;

import android.text.Spannable;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* compiled from: SpanRangeList.java */
/* loaded from: classes18.dex */
public final class gik0 {
    public final a[] a;

    /* compiled from: SpanRangeList.java */
    public static class a implements Comparable<a> {
        public final int b;
        public final int c;

        public a(int i, int i2) {
            this.b = i;
            this.c = i2;
        }

        @Override // java.lang.Comparable
        public final int compareTo(@NonNull a aVar) {
            return this.b - aVar.b;
        }
    }

    public gik0(Spannable spannable) {
        wdp[] wdpVarArr = (wdp[]) spannable.getSpans(0, spannable.length(), wdp.class);
        this.a = new a[wdpVarArr.length];
        for (int i = 0; i < wdpVarArr.length; i++) {
            this.a[i] = new a(spannable.getSpanStart(wdpVarArr[i]), spannable.getSpanEnd(wdpVarArr[i]));
        }
        Arrays.sort(this.a);
    }

    public final int a(int i) {
        int b = b(i);
        if (b < 0) {
            return -1;
        }
        a[] aVarArr = this.a;
        if (b >= aVarArr.length - 1) {
            return -1;
        }
        return aVarArr[b + 1].b;
    }

    public final int b(int i) {
        a[] aVarArr = this.a;
        int length = aVarArr.length - 1;
        int i2 = 0;
        while (i2 <= length) {
            int i3 = (i2 + length) >>> 1;
            a aVar = aVarArr[i3];
            int i4 = aVar.b;
            int i5 = aVar.c;
            if (i >= i4 && i < i5) {
                return i3;
            }
            if (i5 <= i) {
                i2 = i3 + 1;
            } else if (i4 > i) {
                length = i3 - 1;
            }
        }
        return -1;
    }

    public final int c(int i) {
        int b = b(i);
        if (b < 0) {
            return -1;
        }
        return this.a[b].c;
    }
}
