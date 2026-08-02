package sg.bigo.ads.bv;

import android.graphics.Color;
import android.util.TimingLogger;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import sg.bigo.ads.bv.c;

/* loaded from: classes9.dex */
final class a {
    private static final Comparator<C2445a> g = new Comparator<C2445a>() { // from class: sg.bigo.ads.bv.a.1
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(C2445a c2445a, C2445a c2445a2) {
            return c2445a2.a() - c2445a.a();
        }
    };
    final int[] a;
    final int[] b;
    final List<c.C2447c> c;
    final c.b[] e;
    private final float[] f = new float[3];

    @Nullable
    final TimingLogger d = null;

    /* renamed from: sg.bigo.ads.bv.a$a, reason: collision with other inner class name */
    public class C2445a {
        int a;
        private int c;
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;
        private int i;
        private int j;

        public C2445a(int i, int i2) {
            this.c = i;
            this.a = i2;
            c();
        }

        private int f() {
            return (this.a + 1) - this.c;
        }

        public final int a() {
            return ((this.j - this.i) + 1) * ((this.h - this.g) + 1) * ((this.f - this.e) + 1);
        }

        public final boolean b() {
            return f() > 1;
        }

        public final void c() {
            a aVar = a.this;
            int[] iArr = aVar.a;
            int[] iArr2 = aVar.b;
            int i = Integer.MAX_VALUE;
            int i2 = Integer.MIN_VALUE;
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MIN_VALUE;
            int i5 = 0;
            int i6 = Integer.MAX_VALUE;
            int i7 = Integer.MAX_VALUE;
            for (int i8 = this.c; i8 <= this.a; i8++) {
                int i9 = iArr[i8];
                i5 += iArr2[i9];
                int a = a.a(i9);
                int b = a.b(i9);
                int c = a.c(i9);
                if (a > i2) {
                    i2 = a;
                }
                if (a < i) {
                    i = a;
                }
                if (b > i3) {
                    i3 = b;
                }
                if (b < i6) {
                    i6 = b;
                }
                if (c > i4) {
                    i4 = c;
                }
                if (c < i7) {
                    i7 = c;
                }
            }
            this.e = i;
            this.f = i2;
            this.g = i6;
            this.h = i3;
            this.i = i7;
            this.j = i4;
            this.d = i5;
        }

        public final int d() {
            int i = this.f - this.e;
            int i2 = this.h - this.g;
            int i3 = this.j - this.i;
            int i4 = (i < i2 || i < i3) ? (i2 < i || i2 < i3) ? -1 : -2 : -3;
            a aVar = a.this;
            int[] iArr = aVar.a;
            int[] iArr2 = aVar.b;
            a.a(iArr, i4, this.c, this.a);
            Arrays.sort(iArr, this.c, this.a + 1);
            a.a(iArr, i4, this.c, this.a);
            int i5 = this.d / 2;
            int i6 = this.c;
            int i7 = 0;
            while (true) {
                int i8 = this.a;
                if (i6 > i8) {
                    return this.c;
                }
                i7 += iArr2[iArr[i6]];
                if (i7 >= i5) {
                    return Math.min(i8 - 1, i6);
                }
                i6++;
            }
        }

        public final c.C2447c e() {
            a aVar = a.this;
            int[] iArr = aVar.a;
            int[] iArr2 = aVar.b;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = this.c; i5 <= this.a; i5++) {
                int i6 = iArr[i5];
                int i7 = iArr2[i6];
                i += i7;
                i2 += a.a(i6) * i7;
                i3 += a.b(i6) * i7;
                i4 += i7 * a.c(i6);
            }
            if (i == 0) {
                return new c.C2447c(a.a(0, 0, 0), i);
            }
            float f = i;
            return new c.C2447c(a.a(Math.round(i2 / f), Math.round(i3 / f), Math.round(i4 / f)), i);
        }
    }

    public a(int[] iArr, int i, c.b[] bVarArr) {
        this.e = bVarArr;
        int[] iArr2 = new int[32768];
        this.b = iArr2;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int i3 = iArr[i2];
            int b = b(Color.blue(i3), 8, 5) | (b(Color.red(i3), 8, 5) << 10) | (b(Color.green(i3), 8, 5) << 5);
            iArr[i2] = b;
            iArr2[b] = iArr2[b] + 1;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < 32768; i5++) {
            if (iArr2[i5] > 0) {
                b.a(d(i5), this.f);
                if (a(this.f)) {
                    iArr2[i5] = 0;
                }
            }
            if (iArr2[i5] > 0) {
                i4++;
            }
        }
        int[] iArr3 = new int[i4];
        this.a = iArr3;
        int i6 = 0;
        for (int i7 = 0; i7 < 32768; i7++) {
            if (iArr2[i7] > 0) {
                iArr3[i6] = i7;
                i6++;
            }
        }
        if (i4 > i) {
            PriorityQueue priorityQueue = new PriorityQueue(i, g);
            priorityQueue.offer(new C2445a(0, this.a.length - 1));
            a(priorityQueue, i);
            this.c = a(priorityQueue);
            return;
        }
        this.c = new ArrayList();
        for (int i8 = 0; i8 < i4; i8++) {
            int i9 = iArr3[i8];
            this.c.add(new c.C2447c(d(i9), iArr2[i9]));
        }
    }

    public static int a(int i) {
        return (i >> 10) & 31;
    }

    public static int b(int i) {
        return (i >> 5) & 31;
    }

    public static int c(int i) {
        return i & 31;
    }

    private static int d(int i) {
        return a((i >> 10) & 31, (i >> 5) & 31, i & 31);
    }

    public static int a(int i, int i2, int i3) {
        return Color.rgb(b(i, 5, 8), b(i2, 5, 8), b(i3, 5, 8));
    }

    private static int b(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    private List<c.C2447c> a(Collection<C2445a> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<C2445a> it = collection.iterator();
        while (it.hasNext()) {
            c.C2447c e = it.next().e();
            if (!a(e.a())) {
                arrayList.add(e);
            }
        }
        return arrayList;
    }

    private static void a(PriorityQueue<C2445a> priorityQueue, int i) {
        C2445a poll;
        while (priorityQueue.size() < i && (poll = priorityQueue.poll()) != null && poll.b()) {
            if (!poll.b()) {
                throw new IllegalStateException("Can not split a box with only 1 color");
            }
            int d = poll.d();
            C2445a c2445a = a.this.new C2445a(d + 1, poll.a);
            poll.a = d;
            poll.c();
            priorityQueue.offer(c2445a);
            priorityQueue.offer(poll);
        }
    }

    public static void a(int[] iArr, int i, int i2, int i3) {
        if (i == -2) {
            while (i2 <= i3) {
                int i4 = iArr[i2];
                iArr[i2] = (i4 & 31) | (((i4 >> 5) & 31) << 10) | (((i4 >> 10) & 31) << 5);
                i2++;
            }
            return;
        }
        if (i != -1) {
            return;
        }
        while (i2 <= i3) {
            int i5 = iArr[i2];
            iArr[i2] = ((i5 >> 10) & 31) | ((i5 & 31) << 10) | (((i5 >> 5) & 31) << 5);
            i2++;
        }
    }

    private boolean a(float[] fArr) {
        c.b[] bVarArr = this.e;
        if (bVarArr != null && bVarArr.length > 0) {
            int length = bVarArr.length;
            for (int i = 0; i < length; i++) {
                if (!this.e[i].a(fArr)) {
                    return true;
                }
            }
        }
        return false;
    }
}
