package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.ui.footer;

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoLinearLayout;
import defpackage.b0b;
import defpackage.byu;
import defpackage.clh0;
import defpackage.cma1;
import defpackage.cvw;
import defpackage.ec3;
import defpackage.ejp;
import defpackage.g0c;
import defpackage.g18;
import defpackage.gau;
import defpackage.gyu;
import defpackage.jiu;
import defpackage.lv20;
import defpackage.ny61;
import defpackage.qje;
import defpackage.qoi0;
import defpackage.qpo;
import defpackage.s8h0;
import defpackage.tje;
import defpackage.tls;
import defpackage.txc;
import defpackage.vqu;
import defpackage.w9u;
import defpackage.x0v;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.yxu;
import defpackage.zxs;
import defpackage.zy11;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.design.utils.TopRoundRectBackgroundHelper$makeViewTopRounded$1;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eR.\u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\f0\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u00100¨\u00061"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/ui/footer/HubFooterView;", "Lcom/yandex/go/design/view/GoLinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "visible", "Lzy11;", "animateVisibility", "(Z)V", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Landroid/graphics/drawable/Drawable;", "shadow", "bottomPadding", "setShadow", "(Landroid/graphics/drawable/Drawable;I)V", "padding", "updateBottomPadding", "(I)V", "Lgyu;", "uiState", "render", "(Lgyu;)V", "Lkotlin/Function1;", "Lyxu;", "onFilterSelected", "Ltls;", "getOnFilterSelected", "()Ltls;", "setOnFilterSelected", "(Ltls;)V", "Llv20;", "binding", "Llv20;", "Lbyu;", "filtersAdapter", "Lbyu;", "Lg18;", "showCancellable", "Lg18;", "Landroid/graphics/drawable/Drawable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class HubFooterView extends GoLinearLayout {
    public static final int $stable = 8;
    private final lv20 binding;
    private final byu filtersAdapter;
    private tls onFilterSelected;
    private Drawable shadow;
    private g18 showCancellable;

    public HubFooterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, 8, null);
        this.onFilterSelected = new jiu(7);
        LayoutInflater.from(context).inflate(clh0.mobility_hub_footer_view, this);
        int i2 = s8h0.filters_view;
        RecyclerView recyclerView = (RecyclerView) cma1.O(i2, this);
        if (recyclerView != null) {
            i2 = s8h0.onboarding_subtitle;
            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i2, this);
            if (robotoTextView != null) {
                i2 = s8h0.onboarding_title;
                RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i2, this);
                if (robotoTextView2 != null) {
                    this.binding = new lv20(this, recyclerView, robotoTextView, robotoTextView2);
                    txc txcVar = new txc(1, new gau(8, this));
                    int i3 = b0b.e0;
                    g0c a = qoi0.a(yxu.class);
                    byu byuVar = new byu(txcVar, Collections.singletonList(new zxs(a.a(), 0, null, EmptyList.a, null, new w9u(11))));
                    this.filtersAdapter = byuVar;
                    this.showCancellable = g18.u1;
                    setOrientation(1);
                    recyclerView.setAdapter(byuVar);
                    recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
                    recyclerView.setItemAnimator(null);
                    recyclerView.addItemDecoration(new vqu(tje.u(4, recyclerView.getContext())));
                    recyclerView.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewTopRounded$1(tje.u(24, recyclerView.getContext())));
                    recyclerView.setClipToOutline(true);
                    setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewTopRounded$1(tje.u(24, getContext())));
                    setClipToOutline(true);
                    setBackgroundColor(qje.t(xng0.bgFloating, getContext()));
                    setLayoutTransition(new LayoutTransition());
                    return;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [T, ec3] */
    /* JADX WARN: Type inference failed for: r2v3, types: [T, dai] */
    private final void animateVisibility(boolean visible) {
        final boolean z = true;
        boolean z2 = getVisibility() == 0;
        if (z2 || !visible) {
            if (!z2 || visible) {
                setVisibility(visible ? 0 : 8);
                return;
            } else {
                animate().translationY(getMeasuredHeight()).setDuration(300L).withEndAction(new ejp(26, this)).start();
                return;
            }
        }
        this.showCancellable.cancel();
        setVisibility(0);
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = g18.u1;
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.ui.footer.HubFooterView$animateVisibility$$inlined$doOnPreDrawCancelable$1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                if (this.getVisibility() == 0) {
                    this.setTranslationY(r0.getMeasuredHeight());
                    this.animate().translationY(0.0f).setDuration(300L).start();
                }
                ((g18) Ref$ObjectRef.this.element).cancel();
                return z;
            }
        };
        ref$ObjectRef.element = new ec3(viewTreeObserver, onPreDrawListener, this, 3);
        viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
        this.showCancellable = (g18) ref$ObjectRef.element;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateVisibility$lambda$1(HubFooterView hubFooterView) {
        hubFooterView.setTranslationY(0.0f);
        hubFooterView.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 filtersAdapter$lambda$0(HubFooterView hubFooterView, yxu yxuVar) {
        hubFooterView.onFilterSelected.invoke(yxuVar);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onFilterSelected$lambda$0(yxu yxuVar) {
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$0(HubFooterView hubFooterView, gyu gyuVar) {
        List list;
        hubFooterView.binding.b.setVisibility((gyuVar == null || (list = gyuVar.b) == null || !(list.isEmpty() ^ true)) ? 8 : 0);
    }

    public final tls getOnFilterSelected() {
        return this.onFilterSelected;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        return true;
    }

    public final void render(gyu uiState) {
        x0v x0vVar;
        x0v x0vVar2;
        x0v x0vVar3;
        x0v x0vVar4;
        CharSequence charSequence = null;
        this.filtersAdapter.submitList(uiState != null ? uiState.b : null, new qpo(29, this, uiState));
        this.binding.d.setText((uiState == null || (x0vVar4 = uiState.a) == null) ? null : x0vVar4.b);
        RobotoTextView robotoTextView = this.binding.d;
        CharSequence charSequence2 = (uiState == null || (x0vVar3 = uiState.a) == null) ? null : x0vVar3.b;
        int i = 8;
        boolean z = false;
        robotoTextView.setVisibility((charSequence2 == null || charSequence2.length() == 0) ? 8 : 0);
        this.binding.c.setText((uiState == null || (x0vVar2 = uiState.a) == null) ? null : x0vVar2.c);
        RobotoTextView robotoTextView2 = this.binding.c;
        if (uiState != null && (x0vVar = uiState.a) != null) {
            charSequence = x0vVar.c;
        }
        if (charSequence != null && charSequence.length() != 0) {
            i = 0;
        }
        robotoTextView2.setVisibility(i);
        if (uiState != null && (!uiState.b.isEmpty() || uiState.a != null)) {
            z = true;
        }
        animateVisibility(z);
    }

    public final void setOnFilterSelected(tls tlsVar) {
        this.onFilterSelected = tlsVar;
    }

    public final void setShadow(Drawable shadow, int bottomPadding) {
        this.shadow = shadow;
        cvw.f0(this, shadow, bottomPadding);
    }

    public final void updateBottomPadding(int padding) {
        Drawable drawable = this.shadow;
        if (drawable != null) {
            cvw.f0(this, drawable, padding);
        } else {
            xw31.I(this, null, null, null, Integer.valueOf(padding));
        }
    }

    public HubFooterView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public HubFooterView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ HubFooterView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
