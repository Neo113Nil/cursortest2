package xsna;

import android.os.Trace;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.log.L;
import com.vk.upload.impl.tasks.cover.CoverVideoUploadTask;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import ru.ok.proto.PublisherConfiguration;

/* compiled from: SizableImageListExt.kt */
/* loaded from: classes18.dex */
public final class ixj0 {
    public static final int[] a = {32, 48, 72, 108, 160, PsExtractor.VIDEO_STREAM_MASK, 360, 480, 540, 640, PublisherConfiguration.DEFAULT_MAX_RES, 1080, CoverVideoUploadTask.y, 1440, 2560};

    public static int a(int i, int i2, int[] iArr) {
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        while (i6 < iArr.length - 1) {
            int i7 = i6 + 1;
            if (iArr[i7] >= i) {
                break;
            }
            i6 = i7;
        }
        if (i6 != iArr.length - 1 && (i3 = iArr[i6]) <= i && (i5 = iArr[(i4 = i6 + 1)]) <= i2) {
            if ((i - i3) / (i5 - i) > 2.0d) {
                return i4;
            }
        }
        return i6;
    }

    public static final <T extends fxj0> T b(Iterable<? extends T> iterable) {
        fxj0 o = o(iterable);
        T t = null;
        T t2 = (o == null || !o.c7()) ? null : (T) o.kb(o.getWidth(), o.getHeight(), o.X7(o.getWidth()));
        if (t2 != null) {
            return t2;
        }
        if (iterable == null) {
            return null;
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            t = it.next();
            if (it.hasNext()) {
                int e6 = t.e6();
                do {
                    T next = it.next();
                    int e62 = next.e6();
                    if (e6 < e62) {
                        t = next;
                        e6 = e62;
                    }
                } while (it.hasNext());
            }
        }
        return t;
    }

    public static final <T extends fxj0> T c(Iterable<? extends T> iterable, int i, int i2) {
        T t = null;
        if (iterable == null) {
            return null;
        }
        if (i <= 0 || i2 <= 0) {
            L.i(new IllegalStateException(efz.a(i, i2, "Image's width and height should be > 0, actual: w = ", " h = ")));
            return null;
        }
        fxj0 o = o(iterable);
        T t2 = o != null ? (T) f(o, i, i2) : null;
        if (t2 != null) {
            return t2;
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            t = it.next();
            if (it.hasNext()) {
                T t3 = t;
                float p = p(t3.getWidth(), t3.getHeight(), i, i2);
                do {
                    T next = it.next();
                    T t4 = next;
                    float p2 = p(t4.getWidth(), t4.getHeight(), i, i2);
                    if (Float.compare(p, p2) > 0) {
                        t = next;
                        p = p2;
                    }
                } while (it.hasNext());
            }
        }
        return t;
    }

    public static final <T extends fxj0> T d(Iterable<? extends T> iterable, int i, boolean z) {
        T t = null;
        if (iterable == null) {
            return null;
        }
        fxj0 o = o(iterable);
        T t2 = o != null ? (T) e(o, i, z) : null;
        if (t2 != null) {
            return t2;
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            t = it.next();
            if (it.hasNext()) {
                T t3 = t;
                int abs = Math.abs((z ? t3.getWidth() : t3.getHeight()) - i);
                do {
                    T next = it.next();
                    T t4 = next;
                    int abs2 = Math.abs((z ? t4.getWidth() : t4.getHeight()) - i);
                    if (abs > abs2) {
                        t = next;
                        abs = abs2;
                    }
                } while (it.hasNext());
            }
        }
        return t;
    }

    public static final <T extends fxj0> T e(T t, int i, boolean z) {
        if (!t.c7()) {
            return null;
        }
        if (!z) {
            i = t.z8(i);
        }
        int j = j(i, t.getWidth());
        return (T) t.kb(j, t.H8(j), t.X7(j));
    }

    public static final <T extends fxj0> T f(T t, int i, int i2) {
        Object obj = null;
        if (!t.c7()) {
            return null;
        }
        Iterator it = l(t.getWidth(), t.getWidth()).iterator();
        if (it.hasNext()) {
            obj = it.next();
            if (it.hasNext()) {
                int intValue = ((Number) obj).intValue();
                float p = p(intValue, t.H8(intValue), i, i2);
                do {
                    Object next = it.next();
                    int intValue2 = ((Number) next).intValue();
                    float p2 = p(intValue2, t.H8(intValue2), i, i2);
                    if (Float.compare(p, p2) > 0) {
                        obj = next;
                        p = p2;
                    }
                } while (it.hasNext());
            }
        }
        Integer num = (Integer) obj;
        int intValue3 = num != null ? num.intValue() : 100;
        return (T) t.kb(intValue3, t.H8(intValue3), t.X7(intValue3));
    }

