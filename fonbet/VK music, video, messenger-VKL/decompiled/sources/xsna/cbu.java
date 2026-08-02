package xsna;

import com.unity3d.services.UnityAdsConstants;
import java.util.List;

/* compiled from: GradientColorKeyframeAnimation.java */
/* loaded from: classes12.dex */
public final class cbu extends phy<abu> {
    public final abu i;

    public cbu(List<nhy<abu>> list) {
        super(list);
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            abu abuVar = list.get(i2).b;
            if (abuVar != null) {
                i = Math.max(i, abuVar.b.length);
            }
        }
        this.i = new abu(new int[i], new float[i]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.tf6
    public final Object g(nhy nhyVar, float f) {
        abu abuVar = (abu) nhyVar.b;
        abu abuVar2 = (abu) nhyVar.c;
        abu abuVar3 = this.i;
        int[] iArr = abuVar3.b;
        float[] fArr = abuVar3.a;
        boolean equals = abuVar.equals(abuVar2);
        int[] iArr2 = abuVar.b;
        if (equals) {
            abuVar3.a(abuVar);
            return abuVar3;
        }
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            abuVar3.a(abuVar);
            return abuVar3;
        }
        if (f >= 1.0f) {
            abuVar3.a(abuVar2);
            return abuVar3;
        }
        int length = iArr2.length;
        int[] iArr3 = abuVar2.b;
        if (length != iArr3.length) {
            StringBuilder sb = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
            sb.append(iArr2.length);
            sb.append(" vs ");
            throw new IllegalArgumentException(h5s.c(iArr3.length, ")", sb));
        }
        for (int i = 0; i < iArr2.length; i++) {
            fArr[i] = ls20.f(abuVar.a[i], abuVar2.a[i], f);
            iArr[i] = zq70.p(f, iArr2[i], iArr3[i]);
        }
        for (int length2 = iArr2.length; length2 < fArr.length; length2++) {
            fArr[length2] = fArr[iArr2.length - 1];
            iArr[length2] = iArr[iArr2.length - 1];
        }
        return abuVar3;
    }
}
