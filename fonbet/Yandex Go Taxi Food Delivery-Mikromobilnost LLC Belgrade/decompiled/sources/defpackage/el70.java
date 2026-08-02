package defpackage;

import com.yandex.go.taxi.order.cancel.v2.domain.models.OrderCancelUiState$HeaderImage$Content;
import ru.yandex.taxi.common_models.net.Orientation;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class el70 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[OrderCancelUiState$HeaderImage$Content.Alignment.values().length];
        try {
            iArr[OrderCancelUiState$HeaderImage$Content.Alignment.CENTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OrderCancelUiState$HeaderImage$Content.Alignment.LEADING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[OrderCancelUiState$HeaderImage$Content.Alignment.FULL_SIZE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[Orientation.values().length];
        try {
            iArr2[Orientation.HORIZONTAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[Orientation.VERTICAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
