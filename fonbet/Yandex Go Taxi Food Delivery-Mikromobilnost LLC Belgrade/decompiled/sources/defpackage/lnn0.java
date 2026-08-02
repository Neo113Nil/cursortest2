package defpackage;

import com.yandex.go.dto.response.q1;
import com.yandex.go.shortcuts.dto.response.Counters;
import com.yandex.go.shortcuts.dto.response.Layout;
import com.yandex.go.shortcuts.dto.response.f0;
import com.yandex.go.shortcuts.models.OfferType;
import com.yandex.go.shortcuts.view.adapter.model.BaseShortcutModel$Source;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes13.dex */
public final class lnn0 implements f4s0 {
    public final zuj0 a;

    public lnn0(zuj0 zuj0Var) {
        this.a = zuj0Var;
    }

    @Override // defpackage.f4s0
    public final d4s0 a() {
        return new d4s0(new Layout(0), e1z.a, null, scc.g(b(), b()), null, null, null, null, null, false, 2548);
    }

    public final kf10 b() {
        ba5 ba5Var = new ba5(qje.t(xng0.controlMinor, ((avj0) this.a).a));
        BaseShortcutModel$Source baseShortcutModel$Source = BaseShortcutModel$Source.LOCAL;
        OfferType offerType = OfferType.MEDIA;
        da5 da5Var = da5.c;
        return new kf10("LOADING_ITEM_ID", new ea5(3, 3, ba5Var, "LOADING_GRID_ID", baseShortcutModel$Source, offerType, da5Var, da5Var, new fa5(0), "LOADING_ITEM_ID", (q1) null, EmptyList.a, (f0) null, (Counters) null, (List) null, 61440), new g8v(0), 56);
    }
}
