package defpackage;

import android.graphics.Outline;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.messaging.ui.pollinfo.PollInfoActivity;
import com.ybsdk.core.design.spoiler.SpoilerTextView;
import com.ybsdk.feature.qr.payments.internal.screens.presentation.view.SubscriptionWidgetView;
import com.ybsdk.widgets.common.checkbox.CheckBoxView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.yandex.taxi.logistics.sdk.postcard.presentation.ui.a;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes3.dex */
public final /* synthetic */ class g990 implements wls {
    public final /* synthetic */ int a;

    public /* synthetic */ g990(int i) {
        this.a = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        n751 applyInsets$lambda$3;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                return wz51.o(((LayoutInflater) obj).inflate(nnh0.ybsdk_item_paging_loading, (ViewGroup) obj2, false));
            case 1:
                return Integer.valueOf(((wh21) obj).a - ((wh21) obj2).a);
            case 2:
                View view = (View) obj;
                ((Outline) obj2).setRoundRect(0, -gm90.b, view.getWidth(), view.getHeight(), gm90.a);
                return zy11Var;
            case 3:
                ((Integer) obj2).getClass();
                tka0.a((fid) obj, vng.O(1));
                return zy11Var;
            case 4:
                ((Integer) obj2).getClass();
                tka0.a((fid) obj, vng.O(1));
                return zy11Var;
            case 5:
                ((Integer) obj2).getClass();
                tka0.b((fid) obj, vng.O(1));
                return zy11Var;
            case 6:
                sva0 sva0Var = (sva0) obj2;
                if (sva0Var == null) {
                    sva0Var = new sva0();
                }
                sva0Var.a = Long.valueOf(System.nanoTime());
                sva0Var.f = true;
                return sva0Var;
            case 7:
                sva0 sva0Var2 = (sva0) obj2;
                sva0Var2.i = true;
                return sva0Var2;
            case 8:
                View inflate = ((LayoutInflater) obj).inflate(unh0.ybsdk_pfm_categories_shimmer, (ViewGroup) obj2, false);
                if (inflate != null) {
                    return new b461((ShimmerFrameLayout) inflate);
                }
                ny61.t("rootView");
                return null;
            case 9:
                View inflate2 = ((LayoutInflater) obj).inflate(unh0.ybsdk_item_pfm_filter_bottom_sheet_content_toggleable, (ViewGroup) obj2, false);
                int i2 = lbh0.settingTitle;
                TextView textView = (TextView) cma1.O(i2, inflate2);
                if (textView != null) {
                    i2 = lbh0.settingToggle;
                    SwitchCompat switchCompat = (SwitchCompat) cma1.O(i2, inflate2);
                    if (switchCompat != null) {
                        l261 l261Var = new l261((ConstraintLayout) inflate2, textView, switchCompat);
                        gjb1.d(switchCompat);
                        switchCompat.setSaveEnabled(false);
                        return l261Var;
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i2)));
                return null;
            case 10:
                View inflate3 = ((LayoutInflater) obj).inflate(unh0.ybsdk_item_pfm_filter_bottom_sheet_content_selectable, (ViewGroup) obj2, false);
                int i3 = lbh0.itemCheckbox;
                CheckBoxView checkBoxView = (CheckBoxView) cma1.O(i3, inflate3);
                if (checkBoxView != null) {
                    i3 = lbh0.itemIcon;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i3, inflate3);
                    if (appCompatImageView != null) {
                        i3 = lbh0.itemSubtitle;
                        TextView textView2 = (TextView) cma1.O(i3, inflate3);
                        if (textView2 != null) {
                            i3 = lbh0.itemSubtitleAmount;
                            SpoilerTextView spoilerTextView = (SpoilerTextView) cma1.O(i3, inflate3);
                            if (spoilerTextView != null) {
                                i3 = lbh0.itemSubtitleHolder;
                                FrameLayout frameLayout = (FrameLayout) cma1.O(i3, inflate3);
                                if (frameLayout != null) {
                                    i3 = lbh0.itemTitle;
                                    TextView textView3 = (TextView) cma1.O(i3, inflate3);
                                    if (textView3 != null) {
                                        return new k261((ConstraintLayout) inflate3, checkBoxView, appCompatImageView, textView2, spoilerTextView, frameLayout, textView3);
                                    }
                                }
                            }
                        }
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate3.getResources().getResourceName(i3)));
                return null;
            case 11:
                View inflate4 = ((LayoutInflater) obj).inflate(unh0.ybsdk_item_pfm_filter, (ViewGroup) obj2, false);
                ConstraintLayout constraintLayout = (ConstraintLayout) inflate4;
                int i4 = lbh0.pfmFilterCardIconStart;
                ImageView imageView = (ImageView) cma1.O(i4, inflate4);
                if (imageView != null) {
                    i4 = lbh0.pfmFilterIconEnd;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) cma1.O(i4, inflate4);
                    if (appCompatImageView2 != null) {
                        i4 = lbh0.pfmFilterTitle;
                        TextView textView4 = (TextView) cma1.O(i4, inflate4);
                        if (textView4 != null) {
                            return new j261(constraintLayout, imageView, appCompatImageView2, textView4);
                        }
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate4.getResources().getResourceName(i4)));
                return null;
            case 12:
                View inflate5 = ((LayoutInflater) obj).inflate(unh0.ybsdk_pfm_filters_shimmer, (ViewGroup) obj2, false);
                if (inflate5 != null) {
                    return new d461((ShimmerFrameLayout) inflate5);
                }
                ny61.t("rootView");
                return null;
            case 13:
                ((Integer) obj).getClass();
                return ((mkb0) obj2).getId();
            case 14:
                return Boolean.valueOf(jl40.l(((pv0) obj).a.B(), ((pv0) obj2).a.B()));
            case 15:
                applyInsets$lambda$3 = PollInfoActivity.applyInsets$lambda$3((View) obj, (n751) obj2);
                return applyInsets$lambda$3;
            case 16:
                return sb2.K(300, 0, null, 6);
            case 17:
                ((Integer) obj2).getClass();
                a.e((fid) obj, vng.O(1));
                return zy11Var;
            case 18:
                fnx0 fnx0Var = (fnx0) obj;
                fnx0 fnx0Var2 = (fnx0) obj2;
                return Boolean.valueOf(fnx0Var.b(fnx0Var2) && fnx0Var.c.u0 == fnx0Var2.c.u0);
            case 19:
                return Integer.valueOf(((c72) obj2).a.length() - ((c72) obj).a.length());
            case 20:
                ((Integer) obj2).getClass();
                f4f0.a((fid) obj, vng.O(1));
                return zy11Var;
            case 21:
                eaf0 eaf0Var = (eaf0) obj2;
                return Boolean.valueOf(!eaf0Var.d && eaf0Var.equals((eaf0) obj));
            case 22:
                return new b0b(j9e0.o((LayoutInflater) obj, (ViewGroup) obj2), 9);
            case 23:
                return Boolean.valueOf(((zs7) obj).a() == ((zs7) obj2).a());
            case 24:
                View inflate6 = ((LayoutInflater) obj).inflate(znh0.ybsdk_qr_payments_subscription_widget_wrapper, (ViewGroup) obj2, false);
                if (inflate6 == null) {
                    ny61.t("rootView");
                    return null;
                }
                SubscriptionWidgetView subscriptionWidgetView = (SubscriptionWidgetView) inflate6;
                v461 v461Var = new v461(subscriptionWidgetView);
                ViewGroup.LayoutParams layoutParams = subscriptionWidgetView.getLayoutParams();
                if (layoutParams == null) {
                    ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = rje.d(hwg0.ybsdk_qr_payments_subscription_widget_top_margin_size, sm91.c(v461Var));
                subscriptionWidgetView.setLayoutParams(marginLayoutParams);
                return v461Var;
            case 25:
                ((Integer) obj).getClass();
                ((Boolean) obj2).getClass();
                return zy11Var;
            case 26:
                zii0 zii0Var = (zii0) obj;
                float f = zii0Var.b;
                float f2 = zii0Var.d;
                float intBitsToFloat = Float.intBitsToFloat((int) (((zii0) obj2).c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                return Boolean.valueOf(intBitsToFloat >= f && intBitsToFloat < f2);
            case 27:
                zii0 zii0Var2 = (zii0) obj;
                float f3 = zii0Var2.a;
                float f4 = zii0Var2.c;
                float intBitsToFloat2 = Float.intBitsToFloat((int) (((zii0) obj2).c() >> 32));
                return Boolean.valueOf(intBitsToFloat2 >= f3 && intBitsToFloat2 < f4);
            case 28:
                return Boolean.valueOf(((fnx0) obj).a((fnx0) obj2));
            default:
                View inflate7 = ((LayoutInflater) obj).inflate(krh0.item_detail_block_header, (ViewGroup) obj2, false);
                if (inflate7 != null) {
                    return new b0b(new i1x((RobotoTextView) inflate7), 10);
                }
                ny61.t("rootView");
                return null;
        }
    }

    public /* synthetic */ g990(int i, int i2) {
        this.a = i2;
    }
}
