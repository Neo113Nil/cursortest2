package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.image.VKImageController;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.stat.scheme.SchemeStat$TypeUniversalWidget;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import com.vk.superapp.bridges.SuperappUiDesignBridge;
import com.vk.superapp.ui.uniwidgets.blocks.AvatarStackBlock;
import com.vk.superapp.ui.uniwidgets.blocks.BadgeBlock;
import com.vk.superapp.ui.uniwidgets.blocks.BaseBlock;
import com.vk.superapp.ui.uniwidgets.blocks.ButtonBlock;
import com.vk.superapp.ui.uniwidgets.blocks.FooterBlock;
import com.vk.superapp.ui.uniwidgets.blocks.HeaderBlock;
import com.vk.superapp.ui.uniwidgets.blocks.HorizontalAlignment;
import com.vk.superapp.ui.uniwidgets.blocks.IconBlock;
import com.vk.superapp.ui.uniwidgets.blocks.ImageBlock;
import com.vk.superapp.ui.uniwidgets.blocks.TextBlock;
import com.vk.superapp.ui.uniwidgets.blocks.VerticalAlign;
import com.vk.superapp.ui.uniwidgets.blocks.WidgetColor;
import com.vk.superapp.ui.uniwidgets.config.SuperappTextStylesBridge;
import com.vk.superapp.ui.uniwidgets.dto.UniversalWidget;
import com.vk.superapp.ui.widgets.WidgetUpdateLabel;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.g4q0;
import xsna.thn0;
import xsna.u7n0;
import xsna.z6j;

/* compiled from: UniWidgetConstructor.kt */
/* loaded from: classes6.dex */
public abstract class j3q0<T extends UniversalWidget> {
    public static final int e;
    public static final int f;
    public final io.reactivex.rxjava3.disposables.b a = new io.reactivex.rxjava3.disposables.b();
    public T b;
    public gtm0 c;
    public static final int d = iah0.a(16);
    public static final int g = iah0.a(8);

    /* compiled from: UniWidgetConstructor.kt */
    public static final class a {
        public static void a(TextView textView, TextBlock.Style style, SuperappTextStylesBridge.a aVar, yfb yfbVar) {
            SuperappTextStylesBridge.FontWeight fontWeight;
            WidgetColor widgetColor;
            Integer a;
            SuperappTextStylesBridge.FontWeight fontWeight2 = aVar.d;
            b(textView, aVar);
            dzg0 dzg0Var = aVar.e;
            Context context = textView.getContext();
            if (style == null || (fontWeight = style.c) == null) {
                fontWeight = fontWeight2;
            }
            textView.setTypeface((Typeface) dzg0Var.invoke(context, fontWeight));
            if (style != null && (widgetColor = style.b) != null && (a = widgetColor.a(textView.getContext(), yfbVar)) != null) {
                textView.setTextColor(a.intValue());
            }
            gfx0 gfx0Var = e370.b;
            if (gfx0Var == null) {
                gfx0Var = null;
            }
            gfx0Var.b(textView, fontWeight2.h());
        }

