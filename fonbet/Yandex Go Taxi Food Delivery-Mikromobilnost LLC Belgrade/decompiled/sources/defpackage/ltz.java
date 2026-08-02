package defpackage;

import com.airbnb.lottie.LottieDrawable;

/* loaded from: classes10.dex */
public final /* synthetic */ class ltz implements stz {
    public final /* synthetic */ int a;
    public final /* synthetic */ LottieDrawable b;
    public final /* synthetic */ int c;

    public /* synthetic */ ltz(LottieDrawable lottieDrawable, int i, int i2) {
        this.a = i2;
        this.b = lottieDrawable;
        this.c = i;
    }

    @Override // defpackage.stz
    public final void a(nsz nszVar) {
        int i = this.a;
        int i2 = this.c;
        LottieDrawable lottieDrawable = this.b;
        switch (i) {
            case 0:
                lottieDrawable.lambda$setMaxFrame$7(i2, nszVar);
                break;
            default:
                lottieDrawable.lambda$setMinFrame$5(i2, nszVar);
                break;
        }
    }
}
