package defpackage;

import ru.yandex.taxi.preorder.suggested.menu.EntryPoint;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class b6v0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[EntryPoint.values().length];
        try {
            iArr[EntryPoint.SUPER_APP_HEADER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
        int[] iArr2 = new int[PointType.values().length];
        try {
            iArr2[PointType.SOURCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[PointType.DESTINATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        b = iArr2;
    }
}
