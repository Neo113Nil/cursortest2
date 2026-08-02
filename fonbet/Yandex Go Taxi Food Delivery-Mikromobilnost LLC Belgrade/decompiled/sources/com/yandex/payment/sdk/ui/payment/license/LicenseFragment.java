package com.yandex.payment.sdk.ui.payment.license;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.yandex.payment.sdk.core.data.Acquirer;
import com.yandex.payment.sdk.core.data.MerchantAddress;
import com.yandex.payment.sdk.core.data.MerchantInfo;
import com.yandex.payment.sdk.ui.ViewBindingActivityImpl;
import com.yandex.payment.sdk.ui.payment.license.LicenseFragment;
import com.yandex.payment.sdk.ui.view.HeaderView;
import com.yandex.payment.sdk.ui.view.payment.PaymentButtonView;
import defpackage.bqr0;
import defpackage.c950;
import defpackage.cma1;
import defpackage.dpb1;
import defpackage.es31;
import defpackage.evu0;
import defpackage.fx90;
import defpackage.i3y;
import defpackage.iob1;
import defpackage.j9h0;
import defpackage.jx90;
import defpackage.k4o;
import defpackage.lng0;
import defpackage.n891;
import defpackage.ny61;
import defpackage.ogb1;
import defpackage.p7u;
import defpackage.pwf;
import defpackage.qoi0;
import defpackage.qpa0;
import defpackage.qv90;
import defpackage.rlh0;
import defpackage.rwo;
import defpackage.ryh0;
import defpackage.sls;
import defpackage.sv90;
import defpackage.w511;
import defpackage.wy4;
import defpackage.xcy;
import defpackage.y22;
import defpackage.y8f;
import defpackage.y8h;
import defpackage.zcy;
import defpackage.zdz;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 %2\u00020\u00012\u00020\u0002:\u0003&'(B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u0004J-\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u001eR\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006)"}, d2 = {"Lcom/yandex/payment/sdk/ui/payment/license/LicenseFragment;", "Landroidx/fragment/app/Fragment;", "Lzcy;", "<init>", "()V", "", "debrandingEnabled", "()Z", "Lzy11;", "setupSbpText", "setupGeneralText", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lxcy;", "callbacks", "setCallback", "(Lxcy;)V", "Lqpa0;", "viewBinding", "Lqpa0;", "Lxcy;", "Lbqr0;", "activityViewModel$delegate", "Li3y;", "getActivityViewModel", "()Lbqr0;", "activityViewModel", "Companion", "CustomURLSpan", "LicenseType", "com/yandex/payment/sdk/ui/payment/license/a", "paymentsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LicenseFragment extends Fragment implements zcy {
    private static final String ARG_ACQUIRER = "ARG_ACQUIRER";
    private static final String ARG_LICENSE_URL = "ARG_LICENSE_URL";
    private static final String ARG_MERCHANT_INFO = "ARG_MERCHANT_INFO";
    private static final String ARG_TYPE = "ARG_TYPE";
    public static final a Companion = new a();
    private static final String confidentialLink = "https://yandex.ru/legal/confidential";
    private static final String payLink = "https://yandex.ru/legal/pay_termsofuse";
    private static final String payerLink = "https://yandex.ru/legal/payer_termsofuse";

    /* renamed from: activityViewModel$delegate, reason: from kotlin metadata */
    private final i3y activityViewModel = new es31(qoi0.a(bqr0.class), new sls(this) { // from class: com.yandex.payment.sdk.ui.payment.license.LicenseFragment$special$$inlined$activityViewModels$default$1
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
            this.$this_activityViewModels = this;
        }

        @Override // defpackage.sls
        public final Object invoke() {
            return this.$this_activityViewModels.requireActivity().getViewModelStore();
        }
    }, new sls(this) { // from class: com.yandex.payment.sdk.ui.payment.license.LicenseFragment$special$$inlined$activityViewModels$default$3
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
            this.$this_activityViewModels = this;
        }

        @Override // defpackage.sls
        public final Object invoke() {
            return this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
        }
    }, new sls(this) { // from class: com.yandex.payment.sdk.ui.payment.license.LicenseFragment$special$$inlined$activityViewModels$default$2
        final /* synthetic */ sls $extrasProducer = null;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
            this.$this_activityViewModels = this;
        }

        @Override // defpackage.sls
        public final Object invoke() {
            y8f y8fVar;
            sls slsVar = this.$extrasProducer;
            return (slsVar == null || (y8fVar = (y8f) slsVar.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : y8fVar;
        }
    });
    private xcy callbacks;
    private qpa0 viewBinding;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/payment/sdk/ui/payment/license/LicenseFragment$CustomURLSpan;", "Landroid/text/style/URLSpan;", "", "url", "<init>", "(Lcom/yandex/payment/sdk/ui/payment/license/LicenseFragment;Ljava/lang/String;)V", "Landroid/view/View;", "widget", "Lzy11;", "onClick", "(Landroid/view/View;)V", "paymentsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class CustomURLSpan extends URLSpan {
        public CustomURLSpan(String str) {
            super(str);
        }

        @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
        public void onClick(View widget) {
            try {
                LicenseFragment.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(getURL())).putExtra("com.android.browser.application_id", LicenseFragment.this.requireActivity().getApplicationContext().getPackageName()));
            } catch (ActivityNotFoundException e) {
                LinkedHashMap linkedHashMap = zdz.a;
                ogb1.b("Couldn't handle license Link activity: " + e + " for url: " + getURL());
            }
        }
    }

    private final boolean debrandingEnabled() {
        FragmentActivity activity = getActivity();
        ViewBindingActivityImpl viewBindingActivityImpl = activity instanceof ViewBindingActivityImpl ? (ViewBindingActivityImpl) activity : null;
        return n891.o(viewBindingActivityImpl != null ? Boolean.valueOf(viewBindingActivityImpl.getDebrandingFlag$paymentsdk_release()) : null);
    }

    private final bqr0 getActivityViewModel() {
        return (bqr0) this.activityViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(LicenseFragment licenseFragment, View view) {
        rwo c = ((pwf) ((wy4) ((y8h) ((p7u) dpb1.c(licenseFragment)).componentDispatcher()).b(wy4.class))).c();
        qv90.a.getClass();
        ((y22) c).a(sv90.D());
        licenseFragment.getActivityViewModel().c.l(c950.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$1(LicenseFragment licenseFragment) {
        licenseFragment.getActivityViewModel().c.l(c950.c);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$2(LicenseFragment licenseFragment, View view) {
        rwo c = ((pwf) ((wy4) ((y8h) ((p7u) dpb1.c(licenseFragment)).componentDispatcher()).b(wy4.class))).c();
        qv90.a.getClass();
        ((y22) c).a(sv90.D());
        licenseFragment.requireActivity().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$3(LicenseFragment licenseFragment) {
        licenseFragment.requireActivity().onBackPressed();
        return zy11.a;
    }

    private final void setupGeneralText() {
        MerchantInfo merchantInfo = (MerchantInfo) requireArguments().getParcelable(ARG_MERCHANT_INFO);
        qpa0 qpa0Var = this.viewBinding;
        if (merchantInfo != null) {
            if (qpa0Var == null) {
                qpa0Var = null;
            }
            TextView textView = qpa0Var.e;
            StringBuilder sb = new StringBuilder();
            if (!evu0.J(merchantInfo.getName())) {
                sb.append(getString(ryh0.paymentsdk_license_agreement_name, merchantInfo.getName()));
                sb.append("\n");
            }
            if (!evu0.J(merchantInfo.getOgrn())) {
                sb.append(getString(ryh0.paymentsdk_license_agreement_ogrn, merchantInfo.getOgrn()));
                sb.append("\n");
            }
            if (!evu0.J(merchantInfo.getScheduleText())) {
                sb.append(getString(ryh0.paymentsdk_license_agreement_schedule, merchantInfo.getScheduleText()));
                sb.append("\n");
            }
            MerchantAddress merchantAddress = merchantInfo.getMerchantAddress();
            if (merchantAddress != null) {
                sb.append(getString(ryh0.paymentsdk_license_agreement_address, merchantAddress.getCountry(), merchantAddress.getCity(), merchantAddress.getStreet(), merchantAddress.getHome(), merchantAddress.getZip()));
            }
            textView.setText(sb);
        } else {
            if (qpa0Var == null) {
                qpa0Var = null;
            }
            qpa0Var.e.setVisibility(8);
        }
        String string = getString(ryh0.paymentsdk_license_agreement_kassa);
        String string2 = getString(ryh0.paymentsdk_license_agreement_terms_of_use);
        int H = evu0.H(string, string2, 0, false, 6);
        int length = string2.length() + H;
        String string3 = getString(ryh0.paymentsdk_license_agreement_privacy_policy);
        int H2 = evu0.H(string, string3, 0, false, 6);
        int length2 = string3.length() + H2;
        qpa0 qpa0Var2 = this.viewBinding;
        if (qpa0Var2 == null) {
            qpa0Var2 = null;
        }
        qpa0Var2.d.setMovementMethod(new LinkMovementMethod());
        qpa0 qpa0Var3 = this.viewBinding;
        TextView textView2 = (qpa0Var3 != null ? qpa0Var3 : null).d;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        if (b.b[Acquirer.valueOf(requireArguments().getString(ARG_ACQUIRER)).ordinal()] == 1) {
            spannableStringBuilder.setSpan(new CustomURLSpan(payerLink), H, length, 17);
        } else {
            spannableStringBuilder.setSpan(new CustomURLSpan(payLink), H, length, 17);
        }
        spannableStringBuilder.setSpan(new CustomURLSpan(confidentialLink), H2, length2, 17);
        textView2.setText(spannableStringBuilder);
    }

    private final void setupSbpText() {
        qpa0 qpa0Var = this.viewBinding;
        if (qpa0Var == null) {
            qpa0Var = null;
        }
        qpa0Var.e.setVisibility(8);
        qpa0 qpa0Var2 = this.viewBinding;
        if (qpa0Var2 == null) {
            qpa0Var2 = null;
        }
        qpa0Var2.d.setText(getString(ryh0.paymentsdk_license_agreement_sbp));
        qpa0 qpa0Var3 = this.viewBinding;
        (qpa0Var3 != null ? qpa0Var3 : null).d.setVisibility(debrandingEnabled() ? 8 : 0);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View inflate = inflater.inflate(rlh0.paymentsdk_fragment_license, container, false);
        int i = j9h0.header_view;
        HeaderView headerView = (HeaderView) cma1.O(i, inflate);
        if (headerView != null) {
            i = j9h0.license_close_button;
            PaymentButtonView paymentButtonView = (PaymentButtonView) cma1.O(i, inflate);
            if (paymentButtonView != null) {
                i = j9h0.license_link;
                TextView textView = (TextView) cma1.O(i, inflate);
                if (textView != null) {
                    i = j9h0.merchant_info;
                    TextView textView2 = (TextView) cma1.O(i, inflate);
                    if (textView2 != null) {
                        i = j9h0.scroll_view;
                        if (((ScrollView) cma1.O(i, inflate)) != null) {
                            LinearLayout linearLayout = (LinearLayout) inflate;
                            this.viewBinding = new qpa0(linearLayout, headerView, paymentButtonView, textView, textView2);
                            return linearLayout;
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        qpa0 qpa0Var = this.viewBinding;
        if (qpa0Var == null) {
            qpa0Var = null;
        }
        n891.a(qpa0Var.a, (ViewGroup) requireView().getRootView().findViewById(j9h0.container_layout));
        xcy xcyVar = this.callbacks;
        if (xcyVar == null) {
            xcyVar = null;
        }
        xcyVar.t();
        xcy xcyVar2 = this.callbacks;
        if (xcyVar2 == null) {
            xcyVar2 = null;
        }
        final int i = 0;
        xcyVar2.p(false);
        qpa0 qpa0Var2 = this.viewBinding;
        if (qpa0Var2 == null) {
            qpa0Var2 = null;
        }
        qpa0Var2.c.setState(new jx90(fx90.b));
        qpa0 qpa0Var3 = this.viewBinding;
        if (qpa0Var3 == null) {
            qpa0Var3 = null;
        }
        PaymentButtonView.setText$default(qpa0Var3.c, getString(ryh0.paymentsdk_close), null, null, 6, null);
        qpa0 qpa0Var4 = this.viewBinding;
        if (qpa0Var4 == null) {
            qpa0Var4 = null;
        }
        HeaderView.setBackButton$default(qpa0Var4.b, false, null, 2, null);
        qpa0 qpa0Var5 = this.viewBinding;
        if (qpa0Var5 == null) {
            qpa0Var5 = null;
        }
        qpa0Var5.b.setTitleText(null);
        qpa0 qpa0Var6 = this.viewBinding;
        if (qpa0Var6 == null) {
            qpa0Var6 = null;
        }
        final int i2 = 1;
        qpa0Var6.b.setBrandIconVisible(debrandingEnabled() ? false : iob1.d(view.getContext().getTheme(), lng0.paymentsdk_selectShowBrandIcon, true));
        LicenseType licenseType = (LicenseType) requireArguments().getParcelable(ARG_TYPE);
        if (licenseType == null) {
            ny61.r("LicenseFragment should be provided with LicenseType");
            return;
        }
        int i3 = b.a[licenseType.ordinal()];
        if (i3 == 1) {
            setupSbpText();
            qpa0 qpa0Var7 = this.viewBinding;
            if (qpa0Var7 == null) {
                qpa0Var7 = null;
            }
            qpa0Var7.c.setOnClickListener(new View.OnClickListener(this) { // from class: ady
                public final /* synthetic */ LicenseFragment b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i4 = i;
                    LicenseFragment licenseFragment = this.b;
                    switch (i4) {
                        case 0:
                            LicenseFragment.onViewCreated$lambda$0(licenseFragment, view2);
                            break;
                        default:
                            LicenseFragment.onViewCreated$lambda$2(licenseFragment, view2);
                            break;
                    }
                }
            });
            qpa0 qpa0Var8 = this.viewBinding;
            (qpa0Var8 != null ? qpa0Var8 : null).b.setCloseButton(true, new sls(this) { // from class: bdy
                public final /* synthetic */ LicenseFragment b;

                {
                    this.b = this;
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    zy11 onViewCreated$lambda$1;
                    zy11 onViewCreated$lambda$3;
                    int i4 = i;
                    LicenseFragment licenseFragment = this.b;
                    switch (i4) {
                        case 0:
                            onViewCreated$lambda$1 = LicenseFragment.onViewCreated$lambda$1(licenseFragment);
                            return onViewCreated$lambda$1;
                        default:
                            onViewCreated$lambda$3 = LicenseFragment.onViewCreated$lambda$3(licenseFragment);
                            return onViewCreated$lambda$3;
                    }
                }
            });
            return;
        }
        if (i3 != 2) {
            w511.b();
            return;
        }
        setupGeneralText();
        qpa0 qpa0Var9 = this.viewBinding;
        if (qpa0Var9 == null) {
            qpa0Var9 = null;
        }
        qpa0Var9.c.setOnClickListener(new View.OnClickListener(this) { // from class: ady
            public final /* synthetic */ LicenseFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i4 = i2;
                LicenseFragment licenseFragment = this.b;
                switch (i4) {
                    case 0:
                        LicenseFragment.onViewCreated$lambda$0(licenseFragment, view2);
                        break;
                    default:
                        LicenseFragment.onViewCreated$lambda$2(licenseFragment, view2);
                        break;
                }
            }
        });
        qpa0 qpa0Var10 = this.viewBinding;
        (qpa0Var10 != null ? qpa0Var10 : null).b.setCloseButton(true, new sls(this) { // from class: bdy
            public final /* synthetic */ LicenseFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 onViewCreated$lambda$1;
                zy11 onViewCreated$lambda$3;
                int i4 = i2;
                LicenseFragment licenseFragment = this.b;
                switch (i4) {
                    case 0:
                        onViewCreated$lambda$1 = LicenseFragment.onViewCreated$lambda$1(licenseFragment);
                        return onViewCreated$lambda$1;
                    default:
                        onViewCreated$lambda$3 = LicenseFragment.onViewCreated$lambda$3(licenseFragment);
                        return onViewCreated$lambda$3;
                }
            }
        });
    }

    @Override // defpackage.zcy
    public void setCallback(xcy callbacks) {
        this.callbacks = callbacks;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0083\u0081\u0002\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/yandex/payment/sdk/ui/payment/license/LicenseFragment$LicenseType;", "Landroid/os/Parcelable;", "Lcom/yandex/xplat/common/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "GENERAL", "SBP", "paymentsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LicenseType implements Parcelable {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ LicenseType[] $VALUES;
        public static final Parcelable.Creator<LicenseType> CREATOR;
        public static final LicenseType GENERAL = new LicenseType("GENERAL", 0);
        public static final LicenseType SBP = new LicenseType("SBP", 1);

        private static final /* synthetic */ LicenseType[] $values() {
            return new LicenseType[]{GENERAL, SBP};
        }

        static {
            LicenseType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
            CREATOR = new Creator();
        }

        private LicenseType(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static LicenseType valueOf(String str) {
            return (LicenseType) Enum.valueOf(LicenseType.class, str);
        }

        public static LicenseType[] values() {
            return (LicenseType[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(name());
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<LicenseType> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LicenseType createFromParcel(Parcel parcel) {
                return LicenseType.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LicenseType[] newArray(int i) {
                return new LicenseType[i];
            }
        }
    }
}
