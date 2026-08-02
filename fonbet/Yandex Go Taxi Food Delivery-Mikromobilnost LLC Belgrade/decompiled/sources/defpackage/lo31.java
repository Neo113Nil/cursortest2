package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.adjust.sdk.Constants;
import com.yandex.alicekit.core.views.EllipsizingTextView;
import com.yandex.alicekit.core.views.EmptyDrawable;
import com.yandex.messaging.internal.urlpreview.UrlPreviewBackgroundStyle;
import com.yandex.messaging.internal.urlpreview.reporter.UrlPreviewReporter$Element;
import com.yandex.messaging.ui.imageviewer.ImageViewerInfo;
import com.yandex.messaging.views.RoundImageView;

/* loaded from: classes15.dex */
public final class lo31 extends x3 {
    public final int A;
    public final sh21 B;
    public final View C;
    public final RoundImageView D;
    public final TextView E;
    public final TextView F;
    public final EllipsizingTextView G;
    public final ImageView H;
    public final Group I;
    public final r1s J;
    public final View K;
    public UrlPreviewBackgroundStyle L;
    public final String c;
    public final long w;
    public final View x;
    public final xav y;
    public final jcz0 z;

    public lo31(final qh21 qh21Var, String str, long j, View view, xav xavVar, jcz0 jcz0Var, int i, sh21 sh21Var) {
        super(17, qh21Var);
        this.c = str;
        this.w = j;
        this.x = view;
        this.y = xavVar;
        this.z = jcz0Var;
        this.A = i;
        this.B = sh21Var;
        View a = new iv31(e9h0.video_url_preview_container_stub, e9h0.video_url_preview_container, olh0.msg_v_url_preview_video, view).a();
        this.C = a;
        RoundImageView roundImageView = (RoundImageView) a.findViewById(e9h0.preview_image);
        this.D = roundImageView;
        ImageButton imageButton = (ImageButton) a.findViewById(e9h0.image_status_button);
        this.E = (TextView) a.findViewById(e9h0.url_host);
        TextView textView = (TextView) a.findViewById(e9h0.url_preview_title);
        this.F = textView;
        EllipsizingTextView ellipsizingTextView = (EllipsizingTextView) a.findViewById(e9h0.url_preview_content);
        this.G = ellipsizingTextView;
        ImageView imageView = (ImageView) a.findViewById(e9h0.url_video_play_button);
        this.H = imageView;
        this.I = (Group) a.findViewById(e9h0.url_video_group);
        this.J = new r1s(imageButton);
        this.K = a.findViewById(e9h0.video_url_preview_message_status);
        this.L = UrlPreviewBackgroundStyle.LowHalfCorners;
        final int i2 = 1;
        imageButton.setOnClickListener(new jo31(this, 1));
        final int i3 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: ko31
            public final /* synthetic */ lo31 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i4 = i3;
                qh21 qh21Var2 = qh21Var;
                lo31 lo31Var = this.b;
                switch (i4) {
                    case 0:
                        lo31Var.B.a(qh21Var2, UrlPreviewReporter$Element.Title);
                        lo31Var.Ug();
                        break;
                    default:
                        lo31Var.B.a(qh21Var2, UrlPreviewReporter$Element.Description);
                        lo31Var.Ug();
                        break;
                }
            }
        });
        ellipsizingTextView.setOnClickListener(new View.OnClickListener(this) { // from class: ko31
            public final /* synthetic */ lo31 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i4 = i2;
                qh21 qh21Var2 = qh21Var;
                lo31 lo31Var = this.b;
                switch (i4) {
                    case 0:
                        lo31Var.B.a(qh21Var2, UrlPreviewReporter$Element.Title);
                        lo31Var.Ug();
                        break;
                    default:
                        lo31Var.B.a(qh21Var2, UrlPreviewReporter$Element.Description);
                        lo31Var.Ug();
                        break;
                }
            }
        });
        View[] viewArr = {textView, ellipsizingTextView, imageView, roundImageView};
        while (i3 < 4) {
            viewArr[i3].setOnLongClickListener(new ly4(13, this));
            i3++;
        }
    }

    @Override // defpackage.x3
    public final void Dg() {
        xav xavVar = this.y;
        RoundImageView roundImageView = this.D;
        xavVar.c(roundImageView);
        roundImageView.setOnClickListener(null);
        this.C.setVisibility(8);
    }

    @Override // defpackage.x3
    public final View Ig() {
        return this.K;
    }

    @Override // defpackage.x3
    public final View Jg() {
        return this.C;
    }

    @Override // defpackage.x3
    public final void Rg() {
        this.y.c(this.D);
    }

    @Override // defpackage.x3
    public final void Sg(UrlPreviewBackgroundStyle urlPreviewBackgroundStyle) {
        this.L = urlPreviewBackgroundStyle;
    }

    @Override // defpackage.x3
    public final void Tg(ip31 ip31Var, z9z0 z9z0Var, Canvas canvas, boolean z, boolean z2, boolean z3) {
        View view = this.x;
        Drawable b = z9z0.b(z9z0Var, view.getContext(), this.L.a(z3, z, z2));
        int a = kjs0.a(2.0f);
        int f = ip31Var.f();
        int g = ip31Var.g();
        b.setLayoutDirection(view.getLayoutDirection());
        View view2 = this.C;
        b.setBounds(f + a, view2.getTop() + a, g - a, view2.getBottom() - a);
        b.draw(canvas);
    }

    public final void Ug() {
        Uri parse = Uri.parse(((qh21) ((ye0) this.b)).a);
        if (parse.getScheme() == null) {
            parse = parse.buildUpon().scheme(Constants.SCHEME).build();
        }
        this.z.C(parse);
    }

    public final void Vg() {
        qh21 qh21Var = (qh21) ((ye0) this.b);
        Integer num = qh21Var.x;
        Integer num2 = qh21Var.w;
        String str = qh21Var.y;
        RoundImageView roundImageView = this.D;
        if (str == null || str.length() == 0) {
            roundImageView.setVisibility(8);
            return;
        }
        if (num2 == null || num2.intValue() < 0 || num == null || num.intValue() < 0) {
            roundImageView.setVisibility(8);
            return;
        }
        int intValue = num2.intValue();
        float b = kjs0.b(256) / Math.max(intValue, r2);
        int i = (int) (intValue * b);
        int intValue2 = (int) (num.intValue() * b);
        roundImageView.setImageDrawable(new EmptyDrawable(i, intValue2));
        yn50 yn50Var = (yn50) this.y.load(str);
        xn50 xn50Var = yn50Var.b;
        xn50Var.i = i;
        xn50Var.j = intValue2;
        EmptyDrawable emptyDrawable = new EmptyDrawable(i, intValue2);
        xn50 xn50Var2 = yn50Var.b;
        xn50Var2.e = emptyDrawable;
        xn50Var2.f = true;
        yn50Var.b(roundImageView, new dnh(6, this));
        roundImageView.setTransitionName(lhv.d(ImageViewerInfo.Companion, qh21Var.y, false, null, null, null, null, null, null, null, null, 2044).getName());
        roundImageView.setOnClickListener(new jo31(this, 2));
    }

    @Override // defpackage.x3
    public final void show() {
        View view = this.C;
        view.setVisibility(0);
        view.setVisibility(0);
        qh21 qh21Var = (qh21) ((ye0) this.b);
        String str = qh21Var.b;
        String str2 = qh21Var.c;
        String str3 = qh21Var.a;
        Uri parse = Uri.parse(str3);
        if (parse.getScheme() == null) {
            parse = parse.buildUpon().scheme(Constants.SCHEME).authority(str3).build();
        }
        String host = parse.getHost();
        TextView textView = this.E;
        if (host == null) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(parse.getHost());
        }
        TextView textView2 = this.F;
        if (str == null || str.length() == 0) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView2.setText(str);
        }
        EllipsizingTextView ellipsizingTextView = this.G;
        if (str2 == null || str2.length() == 0) {
            ellipsizingTextView.setVisibility(8);
        } else {
            ellipsizingTextView.setVisibility(0);
            if (bob1.a(ellipsizingTextView, str2)) {
                ellipsizingTextView.setLastLinePadding(this.A);
                hi91.h(0, ellipsizingTextView);
            } else {
                ellipsizingTextView.setLastLinePadding(0);
                hi91.h(ellipsizingTextView.getLineHeight(), ellipsizingTextView);
            }
            ellipsizingTextView.setText(str2);
        }
        Vg();
        this.I.setVisibility(0);
        this.H.setOnClickListener(new jo31(this, 0));
    }
}
