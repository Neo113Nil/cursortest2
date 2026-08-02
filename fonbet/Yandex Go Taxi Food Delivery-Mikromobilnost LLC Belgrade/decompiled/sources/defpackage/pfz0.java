package defpackage;

import com.yandex.go.multimodal_route.network.models.TipsChoiceItemDto$Unsupported;
import com.yandex.go.multimodal_route.network.models.TipsChoiceItemDto$ValueTipsChoiceDto;
import com.yandex.go.multimodal_route.network.models.TipsChoiceItemDto$ZeroValueTipsChoiceDto;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes12.dex */
public final class pfz0 extends xqt {
    public static final pfz0 e = new pfz0();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, TipsChoiceItemDto$Unsupported.Companion.serializer(), qoi0.a(TipsChoiceItemDto$Unsupported.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("zero_choice", TipsChoiceItemDto$ZeroValueTipsChoiceDto.Companion.serializer(), qoi0.a(TipsChoiceItemDto$ZeroValueTipsChoiceDto.class)), new f9("value_choice", TipsChoiceItemDto$ValueTipsChoiceDto.Companion.serializer(), qoi0.a(TipsChoiceItemDto$ValueTipsChoiceDto.class)));
    }
}
