package defpackage;

import com.yandex.plus.core.graphql.type.BackgroundGradientTvTypeView;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class ii4 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BackgroundGradientTvTypeView.values().length];
        try {
            iArr[BackgroundGradientTvTypeView.linear.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BackgroundGradientTvTypeView.radial.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
