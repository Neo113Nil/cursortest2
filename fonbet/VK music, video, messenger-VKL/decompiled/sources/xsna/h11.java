package xsna;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StrikethroughSpan;
import android.view.View;
import android.widget.TextView;
import com.my.target.nativeads.views.MediaAdView;
import com.vk.core.view.components.button.VkButton;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.DisclaimerData;
import java.util.Currency;
import xsna.v4e0;

/* compiled from: AdsNativeCarouselCardHolder.kt */
/* loaded from: classes4.dex */
public final class h11 extends vif0<v4e0.a> implements v4e0 {
    public final a1y n;
    public final View o;
    public final MediaAdView p;
    public final TextView q;
    public final TextView r;
    public final TextView s;
    public final TextView t;
    public final VkButton u;
    public final uy9 v;

    public h11(Context context, a1y a1yVar) {
        super(R.layout.news_native_ad_card_item, context);
        this.n = a1yVar;
        this.o = this.itemView.findViewById(R.id.media_view_card);
        this.p = (MediaAdView) this.itemView.findViewById(R.id.media_view_item);
        this.q = (TextView) this.itemView.findViewById(R.id.discount);
        this.r = (TextView) this.itemView.findViewById(R.id.price);
        this.s = (TextView) this.itemView.findViewById(R.id.title);
        this.t = (TextView) this.itemView.findViewById(R.id.old_price);
        VkButton vkButton = (VkButton) this.itemView.findViewById(R.id.button);
        this.u = vkButton;
        this.v = new uy9();
        vkButton.setBackgroundTint(R.attr.vk_ui_background_contrast_themed);
        vkButton.setTextTint(R.attr.vk_ui_text_primary);
    }

    @Override // xsna.v4e0
    public final void Y3(uzb uzbVar) {
        this.u.setOnClickListener(uzbVar);
    }

    @Override // xsna.v4e0
    public final View getView() {
        return this.itemView;
    }

    @Override // xsna.vif0
    public final void i6(v4e0.a aVar) {
        w3(aVar);
    }

    @Override // xsna.v4e0
    public final MediaAdView o() {
        return this.p;
    }

    @Override // xsna.v4e0
    public final void w3(v4e0.a aVar) {
        String str;
        g11 g11Var = (g11) this.n.c;
        boolean z = g11Var.h;
        DisclaimerData disclaimerData = g11Var.g;
        View view = this.itemView;
        StringBuilder sb = new StringBuilder();
        sb.setLength(0);
        String e = myc0.f(aVar.e()) ? aVar.e() : aVar.c();
        String g = aVar.g();
        if (g == null) {
            g = "";
        }
        sb.append(g);
        sb.append(e);
        if (disclaimerData != null) {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            sb.append(di60.m(disclaimerData, context));
        }
        view.setContentDescription(sb.toString());
        String a = aVar.a();
        VkButton vkButton = this.u;
        vkButton.setText(a);
        vkButton.setContentDescription(a);
        this.o.setBackgroundResource(R.drawable.bg_native_ad_card_rounded);
        String d = aVar.d();
        String b = aVar.b();
        String f = aVar.f();
        String e2 = aVar.e();
        TextView textView = this.t;
        TextView textView2 = this.s;
        TextView textView3 = this.r;
        if (f == null || !myc0.f(f) || b == null) {
            textView2.setText(aVar.c());
            textView3.setEllipsize(TextUtils.TruncateAt.END);
            textView3.setText(aVar.g());
            textView.setText("");
        } else {
            double parseLong = Long.parseLong(f) / 100.0d;
            uy9 uy9Var = this.v;
            String obj = uy9Var.b(parseLong, b, true).toString();
            textView2.setText(aVar.g());
            textView3.setEllipsize(null);
            if (e2 == null || !myc0.f(e2)) {
                textView3.setText(obj);
                textView.setText("");
            } else {
                String b2 = uy9Var.b(Long.parseLong(e2) / 100.0d, b, true);
                SpannableString valueOf = SpannableString.valueOf(b2);
                valueOf.setSpan(new StrikethroughSpan(), 0, b2.length(), 33);
                if (b.equals("RUB")) {
                    str = brm0.y(obj, "₽", "");
                } else {
                    try {
                        obj = brm0.y(obj, Currency.getInstance(b).getSymbol(), "");
                    } catch (Exception unused) {
                    }
                    str = obj;
                }
                textView3.setText(drm0.p0(str).toString());
                textView.setText(valueOf);
            }
        }
        TextView textView4 = this.q;
        if (d != null) {
            textView4.setText(d);
            textView4.setVisibility(0);
        } else {
            textView4.setVisibility(8);
        }
        if (!z) {
            textView3.setVisibility(0);
            textView2.setVisibility(0);
            return;
        }
        if (textView3.getText().length() == 0) {
            textView3.setVisibility(8);
        } else {
            textView3.setVisibility(0);
        }
        if (textView2.getText().length() == 0) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
        }
    }
}
