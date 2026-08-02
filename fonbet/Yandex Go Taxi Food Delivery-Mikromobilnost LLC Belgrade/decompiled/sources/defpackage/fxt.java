package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class fxt extends skx {
    public final ext i;

    public fxt(List list) {
        super(list);
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            ext extVar = (ext) ((rkx) list.get(i2)).b;
            if (extVar != null) {
                i = Math.max(i, extVar.b.length);
            }
        }
        this.i = new ext(new int[i], new float[i]);
    }

    @Override // defpackage.i35
    public final Object g(rkx rkxVar, float f) {
        ext extVar = (ext) rkxVar.b;
        ext extVar2 = (ext) rkxVar.c;
        ext extVar3 = this.i;
        int[] iArr = extVar3.b;
        float[] fArr = extVar3.a;
        boolean equals = extVar.equals(extVar2);
        int[] iArr2 = extVar.b;
        if (equals) {
            extVar3.a(extVar);
            return extVar3;
        }
        if (f <= 0.0f) {
            extVar3.a(extVar);
            return extVar3;
        }
        if (f >= 1.0f) {
            extVar3.a(extVar2);
            return extVar3;
        }
        int length = iArr2.length;
        int[] iArr3 = extVar2.b;
        if (length != iArr3.length) {
            StringBuilder sb = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
            sb.append(iArr2.length);
            sb.append(" vs ");
            ny61.g(oyr.m(iArr3.length, Extension.C_BRAKE, sb));
            return null;
        }
        for (int i = 0; i < iArr2.length; i++) {
            fArr[i] = ti20.f(extVar.a[i], extVar2.a[i], f);
            iArr[i] = xss.c(f, iArr2[i], iArr3[i]);
        }
        for (int length2 = iArr2.length; length2 < fArr.length; length2++) {
            fArr[length2] = fArr[iArr2.length - 1];
            iArr[length2] = iArr[iArr2.length - 1];
        }
        return extVar3;
    }
}
