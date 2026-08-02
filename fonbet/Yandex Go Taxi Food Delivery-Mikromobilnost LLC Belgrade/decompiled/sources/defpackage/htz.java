package defpackage;

import com.airbnb.lottie.LottieDrawable;

/* loaded from: classes10.dex */
public final /* synthetic */ class htz implements stz {
    public final /* synthetic */ int a;
    public final /* synthetic */ LottieDrawable b;
    public final /* synthetic */ String c;

    public /* synthetic */ htz(LottieDrawable lottieDrawable, String str, int i) {
        this.a = i;
        this.b = lottieDrawable;
        this.c = str;
    }

    @Override // defpackage.stz
    public final void a(nsz nszVar) {
        int i = this.a;
        String str = this.c;
        LottieDrawable lottieDrawable = this.b;
        switch (i) {
            case 0:
                lottieDrawable.lambda$setMinAndMaxFrame$11(str, nszVar);
                break;
            case 1:
                lottieDrawable.lambda$setMaxFrame$10(str, nszVar);
                break;
            default:
                lottieDrawable.lambda$setMinFrame$9(str, nszVar);
                break;
        }
    }
}
