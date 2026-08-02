package defpackage;

import com.ybsdk.feature.pdf.internal.entities.ButtonEntity$Alignment;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class fra0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ButtonEntity$Alignment.values().length];
        try {
            iArr[ButtonEntity$Alignment.VERTICAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ButtonEntity$Alignment.HORIZONTAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
