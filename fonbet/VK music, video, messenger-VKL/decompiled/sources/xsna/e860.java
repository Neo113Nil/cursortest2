package xsna;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.bottomsheet.internal.e;
import com.vk.core.ui.image.VKImageController;
import com.vk.core.ui.themes.VKReplacerView;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.external.miniapp.net.personal.BannerType;
import com.vk.superapp.api.dto.user.WebUserShortInfo;
import com.vk.superapp.base.js.bridge.data.PersonalDiscountDialogType;
import com.vk.superapp.browser.internal.ui.time.StaticTimerView;
import com.vk.superapp.browser.ui.discount.NewPersonalDiscountModalBottomSheet$removeLinksUnderline$1;
import com.vk.superapp.navigation.api.VkBridgeAnalytics;
import com.vkontakte.android.R;
import java.util.NoSuchElementException;
import xsna.dw20;
import xsna.e860;

/* compiled from: NewPersonalDiscountModalBottomSheet.kt */
/* loaded from: classes6.dex */
public final class e860 extends dw20 {
    public static final /* synthetic */ int z1 = 0;
    public VKReplacerView f1;
    public TextView g1;
    public View h1;
    public View i1;
    public StaticTimerView j1;
    public TextView k1;
    public TextView l1;
    public TextView m1;
    public boolean n1;
    public final io.reactivex.rxjava3.disposables.b o1 = new io.reactivex.rxjava3.disposables.b();
    public boolean p1;
    public ImageView q1;
    public ImageView r1;
    public FrameLayout s1;
    public r1a0 t1;
    public s1a0 u1;
    public q1a0 v1;
    public PersonalDiscountDialogType w1;
    public long x1;
    public VkBridgeAnalytics.PersonalDiscountExitReason y1;

    /* compiled from: NewPersonalDiscountModalBottomSheet.kt */
    public static final class a extends dw20.b {
        public final fvv0 e;
        public final q1a0 f;
        public final PersonalDiscountDialogType g;
        public final r1a0 h;
        public final s1a0 i;

        public a(Context context, fvv0 fvv0Var, q1a0 q1a0Var, PersonalDiscountDialogType personalDiscountDialogType, r1a0 r1a0Var, s1a0 s1a0Var) {
            super(context, null);
            this.e = fvv0Var;
            this.f = q1a0Var;
            this.g = personalDiscountDialogType;
            this.h = r1a0Var;
            this.i = s1a0Var;
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            View inflate = LayoutInflater.from(this.c).inflate(R.layout.vk_personal_discount_new_view, (ViewGroup) null, false);
            D0(inflate, false);
            c(new b(inflate));
            l(e3m.f(R.attr.vk_ui_background_content, this.c));
            J();
            F0(true);
            x(0);
            u(iah0.a(28));
            u080 u080Var = new u080() { // from class: xsna.d860
                @Override // xsna.u080
                public final bqx0 b(View view, bqx0 bqx0Var) {
                    e860.a aVar = e860.a.this;
                    return (aVar.e.t().f() && iah0.r(aVar.c)) ? bqx0.b : bqx0Var;
                }
            };
            e.a aVar = this.d;
            aVar.d1 = u080Var;
            if (this.e.t().f()) {
                aVar.B = true;
                if (!iah0.o(this.c)) {
                    aVar.A = true;
                }
            }
            e860 e860Var = new e860();
            e860Var.v1 = this.f;
            e860Var.w1 = this.g;
            e860Var.t1 = this.h;
            e860Var.u1 = this.i;
            return e860Var;
        }
    }

