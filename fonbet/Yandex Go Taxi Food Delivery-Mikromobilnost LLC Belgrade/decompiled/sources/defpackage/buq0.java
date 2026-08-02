package defpackage;

import com.ybsdk.feature.server.tooltips.api.data.ServerTooltipPositionDto;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class buq0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ServerTooltipPositionDto.values().length];
        try {
            iArr[ServerTooltipPositionDto.ABOVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ServerTooltipPositionDto.BELOW.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
