package defpackage;

import com.yandex.go.masstransit.design.compose.route.Ellipse$Size;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class lrn {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Ellipse$Size.values().length];
        try {
            iArr[Ellipse$Size.SMALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Ellipse$Size.BIG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
