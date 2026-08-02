package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.card.VkCard;
import com.vk.core.view.components.picture.VkImage;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.superapp.ui.widgets.half_tile.HalfTileAlign;
import com.vk.superapp.ui.widgets.half_tile.HalfTileContent;
import com.vk.superapp.ui.widgets.half_tile.HalfTileIcon;
import com.vk.superapp.ui.widgets.half_tile.HalfTileIconSize;
import com.vk.superapp.ui.widgets.half_tile.HalfTileTitleSize;
import com.vk.superapp.ui.widgets.half_tile.RawHalfTileIcon;
import com.vk.superapp.ui.widgets.half_tile.RepHalfTileIcon;
import com.vk.superapp.ui.widgets.half_tile.SuperAppHalfTileTextBlock;
import com.vk.superapp.ui.widgets.half_tile.SuperAppWidgetHalfTile;
import com.vk.superapp.ui.widgets.half_tile.UniversalHalfTileIcon;
import com.vk.superapp.ui.widgets.tile.ImageWithAction;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import xsna.e3m;
import xsna.jjw;

/* compiled from: SuperAppWidgetShowcaseRegularHalfTileHolder.kt */
/* loaded from: classes6.dex */
public final class sdn0 extends ucn0<tdn0> {
    public static final int A;
    public static final int B;
    public static final int x;
    public static final int y;
    public static final int z;
    public final u7n0 p;
    public final jjw q;
    public final VkImage r;
    public final VkImage s;
    public final LinearLayout t;
    public final VkImage u;
    public final TextView v;
    public final TextView w;

    static {
        cn70.c(12);
        x = cn70.b(Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE);
        y = cn70.b(32);
        z = cn70.b(24);
        A = cn70.b(36);
        B = cn70.b(48);
    }

