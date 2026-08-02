package com.ybsdk.feature.autotopup.internal.presentation.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ybsdk.core.design.animation.AnimUtils;
import com.ybsdk.core.design.spoiler.SpoilerTextView;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.widgets.common.Tooltip$DismissReason;
import com.ybsdk.widgets.common.Tooltip$PreferredGravity;
import com.ybsdk.widgets.common.Tooltip$PreferredPosition;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;
import defpackage.at3;
import defpackage.au3;
import defpackage.buz0;
import defpackage.c061;
import defpackage.cma1;
import defpackage.cuz0;
import defpackage.d061;
import defpackage.evu0;
import defpackage.gob1;
import defpackage.hc5;
import defpackage.j24;
import defpackage.jw00;
import defpackage.k24;
import defpackage.k5;
import defpackage.kp50;
import defpackage.l24;
import defpackage.lum;
import defpackage.m70;
import defpackage.mh3;
import defpackage.n70;
import defpackage.ns3;
import defpackage.ny61;
import defpackage.pah0;
import defpackage.qa3;
import defpackage.rje;
import defpackage.scc;
import defpackage.tf;
import defpackage.tja1;
import defpackage.tls;
import defpackage.ung0;
import defpackage.v4b1;
import defpackage.vuz0;
import defpackage.wd2;
import defpackage.xmh0;
import defpackage.xty0;
import defpackage.zbd;
import defpackage.zls;
import defpackage.zo31;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 /2\u00020\u0001:\u0002\u00140B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0011J\r\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0011J\u0015\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u0017J\u001b\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001f\u0010\u0011R\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\"\u0010%\u001a\u0010\u0012\f\u0012\n $*\u0004\u0018\u00010\u001c0\u001c0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010+R\"\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00061"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/presentation/view/AutoTopupSummaryView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Function1;", "", "Lzy11;", "action", "setOnDropDownToggleAction", "(Ltls;)V", "showInfo", "()V", "hideInfo", "showBlink", "Ll24;", ClidProvider.STATE, "render", "(Ll24;)V", "setContent", "setTooltip", "Lm70;", "", "Lgc5;", "createMonthAdapter", "()Lm70;", "toggleDropdown", "Ld061;", "binding", "Ld061;", "Lqa3;", "kotlin.jvm.PlatformType", "monthsAdapter", "Lqa3;", "Lcuz0;", "tooltip", "Lcuz0;", "infoShown", "Z", "dropdownExpanded", "onDropDownToggle", "Ltls;", "Companion", "k24", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AutoTopupSummaryView extends ConstraintLayout {

    @Deprecated
    public static final float ALPHA_FULL = 1.0f;

    @Deprecated
    public static final float ALPHA_GONE = 0.0f;

    @Deprecated
    public static final float ARROW_ROTATION_COLLAPSED = 180.0f;

    @Deprecated
    public static final float ARROW_ROTATION_EXPANDED = 0.0f;
    private final d061 binding;
    private boolean dropdownExpanded;
    private boolean infoShown;
    private final qa3 monthsAdapter;
    private tls onDropDownToggle;
    private cuz0 tooltip;
    private static final k24 Companion = new k24();
    private static final int HEIGHT_ROOT_EXPANDED_PX = kp50.r(178);
    private static final int HEIGHT_ROOT_COLLAPSED_PX = kp50.r(114);
    private static final int HEIGHT_INFO_EXPANDED_PX = kp50.r(70);
    private static final int HEIGHT_INFO_COLLAPSED_PX = kp50.r(1);
    private static final int HEIGHT_DROPDOWN_EXPANDED_PX = kp50.r(144);
    private static final int HEIGHT_DROPDOWN_COLLAPSED_PX = kp50.r(80);
    private static final int MONTH_MARGIN_PX = kp50.r(4);

    public static final class a implements zls {
        public static final a a = new a();

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            ((Number) obj3).intValue();
            return Boolean.valueOf(obj instanceof au3);
        }
    }

    public static final class b implements tls {
        public static final b a = new b();

        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            return LayoutInflater.from(((ViewGroup) obj).getContext());
        }
    }

    public AutoTopupSummaryView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View O;
        View O2;
        LayoutInflater.from(context).inflate(xmh0.ybsdk_autotopup_summary_view, this);
        int i2 = pah0.summaryDropdownAmount;
        SpoilerTextView spoilerTextView = (SpoilerTextView) cma1.O(i2, this);
        if (spoilerTextView != null) {
            i2 = pah0.summaryDropdownArrow;
            AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i2, this);
            if (appCompatImageView != null && (O = cma1.O((i2 = pah0.summaryDropdownBackground), this)) != null) {
                i2 = pah0.summaryDropdownDescription;
                TextView textView = (TextView) cma1.O(i2, this);
                if (textView != null) {
                    i2 = pah0.summaryDropdownIcon;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) cma1.O(i2, this);
                    if (appCompatImageView2 != null) {
                        i2 = pah0.summaryDropdownRecycler;
                        RecyclerView recyclerView = (RecyclerView) cma1.O(i2, this);
                        if (recyclerView != null) {
                            i2 = pah0.summaryInfoBackground;
                            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) cma1.O(i2, this);
                            if (shimmerFrameLayout != null && (O2 = cma1.O((i2 = pah0.summaryInfoBottomGuide), this)) != null) {
                                i2 = pah0.summaryInfoText;
                                TextView textView2 = (TextView) cma1.O(i2, this);
                                if (textView2 != null) {
                                    i2 = pah0.summaryInfoTooltipButton;
                                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) cma1.O(i2, this);
                                    if (appCompatImageView3 != null) {
                                        this.binding = new d061(this, spoilerTextView, appCompatImageView, O, textView, appCompatImageView2, recyclerView, shimmerFrameLayout, O2, textView2, appCompatImageView3);
                                        qa3 qa3Var = new qa3(hc5.a, createMonthAdapter());
                                        this.monthsAdapter = qa3Var;
                                        int i3 = 10;
                                        this.onDropDownToggle = new at3(i3);
                                        recyclerView.setAdapter(qa3Var);
                                        recyclerView.addItemDecoration(new jw00(0, 0, MONTH_MARGIN_PX, null, 11));
                                        O.setOnClickListener(new tf(i3, this));
                                        tja1.b(appCompatImageView3);
                                        tja1.b(O);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    private final m70 createMonthAdapter() {
        return new lum(new zbd(23), a.a, new at3(9), b.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c061 createMonthAdapter$lambda$7(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(xmh0.ybsdk_autotopup_summary_month_item, viewGroup, false);
        int i = pah0.summaryMonthAmount;
        SpoilerTextView spoilerTextView = (SpoilerTextView) cma1.O(i, inflate);
        if (spoilerTextView != null) {
            i = pah0.summaryMonthDescription;
            TextView textView = (TextView) cma1.O(i, inflate);
            if (textView != null) {
                return new c061((LinearLayout) inflate, spoilerTextView, textView);
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 createMonthAdapter$lambda$9(n70 n70Var) {
        n70Var.W(new ns3(n70Var, 1));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 createMonthAdapter$lambda$9$lambda$8(n70 n70Var, List list) {
        Object Z = n70Var.Z();
        Context context = n70Var.P;
        zo31 zo31Var = n70Var.N;
        int i = ((au3) Z).d ? ung0.ybColor_textIcon_primary : ung0.ybColor_textIcon_tertiary;
        c061 c061Var = (c061) zo31Var;
        xty0.d(c061Var.b, ((au3) n70Var.Z()).e);
        c061Var.b.setTextColor(rje.a(context, i));
        xty0.d(c061Var.c, ((au3) n70Var.Z()).f);
        c061Var.c.setTextColor(rje.a(context, i));
        c061Var.a.setContentDescription(((Object) d.a(context, ((au3) n70Var.Z()).e)) + "\n" + ((Object) d.a(context, ((au3) n70Var.Z()).f)));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onDropDownToggle$lambda$0(boolean z) {
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$3(AutoTopupSummaryView autoTopupSummaryView, l24 l24Var) {
        autoTopupSummaryView.binding.g.scrollToPosition(scc.f(l24Var.b));
    }

    private final void setContent(l24 state) {
        d061 d061Var = this.binding;
        if (evu0.J(d.a(getContext(), state.c).toString())) {
            hideInfo();
        } else {
            xty0.d(d061Var.j, state.c);
        }
        SpoilerTextView spoilerTextView = d061Var.b;
        View view = d061Var.d;
        TextView textView = d061Var.e;
        xty0.d(spoilerTextView, state.d);
        xty0.d(textView, state.f);
        gob1.b(d061Var.h, state.g);
        gob1.b(view, state.h);
        v4b1.k(state.a, d061Var.f, null, null, 6);
        view.setContentDescription(((Object) d061Var.b.getText()) + "\n" + ((Object) textView.getText()));
    }

    private final void setTooltip(l24 state) {
        CharSequence a2;
        Text text = state.e;
        String obj = (text == null || (a2 = d.a(getContext(), text)) == null) ? null : a2.toString();
        this.binding.k.setVisibility((obj == null || evu0.J(obj)) ? 8 : 0);
        if (obj == null || evu0.J(obj)) {
            this.binding.k.setOnClickListener(null);
        } else {
            this.binding.k.setOnClickListener(new k5(7, this, obj));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setTooltip$lambda$6(AutoTopupSummaryView autoTopupSummaryView, String str, View view) {
        j24 j24Var = new j24(0, autoTopupSummaryView);
        int i = vuz0.a;
        Tooltip$PreferredGravity tooltip$PreferredGravity = Tooltip$PreferredGravity.CENTER;
        int i2 = vuz0.a;
        buz0 buz0Var = new buz0(view.getContext());
        Text.Companion.getClass();
        buz0Var.l(new Text.Constant(str));
        buz0Var.g(tooltip$PreferredGravity);
        buz0Var.l = 0;
        buz0Var.p = i2;
        buz0Var.o = 12;
        buz0Var.d(j24Var);
        buz0Var.k(Tooltip$PreferredPosition.TOP);
        cuz0 a2 = buz0Var.a();
        autoTopupSummaryView.tooltip = a2;
        a2.f(view, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setTooltip$lambda$6$lambda$5(AutoTopupSummaryView autoTopupSummaryView, Tooltip$DismissReason tooltip$DismissReason) {
        autoTopupSummaryView.tooltip = null;
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toggleDropdown() {
        boolean z = this.dropdownExpanded;
        this.dropdownExpanded = !z;
        if (!z) {
            this.binding.g.setVisibility(0);
        }
        ValueAnimator c = AnimUtils.c(this.dropdownExpanded ? HEIGHT_ROOT_EXPANDED_PX : HEIGHT_ROOT_COLLAPSED_PX, this.binding.a);
        RecyclerView recyclerView = this.binding.g;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(recyclerView.getAlpha(), this.dropdownExpanded ? 1.0f : 0.0f);
        ofFloat.addUpdateListener(new wd2(recyclerView, 1));
        ofFloat.setDuration(200L);
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.ybsdk.feature.autotopup.internal.presentation.view.AutoTopupSummaryView$toggleDropdown$lambda$11$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                d061 d061Var;
                boolean z2;
                d061Var = AutoTopupSummaryView.this.binding;
                RecyclerView recyclerView2 = d061Var.g;
                z2 = AutoTopupSummaryView.this.dropdownExpanded;
                recyclerView2.setVisibility(z2 ? 0 : 8);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        AppCompatImageView appCompatImageView = this.binding.c;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(appCompatImageView.getRotation(), this.dropdownExpanded ? 0.0f : 180.0f);
        ofFloat2.addUpdateListener(new wd2(appCompatImageView, 2));
        ofFloat2.setDuration(200L);
        Animator[] animatorArr = {c, ofFloat, ofFloat2, AnimUtils.c(this.dropdownExpanded ? HEIGHT_DROPDOWN_EXPANDED_PX : HEIGHT_DROPDOWN_COLLAPSED_PX, this.binding.d)};
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animatorArr);
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.ybsdk.feature.autotopup.internal.presentation.view.AutoTopupSummaryView$toggleDropdown$lambda$13$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                tls tlsVar;
                boolean z2;
                tlsVar = AutoTopupSummaryView.this.onDropDownToggle;
                z2 = AutoTopupSummaryView.this.dropdownExpanded;
                tlsVar.invoke(Boolean.valueOf(z2));
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        animatorSet.start();
    }

    public final void hideInfo() {
        if (this.infoShown) {
            this.infoShown = false;
            cuz0 cuz0Var = this.tooltip;
            if (cuz0Var != null) {
                cuz0Var.d();
            }
            AnimUtils.c(HEIGHT_INFO_COLLAPSED_PX, this.binding.h).start();
            this.binding.j.setImportantForAccessibility(2);
            this.binding.k.setImportantForAccessibility(2);
        }
    }

    public final void render(l24 state) {
        setContent(state);
        setTooltip(state);
        this.monthsAdapter.h(state.b, new mh3(4, this, state));
    }

    public final void setOnDropDownToggleAction(tls action) {
        this.onDropDownToggle = action;
    }

    public final void showBlink() {
        this.binding.h.playShimmer(1);
    }

    public final void showInfo() {
        if (evu0.J(this.binding.j.getText())) {
            hideInfo();
            return;
        }
        if (this.infoShown) {
            showBlink();
            return;
        }
        this.infoShown = true;
        AnimUtils.c(HEIGHT_INFO_EXPANDED_PX, this.binding.h).start();
        this.binding.j.setImportantForAccessibility(1);
        this.binding.k.setImportantForAccessibility(1);
    }

    public AutoTopupSummaryView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ AutoTopupSummaryView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public AutoTopupSummaryView(Context context) {
        this(context, null, 0, 6, null);
    }
}
