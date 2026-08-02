package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.util.SparseArray;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.VmojiAvatar;
import com.vk.vmoji.character.model.VmojiBadge;
import com.vk.vmoji.character.model.VmojiPrice;
import com.vk.vmoji.character.model.VmojiProductModel;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.e3m;

/* compiled from: VmojiExt.kt */
/* loaded from: classes7.dex */
public final class p8w0 {
    public static final UserId a(VmojiAvatar vmojiAvatar) {
        Long k = cqm0.k((String) j5g.Y(drm0.b0(vmojiAvatar.getId(), new char[]{'_'}, 0, 6)));
        return new UserId(k != null ? k.longValue() : 0L);
    }

    public static final void b(TextView textView, VmojiBadge vmojiBadge) {
        if (vmojiBadge == null) {
            f4m.j(textView);
            return;
        }
        textView.setText(vmojiBadge.getText());
        Context context = textView.getContext();
        int i = vmojiBadge.c;
        e3m.a aVar = e3m.a;
        textView.setBackgroundTintList(ColorStateList.valueOf(context.getColor(i)));
        textView.setVisibility(0);
    }

    public static final void c(TextView textView, TextView textView2, VmojiPrice vmojiPrice) {
        textView2.setVisibility(0);
        if (vmojiPrice instanceof VmojiPrice.Unavailable) {
            f4m.j(textView);
            textView2.setText(R.string.vmoji_character_pack_price_unavaliable);
            textView2.setTextColor(dhr0.t.c(R.attr.vk_legacy_text_secondary));
            return;
        }
        if (vmojiPrice instanceof VmojiPrice.Added) {
            f4m.j(textView);
            textView2.setText(R.string.vmoji_character_pack_price_added);
            textView2.setTextColor(dhr0.t.c(R.attr.vk_legacy_text_secondary));
            return;
        }
        if (vmojiPrice instanceof VmojiPrice.Free) {
            f4m.j(textView);
            textView2.setText(R.string.vmoji_character_pack_price_free);
            textView2.setTextColor(dhr0.t.c(R.attr.vk_legacy_text_secondary));
            return;
        }
        if (vmojiPrice instanceof VmojiPrice.Price) {
            f4m.j(textView);
            textView2.setText(enj.f(R.plurals.vmoji_character_buy_container_votes, ((VmojiPrice.Price) vmojiPrice).d, textView2.getContext()));
            textView2.setTextColor(dhr0.t.c(R.attr.vk_legacy_accent));
            return;
        }
        if (!(vmojiPrice instanceof VmojiPrice.PriceWithDiscount)) {
            throw new NoWhenBranchMatchedException();
        }
        VmojiPrice.PriceWithDiscount priceWithDiscount = (VmojiPrice.PriceWithDiscount) vmojiPrice;
        textView2.setText(enj.f(R.plurals.vmoji_character_buy_container_votes, priceWithDiscount.d, textView2.getContext()));
        abg0 abg0Var = dhr0.t;
        textView2.setTextColor(abg0Var.c(R.attr.vk_legacy_accent));
        String f = enj.f(R.plurals.vmoji_character_buy_container_votes, priceWithDiscount.e, textView.getContext());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) f).setSpan(new StrikethroughSpan(), 0, f.length(), 33);
        SparseArray<ForegroundColorSpan> sparseArray = nik0.a;
        textView.setText(new SpannableString(spannableStringBuilder));
        textView.setTextColor(abg0Var.c(R.attr.vk_legacy_text_secondary));
        textView.setVisibility(0);
    }

    public static final void d(TextView textView, VmojiPrice vmojiPrice) {
        if (vmojiPrice instanceof VmojiPrice.Unavailable) {
            textView.setEnabled(false);
            textView.setText(R.string.vmoji_character_pack_price_unavaliable);
            textView.setTextColor(anj.b(R.color.vkui_muted_button_text, textView.getContext()));
            qcy<Object>[] qcyVarArr = bwt0.a;
            dhr0.h0(R.drawable.vkui_bg_button_muted, textView);
            return;
        }
        if (vmojiPrice instanceof VmojiPrice.Added) {
            textView.setEnabled(false);
            textView.setText(R.string.vmoji_character_pack_price_added);
            textView.setTextColor(anj.b(R.color.vkui_muted_button_text, textView.getContext()));
            qcy<Object>[] qcyVarArr2 = bwt0.a;
            dhr0.h0(R.drawable.vkui_bg_button_muted, textView);
            return;
        }
        if (vmojiPrice instanceof VmojiPrice.Free) {
            textView.setEnabled(true);
            textView.setText(R.string.vmoji_character_pack_price_free);
            textView.setTextColor(anj.b(R.color.vk_primary_button_text, textView.getContext()));
            qcy<Object>[] qcyVarArr3 = bwt0.a;
            dhr0.h0(R.drawable.vkui_bg_button_primary, textView);
            return;
        }
        if (vmojiPrice instanceof VmojiPrice.Price) {
            textView.setEnabled(true);
            textView.setText(textView.getContext().getString(R.string.vmoji_character_buy_container_buy, enj.f(R.plurals.vmoji_character_buy_container_votes, ((VmojiPrice.Price) vmojiPrice).d, textView.getContext())));
            textView.setTextColor(anj.b(R.color.vkui_green_button_text, textView.getContext()));
            qcy<Object>[] qcyVarArr4 = bwt0.a;
            dhr0.h0(R.drawable.vkui_bg_button_green, textView);
            return;
        }
        if (!(vmojiPrice instanceof VmojiPrice.PriceWithDiscount)) {
            throw new NoWhenBranchMatchedException();
        }
        textView.setEnabled(true);
        Context context = textView.getContext();
        VmojiPrice.PriceWithDiscount priceWithDiscount = (VmojiPrice.PriceWithDiscount) vmojiPrice;
        String string = context.getString(R.string.stickers_buy_for, "");
        int i = priceWithDiscount.d;
        int i2 = priceWithDiscount.e;
        String quantityString = context.getResources().getQuantityString(R.plurals.vmoji_character_buy_container_votes, i, Integer.valueOf(i));
        SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) string).append((CharSequence) rik0.b(5.0f)).append(String.valueOf(i2), new StrikethroughSpan(), 33);
        append.setSpan(new ForegroundColorSpan(context.getColor(R.color.vk_white_alpha60)), string.length(), append.length(), 33);
        textView.setText(append.append((CharSequence) rik0.b(7.0f)).append(quantityString, new qup0(textView.getTypeface()), 33));
        textView.setTextColor(anj.b(R.color.vkui_green_button_text, textView.getContext()));
        qcy<Object>[] qcyVarArr5 = bwt0.a;
        dhr0.h0(R.drawable.vkui_bg_button_green, textView);
    }

    public static final void e(ImageView imageView, VmojiProductModel.State state) {
        if (state.equals(VmojiProductModel.State.None.b)) {
            f4m.j(imageView);
            return;
        }
        if (state.equals(VmojiProductModel.State.Crown.b)) {
            omw.d(imageView, R.drawable.vk_icon_crown_16, R.attr.vk_legacy_dynamic_purple);
            imageView.setVisibility(0);
            return;
        }
        if (state.equals(VmojiProductModel.State.CrownWithCheck.b)) {
            omw.d(imageView, R.drawable.vk_icon_crown_check_fill_purple_16, R.attr.vk_legacy_dynamic_purple);
            imageView.setVisibility(0);
        } else if (state.equals(VmojiProductModel.State.Locked.b)) {
            omw.d(imageView, R.drawable.vk_icon_lock_16, R.attr.vk_legacy_icon_secondary);
            imageView.setVisibility(0);
        } else {
            if (!state.equals(VmojiProductModel.State.Unlocked.b)) {
                throw new NoWhenBranchMatchedException();
            }
            omw.d(imageView, R.drawable.vk_icon_unlock_outline_16, R.attr.vk_legacy_dynamic_green);
            imageView.setVisibility(0);
        }
    }
}
