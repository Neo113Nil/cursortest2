package defpackage;

import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ActionOpenTrackingCardDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ActionOrderMoreDto;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class nw {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[ActionOpenTrackingCardDto.ExpansionDto.values().length];
        try {
            iArr[ActionOpenTrackingCardDto.ExpansionDto.EXPANDED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ActionOpenTrackingCardDto.ExpansionDto.COLLAPSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ActionOpenTrackingCardDto.ExpansionDto.ANCHORED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[ActionOrderMoreDto.SheetExpansionDto.values().length];
        try {
            iArr2[ActionOrderMoreDto.SheetExpansionDto.EXPANDED.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[ActionOrderMoreDto.SheetExpansionDto.COLLAPSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[ActionOrderMoreDto.SheetExpansionDto.ANCHORED.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
    }
}
