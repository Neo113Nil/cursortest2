package com.ybsdk.feature.savings.internal.screens.account.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import defpackage.a10;
import defpackage.c561;
import defpackage.ccv;
import defpackage.cma1;
import defpackage.d561;
import defpackage.dcv;
import defpackage.doh0;
import defpackage.i1m0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.job1;
import defpackage.jw00;
import defpackage.kok0;
import defpackage.kp50;
import defpackage.kyg0;
import defpackage.lum;
import defpackage.m70;
import defpackage.m810;
import defpackage.n70;
import defpackage.ny61;
import defpackage.o8k0;
import defpackage.pbv;
import defpackage.qa3;
import defpackage.rbv;
import defpackage.rev;
import defpackage.s7m0;
import defpackage.t7l0;
import defpackage.t7m0;
import defpackage.tai0;
import defpackage.tbh0;
import defpackage.tls;
import defpackage.u7m0;
import defpackage.v4b1;
import defpackage.vfv;
import defpackage.vng;
import defpackage.vxj0;
import defpackage.xty0;
import defpackage.y5m0;
import defpackage.zdk0;
import defpackage.zls;
import defpackage.zo31;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 52\u00020\u0001:\u0002\u00116B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0017\u001a\u00020\r2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r0\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001b\u0010$\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001b\u0010'\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010#R\u001b\u0010*\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010!\u001a\u0004\b)\u0010#R \u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0,0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\"\u00101\u001a\u0010\u0012\f\u0012\n 0*\u0004\u0018\u00010\n0\n0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\"\u00103\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r0\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104¨\u00067"}, d2 = {"Lcom/ybsdk/feature/savings/internal/screens/account/view/SavingsAccountThemeSelectorView;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ls7m0;", DivkitThemeChangeListener.THEME_VARIABLE_NAME, "position", "Lzy11;", "onThemeClick", "(Ls7m0;I)V", "changeSelectedTheme", "Lu7m0;", "newState", "render", "(Lu7m0;)V", "Lkotlin/Function1;", "action", "setOnThemeChangeAction", "(Ltls;)V", "Lc561;", "binding", "Lc561;", "selectedTheme", "Ls7m0;", "selectedThemePosition", CA20Status.STATUS_USER_I, "themeItemWidth$delegate", "Li3y;", "getThemeItemWidth", "()I", "themeItemWidth", "themeItemHeight$delegate", "getThemeItemHeight", "themeItemHeight", "numberOfItemsThatCanBeShownOnDisplay$delegate", "getNumberOfItemsThatCanBeShownOnDisplay", "numberOfItemsThatCanBeShownOnDisplay", "Lm70;", "", "themeSelectionDelegate", "Lm70;", "Lqa3;", "kotlin.jvm.PlatformType", "adapter", "Lqa3;", "onSelectionChange", "Ltls;", "Companion", "t7m0", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SavingsAccountThemeSelectorView extends LinearLayoutCompat {
    public static final t7m0 Companion = new t7m0();
    private static final int PADDING_TOP_DP = 20;
    private static final int THEME_ITEMS_MARGIN_DP = 8;
    private static final double THEME_ITEM_TO_SCREEN_WIDTH_RATIO = 0.16d;
    private static final double THEME_ITEM_WIDTH_TO_HEIGHT_RATIO = 1.4d;
    private final qa3 adapter;
    private final c561 binding;

    /* renamed from: numberOfItemsThatCanBeShownOnDisplay$delegate, reason: from kotlin metadata */
    private final i3y numberOfItemsThatCanBeShownOnDisplay;
    private tls onSelectionChange;
    private s7m0 selectedTheme;
    private int selectedThemePosition;

    /* renamed from: themeItemHeight$delegate, reason: from kotlin metadata */
    private final i3y themeItemHeight;

    /* renamed from: themeItemWidth$delegate, reason: from kotlin metadata */
    private final i3y themeItemWidth;
    private final m70 themeSelectionDelegate;

    public static final class a implements zls {
        public static final a a = new a();

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            ((Number) obj3).intValue();
            return Boolean.valueOf(obj instanceof s7m0);
        }
    }

    public static final class b implements tls {
        public static final b a = new b();

        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            return LayoutInflater.from(((ViewGroup) obj).getContext());
        }
    }

    public SavingsAccountThemeSelectorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(doh0.ybsdk_savings_account_theme_selector, this);
        int i2 = tbh0.subtitle;
        AppCompatTextView appCompatTextView = (AppCompatTextView) cma1.O(i2, this);
        if (appCompatTextView != null) {
            i2 = tbh0.themes;
            RecyclerView recyclerView = (RecyclerView) cma1.O(i2, this);
            if (recyclerView != null) {
                i2 = tbh0.title;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) cma1.O(i2, this);
                if (appCompatTextView2 != null) {
                    this.binding = new c561(this, appCompatTextView, recyclerView, appCompatTextView2);
                    this.selectedThemePosition = -1;
                    LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
                    int i3 = 1;
                    this.themeItemWidth = kotlin.a.b(lazyThreadSafetyMode, new kok0(context, i3));
                    this.themeItemHeight = kotlin.a.b(lazyThreadSafetyMode, new y5m0(this, i3));
                    this.numberOfItemsThatCanBeShownOnDisplay = kotlin.a.b(lazyThreadSafetyMode, new o8k0(19, context, this));
                    int i4 = 12;
                    lum lumVar = new lum(new t7l0(i4, context, this), a.a, new vxj0(26, context, this), b.a);
                    this.themeSelectionDelegate = lumVar;
                    qa3 qa3Var = new qa3(new a10(i4), lumVar);
                    this.adapter = qa3Var;
                    this.onSelectionChange = new i1m0(14);
                    setOrientation(1);
                    setLayoutParams(new LinearLayoutCompat.LayoutParams(-1, -2));
                    setPadding(getPaddingLeft(), kp50.r(20), getPaddingRight(), getPaddingBottom());
                    recyclerView.setAdapter(qa3Var);
                    recyclerView.addItemDecoration(new jw00(0, kp50.r(8), 0, new i1m0(15), 5));
                    return;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$11(int i) {
        return i > 0;
    }

    private final void changeSelectedTheme(s7m0 theme, int position) {
        this.selectedTheme = theme;
        qa3 qa3Var = this.adapter;
        if (position == -1) {
            qa3Var.notifyDataSetChanged();
        } else {
            qa3Var.notifyItemChanged(this.selectedThemePosition);
            this.adapter.notifyItemChanged(position);
        }
        this.selectedThemePosition = position;
    }

    private final int getNumberOfItemsThatCanBeShownOnDisplay() {
        return ((Number) this.numberOfItemsThatCanBeShownOnDisplay.getValue()).intValue();
    }

    private final int getThemeItemHeight() {
        return ((Number) this.themeItemHeight.getValue()).intValue();
    }

    private final int getThemeItemWidth() {
        return ((Number) this.themeItemWidth.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int numberOfItemsThatCanBeShownOnDisplay_delegate$lambda$2(Context context, SavingsAccountThemeSelectorView savingsAccountThemeSelectorView) {
        return context.getResources().getDisplayMetrics().widthPixels / (kp50.r(8) + savingsAccountThemeSelectorView.getThemeItemWidth());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onSelectionChange$lambda$10(s7m0 s7m0Var) {
        return zy11.a;
    }

    private final void onThemeClick(s7m0 theme, int position) {
        changeSelectedTheme(theme, position);
        this.onSelectionChange.invoke(theme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int themeItemHeight_delegate$lambda$1(SavingsAccountThemeSelectorView savingsAccountThemeSelectorView) {
        return m810.a(savingsAccountThemeSelectorView.getThemeItemWidth() * THEME_ITEM_WIDTH_TO_HEIGHT_RATIO);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int themeItemWidth_delegate$lambda$0(Context context) {
        return m810.a(context.getResources().getDisplayMetrics().widthPixels * THEME_ITEM_TO_SCREEN_WIDTH_RATIO);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d561 themeSelectionDelegate$lambda$5(Context context, SavingsAccountThemeSelectorView savingsAccountThemeSelectorView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(doh0.ybsdk_savings_account_theme_selector_item, viewGroup, false);
        int i = tbh0.button;
        View O = cma1.O(i, inflate);
        if (O != null) {
            i = tbh0.themeSelectorPreview;
            AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i, inflate);
            if (appCompatImageView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                d561 d561Var = new d561(constraintLayout, O, appCompatImageView);
                appCompatImageView.setClipToOutline(true);
                appCompatImageView.setBackground(vng.t(kyg0.ybsdk_savings_account_theme_selector_item_background, context));
                ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
                if (layoutParams == null) {
                    ny61.t("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    return null;
                }
                layoutParams.width = savingsAccountThemeSelectorView.getThemeItemWidth();
                layoutParams.height = savingsAccountThemeSelectorView.getThemeItemHeight();
                constraintLayout.setLayoutParams(layoutParams);
                return d561Var;
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 themeSelectionDelegate$lambda$9(Context context, SavingsAccountThemeSelectorView savingsAccountThemeSelectorView, n70 n70Var) {
        n70Var.W(new zdk0(16, n70Var, context, savingsAccountThemeSelectorView));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 themeSelectionDelegate$lambda$9$lambda$8(n70 n70Var, Context context, SavingsAccountThemeSelectorView savingsAccountThemeSelectorView, List list) {
        rbv f;
        zo31 zo31Var = n70Var.N;
        AppCompatImageView appCompatImageView = ((d561) zo31Var).c;
        appCompatImageView.setBackgroundTintList(ColorStateList.valueOf(((s7m0) n70Var.Z()).c.get(context)));
        ThemedImageUrlEntity themedImageUrlEntity = ((s7m0) n70Var.Z()).p;
        if (themedImageUrlEntity != null && (f = job1.f(themedImageUrlEntity, new i1m0(13))) != null) {
            v4b1.k(f, appCompatImageView, null, null, 6);
        }
        d561 d561Var = (d561) zo31Var;
        d561Var.a.setForeground(jl40.l(n70Var.Z(), savingsAccountThemeSelectorView.selectedTheme) ? vng.t(kyg0.ybsdk_savings_account_theme_selector_current_item_foreground, context) : null);
        d561Var.a.setOnClickListener(new tai0(7, savingsAccountThemeSelectorView, n70Var));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rbv themeSelectionDelegate$lambda$9$lambda$8$lambda$6(String str) {
        return new pbv(str, (ccv) null, rev.f, (dcv) null, (vfv) null, 58);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void themeSelectionDelegate$lambda$9$lambda$8$lambda$7(SavingsAccountThemeSelectorView savingsAccountThemeSelectorView, n70 n70Var, View view) {
        savingsAccountThemeSelectorView.onThemeClick((s7m0) n70Var.Z(), n70Var.F());
    }

    public final void render(u7m0 newState) {
        s7m0 s7m0Var = newState.d;
        List list = newState.c;
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (jl40.l((s7m0) it.next(), s7m0Var)) {
                break;
            } else {
                i++;
            }
        }
        int numberOfItemsThatCanBeShownOnDisplay = i - (getNumberOfItemsThatCanBeShownOnDisplay() / 2);
        int i2 = numberOfItemsThatCanBeShownOnDisplay >= 0 ? numberOfItemsThatCanBeShownOnDisplay : 0;
        this.selectedThemePosition = i;
        this.binding.c.scrollToPosition(i2);
        if (s7m0Var == null) {
            s7m0Var = (s7m0) kotlin.collections.a.S(this.selectedThemePosition, list);
        }
        this.selectedTheme = s7m0Var;
        this.adapter.g(list);
        xty0.d(this.binding.d, newState.a);
        xty0.d(this.binding.b, newState.b);
    }

    public final void setOnThemeChangeAction(tls action) {
        this.onSelectionChange = action;
    }

    public SavingsAccountThemeSelectorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ SavingsAccountThemeSelectorView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public SavingsAccountThemeSelectorView(Context context) {
        this(context, null, 0, 6, null);
    }
}
