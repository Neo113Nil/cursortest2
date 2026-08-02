package defpackage;

import com.yandex.plus.plaquesdk.plaque.api.models.PlaqueModel$Notification$Position;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class ok60 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PlaqueModel$Notification$Position.values().length];
        try {
            iArr[PlaqueModel$Notification$Position.LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlaqueModel$Notification$Position.RIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
