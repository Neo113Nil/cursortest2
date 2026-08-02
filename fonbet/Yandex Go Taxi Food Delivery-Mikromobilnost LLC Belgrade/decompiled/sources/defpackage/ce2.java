package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes10.dex */
public final class ce2 extends r8 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ce2(ArrayList arrayList) {
        super(2, arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            rkx rkxVar = (rkx) arrayList.get(i);
            ext extVar = (ext) rkxVar.b;
            ext extVar2 = (ext) rkxVar.c;
            if (extVar != null && extVar2 != null) {
                float[] fArr = extVar.a;
                int length = fArr.length;
                float[] fArr2 = extVar2.a;
                if (length != fArr2.length) {
                    int length2 = fArr.length + fArr2.length;
                    float[] fArr3 = new float[length2];
                    System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
                    System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
                    Arrays.sort(fArr3);
                    float f = Float.NaN;
                    int i2 = 0;
                    for (int i3 = 0; i3 < length2; i3++) {
                        float f2 = fArr3[i3];
                        if (f2 != f) {
                            fArr3[i2] = f2;
                            i2++;
                            f = fArr3[i3];
                        }
                    }
                    float[] copyOfRange = Arrays.copyOfRange(fArr3, 0, i2);
                    rkxVar = new rkx(extVar.b(copyOfRange), extVar2.b(copyOfRange));
                }
            }
            arrayList.set(i, rkxVar);
        }
    }

    @Override // defpackage.ie2
    public final i35 I() {
        return new fxt((List) this.b);
    }
}
