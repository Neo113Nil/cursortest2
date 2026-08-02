package xsna;

import com.vk.core.view.interop.components.image.InteropPicture;

/* compiled from: InteropProductImage.kt */
/* loaded from: classes17.dex */
public final /* synthetic */ class xnx {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[InteropPicture.Radius.values().length];
        try {
            iArr[InteropPicture.Radius.Small.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[InteropPicture.Radius.Medium.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[InteropPicture.Radius.Large.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
