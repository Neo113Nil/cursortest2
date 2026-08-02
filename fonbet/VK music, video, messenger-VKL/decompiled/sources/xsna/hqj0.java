package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.view.components.divider.VkDivider;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.text.VkFadeText;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Digest;
import com.vk.dto.newsfeed.entries.DigestItem;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: SimpleDigestTextItemHolder.kt */
/* loaded from: classes4.dex */
public final class hqj0 extends uym {
    public static final /* synthetic */ int V = 0;
    public final View Q;
    public final VkImage R;
    public final VkDivider S;
    public final ViewGroup T;
    public final View U;

    public hqj0(ViewGroup viewGroup) {
        super(viewGroup);
        this.Q = this.itemView.findViewById(R.id.digest_icon);
        VkImage vkImage = (VkImage) this.itemView.findViewById(R.id.digest_photo);
        this.R = vkImage;
        this.S = (VkDivider) this.itemView.findViewById(R.id.digest_separator);
        this.T = (ViewGroup) this.itemView.findViewById(R.id.digest_container);
        this.U = this.itemView.findViewById(R.id.digest_wrapper);
        dek0.b(vkImage, null, null, 6);
        vkImage.setPlaceholderImage(this.N);
        vkImage.y0(cn70.a() * 0.5f, viewGroup.getContext().getColor(R.color.vk_black_alpha12));
        VkImage vkImage2 = this.I;
        getContext();
        vkImage2.setCornerRadius(cn70.a() * 8.0f);
        this.I.y0(cn70.a() * 0.5f, viewGroup.getContext().getColor(R.color.vk_black_alpha12));
        this.E.setOnClickListener(this);
        VkText vkText = this.G;
        VkFadeText vkFadeText = vkText instanceof VkFadeText ? (VkFadeText) vkText : null;
        if (vkFadeText != null) {
            vkFadeText.setMaxTextLines(2);
        }
        VkText vkText2 = this.F;
        VkFadeText vkFadeText2 = vkText2 instanceof VkFadeText ? (VkFadeText) vkText2 : null;
        if (vkFadeText2 != null) {
            vkFadeText2.setMaxTextLines(1);
        }
    }

    @Override // xsna.uym, xsna.jym
    public final void R6(DigestItem digestItem) {
        baf0 baf0Var;
        super.R6(digestItem);
        Post post = digestItem.g;
        post.l.getClass();
        Owner owner = post.o;
        VerifyInfo verifyInfo = owner.f;
        if (verifyInfo != null) {
            VerifyInfoHelper verifyInfoHelper = VerifyInfoHelper.a;
            baf0Var = VerifyInfoHelper.f(this.itemView.getContext(), VerifyInfoHelper.ColorTheme.normal, verifyInfo);
        } else {
            baf0Var = null;
        }
        boolean z = baf0Var != null;
        View view = this.Q;
        if (z) {
            view.setBackground(baf0Var);
        }
        bwt0.p0(view, z);
        this.R.o0(owner.f(cn70.b(16)), null);
    }

    @Override // xsna.uym
    public final void h7() {
        List<DigestItem> list;
        NewsEntry t6 = t6();
        Digest digest = t6 instanceof Digest ? (Digest) t6 : null;
        Digest.Footer footer = digest != null ? digest.l : null;
        getContext();
        VkDivider vkDivider = this.S;
        boolean z = true;
        if (footer != null && !footer.b.equals("button")) {
            bwt0.p0(vkDivider, true);
            return;
        }
        NewsEntry t62 = t6();
        Digest digest2 = t62 instanceof Digest ? (Digest) t62 : null;
        if (digest2 != null && (list = digest2.m) != null && list.size() == this.C + 1) {
            z = false;
        }
        bwt0.p0(vkDivider, z);
    }

    @Override // xsna.uym
    public final void i7(boolean z) {
        ViewGroup viewGroup = this.T;
        View view = this.U;
        if (z) {
            f4m.r(cn70.b(8) + this.K, view);
            bwt0.p0(viewGroup, true);
        } else {
            f4m.r(0, view);
            bwt0.p0(viewGroup, false);
        }
    }
}
