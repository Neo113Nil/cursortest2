package xsna;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import xsna.sg90;

/* compiled from: ColorCutQuantizer.java */
/* loaded from: classes12.dex */
public final class w5g {
    public static final a f = new a();
    public final int[] a;
    public final int[] b;
    public final ArrayList c;
    public final sg90.c[] d;
    public final float[] e = new float[3];

    /* compiled from: ColorCutQuantizer.java */
    public static class a implements Comparator<b> {
        @Override // java.util.Comparator
        public final int compare(b bVar, b bVar2) {
            return bVar2.b() - bVar.b();
        }
    }

    /* compiled from: ColorCutQuantizer.java */
    public class b {
        public final int a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;

        public b(int i, int i2) {
            this.a = i;
            this.b = i2;
            a();
        }

        public final void a() {
            w5g w5gVar = w5g.this;
            int[] iArr = w5gVar.a;
            int[] iArr2 = w5gVar.b;
            int i = Integer.MAX_VALUE;
            int i2 = Integer.MIN_VALUE;
            int i3 = Integer.MIN_VALUE;
            int i4 = 0;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MAX_VALUE;
            int i7 = Integer.MIN_VALUE;
            for (int i8 = this.a; i8 <= this.b; i8++) {
                int i9 = iArr[i8];
                i4 += iArr2[i9];
                int i10 = (i9 >> 10) & 31;
                int i11 = (i9 >> 5) & 31;
                int i12 = i9 & 31;
                if (i10 > i7) {
                    i7 = i10;
                }
                if (i10 < i) {
                    i = i10;
                }
                if (i11 > i2) {
                    i2 = i11;
                }
                if (i11 < i5) {
                    i5 = i11;
                }
                if (i12 > i3) {
                    i3 = i12;
                }
                if (i12 < i6) {
                    i6 = i12;
                }
            }
            this.d = i;
            this.e = i7;
            this.f = i5;
            this.g = i2;
            this.h = i6;
            this.i = i3;
            this.c = i4;
        }

        public final int b() {
            return ((this.i - this.h) + 1) * ((this.g - this.f) + 1) * ((this.e - this.d) + 1);
        }
    }

    public w5g(int[] iArr, int i, sg90.c[] cVarArr) {
        b bVar;
        this.d = cVarArr;
        int[] iArr2 = new int[32768];
        this.b = iArr2;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int i3 = iArr[i2];
            int b2 = b(Color.blue(i3), 8, 5) | (b(Color.red(i3), 8, 5) << 10) | (b(Color.green(i3), 8, 5) << 5);
            iArr[i2] = b2;
            iArr2[b2] = iArr2[b2] + 1;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < 32768; i5++) {
            if (iArr2[i5] > 0) {
                int rgb = Color.rgb(b((i5 >> 10) & 31, 5, 8), b((i5 >> 5) & 31, 5, 8), b(i5 & 31, 5, 8));
                float[] fArr = this.e;
                n8g.h(rgb, fArr);
                sg90.c[] cVarArr2 = this.d;
                if (cVarArr2 != null && cVarArr2.length > 0) {
                    int length = cVarArr2.length;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= length) {
                            break;
                        }
                        if (!cVarArr2[i6].a(fArr)) {
                            iArr2[i5] = 0;
                            break;
                        }
                        i6++;
                    }
                }
            }
            if (iArr2[i5] > 0) {
                i4++;
            }
        }
        int[] iArr3 = new int[i4];
        this.a = iArr3;
        int i7 = 0;
        for (int i8 = 0; i8 < 32768; i8++) {
            if (iArr2[i8] > 0) {
                iArr3[i7] = i8;
                i7++;
            }
        }
        if (i4 <= i) {
            this.c = new ArrayList();
            for (int i9 = 0; i9 < i4; i9++) {
                int i10 = iArr3[i9];
                this.c.add(new sg90.d(Color.rgb(b((i10 >> 10) & 31, 5, 8), b((i10 >> 5) & 31, 5, 8), b(i10 & 31, 5, 8)), iArr2[i10]));
            }
            return;
        }
        PriorityQueue priorityQueue = new PriorityQueue(i, f);
        priorityQueue.offer(new b(0, this.a.length - 1));
        while (priorityQueue.size() < i && (bVar = (b) priorityQueue.poll()) != null) {
            int i11 = bVar.b;
            int i12 = bVar.a;
            if ((i11 + 1) - i12 <= 1) {
                break;
            }
            w5g w5gVar = w5g.this;
            if ((i11 + 1) - i12 <= 1) {
                throw new IllegalStateException("Can not split a box with only 1 color");
            }
            int i13 = bVar.e - bVar.d;
            int i14 = bVar.g - bVar.f;
            int i15 = bVar.i - bVar.h;
            int i16 = (i13 < i14 || i13 < i15) ? (i14 < i13 || i14 < i15) ? -1 : -2 : -3;
            int[] iArr4 = w5gVar.a;
            int[] iArr5 = w5gVar.b;
            a(i16, i12, i11, iArr4);
            Arrays.sort(iArr4, i12, bVar.b + 1);
            a(i16, i12, bVar.b, iArr4);
            int i17 = bVar.c / 2;
            int i18 = 0;
            int i19 = i12;
            while (true) {
                int i20 = bVar.b;
                if (i19 > i20) {
                    break;
                }
                i18 += iArr5[iArr4[i19]];
                if (i18 >= i17) {
                    i12 = Math.min(i20 - 1, i19);
                    break;
                }
                i19++;
            }
            b bVar2 = w5gVar.new b(i12 + 1, bVar.b);
            bVar.b = i12;
            bVar.a();
            priorityQueue.offer(bVar2);
            priorityQueue.offer(bVar);
        }
        ArrayList arrayList = new ArrayList(priorityQueue.size());
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            b bVar3 = (b) it.next();
            w5g w5gVar2 = w5g.this;
            int[] iArr6 = w5gVar2.a;
            int[] iArr7 = w5gVar2.b;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            for (int i25 = bVar3.a; i25 <= bVar3.b; i25++) {
                int i26 = iArr6[i25];
                int i27 = iArr7[i26];
                i22 += i27;
                i21 = (((i26 >> 10) & 31) * i27) + i21;
                i23 = (((i26 >> 5) & 31) * i27) + i23;
                i24 += i27 * (i26 & 31);
            }
            float f2 = i22;
            sg90.d dVar = new sg90.d(Color.rgb(b(Math.round(i21 / f2), 5, 8), b(Math.round(i23 / f2), 5, 8), b(Math.round(i24 / f2), 5, 8)), i22);
            float[] b3 = dVar.b();
            sg90.c[] cVarArr3 = this.d;
            if (cVarArr3 != null && cVarArr3.length > 0) {
                for (sg90.c cVar : cVarArr3) {
                    if (!cVar.a(b3)) {
                        break;
                    }
                }
            }
            arrayList.add(dVar);
        }
        this.c = arrayList;
    }

    public static void a(int i, int i2, int i3, int[] iArr) {
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

    public static int b(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }
}
