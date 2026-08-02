package xsna;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.net.Uri;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.util.Property;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Triple;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.bbv0;

/* compiled from: CheckoutOnboardingPresenter.kt */
/* loaded from: classes6.dex */
public final class n6c implements i6c {
    public final k6c b;
    public final l2l0 c;
    public final gbv0 d;
    public boolean e;

    /* compiled from: CheckoutOnboardingPresenter.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            n6c n6cVar = (n6c) this.receiver;
            n6cVar.c.getClass();
            ebv0 ebv0Var = n6cVar.d.a.get();
            Context requireContext = ebv0Var != null ? ebv0Var.requireContext() : null;
            if (requireContext != null) {
                rex0 rex0Var = e370.j;
                (rex0Var != null ? rex0Var : null).b(requireContext, Uri.parse("https://money.mail.ru/img/vkpay_rules.pdf"));
            }
            return s3q0.a;
        }
    }

    public n6c(k6c k6cVar, l2l0 l2l0Var) {
        bbv0.g.getClass();
        gbv0 gbv0Var = bbv0.a.f().d;
        this.b = k6cVar;
        this.c = l2l0Var;
        this.d = gbv0Var;
    }

    @Override // xsna.fm6
    public final boolean a0() {
        return false;
    }

    @Override // xsna.i6c
    public final void h0() {
        int i;
        k6c k6cVar = this.b;
        Context mo2getContext = k6cVar.mo2getContext();
        if (mo2getContext == null) {
            return;
        }
        SpannableString l = xa4.l(R.string.vk_pay_checkout_onboarding_checkbox_text, mo2getContext, new a(0, this, n6c.class, "onAgreementTextClicked", "onAgreementTextClicked()V", 0));
        this.c.getClass();
        List l2 = e43.l(new Triple(Integer.valueOf(R.string.vk_pay_checkout_onboarding_page_1_title), Integer.valueOf(R.array.vk_pay_checkout_onboarding_page_1_subtitle_items), new int[]{R.drawable.vk_pay_checkout_icon_payment_card_vertical_outline_28, R.drawable.vk_pay_checkout_icon_money_history_backward_outline_28, R.drawable.vk_pay_checkout_icon_discount_outline_28, R.drawable.vk_pay_checkout_icon_like_outline_28}), new Triple(Integer.valueOf(R.string.vk_pay_checkout_onboarding_page_2_title), Integer.valueOf(R.array.vk_pay_checkout_onboarding_page_2_subtitle_items), new int[]{R.drawable.vk_pay_checkout_icon_lock_outline_28, R.drawable.vk_icon_money_transfer_outline_28, R.drawable.vk_pay_checkout_icon_freeze_outline_28, R.drawable.vk_pay_checkout_icon_message_outline_28}), new Triple(Integer.valueOf(R.string.vk_pay_checkout_onboarding_page_3_title), Integer.valueOf(R.array.vk_pay_checkout_onboarding_page_3_subtitle_items), new int[]{R.drawable.vk_pay_checkout_icon_payment_card_vertical_outline_28, R.drawable.vk_icon_search_outline_28, R.drawable.vk_icon_users_outline_28, R.drawable.vk_icon_money_circle_outline_28}));
        ArrayList arrayList = new ArrayList(c5g.u(l2, 10));
        Iterator it = l2.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                ViewPager2 viewPager2 = k6cVar.j;
                if (viewPager2 == null) {
                    viewPager2 = null;
                }
                k6cVar.i = new l6c(k6cVar.kn(), arrayList);
                viewPager2.setPageTransformer(new v6y0());
                l6c l6cVar = k6cVar.i;
                if (l6cVar == null) {
                    l6cVar = null;
                }
                viewPager2.setAdapter(l6cVar);
                viewPager2.b(k6cVar.p);
                TabLayout tabLayout = k6cVar.m;
                if (tabLayout == null) {
                    tabLayout = null;
                }
                ViewPager2 viewPager22 = k6cVar.j;
                if (viewPager22 == null) {
                    viewPager22 = null;
                }
                new com.google.android.material.tabs.c(tabLayout, viewPager22, new ct(6)).a();
                AppCompatCheckBox appCompatCheckBox = k6cVar.l;
                if (appCompatCheckBox == null) {
                    appCompatCheckBox = null;
                }
                appCompatCheckBox.setText(l);
                ((RecyclerView) viewPager2.getChildAt(0)).setNestedScrollingEnabled(false);
                AppCompatCheckBox appCompatCheckBox2 = k6cVar.l;
                if (appCompatCheckBox2 == null) {
                    appCompatCheckBox2 = null;
                }
                appCompatCheckBox2.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                TextView textView = k6cVar.n;
                if (textView == null) {
                    textView = null;
                }
                textView.setAlpha(1.0f);
                k6cVar.un();
                AppCompatCheckBox appCompatCheckBox3 = k6cVar.l;
                if (appCompatCheckBox3 == null) {
                    appCompatCheckBox3 = null;
                }
                appCompatCheckBox3.setOnCheckedChangeListener(new l29(k6cVar, 1));
                AppCompatCheckBox appCompatCheckBox4 = k6cVar.l;
                (appCompatCheckBox4 != null ? appCompatCheckBox4 : null).setMovementMethod(LinkMovementMethod.getInstance());
                return;
            }
            Object next = it.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                e43.t();
                throw null;
            }
            Triple triple = (Triple) next;
            int intValue = ((Number) triple.d()).intValue();
            int intValue2 = ((Number) triple.g()).intValue();
            int[] iArr = (int[]) triple.h();
            if (i2 == 0) {
                i = R.drawable.vk_pay_checkout_onboarding_page_1;
            } else if (i2 == 1) {
                i = R.drawable.vk_pay_checkout_onboarding_page_2;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException(("no image found for onboarding's page #" + i2).toString());
                }
                i = R.drawable.vk_pay_checkout_onboarding_page_3;
            }
            arrayList.add(new fe80(i, intValue, intValue2, iArr));
            i2 = i3;
        }
    }

    @Override // xsna.i6c
    public final void i1(int i) {
        boolean z = i == 1;
        if (z) {
            gbv0 gbv0Var = this.d;
            gbv0Var.getClass();
            gbv0Var.n(new bbk(), null);
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            ViewPager2 viewPager2 = this.b.j;
            (viewPager2 == null ? null : viewPager2).setCurrentItem((viewPager2 != null ? viewPager2 : null).getCurrentItem() + 1);
        }
    }

    @Override // xsna.i6c
    public final void p0(boolean z) {
        this.e = z;
        k6c k6cVar = this.b;
        if (!z) {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            k6cVar.getClass();
            AppCompatCheckBox appCompatCheckBox = k6cVar.l;
            if (appCompatCheckBox == null) {
                appCompatCheckBox = null;
            }
            View view = (View) new WeakReference(appCompatCheckBox).get();
            if (view != null) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 1.0f);
                ofFloat.setDuration(450L);
                ofFloat.start();
            }
            TextView textView = k6cVar.n;
            (textView != null ? textView : null).setText(k6cVar.requireContext().getString(R.string.vk_pay_checkout_onboarding_button_text));
            k6cVar.un();
            return;
        }
        k6cVar.getClass();
        AppCompatCheckBox appCompatCheckBox2 = k6cVar.l;
        if (appCompatCheckBox2 == null) {
            appCompatCheckBox2 = null;
        }
        View view2 = (View) new WeakReference(appCompatCheckBox2).get();
        if (view2 != null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, view2.getAlpha(), 1.0f);
            ofFloat2.setDuration(450L);
            ofFloat2.start();
        }
        AppCompatCheckBox appCompatCheckBox3 = k6cVar.l;
        if (appCompatCheckBox3 == null) {
            appCompatCheckBox3 = null;
        }
        appCompatCheckBox3.setChecked(true);
        TextView textView2 = k6cVar.n;
        (textView2 != null ? textView2 : null).setText(k6cVar.requireContext().getString(R.string.vk_pay_checkout_onboarding_button_text_final));
    }

    @Override // xsna.i6c
    public final void t2(boolean z) {
        k6c k6cVar = this.b;
        if (z) {
            k6cVar.un();
            return;
        }
        if (z) {
            throw new NoWhenBranchMatchedException();
        }
        if (this.e) {
            TextView textView = k6cVar.n;
            if (textView == null) {
                textView = null;
            }
            textView.setOnClickListener(null);
            View view = (View) new WeakReference(textView).get();
            if (view != null) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.5f);
                ofFloat.setDuration(450L);
                ofFloat.start();
            }
        }
    }

    @Override // xsna.fm6
    public final void d() {
    }

    @Override // xsna.fm6
    public final void onDestroy() {
    }

    @Override // xsna.fm6
    public final void onDestroyView() {
    }

    @Override // xsna.fm6
    public final void onResume() {
    }

    @Override // xsna.fm6
    public final void onStart() {
    }
}
