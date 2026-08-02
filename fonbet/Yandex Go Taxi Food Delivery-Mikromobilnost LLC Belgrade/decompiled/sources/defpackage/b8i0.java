package defpackage;

import com.airbnb.lottie.compose.LottieAnimatableImpl;

/* loaded from: classes12.dex */
public final /* synthetic */ class b8i0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ esz b;

    public /* synthetic */ b8i0(yrz yrzVar, int i) {
        this.a = i;
        this.b = yrzVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        float floatValue;
        int i = this.a;
        esz eszVar = this.b;
        switch (i) {
            case 0:
                floatValue = ((Number) ((LottieAnimatableImpl) eszVar).getValue()).floatValue();
                break;
            case 1:
                floatValue = ((Number) ((LottieAnimatableImpl) eszVar).getValue()).floatValue();
                break;
            default:
                floatValue = ((Number) ((LottieAnimatableImpl) eszVar).getValue()).floatValue();
                break;
        }
        return Float.valueOf(floatValue);
    }
}
