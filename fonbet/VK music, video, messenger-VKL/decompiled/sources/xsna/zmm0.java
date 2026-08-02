package xsna;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.core.tips.Tooltip;
import com.vk.core.ui.themes.NavigationBarStyle;
import com.vk.core.view.components.picture.VkPicture;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.common.ImageSize;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import kotlin.Pair;
import xsna.e3m;

/* compiled from: StoryViewUtils.kt */
/* loaded from: classes6.dex */
public final class zmm0 {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static androidx.appcompat.app.d a(Activity activity, ymm0 ymm0Var, View.OnClickListener onClickListener, xm1 xm1Var) {
        int i;
        boolean z;
        String str;
        String str2;
        View view;
        boolean z2 = ymm0Var.k;
        int i2 = ymm0Var.f;
        String str3 = ymm0Var.a;
        Pair pair = i2 == 1 ? new Pair(null, null) : ymm0Var.h ? new Pair(str3, null) : new Pair(null, str3);
        String str4 = (String) pair.d();
        String str5 = (String) pair.g();
        float f = ymm0Var.c;
        float f2 = ymm0Var.d;
        RectF rectF = new RectF(f, f2, f, f2);
        Drawable d = ymm0Var.g ? uko.d(R.drawable.ic_story_sticker_arrow, R.color.vk_gray_900, activity) : null;
        ImageSize imageSize = ymm0Var.e;
        String str6 = ymm0Var.b;
        if (z2) {
            boolean z3 = ymm0Var.l;
            LayoutInflater from = LayoutInflater.from(activity);
            if (z3) {
                view = from.inflate(R.layout.pds_tip_product_restricted, (ViewGroup) null, false);
                VkPicture vkPicture = (VkPicture) view.findViewById(R.id.pinMarketPhoto);
                VkText vkText = (VkText) view.findViewById(R.id.pinMarketTitle);
                VkText vkText2 = (VkText) view.findViewById(R.id.pinMarketSubtitle);
                vkPicture.setCornerRadius(cn70.a() * 6.0f);
                vkText.setText(str3);
                vkText2.setText(str6);
                vkPicture.o0(imageSize != null ? imageSize.d.d : null, null);
            } else {
                view = from.inflate(R.layout.pds_tip_product_not_restricted, (ViewGroup) null, false);
                ((VkText) view.findViewById(R.id.marketGoToGoodTitle)).setText(activity.getString(R.string.story_market_sticker_tooltip_title));
            }
            z = z2;
        } else {
            if (imageSize != null) {
                if (i2 == 1) {
                    i = R.layout.pds_tip_product;
                } else if (i2 == 2) {
                    i = R.layout.pds_tip_mention;
                }
                View inflate = LayoutInflater.from(activity).inflate(i, (ViewGroup) null, false);
                VKImageView vKImageView = (VKImageView) inflate.findViewById(R.id.iv_tip_image);
                if (i2 == 1) {
                    inflate.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                    TextView textView = (TextView) inflate.findViewById(R.id.good_title);
                    TextView textView2 = (TextView) inflate.findViewById(R.id.good_price);
                    if (ymm0Var.i) {
                        Context context = inflate.getContext();
                        ImageView imageView = (ImageView) inflate.findViewById(R.id.iv_moderation_icon);
                        VKImageView vKImageView2 = (VKImageView) inflate.findViewById(R.id.iv_tip_image);
                        e3m.a aVar = e3m.a;
                        z = z2;
                        str = str5;
                        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(context.getColor(R.color.vk_black_alpha24), PorterDuff.Mode.SRC_ATOP);
                        str2 = str4;
                        jwx jwxVar = new jwx(2, 20);
                        vKImageView2.setActualColorFilter(porterDuffColorFilter);
                        vKImageView2.setPostprocessor(jwxVar);
                        textView.setText(context.getString(R.string.story_product_confirm_adult));
                        textView2.setText(context.getString(R.string.story_product_for_adults));
                        bwt0.p0(imageView, true);
                        vKImageView.load(imageSize.d.d);
                        view = inflate;
                        Tooltip.WindowStyle windowStyle = iah0.n(activity) ? Tooltip.WindowStyle.DEFAULT_FLOATING : Tooltip.WindowStyle.FULLSCREEN;
                        int i3 = Tooltip.n;
                        e3m.a aVar2 = e3m.a;
                        int color = activity.getColor(R.color.vk_white);
                        int color2 = activity.getColor(R.color.vk_gray_900);
                        NavigationBarStyle navigationBarStyle = NavigationBarStyle.DARK;
                        rme0 rme0Var = view != null ? new rme0(view, 20) : null;
                        i1f i1fVar = new i1f(xm1Var, 8);
                        Integer num = ymm0Var.j;
                        pla.e().b().getClass();
                        return Tooltip.a.a(activity, str2, str, rectF, windowStyle, onClickListener, null, new b1y((String) null), color, color2, d, 0.72f, num, 0, false, navigationBarStyle, 0, rme0Var, null, null, i1fVar, null, z ? Boolean.FALSE : null, 234364992);
                    }
                    textView.setText(str3);
                    textView2.setText(str6);
                }
                z = z2;
                str = str5;
                str2 = str4;
                vKImageView.load(imageSize.d.d);
                view = inflate;
                Tooltip.WindowStyle windowStyle2 = iah0.n(activity) ? Tooltip.WindowStyle.DEFAULT_FLOATING : Tooltip.WindowStyle.FULLSCREEN;
                int i32 = Tooltip.n;
                e3m.a aVar22 = e3m.a;
                int color3 = activity.getColor(R.color.vk_white);
                int color22 = activity.getColor(R.color.vk_gray_900);
                NavigationBarStyle navigationBarStyle2 = NavigationBarStyle.DARK;
                if (view != null) {
                }
                i1f i1fVar2 = new i1f(xm1Var, 8);
                Integer num2 = ymm0Var.j;
                pla.e().b().getClass();
                return Tooltip.a.a(activity, str2, str, rectF, windowStyle2, onClickListener, null, new b1y((String) null), color3, color22, d, 0.72f, num2, 0, false, navigationBarStyle2, 0, rme0Var, null, null, i1fVar2, null, z ? Boolean.FALSE : null, 234364992);
            }
            z = z2;
            view = null;
        }
        str = str5;
        str2 = str4;
        Tooltip.WindowStyle windowStyle22 = iah0.n(activity) ? Tooltip.WindowStyle.DEFAULT_FLOATING : Tooltip.WindowStyle.FULLSCREEN;
        int i322 = Tooltip.n;
        e3m.a aVar222 = e3m.a;
        int color32 = activity.getColor(R.color.vk_white);
        int color222 = activity.getColor(R.color.vk_gray_900);
        NavigationBarStyle navigationBarStyle22 = NavigationBarStyle.DARK;
        if (view != null) {
        }
        i1f i1fVar22 = new i1f(xm1Var, 8);
        Integer num22 = ymm0Var.j;
        pla.e().b().getClass();
        return Tooltip.a.a(activity, str2, str, rectF, windowStyle22, onClickListener, null, new b1y((String) null), color32, color222, d, 0.72f, num22, 0, false, navigationBarStyle22, 0, rme0Var, null, null, i1fVar22, null, z ? Boolean.FALSE : null, 234364992);
    }
}
