package com.yandex.div.core.view2.items;

import android.view.View;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.core.view2.divs.widgets.DivRecyclerView;
import com.yandex.div.core.view2.divs.widgets.DivTabsLayout;
import com.yandex.div.core.view2.items.DivViewWithItems;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivSizeUnit;
import kotlin.NoWhenBranchMatchedException;
import xsna.zcl;

/* compiled from: DivViewWithItemsController.kt */
/* loaded from: classes7.dex */
public final class DivViewWithItemsController {
    public static final Companion Companion = new Companion(null);
    private final DivViewWithItems view;

    /* compiled from: DivViewWithItemsController.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public static /* synthetic */ DivViewWithItemsController create$default(Companion companion, String str, DivViewFacade divViewFacade, ExpressionResolver expressionResolver, Direction direction, int i, Object obj) {
            if ((i & 8) != 0) {
                direction = Direction.NEXT;
            }
            return companion.create(str, divViewFacade, expressionResolver, direction);
        }

        public final DivViewWithItemsController create(String str, DivViewFacade divViewFacade, ExpressionResolver expressionResolver, Direction direction) {
            View findViewWithTag = divViewFacade.getView().findViewWithTag(str);
            zcl zclVar = null;
            if (findViewWithTag != null) {
                DivViewWithItems viewForTests$div_release = DivViewWithItems.Companion.getViewForTests$div_release();
                if (viewForTests$div_release == null) {
                    if (findViewWithTag instanceof DivRecyclerView) {
                        DivRecyclerView divRecyclerView = (DivRecyclerView) findViewWithTag;
                        int i = DivViewWithItems.Companion.WhenMappings.$EnumSwitchMapping$0[divRecyclerView.getDiv().c.C.evaluate(expressionResolver).ordinal()];
                        if (i == 1) {
                            viewForTests$div_release = new DivViewWithItems.Gallery(divRecyclerView, direction);
                        } else {
                            if (i != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            viewForTests$div_release = new DivViewWithItems.PagingGallery(divRecyclerView, direction);
                        }
                    } else {
                        viewForTests$div_release = findViewWithTag instanceof DivPagerView ? new DivViewWithItems.Pager((DivPagerView) findViewWithTag) : findViewWithTag instanceof DivTabsLayout ? new DivViewWithItems.Tabs((DivTabsLayout) findViewWithTag) : null;
                    }
                }
                if (viewForTests$div_release != null) {
                    return new DivViewWithItemsController(viewForTests$div_release, zclVar);
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    public /* synthetic */ DivViewWithItemsController(DivViewWithItems divViewWithItems, zcl zclVar) {
        this(divViewWithItems);
    }

    private final OverflowItemStrategy createStrategy(String str) {
        return OverflowItemStrategy.Companion.create$div_release(str, this.view.getCurrentItem(), this.view.getItemCount(), this.view.getScrollRange(), this.view.getScrollOffset(), this.view.getMetrics());
    }

    public final void changeCurrentItemByStep(String str, int i, boolean z) {
        int previousItem;
        OverflowItemStrategy createStrategy = createStrategy(str);
        if (i > 0) {
            previousItem = createStrategy.nextItem(i);
        } else if (i >= 0) {
            return;
        } else {
            previousItem = createStrategy.previousItem(-i);
        }
        setCurrentItem(previousItem, z);
    }

    public final void scrollByOffset(String str, int i, boolean z) {
        if (i == 0) {
            return;
        }
        DivViewWithItems.scrollTo$default(this.view, createStrategy(str).positionAfterScrollBy(i), null, z, 2, null);
    }

    public final void scrollTo(int i, boolean z) {
        this.view.scrollTo(i, DivSizeUnit.DP, z);
    }

    public final void scrollToEnd(boolean z) {
        this.view.scrollToTheEnd(z);
    }

    public final void scrollToStart(boolean z) {
        setCurrentItem(0, z);
    }

    public final void setCurrentItem(int i, boolean z) {
        if (z) {
            this.view.setCurrentItem(i);
        } else {
            this.view.setCurrentItemNoAnimation(i);
        }
    }

    private DivViewWithItemsController(DivViewWithItems divViewWithItems) {
        this.view = divViewWithItems;
    }
}