    /* compiled from: NewPersonalDiscountModalBottomSheet.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PersonalDiscountDialogType.values().length];
            try {
                iArr[PersonalDiscountDialogType.GIFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PersonalDiscountDialogType.IMAGE_LARGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final void Yn(q1a0 q1a0Var) {
        WebImage webImage;
        WebImageSize d;
        if (q1a0Var == null) {
            return;
        }
        ifx0 ifx0Var = e370.c;
        String str = null;
        if (ifx0Var == null) {
            ifx0Var = null;
        }
        VKImageController<View> create = ifx0Var.b().create(requireContext());
        VKReplacerView vKReplacerView = this.f1;
        if (vKReplacerView == null) {
            vKReplacerView = null;
        }
        vKReplacerView.a(((com.vk.core.ui.image.c) create).getView());
        WebUserShortInfo webUserShortInfo = q1a0Var.d;
        if (webUserShortInfo != null && (webImage = webUserShortInfo.h) != null && (d = webImage.d()) != null) {
            str = d.b;
        }
        create.f(str, new VKImageController.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, true, R.drawable.vk_circle_placeholder, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, null, null, null, 65515));
    }

    public final void Zn(b33 b33Var) {
        String str;
        l1a0 l1a0Var;
        TextView textView = (TextView) LayoutInflater.from(mo2getContext()).inflate(R.layout.vk_personal_discount_subhead_simple, (ViewGroup) b33Var.findViewById(R.id.personal_discount_new_subhead_container), true).findViewById(R.id.personal_discount_new_simple_text_view);
        q1a0 q1a0Var = this.v1;
        if (q1a0Var == null || (l1a0Var = q1a0Var.b) == null || (str = l1a0Var.e) == null) {
            str = "";
        }
        textView.setText(str);
    }

    public final void ao() {
        ImageView imageView;
        FrameLayout frameLayout;
        boolean r = iah0.r(requireContext());
        ImageView imageView2 = this.q1;
        if (imageView2 == null || (imageView = this.r1) == null || (frameLayout = this.s1) == null) {
            return;
        }
        imageView2.setVisibility(!r ? 0 : 8);
        imageView.setVisibility(r ? 0 : 8);
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            return;
        }
        layoutParams2.topMargin = iah0.a(r ? 20 : 5);
        layoutParams2.bottomMargin = iah0.a(r ? 20 : 5);
        frameLayout.setLayoutParams(layoutParams2);
    }

    @Override // xsna.dw20, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ao();
    }

    @Override // xsna.dw20, xsna.dh6, androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        l1a0 l1a0Var;
        l1a0 l1a0Var2;
        super.onDismiss(dialogInterface);
        this.o1.dispose();
        q1a0 q1a0Var = this.v1;
        boolean z = false;
        boolean z2 = (q1a0Var == null || this.p1 || this.n1) ? false : true;
        if (q1a0Var != null && !this.p1) {
            z = true;
        }
        r1a0 r1a0Var = this.t1;
        BannerType bannerType = null;
        if (r1a0Var != null) {
            r1a0Var.a(z2, new f4v(z, (q1a0Var == null || (l1a0Var2 = q1a0Var.b) == null) ? null : l1a0Var2.d));
        }
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.x1) / 1000);
        VkBridgeAnalytics.PersonalDiscountExitReason personalDiscountExitReason = this.y1;
        if (personalDiscountExitReason == null) {
            personalDiscountExitReason = VkBridgeAnalytics.PersonalDiscountExitReason.SWIPE_DOWN;
        }
        s1a0 s1a0Var = this.u1;
        if (s1a0Var != null) {
            q1a0 q1a0Var2 = this.v1;
            Integer valueOf = q1a0Var2 != null ? Integer.valueOf(q1a0Var2.a) : null;
            q1a0 q1a0Var3 = this.v1;
            if (q1a0Var3 != null && (l1a0Var = q1a0Var3.b) != null) {
                bannerType = l1a0Var.d;
            }
            s1a0Var.a(personalDiscountExitReason, currentTimeMillis, valueOf, bannerType);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.dw20, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        String str;
        l1a0 l1a0Var;
        l1a0 l1a0Var2;
        l1a0 l1a0Var3;
        this.x1 = System.currentTimeMillis();
        q0o0 q0o0Var = this instanceof q0o0 ? (q0o0) this : null;
        prw.h(this, q0o0Var != null ? q0o0Var.tag() : "VkSdkDialogFragment", null);
        Dialog yn = super.yn(bundle);
        FrameLayout frameLayout = (FrameLayout) yn.findViewById(R.id.personal_discount_new_head_container);
        PersonalDiscountDialogType personalDiscountDialogType = this.w1;
        int i = personalDiscountDialogType == null ? -1 : c.$EnumSwitchMapping$0[personalDiscountDialogType.ordinal()];
        if (i == 1) {
            View inflate = LayoutInflater.from(mo2getContext()).inflate(R.layout.vk_personal_discount_head_gift, (ViewGroup) frameLayout, true);
            this.q1 = (ImageView) inflate.findViewById(R.id.personal_discount_new_gift_portrait);
            this.r1 = (ImageView) inflate.findViewById(R.id.personal_discount_new_gift_landscape);
            this.s1 = (FrameLayout) inflate.findViewById(R.id.personal_discount_new_gift_container);
            ao();
            Zn((b33) yn);
        } else if (i != 2) {
            this.f1 = (VKReplacerView) LayoutInflater.from(mo2getContext()).inflate(R.layout.vk_personal_discount_head_image, (ViewGroup) frameLayout, true).findViewById(R.id.personal_discount_new_user_avatar_view);
            Yn(this.v1);
            View inflate2 = LayoutInflater.from(mo2getContext()).inflate(R.layout.vk_personal_discount_subhead_panel, (ViewGroup) yn.findViewById(R.id.personal_discount_new_subhead_container), true);
            TextView textView = (TextView) inflate2.findViewById(R.id.personal_discount_panel_new_title_view);
            q1a0 q1a0Var = this.v1;
            textView.setText((q1a0Var == null || (l1a0Var3 = q1a0Var.b) == null) ? null : l1a0Var3.c);
            TextView textView2 = (TextView) inflate2.findViewById(R.id.personal_discount_panel_new_subtitle_view);
            q1a0 q1a0Var2 = this.v1;
            textView2.setText((q1a0Var2 == null || (l1a0Var2 = q1a0Var2.b) == null) ? null : l1a0Var2.e);
        } else {
            LayoutInflater.from(mo2getContext()).inflate(R.layout.vk_personal_discount_head_image_large, (ViewGroup) frameLayout, true);
            this.f1 = (VKReplacerView) frameLayout.findViewById(R.id.personal_discount_new_user_avatar_large_view);
            Yn(this.v1);
            Zn((b33) yn);
        }
        this.g1 = (TextView) yn.findViewById(R.id.personal_discount_new_title_view);
        this.h1 = yn.findViewById(R.id.personal_discount_new_actual_time_view);
        this.j1 = (StaticTimerView) yn.findViewById(R.id.personal_discount_new_time_view);
        this.k1 = (TextView) yn.findViewById(R.id.personal_discount_new_positive_view);
        this.l1 = (TextView) yn.findViewById(R.id.personal_discount_new_negative_view);
        this.m1 = (TextView) yn.findViewById(R.id.personal_discount_new_rules_view);
        this.i1 = yn.findViewById(R.id.personal_discount_new_close_button);
        q1a0 q1a0Var3 = this.v1;
        if (q1a0Var3 == null) {
            return yn;
        }
        TextView textView3 = this.g1;
        if (textView3 == null) {
            textView3 = null;
        }
        l1a0 l1a0Var4 = q1a0Var3.b;
        if (l1a0Var4 == null || (str = l1a0Var4.c) == null) {
            str = "";
        }
        textView3.setText(str);
        if (this.w1 == PersonalDiscountDialogType.IMAGE) {
            TextView textView4 = this.g1;
            if (textView4 == null) {
                textView4 = null;
            }
            textView4.setTextAppearance(R.style.VkUiTypography_Title2);
        } else {
            TextView textView5 = this.g1;
            if (textView5 == null) {
                textView5 = null;
            }
            textView5.setTextAppearance(R.style.VkUiTypography_DisplayTitle1SemiBold);
        }
        q1a0 q1a0Var4 = this.v1;
        String str2 = (q1a0Var4 == null || (l1a0Var = q1a0Var4.b) == null) ? null : l1a0Var.f;
        if (str2 == null) {
            TextView textView6 = this.m1;
            if (textView6 == null) {
                textView6 = null;
            }
            textView6.setVisibility(8);
        } else {
            TextView textView7 = this.m1;
            if (textView7 == null) {
                textView7 = null;
            }
            textView7.setMovementMethod(LinkMovementMethod.getInstance());
            TextView textView8 = this.m1;
            if (textView8 == null) {
                textView8 = null;
            }
            SpannableString spannableString = new SpannableString(textView8.getText());
            Object[] spans = spannableString.getSpans(0, spannableString.length(), URLSpan.class);
            int i2 = 0;
            while (i2 < spans.length) {
                int i3 = i2 + 1;
                try {
                    URLSpan uRLSpan = (URLSpan) spans[i2];
                    spannableString.setSpan(new NewPersonalDiscountModalBottomSheet$removeLinksUnderline$1(uRLSpan.getURL()), spannableString.getSpanStart(uRLSpan), spannableString.getSpanEnd(uRLSpan), 0);
                    i2 = i3;
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw new NoSuchElementException(e.getMessage());
                }
            }
            textView8.setText(spannableString);
            TextView textView9 = this.m1;
            if (textView9 == null) {
                textView9 = null;
            }
            jjc.g(textView9, new mp3(22, this, str2));
        }
        q1a0 q1a0Var5 = this.v1;
        Integer valueOf = q1a0Var5 != null ? Integer.valueOf(q1a0Var5.c) : null;
        if (valueOf == null) {
            StaticTimerView staticTimerView = this.j1;
            if (staticTimerView == null) {
                staticTimerView = null;
            }
            staticTimerView.setVisibility(8);
            View view = this.h1;
            if (view == null) {
                view = null;
            }
            view.setVisibility(8);
        } else {
            StaticTimerView staticTimerView2 = this.j1;
            if (staticTimerView2 == null) {
                staticTimerView2 = null;
            }
            staticTimerView2.P4(valueOf.intValue());
        }
        TextView textView10 = this.k1;
        if (textView10 == null) {
            textView10 = null;
        }
        jjc.g(textView10, new qw30(this, 5));
        TextView textView11 = this.l1;
        if (textView11 == null) {
            textView11 = null;
        }
        jjc.g(textView11, new ebx(this, 13));
        View view2 = this.i1;
        jjc.g(view2 != null ? view2 : null, new dn20(this, 8));
        return yn;
    }

    /* compiled from: NewPersonalDiscountModalBottomSheet.kt */
    public static final class b extends com.vk.core.ui.bottomsheet.internal.b {
        public final View a;
        public final boolean b = true;

        public b(View view) {
            this.a = view;
        }

        @Override // com.vk.core.ui.bottomsheet.internal.b
        public final boolean b() {
            return this.b;
        }

        @Override // com.vk.core.ui.bottomsheet.internal.b
        public final int d(int i, int i2, int i3) {
            return i2 - i;
        }

        @Override // com.vk.core.ui.bottomsheet.internal.b
        public final int c(int i, int i2, int i3) {
            return i;
        }
    }
}
