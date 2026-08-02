package defpackage;

import com.ybsdk.feature.server.tooltips.api.domain.ServerTooltipPositionEntity;
import com.ybsdk.widgets.common.Tooltip$DismissReason;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class iuq0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[ServerTooltipPositionEntity.values().length];
        try {
            iArr[ServerTooltipPositionEntity.ABOVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ServerTooltipPositionEntity.BELOW.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[Tooltip$DismissReason.values().length];
        try {
            iArr2[Tooltip$DismissReason.TIMEOUT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[Tooltip$DismissReason.CLICK.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[Tooltip$DismissReason.OUTSIDE_ACTION.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
