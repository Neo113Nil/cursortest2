package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.id.UserId;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.common.recycler.holders.headers.DisplayMode;
import com.vk.newsfeed.presentation.model.ActionButtonType;
import com.vkontakte.android.R;
import java.util.LinkedHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.w9r0;

/* compiled from: SubscribeViewDelegate.kt */
/* loaded from: classes4.dex */
public final class rwm0 {
    public static final int g = cn70.b(22);
    public static final int h = cn70.b(2);
    public static final int i = cn70.b(2);
    public static final int j = cn70.b(2);
    public static final float k = cn70.b(6);
    public static final Object l;
    public static final Object m;
    public static final Object n;
    public static final Object o;
    public static final Object p;
    public static final Object q;
    public static final Object r;
    public static final Object s;
    public final int a;
    public final int b;
    public ViewGroup c;
    public ActionButtonType d;
    public View e;
    public x3c0 f;

    /* compiled from: SubscribeViewDelegate.kt */
    public static final class a {
        public static final LayerDrawable a(Context context) {
            int i = rwm0.g;
            dhr0.a.getClass();
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{enj.c(R.drawable.vk_icon_cutout_square_part_20, dhr0.f.a(R.attr.vk_ui_background_content, context), context), enj.c(R.drawable.vk_icon_square_part_16, dhr0.t.c(R.attr.vk_ui_icon_tertiary), context), enj.c(R.drawable.vk_icon_check_part_16, dhr0.f.a(R.attr.vk_ui_icon_contrast, context), context)});
            int i2 = rwm0.g;
            layerDrawable.setLayerSize(0, i2, i2);
            int i3 = rwm0.h;
            layerDrawable.setLayerInset(1, i3, i3, i3, i3);
            layerDrawable.setLayerInset(2, i3, i3, i3, i3);
            return layerDrawable;
        }

