package defpackage;

import ru.yandex.taxi.perf.Milestone;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class ns2 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Milestone.values().length];
        try {
            iArr[Milestone.ApplicationClass.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Milestone.Application.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Milestone.StartActivity.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Milestone.MainActivity.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[Milestone.MainScreen.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[Milestone.SplashScreen.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[Milestone.Pin.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[Milestone.MainScreenData.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[Milestone.MainScreenDataNav.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[Milestone.MainScreenDataTaxi.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[Milestone.ZoneInfo.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[Milestone.Suggest.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[Milestone.ShortcutsRender.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[Milestone.ShortcutsLoaded.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[Milestone.LargestContentfulPaintCached.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[Milestone.FullContentfulPaintCached.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[Milestone.FirstContentfulPaint.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr[Milestone.LargestContentfulPaint.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr[Milestone.FullContentfulPaint.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        a = iArr;
    }
}
