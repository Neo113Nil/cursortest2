package xsna;

import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.picture.VkImage;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.common.ImageSize;
import com.vk.dto.photo.Photo;
import com.vkontakte.android.R;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/* compiled from: BaseSellerHolder.kt */
/* loaded from: classes4.dex */
public abstract class rm6 extends m56<SnippetAttachment> {
    public static final float M;
    public static final float N;
    public static final int O;
    public final DecimalFormat D;
    public final TextView E;
    public final TextView F;
    public final TextView G;
    public final TextView H;
    public final VkImage I;
    public final VkImage J;
    public final ImageView K;
    public final SpannableStringBuilder L;

    static {
        cn70.a();
        M = cn70.a() * 12.0f;
        N = cn70.a() * 12.0f;
        O = cn70.b(3);
    }

    public rm6(ViewGroup viewGroup, int i) {
        super(i, viewGroup);
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setDecimalSeparator(',');
        s3q0 s3q0Var = s3q0.a;
        this.D = new DecimalFormat("#.0", decimalFormatSymbols);
        this.E = (TextView) this.itemView.findViewById(R.id.title);
        this.F = (TextView) this.itemView.findViewById(R.id.author);
        this.G = (TextView) this.itemView.findViewById(R.id.rating);
        this.H = (TextView) this.itemView.findViewById(R.id.sellerBadge);
        VkImage vkImage = (VkImage) this.itemView.findViewById(R.id.image);
        this.I = vkImage;
        this.J = (VkImage) this.itemView.findViewById(R.id.sellerImage);
        this.K = (ImageView) this.itemView.findViewById(R.id.fave);
        this.L = new SpannableStringBuilder();
        float f = M;
        float f2 = N;
        vkImage.z0(f, f, f2, f2);
        abg0 abg0Var = dhr0.t;
        vkImage.setPlaceholderColor(abg0Var.c(R.attr.vk_ui_image_placeholder));
        X6().setBackground(new d1x(this.itemView.getContext(), gbg0.a(this.itemView.getResources(), 12.0f), abg0Var.c(R.attr.vk_ui_background_tertiary), gbg0.a(this.itemView.getResources(), 0.33f), abg0Var.c(R.attr.vk_ui_separator_secondary)));
    }

    public abstract View X6();

    @Override // xsna.m56
    /* renamed from: Y6, reason: merged with bridge method [inline-methods] */
    public void T6(SnippetAttachment snippetAttachment) {
        float f = snippetAttachment.s;
        String str = snippetAttachment.D;
        Photo photo = snippetAttachment.p;
        ImageSize Fb = photo != null ? photo.Fb(iah0.f().widthPixels, false) : null;
        this.I.o0(Fb != null ? Fb.d.d : null, null);
        VkImage vkImage = this.J;
        if (str != null) {
            bwt0.p0(vkImage, true);
            vkImage.o0(str, null);
        } else {
            bwt0.p0(vkImage, false);
        }
        this.E.setText(snippetAttachment.g);
        this.F.setText(snippetAttachment.C);
        SpannableStringBuilder spannableStringBuilder = this.L;
        spannableStringBuilder.clear();
        spannableStringBuilder.append((CharSequence) " ");
        int i = snippetAttachment.E;
        int i2 = O;
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || i <= 0) {
            ylw ylwVar = new ylw(R.drawable.vk_icon_favorite_16);
            ylwVar.h = R.attr.vk_ui_icon_secondary;
            ylwVar.f = i2;
            spannableStringBuilder.append((CharSequence) ylwVar.b(this.itemView.getContext())).append((CharSequence) " ").append((CharSequence) this.itemView.getContext().getString(R.string.snippet_seller_product_no_reviews));
        } else {
            ylw ylwVar2 = new ylw(R.drawable.vk_icon_favorite_16);
            ylwVar2.h = R.attr.vk_ui_accent_orange_peach;
            ylwVar2.f = i2;
            spannableStringBuilder.append((CharSequence) ylwVar2.b(this.itemView.getContext())).append((CharSequence) (" " + this.D.format(Float.valueOf(f)))).append((CharSequence) " · ").append((CharSequence) enj.f(R.plurals.review_count, i, this.itemView.getContext()));
        }
        this.G.setText(spannableStringBuilder);
        this.H.setText(snippetAttachment.i);
        ImageView imageView = this.K;
        if (imageView != null) {
            imageView.setActivated(epx.f(snippetAttachment.w, Boolean.TRUE));
        }
    }

    public final void b7() {
        SnippetAttachment snippetAttachment = (SnippetAttachment) this.C;
        if (snippetAttachment == null) {
            return;
        }
        Parcelable q6 = q6();
        c6z c6zVar = q6 instanceof c6z ? (c6z) q6 : null;
        gd60.X0(hd60.a(), this.itemView.getContext(), snippetAttachment, new pqq(null, this.u, c6zVar != null ? c6zVar.r() : null, null, 9), new com.vk.movika.tools.controls.seekbar.v(this, 1), new lb(this, 11), 32);
    }
}
