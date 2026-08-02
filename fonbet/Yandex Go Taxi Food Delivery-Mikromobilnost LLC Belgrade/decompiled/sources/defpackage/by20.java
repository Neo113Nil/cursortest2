package defpackage;

import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response.ModalContentDto$FilterModalDto;
import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response.ModalContentDto$SortModalDto;
import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response.l;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes13.dex */
public final class by20 extends xqt {
    public static final by20 e = new by20();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, l.INSTANCE.serializer(), qoi0.a(l.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("filter_modal", ModalContentDto$FilterModalDto.Companion.serializer(), qoi0.a(ModalContentDto$FilterModalDto.class)), new f9("sort_modal", ModalContentDto$SortModalDto.Companion.serializer(), qoi0.a(ModalContentDto$SortModalDto.class)));
    }
}
