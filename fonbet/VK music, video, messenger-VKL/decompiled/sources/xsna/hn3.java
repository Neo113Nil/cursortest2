package xsna;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Size;
import android.view.View;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.cell.rich.VkRichCell;
import com.vk.dto.articles.Article;
import com.vk.dto.articles.ArticleDonut;
import com.vk.dto.common.ImageSize;
import com.vk.dto.photo.Photo;
import com.vkontakte.android.R;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.e3m;
import xsna.iq3;
import xsna.k1u0;
import xsna.ngv0;
import xsna.tlo0;

/* compiled from: ArticleAuthorPageSmallItemHolder.kt */
/* loaded from: classes15.dex */
public final class hn3 extends hf6<ym3> {
    public final VkRichCell m;

    public hn3(View view, hg hgVar) {
        super(view);
        this.m = (VkRichCell) this.itemView.findViewById(R.id.vk_rich_cell);
        jjc.g(this.itemView, new nv2(1, this, hgVar));
    }

    @Override // xsna.hf6
    public final void W5(ym3 ym3Var) {
        SpannableStringBuilder spannableStringBuilder;
        vgv0 vgv0Var;
        ugv0 ugv0Var;
        ImageSize Fb;
        ym3 ym3Var2 = ym3Var;
        Article article = ym3Var2.a;
        boolean z = article.n;
        ArticleDonut articleDonut = article.q;
        CharSequence charSequence = article.f;
        if (articleDonut != null && articleDonut.b) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(" ");
            spannableStringBuilder2.append(charSequence);
            Context context = this.itemView.getContext();
            e3m.a aVar = e3m.a;
            spannableStringBuilder2.setSpan(new dqa(new baf0(m33.a(R.drawable.vk_icon_star_circle_12, context), this.itemView.getContext().getColor(R.color.vk_orange))), 0, 1, 0);
            charSequence = spannableStringBuilder2;
        }
        String str = article.g;
        VkCell.Right.d dVar = null;
        if (str != null) {
            spannableStringBuilder = new SpannableStringBuilder(str);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(dhr0.t.c(R.attr.vk_ui_text_secondary)), 0, str.length(), 0);
        } else {
            spannableStringBuilder = null;
        }
        iq3.a aVar2 = new iq3.a();
        VkRichCell vkRichCell = this.m;
        vkRichCell.setLeftMainViewController(aVar2);
        VkCell.Left.a aVar3 = VkCell.Left.Companion;
        Photo photo = article.l;
        vkRichCell.setLeft(VkCell.Left.a.a(aVar3, new VkCell.Left.Main.e(new iq3.b((photo == null || (Fb = photo.Fb(iah0.a((float) 76), false)) == null) ? null : Fb.d.d), new Size(iah0.a(100), iah0.a(76)))));
        if (charSequence != null) {
            tlo0.h f = u11.f(tlo0.Companion, charSequence);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            vgv0Var = new vgv0(f, (ngv0.a) null, (ngv0) null, 2, 6);
        } else {
            vgv0Var = null;
        }
        if (spannableStringBuilder != null) {
            tlo0.Companion.getClass();
            tlo0.h hVar = new tlo0.h(spannableStringBuilder);
            TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
            ugv0Var = new ugv0(hVar, (ngv0.a) null, (ngv0.a) null, 1, (fy0) null, 38);
        } else {
            ugv0Var = null;
        }
        vkRichCell.setMiddle(ahn.v(vgv0Var, ugv0Var, new qgv0(oq.d(tlo0.Companion, ym3Var2.c), (ngv0.a) null, (ngv0.a) null, 0, 30), null, null, null, null, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED));
        if (enq.a.a()) {
            dVar = new VkCell.Right.d((VkCell.Right.a) null, new VkCell.Right.e.b((dko) new gko(z ? R.drawable.vk_icon_bookmark_24 : R.drawable.vk_icon_bookmark_outline_24), (k1u0) new k1u0.a(new x7g(R.attr.vk_ui_icon_secondary)), (Size) null, (tlo0) new tlo0.f(z ? R.string.fave_accessibility_remove_from_favorite : R.string.fave_accessibility_add_to_favorite), false, (gzs) new i4(2, ym3Var2, this), 20), (VkCell.Right.ExtraAction.a) null, (VkCell.Right.b) null, 29);
        }
        vkRichCell.setRight(dVar);
    }
}
