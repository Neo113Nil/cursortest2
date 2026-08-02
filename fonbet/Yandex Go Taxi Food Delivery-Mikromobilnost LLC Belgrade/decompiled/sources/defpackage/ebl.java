package defpackage;

import com.yandex.div2.DivAnimation$Name;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class ebl {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DivAnimation$Name.values().length];
        try {
            iArr[DivAnimation$Name.TRANSLATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DivAnimation$Name.SCALE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DivAnimation$Name.NO_ANIMATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
