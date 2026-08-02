package defpackage;

import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.slot.ContentAlignmentDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.slot.LeadIconDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.slot.SlotDto;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class lus0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[SlotDto.SizeDto.values().length];
        try {
            iArr[SlotDto.SizeDto.XS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SlotDto.SizeDto.S.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SlotDto.SizeDto.M.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SlotDto.SizeDto.L.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[SlotDto.SizeDto.XL.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[SlotDto.SizeDto.XXL.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
        int[] iArr2 = new int[LeadIconDto.StyleDto.values().length];
        try {
            iArr2[LeadIconDto.StyleDto.ICON.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[LeadIconDto.StyleDto.IMAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[LeadIconDto.StyleDto.BRAND.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[LeadIconDto.StyleDto.PAYMENT.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[LeadIconDto.StyleDto.BRANDXS.ordinal()] = 5;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[LeadIconDto.StyleDto.USERPIC.ordinal()] = 6;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[LeadIconDto.StyleDto.SERVICE.ordinal()] = 7;
        } catch (NoSuchFieldError unused13) {
        }
        b = iArr2;
        int[] iArr3 = new int[ContentAlignmentDto.values().length];
        try {
            iArr3[ContentAlignmentDto.CENTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr3[ContentAlignmentDto.LEADING.ordinal()] = 2;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr3[ContentAlignmentDto.TRAILING.ordinal()] = 3;
        } catch (NoSuchFieldError unused16) {
        }
        c = iArr3;
    }
}
