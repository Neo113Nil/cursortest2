package defpackage;

import com.yandex.go.places.models.data.entities.network.bottom_panel.BottomPanelButtonSize;
import com.yandex.go.places.models.data.entities.network.bottom_panel.BottomPanelButtonType;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class ce6 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[BottomPanelButtonType.values().length];
        try {
            iArr[BottomPanelButtonType.MAIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BottomPanelButtonType.MINOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[BottomPanelButtonSize.values().length];
        try {
            iArr2[BottomPanelButtonSize.BIG.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[BottomPanelButtonSize.SMALL.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
    }
}
