package defpackage;

import com.yandex.go.taxi.order.models.api.response.CompanionHeader;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class cd11 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[CompanionHeader.Animation.values().length];
        try {
            iArr[CompanionHeader.Animation.RADAR_ANIMATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CompanionHeader.Animation.FOUND_COMPANION_ANIMATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CompanionHeader.Animation.WALK_ANIMATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CompanionHeader.Animation.WAVE_ANIMATION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[CompanionHeader.Animation.UNSUPPORTED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
        int[] iArr2 = new int[ThemeType.values().length];
        try {
            iArr2[ThemeType.DARK.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[ThemeType.LIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        b = iArr2;
    }
}
