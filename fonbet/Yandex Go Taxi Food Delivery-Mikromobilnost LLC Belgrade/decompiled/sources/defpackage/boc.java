package defpackage;

import com.ybsdk.feature.pdf.internal.network.dto.Button;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class boc {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Button.Alignment.values().length];
        try {
            iArr[Button.Alignment.VERTICAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Button.Alignment.HORIZONTAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
