package com.ybsdk.feature.pfm.internal.ui.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ybsdk.feature.pfm.internal.ui.delegates.a;
import defpackage.a10;
import defpackage.a9b0;
import defpackage.b9b0;
import defpackage.dia0;
import defpackage.ewg0;
import defpackage.g990;
import defpackage.i261;
import defpackage.i3y;
import defpackage.i4b0;
import defpackage.i59;
import defpackage.ii30;
import defpackage.jl40;
import defpackage.jw00;
import defpackage.l59;
import defpackage.l9b0;
import defpackage.lum;
import defpackage.n9b0;
import defpackage.ny61;
import defpackage.qa3;
import defpackage.rje;
import defpackage.sls;
import defpackage.tls;
import defpackage.w8b0;
import defpackage.x8b0;
import defpackage.y8b0;
import defpackage.y9b0;
import defpackage.z4b0;
import defpackage.z8b0;
import defpackage.zij;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 N2\u00020\u0001:\u0002\nOB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000f\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J!\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0010J+\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\f*\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001b\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001d\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\"\u001a\u00020\u000e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0 ¢\u0006\u0004\b\"\u0010#J\u001b\u0010%\u001a\u00020\u000e2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\f0 ¢\u0006\u0004\b%\u0010#J\u001b\u0010'\u001a\u00020\u000e2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\f0 ¢\u0006\u0004\b'\u0010#J!\u0010+\u001a\u00020\u000e2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u000e0(¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\u000e¢\u0006\u0004\b-\u0010\u001fJ\u001f\u0010.\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b.\u0010\u0010J\u0015\u00101\u001a\u00020\u000e2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102R\u0018\u00103\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R$\u00105\u001a\u0010\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u000e\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u00107R\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020\f0 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u00107R\u0016\u00108\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020\f0 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u00107R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\"\u0010C\u001a\u0010\u0012\f\u0012\n B*\u0004\u0018\u00010A0A0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010M\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bK\u0010L¨\u0006P"}, d2 = {"Lcom/ybsdk/feature/pfm/internal/ui/widgets/PfmCategoriesView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lb9b0;", "viewState", "", "hasLevelChanged", "Lzy11;", "renderWithSecondLvlAnimations", "(Lb9b0;Z)V", "renderWithoutSecondLvlAnimations", "newViewState", "setUpAnimationsForCategories", "oldState", "newState", "setItemAnimator", "(Lb9b0;Lb9b0;Z)V", "updateShouldAnimateCategorySize", "isEveryItemCategoryContentView", "(Lb9b0;)Z", "needAnimateCategoriesSizeChange", "(Lb9b0;Lb9b0;)Z", "needCustomItemAnimatorForRecycler", "resetCategoriesScroll", "()V", "Lkotlin/Function0;", "isCategoriesItemAnimatorEnabled", "setIsCategoriesItemAnimatorEnabled", "(Lsls;)V", "isCategoriesSizeAnimationEnabled", "setIsCategoriesSizeAnimationEnabled", "isSecondLevelAnimationsEnabled", "setIsSecondLevelAnimationsEnabled", "Lkotlin/Function1;", "Ll9b0;", "listener", "setOnCategoryClickListener", "(Ltls;)V", "clearRecyclerContent", "render", "", "categoriesExpansionFraction", "updateTopPadding", "(F)V", "currentState", "Lb9b0;", "onCategoryClickListener", "Ltls;", "Lsls;", "shouldAnimateCategorySize", "Z", "Landroidx/recyclerview/widget/LinearLayoutManager;", "categoriesLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Li59;", "categoriesSizeManager", "Li59;", "Lqa3;", "Lgc5;", "kotlin.jvm.PlatformType", "categoriesAdapter", "Lqa3;", "Ly8b0;", "categoriesCustomAnimator", "Ly8b0;", "Ly9b0;", "categoriesFadeInItemAnimator", "Ly9b0;", "getMaxNotFirstLevelTopPaddingPx", "()I", "maxNotFirstLevelTopPaddingPx", "Companion", "a9b0", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PfmCategoriesView extends RecyclerView {
    private static final a9b0 Companion = new a9b0();
    private static final zij pfmCategoriesDiffCallback = new a10(9);
    private final qa3 categoriesAdapter;
    private final y8b0 categoriesCustomAnimator;
    private final y9b0 categoriesFadeInItemAnimator;
    private final LinearLayoutManager categoriesLayoutManager;
    private final i59 categoriesSizeManager;
    private b9b0 currentState;
    private sls isCategoriesItemAnimatorEnabled;
    private sls isCategoriesSizeAnimationEnabled;
    private sls isSecondLevelAnimationsEnabled;
    private tls onCategoryClickListener;
    private boolean shouldAnimateCategorySize;

    public PfmCategoriesView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2 = 8;
        this.isCategoriesItemAnimatorEnabled = new z4b0(i2);
        this.isCategoriesSizeAnimationEnabled = new z4b0(9);
        this.isSecondLevelAnimationsEnabled = new z4b0(10);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
        this.categoriesLayoutManager = linearLayoutManager;
        this.categoriesSizeManager = new i59(this);
        int i3 = 1;
        qa3 qa3Var = new qa3(pfmCategoriesDiffCallback, new lum(new g990(i2), w8b0.a, new dia0(21), x8b0.a), a.b(new i4b0(i3, this), new z8b0(this, 0), new z8b0(this, i3)));
        this.categoriesAdapter = qa3Var;
        this.categoriesCustomAnimator = new y8b0();
        this.categoriesFadeInItemAnimator = new y9b0(250L);
        setLayoutManager(linearLayoutManager);
        setAdapter(qa3Var);
        addItemDecoration(new jw00(0, rje.d(ewg0.ybsdk_pfm_category_margin_horizontal, context), rje.d(ewg0.ybsdk_pfm_category_margin_horizontal, context), null, 9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 categoriesAdapter$lambda$3(PfmCategoriesView pfmCategoriesView, l9b0 l9b0Var) {
        tls tlsVar = pfmCategoriesView.onCategoryClickListener;
        if (tlsVar != null) {
            tlsVar.invoke(l9b0Var);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bd, code lost:
    
        if (r5 < 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r11.b == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final l59 categoriesAdapter$lambda$4(PfmCategoriesView pfmCategoriesView) {
        int i;
        Integer valueOf;
        int i2;
        i59 i59Var = pfmCategoriesView.categoriesSizeManager;
        b9b0 b9b0Var = pfmCategoriesView.currentState;
        int i3 = 0;
        boolean z = b9b0Var != null;
        PfmCategoriesView pfmCategoriesView2 = i59Var.a;
        i3y i3yVar = i59Var.b;
        RecyclerView.Adapter adapter = pfmCategoriesView2.getAdapter();
        Integer num = null;
        qa3 qa3Var = adapter instanceof qa3 ? (qa3) adapter : null;
        List list = qa3Var != null ? qa3Var.b.f : null;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof l9b0) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                valueOf = Integer.valueOf(i59Var.c(((l9b0) it.next()).f, (i261) i3yVar.getValue()));
                while (it.hasNext()) {
                    Integer valueOf2 = Integer.valueOf(i59Var.c(((l9b0) it.next()).f, (i261) i3yVar.getValue()));
                    if (valueOf.compareTo(valueOf2) < 0) {
                        valueOf = valueOf2;
                    }
                }
            } else {
                valueOf = null;
            }
            int intValue = valueOf != null ? valueOf.intValue() : 0;
            if (!z || arrayList.size() > 3) {
                i2 = i59Var.d;
            } else {
                int size = list.size();
                int measuredWidth = pfmCategoriesView2.getMeasuredWidth();
                if (measuredWidth > 0 && size != 0) {
                    i2 = (((measuredWidth - pfmCategoriesView2.getPaddingStart()) - pfmCategoriesView2.getPaddingEnd()) - ((i59Var.c * 2) * size)) / size;
                }
                i2 = 0;
            }
            i = Math.max(intValue, i2);
            i59Var.i = Integer.valueOf(i);
        } else {
            i = 0;
        }
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                if (obj2 instanceof l9b0) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it2 = arrayList2.iterator();
            if (it2.hasNext()) {
                Integer valueOf3 = Integer.valueOf(i59Var.a((l9b0) it2.next(), i));
                loop2: while (true) {
                    num = valueOf3;
                    while (it2.hasNext()) {
                        valueOf3 = Integer.valueOf(i59Var.a((l9b0) it2.next(), i));
                        if (num.compareTo(valueOf3) < 0) {
                            break;
                        }
                    }
                }
            }
            if (num != null) {
                i3 = num.intValue();
            }
        }
        return new l59(i, i3);
    }

    private final int getMaxNotFirstLevelTopPaddingPx() {
        return rje.d(ewg0.ybsdk_pfm_categories_not_first_level_top_padding, getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isCategoriesItemAnimatorEnabled$lambda$0() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isCategoriesSizeAnimationEnabled$lambda$1() {
        return false;
    }

    private final boolean isEveryItemCategoryContentView(b9b0 b9b0Var) {
        List list = b9b0Var != null ? b9b0Var.a : null;
        if (list == null || list.isEmpty()) {
            return false;
        }
        List list2 = b9b0Var.a;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return true;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (!(((n9b0) it.next()) instanceof l9b0)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isSecondLevelAnimationsEnabled$lambda$2() {
        return false;
    }

    private final boolean needAnimateCategoriesSizeChange(b9b0 oldState, b9b0 newState) {
        return isEveryItemCategoryContentView(oldState) && isEveryItemCategoryContentView(newState);
    }

    private final boolean needCustomItemAnimatorForRecycler(b9b0 oldState, b9b0 newState) {
        if (oldState != null) {
            if (oldState.a().equals(newState != null ? newState.a() : null)) {
                return false;
            }
        }
        return needAnimateCategoriesSizeChange(oldState, newState);
    }

    private final void renderWithSecondLvlAnimations(b9b0 viewState, boolean hasLevelChanged) {
        List list = viewState != null ? viewState.a : null;
        setVisibility((list == null || list.isEmpty()) ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return;
        }
        layoutParams.height = -2;
        setLayoutParams(layoutParams);
        if (jl40.l(this.currentState, viewState)) {
            setUpAnimationsForCategories(viewState, hasLevelChanged);
            RecyclerView.Adapter adapter = getAdapter();
            if (adapter != null) {
                adapter.notifyDataSetChanged();
            }
            if (hasLevelChanged) {
                resetCategoriesScroll();
                return;
            }
            return;
        }
        setUpAnimationsForCategories(viewState, hasLevelChanged);
        this.currentState = viewState;
        List list2 = viewState != null ? viewState.a : null;
        if (list2 == null) {
            list2 = EmptyList.a;
        }
        this.categoriesAdapter.g(list2);
        if (hasLevelChanged) {
            resetCategoriesScroll();
        }
    }

    private final void renderWithoutSecondLvlAnimations(b9b0 viewState, boolean hasLevelChanged) {
        List list = viewState != null ? viewState.a : null;
        setVisibility((list == null || list.isEmpty()) ? 8 : 0);
        if (jl40.l(this.currentState, viewState)) {
            return;
        }
        setUpAnimationsForCategories(viewState, hasLevelChanged);
        this.currentState = viewState;
        List list2 = viewState != null ? viewState.a : null;
        if (list2 == null) {
            list2 = EmptyList.a;
        }
        this.categoriesAdapter.g(list2);
    }

    private final void resetCategoriesScroll() {
        post(new ii30(13, this));
    }

    private final void setItemAnimator(b9b0 oldState, b9b0 newState, boolean hasLevelChanged) {
        if (jl40.l(oldState, newState)) {
            return;
        }
        if (((Boolean) this.isCategoriesItemAnimatorEnabled.invoke()).booleanValue()) {
            setItemAnimator((hasLevelChanged || !needCustomItemAnimatorForRecycler(oldState, newState)) ? this.categoriesFadeInItemAnimator : this.categoriesCustomAnimator);
        } else {
            setItemAnimator(null);
        }
    }

    private final void setUpAnimationsForCategories(b9b0 newViewState, boolean hasLevelChanged) {
        updateShouldAnimateCategorySize(this.currentState, newViewState, hasLevelChanged);
        setItemAnimator(this.currentState, newViewState, hasLevelChanged);
    }

    private final void updateShouldAnimateCategorySize(b9b0 oldState, b9b0 newState, boolean hasLevelChanged) {
        this.shouldAnimateCategorySize = ((Boolean) this.isCategoriesSizeAnimationEnabled.invoke()).booleanValue() && !hasLevelChanged && needAnimateCategoriesSizeChange(oldState, newState);
    }

    public final void clearRecyclerContent() {
        this.currentState = null;
        this.categoriesAdapter.g(null);
    }

    public final void render(b9b0 viewState, boolean hasLevelChanged) {
        if (((Boolean) this.isSecondLevelAnimationsEnabled.invoke()).booleanValue()) {
            renderWithSecondLvlAnimations(viewState, hasLevelChanged);
        } else {
            renderWithoutSecondLvlAnimations(viewState, hasLevelChanged);
        }
    }

    public final void setIsCategoriesItemAnimatorEnabled(sls isCategoriesItemAnimatorEnabled) {
        this.isCategoriesItemAnimatorEnabled = isCategoriesItemAnimatorEnabled;
    }

    public final void setIsCategoriesSizeAnimationEnabled(sls isCategoriesSizeAnimationEnabled) {
        this.isCategoriesSizeAnimationEnabled = isCategoriesSizeAnimationEnabled;
    }

    public final void setIsSecondLevelAnimationsEnabled(sls isSecondLevelAnimationsEnabled) {
        this.isSecondLevelAnimationsEnabled = isSecondLevelAnimationsEnabled;
    }

    public final void setOnCategoryClickListener(tls listener) {
        this.onCategoryClickListener = listener;
    }

    public final void updateTopPadding(float categoriesExpansionFraction) {
        setPadding(getPaddingLeft(), (int) (getMaxNotFirstLevelTopPaddingPx() * categoriesExpansionFraction), getPaddingRight(), getPaddingBottom());
    }

    public PfmCategoriesView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ PfmCategoriesView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public PfmCategoriesView(Context context) {
        this(context, null, 0, 6, null);
    }
}
