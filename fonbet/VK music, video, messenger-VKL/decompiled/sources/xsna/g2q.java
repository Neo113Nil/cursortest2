package xsna;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.superapp.ui.shimmer.Shimmer;
import com.vk.superapp.ui.shimmer.ShimmerFrameLayout;
import com.vk.superapp.ui.widgets.miniwidgets.ExchangeMiniWidget;
import com.vk.superapp.ui.widgets.miniwidgets.MiniWidgetItem;
import com.vk.superapp.ui.widgets.miniwidgets.SuperAppMiniWidget;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vkontakte.android.R;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.jsonwebtoken.JwtParser;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ExchangeMiniWidgetHolder.kt */
/* loaded from: classes6.dex */
public final class g2q extends ucn0<bjf0> {
    public static final int z = iah0.a(40);
    public final jr20 p;
    public final TextView q;
    public final TextView r;
    public final TextView s;
    public final ViewGroup t;
    public final ViewGroup u;
    public final ViewGroup v;
    public final View w;
    public final ImageView x;
    public final DecimalFormat y;

    /* compiled from: ExchangeMiniWidgetHolder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ExchangeMiniWidget.CurrencyTrend.values().length];
            try {
                iArr[ExchangeMiniWidget.CurrencyTrend.POSITIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ExchangeMiniWidget.CurrencyTrend.NEGATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ExchangeMiniWidget.CurrencyTrend.ZERO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[MiniWidgetItem.HeaderIconAlign.values().length];
            try {
                iArr2[MiniWidgetItem.HeaderIconAlign.BOTTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[MiniWidgetItem.HeaderIconAlign.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[MiniWidgetItem.HeaderIconAlign.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public g2q(View view, jr20 jr20Var) {
        super(view, null);
        this.p = jr20Var;
        TextView textView = (TextView) this.itemView.findViewById(R.id.title);
        this.q = textView;
        TextView textView2 = (TextView) this.itemView.findViewById(R.id.delta_percent);
        this.r = textView2;
        TextView textView3 = (TextView) this.itemView.findViewById(R.id.subtitle);
        this.s = textView3;
        this.t = (ViewGroup) this.itemView.findViewById(R.id.icon_box_top);
        this.u = (ViewGroup) this.itemView.findViewById(R.id.icon_box_bottom);
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) this.itemView.findViewById(R.id.shimmer_layout);
        ViewGroup viewGroup = (ViewGroup) this.itemView.findViewById(R.id.container);
        this.v = viewGroup;
        View findViewById = this.itemView.findViewById(R.id.disabled_view);
        this.w = findViewById;
        this.x = (ImageView) this.itemView.findViewById(R.id.disabled_image_view);
        DecimalFormat decimalFormat = new DecimalFormat();
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setGroupingSeparator(' ');
        decimalFormatSymbols.setDecimalSeparator(',');
        decimalFormat.setMinimumFractionDigits(2);
        decimalFormat.setMaximumFractionDigits(100);
        decimalFormat.setGroupingSize(3);
        decimalFormat.setGroupingUsed(true);
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        this.y = decimalFormat;
        bwt0.i0(view, new vam(this, 8));
        bwt0.k0(view, new nvg(this, 19));
        bwt0.k0(findViewById, new tcn(this, 5));
        bwt0.i0(findViewById, new n6f(this, 21));
        textView.setTextSize(1, 14.0f);
        textView2.setTextSize(1, 12.0f);
        textView3.setTextSize(1, 14.0f);
        Shimmer.c cVar = (Shimmer.c) new Shimmer.c().c(true).j();
        cVar.k(e3m.f(R.attr.vk_ui_vkontakte_color_im_bubble_incoming, this.itemView.getContext()));
        cVar.a.d = e3m.f(R.attr.vk_ui_track_background, this.itemView.getContext());
        shimmerFrameLayout.b(cVar.d(1.0f).g(iah0.a(120)).f(iah0.a(62)).a());
        viewGroup.setOutlineProvider(new f2q(this));
        viewGroup.setClipToOutline(true);
    }

    public static void h6(TextView textView, FontFamily fontFamily, float f) {
        com.vk.typography.b.g(textView, fontFamily, com.vk.movika.sdk.base.model.n.a(f), TextSizeUnit.PX);
    }

    @Override // xsna.hf6
    public final void W5(zif0 zif0Var) {
        int i;
        String str;
        g2q g2qVar;
        TextView textView;
        WebImageSize e;
        bjf0 bjf0Var = (bjf0) zif0Var;
        MiniWidgetItem miniWidgetItem = bjf0Var.a;
        if (miniWidgetItem instanceof ExchangeMiniWidget) {
            ExchangeMiniWidget exchangeMiniWidget = (ExchangeMiniWidget) miniWidgetItem;
            ExchangeMiniWidget.CurrencyTrend currencyTrend = exchangeMiniWidget.r;
            String str2 = exchangeMiniWidget.o;
            String str3 = exchangeMiniWidget.p;
            double d = exchangeMiniWidget.q;
            String str4 = exchangeMiniWidget.n;
            int[] iArr = a.$EnumSwitchMapping$0;
            int i2 = iArr[currencyTrend.ordinal()];
            if (i2 == 1) {
                i = R.attr.vk_ui_accent_green;
            } else if (i2 == 2) {
                i = R.attr.vk_ui_accent_red;
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R.attr.vk_ui_text_secondary;
            }
            int a2 = b6g.a(i, this.itemView.getContext());
            int i3 = iArr[exchangeMiniWidget.r.ordinal()];
            if (i3 == 1) {
                str = "↑";
            } else if (i3 == 2) {
                str = "↓";
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "";
            }
            SuperAppMiniWidget.WidgetSize widgetSize = bjf0Var.b;
            SuperAppMiniWidget.WidgetSize widgetSize2 = SuperAppMiniWidget.WidgetSize.SMALL;
            DecimalFormat decimalFormat = this.y;
            ViewGroup viewGroup = this.v;
            TextView textView2 = this.r;
            TextView textView3 = this.s;
            TextView textView4 = this.q;
            if (widgetSize == widgetSize2) {
                viewGroup.setMinimumHeight(iah0.a(64));
                String concat = str.concat(brm0.y(brm0.y(str2, ".", StringUtils.COMMA), "-", ""));
                textView4.setText(str4);
                jno0.c(textView4, R.attr.vk_ui_text_secondary);
                FontFamily fontFamily = FontFamily.MEDIUM;
                h6(textView4, fontFamily, 14.0f);
                float f = 14;
                f4m.t(iah0.a(f), textView4);
                f4m.w(0, textView4);
                Context context = textView3.getContext();
                String valueOf = String.valueOf(d);
                Double k = arm0.k(valueOf.replace(',', JwtParser.SEPARATOR_CHAR));
                if (k != null) {
                    valueOf = decimalFormat.format(k.doubleValue());
                }
                textView3.setText(xpg0.a(context.getString(R.string.vk_super_app_widget_exchange_absolute_value_format, valueOf, str3)));
                jno0.c(textView3, R.attr.vk_ui_text_primary);
                h6(textView3, fontFamily, 14.0f);
                f4m.t(iah0.a(2), textView3);
                f4m.q(iah0.a(f), textView3);
                textView2.setVisibility(0);
                textView2.setText(concat);
                textView2.setTextColor(a2);
            } else {
                viewGroup.setMinimumHeight(iah0.a(78));
                f4m.j(textView2);
                String y = brm0.y(str2, ".", StringUtils.COMMA);
                Context context2 = textView4.getContext();
                String valueOf2 = String.valueOf(d);
                Double k2 = arm0.k(valueOf2.replace(',', JwtParser.SEPARATOR_CHAR));
                textView4.setText(xpg0.a(context2.getString(R.string.vk_super_app_widget_exchange_absolute_value_format, k2 == null ? valueOf2 : decimalFormat.format(k2.doubleValue()), str3)));
                h6(textView4, FontFamily.DISPLAY_MEDIUM, 17.0f);
                jno0.c(textView4, R.attr.vk_ui_text_primary);
                String concat2 = str.concat(brm0.y(y, "-", ""));
                textView3.setText(xpg0.a(str4 + '\n' + concat2));
                jno0.c(textView3, R.attr.vk_ui_text_secondary);
                SpannableString spannableString = new SpannableString(textView3.getText());
                int I = drm0.I(textView3.getText(), concat2, 0, false);
                int length = concat2.length() + I;
                if (I != -1) {
                    spannableString.setSpan(new ForegroundColorSpan(a2), I, length, 33);
                    textView3.setText(spannableString, TextView.BufferType.SPANNABLE);
                }
                h6(textView3, FontFamily.REGULAR, 11.0f);
            }
            WebImage webImage = exchangeMiniWidget.j;
            String str5 = (webImage == null || (e = webImage.e(z)) == null) ? null : e.b;
            ViewGroup viewGroup2 = this.t;
            ViewGroup viewGroup3 = this.u;
            if (str5 == null || drm0.N(str5)) {
                g2qVar = this;
                textView = textView4;
                f4m.j(viewGroup3);
                f4m.j(viewGroup2);
            } else {
                int i4 = a.$EnumSwitchMapping$1[exchangeMiniWidget.k.ordinal()];
                if (i4 == 1) {
                    textView = textView4;
                    String str6 = str5;
                    g2qVar = this;
                    viewGroup3.setVisibility(0);
                    ucn0.a6(g2qVar, g2qVar.u, str6, R.drawable.vk_default_placeholder_10, false, 24);
                    f4m.j(viewGroup2);
                } else if (i4 == 2) {
                    viewGroup2.setVisibility(0);
                    String str7 = str5;
                    g2qVar = this;
                    textView = textView4;
                    ucn0.a6(g2qVar, g2qVar.t, str7, R.drawable.vk_default_placeholder_10, false, 24);
                    f4m.j(viewGroup3);
                } else {
                    if (i4 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    g2qVar = this;
                    textView = textView4;
                }
            }
            boolean z2 = exchangeMiniWidget.m;
            awt0.u(textView, z2);
            awt0.u(textView3, z2);
            awt0.v(textView2, z2);
            boolean z3 = !z2;
            awt0.v(g2qVar.w, z3);
            awt0.v(g2qVar.x, z3);
        }
    }

    public final void g6() {
        Object obj = this.l;
        if (obj == null) {
            obj = null;
        }
        this.p.P0(((bjf0) obj).a.d(), getAdapterPosition());
    }
}
