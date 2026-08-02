package defpackage;

import com.yandex.plus.home.feature.webviews.internal.uri.Deeplink$ModalHeightType;
import com.yandex.plus.home.feature.webviews.internal.uri.Deeplink$WebViewFormat;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class b3h {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[Deeplink$WebViewFormat.values().length];
        try {
            iArr[Deeplink$WebViewFormat.CARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Deeplink$WebViewFormat.FULL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[Deeplink$ModalHeightType.values().length];
        try {
            iArr2[Deeplink$ModalHeightType.FIXED.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[Deeplink$ModalHeightType.PERCENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
    }
}
