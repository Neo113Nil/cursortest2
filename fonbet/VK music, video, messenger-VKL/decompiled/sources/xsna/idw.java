package xsna;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.vk.dto.stickers.ugc.UgcStatus;
import com.vkontakte.android.R;

/* compiled from: ImStickerRestrictedView.kt */
/* loaded from: classes6.dex */
public final class idw extends LinearLayout {
    public final AppCompatImageView b;
    public final TextView c;

    /* compiled from: ImStickerRestrictedView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UgcStatus.values().length];
            try {
                iArr[UgcStatus.BANNED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UgcStatus.DELETED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UgcStatus.CLAIMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public idw(Context context) {
        super(context, null, 0);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        this.b = appCompatImageView;
        TextView textView = new TextView(context);
        this.c = textView;
        setOrientation(1);
        setGravity(17);
        appCompatImageView.setId(R.id.id_restricted_image);
        abg0 abg0Var = dhr0.t;
        bwt0.o0(appCompatImageView, abg0Var.c(R.attr.vk_ui_icon_secondary));
        addView(appCompatImageView, getImageViewLayoutParams());
        textView.setGravity(17);
        textView.setId(R.id.id_restricted_text_view);
        textView.setMaxLines(4);
        textView.setLineHeight(cn70.f(18));
        textView.setTextAppearance(R.style.VkUiTypography_Subhead);
        textView.setTextColor(abg0Var.c(R.attr.vk_ui_text_secondary));
        textView.setTextSize(2, 14.0f);
        addView(textView, getTextViewLayoutParams());
        setBackground(new qog0(iah0.b(18.0f), abg0Var.c(R.attr.vk_ui_vkontakte_color_im_bubble_incoming)));
        requestLayout();
    }

    private final LinearLayout.LayoutParams getImageViewLayoutParams() {
        return new LinearLayout.LayoutParams(cn70.b(28), cn70.b(28));
    }

    private final LinearLayout.LayoutParams getTextViewLayoutParams() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = cn70.b(18);
        layoutParams.rightMargin = cn70.b(18);
        layoutParams.topMargin = cn70.b(4);
        return layoutParams;
    }

    public final void setRestrictionState(UgcStatus ugcStatus) {
        int i;
        int i2;
        int i3 = a.$EnumSwitchMapping$0[ugcStatus.ordinal()];
        if (i3 == 1) {
            i = R.string.stickers_banned;
            i2 = R.drawable.vk_icon_block_outline_28;
        } else if (i3 == 2) {
            i = R.string.stickers_deleted;
            i2 = R.drawable.vk_icon_delete_outline_28;
        } else if (i3 != 3) {
            i = R.string.stickers_age_limit;
            i2 = R.drawable.vk_icon_18_circle_outline_24;
        } else {
            i = R.string.stickers_claimed;
            i2 = R.drawable.vk_icon_clock_outline_28;
        }
        this.b.setImageResource(i2);
        this.c.setText(i);
    }
}
