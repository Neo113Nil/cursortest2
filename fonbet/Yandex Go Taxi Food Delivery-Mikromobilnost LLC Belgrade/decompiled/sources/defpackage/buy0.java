package defpackage;

import com.yandex.go.shortcuts.view.adapter.model.model.TextModel$Style;
import com.yandex.go.shortcuts.view.adapter.model.model.TextModel$TextColor;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class buy0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[TextModel$TextColor.values().length];
        try {
            iArr[TextModel$TextColor.CONTROL_MINOR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TextModel$TextColor.DEFAULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[TextModel$Style.values().length];
        try {
            iArr2[TextModel$Style.LIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[TextModel$Style.MEDIUM.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
    }
}
