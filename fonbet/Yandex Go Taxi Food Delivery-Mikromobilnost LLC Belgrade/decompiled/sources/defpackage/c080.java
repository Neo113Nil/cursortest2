package defpackage;

import com.yandex.go.taxi.order.models.api.objects.MapObject;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class c080 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MapObject.AlignType.values().length];
        try {
            iArr[MapObject.AlignType.BOTTOM.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MapObject.AlignType.TOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
