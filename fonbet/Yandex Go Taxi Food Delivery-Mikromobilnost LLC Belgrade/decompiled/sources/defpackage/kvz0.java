package defpackage;

import com.ybsdk.widgets.tooltip.TooltipCommon$PreferredGravity;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class kvz0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TooltipCommon$PreferredGravity.values().length];
        try {
            iArr[TooltipCommon$PreferredGravity.CENTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TooltipCommon$PreferredGravity.START.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TooltipCommon$PreferredGravity.END.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
