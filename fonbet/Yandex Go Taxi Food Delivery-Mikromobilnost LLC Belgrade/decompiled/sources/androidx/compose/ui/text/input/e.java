package androidx.compose.ui.text.input;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class e {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TextInputServiceAndroid$TextInputCommand.values().length];
        try {
            iArr[TextInputServiceAndroid$TextInputCommand.StartInput.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TextInputServiceAndroid$TextInputCommand.StopInput.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TextInputServiceAndroid$TextInputCommand.ShowKeyboard.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TextInputServiceAndroid$TextInputCommand.HideKeyboard.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
