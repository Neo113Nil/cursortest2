package xsna;

import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.EmptyList;
import xsna.bxy;
import xsna.tra0;

/* compiled from: LazyStaggeredGridMeasure.kt */
/* loaded from: classes11.dex */
public final class hxy {
    public static final int a(int[] iArr) {
        int length = iArr.length;
        int i = -1;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = iArr[i3];
            if (i2 < i4) {
                i = i3;
                i2 = i4;
            }
        }
        return i;
    }

    public static int b(int[] iArr) {
        int length = iArr.length;
        int i = -1;
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = iArr[i3];
            if (-2147483647 <= i4 && i4 < i2) {
                i = i3;
                i2 = i4;
            }
        }
        return i;
    }

    public static final int c(long j, int[] iArr) {
        int i = (int) (j & 4294967295L);
        int i2 = Integer.MIN_VALUE;
        for (int i3 = (int) (j >> 32); i3 < i; i3++) {
            i2 = Math.max(i2, iArr[i3]);
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:312:0x063d, code lost:
    
        if ((r8 != null ? r8.a : -1) > r3) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0101, code lost:
    
        r0 = a(r7);
        r3 = r7[r0];
        r6 = r2.length;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0109, code lost:
    
        if (r10 >= r6) goto L610;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x010b, code lost:
    
        r34 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0111, code lost:
    
        if (r7[r10] == r7[r0]) goto L612;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0113, code lost:
    
        r6 = r2[r10];
        r15 = r2[r0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0117, code lost:
    
        if (r6 >= r15) goto L613;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0119, code lost:
    
        r2[r10] = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x011b, code lost:
    
        r10 = r10 + 1;
        r6 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:596:0x0396, code lost:
    
        r10 = b(r1);
        r13 = a(r41);
        r80 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:597:0x03a0, code lost:
    
        if (r10 == r13) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:599:0x03a8, code lost:
    
        if (r1[r10] != r1[r13]) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:600:0x03aa, code lost:
    
        r0 = r80;
        r10 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:601:0x03b4, code lost:
    
        r13 = r41[r10];
        r80 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:602:0x03b9, code lost:
    
        if (r13 != (-1)) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:603:0x03bb, code lost:
    
        r13 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:604:0x03bc, code lost:
    
        r0 = r9.d(r13, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:605:0x03c0, code lost:
    
        if (r0 >= 0) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:606:0x040f, code lost:
    
        r37 = r6;
        r42 = r14;
        r6 = r79;
        r79 = r12;
        r12 = r41;
        r41 = r15;
        r14 = r78.a(r4, r0, r10);
        r81 = r3;
        r44 = r4;
        r3 = (int) (r14 & r24);
        r45 = r5;
        r4 = (int) (r14 >> 32);
        r5 = r3 - r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:607:0x0430, code lost:
    
        if (r5 == 1) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:608:0x0432, code lost:
    
        r10 = -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:609:0x0435, code lost:
    
        r9.i(r0, r10);
        r10 = r43;
        r4 = r10.L0(r0, r14);
        r14 = c(r14, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:610:0x0445, code lost:
    
        if (r5 == 1) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:611:0x0447, code lost:
    
        r5 = r9.e(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:612:0x044e, code lost:
    
        r15 = r80;
        r0 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:613:0x0454, code lost:
    
        if (r0 >= r3) goto L698;
     */
    /* JADX WARN: Code restructure failed: missing block: B:614:0x0456, code lost:
    
        r34 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:615:0x045a, code lost:
    
        if (r1[r34] == r14) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:616:0x045c, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:617:0x045d, code lost:
    
        r36[r34].addFirst(r4);
        r12[r34] = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:618:0x0464, code lost:
    
        if (r5 != null) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:619:0x0466, code lost:
    
        r43 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0120, code lost:
    
        r3 = r9.d(r3, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:621:0x046d, code lost:
    
        r1[r34] = (r4.n + r14) + r43;
        r0 = r34 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:622:0x0469, code lost:
    
        r43 = r5[r34];
     */
    /* JADX WARN: Code restructure failed: missing block: B:626:0x044c, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:627:0x0434, code lost:
    
        r10 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:629:0x03c2, code lost:
    
        r13 = r78;
        r0 = r41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0124, code lost:
    
        if (r3 >= 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:630:0x03c6, code lost:
    
        if (r80 != false) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:632:0x03cc, code lost:
    
        if (e(r0, r13, r1, r10) == false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:634:0x03f9, code lost:
    
        r37 = r6;
        r6 = r79;
        r79 = r12;
        r12 = r0;
        r81 = r3;
        r44 = r4;
        r45 = r5;
        r42 = r14;
        r41 = r15;
        r4 = r43;
        r0 = r80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x012e, code lost:
    
        r34 = r5;
        r5 = r1.a(r4, r3, r0);
        r0 = r11;
        r10 = (int) (r5 & 4294967295L);
        r37 = r12;
        r11 = (int) (r5 >> 32);
        r12 = r10 - r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:643:0x03d2, code lost:
    
        if (r82 == false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:644:0x03d4, code lost:
    
        r9.g();
        r0 = r0.length;
        r2 = new int[r0];
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:645:0x03db, code lost:
    
        if (r3 >= r0) goto L701;
     */
    /* JADX WARN: Code restructure failed: missing block: B:646:0x03dd, code lost:
    
        r2[r3] = -1;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:648:0x03e4, code lost:
    
        r0 = r1.length;
        r3 = new int[r0];
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:649:0x03e8, code lost:
    
        if (r4 >= r0) goto L702;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0140, code lost:
    
        if (r12 == 1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:650:0x03ea, code lost:
    
        r3[r4] = r1[r10];
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:653:0x03f8, code lost:
    
        return d(r13, r79, r2, r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:654:0x03ae, code lost:
    
        r10 = r10;
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0142, code lost:
    
        r15 = -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0145, code lost:
    
        r9.i(r3, r15);
        r15 = r14.L0(r3, r5);
        r5 = c(r5, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0151, code lost:
    
        if (r12 == 1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0153, code lost:
    
        r30 = r9.e(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0157, code lost:
    
        r6 = r80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0159, code lost:
    
        if (r11 >= r10) goto L614;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x015b, code lost:
    
        r7[r11] = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x015d, code lost:
    
        if (r30 != null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x015f, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0160, code lost:
    
        r81 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0166, code lost:
    
        r0 = (r15.n + r5) + r12;
        r2[r11] = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x016e, code lost:
    
        if ((r37 + r0) > 0) goto L616;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0170, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0171, code lost:
    
        r11 = r11 + 1;
        r0 = r81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0163, code lost:
    
        r12 = r30[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0144, code lost:
    
        r15 = r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:267:0x055b A[LOOP:22: B:266:0x0559->B:267:0x055b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x06aa  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x06b0 A[LOOP:26: B:326:0x06ae->B:327:0x06b0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:332:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x076a  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x078b  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x07d5  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0808  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x086a A[LOOP:32: B:389:0x07d3->B:422:0x086a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0880 A[EDGE_INSN: B:423:0x0880->B:424:0x0880 BREAK  A[LOOP:32: B:389:0x07d3->B:422:0x086a], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:426:0x088b  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x08fc  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x091a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:453:0x08ca  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x092e  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x0941  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x0969  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x0a11  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x0a26  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x0a23 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:544:0x0a9d  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x0864  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x0801  */
    /* JADX WARN: Removed duplicated region for block: B:564:0x076d  */
    /* JADX WARN: Removed duplicated region for block: B:581:0x069c  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:583:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:584:0x05c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final lxy d(exy exyVar, int i, int[] iArr, int[] iArr2, boolean z) {
        long j;
        uxy uxyVar;
        qty qtyVar;
        List list;
        boolean z2;
        sk3[] sk3VarArr;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int[] iArr3;
        exy exyVar2;
        int i9;
        int i10;
        int i11;
        int i12;
        int[] iArr4;
        int i13;
        uwy uwyVar;
        int i14;
        dxy dxyVar;
        int[] iArr5;
        int i15;
        int i16;
        qty qtyVar2;
        int i17;
        int[] iArr6;
        int i18;
        int i19;
        int[] iArr7;
        int i20;
        int i21;
        uwy uwyVar2;
        int i22;
        dxy dxyVar2;
        boolean z3;
        uxy uxyVar2;
        float f;
        float f2;
        boolean z1;
        float f3;
        int length;
        int i23;
        int i24;
        ztm0 ztm0Var;
        int[] iArr8;
        long j2;
        int g;
        ztm0 ztm0Var2;
        int size;
        int i25;
        long j3;
        List<Integer> list2;
        uwy uwyVar3;
        int[] iArr9;
        List list3;
        int i26;
        int i27;
        int[] iArr10;
        uxy uxyVar3;
        List<Integer> list4;
        int i28;
        ArrayList arrayList;
        int size2;
        int i29;
        int[] iArr11;
        ArrayList arrayList2;
        int i30;
        uwy uwyVar4;
        int i31;
        int i32;
        int i33;
        int i34;
        boolean z4;
        long j4;
        boolean z5;
        boolean z6;
        int i35;
        boolean z7;
        int[] iArr12;
        int i36;
        boolean z8;
        boolean z9;
        int size3;
        List<twy> list5;
        twy twyVar;
        int index;
        int min;
        boolean z10;
        twy twyVar2;
        boolean z11;
        boolean z12;
        int i37;
        int i38;
        int i39;
        int i40;
        bxy bxyVar;
        int i41;
        int i42;
        int[] iArr13;
        bxy bxyVar2;
        int i43;
        int i44;
        int i45;
        boolean z13;
        exy exyVar3 = exyVar;
        sxy sxyVar = exyVar3.d;
        List<Integer> list6 = exyVar3.b;
        int i46 = exyVar3.k;
        List<twy> list7 = exyVar3.o;
        int i47 = exyVar3.l;
        boolean z14 = exyVar3.f;
        uxy uxyVar4 = exyVar3.a;
        int i48 = exyVar3.s;
        int i49 = exyVar3.h;
        int i50 = exyVar3.j;
        dxy dxyVar3 = exyVar3.q;
        List<twy> list8 = list7;
        long j5 = exyVar3.e;
        bxy bxyVar3 = exyVar3.r;
        qty qtyVar3 = exyVar3.g;
        sxy sxyVar2 = sxyVar;
        uwy uwyVar5 = exyVar3.c;
        List<Integer> list9 = list6;
        int itemCount = uwyVar5.getItemCount();
        long j6 = j5;
        long j7 = 4294967295L;
        if (itemCount <= 0 || i48 == 0) {
            int k = o6j.k(j6);
            int j8 = o6j.j(j6);
            uxyVar4.t.d(0, k, j8, new ArrayList(), dxyVar3.e.a(), exyVar3.q, exyVar3.f, qtyVar3.c.z1(), exyVar3.s, exyVar3.n, 0, 0, exyVar3.m, exyVar3.p);
            if (!qtyVar3.c.z1()) {
                long b = uxyVar4.t.b();
                if (!q9x.b(b, 0L)) {
                    j = j6;
                    k = s6j.g((int) (b >> 32), j);
                    j8 = s6j.f((int) (b & 4294967295L), j);
                    dp10 Q = qtyVar3.Q(k, j8, jgp.b, new u4u(8));
                    boolean z15 = exyVar3.f;
                    EmptyList emptyList = EmptyList.b;
                    long j9 = (o6j.j(j) & 4294967295L) | (o6j.k(j) << 32);
                    int i51 = exyVar3.j;
                    int i52 = exyVar3.k;
                    return new lxy(iArr, iArr2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Q, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, z15, false, exyVar3.d, uwyVar5.d(), qtyVar3, itemCount, emptyList, j9, -i51, i52 + i49, i51, i52, exyVar3.l, exyVar3.m);
                }
            }
            j = j6;
            dp10 Q2 = qtyVar3.Q(k, j8, jgp.b, new u4u(8));
            boolean z152 = exyVar3.f;
            EmptyList emptyList2 = EmptyList.b;
            long j92 = (o6j.j(j) & 4294967295L) | (o6j.k(j) << 32);
            int i512 = exyVar3.j;
            int i522 = exyVar3.k;
            return new lxy(iArr, iArr2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Q2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, z152, false, exyVar3.d, uwyVar5.d(), qtyVar3, itemCount, emptyList2, j92, -i512, i522 + i49, i512, i522, exyVar3.l, exyVar3.m);
        }
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        int[] copyOf2 = Arrays.copyOf(iArr2, iArr2.length);
        int length2 = copyOf.length - 1;
        if (length2 >= 0) {
            while (true) {
                int i53 = length2 - 1;
                while (true) {
                    int i54 = copyOf[length2];
                    if (i54 < itemCount && bxyVar3.a(i54, length2)) {
                        break;
                    }
                    uxy uxyVar5 = uxyVar4;
                    qty qtyVar4 = qtyVar3;
                    copyOf[length2] = bxyVar3.d(copyOf[length2], length2);
                    uxyVar4 = uxyVar5;
                    qtyVar3 = qtyVar4;
                }
                int i55 = copyOf[length2];
                uxyVar = uxyVar4;
                if (i55 >= 0) {
                    uwyVar5.d().e(i55);
                    qtyVar = qtyVar3;
                    if (bxyVar3.f(i55) == -2) {
                        int length3 = copyOf.length;
                        int i56 = 0;
                        while (true) {
                            if (i56 >= length3) {
                                i56 = -1;
                                break;
                            }
                            int i57 = length3;
                            if (copyOf[i56] == i55) {
                                break;
                            }
                            i56++;
                            length3 = i57;
                        }
                        int i58 = i56 + 1;
                        int i59 = i56;
                        if (i58 <= length2) {
                            while (true) {
                                if (copyOf[i58] == i55) {
                                    copyOf[i58] = bxyVar3.d(i55, i58);
                                }
                                if (i58 == length2) {
                                    break;
                                }
                                i58++;
                            }
                        }
                        length2 = i59;
                    }
                    bxyVar3.i(i55, length2);
                } else {
                    qtyVar = qtyVar3;
                }
                if (i53 < 0) {
                    break;
                }
                length2 = i53;
                uxyVar4 = uxyVar;
                qtyVar3 = qtyVar;
            }
        } else {
            uxyVar = uxyVar4;
            qtyVar = qtyVar3;
        }
        f(-i, copyOf2);
        sk3[] sk3VarArr2 = new sk3[i48];
        for (int i60 = 0; i60 < i48; i60++) {
            sk3VarArr2[i60] = new sk3(16);
        }
        f(-i50, copyOf2);
        boolean z16 = false;
        loop5: while (true) {
            int length4 = copyOf.length;
            int i61 = 0;
            while (true) {
                list = null;
                int[] iArr14 = null;
                if (i61 >= length4) {
                    z2 = z16;
                    sk3VarArr = sk3VarArr2;
                    i2 = -1;
                    break loop5;
                }
                int i62 = copyOf[i61];
                z2 = z16;
                sk3VarArr = sk3VarArr2;
                if (copyOf2[i61] < Math.max(-i47, 0) && i62 > 0) {
                    break;
                }
                i61++;
                z16 = z2;
                i48 = i48;
                itemCount = itemCount;
                sk3VarArr2 = sk3VarArr;
                i49 = i49;
            }
            i48 = i44;
            z16 = z13;
            itemCount = i43;
            sk3VarArr2 = sk3VarArr;
            i49 = i45;
        }
        int i63 = itemCount;
        int i64 = i48;
        int i65 = i49;
        int i66 = -i50;
        int i67 = copyOf2[0];
        if (i67 < i66) {
            int i68 = i66 - i67;
            f(i68, copyOf2);
            i3 = i - i68;
        } else {
            i3 = i;
        }
        f(i50, copyOf2);
        int i69 = -1;
        if (i2 == -1) {
            i2 = rl3.T(0, copyOf);
        }
        if (i2 != -1 && e(copyOf, exyVar3, copyOf2, i2) && z) {
            bxyVar3.g();
            int length5 = copyOf.length;
            int[] iArr15 = new int[length5];
            int i70 = 0;
            while (i70 < length5) {
                iArr15[i70] = i69;
                i70++;
                i69 = -1;
            }
            int length6 = copyOf2.length;
            int[] iArr16 = new int[length6];
            for (int i71 = 0; i71 < length6; i71++) {
                iArr16[i71] = copyOf2[i2];
            }
            return d(exyVar3, i3, iArr15, iArr16, false);
        }
        int[] copyOf3 = Arrays.copyOf(copyOf, copyOf.length);
        int length7 = copyOf2.length;
        int[] iArr17 = new int[length7];
        for (int i72 = 0; i72 < length7; i72++) {
            iArr17[i72] = -copyOf2[i72];
        }
        int i73 = i47 + i66;
        int i74 = i46 + i65;
        int i75 = i74 < 0 ? 0 : i74;
        int b2 = b(copyOf3);
        boolean z17 = z2;
        int i76 = i66;
        int i77 = 0;
        long j10 = 0;
        while (true) {
            i4 = i3;
            if (b2 == -1) {
                i5 = i64;
                break;
            }
            i5 = i64;
            if (i77 >= i5) {
                break;
            }
            int i78 = i77;
            int i79 = copyOf3[b2];
            int[] iArr18 = copyOf;
            int length8 = copyOf3.length;
            int[] iArr19 = copyOf2;
            int i80 = i50;
            int i81 = Integer.MAX_VALUE;
            int i82 = 0;
            int i83 = -1;
            while (i82 < length8) {
                int i84 = length8;
                int i85 = i79 + 1;
                int i86 = i82;
                int i87 = copyOf3[i86];
                if (i85 <= i87 && i87 < i81) {
                    i81 = i87;
                    i83 = i86;
                }
                i82 = i86 + 1;
                length8 = i84;
            }
            int i88 = i78 + 1;
            if (i79 >= 0) {
                long a = exyVar3.a(uwyVar5, i79, b2);
                nxy L0 = dxyVar3.L0(i79, a);
                dxy dxyVar4 = dxyVar3;
                int i89 = (int) (a & 4294967295L);
                int[] iArr20 = copyOf3;
                int i90 = (int) (a >> 32);
                int i91 = i89 - i90;
                bxyVar3.i(i79, i91 != 1 ? -2 : i90);
                int c = c(a, iArr17);
                for (int i92 = i90; i92 < i89; i92++) {
                    iArr17[i92] = L0.n + c;
                    iArr20[i92] = i79;
                    sk3VarArr[i92].addLast(L0);
                }
                if (c < i73 && iArr17[i90] <= i73) {
                    L0.l = false;
                    z17 = true;
                }
                if (i91 != 1) {
                    exyVar3 = exyVar;
                    copyOf2 = iArr19;
                    i64 = i5;
                    i77 = i64;
                } else {
                    exyVar3 = exyVar;
                    i77 = i88;
                    copyOf2 = iArr19;
                    i64 = i5;
                }
                copyOf3 = iArr20;
                b2 = i83;
                copyOf = iArr18;
                i50 = i80;
                dxyVar3 = dxyVar4;
            } else {
                exyVar3 = exyVar;
                i77 = i88;
                copyOf2 = iArr19;
                i64 = i5;
                b2 = i83;
                copyOf = iArr18;
                i50 = i80;
            }
            i3 = i4;
        }
        int[] iArr21 = copyOf2;
        int[] iArr22 = copyOf;
        int i93 = i50;
        dxy dxyVar5 = dxyVar3;
        int[] iArr23 = copyOf3;
        loop15: while (true) {
            int i94 = 0;
            while (true) {
                if (i94 < length7) {
                    int i95 = iArr17[i94];
                    if (i95 < i75 || i95 <= 0) {
                        break;
                    }
                    i94++;
                } else {
                    for (int i96 = 0; i96 < i5; i96++) {
                        if (!sk3VarArr[i96].isEmpty()) {
                            i6 = i63;
                            i7 = 1;
                            break loop15;
                        }
                    }
                }
            }
            int b3 = b(iArr17);
            i7 = 1;
            int g0 = rl3.g0(iArr23) + 1;
            i6 = i63;
            if (g0 >= i6) {
                break;
            }
            uwy uwyVar6 = uwyVar5;
            int i97 = i5;
            int[] iArr24 = iArr23;
            List<twy> list10 = list8;
            long j11 = j6;
            int i98 = i76;
            uxy uxyVar6 = uxyVar;
            int i99 = i93;
            dxy dxyVar6 = dxyVar5;
            int[] iArr25 = iArr21;
            int i100 = length7;
            bxy bxyVar4 = bxyVar3;
            int[] iArr26 = iArr17;
            List<Integer> list11 = list9;
            qty qtyVar5 = qtyVar;
            int[] iArr27 = iArr22;
            int i101 = i75;
            int i102 = i65;
            long j12 = j7;
            boolean z18 = z17;
            int i103 = i4;
            long a2 = exyVar.a(uwyVar6, g0, b3);
            int i104 = (int) (a2 & j12);
            int i105 = i47;
            int i106 = (int) (a2 >> 32);
            int i107 = i104 - i106;
            if (i107 != 1) {
                i41 = i106;
                bxyVar = bxyVar4;
                i40 = -2;
            } else {
                i40 = i106;
                bxyVar = bxyVar4;
                i41 = i40;
            }
            bxyVar.i(g0, i40);
            nxy L02 = dxyVar6.L0(g0, a2);
            int c2 = c(a2, iArr26);
            if (i107 != 1) {
                iArr13 = bxyVar.e(g0);
                i42 = i97;
                if (iArr13 == null) {
                    iArr13 = new int[i42];
                }
            } else {
                i42 = i97;
                iArr13 = null;
            }
            int i108 = i42;
            int i109 = i41;
            while (i109 < i104) {
                if (iArr13 != null) {
                    iArr13[i109] = c2 - iArr26[i109];
                }
                iArr24[i109] = g0;
                int i110 = i109;
                iArr26[i110] = L02.n + c2;
                sk3VarArr[i110].addLast(L02);
                i109 = i110 + 1;
            }
            sk3<bxy.a> sk3Var = bxyVar.c;
            int h = bxy.h(g0, sk3Var);
            if (h >= 0) {
                bxyVar2 = bxyVar;
                if (iArr13 == null) {
                    sk3Var.remove(h);
                } else {
                    sk3Var.get(h).b = iArr13;
                }
            } else if (iArr13 == null) {
                bxyVar2 = bxyVar;
            } else {
                bxyVar2 = bxyVar;
                sk3Var.add(-(h + 1), new bxy.a(g0, iArr13));
            }
            if (c2 < i73 && iArr26[i41] <= i73) {
                L02.l = false;
            }
            iArr21 = iArr25;
            i76 = i98;
            z17 = z18;
            length7 = i100;
            i47 = i105;
            j6 = j11;
            uxyVar = uxyVar6;
            qtyVar = qtyVar5;
            list8 = list10;
            iArr23 = iArr24;
            i5 = i108;
            iArr17 = iArr26;
            i93 = i99;
            i63 = i6;
            bxyVar3 = bxyVar2;
            dxyVar5 = dxyVar6;
            uwyVar5 = uwyVar6;
            list9 = list11;
            i4 = i103;
            j7 = j12;
            j10 = 0;
            i65 = i102;
            i75 = i101;
            iArr22 = iArr27;
        }
        int i111 = 0;
        while (i111 < i5) {
            sk3 sk3Var2 = sk3VarArr[i111];
            while (sk3Var2.size() > i7 && !((nxy) sk3Var2.first()).l) {
                nxy nxyVar = (nxy) sk3Var2.removeFirst();
                int[] e = nxyVar.f != i7 ? bxyVar3.e(nxyVar.a) : null;
                iArr21[i111] = iArr21[i111] - (nxyVar.n + (e == null ? 0 : e[i111]));
                i7 = 1;
            }
            nxy nxyVar2 = (nxy) sk3Var2.d();
            iArr22[i111] = nxyVar2 != null ? nxyVar2.a : -1;
            i111++;
            i7 = 1;
        }
        int length9 = iArr23.length;
        int i112 = 0;
        while (true) {
            if (i112 >= length9) {
                break;
            }
            if (iArr23[i112] == i6 - 1) {
                f(-i47, iArr17);
                break;
            }
            i112++;
        }
        int i113 = 0;
        while (true) {
            if (i113 < length7) {
                i8 = i65;
                if (iArr17[i113] >= i8) {
                    exyVar2 = exyVar;
                    i16 = i4;
                    iArr3 = iArr21;
                    i13 = i6;
                    uwyVar = uwyVar5;
                    i14 = i5;
                    i9 = length7;
                    qtyVar2 = qtyVar;
                    iArr4 = iArr22;
                    i10 = i93;
                    dxyVar = dxyVar5;
                    i11 = i16;
                    iArr5 = iArr23;
                    i15 = i75;
                    break;
                }
                i113++;
                i65 = i8;
            } else {
                i8 = i65;
                int i114 = i8 - iArr17[a(iArr17)];
                iArr3 = iArr21;
                f(-i114, iArr3);
                f(i114, iArr17);
                boolean z19 = false;
                loop43: while (true) {
                    int length10 = iArr3.length;
                    int i115 = 0;
                    while (true) {
                        if (i115 >= length10) {
                            exyVar2 = exyVar;
                            i9 = length7;
                            i10 = i93;
                            i11 = i4;
                            i12 = i114;
                            iArr4 = iArr22;
                            i13 = i6;
                            uwyVar = uwyVar5;
                            i14 = i5;
                            dxyVar = dxyVar5;
                            iArr5 = iArr23;
                            i15 = i75;
                            break loop43;
                        }
                        int i116 = length10;
                        i10 = i93;
                        if (iArr3[i115] < i10) {
                            break;
                        }
                        i115++;
                        uwyVar5 = uwyVar5;
                        i93 = i10;
                        iArr22 = iArr22;
                        length10 = i116;
                        i114 = i114;
                        i4 = i4;
                        length7 = length7;
                    }
                    i6 = i21;
                    dxyVar5 = dxyVar2;
                    z19 = z3;
                    i75 = i20;
                    iArr23 = iArr6;
                    uwyVar5 = uwyVar2;
                    i5 = i22;
                    i93 = i10;
                    iArr22 = iArr7;
                    i114 = i19;
                    i4 = i18;
                    length7 = i17;
                }
                if (z19 && z) {
                    bxyVar3.g();
                    return d(exyVar2, i11, iArr4, iArr3, false);
                }
                i16 = i11 + i12;
                int i117 = iArr3[b(iArr3)];
                if (i117 < 0) {
                    i16 += i117;
                    f(i117, iArr17);
                    f(-i117, iArr3);
                }
                qtyVar2 = qtyVar;
            }
        }
        ztm0 ztm0Var3 = qtyVar2.c;
        ztm0 ztm0Var4 = qtyVar2.c;
        if (ztm0Var3.z1()) {
            uxyVar2 = uxyVar;
        } else {
            uxyVar2 = uxyVar;
            if (uxyVar2.a) {
                f = ((Number) ((zak0) uxyVar2.w.b.c).getValue()).floatValue();
                final qty qtyVar6 = qtyVar2;
                float f4 = (Integer.signum(Math.round(f)) == Integer.signum(i16) || Math.abs(Math.round(f)) < Math.abs(i16)) ? f : i16;
                f2 = f - f4;
                z1 = ztm0Var4.z1();
                f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (z1 && i16 > i11 && f2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f3 = (i16 - i11) + f2;
                }
                int[] copyOf4 = Arrays.copyOf(iArr3, iArr3.length);
                length = copyOf4.length;
                for (i23 = 0; i23 < length; i23++) {
                    copyOf4[i23] = -copyOf4[i23];
                }
                i24 = i14;
                if (i10 > i47) {
                    int i118 = 0;
                    while (i118 < i24) {
                        sk3 sk3Var3 = sk3VarArr[i118];
                        int size4 = sk3Var3.size();
                        int i119 = i10;
                        int i120 = 0;
                        while (true) {
                            if (i120 >= size4) {
                                i38 = i118;
                                break;
                            }
                            i38 = i118;
                            nxy nxyVar3 = (nxy) sk3Var3.get(i120);
                            int i121 = size4;
                            int[] e2 = bxyVar3.e(nxyVar3.a);
                            int i122 = nxyVar3.n + (e2 == null ? 0 : e2[i38]);
                            if (i120 != e43.h(sk3Var3) && (i39 = iArr3[i38]) != 0 && i39 >= i122) {
                                iArr3[i38] = i39 - i122;
                                i120++;
                                iArr4[i38] = ((nxy) sk3Var3.get(i120)).a;
                                size4 = i121;
                                i118 = i38;
                            }
                        }
                        i118 = i38 + 1;
                        i10 = i119;
                    }
                }
                int i123 = i10;
                int i124 = i46 + i123;
                if (z14) {
                    ztm0Var = ztm0Var4;
                    iArr8 = iArr17;
                    j2 = j6;
                    g = s6j.g(rl3.g0(iArr17) + i124, j2);
                } else {
                    g = o6j.i(j6);
                    ztm0Var = ztm0Var4;
                    iArr8 = iArr17;
                    j2 = j6;
                }
                int i125 = g;
                int f5 = !z14 ? s6j.f(rl3.g0(iArr8) + i124, j2) : o6j.h(j2);
                int min2 = i46 + (Math.min(!z14 ? f5 : i125, i8) - i123);
                int i126 = copyOf4[0];
                ztm0Var2 = ztm0Var;
                size = list9.size() - 1;
                if (size < 0) {
                    int i127 = size;
                    list3 = null;
                    while (true) {
                        int i128 = i127 - 1;
                        i25 = i124;
                        list2 = list9;
                        int intValue = list2.get(i127).intValue();
                        int i129 = i126;
                        int f6 = bxyVar3.f(intValue);
                        iArr9 = iArr4;
                        if (f6 == -2 || f6 == -1) {
                            for (int i130 = 0; i130 < i24; i130++) {
                                nxy nxyVar4 = (nxy) sk3VarArr[i130].d();
                                if (!((nxyVar4 != null ? nxyVar4.a : -1) > intValue)) {
                                    z12 = false;
                                    break;
                                }
                            }
                            z12 = true;
                        } else {
                            nxy nxyVar5 = (nxy) sk3VarArr[f6].d();
                        }
                        j3 = j2;
                        if (z12) {
                            uwyVar3 = uwyVar;
                            long a3 = exyVar2.a(uwyVar3, intValue, 0);
                            if (list3 == null) {
                                list3 = new ArrayList();
                            }
                            List list12 = list3;
                            nxy L03 = dxyVar.L0(intValue, a3);
                            i37 = i129 - L03.n;
                            L03.p(i37, 0, min2);
                            list12.add(L03);
                            list3 = list12;
                        } else {
                            uwyVar3 = uwyVar;
                            i37 = i129;
                        }
                        if (i128 < 0) {
                            break;
                        }
                        uwyVar = uwyVar3;
                        i126 = i37;
                        iArr4 = iArr9;
                        i127 = i128;
                        j2 = j3;
                        list9 = list2;
                        i124 = i25;
                    }
                } else {
                    i25 = i124;
                    j3 = j2;
                    list2 = list9;
                    uwyVar3 = uwyVar;
                    iArr9 = iArr4;
                    list3 = null;
                }
                if (list3 == null) {
                    list3 = EmptyList.b;
                }
                int i131 = 0;
                for (i26 = 0; i26 < i24; i26++) {
                    i131 += sk3VarArr[i26].size();
                }
                ArrayList arrayList3 = new ArrayList(i131);
                loop27: while (true) {
                    i27 = 0;
                    while (i27 < i24) {
                        if (sk3VarArr[i27].isEmpty()) {
                            i27++;
                            sxyVar2 = sxyVar2;
                        } else {
                            int i132 = Integer.MAX_VALUE;
                            int i133 = -1;
                            int i134 = 0;
                            while (i134 < i24) {
                                int i135 = i134;
                                nxy nxyVar6 = (nxy) sk3VarArr[i134].d();
                                int i136 = nxyVar6 != null ? nxyVar6.a : Integer.MAX_VALUE;
                                if (i132 > i136) {
                                    i132 = i136;
                                    i133 = i135;
                                }
                                i134 = i135 + 1;
                            }
                            nxy nxyVar7 = (nxy) sk3VarArr[i133].removeFirst();
                            int i137 = nxyVar7.e;
                            if (i137 == i133) {
                                int i138 = i133;
                                int i139 = i24;
                                float f7 = f4;
                                long j13 = (i137 << 32) | ((nxyVar7.f + i137) & j7);
                                int c3 = c(j13, copyOf4);
                                sxy sxyVar3 = sxyVar2;
                                int[] iArr28 = copyOf4;
                                int i140 = ((int[]) sxyVar3.a)[i138];
                                int i141 = i76;
                                if (nxyVar7.m + c3 >= i141) {
                                    int i142 = i15;
                                    if (c3 <= i142) {
                                        nxyVar7.p(c3, i140, min2);
                                        arrayList3.add(nxyVar7);
                                    }
                                    i15 = i142;
                                }
                                i76 = i141;
                                int i143 = (int) (j13 & j7);
                                for (int i144 = (int) (j13 >> 32); i144 < i143; i144++) {
                                    iArr28[i144] = nxyVar7.n + c3;
                                }
                                copyOf4 = iArr28;
                                f4 = f7;
                                i24 = i139;
                                sxyVar2 = sxyVar3;
                            }
                        }
                    }
                    break loop27;
                }
                float f8 = f4;
                sxy sxyVar4 = sxyVar2;
                int i145 = copyOf4[0];
                nxy nxyVar8 = (nxy) j5g.k0(arrayList3);
                int i146 = nxyVar8 == null ? nxyVar8.a : -1;
                if (ztm0Var2.z1() && list8 != null && !list8.isEmpty()) {
                    size3 = list8.size() - 1;
                    while (-1 < size3) {
                        list5 = list8;
                        if (list5.get(size3).getIndex() > i146 && (size3 == 0 || list5.get(size3 - 1).getIndex() <= i146)) {
                            twyVar = list5.get(size3);
                            break;
                        }
                        size3--;
                        list8 = list5;
                    }
                    list5 = list8;
                    twyVar = null;
                    twy twyVar3 = (twy) j5g.i0(list5);
                    if (twyVar != null && (index = twyVar.getIndex()) <= (min = Math.min(twyVar3.getIndex(), i13 - 1))) {
                        arrayList = null;
                        while (true) {
                            if (arrayList == null) {
                                i28 = i8;
                                int size5 = arrayList.size();
                                iArr10 = iArr3;
                                int i147 = 0;
                                while (true) {
                                    if (i147 >= size5) {
                                        z11 = false;
                                        break;
                                    }
                                    int i148 = i147;
                                    if (((nxy) arrayList.get(i147)).a == index) {
                                        z11 = true;
                                        break;
                                    }
                                    i147 = i148 + 1;
                                }
                                if (z11) {
                                    z10 = true;
                                    if (z10) {
                                        uxyVar3 = uxyVar2;
                                        list4 = list2;
                                    } else {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        int size6 = list5.size();
                                        int i149 = 0;
                                        while (true) {
                                            if (i149 >= size6) {
                                                twyVar2 = null;
                                                break;
                                            }
                                            twyVar2 = list5.get(i149);
                                            int i150 = size6;
                                            if (twyVar2.getIndex() == index) {
                                                break;
                                            }
                                            i149++;
                                            size6 = i150;
                                        }
                                        twy twyVar4 = twyVar2;
                                        int c4 = twyVar4 != null ? twyVar4.c() : 0;
                                        uxy uxyVar7 = uxyVar2;
                                        list4 = list2;
                                        nxy L04 = dxyVar.L0(index, exyVar2.a(uwyVar3, index, c4));
                                        arrayList.add(L04);
                                        int[] iArr29 = (int[]) sxyVar4.a;
                                        uxyVar3 = uxyVar7;
                                        L04.p(i145, iArr29.length > c4 ? iArr29[c4] : 0, min2);
                                        i145 = L04.n + i145;
                                    }
                                    if (index == min) {
                                        break;
                                    }
                                    index++;
                                    uxyVar2 = uxyVar3;
                                    i8 = i28;
                                    iArr3 = iArr10;
                                    list2 = list4;
                                }
                            } else {
                                iArr10 = iArr3;
                                i28 = i8;
                            }
                            z10 = false;
                            if (z10) {
                            }
                            if (index == min) {
                            }
                        }
                        size2 = list4.size();
                        i29 = 0;
                        while (i29 < size2) {
                            List<Integer> list13 = list4;
                            int intValue2 = list13.get(i29).intValue();
                            int i151 = i13;
                            if (intValue2 < i151) {
                                if (arrayList != null) {
                                    int size7 = arrayList.size();
                                    int i152 = 0;
                                    while (true) {
                                        if (i152 >= size7) {
                                            z9 = false;
                                            break;
                                        }
                                        if (((nxy) arrayList.get(i152)).a == intValue2) {
                                            z9 = true;
                                            break;
                                        }
                                        i152++;
                                    }
                                    if (z9) {
                                        z7 = true;
                                        if (!z7) {
                                            int f9 = bxyVar3.f(intValue2);
                                            if (f9 == -2 || f9 == -1) {
                                                iArr12 = iArr5;
                                                int length11 = iArr12.length;
                                                int i153 = 0;
                                                while (i153 < length11) {
                                                    i36 = size2;
                                                    if (!(iArr12[i153] < intValue2)) {
                                                        z8 = false;
                                                        break;
                                                    }
                                                    i153++;
                                                    size2 = i36;
                                                }
                                                i36 = size2;
                                            } else if (iArr5[f9] < intValue2) {
                                                i36 = size2;
                                                iArr12 = iArr5;
                                            }
                                            z8 = true;
                                            bxy bxyVar5 = bxyVar3;
                                            if (!z8) {
                                                long a4 = exyVar2.a(uwyVar3, intValue2, 0);
                                                if (list == null) {
                                                    list = new ArrayList();
                                                }
                                                List list14 = list;
                                                nxy L05 = dxyVar.L0(intValue2, a4);
                                                L05.p(i145, 0, min2);
                                                int i154 = L05.n + i145;
                                                list14.add(L05);
                                                i145 = i154;
                                                list = list14;
                                            }
                                            i29++;
                                            size2 = i36;
                                            iArr5 = iArr12;
                                            i13 = i151;
                                            bxyVar3 = bxyVar5;
                                            list4 = list13;
                                        }
                                    }
                                }
                                z7 = false;
                                if (!z7) {
                                }
                            }
                            i36 = size2;
                            iArr12 = iArr5;
                            z8 = false;
                            bxy bxyVar52 = bxyVar3;
                            if (!z8) {
                            }
                            i29++;
                            size2 = i36;
                            iArr5 = iArr12;
                            i13 = i151;
                            bxyVar3 = bxyVar52;
                            list4 = list13;
                        }
                        int i155 = i13;
                        int[] iArr30 = iArr5;
                        if (list == null) {
                            list = EmptyList.b;
                        }
                        ArrayList arrayList4 = new ArrayList();
                        arrayList4.addAll(list3);
                        arrayList4.addAll(arrayList3);
                        if (arrayList != null) {
                            arrayList4.addAll(arrayList);
                        }
                        arrayList4.addAll(list);
                        uxy uxyVar8 = uxyVar3;
                        bty<nxy> btyVar = uxyVar8.t;
                        int i156 = (int) f8;
                        jty a5 = dxyVar.e.a();
                        dxy dxyVar7 = exyVar2.q;
                        boolean z20 = exyVar2.f;
                        int i157 = exyVar2.s;
                        boolean z110 = ztm0Var2.z1();
                        boolean z21 = exyVar2.n;
                        iArr11 = iArr10;
                        if (iArr11.length != 0) {
                            throw new NoSuchElementException();
                        }
                        int i158 = iArr11[0];
                        int length12 = iArr11.length - 1;
                        if (1 <= length12) {
                            arrayList2 = arrayList4;
                            int i159 = i158;
                            int i160 = 1;
                            while (true) {
                                int i161 = iArr11[i160];
                                if (i159 > i161) {
                                    i159 = i161;
                                }
                                if (i160 == length12) {
                                    break;
                                }
                                i160++;
                            }
                            i30 = i159;
                        } else {
                            arrayList2 = arrayList4;
                            i30 = i158;
                        }
                        btyVar.d(i156, i125, f5, arrayList2, a5, dxyVar7, z20, z110, i157, z21, i30, rl3.g0(iArr8) + i25, exyVar2.m, exyVar2.p);
                        final ArrayList arrayList5 = arrayList2;
                        if (!ztm0Var2.z1()) {
                            long b4 = uxyVar8.t.b();
                            if (!q9x.b(b4, j10)) {
                                int i162 = z14 ? f5 : i125;
                                int max = Math.max(i125, (int) (b4 >> 32));
                                long j14 = j3;
                                int g2 = s6j.g(max, j14);
                                uwyVar4 = uwyVar3;
                                int f10 = s6j.f(Math.max(f5, (int) (b4 & j7)), j14);
                                int i163 = z14 ? f10 : g2;
                                if (i163 != i162) {
                                    int size8 = arrayList5.size();
                                    for (int i164 = 0; i164 < size8; i164++) {
                                        nxy nxyVar9 = (nxy) arrayList5.get(i164);
                                        nxyVar9.o = i163;
                                        nxyVar9.q = nxyVar9.h + i163;
                                    }
                                }
                                i32 = g2;
                                i31 = f10;
                                i33 = i9;
                                i34 = 0;
                                while (true) {
                                    if (i34 >= i33) {
                                        z4 = false;
                                        break;
                                    }
                                    i35 = i28;
                                    if (iArr8[i34] > i35) {
                                        z4 = true;
                                        break;
                                    }
                                    i34++;
                                    i28 = i35;
                                }
                                if (!z4) {
                                    int length13 = iArr30.length;
                                    int i165 = 0;
                                    while (true) {
                                        if (i165 >= length13) {
                                            z6 = true;
                                            break;
                                        }
                                        if (!(iArr30[i165] < i155 + (-1))) {
                                            z6 = false;
                                            break;
                                        }
                                        i165++;
                                    }
                                    if (!z6) {
                                        j4 = j7;
                                        z5 = false;
                                        final long j15 = exyVar2.i;
                                        final boolean z22 = false;
                                        final exy exyVar4 = exyVar2;
                                        return new lxy(iArr9, iArr11, f8, qtyVar6.Q(i32, i31, jgp.b, new izs() { // from class: xsna.fxy
                                            @Override // xsna.izs
                                            public final Object invoke(Object obj) {
                                                tra0.a aVar = (tra0.a) obj;
                                                final ArrayList arrayList6 = arrayList5;
                                                final boolean z23 = z22;
                                                final long j16 = j15;
                                                final pty ptyVar = qtyVar6;
                                                izs izsVar = new izs() { // from class: xsna.gxy
                                                    @Override // xsna.izs
                                                    public final Object invoke(Object obj2) {
                                                        boolean z24;
                                                        boolean z25;
                                                        List<tra0> list15;
                                                        int i166;
                                                        mdu mduVar;
                                                        tra0.a aVar2 = (tra0.a) obj2;
                                                        ArrayList arrayList7 = arrayList6;
                                                        int size9 = arrayList7.size();
                                                        int i167 = 0;
                                                        while (i167 < size9) {
                                                            nxy nxyVar10 = (nxy) arrayList7.get(i167);
                                                            boolean z111 = ptyVar.z1();
                                                            boolean z26 = nxyVar10.d;
                                                            if (nxyVar10.o == Integer.MIN_VALUE) {
                                                                xzw.a("position() should be called first");
                                                            }
                                                            List<tra0> list16 = nxyVar10.c;
                                                            int i168 = 0;
                                                            for (int size10 = list16.size(); i168 < size10; size10 = i166) {
                                                                tra0 tra0Var = list16.get(i168);
                                                                int i169 = nxyVar10.p - (z26 ? tra0Var.c : tra0Var.b);
                                                                int i170 = nxyVar10.q;
                                                                int i171 = i167;
                                                                long j17 = nxyVar10.t;
                                                                ArrayList arrayList8 = arrayList7;
                                                                int i172 = size9;
                                                                wsy a6 = nxyVar10.j.a(i168, nxyVar10.b);
                                                                if (a6 != null) {
                                                                    if (z111) {
                                                                        a6.r = j17;
                                                                        z24 = z111;
                                                                        z25 = z26;
                                                                        list15 = list16;
                                                                        i166 = size10;
                                                                    } else {
                                                                        z24 = z111;
                                                                        z25 = z26;
                                                                        list15 = list16;
                                                                        i166 = size10;
                                                                        long d = h9x.d(!h9x.b(a6.r, wsy.s) ? a6.r : j17, ((h9x) ((zak0) a6.q).getValue()).a);
                                                                        if ((nxyVar10.i(j17) <= i169 && nxyVar10.i(d) <= i169) || (nxyVar10.i(j17) >= i170 && nxyVar10.i(d) >= i170)) {
                                                                            a6.b();
                                                                        }
                                                                        j17 = d;
                                                                    }
                                                                    mduVar = a6.n;
                                                                } else {
                                                                    z24 = z111;
                                                                    z25 = z26;
                                                                    list15 = list16;
                                                                    i166 = size10;
                                                                    mduVar = null;
                                                                }
                                                                if (z23) {
                                                                    int i173 = z25 ? (int) (j17 >> 32) : (nxyVar10.o - ((int) (j17 >> 32))) - (z25 ? tra0Var.c : tra0Var.b);
                                                                    j17 = ((z25 ? (nxyVar10.o - ((int) (j17 & 4294967295L))) - (z25 ? tra0Var.c : tra0Var.b) : (int) (j17 & 4294967295L)) & 4294967295L) | (i173 << 32);
                                                                }
                                                                long d2 = h9x.d(j17, j16);
                                                                if (!z24 && a6 != null) {
                                                                    a6.m = d2;
                                                                }
                                                                if (mduVar != null) {
                                                                    tra0.a.F(aVar2, tra0Var, d2, mduVar);
                                                                } else {
                                                                    tra0.a.D(aVar2, tra0Var, d2);
                                                                }
                                                                i168++;
                                                                z111 = z24;
                                                                i167 = i171;
                                                                arrayList7 = arrayList8;
                                                                size9 = i172;
                                                                z26 = z25;
                                                                list16 = list15;
                                                            }
                                                            i167++;
                                                        }
                                                        return s3q0.a;
                                                    }
                                                };
                                                aVar.b = true;
                                                izsVar.invoke(aVar);
                                                aVar.b = false;
                                                exy.this.a.u.getValue();
                                                return s3q0.a;
                                            }
                                        }), f3, z5, exyVar2.f, z17, exyVar2.d, uwyVar4.d(), qtyVar6, i155, arrayList3, (i32 << 32) | (i31 & j4), i76, i15, exyVar2.j, exyVar2.k, exyVar2.l, exyVar2.m);
                                    }
                                }
                                j4 = j7;
                                z5 = true;
                                final long j152 = exyVar2.i;
                                final boolean z222 = false;
                                final exy exyVar42 = exyVar2;
                                return new lxy(iArr9, iArr11, f8, qtyVar6.Q(i32, i31, jgp.b, new izs() { // from class: xsna.fxy
                                    @Override // xsna.izs
                                    public final Object invoke(Object obj) {
                                        tra0.a aVar = (tra0.a) obj;
                                        final ArrayList arrayList6 = arrayList5;
                                        final boolean z23 = z222;
                                        final long j16 = j152;
                                        final pty ptyVar = qtyVar6;
                                        izs izsVar = new izs() { // from class: xsna.gxy
                                            @Override // xsna.izs
                                            public final Object invoke(Object obj2) {
                                                boolean z24;
                                                boolean z25;
                                                List<tra0> list15;
                                                int i166;
                                                mdu mduVar;
                                                tra0.a aVar2 = (tra0.a) obj2;
                                                ArrayList arrayList7 = arrayList6;
                                                int size9 = arrayList7.size();
                                                int i167 = 0;
                                                while (i167 < size9) {
                                                    nxy nxyVar10 = (nxy) arrayList7.get(i167);
                                                    boolean z111 = ptyVar.z1();
                                                    boolean z26 = nxyVar10.d;
                                                    if (nxyVar10.o == Integer.MIN_VALUE) {
                                                        xzw.a("position() should be called first");
                                                    }
                                                    List<tra0> list16 = nxyVar10.c;
                                                    int i168 = 0;
                                                    for (int size10 = list16.size(); i168 < size10; size10 = i166) {
                                                        tra0 tra0Var = list16.get(i168);
                                                        int i169 = nxyVar10.p - (z26 ? tra0Var.c : tra0Var.b);
                                                        int i170 = nxyVar10.q;
                                                        int i171 = i167;
                                                        long j17 = nxyVar10.t;
                                                        ArrayList arrayList8 = arrayList7;
                                                        int i172 = size9;
                                                        wsy a6 = nxyVar10.j.a(i168, nxyVar10.b);
                                                        if (a6 != null) {
                                                            if (z111) {
                                                                a6.r = j17;
                                                                z24 = z111;
                                                                z25 = z26;
                                                                list15 = list16;
                                                                i166 = size10;
                                                            } else {
                                                                z24 = z111;
                                                                z25 = z26;
                                                                list15 = list16;
                                                                i166 = size10;
                                                                long d = h9x.d(!h9x.b(a6.r, wsy.s) ? a6.r : j17, ((h9x) ((zak0) a6.q).getValue()).a);
                                                                if ((nxyVar10.i(j17) <= i169 && nxyVar10.i(d) <= i169) || (nxyVar10.i(j17) >= i170 && nxyVar10.i(d) >= i170)) {
                                                                    a6.b();
                                                                }
                                                                j17 = d;
                                                            }
                                                            mduVar = a6.n;
                                                        } else {
                                                            z24 = z111;
                                                            z25 = z26;
                                                            list15 = list16;
                                                            i166 = size10;
                                                            mduVar = null;
                                                        }
                                                        if (z23) {
                                                            int i173 = z25 ? (int) (j17 >> 32) : (nxyVar10.o - ((int) (j17 >> 32))) - (z25 ? tra0Var.c : tra0Var.b);
                                                            j17 = ((z25 ? (nxyVar10.o - ((int) (j17 & 4294967295L))) - (z25 ? tra0Var.c : tra0Var.b) : (int) (j17 & 4294967295L)) & 4294967295L) | (i173 << 32);
                                                        }
                                                        long d2 = h9x.d(j17, j16);
                                                        if (!z24 && a6 != null) {
                                                            a6.m = d2;
                                                        }
                                                        if (mduVar != null) {
                                                            tra0.a.F(aVar2, tra0Var, d2, mduVar);
                                                        } else {
                                                            tra0.a.D(aVar2, tra0Var, d2);
                                                        }
                                                        i168++;
                                                        z111 = z24;
                                                        i167 = i171;
                                                        arrayList7 = arrayList8;
                                                        size9 = i172;
                                                        z26 = z25;
                                                        list16 = list15;
                                                    }
                                                    i167++;
                                                }
                                                return s3q0.a;
                                            }
                                        };
                                        aVar.b = true;
                                        izsVar.invoke(aVar);
                                        aVar.b = false;
                                        exy.this.a.u.getValue();
                                        return s3q0.a;
                                    }
                                }), f3, z5, exyVar2.f, z17, exyVar2.d, uwyVar4.d(), qtyVar6, i155, arrayList3, (i32 << 32) | (i31 & j4), i76, i15, exyVar2.j, exyVar2.k, exyVar2.l, exyVar2.m);
                            }
                        }
                        uwyVar4 = uwyVar3;
                        i31 = f5;
                        i32 = i125;
                        i33 = i9;
                        i34 = 0;
                        while (true) {
                            if (i34 >= i33) {
                            }
                            i34++;
                            i28 = i35;
                        }
                        if (!z4) {
                        }
                        j4 = j7;
                        z5 = true;
                        final long j1522 = exyVar2.i;
                        final boolean z2222 = false;
                        final exy exyVar422 = exyVar2;
                        return new lxy(iArr9, iArr11, f8, qtyVar6.Q(i32, i31, jgp.b, new izs() { // from class: xsna.fxy
                            @Override // xsna.izs
                            public final Object invoke(Object obj) {
                                tra0.a aVar = (tra0.a) obj;
                                final ArrayList arrayList6 = arrayList5;
                                final boolean z23 = z2222;
                                final long j16 = j1522;
                                final pty ptyVar = qtyVar6;
                                izs izsVar = new izs() { // from class: xsna.gxy
                                    @Override // xsna.izs
                                    public final Object invoke(Object obj2) {
                                        boolean z24;
                                        boolean z25;
                                        List<tra0> list15;
                                        int i166;
                                        mdu mduVar;
                                        tra0.a aVar2 = (tra0.a) obj2;
                                        ArrayList arrayList7 = arrayList6;
                                        int size9 = arrayList7.size();
                                        int i167 = 0;
                                        while (i167 < size9) {
                                            nxy nxyVar10 = (nxy) arrayList7.get(i167);
                                            boolean z111 = ptyVar.z1();
                                            boolean z26 = nxyVar10.d;
                                            if (nxyVar10.o == Integer.MIN_VALUE) {
                                                xzw.a("position() should be called first");
                                            }
                                            List<tra0> list16 = nxyVar10.c;
                                            int i168 = 0;
                                            for (int size10 = list16.size(); i168 < size10; size10 = i166) {
                                                tra0 tra0Var = list16.get(i168);
                                                int i169 = nxyVar10.p - (z26 ? tra0Var.c : tra0Var.b);
                                                int i170 = nxyVar10.q;
                                                int i171 = i167;
                                                long j17 = nxyVar10.t;
                                                ArrayList arrayList8 = arrayList7;
                                                int i172 = size9;
                                                wsy a6 = nxyVar10.j.a(i168, nxyVar10.b);
                                                if (a6 != null) {
                                                    if (z111) {
                                                        a6.r = j17;
                                                        z24 = z111;
                                                        z25 = z26;
                                                        list15 = list16;
                                                        i166 = size10;
                                                    } else {
                                                        z24 = z111;
                                                        z25 = z26;
                                                        list15 = list16;
                                                        i166 = size10;
                                                        long d = h9x.d(!h9x.b(a6.r, wsy.s) ? a6.r : j17, ((h9x) ((zak0) a6.q).getValue()).a);
                                                        if ((nxyVar10.i(j17) <= i169 && nxyVar10.i(d) <= i169) || (nxyVar10.i(j17) >= i170 && nxyVar10.i(d) >= i170)) {
                                                            a6.b();
                                                        }
                                                        j17 = d;
                                                    }
                                                    mduVar = a6.n;
                                                } else {
                                                    z24 = z111;
                                                    z25 = z26;
                                                    list15 = list16;
                                                    i166 = size10;
                                                    mduVar = null;
                                                }
                                                if (z23) {
                                                    int i173 = z25 ? (int) (j17 >> 32) : (nxyVar10.o - ((int) (j17 >> 32))) - (z25 ? tra0Var.c : tra0Var.b);
                                                    j17 = ((z25 ? (nxyVar10.o - ((int) (j17 & 4294967295L))) - (z25 ? tra0Var.c : tra0Var.b) : (int) (j17 & 4294967295L)) & 4294967295L) | (i173 << 32);
                                                }
                                                long d2 = h9x.d(j17, j16);
                                                if (!z24 && a6 != null) {
                                                    a6.m = d2;
                                                }
                                                if (mduVar != null) {
                                                    tra0.a.F(aVar2, tra0Var, d2, mduVar);
                                                } else {
                                                    tra0.a.D(aVar2, tra0Var, d2);
                                                }
                                                i168++;
                                                z111 = z24;
                                                i167 = i171;
                                                arrayList7 = arrayList8;
                                                size9 = i172;
                                                z26 = z25;
                                                list16 = list15;
                                            }
                                            i167++;
                                        }
                                        return s3q0.a;
                                    }
                                };
                                aVar.b = true;
                                izsVar.invoke(aVar);
                                aVar.b = false;
                                exy.this.a.u.getValue();
                                return s3q0.a;
                            }
                        }), f3, z5, exyVar2.f, z17, exyVar2.d, uwyVar4.d(), qtyVar6, i155, arrayList3, (i32 << 32) | (i31 & j4), i76, i15, exyVar2.j, exyVar2.k, exyVar2.l, exyVar2.m);
                    }
                }
                iArr10 = iArr3;
                uxyVar3 = uxyVar2;
                list4 = list2;
                i28 = i8;
                arrayList = null;
                size2 = list4.size();
                i29 = 0;
                while (i29 < size2) {
                }
                int i1552 = i13;
                int[] iArr302 = iArr5;
                if (list == null) {
                }
                ArrayList arrayList42 = new ArrayList();
                arrayList42.addAll(list3);
                arrayList42.addAll(arrayList3);
                if (arrayList != null) {
                }
                arrayList42.addAll(list);
                uxy uxyVar82 = uxyVar3;
                bty<nxy> btyVar2 = uxyVar82.t;
                int i1562 = (int) f8;
                jty a52 = dxyVar.e.a();
                dxy dxyVar72 = exyVar2.q;
                boolean z202 = exyVar2.f;
                int i1572 = exyVar2.s;
                boolean z1102 = ztm0Var2.z1();
                boolean z212 = exyVar2.n;
                iArr11 = iArr10;
                if (iArr11.length != 0) {
                }
            }
        }
        f = uxyVar2.o;
        final pty qtyVar62 = qtyVar2;
        if (Integer.signum(Math.round(f)) == Integer.signum(i16)) {
        }
        f2 = f - f4;
        z1 = ztm0Var4.z1();
        f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (z1) {
            f3 = (i16 - i11) + f2;
        }
        int[] copyOf42 = Arrays.copyOf(iArr3, iArr3.length);
        length = copyOf42.length;
        while (i23 < length) {
        }
        i24 = i14;
        if (i10 > i47) {
        }
        int i1232 = i10;
        int i1242 = i46 + i1232;
        if (z14) {
        }
        int i1252 = g;
        int f52 = !z14 ? s6j.f(rl3.g0(iArr8) + i1242, j2) : o6j.h(j2);
        int min22 = i46 + (Math.min(!z14 ? f52 : i1252, i8) - i1232);
        int i1262 = copyOf42[0];
        ztm0Var2 = ztm0Var;
        size = list9.size() - 1;
        if (size < 0) {
        }
        if (list3 == null) {
        }
        int i1312 = 0;
        while (i26 < i24) {
        }
        ArrayList arrayList32 = new ArrayList(i1312);
        loop27: while (true) {
            i27 = 0;
            while (i27 < i24) {
            }
            break loop27;
        }
        float f82 = f4;
        sxy sxyVar42 = sxyVar2;
        int i1452 = copyOf42[0];
        nxy nxyVar82 = (nxy) j5g.k0(arrayList32);
        if (nxyVar82 == null) {
        }
        if (ztm0Var2.z1()) {
            size3 = list8.size() - 1;
            while (-1 < size3) {
            }
            list5 = list8;
            twyVar = null;
            twy twyVar32 = (twy) j5g.i0(list5);
            if (twyVar != null) {
                arrayList = null;
                while (true) {
                    if (arrayList == null) {
                    }
                    z10 = false;
                    if (z10) {
                    }
                    if (index == min) {
                    }
                    index++;
                    uxyVar2 = uxyVar3;
                    i8 = i28;
                    iArr3 = iArr10;
                    list2 = list4;
                }
                size2 = list4.size();
                i29 = 0;
                while (i29 < size2) {
                }
                int i15522 = i13;
                int[] iArr3022 = iArr5;
                if (list == null) {
                }
                ArrayList arrayList422 = new ArrayList();
                arrayList422.addAll(list3);
                arrayList422.addAll(arrayList32);
                if (arrayList != null) {
                }
                arrayList422.addAll(list);
                uxy uxyVar822 = uxyVar3;
                bty<nxy> btyVar22 = uxyVar822.t;
                int i15622 = (int) f82;
                jty a522 = dxyVar.e.a();
                dxy dxyVar722 = exyVar2.q;
                boolean z2022 = exyVar2.f;
                int i15722 = exyVar2.s;
                boolean z11022 = ztm0Var2.z1();
                boolean z2122 = exyVar2.n;
                iArr11 = iArr10;
                if (iArr11.length != 0) {
                }
            }
        }
        iArr10 = iArr3;
        uxyVar3 = uxyVar2;
        list4 = list2;
        i28 = i8;
        arrayList = null;
        size2 = list4.size();
        i29 = 0;
        while (i29 < size2) {
        }
        int i155222 = i13;
        int[] iArr30222 = iArr5;
        if (list == null) {
        }
        ArrayList arrayList4222 = new ArrayList();
        arrayList4222.addAll(list3);
        arrayList4222.addAll(arrayList32);
        if (arrayList != null) {
        }
        arrayList4222.addAll(list);
        uxy uxyVar8222 = uxyVar3;
        bty<nxy> btyVar222 = uxyVar8222.t;
        int i156222 = (int) f82;
        jty a5222 = dxyVar.e.a();
        dxy dxyVar7222 = exyVar2.q;
        boolean z20222 = exyVar2.f;
        int i157222 = exyVar2.s;
        boolean z110222 = ztm0Var2.z1();
        boolean z21222 = exyVar2.n;
        iArr11 = iArr10;
        if (iArr11.length != 0) {
        }
    }

    public static final boolean e(int[] iArr, exy exyVar, int[] iArr2, int i) {
        bxy bxyVar = exyVar.r;
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (bxyVar.d(iArr[i2], i2) == -1 && iArr2[i2] != iArr2[i]) {
                return true;
            }
        }
        int length2 = iArr.length;
        for (int i3 = 0; i3 < length2; i3++) {
            if (bxyVar.d(iArr[i3], i3) != -1 && iArr2[i3] >= iArr2[i]) {
                return true;
            }
        }
        int f = bxyVar.f(0);
        return (f == 0 || f == -1 || f == -2) ? false : true;
    }

    public static final void f(int i, int[] iArr) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = iArr[i2] + i;
        }
    }
}
