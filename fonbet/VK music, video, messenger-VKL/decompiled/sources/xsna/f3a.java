package xsna;

import com.vk.catalog2.common.ui.holders.api.CatalogPaginatedListViewHolder;
import com.vk.core.apps.BuildInfo;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.VKApplication;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class f3a implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f3a(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                gzs<s3q0> gzsVar = ((g3a) this.c).j;
                if (gzsVar != null) {
                    gzsVar.invoke();
                    break;
                }
                break;
            case 1:
                kea keaVar = (kea) this.c;
                keaVar.x = false;
                keaVar.z = true;
                keaVar.y = false;
                keaVar.D.getClass();
                BuildInfo.Client client = BuildInfo.a;
                VKApplication vKApplication = com.vk.core.apps.a.a;
                CatalogPaginatedListViewHolder catalogPaginatedListViewHolder = keaVar.c;
                if (catalogPaginatedListViewHolder != null) {
                    qda qdaVar = keaVar.N;
                    if (qdaVar == null) {
                        qdaVar = kea.Q;
                    }
                    catalogPaginatedListViewHolder.Pl(qdaVar);
                }
                gzs<s3q0> gzsVar2 = keaVar.t;
                if (gzsVar2 != null) {
                    gzsVar2.invoke();
                    break;
                }
                break;
            case 2:
                ((io.reactivex.rxjava3.disposables.c) this.c).dispose();
                break;
            case 3:
                ((nma0) this.c).e.yn();
                break;
            case 4:
                na60.i((NewsEntry) this.c, false);
                break;
            default:
                ((com.vk.voip.ui.hint.a) this.c).c();
                break;
        }
    }
}
