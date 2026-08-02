package defpackage;

import com.yandex.go.design.compose.icon.IconSpotStyle;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class ba3 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[IconSpotStyle.values().length];
        try {
            iArr[IconSpotStyle.Fill.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[IconSpotStyle.Transparent.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[IconSpotStyle.Outline.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
