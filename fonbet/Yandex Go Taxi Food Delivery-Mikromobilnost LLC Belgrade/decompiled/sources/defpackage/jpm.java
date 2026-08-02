package defpackage;

import com.yx360.design.compose.atoms.DsButton$Size;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class jpm {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DsButton$Size.values().length];
        try {
            iArr[DsButton$Size.Lg.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DsButton$Size.Md.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DsButton$Size.Sm.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
