package com.ybsdk.feature.savings.internal.screens.account.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.core.design.spoiler.SpoilerTextView;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.savings.internal.screens.account.view.FundIncomeWidgetView;
import defpackage.cma1;
import defpackage.cmi;
import defpackage.doh0;
import defpackage.dzh0;
import defpackage.ejp;
import defpackage.g8e;
import defpackage.iwg0;
import defpackage.kyg0;
import defpackage.m810;
import defpackage.ny61;
import defpackage.p561;
import defpackage.pos;
import defpackage.scc;
import defpackage.sls;
import defpackage.sos;
import defpackage.sxo;
import defpackage.tbh0;
import defpackage.tcc;
import defpackage.tls;
import defpackage.tos;
import defpackage.uqs;
import defpackage.v8m0;
import defpackage.vng;
import defpackage.w8m0;
import defpackage.wls;
import defpackage.wtn;
import defpackage.x8m0;
import defpackage.xty0;
import defpackage.y6i0;
import defpackage.ynn;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 >2\u00020\u0001:\u0002\"?B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\fJ\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\fJ\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\fJ\u000f\u0010\u0013\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\fJ\u000f\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\fJw\u0010 \u001a\u00020\n2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\n0\u00152\u001e\u0010\u0019\u001a\u001a\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\u00182\u0018\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\u001a2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\u001c¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010,R\u0016\u0010.\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010*R\u0018\u0010/\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R$\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R0\u00103\u001a\u001c\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R*\u00105\u001a\u0016\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u001e\u00107\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u001e\u00109\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00108R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020;0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006@"}, d2 = {"Lcom/ybsdk/feature/savings/internal/screens/account/view/FundIncomeWidgetView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "setupChartTouchArea", "()V", "position", "onChipClick", "(I)V", "notifyChartScrubStart", "onPeriodSelected", "createChips", "scrollToSelectedChip", "updateChipsSelection", "Lkotlin/Function1;", "", "onInfoClickCallback", "Lkotlin/Function3;", "onPeriodChangeCallback", "Lkotlin/Function2;", "onChartScrubStartCallback", "Lkotlin/Function0;", "", "isAnimationAllowedCallback", "onAnimationEndCallback", "setCallbacks", "(Ltls;Lzls;Lwls;Lsls;Lsls;)V", "Ltos;", ClidProvider.STATE, "render", "(Ltos;)V", "Lp561;", "binding", "Lp561;", "chipSpacing", CA20Status.STATUS_USER_I, "accessibilityTextSelected", "Ljava/lang/String;", "accessibilityTextUnselected", "selectedPeriodIndex", "currentState", "Ltos;", "onInfoClick", "Ltls;", "onPeriodChange", "Lzls;", "onChartScrubStart", "Lwls;", "isAnimationAllowed", "Lsls;", "onAnimationEnd", "", "Landroid/widget/TextView;", "chipViews", "Ljava/util/List;", "Companion", "sos", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FundIncomeWidgetView extends ConstraintLayout {

    @Deprecated
    public static final long ANIMATION_START_DELAY_MS = 500;
    private static final sos Companion = new sos();
    private final String accessibilityTextSelected;
    private final String accessibilityTextUnselected;
    private final p561 binding;
    private final int chipSpacing;
    private final List<TextView> chipViews;
    private tos currentState;
    private sls isAnimationAllowed;
    private sls onAnimationEnd;
    private wls onChartScrubStart;
    private tls onInfoClick;
    private zls onPeriodChange;
    private int selectedPeriodIndex;

    public FundIncomeWidgetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(doh0.ybsdk_savings_view_fund_income, this);
        int i2 = tbh0.chart;
        FundIncomeChartView fundIncomeChartView = (FundIncomeChartView) cma1.O(i2, this);
        if (fundIncomeChartView != null) {
            i2 = tbh0.dateEnd;
            AppCompatTextView appCompatTextView = (AppCompatTextView) cma1.O(i2, this);
            if (appCompatTextView != null) {
                i2 = tbh0.dateStart;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) cma1.O(i2, this);
                if (appCompatTextView2 != null) {
                    i2 = tbh0.description;
                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) cma1.O(i2, this);
                    if (appCompatTextView3 != null) {
                        i2 = tbh0.income;
                        SpoilerTextView spoilerTextView = (SpoilerTextView) cma1.O(i2, this);
                        if (spoilerTextView != null) {
                            i2 = tbh0.infoButton;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i2, this);
                            if (appCompatImageView != null) {
                                i2 = tbh0.periodChips;
                                LinearLayout linearLayout = (LinearLayout) cma1.O(i2, this);
                                if (linearLayout != null) {
                                    i2 = tbh0.periodChipsScroll;
                                    HorizontalScrollView horizontalScrollView = (HorizontalScrollView) cma1.O(i2, this);
                                    if (horizontalScrollView != null) {
                                        i2 = tbh0.title;
                                        AppCompatTextView appCompatTextView4 = (AppCompatTextView) cma1.O(i2, this);
                                        if (appCompatTextView4 != null) {
                                            this.binding = new p561(this, fundIncomeChartView, appCompatTextView, appCompatTextView2, appCompatTextView3, spoilerTextView, appCompatImageView, linearLayout, horizontalScrollView, appCompatTextView4);
                                            this.chipSpacing = context.getResources().getDimensionPixelSize(iwg0.ybsdk_savings_fund_income_chip_spacing);
                                            this.accessibilityTextSelected = context.getString(dzh0.ybsdk_common_accessibility_selected);
                                            this.accessibilityTextUnselected = context.getString(dzh0.ybsdk_common_accessibility_unselected);
                                            this.chipViews = new ArrayList();
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

    private final void createChips() {
        tos tosVar = this.currentState;
        if (tosVar == null) {
            return;
        }
        this.binding.h.removeAllViews();
        this.chipViews.clear();
        int i = 0;
        for (Object obj : tosVar.a.f) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(doh0.ybsdk_savings_fund_income_chip, (ViewGroup) this.binding.h, false);
            textView.setText(d.a(getContext(), ((v8m0) obj).b));
            textView.setOnClickListener(new wtn(this, i, 2));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2, 1.0f);
            layoutParams.setMarginStart(i == 0 ? 0 : this.chipSpacing);
            textView.setLayoutParams(layoutParams);
            this.chipViews.add(textView);
            this.binding.h.addView(textView);
            i = i2;
        }
        updateChipsSelection();
        HorizontalScrollView horizontalScrollView = this.binding.i;
        horizontalScrollView.post(new uqs(7, horizontalScrollView, this));
    }

    private final void notifyChartScrubStart() {
        wls wlsVar;
        tos tosVar = this.currentState;
        if (tosVar == null || (wlsVar = this.onChartScrubStart) == null) {
            return;
        }
        wlsVar.invoke(tosVar.a.c, Integer.valueOf(this.selectedPeriodIndex));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onChipClick(int position) {
        int i;
        tos tosVar = this.currentState;
        if (tosVar == null || position == (i = this.selectedPeriodIndex)) {
            return;
        }
        this.selectedPeriodIndex = position;
        updateChipsSelection();
        scrollToSelectedChip();
        onPeriodSelected();
        zls zlsVar = this.onPeriodChange;
        if (zlsVar != null) {
            zlsVar.invoke(tosVar.a.c, Integer.valueOf(i), Integer.valueOf(position));
        }
    }

    private final void onPeriodSelected() {
        tos tosVar = this.currentState;
        if (tosVar == null) {
            return;
        }
        v8m0 v8m0Var = (v8m0) a.S(this.selectedPeriodIndex, tosVar.a.f);
        if (v8m0Var == null) {
            return;
        }
        Text.Constant constant = v8m0Var.d;
        Text.Constant constant2 = v8m0Var.c;
        xty0.d(this.binding.e, constant2);
        xty0.d(this.binding.d, v8m0Var.e);
        xty0.d(this.binding.c, v8m0Var.f);
        ArrayList<w8m0> arrayList = v8m0Var.g;
        if (arrayList.isEmpty()) {
            xty0.d(this.binding.f, constant);
            xty0.d(this.binding.e, constant2);
            final int i = 0;
            this.binding.b.render(EmptyList.a, (r15 & 2) != 0 ? false : false, (r15 & 4) != 0 ? 0L : 0L, (r15 & 8) != 0 ? null : null, (r15 & 16) != 0 ? null : null, (r15 & 32) != 0 ? null : new sls(this) { // from class: ros
                public final /* synthetic */ FundIncomeWidgetView b;

                {
                    this.b = this;
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    zy11 onPeriodSelected$lambda$3;
                    zy11 onPeriodSelected$lambda$8;
                    zy11 onPeriodSelected$lambda$9;
                    int i2 = i;
                    FundIncomeWidgetView fundIncomeWidgetView = this.b;
                    switch (i2) {
                        case 0:
                            onPeriodSelected$lambda$3 = FundIncomeWidgetView.onPeriodSelected$lambda$3(fundIncomeWidgetView);
                            return onPeriodSelected$lambda$3;
                        case 1:
                            onPeriodSelected$lambda$8 = FundIncomeWidgetView.onPeriodSelected$lambda$8(fundIncomeWidgetView);
                            return onPeriodSelected$lambda$8;
                        default:
                            onPeriodSelected$lambda$9 = FundIncomeWidgetView.onPeriodSelected$lambda$9(fundIncomeWidgetView);
                            return onPeriodSelected$lambda$9;
                    }
                }
            });
            return;
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        for (w8m0 w8m0Var : arrayList) {
            arrayList2.add(new pos(w8m0Var.a, d.a(getContext(), w8m0Var.b), d.a(getContext(), w8m0Var.c), d.a(getContext(), w8m0Var.d)));
        }
        ynn ynnVar = new ynn(6, arrayList, this, v8m0Var);
        sls slsVar = this.isAnimationAllowed;
        if (slsVar != null) {
            final int i2 = 1;
            if (((Boolean) slsVar.invoke()).booleanValue()) {
                SpoilerTextView spoilerTextView = this.binding.f;
                w8m0 w8m0Var2 = (w8m0) a.R(arrayList);
                xty0.d(spoilerTextView, w8m0Var2 != null ? w8m0Var2.b : null);
                this.binding.b.render(arrayList2, true, 500L, new sxo(20, arrayList, this), ynnVar, new sls(this) { // from class: ros
                    public final /* synthetic */ FundIncomeWidgetView b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.sls
                    public final Object invoke() {
                        zy11 onPeriodSelected$lambda$3;
                        zy11 onPeriodSelected$lambda$8;
                        zy11 onPeriodSelected$lambda$9;
                        int i22 = i2;
                        FundIncomeWidgetView fundIncomeWidgetView = this.b;
                        switch (i22) {
                            case 0:
                                onPeriodSelected$lambda$3 = FundIncomeWidgetView.onPeriodSelected$lambda$3(fundIncomeWidgetView);
                                return onPeriodSelected$lambda$3;
                            case 1:
                                onPeriodSelected$lambda$8 = FundIncomeWidgetView.onPeriodSelected$lambda$8(fundIncomeWidgetView);
                                return onPeriodSelected$lambda$8;
                            default:
                                onPeriodSelected$lambda$9 = FundIncomeWidgetView.onPeriodSelected$lambda$9(fundIncomeWidgetView);
                                return onPeriodSelected$lambda$9;
                        }
                    }
                });
                return;
            }
        }
        xty0.d(this.binding.f, constant);
        final int i3 = 2;
        this.binding.b.render(arrayList2, (r15 & 2) != 0 ? false : false, (r15 & 4) != 0 ? 0L : 0L, (r15 & 8) != 0 ? null : null, (r15 & 16) != 0 ? null : ynnVar, (r15 & 32) != 0 ? null : new sls(this) { // from class: ros
            public final /* synthetic */ FundIncomeWidgetView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 onPeriodSelected$lambda$3;
                zy11 onPeriodSelected$lambda$8;
                zy11 onPeriodSelected$lambda$9;
                int i22 = i3;
                FundIncomeWidgetView fundIncomeWidgetView = this.b;
                switch (i22) {
                    case 0:
                        onPeriodSelected$lambda$3 = FundIncomeWidgetView.onPeriodSelected$lambda$3(fundIncomeWidgetView);
                        return onPeriodSelected$lambda$3;
                    case 1:
                        onPeriodSelected$lambda$8 = FundIncomeWidgetView.onPeriodSelected$lambda$8(fundIncomeWidgetView);
                        return onPeriodSelected$lambda$8;
                    default:
                        onPeriodSelected$lambda$9 = FundIncomeWidgetView.onPeriodSelected$lambda$9(fundIncomeWidgetView);
                        return onPeriodSelected$lambda$9;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onPeriodSelected$lambda$3(FundIncomeWidgetView fundIncomeWidgetView) {
        fundIncomeWidgetView.notifyChartScrubStart();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onPeriodSelected$lambda$6(List list, FundIncomeWidgetView fundIncomeWidgetView, v8m0 v8m0Var, Integer num) {
        if (num != null) {
            w8m0 w8m0Var = (w8m0) a.S(num.intValue(), list);
            if (w8m0Var != null) {
                xty0.d(fundIncomeWidgetView.binding.f, w8m0Var.d);
                xty0.d(fundIncomeWidgetView.binding.e, w8m0Var.c);
            }
        } else {
            xty0.d(fundIncomeWidgetView.binding.f, v8m0Var.d);
            xty0.d(fundIncomeWidgetView.binding.e, v8m0Var.c);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onPeriodSelected$lambda$7(List list, FundIncomeWidgetView fundIncomeWidgetView, float f) {
        sls slsVar;
        int d = y6i0.d(m810.b((list.size() - 1) * f), 0, scc.f(list));
        xty0.d(fundIncomeWidgetView.binding.f, ((w8m0) list.get(d)).b);
        xty0.d(fundIncomeWidgetView.binding.e, ((w8m0) list.get(d)).c);
        if (f >= 1.0f && (slsVar = fundIncomeWidgetView.onAnimationEnd) != null) {
            slsVar.invoke();
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onPeriodSelected$lambda$8(FundIncomeWidgetView fundIncomeWidgetView) {
        fundIncomeWidgetView.notifyChartScrubStart();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onPeriodSelected$lambda$9(FundIncomeWidgetView fundIncomeWidgetView) {
        fundIncomeWidgetView.notifyChartScrubStart();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scrollToSelectedChip() {
        TextView textView = (TextView) a.S(this.selectedPeriodIndex, this.chipViews);
        if (textView == null) {
            return;
        }
        int left = textView.getLeft() - ((this.binding.i.getWidth() - textView.getWidth()) / 2);
        HorizontalScrollView horizontalScrollView = this.binding.i;
        if (left < 0) {
            left = 0;
        }
        horizontalScrollView.scrollTo(left, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setCallbacks$lambda$1(FundIncomeWidgetView fundIncomeWidgetView, View view) {
        x8m0 x8m0Var;
        String str;
        tls tlsVar;
        tos tosVar = fundIncomeWidgetView.currentState;
        if (tosVar == null || (x8m0Var = tosVar.a) == null || (str = x8m0Var.e) == null || (tlsVar = fundIncomeWidgetView.onInfoClick) == null) {
            return;
        }
        tlsVar.invoke(str);
    }

    private final void setupChartTouchArea() {
        this.binding.b.post(new ejp(15, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupChartTouchArea$lambda$2(FundIncomeWidgetView fundIncomeWidgetView) {
        Rect rect = new Rect();
        fundIncomeWidgetView.binding.b.getHitRect(rect);
        Rect rect2 = new Rect();
        fundIncomeWidgetView.binding.e.getHitRect(rect2);
        rect.top = rect2.top;
        Object parent = fundIncomeWidgetView.binding.b.getParent();
        View view = parent instanceof View ? (View) parent : null;
        if (view != null) {
            view.setTouchDelegate(new TouchDelegate(rect, fundIncomeWidgetView.binding.b));
        }
    }

    private final void updateChipsSelection() {
        int i = 0;
        for (Object obj : this.chipViews) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            TextView textView = (TextView) obj;
            boolean z = i == this.selectedPeriodIndex;
            textView.setBackground(z ? vng.t(kyg0.ybsdk_savings_fund_income_chip_selected_background, getContext()) : vng.t(kyg0.ybsdk_savings_fund_income_chip_background, getContext()));
            CharSequence text = textView.getText();
            textView.setContentDescription(((Object) text) + (z ? g8e.o(Extension.FIX_SPACE, this.accessibilityTextSelected) : g8e.o(Extension.FIX_SPACE, this.accessibilityTextUnselected)));
            i = i2;
        }
    }

    public final void render(tos state) {
        this.currentState = state;
        x8m0 x8m0Var = state.a;
        int f = scc.f(x8m0Var.f);
        if (f < 0) {
            f = 0;
        }
        this.selectedPeriodIndex = f;
        xty0.d(this.binding.j, x8m0Var.d);
        createChips();
        setupChartTouchArea();
        onPeriodSelected();
    }

    public final void setCallbacks(tls onInfoClickCallback, zls onPeriodChangeCallback, wls onChartScrubStartCallback, sls isAnimationAllowedCallback, sls onAnimationEndCallback) {
        this.onInfoClick = onInfoClickCallback;
        this.onPeriodChange = onPeriodChangeCallback;
        this.onChartScrubStart = onChartScrubStartCallback;
        this.isAnimationAllowed = isAnimationAllowedCallback;
        this.onAnimationEnd = onAnimationEndCallback;
        this.binding.g.setOnClickListener(new cmi(26, this));
    }

    public FundIncomeWidgetView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ FundIncomeWidgetView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public FundIncomeWidgetView(Context context) {
        this(context, null, 0, 6, null);
    }
}
