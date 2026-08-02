package defpackage;

import com.yandex.go.flex.main_screen.data.DocumentSourceVariableFactory$Companion$DocumentSource;

/* loaded from: classes.dex */
public abstract /* synthetic */ class ps2 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DocumentSourceVariableFactory$Companion$DocumentSource.values().length];
        try {
            iArr[DocumentSourceVariableFactory$Companion$DocumentSource.NETWORK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DocumentSourceVariableFactory$Companion$DocumentSource.CACHE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
