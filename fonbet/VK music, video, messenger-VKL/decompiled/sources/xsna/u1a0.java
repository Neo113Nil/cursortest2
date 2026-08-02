package xsna;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.core.ui.bottomsheet.internal.e;
import com.vk.core.ui.themes.VKReplacerView;
import com.vk.core.view.components.button.VkButton;
import com.vk.superapp.browser.internal.ui.banner.PersonalBannerView;
import com.vk.superapp.browser.internal.ui.time.StaticTimerView;
import com.vk.superapp.browser.ui.model.PersonalDiscountTransitionFrom;
import com.vk.superapp.ui.shimmer.Shimmer;
import com.vk.superapp.ui.shimmer.ShimmerFrameLayout;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.dw20;
import xsna.kfr0;
import xsna.u1a0;

/* compiled from: PersonalDiscountModalBottomSheet.kt */
/* loaded from: classes6.dex */
public final class u1a0 extends dw20 {
    public static final /* synthetic */ int A1 = 0;
    public VKReplacerView f1;
    public View g1;
    public TextView h1;
    public PersonalBannerView i1;
    public View j1;
    public StaticTimerView k1;
    public VkButton l1;
    public TextView m1;
    public TextView n1;
    public View o1;
    public ShimmerFrameLayout p1;
    public View q1;
    public View r1;
    public View s1;
    public kfr0.a t1;
    public r1a0 u1;
    public PersonalDiscountTransitionFrom v1;
    public final io.reactivex.rxjava3.disposables.b w1 = new io.reactivex.rxjava3.disposables.b();
    public q1a0 x1;
    public boolean y1;
    public boolean z1;

    /* compiled from: PersonalDiscountModalBottomSheet.kt */
    public static final class a extends dw20.b {
        public final fvv0 e;
        public final PersonalDiscountTransitionFrom f;
        public final kfr0.a g;
        public final r1a0 h;

