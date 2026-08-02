package defpackage;

import com.yandex.go.superapp.model.Action;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class a1p {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Action.values().length];
        try {
            iArr[Action.SHOW_ORDER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Action.SHOW_SHOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Action.SHOW_RELATIVE_PATH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Action.FORCE_RELATIVE_PATH.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[Action.NONE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