        public static final LayerDrawable b(Context context) {
            int i = rwm0.g;
            Drawable c = enj.c(R.drawable.vk_icon_square_part_16, dhr0.t.c(R.attr.vk_ui_icon_tertiary), context);
            dhr0.a.getClass();
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{c, enj.c(R.drawable.vk_icon_check_part_16, dhr0.f.a(R.attr.vk_ui_icon_contrast, context), context)});
            int i2 = rwm0.g;
            layerDrawable.setLayerSize(0, i2, i2);
            int i3 = rwm0.h;
            layerDrawable.setLayerInset(0, i3, i3, i3, i3);
            layerDrawable.setLayerInset(1, i3, i3, i3, i3);
            return layerDrawable;
        }

        public static final LayerDrawable c(Context context) {
            int i = rwm0.g;
            dhr0.a.getClass();
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{enj.c(R.drawable.vk_icon_cutout_square_part_20, dhr0.f.a(R.attr.vk_ui_background_content, context), context), enj.c(R.drawable.vk_icon_square_part_16, dhr0.t.c(R.attr.vk_ui_icon_accent), context), enj.c(R.drawable.vk_icon_add_part_16, dhr0.f.a(R.attr.vk_ui_icon_contrast, context), context)});
            int i2 = rwm0.g;
            layerDrawable.setLayerSize(0, i2, i2);
            int i3 = rwm0.h;
            layerDrawable.setLayerInset(1, i3, i3, i3, i3);
            layerDrawable.setLayerInset(2, i3, i3, i3, i3);
            return layerDrawable;
        }

        public static final LayerDrawable d(Context context) {
            int i = rwm0.g;
            Drawable c = enj.c(R.drawable.vk_icon_square_part_16, dhr0.t.c(R.attr.vk_ui_icon_accent), context);
            dhr0.a.getClass();
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{c, enj.c(R.drawable.vk_icon_add_part_16, dhr0.f.a(R.attr.vk_ui_icon_contrast, context), context)});
            int i2 = rwm0.g;
            layerDrawable.setLayerSize(0, i2, i2);
            int i3 = rwm0.h;
            layerDrawable.setLayerInset(0, i3, i3, i3, i3);
            layerDrawable.setLayerInset(1, i3, i3, i3, i3);
            return layerDrawable;
        }

        public static w9r0.c e(int i, int i2) {
            float f = (rwm0.g - (rwm0.i * 2.0f)) - rwm0.h;
            float f2 = rwm0.j;
            float f3 = (i - f) - f2;
            float f4 = (i2 - f) - f2;
            float f5 = f2 * 2.0f;
            float f6 = rwm0.k;
            return new w9r0.c(f3, f4, f5 + f3 + f, f + f4 + f5, f6, f6);
        }
    }

    /* compiled from: SubscribeViewDelegate.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ActionButtonType.values().length];
            try {
                iArr[ActionButtonType.SUBSCRIBE_AVATAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ActionButtonType.SUBSCRIBE_TEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ActionButtonType.SUBSCRIBE_TEXT_WITH_BG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DisplayMode.values().length];
            try {
                iArr2[DisplayMode.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[DisplayMode.OVERLAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    static {
        om60 om60Var = new om60(11);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        l = msy.a(lazyThreadSafetyMode, om60Var);
        m = msy.a(lazyThreadSafetyMode, new pm60(11));
        n = msy.a(lazyThreadSafetyMode, new k0m0(1));
        o = msy.a(lazyThreadSafetyMode, new qc00(12));
        p = msy.a(lazyThreadSafetyMode, new d2c0(9));
        q = msy.a(lazyThreadSafetyMode, new cfi0(3));
        r = msy.a(lazyThreadSafetyMode, new g2c0(9));
        s = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.logic.interactor.m(28));
    }

    public rwm0(int i2, int i3) {
        this.a = i2;
        this.b = i3;
    }

    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kotlin.Lazy] */
    public final void a(Context context, UserId userId, NewsEntry newsEntry, DisplayMode displayMode, boolean z, boolean z2) {
        ActionButtonType actionButtonType = this.d;
        int i2 = actionButtonType == null ? -1 : b.$EnumSwitchMapping$0[actionButtonType.ordinal()];
        if (i2 == 1) {
            View view = this.e;
            if (view instanceof ImageView) {
                ImageView imageView = (ImageView) view;
                imageView.setContentDescription(context.getString(R.string.profile_unsubscribe));
                imageView.setImageDrawable(dhr0.M() ? z2 ? (Drawable) s.getValue() : (Drawable) o.getValue() : z2 ? (Drawable) r.getValue() : (Drawable) n.getValue());
                return;
            }
            return;
        }
        if (i2 == 2) {
            int i3 = z ? R.attr.vk_ui_icon_contrast : R.attr.vk_ui_text_tertiary;
            View view2 = this.e;
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                textView.setContentDescription(context.getString(R.string.profile_unsubscribe));
                textView.setText(context.getString(R.string.community_status_button_public_subscribed));
                textView.setTextColor(dhr0.t.c(i3));
                textView.setAlpha(z ? 0.6f : 1.0f);
                return;
            }
            return;
        }
        if (i2 == 3) {
            c(context, newsEntry, false);
            return;
        }
        View view3 = this.e;
        if (view3 instanceof ImageView) {
            int i4 = fkq0.b(userId) ? R.drawable.vk_icon_check_square_outline_24 : R.drawable.vk_icon_user_added_outline_24;
            View view4 = this.e;
            if (view4 != null && view4.getContext() != null) {
                LinkedHashMap linkedHashMap = x1z.a;
            }
            ImageView imageView2 = (ImageView) view3;
            imageView2.setContentDescription(context.getString(R.string.profile_unsubscribe));
            int i5 = b.$EnumSwitchMapping$1[displayMode.ordinal()];
            if (i5 == 1) {
                omw.d(imageView2, i4, R.attr.vk_ui_icon_tertiary);
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                imageView2.setImageResource(i4);
                imageView2.setImageTintList(context.getColorStateList(R.color.vk_white));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kotlin.Lazy] */
    public final void b(Context context, UserId userId, NewsEntry newsEntry, DisplayMode displayMode, boolean z, boolean z2) {
        ActionButtonType actionButtonType = this.d;
        int i2 = actionButtonType == null ? -1 : b.$EnumSwitchMapping$0[actionButtonType.ordinal()];
        if (i2 == 1) {
            View view = this.e;
            if (view instanceof ImageView) {
                ImageView imageView = (ImageView) view;
                imageView.setContentDescription(context.getString(R.string.profile_subscribe));
                imageView.setImageDrawable(dhr0.M() ? z2 ? (Drawable) q.getValue() : (Drawable) m.getValue() : z2 ? (Drawable) p.getValue() : (Drawable) l.getValue());
                return;
            }
            return;
        }
        if (i2 == 2) {
            int i3 = z ? R.attr.vk_ui_icon_contrast : R.attr.vk_ui_text_link;
            View view2 = this.e;
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                textView.setContentDescription(context.getString(R.string.profile_subscribe));
                textView.setText(context.getString(R.string.profile_subscribe));
                textView.setTextColor(dhr0.t.c(i3));
                textView.setAlpha(1.0f);
                return;
            }
            return;
        }
        if (i2 == 3) {
            c(context, newsEntry, true);
            return;
        }
        View view3 = this.e;
        if (view3 instanceof ImageView) {
            int i4 = fkq0.b(userId) ? R.drawable.vk_icon_add_square_outline_24 : R.drawable.vk_icon_user_add_outline_24;
            View view4 = this.e;
            if (view4 != null && view4.getContext() != null) {
                LinkedHashMap linkedHashMap = x1z.a;
            }
            ImageView imageView2 = (ImageView) view3;
            imageView2.setContentDescription(context.getString(R.string.profile_subscribe));
            int i5 = b.$EnumSwitchMapping$1[displayMode.ordinal()];
            if (i5 == 1) {
                omw.d(imageView2, i4, R.attr.vk_ui_icon_accent);
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                imageView2.setImageResource(i4);
                imageView2.setImageTintList(context.getColorStateList(R.color.vk_white));
            }
        }
    }

    public final void c(Context context, NewsEntry newsEntry, boolean z) {
        Pair v = zq70.v(z, fkq0.d(sni.m(newsEntry).b));
        int intValue = ((Number) v.d()).intValue();
        int intValue2 = ((Number) v.g()).intValue();
        int i2 = z ? R.attr.vk_ui_text_primary : R.attr.vk_ui_text_subhead;
        View view = this.e;
        VkButton vkButton = view instanceof VkButton ? (VkButton) view : null;
        if (vkButton != null) {
            vkButton.setContentDescription(context.getString(intValue2));
            vkButton.setText(context.getString(intValue));
        }
        View view2 = this.e;
        TextView textView = view2 instanceof TextView ? (TextView) view2 : null;
        if (textView != null) {
            textView.setContentDescription(context.getString(intValue2));
            textView.setText(context.getString(intValue));
            textView.setTextColor(dhr0.t.c(i2));
            textView.setAlpha(1.0f);
        }
    }
}
