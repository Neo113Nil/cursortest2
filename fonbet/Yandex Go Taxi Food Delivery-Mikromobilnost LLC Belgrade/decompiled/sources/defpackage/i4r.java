package defpackage;

import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response.FilterDto$OneOfManySelectionFilterDto;
import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response.FilterDto$ToggleFilterDto;
import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response.f;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes13.dex */
public final class i4r extends xqt {
    public static final i4r e = new i4r();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, f.INSTANCE.serializer(), qoi0.a(f.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("toggle_filter_response", FilterDto$ToggleFilterDto.Companion.serializer(), qoi0.a(FilterDto$ToggleFilterDto.class)), new f9("selection_filter_response", FilterDto$OneOfManySelectionFilterDto.Companion.serializer(), qoi0.a(FilterDto$OneOfManySelectionFilterDto.class)));
    }
}
