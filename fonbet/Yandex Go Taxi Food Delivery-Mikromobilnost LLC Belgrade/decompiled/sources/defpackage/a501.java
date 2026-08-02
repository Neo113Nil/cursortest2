package defpackage;

import com.yandex.go.superapp.tracking.models.dto.TrackingCardStatusSquareImageDto;
import com.yandex.go.superapp.tracking.models.dto.TrackingCardStatusTrailButtonDto;
import com.yandex.go.superapp.tracking.models.dto.TrackingCardStatusTrailImageWithPlateDto;
import com.yandex.go.superapp.tracking.models.dto.TrackingCardStatusTrailTimelineDto;
import com.yandex.go.superapp.tracking.models.dto.TrackingCardStatusTrailTimerDto;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes14.dex */
public final class a501 extends wqt {
    public static final a501 e = new a501();

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("square_image", TrackingCardStatusSquareImageDto.Companion.serializer(), qoi0.a(TrackingCardStatusSquareImageDto.class)), new f9("timer", TrackingCardStatusTrailTimerDto.Companion.serializer(), qoi0.a(TrackingCardStatusTrailTimerDto.class)), new f9("image_with_plate", TrackingCardStatusTrailImageWithPlateDto.Companion.serializer(), qoi0.a(TrackingCardStatusTrailImageWithPlateDto.class)), new f9("timeline", TrackingCardStatusTrailTimelineDto.Companion.serializer(), qoi0.a(TrackingCardStatusTrailTimelineDto.class)), new f9("button", TrackingCardStatusTrailButtonDto.Companion.serializer(), qoi0.a(TrackingCardStatusTrailButtonDto.class)));
    }
}
