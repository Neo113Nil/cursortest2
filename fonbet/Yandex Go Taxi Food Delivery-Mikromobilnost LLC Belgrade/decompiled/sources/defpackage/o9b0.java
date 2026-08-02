package defpackage;

import com.ybsdk.feature.pfm.internal.domain.entities.FilterInnerContentEntity$Date$SelectionMode;
import com.ybsdk.widgets.common.rangedatepicker.SelectionMode;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class o9b0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[FilterInnerContentEntity$Date$SelectionMode.values().length];
        try {
            iArr[FilterInnerContentEntity$Date$SelectionMode.START_DATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FilterInnerContentEntity$Date$SelectionMode.END_DATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[SelectionMode.values().length];
        try {
            iArr2[SelectionMode.START_DATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[SelectionMode.END_DATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
    }
}