        public static void b(TextView textView, SuperappTextStylesBridge.a aVar) {
            textView.setTextSize(aVar.a);
            textView.setLetterSpacing(aVar.c);
            float f = aVar.b;
            textView.setMinHeight(iah0.a(f));
            textView.setLineSpacing(iah0.b(f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setIncludeFontPadding(false);
            gfx0 gfx0Var = e370.b;
            if (gfx0Var == null) {
                gfx0Var = null;
            }
            gfx0Var.b(textView, aVar.d.h());
        }

        public static TextView c(Context context) {
            TextView textView = new TextView(context);
            textView.setId(R.id.vk_uni_widget_badge);
            textView.setMinHeight(iah0.a(16));
            com.vk.typography.b.k(textView, FontFamily.MEDIUM, Float.valueOf(12.0f), 4);
            textView.setGravity(17);
            int i = j3q0.e;
            float f = 1;
            textView.setPadding(i, iah0.a(f), i, iah0.a(f));
            his0.x(textView, R.color.vk_white);
            textView.setSingleLine();
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setLayoutParams(new ConstraintLayout.b(0, -2));
            gfx0 gfx0Var = e370.b;
            if (gfx0Var == null) {
                gfx0Var = null;
            }
            gfx0Var.b(textView, SuperappUiDesignBridge.FontFamily.REGULAR);
            return textView;
        }
    }

    /* compiled from: UniWidgetConstructor.kt */
    public static final class b {
        public final View a;
        public final ImageView b;
        public final View c;

        public b(View view, ImageView imageView, View view2) {
            this.a = view;
            this.b = imageView;
            this.c = view2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            ImageView imageView = this.b;
            int hashCode2 = (hashCode + (imageView == null ? 0 : imageView.hashCode())) * 31;
            View view = this.c;
            return hashCode2 + (view != null ? view.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HeaderContainer(rootView=");
            sb.append(this.a);
            sb.append(", actionView=");
            sb.append(this.b);
            sb.append(", additionalActionView=");
            return br.b(sb, this.c, ')');
        }
    }

    /* compiled from: UniWidgetConstructor.kt */
    public static final class c {
        public final int a;
        public final float b;

        public c(int i, float f) {
            this.a = i;
            this.b = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && Float.compare(this.b, cVar.b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ImageBadgeProperties(size=");
            sb.append(this.a);
            sb.append(", cornerRadius=");
            return xq.c(')', this.b, sb);
        }
    }

    /* compiled from: UniWidgetConstructor.kt */
    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[VerticalAlign.values().length];
            try {
                iArr[VerticalAlign.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VerticalAlign.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VerticalAlign.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[HorizontalAlignment.values().length];
            try {
                iArr2[HorizontalAlignment.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[HorizontalAlignment.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[HorizontalAlignment.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    static {
        float f2 = 4;
        e = iah0.a(f2);
        f = iah0.a(f2);
    }

    public static void c(BadgeBlock badgeBlock, VKImageController vKImageController, TextView textView, ConstraintLayout constraintLayout, c cVar) {
        float f2;
        BadgeBlock.Type type = badgeBlock.b;
        if ((type instanceof BadgeBlock.Type.Image) && vKImageController != null) {
            VKImageController.b bVar = new VKImageController.b(cVar.b, null, false, 0, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, null, null, null, 65534);
            WebImageSize f3 = ((BadgeBlock.Type.Image) type).b.f(cVar.a);
            vKImageController.f(f3 != null ? f3.b : null, bVar);
            f4m.j(textView);
            return;
        }
        boolean z = type instanceof BadgeBlock.Type.New;
        if (z || (type instanceof BadgeBlock.Type.Discount)) {
            if (vKImageController != null) {
                vKImageController.clear();
            }
            int i = 0;
            textView.setVisibility(0);
            textView.setText(badgeBlock.c);
            if (z) {
                i = R.drawable.vk_superapp_badge_blue_bg;
            } else if (type instanceof BadgeBlock.Type.Discount) {
                i = R.drawable.vk_superapp_badge_red_bg;
            }
            textView.setBackgroundResource(i);
            int i2 = d.$EnumSwitchMapping$1[badgeBlock.d.ordinal()];
            if (i2 == 1 || i2 == 2) {
                f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                f2 = 1.0f;
            }
            androidx.constraintlayout.widget.b a2 = pq.a(constraintLayout);
            a2.m(textView.getId(), 1);
            a2.F(f2, textView.getId());
            a2.b(constraintLayout);
        }
    }

    public static void d(VerticalAlign verticalAlign, View view, ConstraintLayout constraintLayout) {
        float f2;
        int i = d.$EnumSwitchMapping$0[verticalAlign.ordinal()];
        if (i == 1) {
            f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        } else if (i == 2) {
            f2 = 0.5f;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            f2 = 1.0f;
        }
        androidx.constraintlayout.widget.b a2 = pq.a(constraintLayout);
        a2.I(f2, view.getId());
        a2.b(constraintLayout);
    }

    public static void h(j3q0 j3q0Var, VKImageController vKImageController, ImageBlock imageBlock, Float f2, Integer num, int i) {
        Integer num2 = null;
        Float f3 = (i & 4) != 0 ? null : f2;
        Integer num3 = (i & 8) != 0 ? null : num;
        j3q0Var.getClass();
        Integer num4 = imageBlock.d;
        ImageBlock.Style style = imageBlock.e;
        float floatValue = f3 != null ? f3.floatValue() : z6j.d(style);
        boolean z = style.c == ImageBlock.Style.Outline.CIRCLE;
        Context context = vKImageController.getView().getContext();
        if (num3 == null) {
            j3q0Var.r().c.getClass();
        } else {
            num2 = num3;
        }
        VKImageController.b bVar = new VKImageController.b(floatValue, null, z, 0, j3q0Var.p(context, floatValue), null, null, null, num2 == null ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 0.5f, num2 != null ? num2.intValue() : 0, null, null, null, 59866);
        if (num4 == null || num4.intValue() == 0) {
            vKImageController.f(imageBlock.c, bVar);
        } else {
            vKImageController.j(num4.intValue(), bVar);
        }
    }

    public static void l(Flow flow) {
        flow.setOrientation(0);
        flow.setWrapMode(1);
        flow.setHorizontalBias(1.0f);
        flow.setFirstHorizontalBias(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        flow.setVerticalAlign(1);
        float f2 = 12;
        flow.setPaddingLeft(iah0.a(f2));
        flow.setPaddingRight(iah0.a(f2));
    }

    public static RippleDrawable n(Context context) {
        thn0 thn0Var = m3q0.b;
        if (thn0Var == null) {
            thn0Var = null;
        }
        thn0Var.getClass();
        float a2 = iah0.a(20);
        float[] fArr = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, a2, a2, a2, a2};
        yfb yfbVar = m3q0.a;
        if (yfbVar == null) {
            yfbVar = null;
        }
        int s = yfbVar.s(context);
        ColorStateList valueOf = ColorStateList.valueOf(krv0.m(R.attr.vk_ui_transparent_active, context));
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.getPaint().setColor(s);
        shapeDrawable.setIntrinsicWidth(-1);
        shapeDrawable.setIntrinsicHeight(-1);
        return new RippleDrawable(valueOf, null, shapeDrawable);
    }

    public static void u(int i, int i2, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = iah0.a(i);
        layoutParams.height = iah0.a(i2);
        view.setLayoutParams(layoutParams);
    }

    public final void a(ConstraintLayout constraintLayout) {
        yfb yfbVar = r().c;
        constraintLayout.getContext();
        Integer u = yfbVar.u();
        if (u != null) {
            constraintLayout.setBackgroundResource(u.intValue());
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        String f2;
        View view = new View(constraintLayout.getContext());
        view.setId(R.id.vk_uni_widget_click_zone);
        constraintLayout.addView(view);
        view.setImportantForAccessibility(2);
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        bVar.i(constraintLayout);
        bVar.p(view.getId(), 0);
        bVar.n(view.getId(), 0);
        bVar.k(view.getId(), 3, 0, 3);
        bVar.k(view.getId(), 4, 0, 4);
        bVar.k(view.getId(), 6, 0, 6);
        bVar.k(view.getId(), 7, 0, 7);
        bVar.b(constraintLayout);
        Context context = constraintLayout.getContext();
        float[] fArr = new float[8];
        thn0 thn0Var = m3q0.b;
        if (thn0Var == null) {
            thn0Var = null;
        }
        thn0Var.getClass();
        Arrays.fill(fArr, iah0.a(20));
        yfb yfbVar = m3q0.a;
        if (yfbVar == null) {
            yfbVar = null;
        }
        int s = yfbVar.s(context);
        ColorStateList valueOf = ColorStateList.valueOf(krv0.m(R.attr.vk_ui_transparent_active, context));
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.getPaint().setColor(s);
        shapeDrawable.setIntrinsicWidth(-1);
        shapeDrawable.setIntrinsicHeight(-1);
        view.setBackground(new RippleDrawable(valueOf, null, shapeDrawable));
        T t = this.b;
        if (t == null) {
            t = null;
        }
        WebAction webAction = t.l;
        if (webAction != null && (f2 = webAction.f()) != null) {
            view.setContentDescription(f2);
        }
        T t2 = this.b;
        if (t2 == null) {
            t2 = null;
        }
        u7n0.a aVar = new u7n0.a(t2, SchemeStat$TypeUniversalWidget.ElementUiType.WIDGET, 0, 12);
        u7n0 o = o();
        T t3 = this.b;
        l3q0.a(view, (t3 != null ? t3 : null).l, aVar, o);
    }

    public final void e(vbn0 vbn0Var, AvatarStackBlock avatarStackBlock, r85 r85Var) {
        List<ImageBlock> list = avatarStackBlock.b;
        ArrayList arrayList = new ArrayList();
        for (ImageBlock imageBlock : list) {
            String str = imageBlock.c;
            Pair pair = str != null ? new Pair(str, imageBlock.f) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        vbn0Var.setReverseDrawingOrder(arrayList.size() > 3);
        vbn0Var.setStrokeColor(r().c.v(vbn0Var.getContext()));
        vbn0Var.c(arrayList, avatarStackBlock.c, r85Var);
    }

    public final void f(TextView textView, ButtonBlock buttonBlock) {
        int m;
        Integer num;
        thn0.a aVar;
        int a2;
        thn0.a aVar2;
        int a3;
        thn0.a aVar3;
        int a4;
        thn0.a aVar4;
        int a5;
        String f2;
        thn0.a aVar5;
        thn0.a aVar6;
        thn0.a aVar7;
        thn0.a aVar8;
        WebAction webAction = buttonBlock.d;
        IconBlock iconBlock = buttonBlock.c;
        Context context = textView.getContext();
        String str = buttonBlock.b;
        gtm0 gtm0Var = this.c;
        if (gtm0Var == null) {
            gtm0Var = null;
        }
        textView.setText(gtm0Var.a(str));
        ButtonBlock.Style style = buttonBlock.e;
        yfb yfbVar = r().c;
        int[] iArr = z6j.a.$EnumSwitchMapping$0;
        switch (iArr[style.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                yfbVar.getClass();
                m = krv0.m(R.attr.vk_ui_background_accent_themed, context);
                break;
            case 5:
            case 6:
            case 7:
            case 8:
                m = yfbVar.j(context);
                break;
            case 9:
                yfbVar.getClass();
                m = krv0.m(R.attr.vk_ui_text_contrast_themed, context);
                break;
            case 10:
                yfbVar.getClass();
                m = krv0.m(R.attr.vk_ui_background_accent_themed, context);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        yfb yfbVar2 = r().c;
        switch (iArr[style.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                yfbVar2.getClass();
                num = null;
                break;
            case 5:
            case 6:
            case 7:
            case 8:
                num = yfbVar2.i();
                break;
            case 9:
                yfbVar2.getClass();
                num = Integer.valueOf(R.drawable.vk_widgets_primary_button_bg);
                break;
            case 10:
                yfbVar2.getClass();
                num = Integer.valueOf(R.drawable.vk_widgets_secondary_button_bg);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (iconBlock != null) {
            String str2 = iconBlock.b.b.get(0).b;
            z6j.a(style);
            float f3 = 16;
            int a6 = iah0.a(f3);
            z6j.a(style);
            int a7 = iah0.a(f3);
            if (drm0.D(str2, ".svg", false)) {
                efx0 efx0Var = e370.k;
                if (efx0Var == null) {
                    efx0Var = null;
                }
                efx0Var.getClass();
                ((lg6) dgn0.g.getValue()).a(str2).U(new bj50(new ohn0(efx0Var, a6, a6), 11)).subscribe(new q440(new dh4(textView, m, 1), 24));
            } else {
                this.a.b(((lg6) dgn0.g.getValue()).a(str2).U(new mrc0(new e420(27), 10)).subscribe(new i3q0(new h3q0(textView, m, a6, a7), 0)));
            }
        }
        if (iconBlock != null) {
            switch (iArr[style.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    thn0 thn0Var = m3q0.b;
                    if (thn0Var == null) {
                        thn0Var = null;
                    }
                    aVar8 = thn0Var.f.c;
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                    thn0 thn0Var2 = m3q0.b;
                    if (thn0Var2 == null) {
                        thn0Var2 = null;
                    }
                    aVar8 = thn0Var2.f.d;
                    break;
                case 9:
                    thn0 thn0Var3 = m3q0.b;
                    if (thn0Var3 == null) {
                        thn0Var3 = null;
                    }
                    aVar8 = thn0Var3.f.a;
                    break;
                case 10:
                    thn0 thn0Var4 = m3q0.b;
                    if (thn0Var4 == null) {
                        thn0Var4 = null;
                    }
                    aVar8 = thn0Var4.f.b;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            a2 = iah0.a(aVar8.b.a);
        } else {
            switch (iArr[style.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    thn0 thn0Var5 = m3q0.b;
                    if (thn0Var5 == null) {
                        thn0Var5 = null;
                    }
                    aVar = thn0Var5.f.c;
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                    thn0 thn0Var6 = m3q0.b;
                    if (thn0Var6 == null) {
                        thn0Var6 = null;
                    }
                    aVar = thn0Var6.f.d;
                    break;
                case 9:
                    thn0 thn0Var7 = m3q0.b;
                    if (thn0Var7 == null) {
                        thn0Var7 = null;
                    }
                    aVar = thn0Var7.f.a;
                    break;
                case 10:
                    thn0 thn0Var8 = m3q0.b;
                    if (thn0Var8 == null) {
                        thn0Var8 = null;
                    }
                    aVar = thn0Var8.f.b;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            a2 = iah0.a(aVar.a.a);
        }
        if (iconBlock != null) {
            switch (iArr[style.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    thn0 thn0Var9 = m3q0.b;
                    if (thn0Var9 == null) {
                        thn0Var9 = null;
                    }
                    aVar7 = thn0Var9.f.c;
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                    thn0 thn0Var10 = m3q0.b;
                    if (thn0Var10 == null) {
                        thn0Var10 = null;
                    }
                    aVar7 = thn0Var10.f.d;
                    break;
                case 9:
                    thn0 thn0Var11 = m3q0.b;
                    if (thn0Var11 == null) {
                        thn0Var11 = null;
                    }
                    aVar7 = thn0Var11.f.a;
                    break;
                case 10:
                    thn0 thn0Var12 = m3q0.b;
                    if (thn0Var12 == null) {
                        thn0Var12 = null;
                    }
                    aVar7 = thn0Var12.f.b;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            a3 = iah0.a(aVar7.b.c);
        } else {
            switch (iArr[style.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    thn0 thn0Var13 = m3q0.b;
                    if (thn0Var13 == null) {
                        thn0Var13 = null;
                    }
                    aVar2 = thn0Var13.f.c;
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                    thn0 thn0Var14 = m3q0.b;
                    if (thn0Var14 == null) {
                        thn0Var14 = null;
                    }
                    aVar2 = thn0Var14.f.d;
                    break;
                case 9:
                    thn0 thn0Var15 = m3q0.b;
                    if (thn0Var15 == null) {
                        thn0Var15 = null;
                    }
                    aVar2 = thn0Var15.f.a;
                    break;
                case 10:
                    thn0 thn0Var16 = m3q0.b;
                    if (thn0Var16 == null) {
                        thn0Var16 = null;
                    }
                    aVar2 = thn0Var16.f.b;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            a3 = iah0.a(aVar2.a.c);
        }
        if (iconBlock != null) {
            switch (iArr[style.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    thn0 thn0Var17 = m3q0.b;
                    if (thn0Var17 == null) {
                        thn0Var17 = null;
                    }
                    aVar6 = thn0Var17.f.c;
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                    thn0 thn0Var18 = m3q0.b;
                    if (thn0Var18 == null) {
                        thn0Var18 = null;
                    }
                    aVar6 = thn0Var18.f.d;
                    break;
                case 9:
                    thn0 thn0Var19 = m3q0.b;
                    if (thn0Var19 == null) {
                        thn0Var19 = null;
                    }
                    aVar6 = thn0Var19.f.a;
                    break;
                case 10:
                    thn0 thn0Var20 = m3q0.b;
                    if (thn0Var20 == null) {
                        thn0Var20 = null;
                    }
                    aVar6 = thn0Var20.f.b;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            a4 = iah0.a(aVar6.b.b);
        } else {
            switch (iArr[style.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    thn0 thn0Var21 = m3q0.b;
                    if (thn0Var21 == null) {
                        thn0Var21 = null;
                    }
                    aVar3 = thn0Var21.f.c;
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                    thn0 thn0Var22 = m3q0.b;
                    if (thn0Var22 == null) {
                        thn0Var22 = null;
                    }
                    aVar3 = thn0Var22.f.d;
                    break;
                case 9:
                    thn0 thn0Var23 = m3q0.b;
                    if (thn0Var23 == null) {
                        thn0Var23 = null;
                    }
                    aVar3 = thn0Var23.f.a;
                    break;
                case 10:
                    thn0 thn0Var24 = m3q0.b;
                    if (thn0Var24 == null) {
                        thn0Var24 = null;
                    }
                    aVar3 = thn0Var24.f.b;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            a4 = iah0.a(aVar3.a.b);
        }
        if (iconBlock != null) {
            switch (iArr[style.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    thn0 thn0Var25 = m3q0.b;
                    if (thn0Var25 == null) {
                        thn0Var25 = null;
                    }
                    aVar5 = thn0Var25.f.c;
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                    thn0 thn0Var26 = m3q0.b;
                    if (thn0Var26 == null) {
                        thn0Var26 = null;
                    }
                    aVar5 = thn0Var26.f.d;
                    break;
                case 9:
                    thn0 thn0Var27 = m3q0.b;
                    if (thn0Var27 == null) {
                        thn0Var27 = null;
                    }
                    aVar5 = thn0Var27.f.a;
                    break;
                case 10:
                    thn0 thn0Var28 = m3q0.b;
                    if (thn0Var28 == null) {
                        thn0Var28 = null;
                    }
                    aVar5 = thn0Var28.f.b;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            a5 = iah0.a(aVar5.b.d);
        } else {
            switch (iArr[style.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    thn0 thn0Var29 = m3q0.b;
                    if (thn0Var29 == null) {
                        thn0Var29 = null;
                    }
                    aVar4 = thn0Var29.f.c;
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                    thn0 thn0Var30 = m3q0.b;
                    if (thn0Var30 == null) {
                        thn0Var30 = null;
                    }
                    aVar4 = thn0Var30.f.d;
                    break;
                case 9:
                    thn0 thn0Var31 = m3q0.b;
                    if (thn0Var31 == null) {
                        thn0Var31 = null;
                    }
                    aVar4 = thn0Var31.f.a;
                    break;
                case 10:
                    thn0 thn0Var32 = m3q0.b;
                    if (thn0Var32 == null) {
                        thn0Var32 = null;
                    }
                    aVar4 = thn0Var32.f.b;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            a5 = iah0.a(aVar4.a.d);
        }
        textView.setPadding(a2, a4, a3, a5);
        if (num != null) {
            textView.setBackgroundResource(num.intValue());
        }
        SuperappTextStylesBridge superappTextStylesBridge = m3q0.c;
        if (superappTextStylesBridge == null) {
            superappTextStylesBridge = null;
        }
        SuperappTextStylesBridge.a h = superappTextStylesBridge.h();
        a.b(textView, h);
        textView.setTypeface((Typeface) h.e.invoke(context, h.d));
        textView.setTextColor(m);
        textView.setSingleLine();
        z6j.a(style);
        textView.setCompoundDrawablePadding(iah0.a(6));
        if (webAction != null && (f2 = webAction.f()) != null) {
            textView.setContentDescription(f2);
        }
        T t = this.b;
        l3q0.a(textView, webAction, new u7n0.a(t != null ? t : null, SchemeStat$TypeUniversalWidget.ElementUiType.BUTTON, 0, 12), o());
    }

    public final void g(View view, VKImageController<? extends View> vKImageController, IconBlock iconBlock) {
        Integer num;
        WebImageSize e2;
        WebAction webAction = iconBlock.d;
        WebImage webImage = iconBlock.b;
        IconBlock.Style style = iconBlock.c;
        float f2 = z6j.b(style.b).c;
        Context context = vKImageController.getView().getContext();
        ShapeDrawable p = p(context, f2);
        WidgetColor widgetColor = style.c;
        if (widgetColor != null) {
            WidgetColor widgetColor2 = WidgetColor.ACCENT;
            num = widgetColor.a(context, null);
        } else {
            num = null;
        }
        VKImageController.b bVar = new VKImageController.b(f2, null, false, 0, p, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, num, null, null, 59358);
        String str = (webImage.b.isEmpty() || (e2 = webImage.e(iah0.a((float) 28))) == null) ? null : e2.b;
        if (str == null) {
            xgx0 xgx0Var = xgx0.a;
            NullPointerException nullPointerException = new NullPointerException("Can't apply any style to image if url is empty");
            xgx0Var.getClass();
            xgx0.d(nullPointerException);
        }
        if (str == null || !drm0.D(str, ".svg", false)) {
            vKImageController.f(str, bVar);
        } else {
            int a2 = iah0.a(z6j.b(style.b).a);
            efx0 efx0Var = e370.k;
            if (efx0Var == null) {
                efx0Var = null;
            }
            efx0Var.getClass();
            this.a.b(((lg6) dgn0.g.getValue()).a(str).U(new bj50(new ohn0(efx0Var, a2, a2), 11)).subscribe(new p9p0(new hcf0(4, vKImageController, bVar), 1)));
        }
        if (webAction != null) {
            String f3 = webAction.f();
            if (f3 != null) {
                view.setContentDescription(f3);
            }
            T t = this.b;
            if (t == null) {
                t = null;
            }
            l3q0.a(view, webAction, new u7n0.a(t, SchemeStat$TypeUniversalWidget.ElementUiType.ICON, 0, 12), o());
        }
    }

    public final void i(TextView textView, TextBlock textBlock, SuperappTextStylesBridge.a aVar) {
        a.a(textView, textBlock.c, aVar, r().c);
        String str = textBlock.b;
        gtm0 gtm0Var = this.c;
        if (gtm0Var == null) {
            gtm0Var = null;
        }
        textView.setText(gtm0Var.a(str));
    }

    public final cpx0 j(Context context, T t) {
        this.c = new gtm0(context, r().c);
        this.b = t;
        return k(context);
    }

    public abstract cpx0 k(Context context);

    public final TextView m(Context context, WidgetUpdateLabel widgetUpdateLabel) {
        TextView textView = new TextView(context);
        textView.setId(R.id.vk_uni_widget_updated_label);
        textView.setAlpha(0.4f);
        textView.setText(widgetUpdateLabel.c);
        SuperappTextStylesBridge superappTextStylesBridge = m3q0.c;
        if (superappTextStylesBridge == null) {
            superappTextStylesBridge = null;
        }
        a.a(textView, null, superappTextStylesBridge.c(), r().c);
        textView.setTextColor(r().c.s(context));
        textView.setSingleLine();
        textView.setGravity(80);
        return textView;
    }

    public abstract u7n0 o();

    public final ShapeDrawable p(Context context, float f2) {
        float[] fArr = new float[8];
        Arrays.fill(fArr, iah0.b(f2));
        r().c.getClass();
        int m = krv0.m(R.attr.vk_ui_image_placeholder, context);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.getPaint().setColor(m);
        shapeDrawable.setIntrinsicWidth(-1);
        shapeDrawable.setIntrinsicHeight(-1);
        return shapeDrawable;
    }

    public final View q(Context context, boolean z, ConstraintLayout constraintLayout) {
        View view = new View(context);
        if (z) {
            view.setId(R.id.vk_uni_widget_footer_divider);
            constraintLayout.addView(view);
            view.setBackgroundColor(r().c.r(context).intValue());
            view.setLayoutParams(new ConstraintLayout.b(-1, Math.max(iah0.a(0.5f), 1)));
        }
        return view;
    }

    public abstract g4q0.a r();

    public final View s(BaseBlock baseBlock, Context context, ConstraintLayout constraintLayout, WidgetUpdateLabel widgetUpdateLabel, boolean z) {
        androidx.constraintlayout.widget.b bVar;
        View view;
        View view2;
        androidx.constraintlayout.widget.b bVar2;
        boolean z2 = baseBlock instanceof FooterBlock.FooterButton;
        int i = d;
        if (z2) {
            FooterBlock.FooterButton footerButton = (FooterBlock.FooterButton) baseBlock;
            androidx.constraintlayout.widget.b bVar3 = new androidx.constraintlayout.widget.b();
            View view3 = new View(context);
            view3.setId(R.id.vk_uni_widget_footer);
            view3.setBackground(n(context));
            view3.setLayoutParams(new ConstraintLayout.b(-1, 0));
            constraintLayout.addView(view3);
            View q = q(context, z, constraintLayout);
            Context context2 = constraintLayout.getContext();
            boolean z3 = widgetUpdateLabel != null && widgetUpdateLabel.b;
            Flow flow = new Flow(context2);
            flow.setId(R.id.vk_uni_widget_footer_flow);
            flow.setLayoutParams(new ConstraintLayout.b(-1, 0));
            constraintLayout.addView(flow);
            int i2 = z ? i : 0;
            TextView textView = new TextView(context2);
            textView.setId(R.id.vk_uni_widget_footer_button);
            constraintLayout.addView(textView);
            flow.g(textView);
            textView.setLayoutParams(new ConstraintLayout.b(0, -2));
            TextBlock textBlock = footerButton.c;
            WebAction webAction = footerButton.d;
            SuperappTextStylesBridge superappTextStylesBridge = m3q0.c;
            if (superappTextStylesBridge == null) {
                superappTextStylesBridge = null;
            }
            i(textView, textBlock, superappTextStylesBridge.a());
            textView.setTextColor(r().c.h(context2));
            textView.setSingleLine();
            float f2 = 14;
            f4m.y(iah0.a(f2) + i2, textView);
            f4m.v(iah0.a(f2), textView);
            View space = new Space(context2);
            space.setId(R.id.vk_uni_widget_footer_space);
            constraintLayout.addView(space);
            flow.g(space);
            space.setLayoutParams(new ConstraintLayout.b(0, 0));
            if (z3) {
                View m = m(context2, widgetUpdateLabel);
                f4m.v(iah0.a(6), m);
                constraintLayout.addView(m);
                flow.g(m);
            }
            l(flow);
            Pair pair = new Pair(flow, textView);
            Flow flow2 = (Flow) pair.d();
            View view4 = (View) pair.g();
            bVar3.i(constraintLayout);
            bVar3.p(R.id.vk_uni_widget_footer_space, 0);
            bVar3.p(R.id.vk_uni_widget_footer_button, -2);
            bVar3.n(view3.getId(), 0);
            bVar3.k(flow2.getId(), 7, 0, 7);
            bVar3.k(flow2.getId(), 6, 0, 6);
            bVar3.k(flow2.getId(), 4, 0, 4);
            bVar3.n(flow2.getId(), -2);
            bVar3.k(view3.getId(), 6, 0, 6);
            bVar3.k(view3.getId(), 7, 0, 7);
            bVar3.k(view3.getId(), 4, 0, 4);
            bVar3.k(view3.getId(), 3, R.id.vk_uni_widget_footer_button, 3);
            if (z) {
                bVar2 = bVar3;
                bVar2.l(q.getId(), 3, R.id.vk_uni_widget_footer_button, 3, i);
                bVar2.l(q.getId(), 6, 0, 6, i);
                bVar2.l(q.getId(), 7, 0, 7, i);
            } else {
                bVar2 = bVar3;
            }
            bVar2.b(constraintLayout);
            T t = this.b;
            if (t == null) {
                t = null;
            }
            u7n0.a aVar = new u7n0.a(t, SchemeStat$TypeUniversalWidget.ElementUiType.FOOTER, 0, 12);
            CharSequence f3 = webAction.f();
            if (f3 != null) {
                view3.setContentDescription(f3);
            }
            l3q0.a(view3, webAction, aVar, o());
            awt0.b(iah0.a(4), view4);
            return view4;
        }
        if (baseBlock instanceof FooterBlock.FooterStack) {
            FooterBlock.FooterStack footerStack = (FooterBlock.FooterStack) baseBlock;
            View view5 = new View(context);
            view5.setId(R.id.vk_uni_widget_footer);
            view5.setBackground(n(context));
            constraintLayout.addView(view5);
            boolean z4 = widgetUpdateLabel != null && widgetUpdateLabel.b;
            if (z) {
                view = new View(context);
                view.setId(R.id.vk_uni_widget_footer_divider);
                constraintLayout.addView(view);
                view.setBackgroundColor(r().c.r(context).intValue());
                view.setLayoutParams(new ConstraintLayout.b(-1, Math.max(iah0.a(0.5f), 1)));
            } else {
                view = null;
            }
            if (z4) {
                view2 = m(context, widgetUpdateLabel);
                constraintLayout.addView(view2);
            } else {
                view2 = null;
            }
            TextView textView2 = new TextView(context);
            textView2.setId(R.id.vk_uni_widget_footer_description);
            constraintLayout.addView(textView2);
            TextBlock textBlock2 = footerStack.c;
            SuperappTextStylesBridge superappTextStylesBridge2 = m3q0.c;
            i(textView2, textBlock2, (superappTextStylesBridge2 != null ? superappTextStylesBridge2 : null).g());
            textView2.setTextColor(r().c.t(context));
            textView2.setSingleLine();
            vbn0 vbn0Var = new vbn0(context);
            vbn0Var.setId(R.id.vk_uni_widget_footer_stack);
            constraintLayout.addView(vbn0Var);
            e(vbn0Var, footerStack.d, new r85(11, this, context));
            androidx.constraintlayout.widget.b bVar4 = new androidx.constraintlayout.widget.b();
            bVar4.i(constraintLayout);
            int a2 = iah0.a(view2 != null ? 59 : 40);
            int a3 = view != null ? iah0.a(20) : 0;
            bVar4.k(view5.getId(), 6, 0, 6);
            bVar4.k(view5.getId(), 7, 0, 7);
            bVar4.k(view5.getId(), 4, 0, 4);
            bVar4.n(view5.getId(), a2 + a3);
            if (view != null) {
                bVar4.l(view.getId(), 3, view5.getId(), 3, i);
                bVar4.l(view.getId(), 6, 0, 6, i);
                bVar4.l(view.getId(), 7, 0, 7, i);
            }
            if (view2 != null) {
                bVar4.l(view2.getId(), 4, view5.getId(), 4, iah0.a(6));
                bVar4.l(view2.getId(), 7, 0, 7, i);
            }
            bVar4.p(vbn0Var.getId(), -2);
            bVar4.k(vbn0Var.getId(), 3, textView2.getId(), 3);
            bVar4.k(vbn0Var.getId(), 4, textView2.getId(), 4);
            bVar4.l(vbn0Var.getId(), 7, 0, 7, i);
            bVar4.p(textView2.getId(), 0);
            if (view2 != null) {
                bVar4.l(textView2.getId(), 4, view2.getId(), 3, iah0.a(12));
            } else {
                bVar4.l(textView2.getId(), 4, view5.getId(), 4, i);
            }
            bVar4.l(textView2.getId(), 6, 0, 6, i);
            bVar4.l(textView2.getId(), 7, vbn0Var.getId(), 6, iah0.a(8));
            bVar4.b(constraintLayout);
            return view5;
        }
        if (!(baseBlock instanceof FooterBlock.FooterTextButton)) {
            if (widgetUpdateLabel != null && widgetUpdateLabel.b) {
                View m2 = m(context, widgetUpdateLabel);
                constraintLayout.addView(m2);
                androidx.constraintlayout.widget.b bVar5 = new androidx.constraintlayout.widget.b();
                bVar5.i(constraintLayout);
                bVar5.l(m2.getId(), 1, 0, 1, iah0.a(24));
                bVar5.l(m2.getId(), 4, 0, 4, iah0.a(6));
                bVar5.l(m2.getId(), 7, 0, 7, i);
                bVar5.b(constraintLayout);
                return m2;
            }
            View space2 = new Space(context);
            space2.setId(View.generateViewId());
            androidx.constraintlayout.widget.b bVar6 = new androidx.constraintlayout.widget.b();
            constraintLayout.addView(space2);
            bVar6.i(constraintLayout);
            bVar6.k(space2.getId(), 6, 0, 6);
            bVar6.k(space2.getId(), 7, 0, 7);
            bVar6.k(space2.getId(), 4, 0, 4);
            bVar6.n(space2.getId(), i);
            bVar6.b(constraintLayout);
            return space2;
        }
        FooterBlock.FooterTextButton footerTextButton = (FooterBlock.FooterTextButton) baseBlock;
        androidx.constraintlayout.widget.b bVar7 = new androidx.constraintlayout.widget.b();
        View q2 = q(context, z, constraintLayout);
        Context context3 = constraintLayout.getContext();
        Flow flow3 = new Flow(context3);
        flow3.setId(R.id.vk_uni_widget_footer_flow);
        flow3.setLayoutParams(new ConstraintLayout.b(-1, 0));
        constraintLayout.addView(flow3);
        int i3 = z ? i : 0;
        LinearLayout linearLayout = new LinearLayout(context3);
        linearLayout.setId(R.id.vk_uni_widget_footer_text_button);
        constraintLayout.addView(linearLayout);
        flow3.g(linearLayout);
        linearLayout.setLayoutParams(new ConstraintLayout.b(-1, -2));
        f4m.v(iah0.a(6), linearLayout);
        TextView textView3 = new TextView(context3);
        textView3.setId(R.id.vk_uni_widget_footer_description);
        textView3.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 1.0f));
        TextBlock textBlock3 = footerTextButton.c;
        SuperappTextStylesBridge superappTextStylesBridge3 = m3q0.c;
        i(textView3, textBlock3, (superappTextStylesBridge3 != null ? superappTextStylesBridge3 : null).a());
        textView3.setSingleLine();
        f4m.t(iah0.a(2), textView3);
        f4m.y(iah0.a(14) + i3, textView3);
        f4m.v(iah0.a(12), textView3);
        linearLayout.addView(textView3);
        TextView textView4 = new TextView(context3);
        textView4.setId(R.id.vk_uni_widget_footer_button);
        textView4.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        f(textView4, footerTextButton.d);
        f4m.r(iah0.a(28), textView4);
        textView4.setSingleLine();
        linearLayout.addView(textView4);
        View space3 = new Space(context3);
        space3.setId(R.id.vk_uni_widget_footer_space);
        constraintLayout.addView(space3);
        flow3.g(space3);
        space3.setLayoutParams(new ConstraintLayout.b(0, 0));
        l(flow3);
        Pair pair2 = new Pair(flow3, linearLayout);
        Flow flow4 = (Flow) pair2.d();
        View view6 = (View) pair2.g();
        bVar7.i(constraintLayout);
        bVar7.p(R.id.vk_uni_widget_footer_space, 0);
        bVar7.p(flow4.getId(), -2);
        bVar7.k(flow4.getId(), 7, 0, 7);
        bVar7.k(flow4.getId(), 6, 0, 6);
        bVar7.k(flow4.getId(), 4, 0, 4);
        bVar7.n(flow4.getId(), -2);
        if (z) {
            bVar = bVar7;
            bVar.l(q2.getId(), 3, flow4.getId(), 3, i);
            bVar.l(q2.getId(), 6, 0, 6, i);
            bVar.l(q2.getId(), 7, 0, 7, i);
        } else {
            bVar = bVar7;
        }
        bVar.b(constraintLayout);
        awt0.b(iah0.a(4), view6);
        return view6;
    }

    public final b t(BaseBlock baseBlock, ImageBlock imageBlock, Context context, ConstraintLayout constraintLayout) {
        HeaderBlock headerBlock;
        String str;
        ImageBlock imageBlock2;
        View view;
        j3q0<T> j3q0Var;
        float f2;
        TextView textView;
        TextView textView2;
        float f3;
        int i;
        View view2;
        int i2;
        WebAction webAction = imageBlock.f;
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        if (!(baseBlock instanceof HeaderBlock)) {
            View space = new Space(context);
            space.setId(R.id.vk_uni_widget_header_space);
            constraintLayout.addView(space);
            bVar.i(constraintLayout);
            bVar.n(space.getId(), iah0.a(6));
            bVar.k(space.getId(), 3, 0, 3);
            bVar.k(space.getId(), 6, 0, 6);
            bVar.b(constraintLayout);
            return new b(space, null, null);
        }
        View view3 = new View(context);
        view3.setId(R.id.vk_uni_widget_header);
        constraintLayout.addView(view3);
        ifx0 ifx0Var = e370.c;
        if (ifx0Var == null) {
            ifx0Var = null;
        }
        VKImageController<View> create = ifx0Var.b().create(context);
        HeaderBlock headerBlock2 = (HeaderBlock) baseBlock;
        String str2 = headerBlock2.d;
        ImageBlock imageBlock3 = headerBlock2.b;
        View view4 = ((com.vk.core.ui.image.c) create).getView();
        view4.setId(R.id.vk_uni_widget_header_icon);
        constraintLayout.addView(view4);
        if (imageBlock3 != null) {
            thn0 thn0Var = m3q0.b;
            thn0.h hVar = (thn0Var != null ? thn0Var : null).d;
            u(hVar.a, hVar.b, view4);
            str = str2;
            view = view4;
            imageBlock2 = imageBlock3;
            headerBlock = headerBlock2;
            j3q0Var = this;
            h(j3q0Var, create, headerBlock2.b, Float.valueOf(hVar.c), null, 8);
        } else {
            headerBlock = headerBlock2;
            str = str2;
            imageBlock2 = imageBlock3;
            view = view4;
            j3q0Var = this;
            view.setVisibility(8);
        }
        TextView textView3 = new TextView(context);
        textView3.setId(R.id.vk_uni_widget_header_title);
        textView3.setSingleLine();
        constraintLayout.addView(textView3);
        TextBlock textBlock = headerBlock.c;
        if (textBlock != null) {
            SuperappTextStylesBridge superappTextStylesBridge = m3q0.c;
            if (superappTextStylesBridge == null) {
                superappTextStylesBridge = null;
            }
            j3q0Var.i(textView3, textBlock, superappTextStylesBridge.e());
            textView3.setAllCaps(true);
            textView3.setGravity(16);
            textView3.setTextColor(j3q0Var.r().c.w(context));
        }
        if (str == null || drm0.N(str)) {
            f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            textView = null;
        } else {
            int a2 = iah0.a(6);
            int a3 = iah0.a(4);
            int a4 = iah0.a(3);
            SuperappTextStylesBridge superappTextStylesBridge2 = m3q0.c;
            if (superappTextStylesBridge2 == null) {
                superappTextStylesBridge2 = null;
            }
            SuperappTextStylesBridge.a i3 = superappTextStylesBridge2.i();
            textView = new TextView(context);
            textView.setId(R.id.vk_uni_widget_header_promo_label);
            textView.setPadding(a2, a3, a2, a4);
            textView.setSingleLine();
            textView.setTextSize(11.0f);
            TypedValue typedValue = krv0.a;
            krv0.q(textView, R.attr.vk_ui_text_secondary);
            textView.setIncludeFontPadding(false);
            float b2 = iah0.b(14.0f);
            f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            textView.setLineSpacing(b2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            textView.setLetterSpacing(0.01f);
            textView.setTypeface((Typeface) i3.e.invoke(context, i3.d));
            gtm0 gtm0Var = j3q0Var.c;
            if (gtm0Var == null) {
                gtm0Var = null;
            }
            textView.setText(gtm0Var.a(str));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(krv0.m(R.attr.vk_ui_background_secondary_alpha, context));
            gradientDrawable.setCornerRadius(iah0.b(6.0f));
            textView.setBackground(gradientDrawable);
            gfx0 gfx0Var = e370.b;
            if (gfx0Var == null) {
                gfx0Var = null;
            }
            gfx0Var.b(textView, SuperappUiDesignBridge.FontFamily.REGULAR);
            constraintLayout.addView(textView);
        }
        ImageView imageView = new ImageView(context);
        imageView.setId(R.id.vk_uni_widget_header_btn);
        imageView.setImageResource(R.drawable.vk_icon_chevron_24);
        j3q0Var.r().getClass();
        imageView.setColorFilter(j3q0Var.r().c.q(context));
        constraintLayout.addView(imageView);
        imageView.setVisibility(j3q0Var.r().a ? 0 : 8);
        if (imageBlock.b == null || webAction == null) {
            textView2 = textView3;
            f3 = f2;
            i = 4;
            view2 = null;
        } else {
            ifx0 ifx0Var2 = e370.c;
            if (ifx0Var2 == null) {
                ifx0Var2 = null;
            }
            VKImageController<View> create2 = ifx0Var2.b().create(context);
            view2 = ((com.vk.core.ui.image.c) create2).getView();
            view2.setId(R.id.vk_uni_widget_additional_header_btn);
            CharSequence f4 = webAction.f();
            if (f4 != null) {
                view2.setContentDescription(f4);
            }
            constraintLayout.addView(view2);
            thn0 thn0Var2 = m3q0.b;
            thn0.h hVar2 = (thn0Var2 != null ? thn0Var2 : null).d;
            u(hVar2.a, hVar2.b, view2);
            textView2 = textView3;
            f3 = f2;
            i = 4;
            h(j3q0Var, create2, imageBlock, Float.valueOf(hVar2.c), null, 8);
        }
        bVar.i(constraintLayout);
        int id = view.getId();
        int i4 = d;
        bVar.l(id, 3, 0, 3, i4);
        bVar.l(view.getId(), 6, 0, 6, i4);
        bVar.l(view.getId(), 4, 0, 4, i4);
        bVar.I(f3, view.getId());
        bVar.p(textView2.getId(), 0);
        bVar.l(textView2.getId(), 3, 0, 3, i4);
        if (imageBlock2 != null) {
            bVar.l(textView2.getId(), 6, view.getId(), 7, iah0.a(10));
        } else {
            bVar.l(textView2.getId(), 6, 0, 6, i4);
        }
        if (textView == null) {
            bVar.l(textView2.getId(), 7, imageView.getId(), 6, iah0.a(6));
            bVar.p(textView2.getId(), 0);
        }
        if (textView != null) {
            bVar.l(textView.getId(), 6, textView2.getId(), 7, iah0.a(8));
            bVar.k(textView.getId(), 3, textView2.getId(), 3);
            if (view2 != null) {
                bVar.l(textView.getId(), 7, view2.getId(), 6, iah0.a(6));
            } else {
                bVar.l(textView.getId(), 7, imageView.getId(), 6, iah0.a(6));
            }
            bVar.k(textView.getId(), i, textView2.getId(), i);
            bVar.p(textView.getId(), -2);
            bVar.u(textView.getId()).e.m0 = true;
            bVar.F(f3, textView.getId());
        }
        int id2 = imageView.getId();
        r().getClass();
        bVar.l(id2, 7, 0, 7, i4);
        int id3 = imageView.getId();
        r().getClass();
        bVar.l(id3, 3, 0, 3, iah0.a(12));
        if (view2 != null) {
            i2 = 6;
            bVar.k(view2.getId(), 7, imageView.getId(), 6);
            bVar.l(view2.getId(), 3, 0, 3, iah0.a(12));
        } else {
            i2 = 6;
        }
        bVar.k(view3.getId(), i2, 0, i2);
        bVar.k(view3.getId(), 7, 0, 7);
        bVar.k(view3.getId(), 3, 0, 3);
        bVar.n(view3.getId(), (i4 * 2) + iah0.a(16));
        bVar.b(constraintLayout);
        return new b(view3, imageView, view2);
    }
}
