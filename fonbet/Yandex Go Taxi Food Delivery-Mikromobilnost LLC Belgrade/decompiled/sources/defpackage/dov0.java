package defpackage;

import ru.yandex.taxi.preorder.source.ModalViewOrigin;
import ru.yandex.taxi.routeselector.analytics.RouteSelectorAnalytics$Button;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class dov0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[ModalViewOrigin.values().length];
        try {
            iArr[ModalViewOrigin.HOME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ModalViewOrigin.SUPERAPP_MAIN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ModalViewOrigin.SUMMARY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ModalViewOrigin.ON_ORDER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[RouteSelectorAnalytics$Button.values().length];
        try {
            iArr2[RouteSelectorAnalytics$Button.DONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[RouteSelectorAnalytics$Button.SUGGEST.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[RouteSelectorAnalytics$Button.ENTRANCE.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[RouteSelectorAnalytics$Button.BACK.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[RouteSelectorAnalytics$Button.GEO.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        b = iArr2;
    }
}
