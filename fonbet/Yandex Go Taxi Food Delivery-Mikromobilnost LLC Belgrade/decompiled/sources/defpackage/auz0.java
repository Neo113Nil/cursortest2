package defpackage;

import com.ybsdk.widgets.common.Tooltip$PreferredGravity;
import com.ybsdk.widgets.common.Tooltip$PreferredPosition;
import com.ybsdk.widgets.tooltip.TooltipCommon$DismissReason;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class auz0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[Tooltip$PreferredPosition.values().length];
        try {
            iArr[Tooltip$PreferredPosition.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Tooltip$PreferredPosition.BOTTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Tooltip$PreferredPosition.AUTO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[Tooltip$PreferredGravity.values().length];
        try {
            iArr2[Tooltip$PreferredGravity.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[Tooltip$PreferredGravity.CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[Tooltip$PreferredGravity.END.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
        int[] iArr3 = new int[TooltipCommon$DismissReason.values().length];
        try {
            iArr3[TooltipCommon$DismissReason.CLICK.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[TooltipCommon$DismissReason.TIMEOUT.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[TooltipCommon$DismissReason.OUTSIDE_ACTION.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        c = iArr3;
    }
}
