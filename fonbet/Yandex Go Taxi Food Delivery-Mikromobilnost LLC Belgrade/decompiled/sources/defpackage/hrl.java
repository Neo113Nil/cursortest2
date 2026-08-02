package defpackage;

import ru.yandex.taxi.design.utils.DividerType;

/* loaded from: classes9.dex */
public final class hrl {
    public static DividerType a(int i) {
        switch (i) {
            case 0:
                return DividerType.NONE;
            case 1:
                return DividerType.NORMAL;
            case 2:
                return DividerType.ICON;
            case 3:
                return DividerType.ICON_MARGIN;
            case 4:
                return DividerType.MARGIN;
            case 5:
                return DividerType.ICON_HALF_MARGIN;
            case 6:
                return DividerType.MARGIN_0_75;
            default:
                return DividerType.NONE;
        }
    }
}
