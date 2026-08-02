package xsna;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vk.core.view.components.card.VkCard;
import com.vk.core.view.components.picture.VkImage;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.superapp.design.view.SuperAppProgressView;
import com.vk.superapp.ui.widgets.half_tile.HalfTileContent;
import com.vk.superapp.ui.widgets.half_tile.HalfTileProgressType;
import com.vk.superapp.ui.widgets.half_tile.HalfTileTitleSize;
import com.vk.superapp.ui.widgets.half_tile.ProgressHalfTileData;
import com.vk.superapp.ui.widgets.half_tile.SuperAppHalfTileTextBlock;
import com.vk.superapp.ui.widgets.half_tile.SuperAppWidgetHalfTile;
import com.vk.superapp.ui.widgets.half_tile.UniversalHalfTileIcon;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SuperAppWidgetShowcaseProgressHalfTileHolder.kt */
/* loaded from: classes6.dex */
public final class mdn0 extends ucn0<ndn0> {
    public final u7n0 p;
    public final TextView q;
    public final TextView r;
    public final TextView s;
    public final SuperAppProgressView t;
    public final VkImage u;
    public final LinearLayout v;

    /* compiled from: SuperAppWidgetShowcaseProgressHalfTileHolder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HalfTileProgressType.values().length];
            try {
                iArr[HalfTileProgressType.PERCENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HalfTileProgressType.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HalfTileProgressType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public mdn0(View view, u7n0 u7n0Var) {
        super(view, null);
        this.p = u7n0Var;
        this.q = (TextView) this.itemView.findViewById(R.id.title_text_view);
        this.r = (TextView) this.itemView.findViewById(R.id.subtitle_text_view);
        this.s = (TextView) this.itemView.findViewById(R.id.description_text_view);
        this.t = (SuperAppProgressView) this.itemView.findViewById(R.id.progress_view);
        this.u = (VkImage) this.itemView.findViewById(R.id.universal_icon_image);
        this.v = (LinearLayout) this.itemView.findViewById(R.id.text_block_container);
    }

    @Override // xsna.hf6
    public final void W5(zif0 zif0Var) {
        WebImageSize f;
        String a2;
        ndn0 ndn0Var = (ndn0) zif0Var;
        SuperAppWidgetHalfTile superAppWidgetHalfTile = ndn0Var.h;
        HalfTileContent halfTileContent = superAppWidgetHalfTile.o.c;
        HalfTileContent.Progress progress = halfTileContent instanceof HalfTileContent.Progress ? (HalfTileContent.Progress) halfTileContent : null;
        if (progress != null) {
            VkCard vkCard = (VkCard) this.itemView.findViewById(R.id.half_tile_root_view);
            vkCard.setForeground(this.itemView.getContext().getDrawable(R.drawable.vk_tile_ripple_foreground));
            vkCard.setBackgroundColorAttr(R.attr.vk_ui_background_modal);
            vkCard.setBorderColorAttr(R.attr.vk_ui_separator_secondary);
            vkCard.setDrawBorder(true);
            vkCard.setCardRadius(cn70.a() * 12.0f);
            vkCard.setElevation(cn70.a() * 0.7f);
            jjc.g(this.itemView, new xzk0(2, ndn0Var, this));
            SuperAppHalfTileTextBlock superAppHalfTileTextBlock = progress.b;
            String str = superAppHalfTileTextBlock.b;
            TextView textView = this.q;
            textView.setText(str);
            String str2 = superAppHalfTileTextBlock.c;
            boolean z = str2 != null;
            TextView textView2 = this.r;
            bwt0.p0(textView2, z);
            textView2.setText(str2);
            if (superAppHalfTileTextBlock.e == HalfTileTitleSize.LARGE) {
                textView.setTextAppearance(R.style.VkUiTypography_DisplayTitle2Medium);
                textView.setMaxLines(1);
                textView.setTextSize(0, this.itemView.getContext().getResources().getDimension(R.dimen.vk_tile_widget_title_text_v6_large_size));
            } else {
                textView.setTextAppearance(R.style.VkUiTypography_HeadlineMedium_Unscaled);
                textView.setMaxLines(2);
            }
            textView.setTextColor(e3m.f(R.attr.vk_ui_text_primary, this.itemView.getContext()));
            UniversalHalfTileIcon universalHalfTileIcon = progress.c;
            VkImage vkImage = this.u;
            LinearLayout linearLayout = this.v;
            if (universalHalfTileIcon == null) {
                f4m.j(vkImage);
                f4m.w(0, linearLayout);
                f4m.s(cn70.b(6), textView2);
                linearLayout.setOrientation(0);
            } else {
                f4m.w(50, linearLayout);
                f4m.s(0, textView2);
                linearLayout.setOrientation(1);
                vkImage.setVisibility(0);
                vkImage.setBackground(this.itemView.getContext().getDrawable(R.drawable.vk_bg_half_tile_regular_universal_icon));
                vkImage.setCornerRadius(cn70.a() * 12.0f);
                vkImage.setPlaceholderImage(R.drawable.vk_default_placeholder_12);
                WebImage webImage = universalHalfTileIcon.b;
                vkImage.o0((webImage == null || (f = webImage.f(cn70.b(42))) == null) ? null : f.b, null);
            }
            ProgressHalfTileData progressHalfTileData = progress.d;
            int i = progressHalfTileData.d;
            SuperAppProgressView superAppProgressView = this.t;
            superAppProgressView.setMaxProgress(i);
            int i2 = progressHalfTileData.c;
            superAppProgressView.setProgress(i2);
            TextView textView3 = this.s;
            textView3.setVisibility(0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i3 = a.$EnumSwitchMapping$0[progressHalfTileData.e.ordinal()];
            if (i3 == 1) {
                a2 = l6g.a((i == 0 || i2 == 0) ? 0 : (int) ((i2 / i) * 100), "% ");
            } else if (i3 == 2) {
                StringBuilder sb = new StringBuilder();
                sb.append(i2);
                sb.append('/');
                sb.append(i);
                sb.append(' ');
                a2 = sb.toString();
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                f4m.j(textView3);
                a2 = "";
            }
            spannableStringBuilder.append((CharSequence) a2);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(e3m.f(R.attr.vk_ui_text_accent, this.itemView.getContext())), 0, a2.length(), 33);
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) progressHalfTileData.b);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(e3m.f(R.attr.vk_ui_text_secondary, this.itemView.getContext())), length, spannableStringBuilder.length(), 33);
            textView3.setText(spannableStringBuilder);
            String f2 = superAppWidgetHalfTile.o.b.f();
            if (f2 != null) {
                this.itemView.setContentDescription(f2);
            }
        }
    }
}
