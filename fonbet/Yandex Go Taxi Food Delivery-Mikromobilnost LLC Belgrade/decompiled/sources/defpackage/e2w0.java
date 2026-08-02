package defpackage;

import com.yandex.go.mainscreen.superapp.impl.clarifyaddress.presentation.ButtonsAlignment;
import com.yandex.go.mainscreen.superapp.impl.foundation.data.repository.SuperAppLogoPositionRepository$LogoPosition;

/* loaded from: classes.dex */
public abstract /* synthetic */ class e2w0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[ButtonsAlignment.values().length];
        try {
            iArr[ButtonsAlignment.HORIZONTAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ButtonsAlignment.VERTICAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[SuperAppLogoPositionRepository$LogoPosition.values().length];
        try {
            iArr2[SuperAppLogoPositionRepository$LogoPosition.LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[SuperAppLogoPositionRepository$LogoPosition.CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[SuperAppLogoPositionRepository$LogoPosition.LEFT_YANGO.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
