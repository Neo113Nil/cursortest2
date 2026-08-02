package com.ybsdk.feature.savings.internal.screens.account.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ybsdk.core.design.spoiler.SpoilerTextView;
import com.ybsdk.core.utils.text.d;
import defpackage.a9m0;
import defpackage.adm0;
import defpackage.b9m0;
import defpackage.bdm0;
import defpackage.cdm0;
import defpackage.cma1;
import defpackage.doh0;
import defpackage.dzh0;
import defpackage.evu0;
import defpackage.g8e;
import defpackage.g8m0;
import defpackage.jl40;
import defpackage.kyg0;
import defpackage.lum;
import defpackage.m561;
import defpackage.mpv;
import defpackage.n70;
import defpackage.ny61;
import defpackage.o8k0;
import defpackage.q561;
import defpackage.qa3;
import defpackage.scc;
import defpackage.sls;
import defpackage.t1m0;
import defpackage.tai0;
import defpackage.tbh0;
import defpackage.tls;
import defpackage.vng;
import defpackage.xty0;
import defpackage.y8m0;
import defpackage.ycm0;
import defpackage.yhp0;
import defpackage.z8m0;
import defpackage.zcm0;
import defpackage.zls;
import defpackage.zo31;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0002\u001c\"\b\u0000\u0018\u0000 R2\u00020\u0001:\u00021SB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001a\u0010\u0017J\u000f\u0010\u001b\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001b\u0010\u0017J\u000f\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e0\u001fH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$JE\u0010*\u001a\u00020\u00102\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00100%2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00100%2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00100%2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00100%¢\u0006\u0004\b*\u0010+J#\u0010/\u001a\u00020\u00102\u0014\u0010.\u001a\u0010\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u0010\u0018\u00010,¢\u0006\u0004\b/\u00100J\u0015\u00103\u001a\u00020\u00102\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010:\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010<\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010>\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010=R\u0016\u0010@\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010B\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010D\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010F\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010CR\u0016\u0010G\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010=R\u001e\u0010H\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u001e\u0010J\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010IR\u001e\u0010K\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010IR\u001e\u0010L\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010IR\u0018\u0010N\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010P\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010Q¨\u0006T"}, d2 = {"Lcom/ybsdk/feature/savings/internal/screens/account/view/SavingsIncomeProgressView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "calculateProgressAnimationDuration", "()J", MetaDataField.DATE_FIELD, "Lz8m0;", "period", "Lzy11;", "onProgressEndScroll", "(ILz8m0;)V", "position", "onPeriodClick", "(Lz8m0;I)V", "onPeriodChange", "()V", "onDateChange", "(I)V", "makePeriodsWrapContent", "makePeriodsMatchParent", "bdm0", "createItemDiffCallback", "()Lbdm0;", "Lqa3;", "createPeriodsAdapter", "()Lqa3;", "cdm0", "createScroller", "()Lcdm0;", "Lkotlin/Function0;", "onChartEndCallback", "onPeriodTapCallback", "onPeriodsScrollCallback", "onAppearanceAnimationEndCallback", "setCallbacks", "(Lsls;Lsls;Lsls;Lsls;)V", "Lkotlin/Function1;", "", "listener", "setProgressTouchedListener", "(Ltls;)V", "Ladm0;", ClidProvider.STATE, "render", "(Ladm0;)V", "Lq561;", "binding", "Lq561;", "adapter", "Lqa3;", "selectedPeriod", "Lz8m0;", "shouldPlayAppearAnimation", "Z", "isAppearAnimationAlreadyShown", "La9m0;", "progressAnimationDuration", "La9m0;", "selectedPeriodPosition", CA20Status.STATUS_USER_I, "currentState", "Ladm0;", "currDateOnProgressView", "isCurrentPositionScrollEnd", "onPeriodTap", "Lsls;", "onChartEnd", "onPeriodsScroll", "onAppearanceAnimationEnd", "Lyhp0;", "periodsScrollListener", "Lyhp0;", "scroller", "Lcdm0;", "Companion", "zcm0", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SavingsIncomeProgressView extends ConstraintLayout {
    public static final zcm0 Companion = new zcm0();
    private static final long MAX_DEFAULT_ANIMATION_DURATION_MS = 750;
    private static final long MIN_DEFAULT_ANIMATION_DURATION_MS = 300;
    private final qa3 adapter;
    private final q561 binding;
    private int currDateOnProgressView;
    private adm0 currentState;
    private boolean isAppearAnimationAlreadyShown;
    private boolean isCurrentPositionScrollEnd;
    private sls onAppearanceAnimationEnd;
    private sls onChartEnd;
    private sls onPeriodTap;
    private sls onPeriodsScroll;
    private yhp0 periodsScrollListener;
    private a9m0 progressAnimationDuration;
    private final cdm0 scroller;
    private z8m0 selectedPeriod;
    private int selectedPeriodPosition;
    private boolean shouldPlayAppearAnimation;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.ybsdk.feature.savings.internal.screens.account.view.SavingsIncomeProgressView$1, reason: invalid class name */
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements tls {
        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            ((SavingsIncomeProgressView) this.receiver).onDateChange(((Number) obj).intValue());
            return zy11.a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.ybsdk.feature.savings.internal.screens.account.view.SavingsIncomeProgressView$2, reason: invalid class name */
    public /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements sls {
        @Override // defpackage.sls
        public final Object invoke() {
            return Long.valueOf(((SavingsIncomeProgressView) this.receiver).calculateProgressAnimationDuration());
        }
    }

    public static final class a implements zls {
        public static final a a = new a();

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            ((Number) obj3).intValue();
            return Boolean.valueOf(obj instanceof z8m0);
        }
    }

    public static final class b implements tls {
        public static final b a = new b();

        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            return LayoutInflater.from(((ViewGroup) obj).getContext());
        }
    }

    public SavingsIncomeProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(doh0.ybsdk_savings_view_income, this);
        int i2 = tbh0.amount;
        SpoilerTextView spoilerTextView = (SpoilerTextView) cma1.O(i2, this);
        if (spoilerTextView != null) {
            i2 = tbh0.date;
            AppCompatTextView appCompatTextView = (AppCompatTextView) cma1.O(i2, this);
            if (appCompatTextView != null) {
                i2 = tbh0.imageLock;
                AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i2, this);
                if (appCompatImageView != null) {
                    i2 = tbh0.periodEnd;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) cma1.O(i2, this);
                    if (appCompatTextView2 != null) {
                        i2 = tbh0.periodStart;
                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) cma1.O(i2, this);
                        if (appCompatTextView3 != null) {
                            i2 = tbh0.progress;
                            IncomeProgressView incomeProgressView = (IncomeProgressView) cma1.O(i2, this);
                            if (incomeProgressView != null) {
                                i2 = tbh0.prolongationPeriods;
                                RecyclerView recyclerView = (RecyclerView) cma1.O(i2, this);
                                if (recyclerView != null) {
                                    i2 = tbh0.subtitle;
                                    AppCompatTextView appCompatTextView4 = (AppCompatTextView) cma1.O(i2, this);
                                    if (appCompatTextView4 != null) {
                                        i2 = tbh0.title;
                                        AppCompatTextView appCompatTextView5 = (AppCompatTextView) cma1.O(i2, this);
                                        if (appCompatTextView5 != null) {
                                            this.binding = new q561(this, spoilerTextView, appCompatTextView, appCompatImageView, appCompatTextView2, appCompatTextView3, incomeProgressView, recyclerView, appCompatTextView4, appCompatTextView5);
                                            qa3 createPeriodsAdapter = createPeriodsAdapter();
                                            this.adapter = createPeriodsAdapter;
                                            this.progressAnimationDuration = new a9m0(300L, MAX_DEFAULT_ANIMATION_DURATION_MS);
                                            this.selectedPeriodPosition = -1;
                                            this.scroller = createScroller();
                                            recyclerView.setAdapter(createPeriodsAdapter);
                                            incomeProgressView.setProgressListener(new AnonymousClass1(1, this, SavingsIncomeProgressView.class, "onDateChange", "onDateChange(I)V", 0));
                                            incomeProgressView.setProgressAnimationDurationCallback(new AnonymousClass2(0, this, SavingsIncomeProgressView.class, "calculateProgressAnimationDuration", "calculateProgressAnimationDuration()J", 0));
                                            return;
                                        }
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

    /* JADX INFO: Access modifiers changed from: private */
    public final long calculateProgressAnimationDuration() {
        if (this.selectedPeriod == null) {
            return 0L;
        }
        a9m0 a9m0Var = this.progressAnimationDuration;
        float abs = Math.abs(r0.i - this.currDateOnProgressView) / scc.f(r0.h);
        return (long) (((a9m0Var.b - r2) * abs) + a9m0Var.a);
    }

    private final bdm0 createItemDiffCallback() {
        return new bdm0();
    }

    private final qa3 createPeriodsAdapter() {
        return new qa3(createItemDiffCallback(), new lum(new t1m0((byte) 0, 24), a.a, new g8m0(6, this), b.a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m561 createPeriodsAdapter$lambda$4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(doh0.ybsdk_savings_income_item_period, viewGroup, false);
        int i = tbh0.dateEnd;
        AppCompatTextView appCompatTextView = (AppCompatTextView) cma1.O(i, inflate);
        if (appCompatTextView != null) {
            i = tbh0.dateStart;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) cma1.O(i, inflate);
            if (appCompatTextView2 != null) {
                i = tbh0.yearEnd;
                AppCompatTextView appCompatTextView3 = (AppCompatTextView) cma1.O(i, inflate);
                if (appCompatTextView3 != null) {
                    i = tbh0.yearStart;
                    AppCompatTextView appCompatTextView4 = (AppCompatTextView) cma1.O(i, inflate);
                    if (appCompatTextView4 != null) {
                        return new m561((ConstraintLayout) inflate, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4);
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 createPeriodsAdapter$lambda$7(SavingsIncomeProgressView savingsIncomeProgressView, n70 n70Var) {
        Context context = n70Var.P;
        n70Var.W(new ycm0(n70Var, savingsIncomeProgressView, context.getString(dzh0.ybsdk_common_accessibility_selected), context.getString(dzh0.ybsdk_common_accessibility_unselected), 0));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 createPeriodsAdapter$lambda$7$lambda$6(n70 n70Var, SavingsIncomeProgressView savingsIncomeProgressView, String str, String str2, List list) {
        String str3;
        zo31 zo31Var = n70Var.N;
        Context context = n70Var.P;
        xty0.d(((m561) zo31Var).b, ((z8m0) n70Var.Z()).f);
        m561 m561Var = (m561) n70Var.N;
        xty0.d(m561Var.c, ((z8m0) n70Var.Z()).d);
        xty0.d(m561Var.d, ((z8m0) n70Var.Z()).g);
        xty0.d(m561Var.e, ((z8m0) n70Var.Z()).e);
        m561Var.a.setBackground(jl40.l(n70Var.Z(), savingsIncomeProgressView.selectedPeriod) ? vng.t(kyg0.ybsdk_savings_income_period_background, context) : null);
        if (evu0.J(d.a(context, ((z8m0) n70Var.Z()).g))) {
            str3 = ((Object) d.a(context, ((z8m0) n70Var.Z()).d)) + " " + ((Object) d.a(context, ((z8m0) n70Var.Z()).f)) + Extension.FIX_SPACE + ((Object) d.a(context, ((z8m0) n70Var.Z()).e));
        } else {
            str3 = ((Object) d.a(context, ((z8m0) n70Var.Z()).d)) + " " + ((Object) d.a(context, ((z8m0) n70Var.Z()).e)) + Extension.FIX_SPACE + ((Object) d.a(context, ((z8m0) n70Var.Z()).f)) + " " + ((Object) d.a(context, ((z8m0) n70Var.Z()).g));
        }
        m561Var.a.setContentDescription(str3.concat(jl40.l(n70Var.Z(), savingsIncomeProgressView.selectedPeriod) ? g8e.o(Extension.FIX_SPACE, str) : g8e.o(Extension.FIX_SPACE, str2)));
        m561Var.a.setOnClickListener(new tai0(9, savingsIncomeProgressView, n70Var));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createPeriodsAdapter$lambda$7$lambda$6$lambda$5(SavingsIncomeProgressView savingsIncomeProgressView, n70 n70Var, View view) {
        savingsIncomeProgressView.onPeriodClick((z8m0) n70Var.Z(), n70Var.F());
    }

    private final cdm0 createScroller() {
        return new cdm0(getContext());
    }

    private final void makePeriodsMatchParent() {
        if (this.binding.h.getLayoutParams().width == -2) {
            RecyclerView recyclerView = this.binding.h;
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            if (layoutParams == null) {
                ny61.t("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            } else {
                layoutParams.width = -1;
                recyclerView.setLayoutParams(layoutParams);
            }
        }
    }

    private final void makePeriodsWrapContent() {
        if (this.binding.h.getLayoutParams().width == -1) {
            RecyclerView recyclerView = this.binding.h;
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            if (layoutParams == null) {
                ny61.t("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            } else {
                layoutParams.width = -2;
                recyclerView.setLayoutParams(layoutParams);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onDateChange(int date) {
        z8m0 z8m0Var = this.selectedPeriod;
        if (z8m0Var == null) {
            return;
        }
        this.currDateOnProgressView = date;
        y8m0 y8m0Var = (y8m0) z8m0Var.h.get(date);
        xty0.d(this.binding.c, y8m0Var.a);
        xty0.d(this.binding.b, y8m0Var.b);
        onProgressEndScroll(date, z8m0Var);
    }

    private final void onPeriodChange() {
        z8m0 z8m0Var = this.selectedPeriod;
        if (z8m0Var == null) {
            return;
        }
        this.scroller.a = this.selectedPeriodPosition;
        this.binding.d.setVisibility(z8m0Var.j ? 0 : 8);
        xty0.d(this.binding.i, z8m0Var.a);
        xty0.d(this.binding.e, z8m0Var.b);
        xty0.d(this.binding.f, z8m0Var.c);
        RecyclerView.e layoutManager = this.binding.h.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.v(this.scroller);
        }
        int f = scc.f(z8m0Var.h);
        mpv mpvVar = new mpv(0, f, z8m0Var.i);
        if (!this.shouldPlayAppearAnimation || this.isAppearAnimationAlreadyShown) {
            this.binding.g.render(mpvVar);
        } else {
            this.currDateOnProgressView = 0;
            this.binding.g.render(new mpv(0, f, 0));
            this.binding.g.animateProgress(0.0f, mpvVar.a(), calculateProgressAnimationDuration(), new o8k0(21, this, mpvVar));
        }
        this.binding.g.setEnabled(z8m0Var.k);
        sls slsVar = this.onPeriodTap;
        if (slsVar != null) {
            slsVar.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onPeriodChange$lambda$1(SavingsIncomeProgressView savingsIncomeProgressView, mpv mpvVar) {
        savingsIncomeProgressView.binding.g.render(mpvVar);
        savingsIncomeProgressView.isAppearAnimationAlreadyShown = true;
        sls slsVar = savingsIncomeProgressView.onAppearanceAnimationEnd;
        if (slsVar != null) {
            slsVar.invoke();
        }
        return zy11.a;
    }

    private final void onPeriodClick(z8m0 period, int position) {
        this.selectedPeriod = period;
        qa3 qa3Var = this.adapter;
        if (position == -1) {
            qa3Var.notifyDataSetChanged();
        } else {
            qa3Var.notifyItemChanged(this.selectedPeriodPosition);
            this.adapter.notifyItemChanged(position);
        }
        this.selectedPeriodPosition = position;
        onPeriodChange();
    }

    private final void onProgressEndScroll(int date, z8m0 period) {
        if (date != scc.f(period.h)) {
            this.isCurrentPositionScrollEnd = false;
            return;
        }
        if (date == scc.f(period.h) && !this.isCurrentPositionScrollEnd && period.k) {
            sls slsVar = this.onChartEnd;
            if (slsVar != null) {
                slsVar.invoke();
            }
            this.isCurrentPositionScrollEnd = true;
        }
    }

    public final void render(adm0 state) {
        this.currentState = state;
        this.shouldPlayAppearAnimation = state.b;
        b9m0 b9m0Var = state.a;
        this.progressAnimationDuration = b9m0Var.f;
        ArrayList arrayList = b9m0Var.e;
        this.selectedPeriod = (z8m0) kotlin.collections.a.Z(arrayList);
        this.selectedPeriodPosition = scc.f(arrayList);
        xty0.d(this.binding.j, b9m0Var.d);
        int size = arrayList.size();
        if (size == 1) {
            this.binding.h.setVisibility(8);
        } else if (size != 2) {
            makePeriodsMatchParent();
        } else {
            makePeriodsWrapContent();
        }
        this.adapter.g(arrayList);
        onPeriodChange();
    }

    public final void setCallbacks(sls onChartEndCallback, sls onPeriodTapCallback, sls onPeriodsScrollCallback, sls onAppearanceAnimationEndCallback) {
        this.onPeriodTap = onPeriodTapCallback;
        this.onChartEnd = onChartEndCallback;
        this.onPeriodsScroll = onPeriodsScrollCallback;
        this.onAppearanceAnimationEnd = onAppearanceAnimationEndCallback;
        yhp0 yhp0Var = this.periodsScrollListener;
        if (yhp0Var != null) {
            this.binding.h.removeOnScrollListener(yhp0Var);
        }
        yhp0 yhp0Var2 = new yhp0(this.onPeriodsScroll);
        this.binding.h.addOnScrollListener(yhp0Var2);
        this.periodsScrollListener = yhp0Var2;
    }

    public final void setProgressTouchedListener(tls listener) {
        this.binding.g.setTrackTouchedListener(listener);
    }

    public SavingsIncomeProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ SavingsIncomeProgressView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public SavingsIncomeProgressView(Context context) {
        this(context, null, 0, 6, null);
    }
}
