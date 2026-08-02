package xsna;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.RandomAccess;
import okio.ByteString;

/* compiled from: Options.kt */
/* loaded from: classes11.dex */
public final class zt80 extends ff<ByteString> implements RandomAccess {
    public final ByteString[] b;
    public final int[] c;

    /* compiled from: Options.kt */
    public static final class a {
        public static void a(long j, vl8 vl8Var, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
            int i4;
            int i5;
            ArrayList arrayList3;
            long j2;
            int i6;
            int i7 = i;
            ArrayList arrayList4 = arrayList;
            ArrayList arrayList5 = arrayList2;
            if (i2 >= i3) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            for (int i8 = i2; i8 < i3; i8++) {
                if (((ByteString) arrayList4.get(i8)).n() < i7) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            ByteString byteString = (ByteString) arrayList.get(i2);
            ByteString byteString2 = (ByteString) arrayList4.get(i3 - 1);
            if (i7 == byteString.n()) {
                int intValue = ((Number) arrayList5.get(i2)).intValue();
                int i9 = i2 + 1;
                ByteString byteString3 = (ByteString) arrayList4.get(i9);
                i4 = i9;
                i5 = intValue;
                byteString = byteString3;
            } else {
                i4 = i2;
                i5 = -1;
            }
            if (byteString.s(i7) == byteString2.s(i7)) {
                int min = Math.min(byteString.n(), byteString2.n());
                int i10 = 0;
                for (int i11 = i7; i11 < min && byteString.s(i11) == byteString2.s(i11); i11++) {
                    i10++;
                }
                long j3 = 4;
                long j4 = (vl8Var.c / j3) + j + 2 + i10 + 1;
                vl8Var.N(-i10);
                vl8Var.N(i5);
                int i12 = i7 + i10;
                while (i7 < i12) {
                    vl8Var.N(byteString.s(i7) & 255);
                    i7++;
                }
                if (i4 + 1 == i3) {
                    if (i12 != ((ByteString) arrayList4.get(i4)).n()) {
                        throw new IllegalStateException("Check failed.");
                    }
                    vl8Var.N(((Number) arrayList5.get(i4)).intValue());
                    return;
                } else {
                    vl8 vl8Var2 = new vl8();
                    vl8Var.N(((int) ((vl8Var2.c / j3) + j4)) * (-1));
                    a(j4, vl8Var2, i12, arrayList4, i4, i3, arrayList5);
                    vl8Var.L2(vl8Var2);
                    return;
                }
            }
            int i13 = 1;
            for (int i14 = i4 + 1; i14 < i3; i14++) {
                if (((ByteString) arrayList4.get(i14 - 1)).s(i7) != ((ByteString) arrayList4.get(i14)).s(i7)) {
                    i13++;
                }
            }
            long j5 = 4;
            long j6 = (vl8Var.c / j5) + j + 2 + (i13 * 2);
            vl8Var.N(i13);
            vl8Var.N(i5);
            for (int i15 = i4; i15 < i3; i15++) {
                int s = ((ByteString) arrayList4.get(i15)).s(i7);
                if (i15 == i4 || s != ((ByteString) arrayList4.get(i15 - 1)).s(i7)) {
                    vl8Var.N(s & 255);
                }
            }
            vl8 vl8Var3 = new vl8();
            int i16 = i4;
            while (i16 < i3) {
                byte s2 = ((ByteString) arrayList4.get(i16)).s(i7);
                int i17 = i16 + 1;
                int i18 = i17;
                while (true) {
                    if (i18 >= i3) {
                        i18 = i3;
                        break;
                    } else if (s2 != ((ByteString) arrayList4.get(i18)).s(i7)) {
                        break;
                    } else {
                        i18++;
                    }
                }
                if (i17 == i18 && i7 + 1 == ((ByteString) arrayList4.get(i16)).n()) {
                    vl8Var.N(((Number) arrayList5.get(i16)).intValue());
                    arrayList3 = arrayList5;
                    j2 = j6;
                    i6 = i18;
                } else {
                    vl8Var.N(((int) ((vl8Var3.c / j5) + j6)) * (-1));
                    arrayList3 = arrayList5;
                    j2 = j6;
                    i6 = i18;
                    a(j2, vl8Var3, i7 + 1, arrayList, i16, i6, arrayList3);
                    arrayList4 = arrayList;
                }
                j6 = j2;
                i16 = i6;
                arrayList5 = arrayList3;
            }
            vl8Var.L2(vl8Var3);
        }

        /* JADX WARN: Code restructure failed: missing block: B:38:0x00ca, code lost:
        
            continue;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static zt80 b(ByteString... byteStringArr) {
            int i = 0;
            if (byteStringArr.length == 0) {
                return new zt80(new ByteString[0], new int[]{0, -1});
            }
            ArrayList w0 = rl3.w0(byteStringArr);
            g5g.K(w0);
            ArrayList arrayList = new ArrayList(byteStringArr.length);
            int length = byteStringArr.length;
            for (int i2 = 0; i2 < length; i2 = tv4.a(arrayList, -1, i2, 1)) {
                ByteString byteString = byteStringArr[i2];
            }
            Integer[] numArr = (Integer[]) arrayList.toArray(new Integer[0]);
            ArrayList o = e43.o(Arrays.copyOf(numArr, numArr.length));
            int length2 = byteStringArr.length;
            int i3 = 0;
            int i4 = 0;
            while (i3 < length2) {
                o.set(e43.c(w0, byteStringArr[i3]), Integer.valueOf(i4));
                i3++;
                i4++;
            }
            if (((ByteString) w0.get(0)).n() <= 0) {
                throw new IllegalArgumentException("the empty byte string is not a supported option");
            }
            int i5 = 0;
            while (i5 < w0.size()) {
                ByteString byteString2 = (ByteString) w0.get(i5);
                int i6 = i5 + 1;
                int i7 = i6;
                while (i7 < w0.size()) {
                    ByteString byteString3 = (ByteString) w0.get(i7);
                    byteString3.getClass();
                    if (byteString3.v(0, byteString2, byteString2.n())) {
                        if (byteString3.n() == byteString2.n()) {
                            throw new IllegalArgumentException(("duplicate option: " + byteString3).toString());
                        }
                        if (((Number) o.get(i7)).intValue() > ((Number) o.get(i5)).intValue()) {
                            w0.remove(i7);
                            o.remove(i7);
                        } else {
                            i7++;
                        }
                    }
                }
                i5 = i6;
            }
            vl8 vl8Var = new vl8();
            a(0L, vl8Var, 0, w0, 0, w0.size(), o);
            int[] iArr = new int[(int) (vl8Var.c / 4)];
            while (!vl8Var.W1()) {
                iArr[i] = vl8Var.readInt();
                i++;
            }
            return new zt80((ByteString[]) Arrays.copyOf(byteStringArr, byteStringArr.length), iArr);
        }
    }

    public zt80(ByteString[] byteStringArr, int[] iArr) {
        this.b = byteStringArr;
        this.c = iArr;
    }

    @Override // xsna.qd, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ByteString) {
            return super.contains((ByteString) obj);
        }
        return false;
    }

    @Override // xsna.ff, java.util.List
    public final Object get(int i) {
        return this.b[i];
    }

    @Override // xsna.ff, xsna.qd
    public final int getSize() {
        return this.b.length;
    }

    @Override // xsna.ff, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ByteString) {
            return super.indexOf((ByteString) obj);
        }
        return -1;
    }

    @Override // xsna.ff, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ByteString) {
            return super.lastIndexOf((ByteString) obj);
        }
        return -1;
    }
}
