package xsna;

import android.view.ViewGroup;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import xsna.b0g;

/* compiled from: NewsfeedPagingLoaderHolder.kt */
/* loaded from: classes4.dex */
public final class pu60 extends rp6<bf90, NewsEntry> {
    public final h170 E;
    public final VkSpinner F;

    public pu60(ViewGroup viewGroup, h170 h170Var) {
        super(R.layout.vk_view_default_list_loading, viewGroup);
        this.D = t980.a;
        this.E = h170Var;
        this.F = (VkSpinner) this.itemView.findViewById(R.id.load_more_progress);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.rp6
    public final void R6(bf90 bf90Var) {
        if (((Boolean) this.E.b.getValue()).booleanValue()) {
            this.F.setIndeterminate(false);
            final WeakReference weakReference = new WeakReference(this);
            b0g b0gVar = b0g.a;
            b0g.a(new b0g.a() { // from class: xsna.ou60
                @Override // xsna.b0g.a
                public final void a() {
                    VkSpinner vkSpinner;
                    pu60 pu60Var = (pu60) weakReference.get();
                    if (pu60Var == null || (vkSpinner = pu60Var.F) == null) {
                        return;
                    }
                    vkSpinner.setIndeterminate(true);
                }
            });
        }
    }
}
