package xsna;

import com.vk.dto.group.Group;
import com.vk.geo.api.data.GeoStaticPreviewInput;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* compiled from: SearchCommunitiesOnMapGeoDataSource.kt */
/* loaded from: classes5.dex */
public final class qoh0 implements izs<Pair<? extends List<? extends GeoStaticPreviewInput.Item>, ? extends Map<Long, ? extends Group>>, s3q0> {
    public final /* synthetic */ lq9 b;
    public final /* synthetic */ com.vk.search.communities.map.impl.ui.map.d c;

    public qoh0(lq9 lq9Var, com.vk.search.communities.map.impl.ui.map.d dVar) {
        this.b = lq9Var;
        this.c = dVar;
    }

    @Override // xsna.izs
    public final s3q0 invoke(Pair<? extends List<? extends GeoStaticPreviewInput.Item>, ? extends Map<Long, ? extends Group>> pair) {
        Pair<? extends List<? extends GeoStaticPreviewInput.Item>, ? extends Map<Long, ? extends Group>> pair2 = pair;
        List<? extends GeoStaticPreviewInput.Item> d = pair2.d();
        for (Map.Entry<Long, ? extends Group> entry : pair2.g().entrySet()) {
            this.c.e.put(entry.getKey(), entry.getValue());
        }
        this.b.resumeWith(d);
        return s3q0.a;
    }
}
