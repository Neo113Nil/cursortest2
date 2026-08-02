package com.yandex.div.core.view2.items;

import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div2.DivSizeUnit;
import kotlin.NoWhenBranchMatchedException;
import xsna.wzs;

/* compiled from: DivViewWithItems.kt */
/* loaded from: classes7.dex */
public final class DivViewWithItemsKt {

    /* compiled from: DivViewWithItems.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Direction.values().length];
            try {
                iArr[Direction.PREVIOUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Direction.NEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DivSizeUnit.values().length];
            try {
                iArr2[DivSizeUnit.PX.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[DivSizeUnit.SP.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[DivSizeUnit.DP.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private static final <T extends RecyclerView> boolean canScroll(T t) {
        LinearLayoutManager linearLayoutManager = getLinearLayoutManager(t);
        Integer valueOf = linearLayoutManager != null ? Integer.valueOf(linearLayoutManager.b) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            return t.canScrollHorizontally(1);
        }
        if (valueOf != null && valueOf.intValue() == 1) {
            return t.canScrollVertically(1);
        }
        return false;
    }

    private static final <T extends RecyclerView> int completelyVisibleItemPosition(T t, Direction direction) {
        LinearLayoutManager linearLayoutManager = getLinearLayoutManager(t);
        if (linearLayoutManager == null) {
            return -1;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[direction.ordinal()];
        if (i == 1) {
            return linearLayoutManager.s();
        }
        if (i == 2) {
            return canScroll(t) ? linearLayoutManager.s() : linearLayoutManager.w();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends RecyclerView> int currentItem(T t, Direction direction) {
        Integer valueOf = Integer.valueOf(completelyVisibleItemPosition(t, direction));
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        LinearLayoutManager linearLayoutManager = getLinearLayoutManager(t);
        if (linearLayoutManager != null) {
            return visibleItemPosition(linearLayoutManager, direction);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getItemCount(RecyclerView recyclerView) {
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            return layoutManager.getItemCount();
        }
        return 0;
    }

    private static final <T extends RecyclerView> LinearLayoutManager getLinearLayoutManager(T t) {
        RecyclerView.o layoutManager = t.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return (LinearLayoutManager) layoutManager;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends RecyclerView> int scrollOffset(T t) {
        LinearLayoutManager linearLayoutManager = getLinearLayoutManager(t);
        Integer valueOf = linearLayoutManager != null ? Integer.valueOf(linearLayoutManager.b) : null;
        return (valueOf != null && valueOf.intValue() == 0) ? t.computeHorizontalScrollOffset() : t.computeVerticalScrollOffset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends RecyclerView> int scrollRange(T t) {
        int paddingTop;
        int paddingBottom;
        LinearLayoutManager linearLayoutManager = getLinearLayoutManager(t);
        Integer valueOf = linearLayoutManager != null ? Integer.valueOf(linearLayoutManager.b) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            paddingTop = t.getPaddingLeft() + (t.computeHorizontalScrollRange() - t.getWidth());
            paddingBottom = t.getPaddingRight();
        } else {
            paddingTop = t.getPaddingTop() + (t.computeVerticalScrollRange() - t.getHeight());
            paddingBottom = t.getPaddingBottom();
        }
        return paddingBottom + paddingTop;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends RecyclerView> void scrollTo(T t, int i, DivSizeUnit divSizeUnit, DisplayMetrics displayMetrics, boolean z) {
        int i2 = WhenMappings.$EnumSwitchMapping$1[divSizeUnit.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                i = BaseDivViewExtensionsKt.spToPx(Integer.valueOf(i), displayMetrics);
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i = BaseDivViewExtensionsKt.dpToPx(Integer.valueOf(i), displayMetrics);
            }
        }
        LinearLayoutManager linearLayoutManager = getLinearLayoutManager(t);
        if (linearLayoutManager == null) {
            return;
        }
        wzs divViewWithItemsKt$scrollTo$scroll$1 = z ? new DivViewWithItemsKt$scrollTo$scroll$1(t) : new DivViewWithItemsKt$scrollTo$scroll$2(t);
        int i3 = linearLayoutManager.b;
        if (i3 == 0) {
            divViewWithItemsKt$scrollTo$scroll$1.invoke(Integer.valueOf(i - t.computeHorizontalScrollOffset()), 0);
        } else {
            if (i3 != 1) {
                return;
            }
            divViewWithItemsKt$scrollTo$scroll$1.invoke(0, Integer.valueOf(i - t.computeVerticalScrollOffset()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends RecyclerView> void scrollToTheEnd(T t, DisplayMetrics displayMetrics, boolean z) {
        scrollTo(t, scrollRange(t), DivSizeUnit.PX, displayMetrics, z);
    }

    private static final int visibleItemPosition(LinearLayoutManager linearLayoutManager, Direction direction) {
        int i = WhenMappings.$EnumSwitchMapping$0[direction.ordinal()];
        if (i == 1) {
            return linearLayoutManager.x();
        }
        if (i == 2) {
            return linearLayoutManager.v();
        }
        throw new NoWhenBranchMatchedException();
    }
}
