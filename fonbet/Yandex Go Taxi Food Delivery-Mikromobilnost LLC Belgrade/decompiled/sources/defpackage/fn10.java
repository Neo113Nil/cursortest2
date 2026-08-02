package defpackage;

import com.yandex.go.mainscreen.superapp.impl.header.experiment.SuperAppConfigMenuExperiment;

/* loaded from: classes.dex */
public abstract /* synthetic */ class fn10 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SuperAppConfigMenuExperiment.MenuIconType.values().length];
        try {
            iArr[SuperAppConfigMenuExperiment.MenuIconType.AVATAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SuperAppConfigMenuExperiment.MenuIconType.FLOATING_AVATAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SuperAppConfigMenuExperiment.MenuIconType.HAMBURGER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
