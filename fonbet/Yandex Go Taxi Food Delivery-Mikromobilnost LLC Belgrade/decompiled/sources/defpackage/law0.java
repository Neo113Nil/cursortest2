package defpackage;

import com.yandex.go.superapp_favorites.data.SuperappFavoritesFilter;
import java.util.Map;
import kotlin.collections.b;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.Continuation;

/* loaded from: classes14.dex */
public final class law0 implements hv90 {
    public final kaw0 a;
    public final wnt b;

    public law0(kaw0 kaw0Var, wnt wntVar) {
        this.a = kaw0Var;
        this.b = wntVar;
    }

    @Override // defpackage.hv90
    public final Object a(ywl ywlVar, c5j0 c5j0Var, Continuation continuation) {
        u1m a;
        String str = null;
        f2m f2mVar = c5j0Var instanceof f2m ? (f2m) c5j0Var : null;
        if (f2mVar != null && (a = f2mVar.a()) != null) {
            str = a.a;
        }
        if (!jl40.l(str, "bdui/v1/superapp/favorites")) {
            return b.f();
        }
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("is_full_document_request", qcx.a(Boolean.valueOf(c5j0Var instanceof d2m)));
        SuperappFavoritesFilter superappFavoritesFilter = this.a.a;
        if (superappFavoritesFilter != null) {
            mapBuilder.put("filter", ((xnt) this.b).a(superappFavoritesFilter, SuperappFavoritesFilter.Companion.serializer()));
        }
        return mapBuilder.j();
    }

    @Override // defpackage.hv90
    public final Map b() {
        return b.f();
    }
}
