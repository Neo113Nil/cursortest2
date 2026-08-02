package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.card.VkCard;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.text.VkText;
import com.vk.core.view.fresco.VKEnhancedImageView;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.LinkButton;
import com.vk.fave.entities.FaveEntry;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PodcastAttachment;

/* compiled from: AttachSnippetCompactHolder.kt */
/* loaded from: classes4.dex */
public abstract class m34<T extends Attachment> extends m56<T> implements View.OnClickListener, blc0 {
    public final VkCard D;
    public final ViewGroup E;
    public final VKEnhancedImageView F;
    public final ViewGroup G;
    public final ViewGroup H;
    public final VkText I;
    public final VkText J;
    public final VkText K;
    public final VkImage L;
    public final VkButton M;
    public final View N;
    public View.OnClickListener O;
    public e6o P;
    public e6o Q;

    public m34(ViewGroup viewGroup) {
        super(R.layout.attach_snippet_compact, viewGroup);
        VkCard vkCard = (VkCard) this.itemView.findViewById(R.id.attachment_container);
        vkCard.setCardRadius(iah0.b(10.0f));
        vkCard.setBorderColorAttr(R.attr.vk_ui_image_border_alpha);
        vkCard.setDrawBorder(true);
        this.D = vkCard;
        this.E = (ViewGroup) this.itemView.findViewById(R.id.image_container);
        this.F = (VKEnhancedImageView) this.itemView.findViewById(R.id.attach_photo);
        this.G = (ViewGroup) this.itemView.findViewById(R.id.text_container);
        this.H = (ViewGroup) this.itemView.findViewById(R.id.description_container);
        this.I = (VkText) this.itemView.findViewById(R.id.media_restriction_view);
        this.J = (VkText) this.itemView.findViewById(R.id.attach_title);
        this.K = (VkText) this.itemView.findViewById(R.id.attach_subtitle);
        VkImage vkImage = (VkImage) hvt0.b(this.itemView, R.id.attach_favorite_button, this);
        vkImage.setBackgroundTintList(dhr0.r(R.attr.vk_ui_icon_secondary));
        this.L = vkImage;
        this.M = (VkButton) hvt0.b(this.itemView, R.id.attach_main_button, this);
        this.N = this.itemView.findViewById(R.id.attach_remove_button);
        X6();
    }

    @Override // xsna.blc0
    public final void D1(boolean z) {
        bwt0.p0(this.N, z);
        bwt0.p0(this.L, !z);
    }

    @Override // xsna.qi6
    public void Q6(s6o s6oVar) {
        super.Q6(s6oVar);
        ba baVar = s6oVar.e;
        this.P = s6oVar.a(this, baVar);
        View.OnClickListener onClickListener = this.O;
        if (onClickListener != null) {
            this.Q = s6oVar.a(onClickListener, baVar);
        }
        X6();
    }

    public void X6() {
        View view = this.itemView;
        View.OnClickListener onClickListener = this.P;
        if (onClickListener == null) {
            onClickListener = this;
        }
        view.setOnClickListener(onClickListener);
        View.OnClickListener onClickListener2 = this.O;
        if (onClickListener2 != null) {
            e6o e6oVar = this.Q;
            if (e6oVar != null) {
                onClickListener2 = e6oVar;
            }
            this.N.setOnClickListener(onClickListener2);
        }
    }

    public final void Y6(PodcastAttachment podcastAttachment, LinkButton linkButton) {
        Integer valueOf = Integer.valueOf(podcastAttachment.Db() ? R.drawable.vk_icon_donut_color_12 : 0);
        int[] iArr = VkButton.W;
        VkButton vkButton = this.M;
        vkButton.a5(true, valueOf);
        vkButton.setText(linkButton != null ? linkButton.b : null);
        vkButton.setContentDescription(linkButton != null ? linkButton.b : null);
    }

    public final void b7(boolean z) {
        boolean z2 = q6() instanceof FaveEntry;
        ViewGroup viewGroup = this.G;
        VkImage vkImage = this.L;
        View view = this.N;
        if (z2 || bwt0.K(view)) {
            bwt0.p0(vkImage, false);
            f4m.r(bwt0.K(view) ? iah0.a(48) : iah0.a(12), viewGroup);
        } else {
            bwt0.p0(vkImage, true);
            vkImage.setBackground(dhr0.t.a(z ? R.drawable.vk_icon_bookmark_24 : R.drawable.vk_icon_bookmark_outline_24));
            vkImage.setContentDescription(z ? v6(R.string.fave_accessibility_remove_from_favorite) : v6(R.string.fave_accessibility_add_to_favorite));
            f4m.r(iah0.a(44), viewGroup);
        }
    }

    @Override // xsna.blc0
    public final void j1(View.OnClickListener onClickListener) {
        this.O = onClickListener;
        s6o s6oVar = this.q;
        this.Q = s6oVar != null ? s6oVar.a(onClickListener, s6oVar.e) : null;
        X6();
    }

    @Override // xsna.blc0
    public void p5() {
    }

    @Override // xsna.blc0
    public final void Z1(x64 x64Var) {
    }
}