    public sdn0(View view, u7n0 u7n0Var) {
        super(view, null);
        this.p = u7n0Var;
        this.q = new jjw();
        this.r = (VkImage) this.itemView.findViewById(R.id.background_image);
        this.s = (VkImage) this.itemView.findViewById(R.id.icon_image);
        this.t = (LinearLayout) this.itemView.findViewById(R.id.text_block_container);
        this.u = (VkImage) this.itemView.findViewById(R.id.universal_icon_image);
        this.v = (TextView) this.itemView.findViewById(R.id.title_text_view);
        this.w = (TextView) this.itemView.findViewById(R.id.subtitle_text_view);
    }

    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object, java.util.Map] */
    @Override // xsna.hf6
    public final void W5(zif0 zif0Var) {
        LayerDrawable layerDrawable;
        jjw.a aVar;
        WebImageSize f;
        WebImage webImage;
        WebImageSize f2;
        String str;
        ImageWithAction imageWithAction;
        WebImage webImage2;
        WebImageSize f3;
        tdn0 tdn0Var = (tdn0) zif0Var;
        SuperAppWidgetHalfTile superAppWidgetHalfTile = tdn0Var.h;
        HalfTileContent halfTileContent = superAppWidgetHalfTile.o.c;
        HalfTileContent.Regular regular = halfTileContent instanceof HalfTileContent.Regular ? (HalfTileContent.Regular) halfTileContent : null;
        if (regular != null) {
            SuperAppHalfTileTextBlock superAppHalfTileTextBlock = regular.b;
            VkCard vkCard = (VkCard) this.itemView.findViewById(R.id.half_tile_root_view);
            vkCard.setForeground(this.itemView.getContext().getDrawable(R.drawable.vk_tile_ripple_foreground));
            vkCard.setBackgroundColorAttr(R.attr.vk_ui_background_modal);
            vkCard.setBorderColorAttr(R.attr.vk_ui_separator_secondary);
            vkCard.setDrawBorder(true);
            vkCard.setCardRadius(cn70.a() * 12.0f);
            vkCard.setElevation(cn70.a() * 0.7f);
            jjc.g(this.itemView, new ue40(8, tdn0Var, this));
            HalfTileIcon halfTileIcon = regular.e;
            boolean z2 = halfTileIcon instanceof RawHalfTileIcon;
            int i = 53;
            int i2 = A;
            VkImage vkImage = this.u;
            VkImage vkImage2 = this.s;
            if (z2) {
                RawHalfTileIcon rawHalfTileIcon = (RawHalfTileIcon) halfTileIcon;
                if (rawHalfTileIcon.c == HalfTileIconSize.LARGE) {
                    i2 = B;
                }
                bwt0.m0(i2, i2, vkImage2);
                bwt0.p0(vkImage2, true);
                bwt0.p0(vkImage, false);
                vkImage2.setBackground(null);
                f4m.m(53, vkImage2);
                g6(cn70.b(40), 0);
                List<ImageWithAction> list = rawHalfTileIcon.b;
                vkImage2.o0((list == null || (imageWithAction = (ImageWithAction) j5g.a0(list)) == null || (webImage2 = imageWithAction.b) == null || (f3 = webImage2.f(cn70.b(36))) == null) ? null : f3.b, null);
            } else if (halfTileIcon instanceof UniversalHalfTileIcon) {
                bwt0.p0(vkImage2, false);
                bwt0.p0(vkImage, true);
                vkImage.setBackground(this.itemView.getContext().getDrawable(R.drawable.vk_bg_half_tile_regular_universal_icon));
                vkImage.setCornerRadius(cn70.a() * 12.0f);
                vkImage.setPlaceholderImage(R.drawable.vk_default_placeholder_12);
                g6(cn70.b(50), 0);
                WebImage webImage3 = ((UniversalHalfTileIcon) halfTileIcon).b;
                vkImage.o0((webImage3 == null || (f = webImage3.f(cn70.b(42))) == null) ? null : f.b, null);
            } else if (halfTileIcon instanceof RepHalfTileIcon) {
                bwt0.m0(i2, i2, vkImage2);
                bwt0.p0(vkImage2, true);
                bwt0.p0(vkImage, false);
                vkImage2.clear();
                RepHalfTileIcon repHalfTileIcon = (RepHalfTileIcon) halfTileIcon;
                if (repHalfTileIcon.c == HalfTileAlign.TOP) {
                    g6(cn70.b(40), 0);
                } else {
                    g6(0, cn70.b(40));
                    i = 85;
                }
                f4m.m(i, vkImage2);
                String str2 = repHalfTileIcon.b;
                Context context = vkImage2.getContext();
                jjw jjwVar = this.q;
                jjwVar.getClass();
                try {
                    aVar = (jjw.a) jjwVar.a.get(str2);
                } catch (Exception unused) {
                }
                if (aVar != null) {
                    layerDrawable = new LayerDrawable(new Drawable[]{m33.a(R.drawable.vk_superapp_rep_icon_bg, context), m33.a(aVar.a, context)});
                    layerDrawable.setLayerGravity(0, 17);
                    layerDrawable.setLayerGravity(1, 17);
                    int i3 = jjw.b;
                    layerDrawable.setLayerSize(0, i3, i3);
                    layerDrawable.setLayerInset(1, (int) (cn70.a() * 5.5f), cn70.b(6), (int) (cn70.a() * 6.5f), cn70.b(6));
                    vkImage2.setBackground(layerDrawable);
                    vkImage2.setElevation(cn70.a() * 1.5f);
                }
                layerDrawable = null;
                vkImage2.setBackground(layerDrawable);
                vkImage2.setElevation(cn70.a() * 1.5f);
            } else {
                bwt0.p0(vkImage2, false);
                bwt0.p0(vkImage, false);
                g6(0, 0);
            }
            String str3 = superAppHalfTileTextBlock.b;
            int length = str3.length();
            TextView textView = this.v;
            TextPaint paint = textView.getPaint();
            int b = (((cn70.b(this.itemView.getContext().getResources().getConfiguration().screenWidthDp) - y) / 2) - z) - textView.getPaddingEnd();
            if (b < 0) {
                b = 0;
            }
            int i4 = StaticLayout.Builder.obtain(str3, 0, length, paint, b).setEllipsize(TextUtils.TruncateAt.END).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(textView.getLetterSpacing(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).build().getLineCount() >= 2 ? 2 : 3;
            TextView textView2 = this.w;
            textView2.setMaxLines(i4);
            String str4 = regular.c;
            String str5 = superAppHalfTileTextBlock.b;
            String str6 = superAppHalfTileTextBlock.c;
            textView.setText(str5);
            if (superAppHalfTileTextBlock.e == HalfTileTitleSize.LARGE) {
                textView.setTextAppearance(R.style.VkUiTypography_DisplayTitle2Medium);
                textView.setIncludeFontPadding(false);
                textView.setMaxLines(1);
                textView.setTextSize(0, this.itemView.getContext().getResources().getDimension(R.dimen.vk_tile_widget_title_text_v6_large_size));
            } else {
                textView.setTextAppearance(R.style.VkUiTypography_Headline1Medium);
                textView.setMaxLines(2);
                textView.setTextSize(0, this.itemView.getContext().getResources().getDimension(R.dimen.vk_tile_widget_title_text_v6_size));
            }
            textView.setTextColor(e3m.f(R.attr.vk_ui_text_primary, this.itemView.getContext()));
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
            if (str4 != null) {
                layoutParams.height = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.height = -2;
                layoutParams.weight = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            textView.setLayoutParams(layoutParams);
            this.t.setGravity(superAppHalfTileTextBlock.d == HalfTileAlign.BOTTOM ? 80 : 48);
            textView2.setText(str6 != null ? str6 : str4);
            bwt0.p0(textView2, (str4 == null && str6 == null) ? false : true);
            List<ImageWithAction> list2 = regular.d;
            textView2.setAlpha(1.0f);
            VkImage vkImage3 = this.r;
            if (list2 == null) {
                bwt0.p0(vkImage3, false);
                int Y = dhr0.Y(R.attr.vk_ui_text_primary, this.itemView.getContext());
                int Y2 = dhr0.Y(R.attr.vk_ui_text_secondary, this.itemView.getContext());
                textView.setTextColor(Y);
                textView2.setTextColor(Y2);
            } else {
                bwt0.p0(vkImage3, true);
                int Y3 = dhr0.Y(R.attr.vk_ui_separator_primary_alpha, this.itemView.getContext());
                vkImage3.setCornerRadius(iah0.b(12.0f));
                vkImage3.y0(iah0.b(0.33f), Y3);
                ImageWithAction imageWithAction2 = (ImageWithAction) j5g.a0(list2);
                if (imageWithAction2 != null && (webImage = imageWithAction2.b) != null && (f2 = webImage.f(cn70.b(x))) != null && (str = f2.b) != null) {
                    int width = this.itemView.getWidth();
                    int height = this.itemView.getHeight();
                    usu usuVar = new usu();
                    usuVar.c = str;
                    usuVar.d = width;
                    usuVar.e = height;
                    kci.o(vkImage3, usuVar);
                    vkImage3.o0(str, null);
                    h6(str);
                    vkImage3.setOnLoadCallback(new rdn0(this, str));
                }
            }
            String f4 = superAppWidgetHalfTile.o.b.f();
            if (f4 != null) {
                this.itemView.setContentDescription(f4);
            }
        }
    }

    public final void g6(int i, int i2) {
        f4m.w(i, this.v);
        f4m.w(i2, this.w);
    }

    public final void h6(String str) {
        Boolean bool = (Boolean) usu.f.get(str);
        if (bool != null) {
            int i = bool.booleanValue() ? R.color.vk_white : R.color.vk_black;
            TextView textView = this.w;
            textView.setAlpha(0.8f);
            Context context = this.itemView.getContext();
            e3m.a aVar = e3m.a;
            int color = context.getColor(i);
            this.v.setTextColor(color);
            textView.setTextColor(color);
        }
    }
}
