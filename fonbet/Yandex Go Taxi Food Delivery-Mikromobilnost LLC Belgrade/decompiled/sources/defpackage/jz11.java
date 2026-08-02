package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.yandex.alicekit.core.json.schema.HtmlString;
import com.yandex.div.legacy.util.Position;
import com.yandex.div.legacy.view.DivView;
import com.yandex.div.legacy.view.RatioImageView;

/* loaded from: classes11.dex */
public final class jz11 extends xok {
    public final Context a;
    public final Context b;
    public final ut31 c;
    public final h2b d;
    public final pzf e;

    public jz11(Context context, Context context2, ut31 ut31Var, h2b h2bVar, pzf pzfVar, final syk sykVar) {
        this.a = context;
        this.b = context2;
        this.c = ut31Var;
        this.d = h2bVar;
        this.e = pzfVar;
        final int i = 0;
        ut31Var.d("UniversalDivViewBuilder.TITLE_AND_TEXT", new zq31(this) { // from class: gz11
            public final /* synthetic */ jz11 b;

            {
                this.b = this;
            }

            @Override // defpackage.zq31
            public final View a() {
                int i2 = i;
                jz11 jz11Var = this.b;
                switch (i2) {
                    case 0:
                        return new LinearLayout(jz11Var.b);
                    default:
                        return new RatioImageView(jz11Var.b, null, gng0.legacyUniversalImageStyle);
                }
            }
        }, 2);
        ut31Var.d("UniversalDivViewBuilder.TITLE", new zq31(this) { // from class: hz11
            public final /* synthetic */ jz11 b;

            {
                this.b = this;
            }

            @Override // defpackage.zq31
            public final View a() {
                int i2 = i;
                syk sykVar2 = sykVar;
                jz11 jz11Var = this.b;
                switch (i2) {
                    case 0:
                        return xok.d(sykVar2, jz11Var.b, gng0.legacyUniversalTitleStyle, ogh0.div_universal_title);
                    default:
                        return xok.d(sykVar2, jz11Var.b, gng0.legacyUniversalTextStyle, ogh0.div_universal_text);
                }
            }
        }, 10);
        final int i2 = 1;
        ut31Var.d("UniversalDivViewBuilder.TEXT", new zq31(this) { // from class: hz11
            public final /* synthetic */ jz11 b;

            {
                this.b = this;
            }

            @Override // defpackage.zq31
            public final View a() {
                int i22 = i2;
                syk sykVar2 = sykVar;
                jz11 jz11Var = this.b;
                switch (i22) {
                    case 0:
                        return xok.d(sykVar2, jz11Var.b, gng0.legacyUniversalTitleStyle, ogh0.div_universal_title);
                    default:
                        return xok.d(sykVar2, jz11Var.b, gng0.legacyUniversalTextStyle, ogh0.div_universal_text);
                }
            }
        }, 10);
        ut31Var.d("UniversalDivViewBuilder.IMAGE", new zq31(this) { // from class: gz11
            public final /* synthetic */ jz11 b;

            {
                this.b = this;
            }

            @Override // defpackage.zq31
            public final View a() {
                int i22 = i2;
                jz11 jz11Var = this.b;
                switch (i22) {
                    case 0:
                        return new LinearLayout(jz11Var.b);
                    default:
                        return new RatioImageView(jz11Var.b, null, gng0.legacyUniversalImageStyle);
                }
            }
        }, 4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        if (defpackage.xdb1.e(r11.a) != false) goto L25;
     */
    @Override // defpackage.ggk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View a(DivView divView, n15 n15Var) {
        int i;
        int i2;
        rml rmlVar = (rml) n15Var;
        CharSequence charSequence = rmlVar.y;
        CharSequence charSequence2 = rmlVar.B;
        jdj jdjVar = rmlVar.x;
        if (!xdb1.e(charSequence) && !xdb1.e(charSequence2)) {
            if (jdjVar != null) {
                r9l r9lVar = (r9l) jdjVar.c;
                String str = r9lVar.c;
                d4x d4xVar = r9lVar.b;
                ctk ctkVar = "div-image-element".equals(str) ? (ctk) d4xVar : null;
                if (ctkVar == null || !xdb1.d(ctkVar)) {
                    qml qmlVar = "date_element".equals(r9lVar.c) ? (qml) d4xVar : null;
                    if (qmlVar != null) {
                    }
                }
            }
            return null;
        }
        String str2 = rmlVar.D;
        Integer num = rmlVar.C;
        pzf pzfVar = this.e;
        cty0 c = pzfVar.c(num, str2);
        cty0 c2 = pzfVar.c(rmlVar.z, rmlVar.A);
        if (jdjVar == null) {
            return i(charSequence2, c, charSequence, c2);
        }
        r9l r9lVar2 = (r9l) jdjVar.c;
        String str3 = (String) jdjVar.w;
        Position a = mj91.a((String) jdjVar.b);
        String str4 = r9lVar2.c;
        String str5 = r9lVar2.c;
        d4x d4xVar2 = r9lVar2.b;
        ctk ctkVar2 = "div-image-element".equals(str4) ? (ctk) d4xVar2 : null;
        Context context = this.a;
        if (ctkVar2 != null) {
            RelativeLayout j = j();
            RatioImageView ratioImageView = (RatioImageView) this.c.b("UniversalDivViewBuilder.IMAGE");
            ratioImageView.setId(ogh0.div_universal_image);
            str3.getClass();
            switch (str3) {
                case "l":
                    i2 = atg0.div_universal_image_size_l;
                    break;
                case "m":
                    i2 = atg0.div_universal_image_size_m;
                    break;
                case "s":
                    i2 = atg0.div_universal_image_size_s;
                    break;
                default:
                    z83.j("Unknown size");
                    i2 = atg0.div_universal_image_size_s;
                    break;
            }
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i2);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(dimensionPixelSize, -2);
            ratioImageView.setMaxWidth(dimensionPixelSize);
            ratioImageView.setRatio(Float.valueOf(mj91.c(ctkVar2)));
            divView.addLoadReference(this.d.loadImage(ctkVar2.a.toString(), new zsk(1, new iz11(this, divView, str3, ratioImageView)), 0), ratioImageView);
            h(layoutParams, a);
            ratioImageView.setLayoutParams(layoutParams);
            j.addView(ratioImageView);
            g(j, a, ogh0.div_universal_image, charSequence2, c, charSequence, c2);
            return j;
        }
        qml qmlVar2 = "date_element".equals(str5) ? (qml) d4xVar2 : null;
        if (qmlVar2 == null) {
            z83.j("Invalid universal div with side : " + str5);
            return i(charSequence2, c, charSequence, c2);
        }
        RelativeLayout j2 = j();
        str3.getClass();
        switch (str3) {
            case "l":
                i = atg0.div_universal_image_size_l;
                break;
            case "m":
                i = atg0.div_universal_image_size_m;
                break;
            case "s":
                i = atg0.div_universal_image_size_s;
                break;
            default:
                z83.j("Unknown size");
                i = atg0.div_universal_image_size_s;
                break;
        }
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(i);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(dimensionPixelSize2, -2);
        h(layoutParams2, a);
        HtmlString htmlString = qmlVar2.a;
        int i3 = gng0.legacyUniversalDayStyle;
        Context context2 = this.b;
        TextView textView = new TextView(context2, null, i3);
        textView.setId(ogh0.div_universal_date_day);
        textView.setText(htmlString);
        textView.setTextSize(0, context.getResources().getDimensionPixelSize("s".equals(str3) ? atg0.div_universal_day_text_size_s : atg0.div_universal_day_text_size));
        j2.addView(textView, layoutParams2);
        HtmlString htmlString2 = qmlVar2.b;
        if (htmlString2 != null) {
            TextView textView2 = new TextView(context2, null, gng0.legacyUniversalMonthStyle);
            textView2.setId(ogh0.div_universal_date_month);
            textView2.setText(htmlString2);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(dimensionPixelSize2, -2);
            h(layoutParams3, a);
            layoutParams3.addRule(3, ogh0.div_universal_date_day);
            j2.addView(textView2, layoutParams3);
        }
        g(j2, a, ogh0.div_universal_date_day, charSequence2, c, charSequence, c2);
        return j2;
    }

