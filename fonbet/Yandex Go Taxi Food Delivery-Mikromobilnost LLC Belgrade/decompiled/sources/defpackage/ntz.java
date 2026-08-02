package defpackage;

import com.airbnb.lottie.LottieDrawable;

/* loaded from: classes10.dex */
public final /* synthetic */ class ntz implements stz {
    public final /* synthetic */ int a;
    public final /* synthetic */ LottieDrawable b;
    public final /* synthetic */ float c;

    public /* synthetic */ ntz(LottieDrawable lottieDrawable, float f, int i) {
        this.a = i;
        this.b = lottieDrawable;
        this.c = f;
    }

    @Override // defpackage.stz
    public final void a(nsz nszVar) {
        int i = this.a;
        float f = this.c;
        LottieDrawable lottieDrawable = this.b;
        switch (i) {
            case 0:
                lottieDrawable.lambda$setMaxProgress$8(f, nszVar);
                break;
            default:
                lottieDrawable.lambda$setMinProgress$6(f, nszVar);
                break;
        }
    }
}
