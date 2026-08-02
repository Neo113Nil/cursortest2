package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSection;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.stat.scheme.SchemeStat$EventItem;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.u4a;

/* compiled from: ShowAllOnOverscrollDelegate.kt */
/* loaded from: classes16.dex */
public final class phj0 {
    public final CatalogConfiguration a;
    public final u4a b;
    public final RecyclerView c;
    public final RecyclerView.k d = new RecyclerView.k();
    public final d490 e;
    public UIBlockActionOpenSection f;

    /* compiled from: ShowAllOnOverscrollDelegate.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            phj0 phj0Var = (phj0) this.receiver;
            u4a u4aVar = phj0Var.b;
            UIBlockActionOpenSection uIBlockActionOpenSection = phj0Var.f;
            if (uIBlockActionOpenSection != null) {
                u4a.a aVar = u4aVar.b;
                SearchStatsLoggingInfo b = aVar.m.b(SchemeStat$EventItem.Type.CATALOG_ITEM, "", true);
                aVar.f.a(new cfp0(uIBlockActionOpenSection, null));
                nda.e(aVar.b, phj0Var.c.getContext(), phj0Var.a, uIBlockActionOpenSection.B, uIBlockActionOpenSection.z, uIBlockActionOpenSection.E, b, null, PsExtractor.AUDIO_STREAM);
            }
            return s3q0.a;
        }
    }

    public phj0(CatalogConfiguration catalogConfiguration, u4a u4aVar, RecyclerView recyclerView) {
        this.a = catalogConfiguration;
        this.b = u4aVar;
        this.c = recyclerView;
        this.e = new d490(recyclerView, new a(0, this, phj0.class, "showAll", "showAll()V", 0));
    }
}
