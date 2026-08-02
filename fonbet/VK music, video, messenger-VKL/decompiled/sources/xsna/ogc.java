package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.ecomm.api.analytics.MarketAnalyticsParams;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: ClassifiedsCatalogUIViewTracker.kt */
/* loaded from: classes16.dex */
public final class ogc extends vha {
    public final boolean f;
    public final MarketAnalyticsParams g;
    public final dha h;
    public hhc i;
    public qdh0 j;

    public ogc(boolean z, MarketAnalyticsParams marketAnalyticsParams, dha dhaVar) {
        super(z, null, null, 14);
        this.f = z;
        this.g = marketAnalyticsParams;
        this.h = dhaVar;
    }

    @Override // xsna.vha, xsna.d680
    public final List<hzp0> j(Object obj) {
        return EmptyList.b;
    }

    @Override // xsna.vha
    public final void q() {
        hhc hhcVar = this.i;
        if (hhcVar != null) {
            hhcVar.b();
        }
    }

    @Override // xsna.vha
    public final void r(List<? extends UIBlock> list) {
        hhc hhcVar = this.i;
        if (hhcVar != null) {
            hhcVar.a();
        }
    }

    @Override // xsna.vha
    public final void s(RecyclerView recyclerView) {
        this.i = new hhc(recyclerView, new ihc(this.g, this.h, this.j), this.f, new k00(this, recyclerView));
    }
}
