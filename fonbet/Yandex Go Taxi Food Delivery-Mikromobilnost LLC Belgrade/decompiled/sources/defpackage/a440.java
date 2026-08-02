package defpackage;

import ru.yandex.taxi.masstransit.experiment.MtMainRedirectExperiment;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class a440 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MtMainRedirectExperiment.RedirectVertical.values().length];
        try {
            iArr[MtMainRedirectExperiment.RedirectVertical.HUB.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MtMainRedirectExperiment.RedirectVertical.TRANSPORT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
