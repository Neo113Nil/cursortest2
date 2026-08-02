package defpackage;

import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.PollQuestionDto;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class oki {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[PollQuestionDto.ChoicesTypeDto.values().length];
        try {
            iArr[PollQuestionDto.ChoicesTypeDto.MULTI.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
        int[] iArr2 = new int[PollQuestionDto.AnswersAlignmentDto.values().length];
        try {
            iArr2[PollQuestionDto.AnswersAlignmentDto.TRAIL.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        b = iArr2;
    }
}
