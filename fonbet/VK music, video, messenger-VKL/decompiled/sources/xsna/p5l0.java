package xsna;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.util.SparseArray;
import android.widget.TextView;
import com.vk.dto.stickers.Badge;
import com.vk.dto.stickers.Price;
import com.vk.dto.stickers.StickerStockItem;
import com.vkontakte.android.R;

/* compiled from: StickerPackViewUtils.kt */
/* loaded from: classes6.dex */
public final class p5l0 {

    /* compiled from: StickerPackViewUtils.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Badge.BadgeSubtype.values().length];
            try {
                iArr[Badge.BadgeSubtype.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static void a(TextView textView, Badge badge) {
        if (badge == null) {
            f4m.j(textView);
            return;
        }
        textView.setVisibility(0);
        textView.setText(badge.getText());
        Context context = textView.getContext();
        textView.setBackgroundTintList(a.$EnumSwitchMapping$0[badge.zb().ordinal()] == 1 ? e3m.c(R.attr.vk_ui_background_accent, context) : e3m.c(R.attr.vk_ui_accent_red, context));
    }

    public static void b(Context context, TextView textView, StickerStockItem stickerStockItem, boolean z) {
        String string;
        int i = R.attr.vk_ui_text_secondary;
        if (z && stickerStockItem.h && stickerStockItem.k) {
            string = context.getString(R.string.stickers_activated);
        } else {
            boolean z2 = stickerStockItem.m;
            boolean z3 = stickerStockItem.h;
            if (z2 || !stickerStockItem.i) {
                string = z3 ? context.getString(R.string.sticker_added) : context.getString(R.string.price_free);
            } else if (!z3 || stickerStockItem.j) {
                Price.PriceInfo Eb = stickerStockItem.n.Eb();
                i = R.attr.vk_ui_text_accent;
                if (Eb == null || (string = Eb.Ab()) == null) {
                    string = "";
                }
            } else {
                string = context.getString(R.string.sticker_added);
            }
        }
        textView.setVisibility(0);
        textView.setText(string);
        textView.setTextColor(dhr0.t.c(i));
    }

    public static void c(TextView textView, TextView textView2, StickerStockItem stickerStockItem, boolean z) {
        boolean z2 = stickerStockItem.h;
        boolean z3 = stickerStockItem.i;
        if (!z3 && !z2) {
            f4m.j(textView);
            f4m.j(textView2);
            return;
        }
        Context context = textView.getContext();
        Price.PriceInfo Bb = stickerStockItem.n.Bb();
        String Ab = Bb != null ? Bb.Ab() : null;
        if (Ab == null || drm0.N(Ab)) {
            b(context, textView, stickerStockItem, z);
            textView.setVisibility(0);
            f4m.j(textView2);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) Ab).setSpan(new StrikethroughSpan(), 0, Ab.length(), 33);
        textView.setTextColor(dhr0.t.c(R.attr.vk_ui_text_secondary));
        SparseArray<ForegroundColorSpan> sparseArray = nik0.a;
        textView.setText(new SpannableString(spannableStringBuilder));
        b(context, textView2, stickerStockItem, z);
        if (stickerStockItem.m || !z3 || !z2 || stickerStockItem.j) {
            textView.setVisibility(0);
        } else {
            f4m.j(textView);
        }
        textView2.setVisibility(0);
    }
}