        public a(Context context, fvv0 fvv0Var, PersonalDiscountTransitionFrom personalDiscountTransitionFrom, kfr0.a aVar, r1a0 r1a0Var) {
            super(context, null);
            this.e = fvv0Var;
            this.f = personalDiscountTransitionFrom;
            this.g = aVar;
            this.h = r1a0Var;
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            D0(LayoutInflater.from(this.c).inflate(R.layout.vk_personal_discount_view, (ViewGroup) null, false), false);
            c(new cpo(false, 0, 5));
            l(e3m.f(R.attr.vk_ui_background_content, this.c));
            J();
            F0(true);
            x(0);
            u(iah0.a(28));
            u080 u080Var = new u080() { // from class: xsna.t1a0
                @Override // xsna.u080
                public final bqx0 b(View view, bqx0 bqx0Var) {
                    u1a0.a aVar = u1a0.a.this;
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
            u1a0 u1a0Var = new u1a0();
            u1a0Var.t1 = this.g;
            u1a0Var.u1 = this.h;
            u1a0Var.v1 = this.f;
            return u1a0Var;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PersonalDiscountModalBottomSheet.kt */
    public static final class b {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b CONTENT;
        public static final b ERROR;
        public static final b PROGRESS;

        static {
            b bVar = new b("CONTENT", 0);
            CONTENT = bVar;
            b bVar2 = new b("PROGRESS", 1);
            PROGRESS = bVar2;
            b bVar3 = new b("ERROR", 2);
            ERROR = bVar3;
            b[] bVarArr = {bVar, bVar2, bVar3};
            $VALUES = bVarArr;
            $ENTRIES = new asp(bVarArr);
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    /* compiled from: PersonalDiscountModalBottomSheet.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.CONTENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final void Yn(b bVar) {
        int i = c.$EnumSwitchMapping$0[bVar.ordinal()];
        if (i == 1) {
            Iterator<T> it = Zn().iterator();
            while (it.hasNext()) {
                ((View) it.next()).setVisibility(0);
            }
            ShimmerFrameLayout shimmerFrameLayout = this.p1;
            if (shimmerFrameLayout == null) {
                shimmerFrameLayout = null;
            }
            Iterator it2 = Collections.singletonList(shimmerFrameLayout).iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).setVisibility(8);
            }
            Iterator<T> it3 = ao().iterator();
            while (it3.hasNext()) {
                ((View) it3.next()).setVisibility(8);
            }
            ShimmerFrameLayout shimmerFrameLayout2 = this.p1;
            (shimmerFrameLayout2 != null ? shimmerFrameLayout2 : null).d();
            return;
        }
        if (i == 2) {
            Iterator<T> it4 = Zn().iterator();
            while (it4.hasNext()) {
                ((View) it4.next()).setVisibility(8);
            }
            ShimmerFrameLayout shimmerFrameLayout3 = this.p1;
            if (shimmerFrameLayout3 == null) {
                shimmerFrameLayout3 = null;
            }
            Iterator it5 = Collections.singletonList(shimmerFrameLayout3).iterator();
            while (it5.hasNext()) {
                ((View) it5.next()).setVisibility(0);
            }
            Iterator<T> it6 = ao().iterator();
            while (it6.hasNext()) {
                ((View) it6.next()).setVisibility(8);
            }
            ShimmerFrameLayout shimmerFrameLayout4 = this.p1;
            (shimmerFrameLayout4 != null ? shimmerFrameLayout4 : null).c();
            return;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        Iterator<T> it7 = Zn().iterator();
        while (it7.hasNext()) {
            ((View) it7.next()).setVisibility(8);
        }
        ShimmerFrameLayout shimmerFrameLayout5 = this.p1;
        if (shimmerFrameLayout5 == null) {
            shimmerFrameLayout5 = null;
        }
        Iterator it8 = Collections.singletonList(shimmerFrameLayout5).iterator();
        while (it8.hasNext()) {
            ((View) it8.next()).setVisibility(8);
        }
        Iterator<T> it9 = ao().iterator();
        while (it9.hasNext()) {
            ((View) it9.next()).setVisibility(0);
        }
        ShimmerFrameLayout shimmerFrameLayout6 = this.p1;
        (shimmerFrameLayout6 != null ? shimmerFrameLayout6 : null).d();
    }

    public final List<View> Zn() {
        VKReplacerView vKReplacerView = this.f1;
        if (vKReplacerView == null) {
            vKReplacerView = null;
        }
        View view = this.g1;
        if (view == null) {
            view = null;
        }
        TextView textView = this.h1;
        if (textView == null) {
            textView = null;
        }
        PersonalBannerView personalBannerView = this.i1;
        if (personalBannerView == null) {
            personalBannerView = null;
        }
        View view2 = this.j1;
        if (view2 == null) {
            view2 = null;
        }
        StaticTimerView staticTimerView = this.k1;
        if (staticTimerView == null) {
            staticTimerView = null;
        }
        VkButton vkButton = this.l1;
        if (vkButton == null) {
            vkButton = null;
        }
        TextView textView2 = this.m1;
        if (textView2 == null) {
            textView2 = null;
        }
        TextView textView3 = this.n1;
        if (textView3 == null) {
            textView3 = null;
        }
        View view3 = this.o1;
        return e43.l(vKReplacerView, view, textView, personalBannerView, view2, staticTimerView, vkButton, textView2, textView3, view3 != null ? view3 : null);
    }

    public final List<View> ao() {
        View view = this.q1;
        if (view == null) {
            view = null;
        }
        View view2 = this.r1;
        if (view2 == null) {
            view2 = null;
        }
        View view3 = this.s1;
        return e43.l(view, view2, view3 != null ? view3 : null);
    }

    public final void bo() {
        if (this.t1 != null) {
            int i = com.vk.superapp.browser.internal.ui.shortcats.a.o;
            vdx0 vdx0Var = e370.e;
            if (vdx0Var == null) {
                vdx0Var = null;
            }
            vdx0Var.getClass();
            io.reactivex.rxjava3.disposables.c subscribe = new io.reactivex.rxjava3.internal.operators.single.n(((lfn0) vdx0.E.getValue()).a(), new c120(new wq20(this, 13), 15)).subscribe(new be50(new o010(this, 26), 7), new dh40(new p010(this, 18), 8));
            if (subscribe != null) {
                this.w1.b(subscribe);
            }
        }
    }

    @Override // xsna.dw20, xsna.dh6, androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        l1a0 l1a0Var;
        super.onDismiss(dialogInterface);
        this.w1.dispose();
        q1a0 q1a0Var = this.x1;
        boolean z = false;
        boolean z2 = (q1a0Var == null || this.y1 || this.z1) ? false : true;
        if (q1a0Var != null && !this.y1) {
            z = true;
        }
        r1a0 r1a0Var = this.u1;
        if (r1a0Var != null) {
            r1a0Var.a(z2, new f4v(z, (q1a0Var == null || (l1a0Var = q1a0Var.b) == null) ? null : l1a0Var.d));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.dw20, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        q0o0 q0o0Var = this instanceof q0o0 ? (q0o0) this : null;
        prw.h(this, q0o0Var != null ? q0o0Var.tag() : "VkSdkDialogFragment", null);
        Dialog yn = super.yn(bundle);
        this.f1 = (VKReplacerView) yn.findViewById(R.id.personal_discount_user_avatar_view);
        this.g1 = yn.findViewById(R.id.personal_discount_badge_view);
        this.h1 = (TextView) yn.findViewById(R.id.personal_discount_title_view);
        this.i1 = (PersonalBannerView) yn.findViewById(R.id.personal_discount_banner_view);
        this.j1 = yn.findViewById(R.id.personal_discount_actual_time_view);
        this.k1 = (StaticTimerView) yn.findViewById(R.id.personal_discount_time_view);
        this.l1 = (VkButton) yn.findViewById(R.id.personal_discount_positive_view);
        this.m1 = (TextView) yn.findViewById(R.id.personal_discount_negative_view);
        this.n1 = (TextView) yn.findViewById(R.id.personal_discount_rules_view);
        this.o1 = yn.findViewById(R.id.personal_discount_bottom_space_view);
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) yn.findViewById(R.id.personal_discount_progress_view);
        Shimmer.c cVar = (Shimmer.c) new Shimmer.c().c(true).j();
        cVar.k(e3m.f(R.attr.vk_ui_skeleton_from, shimmerFrameLayout.getContext()));
        cVar.a.d = e3m.f(R.attr.vk_ui_track_background, shimmerFrameLayout.getContext());
        shimmerFrameLayout.b(cVar.d(1.0f).a());
        this.p1 = shimmerFrameLayout;
        this.q1 = yn.findViewById(R.id.personal_discount_error_icon);
        this.r1 = yn.findViewById(R.id.personal_discount_error_title);
        this.s1 = yn.findViewById(R.id.personal_discount_error_action);
        bo();
        View view = this.s1;
        jjc.g(view != null ? view : null, new w620(this, 11));
        return yn;
    }
}
