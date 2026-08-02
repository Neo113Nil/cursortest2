package defpackage;

import com.ybsdk.widgets.common.StadiumButtonView;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class cm01 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[StadiumButtonView.ClickedPart.values().length];
        try {
            iArr[StadiumButtonView.ClickedPart.FULL_BUTTON.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[StadiumButtonView.ClickedPart.RIGHT_PART.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
