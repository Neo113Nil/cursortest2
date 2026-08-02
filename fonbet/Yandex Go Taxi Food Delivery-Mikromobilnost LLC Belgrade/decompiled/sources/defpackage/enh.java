package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import com.adjust.sdk.Constants;
import com.yandex.alicekit.core.views.EllipsizingTextView;
import com.yandex.alicekit.core.views.EmptyDrawable;
import com.yandex.messaging.internal.urlpreview.UrlPreviewBackgroundStyle;
import com.yandex.messaging.internal.urlpreview.reporter.UrlPreviewReporter$Element;
import com.yandex.messaging.views.RoundImageView;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes15.dex */
public final class enh extends x3 {
    public final int A;
    public final View B;
    public final RoundImageView C;
    public final TextView D;
    public final TextView E;
    public final EllipsizingTextView F;
    public final View G;
    public final r1s H;
    public final View I;
    public UrlPreviewBackgroundStyle J;
    public final View c;
    public final xav w;
    public final jcz0 x;
    public final int y;
    public final sh21 z;

    public enh(final lh21 lh21Var, View view, xav xavVar, jcz0 jcz0Var, int i, sh21 sh21Var) {
        super(17, lh21Var);
        this.c = view;
        this.w = xavVar;
        this.x = jcz0Var;
        this.y = i;
        this.z = sh21Var;
        this.A = kjs0.b(8);
        View a = new iv31(e9h0.default_url_preview_container_stub, e9h0.url_preview_container, olh0.msg_v_url_preview_default_full, view).a();
        this.B = a;
        RoundImageView roundImageView = (RoundImageView) a.findViewById(e9h0.preview_image);
        this.C = roundImageView;
        ImageButton imageButton = (ImageButton) a.findViewById(e9h0.image_status_button);
        this.D = (TextView) a.findViewById(e9h0.url_host);
        TextView textView = (TextView) a.findViewById(e9h0.url_preview_title);
        this.E = textView;
        EllipsizingTextView ellipsizingTextView = (EllipsizingTextView) a.findViewById(e9h0.url_preview_content);
        this.F = ellipsizingTextView;
        this.G = a.findViewById(e9h0.turbo_url_button_bg);
        this.H = new r1s(imageButton);
        this.I = a.findViewById(e9h0.default_url_preview_message_status);
        this.J = UrlPreviewBackgroundStyle.LowHalfCorners;
        imageButton.setOnClickListener(new bnh(this, 2));
        final int i2 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: cnh
            public final /* synthetic */ enh b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i3 = i2;
                lh21 lh21Var2 = lh21Var;
                enh enhVar = this.b;
                switch (i3) {
                    case 0:
                        enhVar.z.a(lh21Var2, UrlPreviewReporter$Element.Title);
                        enhVar.x.C(if90.c(((lh21) ((ye0) enhVar.b)).a));
                        break;
                    default:
                        enhVar.z.a(lh21Var2, UrlPreviewReporter$Element.Description);
                        enhVar.x.C(if90.c(((lh21) ((ye0) enhVar.b)).a));
                        break;
                }
            }
        });
        final int i3 = 1;
        ellipsizingTextView.setOnClickListener(new View.OnClickListener(this) { // from class: cnh
            public final /* synthetic */ enh b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i32 = i3;
                lh21 lh21Var2 = lh21Var;
                enh enhVar = this.b;
                switch (i32) {
                    case 0:
                        enhVar.z.a(lh21Var2, UrlPreviewReporter$Element.Title);
                        enhVar.x.C(if90.c(((lh21) ((ye0) enhVar.b)).a));
                        break;
                    default:
                        enhVar.z.a(lh21Var2, UrlPreviewReporter$Element.Description);
                        enhVar.x.C(if90.c(((lh21) ((ye0) enhVar.b)).a));
                        break;
                }
            }
        });
        View[] viewArr = {imageButton, textView, ellipsizingTextView, roundImageView};
        while (i2 < 4) {
            viewArr[i2].setOnLongClickListener(new ly4(4, this));
            i2++;
        }
    }

    @Override // defpackage.x3
    public final void Dg() {
        xav xavVar = this.w;
        RoundImageView roundImageView = this.C;
        xavVar.c(roundImageView);
        roundImageView.setOnClickListener(null);
        this.B.setVisibility(8);
    }

    @Override // defpackage.x3
    public final View Ig() {
        return this.I;
    }

    @Override // defpackage.x3
    public final View Jg() {
        return this.B;
    }

    @Override // defpackage.x3
    public final void Rg() {
        this.w.c(this.C);
    }

    @Override // defpackage.x3
    public final void Sg(UrlPreviewBackgroundStyle urlPreviewBackgroundStyle) {
        this.J = urlPreviewBackgroundStyle;
    }

    @Override // defpackage.x3
    public final void Tg(ip31 ip31Var, z9z0 z9z0Var, Canvas canvas, boolean z, boolean z2, boolean z3) {
        View view = this.c;
        Drawable b = z9z0.b(z9z0Var, view.getContext(), this.J.a(z3, z, z2));
        int a = kjs0.a(2.0f);
        int f = ip31Var.f();
        int g = ip31Var.g();
        b.setLayoutDirection(view.getLayoutDirection());
        View view2 = this.B;
        b.setBounds(f + a, view2.getTop() + a, g - a, view2.getBottom() - a);
        b.draw(canvas);
    }

    public final void Ug() {
        lh21 lh21Var = (lh21) ((ye0) this.b);
        Integer num = lh21Var.x;
        Integer num2 = lh21Var.y;
        String str = lh21Var.z;
        RoundImageView roundImageView = this.C;
        if (str == null) {
            roundImageView.setVisibility(8);
            return;
        }
        if (num == null || num2 == null || num.intValue() < 0 || num2.intValue() < 0) {
            roundImageView.setVisibility(8);
            return;
        }
        int intValue = num.intValue();
        float b = kjs0.b(256) / Math.max(intValue, r2);
        int i = (int) (intValue * b);
        int intValue2 = (int) (num2.intValue() * b);
        roundImageView.setVisibility(0);
        this.H.s();
        roundImageView.setImageDrawable(new EmptyDrawable(i, intValue2));
        yn50 yn50Var = (yn50) this.w.load(str);
        xn50 xn50Var = yn50Var.b;
        xn50Var.i = i;
        xn50Var.j = intValue2;
        EmptyDrawable emptyDrawable = new EmptyDrawable(i, intValue2);
        xn50 xn50Var2 = yn50Var.b;
        xn50Var2.e = emptyDrawable;
        xn50Var2.f = true;
        yn50Var.b(roundImageView, new dnh(0, this));
        roundImageView.setOnClickListener(new bnh(this, 1));
    }

    @Override // defpackage.x3
    public final void show() {
        View view = this.B;
        view.setVisibility(0);
        view.setVisibility(0);
        lh21 lh21Var = (lh21) ((ye0) this.b);
        String str = lh21Var.b;
        String str2 = lh21Var.c;
        String str3 = lh21Var.a;
        Uri parse = Uri.parse(str3);
        if (parse.getScheme() == null) {
            parse = parse.buildUpon().scheme(Constants.SCHEME).authority(str3).build();
        }
        String host = parse.getHost();
        TextView textView = this.D;
        if (host == null) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(parse.getHost());
        }
        Ug();
        TextView textView2 = this.E;
        if (str == null || str.length() == 0) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView2.setText(str);
        }
        EllipsizingTextView ellipsizingTextView = this.F;
        if (str2 == null || str2.length() == 0) {
            ellipsizingTextView.setVisibility(8);
        } else {
            ellipsizingTextView.setVisibility(0);
            if (bob1.a(ellipsizingTextView, str2)) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
                int i = this.y + this.A;
                spannableStringBuilder.append(HexString.CHAR_SPACE);
                int dimensionPixelSize = ellipsizingTextView.getContext().getResources().getDimensionPixelSize(gvg0.messaging_default_url_preview_content_text);
                int length = spannableStringBuilder.length();
                EmptyDrawable emptyDrawable = new EmptyDrawable(0, 0);
                emptyDrawable.setBounds(0, 0, i, dimensionPixelSize);
                spannableStringBuilder.setSpan(new ImageSpan(emptyDrawable), length - 1, length, 33);
                ellipsizingTextView.setText(spannableStringBuilder);
                ellipsizingTextView.setLastLinePadding(i);
                hi91.h(0, ellipsizingTextView);
            } else {
                ellipsizingTextView.setText(str2);
                ellipsizingTextView.setLastLinePadding(0);
                hi91.h(ellipsizingTextView.getLineHeight(), ellipsizingTextView);
            }
        }
        String str4 = lh21Var.w;
        View view2 = this.G;
        if (str4 == null) {
            view2.setVisibility(8);
        } else {
            view2.setVisibility(0);
            view2.setOnClickListener(new bnh(this, 0));
        }
        view.requestLayout();
    }
}
