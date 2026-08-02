package defpackage;

import com.yandex.go.places.models.domain.entities.bottom_panel.BottomPanelButtonSize;
import com.yandex.go.places.models.domain.entities.bottom_panel.BottomPanelButtonType;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class ae6 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[BottomPanelButtonSize.values().length];
        try {
            iArr[BottomPanelButtonSize.BIG.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BottomPanelButtonSize.SMALL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[BottomPanelButtonType.values().length];
        try {
            iArr2[BottomPanelButtonType.MAIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[BottomPanelButtonType.MINOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
    }
}
