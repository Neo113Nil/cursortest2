package xsna;

import android.view.ViewGroup;
import android.webkit.URLUtil;
import com.vk.core.util.measure.ScaleType;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.card.VkCard;
import com.vk.core.view.components.text.VkText;
import com.vk.core.view.image.VkEnhancedImageView;
import com.vk.dto.common.DzenArticleBlockItem;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.im.Image;
import com.vkontakte.android.R;

/* compiled from: DzenArticleHolder.kt */
/* loaded from: classes4.dex */
public final class kro extends vif0<DzenArticleBlockItem> {
    public final wzs<String, Integer, s3q0> n;
    public final wzs<String, Integer, s3q0> o;
    public final VkCard p;
    public final VkEnhancedImageView q;
    public final VkText r;
    public final VkButton s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kro(ViewGroup viewGroup, wmg wmgVar, wa5 wa5Var) {
        super(viewGroup, R.layout.holder_dzen_article, 0);
        viewGroup.getContext();
        this.n = wmgVar;
        this.o = wa5Var;
        this.itemView.getContext();
        VkCard vkCard = (VkCard) this.itemView.findViewById(R.id.card_container_dzen_article);
        this.p = vkCard;
        VkEnhancedImageView vkEnhancedImageView = (VkEnhancedImageView) this.itemView.findViewById(R.id.image_dzen_article);
        this.q = vkEnhancedImageView;
        this.r = (VkText) this.itemView.findViewById(R.id.text_dzen_article);
        this.s = (VkButton) this.itemView.findViewById(R.id.button_dzen_article);
        vkCard.setCardRadius(iah0.b(12.0f));
        bwt0.d(vkEnhancedImageView, iah0.b(4.0f), (r4 & 2) != 0, (r4 & 4) != 0);
        vkEnhancedImageView.setScaleType(ScaleType.CENTER_CROP);
    }

    @Override // xsna.vif0
    public final void i6(DzenArticleBlockItem dzenArticleBlockItem) {
        DzenArticleBlockItem dzenArticleBlockItem2 = dzenArticleBlockItem;
        String str = dzenArticleBlockItem2 != null ? dzenArticleBlockItem2.c : null;
        if (str == null) {
            str = "";
        }
        this.r.setText(str);
        String str2 = dzenArticleBlockItem2 != null ? dzenArticleBlockItem2.f : null;
        if (str2 == null) {
            str2 = "";
        }
        VkButton vkButton = this.s;
        vkButton.setText(str2);
        String str3 = dzenArticleBlockItem2 != null ? dzenArticleBlockItem2.e : null;
        String str4 = str3 != null ? str3 : "";
        this.q.setRemoteImage(URLUtil.isValidUrl(str4) ? new ImageSize(new Image(str4), (char) 0, false, 6, (zcl) null) : null);
        this.p.setOnClickListener(new brg(1, dzenArticleBlockItem2, this));
        vkButton.setOnClickListener(new wnb(2, dzenArticleBlockItem2, this));
    }
}
