package defpackage;

import ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_ai_tools.StyledTextDto;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class cq1 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[StyledTextDto.TextFontDto.values().length];
        try {
            iArr[StyledTextDto.TextFontDto.BOLD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[StyledTextDto.TextFontDto.REGULAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
