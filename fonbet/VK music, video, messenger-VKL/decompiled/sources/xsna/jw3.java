package xsna;

import com.vk.catalog2.common.ui.holders.search.SearchResultsVh;
import com.vk.catalog2.common.ui.holders.search.SearchState;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.search.ui.SearchParametersBottomView;
import com.vk.search.ui.api.SearchInputMethod;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchVideoRootVh;
import com.vk.search.ui.impl.catalog.roots.MusicSearchCatalogRootVh;
import com.vk.voip.ui.asr.ui.start.AsrRecordStartFragment;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: AsrRecordStartFragment.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class jw3 extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jw3(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder, xsna.n0i0] */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ((AsrRecordStartFragment) this.receiver).tn();
                return s3q0.a;
            case 1:
                GlobalSearchVideoRootVh globalSearchVideoRootVh = (GlobalSearchVideoRootVh) this.receiver;
                SearchParametersBottomView searchParametersBottomView = globalSearchVideoRootVh.F;
                if (searchParametersBottomView == null) {
                    searchParametersBottomView = null;
                }
                bwt0.p0(searchParametersBottomView, false);
                RecyclerPaginatedView ck = globalSearchVideoRootVh.A.c().b.ck();
                if (ck != null) {
                    awt0.x(ck, 0, 0, 0, 0, 7);
                }
                return s3q0.a;
            case 2:
                ((MusicSearchCatalogRootVh) this.receiver).getClass();
                return Boolean.valueOf(com.vk.toggle.d.K());
            default:
                o0i0 o0i0Var = (o0i0) this.receiver;
                o0i0Var.getClass();
                o0i0Var.e(SearchState.Suggestion);
                SearchResultsVh.cb(o0i0Var.c(), "", null, null, false, SearchInputMethod.Keyboard, false, 46);
                o0i0Var.b.y6();
                return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jw3(Object obj) {
        super(0, obj, MusicSearchCatalogRootVh.class, "isObjectSearchHistoryEnabled", "isObjectSearchHistoryEnabled()Z", 0);
        this.b = 2;
    }
}
