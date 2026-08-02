package com.yandex.go.scooters.offers.v2.components.tariffs;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.OneShotPreDrawListener;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.payment.common.result.ResultType;
import defpackage.bys;
import defpackage.epo0;
import defpackage.f5p0;
import defpackage.i5p0;
import defpackage.j5p0;
import defpackage.m5p0;
import defpackage.mth;
import defpackage.n5p0;
import defpackage.o5p0;
import defpackage.p5p0;
import defpackage.qfh0;
import defpackage.qje;
import defpackage.s6n0;
import defpackage.sbn0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.uqs;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.y5n0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\b\u0005*\u00015\b\u0007\u0018\u00002\u00020\u0001:\u00018B7\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0011J\u001d\u0010\u0019\u001a\u00020\u000f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001b\u0010\u0011J\u000f\u0010\u001c\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001c\u0010\u0011J\u0015\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0017H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ3\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00172\u0006\u0010\u001f\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u00042\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u001d\u0010\"J%\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00172\u0006\u0010\u001f\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u0004H\u0002¢\u0006\u0004\b$\u0010%J\u001f\u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u0001H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u000fH\u0014¢\u0006\u0004\b,\u0010\u0011J\u000f\u0010-\u001a\u00020\u000fH\u0014¢\u0006\u0004\b-\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010.R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010/R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00100R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00101R\u0016\u00102\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00104\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00103R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u00069"}, d2 = {"Lcom/yandex/go/scooters/offers/v2/components/tariffs/ScootersTariffListView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "Landroidx/recyclerview/widget/LinearLayoutManager;", "tariffsLayoutManager", "Ln5p0;", "scootersTariffListPresenter", "Ls6n0;", "scootersCardV2ProxyAnalytics", "Lbys;", "Lj5p0;", "tariffsGenericAdapter", "<init>", "(Landroid/content/Context;Landroidx/recyclerview/widget/LinearLayoutManager;Ln5p0;Ls6n0;Lbys;)V", "Lzy11;", ResultType.RESULT_TYPE_LOADING, "()V", "Ly5n0;", "uiState", "success", "(Ly5n0;)V", "error", "", "tariffs", "ensureInitialSelectorItemFullyVisibleOnFirstRender", "(Ljava/util/List;)V", "addAnalyticsScrollListener", "removeAnalyticsScrollListener", "getVisibleTariffs", "()Ljava/util/List;", "recyclerView", "layoutManager", "listAdapter", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/LinearLayoutManager;Lbys;)Ljava/util/List;", "", "getVisibleItemsIndices", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/LinearLayoutManager;)Ljava/util/List;", "Landroid/view/View;", "view", "parent", "", "isPartiallyVisible", "(Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;)Z", "onAttachedToWindow", "onDetachedFromWindow", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Ln5p0;", "Ls6n0;", "Lbys;", "initialSelectedTariffVisibilityHandled", "Z", "visibleItemsScrollListenerAdded", "p5p0", "visibleItemsScrollListener", "Lp5p0;", "o5p0", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersTariffListView extends RecyclerView {
    public static final int $stable = 8;
    private boolean initialSelectedTariffVisibilityHandled;
    private final s6n0 scootersCardV2ProxyAnalytics;
    private final n5p0 scootersTariffListPresenter;
    private final bys tariffsGenericAdapter;
    private final LinearLayoutManager tariffsLayoutManager;
    private final p5p0 visibleItemsScrollListener;
    private boolean visibleItemsScrollListenerAdded;

    public ScootersTariffListView(Context context, LinearLayoutManager linearLayoutManager, n5p0 n5p0Var, s6n0 s6n0Var, bys bysVar) {
        super(context);
        this.tariffsLayoutManager = linearLayoutManager;
        this.scootersTariffListPresenter = n5p0Var;
        this.scootersCardV2ProxyAnalytics = s6n0Var;
        this.tariffsGenericAdapter = bysVar;
        this.visibleItemsScrollListener = new p5p0(this);
        setId(qfh0.scooters_component_tariff_list);
        setClipToPadding(false);
        setNestedScrollingEnabled(false);
        setBackgroundColor(qje.t(xng0.bgMain, getContext()));
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setAdapter(bysVar);
        setLayoutManager(linearLayoutManager);
    }

    private final void addAnalyticsScrollListener() {
        if (this.visibleItemsScrollListenerAdded) {
            return;
        }
        addOnScrollListener(this.visibleItemsScrollListener);
        this.visibleItemsScrollListenerAdded = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ensureInitialSelectorItemFullyVisibleOnFirstRender(List<? extends j5p0> tariffs) {
        if (this.initialSelectedTariffVisibilityHandled) {
            return;
        }
        this.initialSelectedTariffVisibilityHandled = true;
        Iterator<? extends j5p0> it = tariffs.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            j5p0 next = it.next();
            if ((next instanceof i5p0) && ((i5p0) next).c) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        View X = this.tariffsLayoutManager.X(i);
        if (X == null) {
            this.tariffsLayoutManager.r(i, getPaddingLeft());
            return;
        }
        int paddingLeft = getPaddingLeft();
        int width = getWidth() - getPaddingRight();
        if (X.getLeft() < paddingLeft) {
            scrollBy(X.getLeft() - paddingLeft, 0);
        } else if (X.getRight() > width) {
            scrollBy(X.getRight() - width, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void error() {
        this.initialSelectedTariffVisibilityHandled = false;
        removeAnalyticsScrollListener();
        setVisibility(8);
    }

    private final List<Integer> getVisibleItemsIndices(RecyclerView recyclerView, LinearLayoutManager layoutManager) {
        ArrayList arrayList = new ArrayList();
        int K1 = layoutManager.K1();
        int M1 = layoutManager.M1();
        if (K1 <= M1) {
            while (true) {
                View X = layoutManager.X(K1);
                if (X != null && isPartiallyVisible(X, recyclerView)) {
                    arrayList.add(Integer.valueOf(K1));
                }
                if (K1 == M1) {
                    break;
                }
                K1++;
            }
        }
        return arrayList;
    }

    private final List<j5p0> getVisibleTariffs(RecyclerView recyclerView, LinearLayoutManager layoutManager, bys listAdapter) {
        List<Integer> visibleItemsIndices = getVisibleItemsIndices(recyclerView, layoutManager);
        ArrayList arrayList = new ArrayList(tcc.n(visibleItemsIndices, 10));
        Iterator<T> it = visibleItemsIndices.iterator();
        while (it.hasNext()) {
            arrayList.add((j5p0) listAdapter.getItem(((Number) it.next()).intValue()));
        }
        return arrayList;
    }

    private final boolean isPartiallyVisible(View view, RecyclerView parent) {
        boolean z = view.getLayoutDirection() == 1;
        int right = z ? parent.getRight() : parent.getLeft();
        int left = z ? parent.getLeft() : parent.getRight();
        int right2 = z ? view.getRight() : view.getLeft();
        return Math.min(Math.max(0, z ? right2 - left : left - right2), Math.max(0, (z ? view.getLeft() : view.getRight()) - right)) >= view.getWidth() / 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loading() {
        this.initialSelectedTariffVisibilityHandled = false;
        removeAnalyticsScrollListener();
        if (getVisibility() == 0) {
            this.tariffsGenericAdapter.submitList(null, null);
            this.tariffsGenericAdapter.notifyDataSetChanged();
            this.tariffsGenericAdapter.submitList(Collections.singletonList(f5p0.a), null);
        }
    }

    private final void removeAnalyticsScrollListener() {
        if (this.visibleItemsScrollListenerAdded) {
            removeOnScrollListener(this.visibleItemsScrollListener);
            this.visibleItemsScrollListenerAdded = false;
            this.scootersCardV2ProxyAnalytics.e = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void success(y5n0 uiState) {
        addAnalyticsScrollListener();
        setVisibility(0);
        xw31.I(this, null, Integer.valueOf(uiState.j instanceof sbn0 ? tje.u(8, getContext()) : 0), null, null);
        this.tariffsGenericAdapter.submitList(uiState.h, new epo0(4, this, uiState));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void success$lambda$0(ScootersTariffListView scootersTariffListView, y5n0 y5n0Var) {
        OneShotPreDrawListener.add(scootersTariffListView, new uqs(14, scootersTariffListView, y5n0Var));
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        n5p0 n5p0Var = this.scootersTariffListPresenter;
        n5p0Var.Bg(new o5p0(this));
        tje.N(n5p0Var.Jg(), null, null, new ScootersTariffListPresenter$listenToState$$inlined$collectLatestIn$1(new mth(e.d(n5p0Var.A.a), 6), null, (m5p0) n5p0Var.Dg()), 3);
        loading();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.initialSelectedTariffVisibilityHandled = false;
        removeAnalyticsScrollListener();
        this.scootersTariffListPresenter.Cg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<j5p0> getVisibleTariffs() {
        return getVisibleTariffs(this, this.tariffsLayoutManager, this.tariffsGenericAdapter);
    }
}
