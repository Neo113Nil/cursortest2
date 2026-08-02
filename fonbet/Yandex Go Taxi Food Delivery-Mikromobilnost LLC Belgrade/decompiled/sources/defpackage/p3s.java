package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;
import ru.yandex.logistics.sdk.cargo_form.core.impl.config.FormConfigRepositoryImpl$getOrFetchConfigItemFlow$$inlined$flatMapLatest$1;
import ru.yandex.taxi.logistics.sdk.delivery_launch.domain.a;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.TypedConfigsDto;

/* loaded from: classes5.dex */
public final class p3s implements o3s {
    public final l0i a;
    public final jln b;

    public p3s(l0i l0iVar, jln jlnVar) {
        this.a = l0iVar;
        this.b = jlnVar;
    }

    public final TypedConfigsDto.ItemsDto a(String str) {
        TypedConfigsDto typedConfigsDto;
        List<TypedConfigsDto.ItemsDto> items;
        m0i m0iVar = new m0i((String) ((cu8) this.b.b).a.a.getValue());
        Map map = (Map) ((o0i) ((a) this.a).b).a.getValue();
        Object obj = null;
        if (map == null || (typedConfigsDto = (TypedConfigsDto) map.get(m0iVar)) == null || (items = typedConfigsDto.getItems()) == null) {
            return null;
        }
        Iterator<T> it = items.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (jl40.l(((TypedConfigsDto.ItemsDto) next).getName(), str)) {
                obj = next;
                break;
            }
        }
        return (TypedConfigsDto.ItemsDto) obj;
    }

    public final g b(String str) {
        return e.X(new syc(((cu8) this.b.b).a, 14), new FormConfigRepositoryImpl$getOrFetchConfigItemFlow$$inlined$flatMapLatest$1(null, this, str));
    }
}
