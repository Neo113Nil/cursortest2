package com.ybsdk.feature.savings.internal.screens.dashboard.v4;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.OneShotPreDrawListener;
import androidx.recyclerview.widget.RecyclerView;
import com.ybsdk.core.design.spoiler.Spoiler;
import com.ybsdk.core.design.spoiler.SpoilerTextView;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.feature.savings.internal.entities.SavingsDivEntity$ProductType;
import defpackage.bab;
import defpackage.cma1;
import defpackage.doh0;
import defpackage.dzh0;
import defpackage.evu0;
import defpackage.fbm0;
import defpackage.fi;
import defpackage.ftr0;
import defpackage.g8m0;
import defpackage.h1u;
import defpackage.iwg0;
import defpackage.j6m0;
import defpackage.j73;
import defpackage.jl40;
import defpackage.kam0;
import defpackage.lam0;
import defpackage.lbb0;
import defpackage.lia1;
import defpackage.n561;
import defpackage.ny61;
import defpackage.o8g0;
import defpackage.o8m;
import defpackage.ovt0;
import defpackage.qdm0;
import defpackage.rdm0;
import defpackage.rje;
import defpackage.rr51;
import defpackage.scm0;
import defpackage.sls;
import defpackage.ssa1;
import defpackage.tai0;
import defpackage.tbh0;
import defpackage.tdm0;
import defpackage.tls;
import defpackage.ung0;
import defpackage.v4b1;
import defpackage.vam0;
import defpackage.xty0;
import defpackage.zj;
import defpackage.zwc;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u0004\u0018\u00010\u0012*\u00020\u00112\b\b\u0002\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0010J\u001b\u0010\u0019\u001a\u00020\u000e*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001d\u0010\u001cJ\u0015\u0010 \u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J#\u0010%\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\"2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0#¢\u0006\u0004\b%\u0010&J%\u0010+\u001a\u00020\u000e2\u0016\u0010*\u001a\u0012\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\f0'j\u0002`)¢\u0006\u0004\b+\u0010,J\u0015\u0010.\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\n¢\u0006\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u00109R\u0018\u0010:\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010<\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010>R*\u0010?\u001a\u0016\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\f\u0018\u00010'j\u0004\u0018\u0001`)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006A"}, d2 = {"Lcom/ybsdk/feature/savings/internal/screens/dashboard/v4/SavingsShelfView;", "Landroidx/cardview/widget/CardView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ltdm0;", ClidProvider.STATE, "", "isSpoilerVisible", "Lzy11;", "updateHeaderAccessibility", "(Ltdm0;Z)V", "Lcom/ybsdk/core/utils/text/Text;", "", "toAccessibilityText", "(Lcom/ybsdk/core/utils/text/Text;Z)Ljava/lang/String;", "hasAccounts", "setupHeaderClickArea", "Landroid/view/View;", "expanded", "asExpandableAccessibilityButton", "(Landroid/view/View;Z)V", "startSideEffectAnimation", "()V", "onDetachedFromWindow", "Lftr0;", "callbacks", "setShelfCallbacks", "(Lftr0;)V", "Lzj;", "Lkotlin/Function0;", "saveAccountsOrderCallback", "setAccountCallbacks", "(Lzj;Lsls;)V", "Lkotlin/Function1;", "Landroid/net/Uri;", "Lcom/ybsdk/feature/divkit/api/ui/ActionHandler;", "handler", "setDivActionHandler", "(Ltls;)V", "newState", "render", "(Ltdm0;)V", "Ln561;", "binding", "Ln561;", "Lrdm0;", "animator", "Lrdm0;", "Lcom/ybsdk/feature/savings/internal/screens/dashboard/v4/e;", "accountsRecyclerHelper", "Lcom/ybsdk/feature/savings/internal/screens/dashboard/v4/e;", "Ltdm0;", "shelfCallbacks", "Lftr0;", "accountCallbacks", "Lzj;", "Lsls;", "divActionHandler", "Ltls;", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SavingsShelfView extends CardView {
    private zj accountCallbacks;
    private final e accountsRecyclerHelper;
    private final rdm0 animator;
    private final n561 binding;
    private tls divActionHandler;
    private sls saveAccountsOrderCallback;
    private ftr0 shelfCallbacks;
    private tdm0 state;

    public SavingsShelfView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View O;
        LayoutInflater.from(context).inflate(doh0.ybsdk_savings_shelf_item, this);
        int i2 = tbh0.accountsRecycler;
        RecyclerView recyclerView = (RecyclerView) cma1.O(i2, this);
        if (recyclerView != null) {
            i2 = tbh0.container;
            ConstraintLayout constraintLayout = (ConstraintLayout) cma1.O(i2, this);
            if (constraintLayout != null) {
                i2 = tbh0.divView;
                YbDivView ybDivView = (YbDivView) cma1.O(i2, this);
                if (ybDivView != null) {
                    i2 = tbh0.endIcon;
                    ImageView imageView = (ImageView) cma1.O(i2, this);
                    if (imageView != null && (O = cma1.O((i2 = tbh0.headerClickArea), this)) != null) {
                        i2 = tbh0.startIcon;
                        ImageView imageView2 = (ImageView) cma1.O(i2, this);
                        if (imageView2 != null) {
                            i2 = tbh0.subtitle;
                            SpoilerTextView spoilerTextView = (SpoilerTextView) cma1.O(i2, this);
                            if (spoilerTextView != null) {
                                i2 = tbh0.subtitleDivView;
                                YbDivView ybDivView2 = (YbDivView) cma1.O(i2, this);
                                if (ybDivView2 != null) {
                                    i2 = tbh0.title;
                                    TextView textView = (TextView) cma1.O(i2, this);
                                    if (textView != null) {
                                        n561 n561Var = new n561(this, recyclerView, constraintLayout, ybDivView, imageView, O, imageView2, spoilerTextView, ybDivView2, textView);
                                        this.binding = n561Var;
                                        this.animator = new rdm0(n561Var);
                                        int i3 = 9;
                                        this.accountsRecyclerHelper = new e(recyclerView, new bab(i3, this), new g8m0(i3, this), new lbb0(17, this), new j6m0(6, this));
                                        setCardElevation(0.0f);
                                        setRadius(getResources().getDimension(iwg0.ybsdk_savings_shelf_corner_radius));
                                        setCardBackgroundColor(rje.a(context, ung0.ybColor_fill_default_0));
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 accountsRecyclerHelper$lambda$1(SavingsShelfView savingsShelfView, int i) {
        String str;
        zj zjVar;
        kam0 b;
        tdm0 tdm0Var = savingsShelfView.state;
        if (tdm0Var != null && (str = tdm0Var.c) != null && (zjVar = savingsShelfView.accountCallbacks) != null) {
            c cVar = (c) zjVar;
            lam0 lam0Var = ((fbm0) cVar.X()).d;
            if (lam0Var == null || (b = lam0Var.b(str)) == null) {
                c.k0(str, "Target shelf is null", null);
            } else {
                Object S = kotlin.collections.a.S(i, b.g);
                scm0 scm0Var = S instanceof scm0 ? (scm0) S : null;
                if (scm0Var == null) {
                    c.k0(str, "Target account is null", null);
                } else {
                    o8g0 o8g0Var = cVar.H;
                    SavingsDivEntity$ProductType savingsDivEntity$ProductType = scm0Var.j;
                    String str2 = scm0Var.e;
                    String b2 = str2 != null ? ssa1.b(str2) : null;
                    if (b2 == null) {
                        b2 = "";
                    }
                    o8g0Var.n(i, b2, savingsDivEntity$ProductType);
                }
            }
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 accountsRecyclerHelper$lambda$3(SavingsShelfView savingsShelfView, int i, int i2) {
        String str;
        zj zjVar;
        tdm0 tdm0Var = savingsShelfView.state;
        if (tdm0Var != null && (str = tdm0Var.c) != null && (zjVar = savingsShelfView.accountCallbacks) != null) {
            c cVar = (c) zjVar;
            if (i != i2) {
                cVar.a0(new h1u(str, cVar, i, i2));
            }
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 accountsRecyclerHelper$lambda$4(SavingsShelfView savingsShelfView) {
        sls slsVar = savingsShelfView.saveAccountsOrderCallback;
        if (slsVar != null) {
            slsVar.invoke();
        }
        return zy11.a;
    }

    private final void asExpandableAccessibilityButton(View view, boolean z) {
        androidx.core.view.b.p(view, new fi(z, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 render$lambda$5(SavingsShelfView savingsShelfView, tdm0 tdm0Var, boolean z) {
        savingsShelfView.updateHeaderAccessibility(tdm0Var, z);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$7(boolean z, SavingsShelfView savingsShelfView, tdm0 tdm0Var, View view) {
        if (z) {
            ftr0 ftr0Var = savingsShelfView.shelfCallbacks;
            if (ftr0Var != null) {
                ((c) ftr0Var).h0(tdm0Var.c);
            }
            savingsShelfView.startSideEffectAnimation();
        }
    }

    private final void setupHeaderClickArea(tdm0 state, boolean hasAccounts) {
        this.binding.f.setImportantForAccessibility(1);
        this.binding.f.setFocusable(true);
        n561 n561Var = this.binding;
        if (hasAccounts) {
            n561Var.f.setOnClickListener(new tai0(11, this, state));
            asExpandableAccessibilityButton(this.binding.f, state.k);
        } else {
            n561Var.f.setOnClickListener(null);
            this.binding.f.setClickable(false);
            androidx.core.view.b.p(this.binding.f, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupHeaderClickArea$lambda$9(SavingsShelfView savingsShelfView, tdm0 tdm0Var, View view) {
        ftr0 ftr0Var = savingsShelfView.shelfCallbacks;
        if (ftr0Var != null) {
            ((c) ftr0Var).h0(tdm0Var.c);
        }
        savingsShelfView.startSideEffectAnimation();
    }

    private final void startSideEffectAnimation() {
        float f;
        int i;
        tdm0 tdm0Var = this.state;
        boolean z = (tdm0Var == null || tdm0Var.k) ? false : true;
        final rdm0 rdm0Var = this.animator;
        PathInterpolator pathInterpolator = rdm0.k;
        final n561 n561Var = rdm0Var.a;
        YbDivView ybDivView = n561Var.d;
        ConstraintLayout constraintLayout = n561Var.c;
        RecyclerView recyclerView = n561Var.b;
        YbDivView ybDivView2 = n561Var.i;
        SpoilerTextView spoilerTextView = n561Var.h;
        ImageView imageView = n561Var.e;
        boolean z2 = ybDivView.getVisibility() == 0;
        boolean z3 = z2 != rdm0Var.j;
        if (!jl40.l(rdm0Var.i, Boolean.valueOf(z)) || z3) {
            if (z && recyclerView.getWidth() == 0) {
                rdm0Var.g(true);
                return;
            }
            rdm0Var.c();
            rdm0Var.i = Boolean.valueOf(z);
            rdm0Var.j = z2;
            final float x = spoilerTextView.getX();
            final float y = spoilerTextView.getY();
            final float y2 = n561Var.j.getY();
            final float y3 = imageView.getY();
            final float top = recyclerView.getTop();
            final float top2 = ybDivView.getTop();
            final float x2 = ybDivView2.getX();
            float y4 = ybDivView2.getY();
            float rotation = imageView.getRotation();
            float alpha = recyclerView.getAlpha();
            int height = recyclerView.getHeight();
            if (z) {
                f = y4;
                recyclerView.measure(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                i = recyclerView.getMeasuredHeight();
            } else {
                f = y4;
                i = 0;
            }
            final qdm0 qdm0Var = z ? rdm0Var.c : rdm0Var.b;
            if (constraintLayout.getHeight() > 0) {
                rdm0.f(constraintLayout.getHeight(), constraintLayout);
                rdm0Var.h = true;
            }
            rdm0.f(height, recyclerView);
            rdm0Var.a(z);
            imageView.setRotation(rotation);
            recyclerView.setAlpha(alpha);
            final boolean z4 = z;
            final float f2 = f;
            final int i2 = i;
            rdm0Var.g = OneShotPreDrawListener.add(constraintLayout, new Runnable() { // from class: com.ybsdk.feature.savings.internal.screens.dashboard.v4.d
                @Override // java.lang.Runnable
                public final void run() {
                    float f3;
                    ValueAnimator valueAnimator;
                    float f4;
                    ValueAnimator valueAnimator2;
                    final rdm0 rdm0Var2 = rdm0.this;
                    rdm0Var2.g = null;
                    n561 n561Var2 = n561Var;
                    SpoilerTextView spoilerTextView2 = n561Var2.h;
                    float x3 = x - spoilerTextView2.getX();
                    float y5 = y - spoilerTextView2.getY();
                    TextView textView = n561Var2.j;
                    float y6 = y2 - textView.getY();
                    ImageView imageView2 = n561Var2.e;
                    float y7 = y3 - imageView2.getY();
                    RecyclerView recyclerView2 = n561Var2.b;
                    float top3 = top - recyclerView2.getTop();
                    YbDivView ybDivView3 = n561Var2.d;
                    float top4 = top2 - ybDivView3.getTop();
                    YbDivView ybDivView4 = n561Var2.i;
                    float x4 = x2 - ybDivView4.getX();
                    float y8 = f2 - ybDivView4.getY();
                    textView.setTranslationY(y6);
                    imageView2.setTranslationY(y7);
                    spoilerTextView2.setTranslationX(x3);
                    spoilerTextView2.setTranslationY(y5);
                    recyclerView2.setTranslationY(top3);
                    ybDivView3.setTranslationY(top4);
                    ybDivView4.setTranslationX(x4);
                    ybDivView4.setTranslationY(y8);
                    rdm0Var2.h();
                    n561 n561Var3 = rdm0Var2.a;
                    RecyclerView recyclerView3 = n561Var3.b;
                    SpoilerTextView spoilerTextView3 = n561Var3.h;
                    ValueAnimator ofInt = ValueAnimator.ofInt(recyclerView3.getHeight(), i2);
                    ofInt.setDuration(400L);
                    PathInterpolator pathInterpolator2 = rdm0.k;
                    ofInt.setInterpolator(pathInterpolator2);
                    final int i3 = 0;
                    ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: pdm0
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                            int i4 = i3;
                            rdm0 rdm0Var3 = rdm0Var2;
                            switch (i4) {
                                case 0:
                                    RecyclerView recyclerView4 = rdm0Var3.a.b;
                                    int intValue = ((Integer) valueAnimator3.getAnimatedValue()).intValue();
                                    rdm0.f(intValue >= 0 ? intValue : 0, recyclerView4);
                                    break;
                                case 1:
                                    rdm0Var3.a.b.setAlpha(((Float) valueAnimator3.getAnimatedValue()).floatValue());
                                    break;
                                case 2:
                                    rdm0Var3.a.e.setRotation(((Float) valueAnimator3.getAnimatedValue()).floatValue());
                                    break;
                                case 3:
                                    rdm0Var3.a.h.setTextColor(((Integer) valueAnimator3.getAnimatedValue()).intValue());
                                    break;
                                default:
                                    rdm0Var3.a.h.setTextSize(0, ((Float) valueAnimator3.getAnimatedValue()).floatValue());
                                    break;
                            }
                        }
                    });
                    final boolean z5 = z4;
                    final int i4 = 1;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(n561Var3.e.getRotation(), z5 ? 180.0f : 0.0f);
                    ofFloat.setDuration(400L);
                    ofFloat.setInterpolator(pathInterpolator2);
                    final int i5 = 2;
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: pdm0
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                            int i42 = i5;
                            rdm0 rdm0Var3 = rdm0Var2;
                            switch (i42) {
                                case 0:
                                    RecyclerView recyclerView4 = rdm0Var3.a.b;
                                    int intValue = ((Integer) valueAnimator3.getAnimatedValue()).intValue();
                                    rdm0.f(intValue >= 0 ? intValue : 0, recyclerView4);
                                    break;
                                case 1:
                                    rdm0Var3.a.b.setAlpha(((Float) valueAnimator3.getAnimatedValue()).floatValue());
                                    break;
                                case 2:
                                    rdm0Var3.a.e.setRotation(((Float) valueAnimator3.getAnimatedValue()).floatValue());
                                    break;
                                case 3:
                                    rdm0Var3.a.h.setTextColor(((Integer) valueAnimator3.getAnimatedValue()).intValue());
                                    break;
                                default:
                                    rdm0Var3.a.h.setTextSize(0, ((Float) valueAnimator3.getAnimatedValue()).floatValue());
                                    break;
                            }
                        }
                    });
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(recyclerView3.getAlpha(), z5 ? 1.0f : 0.0f);
                    ofFloat2.setDuration(200L);
                    PathInterpolator pathInterpolator3 = rdm0.l;
                    ofFloat2.setInterpolator(pathInterpolator3);
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: pdm0
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                            int i42 = i4;
                            rdm0 rdm0Var3 = rdm0Var2;
                            switch (i42) {
                                case 0:
                                    RecyclerView recyclerView4 = rdm0Var3.a.b;
                                    int intValue = ((Integer) valueAnimator3.getAnimatedValue()).intValue();
                                    rdm0.f(intValue >= 0 ? intValue : 0, recyclerView4);
                                    break;
                                case 1:
                                    rdm0Var3.a.b.setAlpha(((Float) valueAnimator3.getAnimatedValue()).floatValue());
                                    break;
                                case 2:
                                    rdm0Var3.a.e.setRotation(((Float) valueAnimator3.getAnimatedValue()).floatValue());
                                    break;
                                case 3:
                                    rdm0Var3.a.h.setTextColor(((Integer) valueAnimator3.getAnimatedValue()).intValue());
                                    break;
                                default:
                                    rdm0Var3.a.h.setTextSize(0, ((Float) valueAnimator3.getAnimatedValue()).floatValue());
                                    break;
                            }
                        }
                    });
                    qdm0 qdm0Var2 = qdm0Var;
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(spoilerTextView3.getTextSize(), qdm0Var2.d);
                    ofFloat3.setDuration(200L);
                    ofFloat3.setInterpolator(pathInterpolator3);
                    final int i6 = 4;
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: pdm0
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                            int i42 = i6;
                            rdm0 rdm0Var3 = rdm0Var2;
                            switch (i42) {
                                case 0:
                                    RecyclerView recyclerView4 = rdm0Var3.a.b;
                                    int intValue = ((Integer) valueAnimator3.getAnimatedValue()).intValue();
                                    rdm0.f(intValue >= 0 ? intValue : 0, recyclerView4);
                                    break;
                                case 1:
                                    rdm0Var3.a.b.setAlpha(((Float) valueAnimator3.getAnimatedValue()).floatValue());
                                    break;
                                case 2:
                                    rdm0Var3.a.e.setRotation(((Float) valueAnimator3.getAnimatedValue()).floatValue());
                                    break;
                                case 3:
                                    rdm0Var3.a.h.setTextColor(((Integer) valueAnimator3.getAnimatedValue()).intValue());
                                    break;
                                default:
                                    rdm0Var3.a.h.setTextSize(0, ((Float) valueAnimator3.getAnimatedValue()).floatValue());
                                    break;
                            }
                        }
                    });
                    ValueAnimator ofArgb = ValueAnimator.ofArgb(spoilerTextView3.getCurrentTextColor(), qdm0Var2.a);
                    ofArgb.setDuration(400L);
                    ofArgb.setInterpolator(pathInterpolator3);
                    final int i7 = 3;
                    ofArgb.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: pdm0
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                            int i42 = i7;
                            rdm0 rdm0Var3 = rdm0Var2;
                            switch (i42) {
                                case 0:
                                    RecyclerView recyclerView4 = rdm0Var3.a.b;
                                    int intValue = ((Integer) valueAnimator3.getAnimatedValue()).intValue();
                                    rdm0.f(intValue >= 0 ? intValue : 0, recyclerView4);
                                    break;
                                case 1:
                                    rdm0Var3.a.b.setAlpha(((Float) valueAnimator3.getAnimatedValue()).floatValue());
                                    break;
                                case 2:
                                    rdm0Var3.a.e.setRotation(((Float) valueAnimator3.getAnimatedValue()).floatValue());
                                    break;
                                case 3:
                                    rdm0Var3.a.h.setTextColor(((Integer) valueAnimator3.getAnimatedValue()).intValue());
                                    break;
                                default:
                                    rdm0Var3.a.h.setTextSize(0, ((Float) valueAnimator3.getAnimatedValue()).floatValue());
                                    break;
                            }
                        }
                    });
                    Spoiler.a aVar = qdm0Var2.c;
                    Spoiler.a aVar2 = spoilerTextView3.getSpoiler().b;
                    ovt0 ovt0Var = aVar2.a;
                    com.ybsdk.core.design.spoiler.b bVar = ovt0Var instanceof com.ybsdk.core.design.spoiler.b ? (com.ybsdk.core.design.spoiler.b) ovt0Var : null;
                    ovt0 ovt0Var2 = aVar2.b;
                    com.ybsdk.core.design.spoiler.b bVar2 = ovt0Var2 instanceof com.ybsdk.core.design.spoiler.b ? (com.ybsdk.core.design.spoiler.b) ovt0Var2 : null;
                    ovt0 ovt0Var3 = aVar.a;
                    com.ybsdk.core.design.spoiler.b bVar3 = ovt0Var3 instanceof com.ybsdk.core.design.spoiler.b ? (com.ybsdk.core.design.spoiler.b) ovt0Var3 : null;
                    ovt0 ovt0Var4 = aVar.b;
                    com.ybsdk.core.design.spoiler.b bVar4 = ovt0Var4 instanceof com.ybsdk.core.design.spoiler.b ? (com.ybsdk.core.design.spoiler.b) ovt0Var4 : null;
                    if (bVar == null || bVar2 == null || bVar3 == null || bVar4 == null) {
                        f3 = top3;
                        valueAnimator = ofInt;
                        f4 = top4;
                        valueAnimator2 = null;
                    } else {
                        valueAnimator2 = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofInt("width", bVar.a, bVar3.a), PropertyValuesHolder.ofInt("height", bVar2.a, bVar4.a));
                        f3 = top3;
                        valueAnimator = ofInt;
                        valueAnimator2.setDuration(200L);
                        valueAnimator2.setInterpolator(pathInterpolator3);
                        valueAnimator2.addUpdateListener(new o8m(6, rdm0Var2, bVar, bVar2));
                        f4 = top4;
                    }
                    List A = j73.A(new ValueAnimator[]{valueAnimator, ofFloat, ofFloat2, ofFloat3, ofArgb, valueAnimator2, rdm0.e(new SavingsShelfAnimator$animateTo$1$1$animators$1(1, textView, TextView.class, "setTranslationY", "setTranslationY(F)V", 0), y6, 200L, pathInterpolator3), rdm0.e(new SavingsShelfAnimator$animateTo$1$1$animators$2(1, imageView2, ImageView.class, "setTranslationY", "setTranslationY(F)V", 0), y7, 200L, pathInterpolator3), rdm0.e(new SavingsShelfAnimator$animateTo$1$1$animators$3(1, spoilerTextView2, SpoilerTextView.class, "setTranslationX", "setTranslationX(F)V", 0), x3, 200L, pathInterpolator3), rdm0.e(new SavingsShelfAnimator$animateTo$1$1$animators$4(1, spoilerTextView2, SpoilerTextView.class, "setTranslationY", "setTranslationY(F)V", 0), y5, 200L, pathInterpolator3), rdm0.e(new SavingsShelfAnimator$animateTo$1$1$animators$5(1, recyclerView2, RecyclerView.class, "setTranslationY", "setTranslationY(F)V", 0), f3, 400L, pathInterpolator2), rdm0.e(new SavingsShelfAnimator$animateTo$1$1$animators$6(1, ybDivView3, YbDivView.class, "setTranslationY", "setTranslationY(F)V", 0), f4, 400L, pathInterpolator2), rdm0.e(new SavingsShelfAnimator$animateTo$1$1$animators$7(1, ybDivView4, YbDivView.class, "setTranslationX", "setTranslationX(F)V", 0), x4, 200L, pathInterpolator3), rdm0.e(new SavingsShelfAnimator$animateTo$1$1$animators$8(1, ybDivView4, YbDivView.class, "setTranslationY", "setTranslationY(F)V", 0), y8, 200L, pathInterpolator3)});
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(A);
                    final sls slsVar = null;
                    animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.ybsdk.feature.savings.internal.screens.dashboard.v4.SavingsShelfAnimator$animateTo$lambda$8$lambda$7$lambda$6$$inlined$doOnEnd$1
                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationCancel(Animator animator) {
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            rdm0 rdm0Var3 = rdm0.this;
                            boolean z6 = z5;
                            n561 n561Var4 = rdm0Var3.a;
                            rdm0Var3.f = null;
                            n561Var4.j.setTranslationY(0.0f);
                            ImageView imageView3 = n561Var4.e;
                            imageView3.setTranslationY(0.0f);
                            SpoilerTextView spoilerTextView4 = n561Var4.h;
                            spoilerTextView4.setTranslationX(0.0f);
                            spoilerTextView4.setTranslationY(0.0f);
                            RecyclerView recyclerView4 = n561Var4.b;
                            recyclerView4.setTranslationY(0.0f);
                            n561Var4.d.setTranslationY(0.0f);
                            YbDivView ybDivView5 = n561Var4.i;
                            ybDivView5.setTranslationX(0.0f);
                            ybDivView5.setTranslationY(0.0f);
                            rdm0Var3.h();
                            rdm0Var3.b(z6 ? rdm0Var3.c : rdm0Var3.b);
                            imageView3.setRotation(z6 ? 180.0f : 0.0f);
                            recyclerView4.setAlpha(z6 ? 1.0f : 0.0f);
                            rdm0.f(z6 ? -2 : 0, recyclerView4);
                            sls slsVar2 = slsVar;
                            if (slsVar2 != null) {
                                slsVar2.invoke();
                            }
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationRepeat(Animator animator) {
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationStart(Animator animator) {
                        }
                    });
                    animatorSet.start();
                    rdm0Var2.f = animatorSet;
                }
            });
        }
    }

    private final String toAccessibilityText(Text text, boolean z) {
        if (jl40.l(text, Text.Empty.INSTANCE)) {
            return null;
        }
        String string = z ? getContext().getString(dzh0.ybsdk_spoilers_accessibility_spoiler_hidden_amount) : com.ybsdk.core.utils.text.d.a(getContext(), text).toString();
        if (evu0.J(string)) {
            return null;
        }
        return string;
    }

    public static /* synthetic */ String toAccessibilityText$default(SavingsShelfView savingsShelfView, Text text, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return savingsShelfView.toAccessibilityText(text, z);
    }

    private final void updateHeaderAccessibility(tdm0 state, boolean isSpoilerVisible) {
        this.binding.f.setContentDescription(lia1.i(j73.A(new String[]{toAccessibilityText$default(this, state.e, false, 1, null), toAccessibilityText(state.f, isSpoilerVisible)})));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.animator.c();
        super.onDetachedFromWindow();
    }

    public final void render(tdm0 newState) {
        rr51 rr51Var = newState.h;
        rr51 rr51Var2 = newState.g;
        List list = newState.i;
        boolean isEmpty = list.isEmpty();
        boolean z = !isEmpty;
        v4b1.k(newState.d, this.binding.g, null, null, 6);
        this.binding.e.setVisibility(!isEmpty ? 0 : 8);
        xty0.d(this.binding.j, newState.e);
        xty0.d(this.binding.h, newState.f);
        this.binding.h.setSpoilerStateListener(new vam0(5, this, newState));
        this.binding.i.setVisibility(rr51Var2 != null ? 0 : 8);
        if (rr51Var2 != null) {
            YbDivView.setData$default(this.binding.i, rr51Var2, null, null, false, 14, null);
        }
        this.binding.d.setVisibility(rr51Var != null ? 0 : 8);
        if (rr51Var != null) {
            YbDivView.setData$default(this.binding.d, rr51Var, null, null, false, 14, null);
        }
        tls tlsVar = this.divActionHandler;
        if (tlsVar != null) {
            this.binding.d.setActionHandler(tlsVar);
        }
        this.accountsRecyclerHelper.b.g(list);
        setupHeaderClickArea(newState, z);
        this.binding.e.setOnClickListener(new zwc(this, newState, z));
        if (this.state == null) {
            this.animator.g(newState.k);
        }
        this.state = newState;
    }

    public final void setAccountCallbacks(zj callbacks, sls saveAccountsOrderCallback) {
        this.accountCallbacks = callbacks;
        this.saveAccountsOrderCallback = saveAccountsOrderCallback;
    }

    public final void setDivActionHandler(tls handler) {
        this.divActionHandler = handler;
    }

    public final void setShelfCallbacks(ftr0 callbacks) {
        this.shelfCallbacks = callbacks;
    }

    public SavingsShelfView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ SavingsShelfView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public SavingsShelfView(Context context) {
        this(context, null, 0, 6, null);
    }
}
