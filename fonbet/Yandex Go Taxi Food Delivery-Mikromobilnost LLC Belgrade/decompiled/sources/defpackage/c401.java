package defpackage;

import com.yandex.go.superapp.tracking.models.dto.TrackingCardPlateNumberImageLayeredDto;
import com.yandex.go.superapp.tracking.models.dto.TrackingCardPlateNumberImagePlainDto;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes14.dex */
public final class c401 extends wqt {
    public static final c401 e = new c401();

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("plain", TrackingCardPlateNumberImagePlainDto.Companion.serializer(), qoi0.a(TrackingCardPlateNumberImagePlainDto.class)), new f9("layered", TrackingCardPlateNumberImageLayeredDto.Companion.serializer(), qoi0.a(TrackingCardPlateNumberImageLayeredDto.class)));
    }
}
