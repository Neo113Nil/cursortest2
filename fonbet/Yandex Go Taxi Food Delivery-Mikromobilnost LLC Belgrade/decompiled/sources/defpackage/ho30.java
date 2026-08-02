package defpackage;

import com.yandex.mapkit.map.CameraUpdateReason;
import ru.yandex.taxi.masstransit.analytic.TransportMainAnalytics$ModalState;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class ho30 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[CameraUpdateReason.values().length];
        try {
            iArr[CameraUpdateReason.GESTURES.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
        int[] iArr2 = new int[TransportMainAnalytics$ModalState.values().length];
        try {
            iArr2[TransportMainAnalytics$ModalState.Collapsed.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[TransportMainAnalytics$ModalState.Default.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[TransportMainAnalytics$ModalState.Expanded.ordinal()] = 3;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
    }
}