    public static final Integer g(Iterable<? extends fxj0> iterable) {
        int height;
        fxj0 o = o(iterable);
        if (o != null) {
            height = o.getHeight();
        } else {
            fxj0 b = b(iterable);
            if (b == null) {
                return null;
            }
            height = b.getHeight();
        }
        return Integer.valueOf(height);
    }

    public static final String h(Iterable<? extends fxj0> iterable) {
        Trace.beginSection("findBestQualityUrl");
        try {
            fxj0 o = o(iterable);
            String str = null;
            if (o != null) {
                String X7 = !o.c7() ? null : o.X7(o.getWidth());
                if (X7 != null) {
                    str = X7;
                    return str;
                }
            }
            fxj0 b = b(iterable);
            if (b != null) {
                str = b.getUrl();
            }
            return str;
        } finally {
            Trace.endSection();
        }
    }

    public static final Integer i(Iterable<? extends fxj0> iterable) {
        int width;
        fxj0 o = o(iterable);
        if (o != null) {
            width = o.getWidth();
        } else {
            fxj0 b = b(iterable);
            if (b == null) {
                return null;
            }
            width = b.getWidth();
        }
        return Integer.valueOf(width);
    }

    public static final int j(int i, int i2) {
        return k(i, i2, up6.a.a);
    }

    public static final int k(int i, int i2, boolean z) {
        if (i2 != 0 && i >= i2) {
            return i2;
        }
        int[] iArr = a;
        if (i <= rl3.K(iArr)) {
            return rl3.K(iArr);
        }
        if (i >= rl3.a0(iArr)) {
            return rl3.a0(iArr);
        }
        Iterator<Integer> it = rl3.P(iArr).iterator();
        while (it.hasNext()) {
            int nextInt = ((z8x) it).nextInt();
            int i3 = iArr[nextInt];
            if (i <= i3) {
                int i4 = iArr[nextInt - 1];
                if (i2 == 0 || i2 >= i3) {
                    i2 = i3;
                }
                return (z || ((float) i) > ((float) (i4 + i2)) / 2.0f) ? i2 : i4;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static final ArrayList l(int i, int i2) {
        int k = k(i, i2, up6.a.a);
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < 15; i3++) {
            int i4 = a[i3];
            if (i4 <= k) {
                arrayList.add(Integer.valueOf(i4));
            }
        }
        if (!arrayList.isEmpty() && ((Number) j5g.i0(arrayList)).intValue() == k) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList2.add(Integer.valueOf(k));
        return arrayList2;
    }

    public static final <T extends fxj0> T m(Iterable<? extends T> iterable) {
        T t;
        fxj0 o = o(iterable);
        T t2 = null;
        if (o == null || !o.c7()) {
            t = null;
        } else {
            int i = a[0];
            t = (T) o.kb(i, o.H8(i), o.X7(i));
        }
        if (t != null) {
            return t;
        }
        if (iterable == null) {
            return null;
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            t2 = it.next();
            if (it.hasNext()) {
                int e6 = t2.e6();
                do {
                    T next = it.next();
                    int e62 = next.e6();
                    if (e6 > e62) {
                        t2 = next;
                        e6 = e62;
                    }
                } while (it.hasNext());
            }
        }
        return t2;
    }

    public static final String n(Iterable<? extends fxj0> iterable) {
        fxj0 o = o(iterable);
        if (o != null) {
            String X7 = !o.c7() ? null : o.X7(a[0]);
            if (X7 != null) {
                return X7;
            }
        }
        fxj0 m = m(iterable);
        if (m != null) {
            return m.getUrl();
        }
        return null;
    }

    public static final fxj0 o(Iterable<? extends fxj0> iterable) {
        fxj0 fxj0Var = null;
        if (iterable == null) {
            return null;
        }
        Iterator<? extends fxj0> it = iterable.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            fxj0 next = it.next();
            if (next.c7()) {
                fxj0Var = next;
                break;
            }
        }
        return fxj0Var;
    }

    public static final float p(int i, int i2, int i3, int i4) {
        return Math.abs(1 - Math.min(i / i3, i2 / i4));
    }
}
