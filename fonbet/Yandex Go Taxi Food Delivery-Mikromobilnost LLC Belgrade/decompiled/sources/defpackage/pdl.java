package defpackage;

import com.yandex.div2.DivTabs$TabTitleStyle;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class pdl {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DivTabs$TabTitleStyle.AnimationType.values().length];
        try {
            iArr[DivTabs$TabTitleStyle.AnimationType.SLIDE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DivTabs$TabTitleStyle.AnimationType.FADE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DivTabs$TabTitleStyle.AnimationType.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
