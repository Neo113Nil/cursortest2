package defpackage;

import ru.yandex.taxi.logistics.sdk.ui_models.badge.dashboard.BadgeAnchor;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class e151 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BadgeAnchor.values().length];
        try {
            iArr[BadgeAnchor.UPPER_RIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BadgeAnchor.UPPER_LEFT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BadgeAnchor.LOWER_RIGHT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[BadgeAnchor.LOWER_LEFT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
