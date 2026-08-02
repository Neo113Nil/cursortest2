package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.method.MovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.yandex.plus.core.data.common.ColorPair;
import com.yandex.plus.core.data.common.PlusColor;
import com.yandex.plus.core.data.common.PlusThemedColor;
import com.yandex.plus.core.strings.PlusSdkBrandType;
import com.yandex.plus.home.pay.PayError;
import com.yandex.plus.home.repository.api.model.webconfig.SubscriptionConfiguration;
import com.yandex.plus.ui.core.theme.PlusTheme;
import defpackage.b450;
import kotlin.a;
import kotlin.jvm.internal.PropertyReference1Impl;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class b450 {
    public static final /* synthetic */ kgx[] r = {new PropertyReference1Impl("offerTextView", 0, "getOfferTextView()Landroid/widget/TextView;", b450.class), b64.x(qoi0.a, b450.class, "offerSubTextView", "getOfferSubTextView()Landroid/widget/TextView;", 0), new PropertyReference1Impl("offerOneClickTextView", 0, "getOfferOneClickTextView()Landroid/widget/TextView;", b450.class), new PropertyReference1Impl("payButtonView", 0, "getPayButtonView()Landroid/widget/TextView;", b450.class), new PropertyReference1Impl("progressView", 0, "getProgressView()Landroid/widget/ProgressBar;", b450.class)};
    public final PlusTheme a;
    public final View b;
    public final w350 c;
    public final x350 d;
    public final lld0 e;
    public final wv5 f;
    public final wv5 g;
    public final wv5 h;
    public final wv5 i;
    public final wv5 j;
    public final i3y k;
    public final ColorStateList l;
    public final RippleDrawable m;
    public final i3y n;
    public String o;
    public h2d0 p;
    public final i3y q;

    public b450(PlusTheme plusTheme, final ViewGroup viewGroup, w350 w350Var, x350 x350Var, lld0 lld0Var, PlusSdkBrandType plusSdkBrandType) {
        this.a = plusTheme;
        this.b = viewGroup;
        this.c = w350Var;
        this.d = x350Var;
        this.e = lld0Var;
        this.f = new wv5(new sdg(viewGroup, v9h0.plus_sdk_offer_text, 26));
        this.g = new wv5(new sdg(viewGroup, v9h0.plus_sdk_offer_sub_text, 27));
        this.h = new wv5(new sdg(viewGroup, v9h0.plus_sdk_offer_one_click_text, 28));
        this.i = new wv5(new sdg(viewGroup, v9h0.plus_sdk_native_pay_button, 29));
        final int i = 0;
        this.j = new wv5(new a450(viewGroup, v9h0.plus_sdk_progress_bar, 0));
        i3y a = a.a(new sls(this) { // from class: y350
            public final /* synthetic */ b450 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                b450 b450Var = this.b;
                switch (i2) {
                    case 0:
                        return Float.valueOf(b450Var.b.getResources().getDimension(nvg0.plus_sdk_panel_default_corner_radius));
                    default:
                        return new qs90(b450Var.b);
                }
            }
        });
        this.k = a;
        ColorStateList valueOf = ColorStateList.valueOf(bb1.o(rng0.plus_sdk_panelDefaultRippleColor, viewGroup));
        this.l = valueOf;
        RippleDrawable rippleDrawable = new RippleDrawable(valueOf, msa1.o(nya1.c(plusSdkBrandType), ((Number) a.getValue()).floatValue()), null);
        this.m = rippleDrawable;
        this.n = a.a(new ah40(16));
        this.o = "";
        this.p = a(b(), null);
        final int i2 = 1;
        this.q = a.a(new sls(this) { // from class: y350
            public final /* synthetic */ b450 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                b450 b450Var = this.b;
                switch (i22) {
                    case 0:
                        return Float.valueOf(b450Var.b.getResources().getDimension(nvg0.plus_sdk_panel_default_corner_radius));
                    default:
                        return new qs90(b450Var.b);
                }
            }
        });
        bb1.L(b(), new zgv(18, this));
        b().setBackground(rippleDrawable);
        if (viewGroup.isAttachedToWindow()) {
            x350Var.b(this);
        } else {
            viewGroup.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.plus.home.feature.webviews.internal.purchase.pay.NativePayButtonViewController$special$$inlined$doOnAttach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                    viewGroup.removeOnAttachStateChangeListener(this);
                    b450 b450Var = this;
                    b450Var.d.b(b450Var);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                }
            });
        }
        if (viewGroup.isAttachedToWindow()) {
            viewGroup.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.plus.home.feature.webviews.internal.purchase.pay.NativePayButtonViewController$special$$inlined$doOnDetach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                    viewGroup.removeOnAttachStateChangeListener(this);
                    this.d.d();
                }
            });
        } else {
            x350Var.d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void e(b450 b450Var, String str, String str2, String str3, boolean z, SubscriptionConfiguration subscriptionConfiguration, boolean z2, int i) {
        int p;
        String str4;
        String noTrialText;
        PlusColor light;
        Drawable drawable;
        boolean z3 = (i & 32) != 0 ? false : z2;
        lld0 lld0Var = b450Var.e;
        wv5 wv5Var = b450Var.h;
        i3y i3yVar = b450Var.n;
        wv5 wv5Var2 = b450Var.g;
        wv5 wv5Var3 = b450Var.f;
        x350 x350Var = b450Var.d;
        View view = b450Var.b;
        PlusThemedColor<PlusColor> backgroundColor = subscriptionConfiguration.getPayInfo().getBackgroundColor();
        PlusTheme plusTheme = b450Var.a;
        PlusColor plusColor = (PlusColor) (tpd0.a(view.getContext(), plusTheme) ? backgroundColor.getDark() : backgroundColor.getLight());
        view.setBackground(plusColor != null ? s2d0.d(plusColor, rng0.plus_sdk_payBackgroundDefaultTextColor, 0.0f, 0.0f, 0.0f, 0.0f, 30) : null);
        kgx[] kgxVarArr = r;
        TextView textView = (TextView) wv5Var3.a(kgxVarArr[0]);
        ColorPair textColor = subscriptionConfiguration.getPayInfo().getTextColor();
        Context context = textView.getContext();
        int i2 = rng0.plus_sdk_payOfferDefaultTextColor;
        if (textColor != null) {
            Integer num = (Integer) (tpd0.a(context, plusTheme) ? textColor.getDark() : textColor.getLight());
            if (num != null) {
                p = num.intValue();
                ((TextView) wv5Var3.a(kgxVarArr[0])).setText(str);
                ((TextView) wv5Var3.a(kgxVarArr[0])).setTextColor(p);
                TextView textView2 = (TextView) wv5Var2.a(kgxVarArr[1]);
                String str5 = str2 != null ? "" : str2;
                SubscriptionConfiguration.PayInfo.LegalInfo legalInfo = subscriptionConfiguration.getPayInfo().getLegalInfo();
                String legalText = legalInfo == null ? legalInfo.getLegalText() : null;
                str4 = legalText != null ? "" : legalText;
                SubscriptionConfiguration.PayInfo.LegalInfo legalInfo2 = subscriptionConfiguration.getPayInfo().getLegalInfo();
                String legalUrl = legalInfo2 == null ? legalInfo2.getLegalUrl() : null;
                String str6 = legalUrl != null ? legalUrl : "";
                x350Var.getClass();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) str5);
                if (!evu0.J(str4)) {
                    spannableStringBuilder.append((CharSequence) Extension.FIX_SPACE);
                    teb1.a(spannableStringBuilder, str4, null, new ve30(24, x350Var, str6));
                }
                textView2.setText(SpannableString.valueOf(spannableStringBuilder));
                textView2.setMovementMethod((MovementMethod) i3yVar.getValue());
                ((TextView) wv5Var2.a(kgxVarArr[1])).setTextColor(lhc.f(p, ((TextView) wv5Var2.a(kgxVarArr[1])).getContext().getResources().getInteger(ljh0.plus_sdk_pay_offer_sub_text_alpha)));
                if (subscriptionConfiguration.isSilentPaymentEnabled()) {
                    ((TextView) wv5Var.a(kgxVarArr[2])).setVisibility(8);
                } else {
                    ((TextView) wv5Var.a(kgxVarArr[2])).setVisibility(0);
                    TextView textView3 = (TextView) wv5Var.a(kgxVarArr[2]);
                    SubscriptionConfiguration.PayInfo.OneClickLegalInfo oneClickLegalInfo = subscriptionConfiguration.getPayInfo().getOneClickLegalInfo();
                    int color = textView3.getContext().getColor(upg0.home_sdk_semantic_link_link);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    spannableStringBuilder2.append((CharSequence) oneClickLegalInfo.getTextBeforePlaceholder());
                    teb1.a(spannableStringBuilder2, oneClickLegalInfo.getUrlText(), Integer.valueOf(color), new ve30(25, x350Var, oneClickLegalInfo));
                    spannableStringBuilder2.append((CharSequence) oneClickLegalInfo.getTextAfterPlaceholder());
                    textView3.setText(SpannableString.valueOf(spannableStringBuilder2));
                    textView3.setMovementMethod((MovementMethod) i3yVar.getValue());
                }
                if (str3 == null) {
                    noTrialText = str3;
                } else if (z) {
                    noTrialText = subscriptionConfiguration.getPayButton().getTrialText();
                    if (noTrialText == null) {
                        noTrialText = bb1.t(((com.yandex.plus.resources.core.a) lld0Var).a(zyh0.Home_PlusPayButton_Try_Title), b450Var.b());
                    }
                } else {
                    noTrialText = subscriptionConfiguration.getPayButton().getNoTrialText();
                    if (noTrialText == null) {
                        noTrialText = bb1.t(((com.yandex.plus.resources.core.a) lld0Var).a(zyh0.Home_PlusPayButton_Subscribe_Title), b450Var.b());
                    }
                }
                b450Var.o = noTrialText;
                b450Var.b().setText(b450Var.o);
                b450Var.p = b450Var.a(b450Var.b(), subscriptionConfiguration.getPayButton().getTextColor());
                aob1.c(b450Var.b(), b450Var.p, new ej40(8));
                TextView b = b450Var.b();
                PlusThemedColor<PlusColor> backgroundColor2 = subscriptionConfiguration.getPayButton().getBackgroundColor();
                if (tpd0.a(b450Var.b().getContext(), plusTheme)) {
                    if (backgroundColor2 != null) {
                        light = backgroundColor2.getLight();
                    }
                    light = null;
                } else {
                    if (backgroundColor2 != null) {
                        light = backgroundColor2.getDark();
                    }
                    light = null;
                }
                if (light == null) {
                    float floatValue = ((Number) b450Var.k.getValue()).floatValue();
                    drawable = s2d0.a(light, floatValue, floatValue, floatValue, floatValue);
                } else {
                    drawable = b450Var.m;
                }
                b.setBackground(new RippleDrawable(b450Var.l, drawable, null));
                ((qs90) b450Var.q.getValue()).a();
                b450Var.d(z3);
            }
        }
        p = vng.p(i2, context);
        ((TextView) wv5Var3.a(kgxVarArr[0])).setText(str);
        ((TextView) wv5Var3.a(kgxVarArr[0])).setTextColor(p);
        TextView textView22 = (TextView) wv5Var2.a(kgxVarArr[1]);
        if (str2 != null) {
        }
        SubscriptionConfiguration.PayInfo.LegalInfo legalInfo3 = subscriptionConfiguration.getPayInfo().getLegalInfo();
        if (legalInfo3 == null) {
        }
        if (legalText != null) {
        }
        SubscriptionConfiguration.PayInfo.LegalInfo legalInfo22 = subscriptionConfiguration.getPayInfo().getLegalInfo();
        if (legalInfo22 == null) {
        }
        if (legalUrl != null) {
        }
        x350Var.getClass();
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) str5);
        if (!evu0.J(str4)) {
        }
        textView22.setText(SpannableString.valueOf(spannableStringBuilder3));
        textView22.setMovementMethod((MovementMethod) i3yVar.getValue());
        ((TextView) wv5Var2.a(kgxVarArr[1])).setTextColor(lhc.f(p, ((TextView) wv5Var2.a(kgxVarArr[1])).getContext().getResources().getInteger(ljh0.plus_sdk_pay_offer_sub_text_alpha)));
        if (subscriptionConfiguration.isSilentPaymentEnabled()) {
        }
        if (str3 == null) {
        }
        b450Var.o = noTrialText;
        b450Var.b().setText(b450Var.o);
        b450Var.p = b450Var.a(b450Var.b(), subscriptionConfiguration.getPayButton().getTextColor());
        aob1.c(b450Var.b(), b450Var.p, new ej40(8));
        TextView b2 = b450Var.b();
        PlusThemedColor<PlusColor> backgroundColor22 = subscriptionConfiguration.getPayButton().getBackgroundColor();
        if (tpd0.a(b450Var.b().getContext(), plusTheme)) {
        }
        if (light == null) {
        }
        b2.setBackground(new RippleDrawable(b450Var.l, drawable, null));
        ((qs90) b450Var.q.getValue()).a();
        b450Var.d(z3);
    }

    public final h2d0 a(TextView textView, PlusThemedColor plusThemedColor) {
        if (plusThemedColor != null) {
            PlusColor plusColor = (PlusColor) (tpd0.a(textView.getRootView().getContext(), this.a) ? plusThemedColor.getDark() : plusThemedColor.getLight());
            h2d0 f2d0Var = plusColor instanceof PlusColor.Color ? new f2d0(((PlusColor.Color) plusColor).getColor()) : plusColor instanceof PlusColor.Gradient ? new g2d0(s2d0.c(((PlusColor.Gradient) plusColor).getGradients())) : null;
            if (f2d0Var != null) {
                return f2d0Var;
            }
        }
        return new f2d0(vng.p(rng0.plus_sdk_payButtonDefaultTextColor, textView.getContext()));
    }

    public final TextView b() {
        return (TextView) this.i.a(r[3]);
    }

    public final String c(PayError payError) {
        int i = z350.a[payError.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return this.o;
            }
            w511.b();
            return null;
        }
        StringBuilder sb = new StringBuilder();
        TextView b = b();
        int i2 = zyh0.Home_PlusPayButton_Error_WentWrong_Title;
        lld0 lld0Var = this.e;
        sb.append(bb1.t(((com.yandex.plus.resources.core.a) lld0Var).a(i2), b));
        sb.append('\n');
        sb.append(bb1.t(((com.yandex.plus.resources.core.a) lld0Var).a(zyh0.Home_PlusPayButton_Error_WentWrong_Subtitle), b()));
        return sb.toString();
    }

    public final void d(boolean z) {
        ((ProgressBar) this.j.a(r[4])).setVisibility(z ? 0 : 8);
        b().setEnabled(!z);
        aob1.c(b(), z ? new f2d0(bb1.o(rng0.plus_sdk_transparentColor, b())) : this.p, new ej40(8));
    }
}
