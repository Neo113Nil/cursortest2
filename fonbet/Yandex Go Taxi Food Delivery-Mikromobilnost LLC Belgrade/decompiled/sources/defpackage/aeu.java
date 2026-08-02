package defpackage;

import com.yandex.go.shortcuts.dto.response.TextStyleDto;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class aeu {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TextStyleDto.HorizontalAlignment.values().length];
        try {
            iArr[TextStyleDto.HorizontalAlignment.LEADING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TextStyleDto.HorizontalAlignment.CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TextStyleDto.HorizontalAlignment.TRAILING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