    public final void g(RelativeLayout relativeLayout, Position position, int i, CharSequence charSequence, cty0 cty0Var, CharSequence charSequence2, cty0 cty0Var2) {
        ut31 ut31Var = this.c;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ut31Var.b("UniversalDivViewBuilder.TITLE");
        xok.f(appCompatTextView, charSequence, cty0Var);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ut31Var.b("UniversalDivViewBuilder.TEXT");
        xok.f(appCompatTextView2, charSequence2, cty0Var2);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        int i2 = position == Position.RIGHT ? 0 : 1;
        layoutParams.addRule(i2, i);
        layoutParams2.addRule(i2, i);
        layoutParams2.addRule(3, ogh0.div_universal_title);
        relativeLayout.addView(appCompatTextView, layoutParams);
        relativeLayout.addView(appCompatTextView2, layoutParams2);
    }

    public final void h(RelativeLayout.LayoutParams layoutParams, Position position) {
        int e = xok.e(atg0.div_universal_image_horizontal_margin, this.a);
        if (position != Position.RIGHT) {
            layoutParams.rightMargin = e;
        } else {
            layoutParams.leftMargin = e;
            layoutParams.addRule(11);
        }
    }

    public final View i(CharSequence charSequence, cty0 cty0Var, CharSequence charSequence2, cty0 cty0Var2) {
        int i = atg0.div_universal_padding_bottom;
        Context context = this.a;
        int e = xok.e(i, context);
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(atg0.div_horizontal_padding);
        ut31 ut31Var = this.c;
        if (charSequence == null || charSequence2 == null) {
            if (charSequence == null) {
                AppCompatTextView appCompatTextView = (AppCompatTextView) ut31Var.b("UniversalDivViewBuilder.TEXT");
                xok.f(appCompatTextView, charSequence2, cty0Var2);
                appCompatTextView.setPadding(dimensionPixelOffset, context.getResources().getDimensionPixelOffset(atg0.div_padding_zero), dimensionPixelOffset, e);
                return appCompatTextView;
            }
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ut31Var.b("UniversalDivViewBuilder.TITLE");
            xok.f(appCompatTextView2, charSequence, cty0Var);
            int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(atg0.div_universal_title_padding_vertical);
            appCompatTextView2.setPadding(dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset, dimensionPixelOffset2);
            return appCompatTextView2;
        }
        LinearLayout linearLayout = (LinearLayout) ut31Var.b("UniversalDivViewBuilder.TITLE_AND_TEXT");
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        AppCompatTextView appCompatTextView3 = (AppCompatTextView) ut31Var.b("UniversalDivViewBuilder.TITLE");
        xok.f(appCompatTextView3, charSequence, cty0Var);
        linearLayout.addView(appCompatTextView3);
        AppCompatTextView appCompatTextView4 = (AppCompatTextView) ut31Var.b("UniversalDivViewBuilder.TEXT");
        xok.f(appCompatTextView4, charSequence2, cty0Var2);
        linearLayout.addView(appCompatTextView4);
        linearLayout.setPadding(dimensionPixelOffset, context.getResources().getDimensionPixelOffset(atg0.div_universal_title_and_text_padding_top), dimensionPixelOffset, e);
        return linearLayout;
    }

    public final RelativeLayout j() {
        int i = atg0.div_universal_padding_top;
        Context context = this.a;
        int e = xok.e(i, context);
        int e2 = xok.e(atg0.div_universal_padding_bottom, context);
        int e3 = xok.e(atg0.div_horizontal_padding, context);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        relativeLayout.setPadding(e3, e, e3, e2);
        return relativeLayout;
    }
}
