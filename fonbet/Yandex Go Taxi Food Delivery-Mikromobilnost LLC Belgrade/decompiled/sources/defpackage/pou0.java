package defpackage;

import ru.yandex.taxi.communications.api.dto.Story;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class pou0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Story.StoryLayoutType.values().length];
        try {
            iArr[Story.StoryLayoutType.MAIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Story.StoryLayoutType.MAIN_WITH_TOP_INSET.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Story.StoryLayoutType.BOTTOM.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Story.StoryLayoutType.NEW_YEAR_LAYOUT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
