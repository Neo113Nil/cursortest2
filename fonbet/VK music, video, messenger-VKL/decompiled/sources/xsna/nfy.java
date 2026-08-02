package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.vk.dto.stickers.Price;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.vas.design.view.VkDiscountTextView;
import com.vkontakte.android.R;

/* compiled from: KeyboardHeaderBuyHolder.kt */
/* loaded from: classes6.dex */
public final class nfy extends qf6 {
    public final y4l0 l;
    public final TextView m;
    public final TextView n;
    public final VkDiscountTextView o;
    public final ImageButton p;
    public final View q;
    public final ProgressBar r;
    public final View s;
    public final View t;
    public final View u;

    public nfy(ViewGroup viewGroup, y4l0 y4l0Var) {
        super(viewGroup, R.layout.sticker_keyboard_buy_header, 0);
        this.l = y4l0Var;
        this.m = (TextView) this.itemView.findViewById(R.id.title);
        this.n = (TextView) this.itemView.findViewById(R.id.subtitle);
        this.o = (VkDiscountTextView) this.itemView.findViewById(R.id.sticker_button);
        this.p = (ImageButton) this.itemView.findViewById(R.id.gift_button);
        this.q = this.itemView.findViewById(R.id.sticker_ok);
        ProgressBar progressBar = (ProgressBar) this.itemView.findViewById(R.id.sticker_progress);
        this.r = progressBar;
        this.s = this.itemView.findViewById(R.id.sticker_error);
        View findViewById = this.itemView.findViewById(R.id.header_container);
        this.t = findViewById;
        this.u = this.itemView.findViewById(R.id.header_shadow);
        pdc pdcVar = new pdc(false);
        pdcVar.a(0, dhr0.Y(R.attr.vk_ui_track_buffer, this.itemView.getContext()));
        pdcVar.b();
        pdcVar.f = false;
        pdcVar.e = false;
        progressBar.setProgressDrawable(pdcVar);
        findViewById.setBackgroundColor(l8g.f(0.8f, dhr0.Y(R.attr.vk_ui_background_content, this.itemView.getContext())));
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(hfz hfzVar) {
        String str;
        String Ab;
        ofy ofyVar = (ofy) hfzVar;
        StickerStockItem stickerStockItem = ofyVar.b;
        this.u.setVisibility(ofyVar.c ? 0 : 8);
        this.m.setText(stickerStockItem.d);
        this.n.setText(stickerStockItem.e);
        boolean z = stickerStockItem.h;
        boolean z2 = stickerStockItem.m;
        Price price = stickerStockItem.n;
        ProgressBar progressBar = this.r;
        View view = this.s;
        View view2 = this.q;
        ImageButton imageButton = this.p;
        VkDiscountTextView vkDiscountTextView = this.o;
        if (z) {
            vkDiscountTextView.setVisibility(4);
            progressBar.setVisibility(8);
            view2.setVisibility(0);
            if (view2 instanceof TextView) {
                ((TextView) view2).setText(R.string.sticker_added);
            }
            view.setVisibility(8);
        } else {
            view2.setVisibility(8);
            progressBar.setVisibility(8);
            vkDiscountTextView.setVisibility(0);
            view.setVisibility(8);
            if (stickerStockItem.Bb()) {
                vkDiscountTextView.setVisibility(8);
                imageButton.setVisibility(8);
                view.setVisibility(0);
            } else if (stickerStockItem.i) {
                String str2 = "";
                if (z2) {
                    vkDiscountTextView.e(vkDiscountTextView.getContext().getString(R.string.price_free), "");
                } else if (!stickerStockItem.Fb() || epx.f(price.zb(), price.Ab())) {
                    Price.PriceInfo Eb = price.Eb();
                    if (Eb == null || (str = Eb.Ab()) == null) {
                        str = "";
                    }
                    vkDiscountTextView.e(str, "");
                } else {
                    Price.PriceInfo Eb2 = price.Eb();
                    if (Eb2 != null && (Ab = Eb2.Ab()) != null) {
                        str2 = Ab;
                    }
                    Price.PriceInfo Bb = price.Bb();
                    vkDiscountTextView.e(str2, String.valueOf(Bb != null ? Integer.valueOf(Bb.zb()) : null));
                }
                vkDiscountTextView.setEnabled(true);
                if (vkDiscountTextView.getBackground() != null) {
                    vkDiscountTextView.getBackground().setAlpha(255);
                }
                if (z2) {
                    imageButton.setVisibility(8);
                } else {
                    imageButton.setVisibility(0);
                }
            } else {
                vkDiscountTextView.setText(R.string.unavailable);
                vkDiscountTextView.setEnabled(false);
                if (vkDiscountTextView.getBackground() != null) {
                    vkDiscountTextView.getBackground().setAlpha(128);
                }
                imageButton.setVisibility(8);
            }
        }
        bwt0.i0(vkDiscountTextView, new bi0(20, this, ofyVar));
        bwt0.i0(imageButton, new k82(14, this, ofyVar));
    }
}
