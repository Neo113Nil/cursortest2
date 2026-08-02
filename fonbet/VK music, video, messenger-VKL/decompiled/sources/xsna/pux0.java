package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.stickers.StickerSuggestion;
import com.vkontakte.android.R;

/* compiled from: StickerWordsHolder.kt */
/* loaded from: classes6.dex */
public final class pux0 extends vfz<rux0> {
    public final k8l0 l;
    public final TextView m;
    public final ImageView n;
    public final int o;

    public pux0(ViewGroup viewGroup, k8l0 k8l0Var) {
        super(R.layout.sticker_suggest_list_word_item, viewGroup);
        this.l = k8l0Var;
        this.m = (TextView) this.itemView.findViewById(R.id.word);
        this.n = (ImageView) this.itemView.findViewById(R.id.remove);
        this.o = e3m.a(R.dimen.sticker_suggest_horizontal_padding, this.itemView.getContext());
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(rux0 rux0Var) {
        rux0 rux0Var2 = rux0Var;
        ucp ucpVar = ucp.a;
        StickerSuggestion stickerSuggestion = rux0Var2.d;
        CharSequence i = ucp.i(stickerSuggestion.b);
        TextView textView = this.m;
        textView.setText(i);
        boolean z = stickerSuggestion.d;
        ImageView imageView = this.n;
        if (z) {
            f4m.w(cn70.b(28), textView);
            f4m.w(cn70.b(4), this.itemView);
            imageView.setVisibility(0);
            jjc.g(imageView, new f1p0(7, this, rux0Var2));
            if (stickerSuggestion.e) {
                this.itemView.setAlpha(0.4f);
                imageView.setImageResource(R.drawable.vk_icon_arrow_uturn_left_outline_20);
            } else {
                this.itemView.setAlpha(1.0f);
                imageView.setImageResource(R.drawable.vk_icon_cancel_20);
            }
            View view = this.itemView;
            view.setContentDescription(view.getContext().getString(R.string.sticker_details_overlay_accessibility_word_user, i));
        } else {
            f4m.w(0, textView);
            f4m.w(this.o, this.itemView);
            this.itemView.setAlpha(1.0f);
            f4m.j(imageView);
        }
        if (stickerSuggestion.c) {
            textView.setContentDescription(this.itemView.getContext().getString(R.string.sticker_details_overlay_accessibility_word_primary, i));
            this.itemView.setBackgroundResource(R.drawable.shape_suggest_primary);
        } else {
            this.itemView.setBackgroundResource(R.drawable.shape_suggest);
        }
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        FlexboxLayoutManager.LayoutParams layoutParams2 = layoutParams instanceof FlexboxLayoutManager.LayoutParams ? (FlexboxLayoutManager.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
    }
}
