package xsna;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.superapp.ui.shimmer.Shimmer;
import com.vk.superapp.ui.shimmer.ShimmerFrameLayout;
import com.vk.superapp.ui.widgets.miniwidgets.DefaultMiniWidget;
import com.vk.superapp.ui.widgets.miniwidgets.MiniWidgetItem;
import com.vk.superapp.ui.widgets.miniwidgets.SuperAppMiniWidget;
import com.vk.superapp.vkhealth.permissions.api.RequestedMiniApp;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vkontakte.android.R;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: DefaultMiniWidgetsHolder.kt */
/* loaded from: classes6.dex */
public final class uil extends ucn0<bjf0> {
    public static final int B = iah0.a(40);
    public static final int C = iah0.a(46);
    public static final float D = iah0.b(44.0f);
    public static final float E = iah0.b(8.0f);
    public final DecimalFormat A;
    public final ayu0 p;
    public final jr20 q;
    public final TextView r;
    public final TextView s;
    public final ViewGroup t;
    public final ViewGroup u;
    public final View v;
    public final View w;
    public final ViewGroup x;
    public final View y;
    public final ImageView z;

    /* compiled from: DefaultMiniWidgetsHolder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MiniWidgetItem.HeaderIconAlign.values().length];
            try {
                iArr[MiniWidgetItem.HeaderIconAlign.BOTTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MiniWidgetItem.HeaderIconAlign.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MiniWidgetItem.HeaderIconAlign.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public uil(View view, ayu0 ayu0Var, jr20 jr20Var) {
        super(view, null);
        this.p = ayu0Var;
        this.q = jr20Var;
        this.r = (TextView) this.itemView.findViewById(R.id.title);
        this.s = (TextView) this.itemView.findViewById(R.id.subtitle);
        this.t = (ViewGroup) this.itemView.findViewById(R.id.icon_box_top);
        this.u = (ViewGroup) this.itemView.findViewById(R.id.icon_box_bottom);
        View findViewById = this.itemView.findViewById(R.id.icon_box_top_background);
        this.v = findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.icon_box_bottom_background);
        this.w = findViewById2;
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) this.itemView.findViewById(R.id.shimmer_layout);
        ViewGroup viewGroup = (ViewGroup) this.itemView.findViewById(R.id.container);
        this.x = viewGroup;
        View findViewById3 = this.itemView.findViewById(R.id.disabled_view);
        this.y = findViewById3;
        this.z = (ImageView) this.itemView.findViewById(R.id.disabled_image_view);
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getInstance(Locale.US);
        this.A = decimalFormat;
        bwt0.i0(view, new p4f(this, 14));
        bwt0.k0(view, new dsc(this, 20));
        bwt0.k0(findViewById3, new b5h(this, 6));
        bwt0.i0(findViewById3, new oce(this, 14));
        DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
        decimalFormatSymbols.setGroupingSeparator(' ');
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        Context context = this.itemView.getContext();
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, new int[]{e3m.f(R.attr.vk_ui_background_content, context), 0});
        gradientDrawable.setGradientType(1);
        gradientDrawable.setGradientRadius(D);
        findViewById.setBackground(gradientDrawable);
        findViewById2.setBackground(gradientDrawable);
        Shimmer.c cVar = (Shimmer.c) new Shimmer.c().c(true).j();
        cVar.k(e3m.f(R.attr.vk_ui_vkontakte_color_im_bubble_incoming, context));
        cVar.a.d = e3m.f(R.attr.vk_ui_track_background, context);
        shimmerFrameLayout.b(cVar.d(1.0f).g(iah0.a(120)).f(iah0.a(62)).a());
        viewGroup.setOutlineProvider(new til(context));
        viewGroup.setClipToOutline(true);
    }

    public static void g6(MiniWidgetItem miniWidgetItem, View view, int i) {
        if (!miniWidgetItem.e()) {
            int i2 = B;
            bwt0.m0(i2, i2, view);
            view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            return;
        }
        int i3 = C;
        bwt0.m0(i3, i3, view);
        float f = E;
        view.setTranslationX(f);
        view.setTranslationY(i * f);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x018f  */
    @Override // xsna.hf6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W5(zif0 zif0Var) {
        String str;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        Context context;
        Integer m;
        bjf0 bjf0Var = (bjf0) zif0Var;
        MiniWidgetItem miniWidgetItem = bjf0Var.a;
        if (miniWidgetItem instanceof DefaultMiniWidget) {
            SuperAppMiniWidget.WidgetSize widgetSize = bjf0Var.b;
            SuperAppMiniWidget.WidgetSize widgetSize2 = SuperAppMiniWidget.WidgetSize.SMALL;
            ViewGroup viewGroup3 = this.x;
            TextView textView = this.s;
            TextView textView2 = this.r;
            if (widgetSize == widgetSize2) {
                textView2.setMaxLines(2);
                textView.setMaxLines(1);
                viewGroup3.setMinimumHeight(iah0.a(64));
                f4m.t(iah0.a(12), textView2);
            } else {
                viewGroup3.setMinimumHeight(iah0.a(78));
                textView2.setMaxLines(2);
                textView.setMaxLines(2);
                f4m.q(iah0.a(14), textView);
            }
            DefaultMiniWidget defaultMiniWidget = (DefaultMiniWidget) miniWidgetItem;
            String str2 = defaultMiniWidget.h;
            String str3 = defaultMiniWidget.o;
            if (epx.f(str2, "mw_steps") && (m = arm0.m(10, str3)) != null) {
                String str4 = this.A.format(Integer.valueOf(m.intValue())).toString();
                if (str4 != null) {
                    str3 = str4;
                }
            }
            if (drm0.D(str3, "\n", false)) {
                com.vk.typography.b.g(textView2, FontFamily.MEDIUM, com.vk.movika.sdk.base.model.n.a(14.0f), TextSizeUnit.PX);
            } else {
                com.vk.typography.b.g(textView2, FontFamily.DISPLAY_MEDIUM, com.vk.movika.sdk.base.model.n.a(17.0f), TextSizeUnit.PX);
            }
            textView2.setText(str3);
            String str5 = defaultMiniWidget.p;
            if (str5.length() == 0) {
                f4m.j(textView);
                ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                if (layoutParams instanceof ConstraintLayout.b) {
                    ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
                    bVar.l = -1;
                    bVar.k = -1;
                }
                textView2.setLayoutParams(layoutParams);
                f4m.t(iah0.a(11), textView2);
                f4m.q(iah0.a(14), textView2);
                textView2.setTextSize(1, 14.0f);
            } else {
                textView.setVisibility(0);
                textView.setText(str5);
                com.vk.typography.b.g(textView, FontFamily.REGULAR, com.vk.movika.sdk.base.model.n.a(11.0f), TextSizeUnit.PX);
                jno0.c(textView, R.attr.vk_ui_text_secondary);
            }
            WebImage webImage = defaultMiniWidget.j;
            if (webImage != null) {
                WebImageSize e = webImage.e(((DefaultMiniWidget) miniWidgetItem).n ? C : B);
                if (e != null) {
                    str = e.b;
                    viewGroup = this.t;
                    viewGroup2 = this.u;
                    if (str != null || drm0.N(str)) {
                        f4m.j(viewGroup2);
                        f4m.j(viewGroup);
                    } else {
                        int i = a.$EnumSwitchMapping$0[defaultMiniWidget.k.ordinal()];
                        View view = this.w;
                        View view2 = this.v;
                        if (i == 1) {
                            f4m.j(viewGroup);
                            f4m.j(view2);
                            viewGroup2.setVisibility(0);
                            view.setVisibility(0);
                            g6(miniWidgetItem, viewGroup2, 1);
                            ucn0.a6(this, this.u, str, R.drawable.default_placeholder_10, ((DefaultMiniWidget) miniWidgetItem).n, 16);
                        } else if (i == 2) {
                            viewGroup.setVisibility(0);
                            view2.setVisibility(0);
                            f4m.j(viewGroup2);
                            f4m.j(view);
                            g6(miniWidgetItem, viewGroup, -1);
                            ucn0.a6(this, this.t, str, R.drawable.default_placeholder_10, ((DefaultMiniWidget) miniWidgetItem).n, 16);
                        } else if (i != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    ab abVar = new ab(9, this, bjf0Var);
                    context = e43.a;
                    if (context == null) {
                        context = null;
                    }
                    this.p.j(context, RequestedMiniApp.VK_STEPS, null, new hl1(13, abVar, miniWidgetItem));
                    this.y.setContentDescription(this.itemView.getContext().getString(R.string.vk_mini_widget_content_description, this.itemView.getContext().getString(R.string.vk_mini_widget_disabled)));
                }
            }
            str = null;
            viewGroup = this.t;
            viewGroup2 = this.u;
            if (str != null) {
            }
            f4m.j(viewGroup2);
            f4m.j(viewGroup);
            ab abVar2 = new ab(9, this, bjf0Var);
            context = e43.a;
            if (context == null) {
            }
            this.p.j(context, RequestedMiniApp.VK_STEPS, null, new hl1(13, abVar2, miniWidgetItem));
            this.y.setContentDescription(this.itemView.getContext().getString(R.string.vk_mini_widget_content_description, this.itemView.getContext().getString(R.string.vk_mini_widget_disabled)));
        }
    }

    public final void h6() {
        Object obj = this.l;
        if (obj == null) {
            obj = null;
        }
        this.q.P0(((bjf0) obj).a.d(), getAdapterPosition());
    }
}
