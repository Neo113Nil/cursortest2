package defpackage;

import com.yandex.go.zone.dto.objects.QueueScreen;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class ckg0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[QueueScreen.QueueButton.QueueButtonAction.values().length];
        try {
            iArr[QueueScreen.QueueButton.QueueButtonAction.PRIMARY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[QueueScreen.QueueButton.QueueButtonAction.SECONDARY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
