package com.yandex.div.core.view2.divs.pager;

import androidx.viewpager2.widget.ViewPager2;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.internal.KLog;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.logging.Severity;
import com.yandex.div2.DivAction;
import java.util.List;
import xsna.gzs;
import xsna.s3q0;
import xsna.sk3;
import xsna.uqi;

/* compiled from: PagerSelectedActionsDispatcher.kt */
/* loaded from: classes7.dex */
public final class PagerSelectedActionsDispatcher {
    private final DivActionBinder divActionBinder;
    private final Div2View divView;
    private final List<DivItemBuilderResult> items;
    private ViewPager2.g pageSelectionTracker;

    /* compiled from: PagerSelectedActionsDispatcher.kt */
    public final class PageSelectionTracker extends ViewPager2.g {
        private int currentPage = -1;
        private final sk3<Integer> selectedPages = new sk3<>();

        public PageSelectionTracker() {
        }

        private final void trackSelectedPages() {
            while (!this.selectedPages.isEmpty()) {
                int intValue = this.selectedPages.removeFirst().intValue();
                KLog kLog = KLog.INSTANCE;
                if (kLog.isAtLeast(Severity.DEBUG)) {
                    kLog.print(3, "Ya:PagerSelectedActionsTracker", "dispatch selected actions for page " + intValue);
                }
                PagerSelectedActionsDispatcher pagerSelectedActionsDispatcher = PagerSelectedActionsDispatcher.this;
                pagerSelectedActionsDispatcher.dispatchSelectedActions((DivItemBuilderResult) pagerSelectedActionsDispatcher.items.get(intValue));
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public void onPageScrollStateChanged(int i) {
            if (i == 0) {
                trackSelectedPages();
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public void onPageSelected(int i) {
            KLog kLog = KLog.INSTANCE;
            if (kLog.isAtLeast(Severity.DEBUG)) {
                kLog.print(3, "Ya:PagerSelectedActionsTracker", uqi.a("onPageSelected(", i, ')'));
            }
            if (this.currentPage == i) {
                return;
            }
            if (i != -1) {
                this.selectedPages.add(Integer.valueOf(i));
            }
            if (this.currentPage == -1) {
                trackSelectedPages();
            }
            this.currentPage = i;
        }
    }

    public PagerSelectedActionsDispatcher(Div2View div2View, List<DivItemBuilderResult> list, DivActionBinder divActionBinder) {
        this.divView = div2View;
        this.items = list;
        this.divActionBinder = divActionBinder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispatchSelectedActions(final DivItemBuilderResult divItemBuilderResult) {
        final List<DivAction> n = divItemBuilderResult.getDiv().b().n();
        if (n != null) {
            this.divView.bulkActions$div_release(new gzs<s3q0>() { // from class: com.yandex.div.core.view2.divs.pager.PagerSelectedActionsDispatcher$dispatchSelectedActions$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // xsna.gzs
                public /* bridge */ /* synthetic */ s3q0 invoke() {
                    invoke2();
                    return s3q0.a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    DivActionBinder divActionBinder;
                    Div2View div2View;
                    divActionBinder = PagerSelectedActionsDispatcher.this.divActionBinder;
                    div2View = PagerSelectedActionsDispatcher.this.divView;
                    DivActionBinder.handleActions$div_release$default(divActionBinder, div2View, divItemBuilderResult.getExpressionResolver(), n, "selection", null, 16, null);
                }
            });
        }
    }

    public final void attach(ViewPager2 viewPager2) {
        PageSelectionTracker pageSelectionTracker = new PageSelectionTracker();
        viewPager2.b(pageSelectionTracker);
        this.pageSelectionTracker = pageSelectionTracker;
    }

    public final void detach(ViewPager2 viewPager2) {
        ViewPager2.g gVar = this.pageSelectionTracker;
        if (gVar != null) {
            viewPager2.g(gVar);
        }
        this.pageSelectionTracker = null;
    }
}
