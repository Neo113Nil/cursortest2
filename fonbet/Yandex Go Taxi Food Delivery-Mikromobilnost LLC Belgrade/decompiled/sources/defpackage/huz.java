package defpackage;

import com.yandex.go.platform.lottie_splash.domain.LottiePositionPresentationModel;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class huz {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[LottiePositionPresentationModel.values().length];
        try {
            iArr[LottiePositionPresentationModel.CENTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LottiePositionPresentationModel.TOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[LottiePositionPresentationModel.BOTTOM.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
