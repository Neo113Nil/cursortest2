package defpackage;

import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityCommentSuggestSelectorDto;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardCommentSelectorTypeDto;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.a;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class lbw extends lnt {
    public static final lbw f = new lbw();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, a.INSTANCE.serializer(), qoi0.a(a.class));
    }

    @Override // defpackage.h9
    public final List f() {
        IntercityDashboardCommentSelectorTypeDto intercityDashboardCommentSelectorTypeDto = IntercityDashboardCommentSelectorTypeDto.SUGGESTS;
        return Arrays.asList(new f9((String) h().invoke(intercityDashboardCommentSelectorTypeDto), IntercityCommentSuggestSelectorDto.Companion.serializer(), qoi0.a(IntercityCommentSuggestSelectorDto.class)));
    }

    @Override // defpackage.n4o
    public final KSerializer g() {
        return IntercityDashboardCommentSelectorTypeDto.Companion.serializer();
    }
}
