package defpackage;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.PresentationTypeDto;
import ru.yandex.taxi.masstransit.paymentcards.TransportCardStatus;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class g52 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[PresentationTypeDto.values().length];
        try {
            iArr[PresentationTypeDto.LIST.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PresentationTypeDto.TABLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[TransportCardStatus.values().length];
        try {
            iArr2[TransportCardStatus.Active.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[TransportCardStatus.Blocked.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[TransportCardStatus.Advertisement.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
