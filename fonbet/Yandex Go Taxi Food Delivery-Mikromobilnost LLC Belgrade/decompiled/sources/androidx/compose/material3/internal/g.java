package androidx.compose.material3.internal;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class g {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[TextFieldType.values().length];
        try {
            iArr[TextFieldType.Filled.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TextFieldType.Outlined.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[InputPhase.values().length];
        try {
            iArr2[InputPhase.Focused.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[InputPhase.UnfocusedEmpty.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[InputPhase.UnfocusedNotEmpty.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
