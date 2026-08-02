package com.yandex.payment.sdk.ui.common;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.yandex.payment.sdk.core.data.PersonalInfo;
import com.yandex.payment.sdk.model.data.ResultScreenClosing;
import com.yandex.payment.sdk.ui.BaseActivity;
import com.yandex.payment.sdk.ui.ViewBindingActivityImpl;
import com.yandex.payment.sdk.ui.view.ProgressResultView;
import com.yandex.payment.sdk.ui.view.payment.PaymentButtonView;
import defpackage.cma1;
import defpackage.cn90;
import defpackage.fx90;
import defpackage.hxj0;
import defpackage.i3y;
import defpackage.iob1;
import defpackage.j9h0;
import defpackage.jx90;
import defpackage.k4o;
import defpackage.ljf0;
import defpackage.mjf0;
import defpackage.mzj0;
import defpackage.n891;
import defpackage.nl;
import defpackage.np90;
import defpackage.ny61;
import defpackage.ojf0;
import defpackage.ong0;
import defpackage.rlh0;
import defpackage.ryh0;
import defpackage.spa0;
import defpackage.x0i0;
import defpackage.ywg0;
import kotlin.Metadata;
import ru.CryptoPro.JCSP.tools.common.window.id.IDialogId;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 !2\u00020\u0001:\u0002\"#B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u0003J+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0003R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/yandex/payment/sdk/ui/common/ResultFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "", "debrandingEnabled", "()Z", "Lzy11;", "handleSuccess", "handleFailure", "finish", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "Lspa0;", "viewBinding", "Lspa0;", "Ljava/lang/Runnable;", "finishRunnable", "Ljava/lang/Runnable;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Companion", IDialogId.INTENT_EXTRA_OUT_RESULT, "com/yandex/payment/sdk/ui/common/a", "paymentsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ResultFragment extends Fragment {
    private static final String ARG_CLOSING = "ARG_CLOSING";
    private static final String ARG_EXTERNAL_TEXT = "ARG_EXTERNAL_TEXT";
    private static final String ARG_IS_DEBUG = "ARG_IS_DEBUG";
    private static final String ARG_IS_LOGGED_IN = "ARG_IS_LOGGED_IN";
    private static final String ARG_PERSONAL_INFO = "ARG_PERSONAL_INFO";
    private static final String ARG_RESULT = "ARG_RESULT";
    private static final String ARG_SUBTITLE = "ARG_SUBTITLE";
    private static final String ARG_TEXT = "ARG_TEXT";
    public static final a Companion = new a();
    private final Runnable finishRunnable = new hxj0(1, this);
    private final Handler handler = new Handler(Looper.getMainLooper());
    private spa0 viewBinding;

    private final boolean debrandingEnabled() {
        FragmentActivity activity = getActivity();
        ViewBindingActivityImpl viewBindingActivityImpl = activity instanceof ViewBindingActivityImpl ? (ViewBindingActivityImpl) activity : null;
        return n891.o(viewBindingActivityImpl != null ? Boolean.valueOf(viewBindingActivityImpl.getDebrandingFlag$paymentsdk_release()) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finish() {
        ((BaseActivity) requireActivity()).finishWithResult$paymentsdk_release();
    }

    private final void handleFailure() {
        Bundle requireArguments = requireArguments();
        int i = requireArguments.getInt(ARG_TEXT);
        String string = requireArguments.getString(ARG_EXTERNAL_TEXT);
        int i2 = requireArguments.getInt(ARG_SUBTITLE);
        Integer valueOf = Integer.valueOf(i2);
        if (i2 == 0) {
            valueOf = null;
        }
        ResultScreenClosing resultScreenClosing = (ResultScreenClosing) requireArguments.getParcelable(ARG_CLOSING);
        boolean p = n891.p(resultScreenClosing != null ? Boolean.valueOf(resultScreenClosing.getShowButton()) : null);
        long delayToAutoHide = resultScreenClosing != null ? resultScreenClosing.getDelayToAutoHide() : -1L;
        spa0 spa0Var = this.viewBinding;
        spa0 spa0Var2 = spa0Var != null ? spa0Var : null;
        if (string != null) {
            spa0Var2.d.setState(new ljf0(string));
        } else {
            spa0Var2.d.setState(new mjf0(i, valueOf));
        }
        spa0Var2.c.setVisibility(8);
        PaymentButtonView paymentButtonView = spa0Var2.b;
        int i3 = 0;
        paymentButtonView.setVisibility(p ? 0 : 8);
        paymentButtonView.setBackgroundResource(iob1.e(paymentButtonView.getContext().getTheme(), ong0.paymentsdk_payButtonBackground));
        paymentButtonView.setTextAppearance(iob1.e(paymentButtonView.getContext().getTheme(), ong0.paymentsdk_payButtonTextAppearance));
        paymentButtonView.setTotalTextAppearance(iob1.e(paymentButtonView.getContext().getTheme(), ong0.paymentsdk_payButtonTotalTextAppearance));
        paymentButtonView.setSubTotalTextAppearance(iob1.e(paymentButtonView.getContext().getTheme(), ong0.paymentsdk_payButtonSubtotalTextAppearance));
        PaymentButtonView.setText$default(paymentButtonView, getString(ryh0.paymentsdk_login_done), null, null, 6, null);
        paymentButtonView.setOnClickListener(new mzj0(this, i3));
        paymentButtonView.setState(new jx90(fx90.b));
        if (delayToAutoHide > 0) {
            this.handler.postDelayed(this.finishRunnable, delayToAutoHide);
        }
    }

    private final void handleSuccess() {
        Bundle requireArguments = requireArguments();
        int i = requireArguments.getInt(ARG_TEXT);
        ResultScreenClosing resultScreenClosing = (ResultScreenClosing) requireArguments.getParcelable(ARG_CLOSING);
        boolean p = n891.p(resultScreenClosing != null ? Boolean.valueOf(resultScreenClosing.getShowButton()) : null);
        long delayToAutoHide = resultScreenClosing != null ? resultScreenClosing.getDelayToAutoHide() : -1L;
        boolean z = requireArguments.getBoolean(ARG_IS_LOGGED_IN);
        spa0 spa0Var = this.viewBinding;
        if (spa0Var == null) {
            spa0Var = null;
        }
        spa0Var.d.setState(new ojf0(i));
        fx90 fx90Var = fx90.b;
        if (!z) {
            cn90 b = np90.b();
            if (b != null) {
                spa0 spa0Var2 = this.viewBinding;
                if (spa0Var2 == null) {
                    spa0Var2 = null;
                }
                spa0Var2.c.setVisibility(0);
                spa0 spa0Var3 = this.viewBinding;
                PaymentButtonView paymentButtonView = (spa0Var3 != null ? spa0Var3 : null).b;
                paymentButtonView.setVisibility(0);
                paymentButtonView.setBackgroundResource(ywg0.paymentsdk_login_button_bg);
                paymentButtonView.setTextAppearance(x0i0.PaymentsdkTextAppearance_PayButton_Login);
                PaymentButtonView.setText$default(paymentButtonView, getString(ryh0.paymentsdk_login), null, null, 6, null);
                paymentButtonView.setOnClickListener(new nl(13, requireArguments, this, b));
                paymentButtonView.setState(new jx90(fx90Var));
                return;
            }
            return;
        }
        spa0 spa0Var4 = this.viewBinding;
        if (spa0Var4 == null) {
            spa0Var4 = null;
        }
        spa0Var4.c.setVisibility(8);
        spa0 spa0Var5 = this.viewBinding;
        PaymentButtonView paymentButtonView2 = (spa0Var5 != null ? spa0Var5 : null).b;
        paymentButtonView2.setVisibility(p ? 0 : 8);
        paymentButtonView2.setBackgroundResource(iob1.e(paymentButtonView2.getContext().getTheme(), ong0.paymentsdk_payButtonBackground));
        paymentButtonView2.setTextAppearance(iob1.e(paymentButtonView2.getContext().getTheme(), ong0.paymentsdk_payButtonTextAppearance));
        paymentButtonView2.setTotalTextAppearance(iob1.e(paymentButtonView2.getContext().getTheme(), ong0.paymentsdk_payButtonTotalTextAppearance));
        paymentButtonView2.setSubTotalTextAppearance(iob1.e(paymentButtonView2.getContext().getTheme(), ong0.paymentsdk_payButtonSubtotalTextAppearance));
        PaymentButtonView.setText$default(paymentButtonView2, getString(ryh0.paymentsdk_login_done), null, null, 6, null);
        paymentButtonView2.setOnClickListener(new mzj0(this, 1));
        paymentButtonView2.setState(new jx90(fx90Var));
        if (delayToAutoHide > 0) {
            this.handler.postDelayed(this.finishRunnable, delayToAutoHide);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleSuccess$lambda$1$0$0(Bundle bundle, ResultFragment resultFragment, cn90 cn90Var, View view) {
        PersonalInfo personalInfo = (PersonalInfo) bundle.getParcelable(ARG_PERSONAL_INFO);
        if (personalInfo != null) {
            i3y i3yVar = np90.a;
            np90.c(resultFragment.requireActivity(), cn90Var, personalInfo, bundle.getBoolean(ARG_IS_DEBUG));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View inflate = inflater.inflate(rlh0.paymentsdk_fragment_result, container, false);
        int i = j9h0.login_button;
        PaymentButtonView paymentButtonView = (PaymentButtonView) cma1.O(i, inflate);
        if (paymentButtonView != null) {
            i = j9h0.login_button_hint;
            TextView textView = (TextView) cma1.O(i, inflate);
            if (textView != null) {
                i = j9h0.progress_result_view;
                ProgressResultView progressResultView = (ProgressResultView) cma1.O(i, inflate);
                if (progressResultView != null) {
                    LinearLayout linearLayout = (LinearLayout) inflate;
                    this.viewBinding = new spa0(linearLayout, paymentButtonView, textView, progressResultView);
                    return linearLayout;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.handler.removeCallbacks(this.finishRunnable);
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        spa0 spa0Var = this.viewBinding;
        if (spa0Var == null) {
            spa0Var = null;
        }
        n891.a(spa0Var.a, (ViewGroup) requireView().getRootView().findViewById(j9h0.container_layout));
        RESULT result = (RESULT) requireArguments().getParcelable(ARG_RESULT);
        int i = result == null ? -1 : b.a[result.ordinal()];
        if (i == 1) {
            handleSuccess();
        } else if (i == 2) {
            handleFailure();
        }
        spa0 spa0Var2 = this.viewBinding;
        (spa0Var2 != null ? spa0Var2 : null).d.setBrandIconVisible(!debrandingEnabled());
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0083\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/yandex/payment/sdk/ui/common/ResultFragment$RESULT;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "SUCCESS", "FAILURE", "paymentsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RESULT implements Parcelable {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ RESULT[] $VALUES;
        public static final Parcelable.Creator<RESULT> CREATOR;
        public static final RESULT SUCCESS = new RESULT("SUCCESS", 0);
        public static final RESULT FAILURE = new RESULT("FAILURE", 1);

        private static final /* synthetic */ RESULT[] $values() {
            return new RESULT[]{SUCCESS, FAILURE};
        }

        static {
            RESULT[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
            CREATOR = new Creator();
        }

        private RESULT(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static RESULT valueOf(String str) {
            return (RESULT) Enum.valueOf(RESULT.class, str);
        }

        public static RESULT[] values() {
            return (RESULT[]) $VALUES.clone();
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
        public static final class Creator implements Parcelable.Creator<RESULT> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RESULT createFromParcel(Parcel parcel) {
                return RESULT.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RESULT[] newArray(int i) {
                return new RESULT[i];
            }
        }
    }
}
