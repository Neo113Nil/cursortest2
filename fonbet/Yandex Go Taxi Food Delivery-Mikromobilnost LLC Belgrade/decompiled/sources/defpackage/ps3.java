package defpackage;

import com.ybsdk.feature.transfer.version2.internal.screens.me2me.list.domain.AutoPullPermissionEntity$Status;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class ps3 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AutoPullPermissionEntity$Status.values().length];
        try {
            iArr[AutoPullPermissionEntity$Status.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AutoPullPermissionEntity$Status.CHECKING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
