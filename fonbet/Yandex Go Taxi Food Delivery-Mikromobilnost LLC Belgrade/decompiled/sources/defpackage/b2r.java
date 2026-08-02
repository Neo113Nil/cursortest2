package defpackage;

import kotlin.io.FileWalkDirection;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class b2r {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[FileWalkDirection.values().length];
        try {
            iArr[FileWalkDirection.TOP_DOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FileWalkDirection.BOTTOM_UP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
