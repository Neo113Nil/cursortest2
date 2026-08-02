package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;

/* compiled from: ClipsAuthorSelectorTitleDelegate.kt */
/* loaded from: classes14.dex */
public final class lhd extends p1u0<khd> {

    /* compiled from: ClipsAuthorSelectorTitleDelegate.kt */
    public static final class a extends vfz<khd> {
        public final Object l;

        public a(View view) {
            super(view);
            this.l = msy.a(LazyThreadSafetyMode.NONE, new j1(view, 23));
        }

        /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.vfz
        /* renamed from: W5 */
        public final void i6(khd khdVar) {
            ?? r9 = this.l;
            ((VkGroupHeader) r9.getValue()).setSize(VkGroupHeader.Size.Small);
            ((VkGroupHeader) r9.getValue()).setTitle(new VkGroupHeader.d(this.itemView.getContext().getString(R.string.clips_authors_selector_list_header_title), null, null, null, 0, null, 510));
        }
    }

    @Override // xsna.p1u0
    public final vfz<? extends khd> b(ViewGroup viewGroup) {
        return new a(bwt0.I(R.layout.clips_authors_selector_list_header_item, viewGroup, false));
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof khd;
    }
}
