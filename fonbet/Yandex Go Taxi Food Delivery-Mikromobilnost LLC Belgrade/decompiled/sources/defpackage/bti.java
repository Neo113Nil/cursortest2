package defpackage;

import com.yandex.go.zone.dto.objects.ButtonStyle;
import com.yandex.go.zone.dto.objects.DeliveryExtra;
import com.yandex.go.zone.dto.objects.DeliveryPinType;
import com.yandex.go.zone.dto.objects.DeliveryZoneTariffExtra;
import ru.yandex.taxi.tariffs.model.DeliveryFlowType;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class bti {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;

    static {
        int[] iArr = new int[DeliveryPinType.values().length];
        try {
            iArr[DeliveryPinType.MAP_SOURCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DeliveryPinType.MAP_DESTINATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DeliveryPinType.ROUTE_SOURCE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DeliveryPinType.ROUTE_DESTINATION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[DeliveryExtra.DeliveryInformationForm.FormType.values().length];
        try {
            iArr2[DeliveryExtra.DeliveryInformationForm.FormType.SHORT.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[DeliveryExtra.DeliveryInformationForm.FormType.MINIMAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[DeliveryExtra.DeliveryInformationForm.FormType.REDUCED.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[DeliveryExtra.DeliveryInformationForm.FormType.FULL.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[DeliveryExtra.DeliveryInformationForm.FormType.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        b = iArr2;
        int[] iArr3 = new int[ButtonStyle.values().length];
        try {
            iArr3[ButtonStyle.MAIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[ButtonStyle.MINOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        c = iArr3;
        int[] iArr4 = new int[DeliveryZoneTariffExtra.DeliveryFlowType.values().length];
        try {
            iArr4[DeliveryZoneTariffExtra.DeliveryFlowType.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr4[DeliveryZoneTariffExtra.DeliveryFlowType.NDD_FORM_V1.ordinal()] = 2;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr4[DeliveryZoneTariffExtra.DeliveryFlowType.NDD_FORM_V2.ordinal()] = 3;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr4[DeliveryZoneTariffExtra.DeliveryFlowType.ROVER.ordinal()] = 4;
        } catch (NoSuchFieldError unused15) {
        }
        d = iArr4;
        int[] iArr5 = new int[DeliveryFlowType.values().length];
        try {
            iArr5[DeliveryFlowType.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr5[DeliveryFlowType.NDD_FORM_V1.ordinal()] = 2;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr5[DeliveryFlowType.NDD_FORM_V2.ordinal()] = 3;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr5[DeliveryFlowType.ROVER.ordinal()] = 4;
        } catch (NoSuchFieldError unused19) {
        }
        e = iArr5;
    }
}
