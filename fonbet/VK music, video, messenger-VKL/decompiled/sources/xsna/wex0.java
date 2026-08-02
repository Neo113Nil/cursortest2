package xsna;

import com.airbnb.lottie.LottieAnimationView;
import java.util.HashMap;

/* compiled from: WebAppLottieBridge.kt */
/* loaded from: classes11.dex */
public final class wex0 {
    public static final wex0 a = new wex0();
    public static final HashMap<String, byte[]> b = new HashMap<>(2);

    /* compiled from: WebAppLottieBridge.kt */
    /* loaded from: classes7.dex */
    public static final class a implements ygn0 {
        public final LottieAnimationView a;
        public final LottieAnimationView b;

        public a(LottieAnimationView lottieAnimationView) {
            this.a = lottieAnimationView;
            this.b = lottieAnimationView;
        }

        @Override // xsna.ygn0
        public final void a() {
            this.a.m0();
        }

        @Override // xsna.ygn0
        public final LottieAnimationView getView() {
            return this.b;
        }
    }

    public final io.reactivex.rxjava3.core.q<byte[]> a(String str) {
        HashMap<String, byte[]> hashMap = b;
        return (!hashMap.containsKey(str) || hashMap.get(str) == null) ? ((lg6) dgn0.g.getValue()).a(str) : io.reactivex.rxjava3.core.q.T(hashMap.get(str));
    }
}
