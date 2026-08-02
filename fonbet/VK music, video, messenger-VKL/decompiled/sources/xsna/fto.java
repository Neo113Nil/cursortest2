package xsna;

import android.content.Context;
import android.view.ViewGroup;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.common.PostActions;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: DzenArticlesBlockHeaderHolder.kt */
/* loaded from: classes4.dex */
public final class fto extends rp6<gto, NewsEntry> {
    public static final /* synthetic */ int F = 0;
    public final VkGroupHeader E;

    /* compiled from: DzenArticlesBlockHeaderHolder.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<s3q0> {
        /* JADX WARN: Type inference failed for: r1v1, types: [com.vk.feed.core.models.news.NewsEntry] */
        @Override // xsna.gzs
        public final s3q0 invoke() {
            fto ftoVar = (fto) this.receiver;
            int i = fto.F;
            ?? q6 = ftoVar.q6();
            if (q6 != 0 && !jjc.b()) {
                u1c0 J0 = ftoVar.J0();
                ftoVar.D.sa(new NewsfeedExternalAction.d.a(q6, ftoVar.t6(), PostActions.ACTION_IGNORE.h(), J0 != null ? J0.k : 0));
            }
            return s3q0.a;
        }
    }

    public fto(ViewGroup viewGroup) {
        super(R.layout.header_dzen_articles_block, viewGroup);
        VkGroupHeader vkGroupHeader = (VkGroupHeader) this.itemView.findViewById(R.id.group_header_dzen_articles_block);
        this.E = vkGroupHeader;
        vkGroupHeader.setSize(VkGroupHeader.Size.Medium);
        zq70.G(vkGroupHeader);
        vkGroupHeader.setRight(new VkGroupHeader.Right(null, new VkGroupHeader.Right.b(new gko(R.drawable.vk_icon_cancel_outline_24), new x7g(R.attr.vk_ui_icon_secondary), tq.h(tlo0.Companion, R.string.hide_not_interesting), new a(0, this, fto.class, "onHideButtonClick", "onHideButtonClick()V", 0)), null, 5));
    }

    @Override // xsna.rp6
    public final void R6(gto gtoVar) {
        gto gtoVar2 = gtoVar;
        Context context = this.itemView.getContext();
        String str = gtoVar2.i;
        if (str == null) {
            str = "logo_dzen_color_28";
        }
        int m = znk0.m(context, str);
        if (m == 0) {
            m = R.drawable.vk_icon_logo_dzen_color_28;
        }
        String str2 = gtoVar2.h;
        if (str2 == null) {
            str2 = "";
        }
        VkGroupHeader.d dVar = new VkGroupHeader.d(str2, null, null, null, 0, null, 510);
        VkGroupHeader vkGroupHeader = this.E;
        vkGroupHeader.setTitle(dVar);
        vkGroupHeader.setLeft(new VkGroupHeader.a.C0842a(new gko(m), null, 6));
    }

    @Override // xsna.qi6, me.grishka.appkit.views.UsableRecyclerView.e
    public final void onClick() {
    }
}
