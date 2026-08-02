package defpackage;

import android.animation.TypeEvaluator;

/* loaded from: classes6.dex */
public final /* synthetic */ class akh implements TypeEvaluator {
    public final /* synthetic */ int a;

    public /* synthetic */ akh(int i) {
        this.a = i;
    }

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return f == 1.0f ? (Boolean) obj2 : (Boolean) obj;
            default:
                float[] fArr = (float[]) obj;
                float[] fArr2 = (float[]) obj2;
                return new float[]{mj2.a(fArr[0], fArr2[0], f), mj2.a(fArr[1], fArr2[1], f), mj2.a(fArr[2], fArr2[2], f), mj2.a(fArr[3], fArr2[3], f), mj2.a(fArr[4], fArr2[4], f), mj2.a(fArr[5], fArr2[5], f), mj2.a(fArr[6], fArr2[6], f), mj2.a(fArr[7], fArr2[7], f)};
        }
    }
}
