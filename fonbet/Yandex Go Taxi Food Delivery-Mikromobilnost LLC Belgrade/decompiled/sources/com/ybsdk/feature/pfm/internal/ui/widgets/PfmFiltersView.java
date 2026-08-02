package com.ybsdk.feature.pfm.internal.ui.widgets;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.dbb0;
import defpackage.dia0;
import defpackage.ewg0;
import defpackage.fbb0;
import defpackage.g990;
import defpackage.gbb0;
import defpackage.hc5;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jw00;
import defpackage.lum;
import defpackage.pab0;
import defpackage.qa3;
import defpackage.qab0;
import defpackage.rab0;
import defpackage.rje;
import defpackage.sab0;
import defpackage.t9b0;
import defpackage.tls;
import defpackage.ww90;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0011B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0010\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR$\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR$\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001fR)\u0010(\u001a\u0010\u0012\f\u0012\n #*\u0004\u0018\u00010\"0\"0!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lcom/ybsdk/feature/pfm/internal/ui/widgets/PfmFiltersView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Function1;", "Ldbb0;", "Lzy11;", "listener", "setOnFilterClickListener", "(Ltls;)V", "setOnFilterEndIconClickListener", "Lgbb0;", "viewState", "render", "(Lgbb0;)V", "", "radii", "setCornerRadius", "([F)V", "paddingTopPx", "updateTopPadding", "(I)V", "currentState", "Lgbb0;", "onFilterClickListener", "Ltls;", "onFilterEndIconClickListener", "Lqa3;", "Lgc5;", "kotlin.jvm.PlatformType", "filtersAdapter$delegate", "Li3y;", "getFiltersAdapter", "()Lqa3;", "filtersAdapter", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PfmFiltersView extends RecyclerView {
    private gbb0 currentState;

    /* renamed from: filtersAdapter$delegate, reason: from kotlin metadata */
    private final i3y filtersAdapter;
    private tls onFilterClickListener;
    private tls onFilterEndIconClickListener;

    public PfmFiltersView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.filtersAdapter = a.a(new t9b0(1, this));
        setLayoutManager(new LinearLayoutManager(context, 0, false));
        setAdapter(getFiltersAdapter());
        addItemDecoration(new jw00(0, rje.d(ewg0.ybsdk_pfm_filter_margin_horizontal, context), rje.d(ewg0.ybsdk_pfm_filter_margin_horizontal, context), null, 9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qa3 filtersAdapter_delegate$lambda$2(PfmFiltersView pfmFiltersView) {
        return new qa3(hc5.a, new lum(new g990(11), pab0.a, new ww90(16, new fbb0(pfmFiltersView, 0), new fbb0(pfmFiltersView, 1)), qab0.a), new lum(new g990(12), rab0.a, new dia0(22), sab0.a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 filtersAdapter_delegate$lambda$2$lambda$0(PfmFiltersView pfmFiltersView, dbb0 dbb0Var) {
        tls tlsVar = pfmFiltersView.onFilterClickListener;
        if (tlsVar != null) {
            tlsVar.invoke(dbb0Var);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 filtersAdapter_delegate$lambda$2$lambda$1(PfmFiltersView pfmFiltersView, dbb0 dbb0Var) {
        tls tlsVar = pfmFiltersView.onFilterEndIconClickListener;
        if (tlsVar != null) {
            tlsVar.invoke(dbb0Var);
        }
        return zy11.a;
    }

    private final qa3 getFiltersAdapter() {
        return (qa3) this.filtersAdapter.getValue();
    }

    public final void render(gbb0 viewState) {
        if (jl40.l(this.currentState, viewState)) {
            return;
        }
        List list = viewState != null ? viewState.a : null;
        List list2 = list;
        setVisibility((list2 == null || list2.isEmpty()) ? 8 : 0);
        qa3 filtersAdapter = getFiltersAdapter();
        if (list == null) {
            list = EmptyList.a;
        }
        filtersAdapter.g(list);
        this.currentState = viewState;
    }

    public final void setCornerRadius(float[] radii) {
        Drawable mutate = getBackground().mutate();
        GradientDrawable gradientDrawable = mutate instanceof GradientDrawable ? (GradientDrawable) mutate : null;
        if (gradientDrawable != null) {
            gradientDrawable.setCornerRadii(radii);
        }
    }

    public final void setOnFilterClickListener(tls listener) {
        this.onFilterClickListener = listener;
    }

    public final void setOnFilterEndIconClickListener(tls listener) {
        this.onFilterEndIconClickListener = listener;
    }

    public final void updateTopPadding(int paddingTopPx) {
        setPadding(getPaddingLeft(), paddingTopPx, getPaddingRight(), getPaddingBottom());
    }

    public PfmFiltersView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ PfmFiltersView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public PfmFiltersView(Context context) {
        this(context, null, 0, 6, null);
    }
}
