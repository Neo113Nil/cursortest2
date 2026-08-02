package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: LazyStaggeredGridState.kt */
/* loaded from: classes11.dex */
public final /* synthetic */ class vxy extends FunctionReferenceImpl implements wzs<Integer, Integer, int[]> {
    @Override // xsna.wzs
    public final int[] invoke(Integer num, Integer num2) {
        int i;
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        uxy uxyVar = (uxy) this.receiver;
        bxy bxyVar = uxyVar.e;
        int[] iArr = new int[intValue2];
        ((lxy) ((zak0) uxyVar.d).getValue()).j.e(intValue);
        bxyVar.c(intValue + intValue2);
        int f = bxyVar.f(intValue);
        if (f == -2 || f == -1) {
            i = 0;
        } else {
            if (f < 0) {
                xzw.a("Expected positive lane number, got " + f + " instead.");
            }
            i = Math.min(f, intValue2);
        }
        int i2 = i - 1;
        int i3 = intValue;
        while (true) {
            if (-1 >= i2) {
                break;
            }
            i3 = bxyVar.d(i3, i2);
            iArr[i2] = i3;
            if (i3 == -1) {
                jw5.o(-1, i2, 2, iArr);
                break;
            }
            i2--;
        }
        iArr[i] = intValue;
        while (true) {
            i++;
            if (i >= intValue2) {
                return iArr;
            }
            intValue++;
            int length = bxyVar.a + bxyVar.b.length;
            while (true) {
                if (intValue >= length) {
                    intValue = bxyVar.a + bxyVar.b.length;
                    break;
                }
                if (bxyVar.a(intValue, i)) {
                    break;
                }
                intValue++;
            }
            iArr[i] = intValue;
        }
    }
}
