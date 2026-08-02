package xsna;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vk.auth.enterphone.choosecountry.Country;
import com.vk.auth.ui.VkLoadingButton;
import com.vk.auth.utils.VkPhoneFormatUtils;
import com.vk.auth.verification.base.ui.HorizontalCountDownBar;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.w39;

/* compiled from: CallInController.kt */
/* loaded from: classes15.dex */
public final class v39 {
    public final ViewStub a;
    public final ViewStub b;
    public final FunctionReferenceImpl c;
    public boolean d;
    public View e;
    public View f;
    public TextView g;
    public TextView h;
    public LinearLayout i;
    public HorizontalCountDownBar j;
    public VkLoadingButton k;
    public TextView l;
    public final oa6 m = new oa6(this, 3);

    /* compiled from: CallInController.kt */
    public static final class a {
        public final String a;
        public final long b;
        public final long c;

        public a(String str, long j, long j2) {
            this.a = str;
            this.b = j;
            this.c = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Long.hashCode(this.c) + bh10.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CallInWaitingParameters(phoneToCall=");
            sb.append(this.a);
            sb.append(", callPhoneStartTimeoutTimestamp=");
            sb.append(this.b);
            sb.append(", callPhoneEndTimeoutTimestamp=");
            return vu5.a(')', this.c, sb);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v39(ViewStub viewStub, ViewStub viewStub2, gzs<s3q0> gzsVar) {
        this.a = viewStub;
        this.b = viewStub2;
        this.c = (FunctionReferenceImpl) gzsVar;
    }

    public final void a(Context context, a aVar, boolean z, boolean z2) {
        Object obj;
        Integer num;
        String str = aVar.a;
        if (!this.d) {
            this.d = true;
            this.e = this.a.inflate();
            this.f = this.b.inflate();
            View view = this.e;
            this.g = view != null ? (TextView) view.findViewById(R.id.libverify_callin_number_to_call) : null;
            View view2 = this.e;
            this.h = view2 != null ? (TextView) view2.findViewById(R.id.libverify_callin_flag_emoji_text) : null;
            View view3 = this.e;
            this.i = view3 != null ? (LinearLayout) view3.findViewById(R.id.libverify_callin_phone_and_flag_container) : null;
            View view4 = this.e;
            this.j = view4 != null ? (HorizontalCountDownBar) view4.findViewById(R.id.libverify_callin_count_down_bar) : null;
            View view5 = this.f;
            this.k = view5 != null ? (VkLoadingButton) view5.findViewById(R.id.libverify_callin_make_call_button) : null;
            View view6 = this.f;
            this.l = view6 != null ? (TextView) view6.findViewById(R.id.libverify_callin_sms_info_text) : null;
        }
        String y = brm0.y(str, "+", "");
        List<Country> list = y39.a;
        if (list == null) {
            LinkedHashMap linkedHashMap = uyj.a;
            bpn0 bpn0Var = t65.a;
            list = j5g.D0(new x39(0), uyj.a(context, ply.a()));
            y39.a = list;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (brm0.B(y, ((Country) obj).c, false)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Country country = (Country) obj;
        w39 w39Var = country == null ? w39.b.c : country.d.equals("KZ") ? w39.a.c : w39.b.c;
        View view7 = this.e;
        if (view7 != null) {
            view7.setVisibility(0);
        }
        TextView textView = this.g;
        if (textView != null) {
            textView.setText(VkPhoneFormatUtils.a(textView.getContext(), str, null, VkPhoneFormatUtils.PhoneFormatterMode.RUSSIAN_SPECIFIC, 12));
        }
        TextView textView2 = this.h;
        if (textView2 != null && (num = w39Var.a) != null) {
            textView2.setText(textView2.getContext().getString(num.intValue()));
        }
        LinearLayout linearLayout = this.i;
        if (linearLayout != null) {
            iut0.q(linearLayout, new vmk());
            StringBuilder sb = new StringBuilder();
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (Character.isDigit(charAt)) {
                    sb.append(charAt);
                }
            }
            String W = rl3.W(" ", sb.toString().toCharArray());
            Integer num2 = w39Var.b;
            if (num2 != null) {
                linearLayout.setContentDescription(linearLayout.getContext().getString(R.string.vk_otp_method_selection_verification_methods_libverify_callin_with_phone_accessibility_description, linearLayout.getContext().getString(num2.intValue()), W));
            } else {
                linearLayout.setContentDescription(linearLayout.getContext().getString(R.string.vk_otp_method_selection_verification_methods_libverify_callin_no_phone_accessibility_description, W));
            }
        }
        HorizontalCountDownBar horizontalCountDownBar = this.j;
        if (horizontalCountDownBar != null) {
            long j = aVar.b;
            long j2 = aVar.c;
            ValueAnimator valueAnimator = horizontalCountDownBar.j;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            horizontalCountDownBar.j = null;
            horizontalCountDownBar.g = j2 - j;
            horizontalCountDownBar.h = j2;
            horizontalCountDownBar.c();
        }
        View view8 = this.f;
        if (view8 != null) {
            view8.setVisibility(0);
        }
        TextView textView3 = this.l;
        if (textView3 != null) {
            textView3.setVisibility(z ? 0 : 8);
        }
        VkLoadingButton vkLoadingButton = this.k;
        if (vkLoadingButton != null) {
            vkLoadingButton.setEnabled(z2);
        }
        TextView textView4 = this.h;
        if (textView4 != null) {
            textView4.setVisibility(w39Var.a == null ? 8 : 0);
        }
        if (!z2) {
            VkLoadingButton vkLoadingButton2 = this.k;
            if (vkLoadingButton2 != null) {
                vkLoadingButton2.setOnClickListener(null);
            }
            LinearLayout linearLayout2 = this.i;
            if (linearLayout2 != null) {
                linearLayout2.setOnClickListener(null);
                return;
            }
            return;
        }
        VkLoadingButton vkLoadingButton3 = this.k;
        oa6 oa6Var = this.m;
        if (vkLoadingButton3 != null) {
            vkLoadingButton3.setOnClickListener(oa6Var);
        }
        LinearLayout linearLayout3 = this.i;
        if (linearLayout3 != null) {
            linearLayout3.setOnClickListener(oa6Var);
        }
    }
}
