package defpackage;

import com.yandex.delivery.attrbutedtext.api.TruncationMode;
import ru.yandex.logistics.sdk.cargo_form.impl.model.widget.TextAlignment;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class iuy0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[TextAlignment.values().length];
        try {
            iArr[TextAlignment.LEADING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TextAlignment.CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TextAlignment.TRAILING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[TruncationMode.values().length];
        try {
            iArr2[TruncationMode.HEAD.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[TruncationMode.TAIL.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[TruncationMode.MIDDLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
    }
}
