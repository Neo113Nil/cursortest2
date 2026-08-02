package defpackage;

import com.yandex.delivery.mapper.model.state.Align;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class p701 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Align.values().length];
        try {
            iArr[Align.CENTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Align.LEADING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Align.TRAILING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
