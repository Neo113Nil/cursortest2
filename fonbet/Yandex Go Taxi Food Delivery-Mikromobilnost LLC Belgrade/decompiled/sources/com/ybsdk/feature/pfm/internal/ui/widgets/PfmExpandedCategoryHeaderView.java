package com.ybsdk.feature.pfm.internal.ui.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.core.design.spoiler.Spoiler;
import com.ybsdk.core.design.spoiler.SpoilerTextView;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.pfm.internal.ui.widgets.PfmExpandedCategoryHeaderView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;
import defpackage.adb0;
import defpackage.bdb0;
import defpackage.bgc;
import defpackage.cdb0;
import defpackage.cma1;
import defpackage.ewg0;
import defpackage.jl40;
import defpackage.l9b0;
import defpackage.lbh0;
import defpackage.li91;
import defpackage.niz0;
import defpackage.ny61;
import defpackage.rbv;
import defpackage.rje;
import defpackage.sls;
import defpackage.t9b0;
import defpackage.ua61;
import defpackage.unh0;
import defpackage.v4b1;
import defpackage.v9b0;
import defpackage.w511;
import defpackage.w9b0;
import defpackage.x9b0;
import defpackage.xty0;
import defpackage.z4b0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\"B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001dH\u0002¢\u0006\u0004\b!\u0010\u001fJ\u0017\u0010$\u001a\u00020\n2\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%J\u001d\u0010(\u001a\u00020\n2\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010&¢\u0006\u0004\b(\u0010)J\u001d\u0010*\u001a\u00020\n2\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010&¢\u0006\u0004\b*\u0010)J\u001b\u0010-\u001a\u00020\n2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0&¢\u0006\u0004\b-\u0010)J\u0015\u0010/\u001a\u00020\n2\u0006\u0010.\u001a\u00020+¢\u0006\u0004\b/\u00100J\u0015\u00103\u001a\u00020\n2\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104R\u0018\u00105\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u001c\u0010,\u001a\b\u0012\u0004\u0012\u00020+0&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u00107R\u001e\u00108\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00107R\u001e\u00109\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00107R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010B\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006C"}, d2 = {"Lcom/ybsdk/feature/pfm/internal/ui/widgets/PfmExpandedCategoryHeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "hidePartialLoading", "()V", "renderPartialLoading", "Landroid/widget/TextView;", "hideContent", "()Landroid/widget/TextView;", "Lv9b0;", ClidProvider.STATE, "renderContent", "(Lv9b0;)V", "Lcdb0;", "title", "renderTitle", "(Lcdb0;)V", "Ladb0;", "content", "renderTitleAmount", "(Ladb0;)V", "Lbdb0;", "renderTitlePlain", "(Lbdb0;)V", "note", "renderNote", "Lx9b0;", "newState", "render", "(Lx9b0;)V", "Lkotlin/Function0;", "listener", "setOnCloseClickListener", "(Lsls;)V", "setOnExpansionButtonClickListener", "", "animationEnabled", "setAnimationEnabled", "shouldBeVisible", "renderExpansionButton", "(Z)V", "", "categoriesCollapseFraction", "updateBottomPadding", "(F)V", "currentState", "Lx9b0;", "Lsls;", "onCloseClickListener", "onExpansionButtonClickListener", "Lua61;", "binding", "Lua61;", "Lniz0;", "titleAmountSizeManager", "Lniz0;", "getMaxBottomPaddingPx", "()I", "maxBottomPaddingPx", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PfmExpandedCategoryHeaderView extends ConstraintLayout {
    private sls animationEnabled;
    private final ua61 binding;
    private x9b0 currentState;
    private sls onCloseClickListener;
    private sls onExpansionButtonClickListener;
    private final niz0 titleAmountSizeManager;

    public PfmExpandedCategoryHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.animationEnabled = new z4b0(11);
        final int i2 = 0;
        View inflate = LayoutInflater.from(context).inflate(unh0.ybsdk_view_pfm_expanded_category_header, (ViewGroup) this, false);
        addView(inflate);
        int i3 = lbh0.pfmExpandedCategoryHeaderAmountContainer;
        LinearLayout linearLayout = (LinearLayout) cma1.O(i3, inflate);
        if (linearLayout != null) {
            i3 = lbh0.pfmExpandedCategoryHeaderCloseButton;
            ImageView imageView = (ImageView) cma1.O(i3, inflate);
            if (imageView != null) {
                i3 = lbh0.pfmExpandedCategoryHeaderCurrencyIcon;
                ImageView imageView2 = (ImageView) cma1.O(i3, inflate);
                if (imageView2 != null) {
                    i3 = lbh0.pfmExpandedCategoryHeaderExpansionButton;
                    ImageView imageView3 = (ImageView) cma1.O(i3, inflate);
                    if (imageView3 != null) {
                        i3 = lbh0.pfmExpandedCategoryHeaderNote;
                        TextView textView = (TextView) cma1.O(i3, inflate);
                        if (textView != null) {
                            i3 = lbh0.pfmExpandedCategoryHeaderTitleAmount;
                            SpoilerTextView spoilerTextView = (SpoilerTextView) cma1.O(i3, inflate);
                            if (spoilerTextView != null) {
                                i3 = lbh0.pfmExpandedCategoryHeaderTitleHolder;
                                if (((ConstraintLayout) cma1.O(i3, inflate)) != null) {
                                    i3 = lbh0.pfmExpandedCategoryHeaderTitlePlain;
                                    TextView textView2 = (TextView) cma1.O(i3, inflate);
                                    if (textView2 != null) {
                                        i3 = lbh0.pfmHeaderTitleShimmer;
                                        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) cma1.O(i3, inflate);
                                        if (shimmerFrameLayout != null) {
                                            this.binding = new ua61((ConstraintLayout) inflate, linearLayout, imageView, imageView2, imageView3, textView, spoilerTextView, textView2, shimmerFrameLayout);
                                            this.titleAmountSizeManager = new niz0(spoilerTextView, imageView2, linearLayout);
                                            imageView.setOnClickListener(new View.OnClickListener(this) { // from class: u9b0
                                                public final /* synthetic */ PfmExpandedCategoryHeaderView b;

                                                {
                                                    this.b = this;
                                                }

                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    int i4 = i2;
                                                    PfmExpandedCategoryHeaderView pfmExpandedCategoryHeaderView = this.b;
                                                    switch (i4) {
                                                        case 0:
                                                            PfmExpandedCategoryHeaderView.lambda$3$lambda$1(pfmExpandedCategoryHeaderView, view);
                                                            break;
                                                        default:
                                                            PfmExpandedCategoryHeaderView.lambda$3$lambda$2(pfmExpandedCategoryHeaderView, view);
                                                            break;
                                                    }
                                                }
                                            });
                                            final int i4 = 1;
                                            imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: u9b0
                                                public final /* synthetic */ PfmExpandedCategoryHeaderView b;

                                                {
                                                    this.b = this;
                                                }

                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    int i42 = i4;
                                                    PfmExpandedCategoryHeaderView pfmExpandedCategoryHeaderView = this.b;
                                                    switch (i42) {
                                                        case 0:
                                                            PfmExpandedCategoryHeaderView.lambda$3$lambda$1(pfmExpandedCategoryHeaderView, view);
                                                            break;
                                                        default:
                                                            PfmExpandedCategoryHeaderView.lambda$3$lambda$2(pfmExpandedCategoryHeaderView, view);
                                                            break;
                                                    }
                                                }
                                            });
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
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean animationEnabled$lambda$0() {
        return false;
    }

    private final int getMaxBottomPaddingPx() {
        return rje.d(ewg0.ybsdk_pfm_expanded_category_header_without_categories_padding_bottom, getContext());
    }

    private final TextView hideContent() {
        ua61 ua61Var = this.binding;
        ua61Var.f.setVisibility(8);
        ua61Var.e.setVisibility(4);
        ImageView imageView = ua61Var.b;
        if (imageView.getVisibility() == 0) {
            imageView.setVisibility(4);
        }
        TextView textView = ua61Var.d;
        CharSequence text = textView.getText();
        if (text != null && text.length() != 0) {
            return textView;
        }
        textView.setVisibility(8);
        return textView;
    }

    private final void hidePartialLoading() {
        ua61 ua61Var = this.binding;
        ua61Var.g.stopShimmer();
        ua61Var.g.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$3$lambda$1(PfmExpandedCategoryHeaderView pfmExpandedCategoryHeaderView, View view) {
        sls slsVar = pfmExpandedCategoryHeaderView.onCloseClickListener;
        if (slsVar != null) {
            slsVar.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$3$lambda$2(PfmExpandedCategoryHeaderView pfmExpandedCategoryHeaderView, View view) {
        sls slsVar = pfmExpandedCategoryHeaderView.onExpansionButtonClickListener;
        if (slsVar != null) {
            slsVar.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 render$lambda$4(PfmExpandedCategoryHeaderView pfmExpandedCategoryHeaderView) {
        pfmExpandedCategoryHeaderView.currentState = null;
        return zy11.a;
    }

    private final void renderContent(v9b0 state) {
        renderTitle(state.b);
        renderNote(state.a);
    }

    private final void renderNote(bdb0 note) {
        ua61 ua61Var = this.binding;
        boolean c = d.c(note.b);
        ua61Var.d.setVisibility(c ? 0 : 8);
        if (c) {
            TextView textView = ua61Var.d;
            Text text = note.b;
            textView.setText(text != null ? d.a(getContext(), text) : null);
        }
    }

    private final void renderPartialLoading() {
        ua61 ua61Var = this.binding;
        ua61Var.g.startShimmer();
        ua61Var.g.setVisibility(0);
    }

    private final void renderTitle(cdb0 title) {
        if (title instanceof adb0) {
            renderTitleAmount((adb0) title);
        } else if (title instanceof bdb0) {
            renderTitlePlain((bdb0) title);
        } else {
            w511.b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [T, android.view.View$OnLayoutChangeListener, miz0] */
    private final void renderTitleAmount(final adb0 content) {
        ua61 ua61Var = this.binding;
        final niz0 niz0Var = this.titleAmountSizeManager;
        LinearLayout linearLayout = niz0Var.c;
        rbv rbvVar = content.b;
        final Context context = niz0Var.a.getContext();
        View.OnLayoutChangeListener onLayoutChangeListener = niz0Var.g;
        if (onLayoutChangeListener != null) {
            linearLayout.removeOnLayoutChangeListener(onLayoutChangeListener);
        }
        niz0Var.g = null;
        if (!linearLayout.isLaidOut() || linearLayout.getWidth() <= 0 || linearLayout.isLayoutRequested()) {
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ?? r6 = new View.OnLayoutChangeListener() { // from class: miz0
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    Ref$ObjectRef ref$ObjectRef2 = Ref$ObjectRef.this;
                    T t = ref$ObjectRef2.element;
                    view.removeOnLayoutChangeListener(t == 0 ? null : (View.OnLayoutChangeListener) t);
                    niz0 niz0Var2 = niz0Var;
                    View.OnLayoutChangeListener onLayoutChangeListener2 = niz0Var2.g;
                    T t2 = ref$ObjectRef2.element;
                    if (onLayoutChangeListener2 == (t2 == 0 ? null : (View.OnLayoutChangeListener) t2)) {
                        niz0Var2.g = null;
                        niz0Var2.a(context, content);
                    }
                }
            };
            ref$ObjectRef.element = r6;
            niz0Var.g = r6;
            linearLayout.addOnLayoutChangeListener(r6);
        } else {
            niz0Var.a(context, content);
        }
        SpoilerTextView spoilerTextView = ua61Var.e;
        ImageView imageView = ua61Var.b;
        ColorModel colorModel = content.a;
        if (colorModel == null) {
            colorModel = l9b0.k;
        }
        xty0.e(spoilerTextView, colorModel);
        ColorModel colorModel2 = content.d;
        if (colorModel2 == null) {
            colorModel2 = Spoiler.e;
        }
        SpoilerTextView.updateSpoilerState$default(spoilerTextView, colorModel2, false, 2, null);
        v4b1.k(rbvVar, imageView, null, null, 6);
        ua61Var.f.setVisibility(8);
        spoilerTextView.setVisibility(0);
        imageView.setVisibility(rbvVar == null ? 8 : 0);
    }

    private final void renderTitlePlain(bdb0 content) {
        ua61 ua61Var = this.binding;
        xty0.d(ua61Var.f, content.b);
        TextView textView = ua61Var.f;
        ColorModel colorModel = content.a;
        if (colorModel == null) {
            colorModel = l9b0.k;
        }
        xty0.e(textView, colorModel);
        textView.setVisibility(0);
        ua61Var.e.setVisibility(8);
        ua61Var.b.setVisibility(8);
    }

    public final void render(x9b0 newState) {
        int i = 0;
        if (jl40.l(this.currentState, newState)) {
            setVisibility(newState != null ? 0 : 8);
            return;
        }
        if (newState == null) {
            if (((Boolean) this.animationEnabled.invoke()).booleanValue()) {
                li91.a(this, false, new t9b0(i, this));
                return;
            } else {
                setVisibility(8);
                this.currentState = null;
                return;
            }
        }
        setVisibility(0);
        if (newState instanceof v9b0) {
            hidePartialLoading();
            renderContent((v9b0) newState);
            if (((Boolean) this.animationEnabled.invoke()).booleanValue() && !(this.currentState instanceof v9b0)) {
                li91.a(this, true, new bgc(12));
            }
        } else if (!(newState instanceof w9b0)) {
            w511.b();
            return;
        } else {
            hideContent();
            renderPartialLoading();
        }
        this.currentState = newState;
    }

    public final void renderExpansionButton(boolean shouldBeVisible) {
        if ((!shouldBeVisible || this.binding.c.getVisibility() == 0) && shouldBeVisible) {
            return;
        }
        ImageView imageView = this.binding.c;
        if (((Boolean) this.animationEnabled.invoke()).booleanValue()) {
            li91.a(imageView, shouldBeVisible, new bgc(12));
        } else {
            imageView.setVisibility(shouldBeVisible ? 0 : 8);
        }
    }

    public final void setAnimationEnabled(sls animationEnabled) {
        this.animationEnabled = animationEnabled;
    }

    public final void setOnCloseClickListener(sls listener) {
        this.onCloseClickListener = listener;
    }

    public final void setOnExpansionButtonClickListener(sls listener) {
        this.onExpansionButtonClickListener = listener;
    }

    public final void updateBottomPadding(float categoriesCollapseFraction) {
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), (int) (getMaxBottomPaddingPx() * categoriesCollapseFraction));
    }

    public PfmExpandedCategoryHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ PfmExpandedCategoryHeaderView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public PfmExpandedCategoryHeaderView(Context context) {
        this(context, null, 0, 6, null);
    }
}
