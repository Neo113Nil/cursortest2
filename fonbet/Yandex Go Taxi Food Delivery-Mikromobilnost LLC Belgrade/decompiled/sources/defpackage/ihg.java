package defpackage;

import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.OpenTrackingCardActionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.SelectDestinationPolicyDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.SummaryRedirectActionDto;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class ihg {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[SelectDestinationPolicyDto.values().length];
        try {
            iArr[SelectDestinationPolicyDto.REQUIRED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SelectDestinationPolicyDto.SKIP_IF_PRESELECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SelectDestinationPolicyDto.SKIP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[SummaryRedirectActionDto.SheetExpansionDto.values().length];
        try {
            iArr2[SummaryRedirectActionDto.SheetExpansionDto.COLLAPSED.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[SummaryRedirectActionDto.SheetExpansionDto.EXPANDED.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[SummaryRedirectActionDto.SheetExpansionDto.ANCHORED.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
        int[] iArr3 = new int[OpenTrackingCardActionDto.ExpansionDto.values().length];
        try {
            iArr3[OpenTrackingCardActionDto.ExpansionDto.EXPANDED.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[OpenTrackingCardActionDto.ExpansionDto.ANCHORED.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        c = iArr3;
    }
}
