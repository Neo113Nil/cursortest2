package com.yandex.div.core.view2.reuse;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.div.core.view2.divs.gallery.DivGalleryAdapter;
import com.yandex.div.core.view2.divs.pager.DivPagerAdapter;
import com.yandex.div.core.view2.divs.widgets.DivCustomWrapper;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.core.view2.divs.widgets.DivRecyclerView;
import com.yandex.div.core.view2.divs.widgets.DivStateLayout;
import com.yandex.div.core.view2.reuse.RebindTask;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivContainer;
import com.yandex.div2.DivGallery;
import com.yandex.div2.DivPager;
import com.yandex.div2.a;
import com.yandex.div2.b5;
import com.yandex.div2.g3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.c5g;
import xsna.e43;
import xsna.ff;

/* compiled from: ExistingToken.kt */
/* loaded from: classes7.dex */
public final class ExistingToken extends Token {
    private final ExistingToken parentToken;
    private final View view;

    public ExistingToken(DivItemBuilderResult divItemBuilderResult, int i, View view, ExistingToken existingToken) {
        super(divItemBuilderResult, i);
        this.view = view;
        this.parentToken = existingToken;
    }

    public static /* synthetic */ List getChildrenTokens$default(ExistingToken existingToken, ExistingToken existingToken2, int i, Object obj) {
        if ((i & 1) != 0) {
            existingToken2 = null;
        }
        return existingToken.getChildrenTokens(existingToken2);
    }

    private final List<ExistingToken> itemsToExistingTokenList(DivContainer divContainer, ExpressionResolver expressionResolver, ExistingToken existingToken) {
        return simpleItemsToExistingTokenList(DivCollectionExtensionsKt.buildItems(divContainer, expressionResolver), existingToken);
    }

    private final List<ExistingToken> simpleItemsToExistingTokenList(List<DivItemBuilderResult> list, ExistingToken existingToken) {
        View childAt;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            DivItemBuilderResult divItemBuilderResult = (DivItemBuilderResult) obj;
            View view = this.view;
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup == null || (childAt = viewGroup.getChildAt(i)) == null) {
                return EmptyList.b;
            }
            arrayList.add(new ExistingToken(divItemBuilderResult, i, childAt, existingToken == null ? this : existingToken));
            i = i2;
        }
        return arrayList;
    }

    private final List<ExistingToken> stateToExistingTokenList(ExpressionResolver expressionResolver, ExistingToken existingToken) {
        a activeStateDiv$div_release;
        View view = this.view;
        DivStateLayout divStateLayout = view instanceof DivStateLayout ? (DivStateLayout) view : null;
        return (divStateLayout == null || (activeStateDiv$div_release = divStateLayout.getActiveStateDiv$div_release()) == null) ? EmptyList.b : simpleItemsToExistingTokenList(DivCollectionExtensionsKt.toDivItemBuilderResult(Collections.singletonList(activeStateDiv$div_release), expressionResolver), existingToken);
    }

    public final List<ExistingToken> getChildrenTokens(ExistingToken existingToken) {
        a div = getDiv();
        if (div instanceof a.p) {
            return EmptyList.b;
        }
        if (div instanceof a.f) {
            return EmptyList.b;
        }
        if (div instanceof a.d) {
            return EmptyList.b;
        }
        if (div instanceof a.k) {
            return EmptyList.b;
        }
        if (div instanceof a.g) {
            return EmptyList.b;
        }
        if (div instanceof a.l) {
            return EmptyList.b;
        }
        if (div instanceof a.h) {
            return EmptyList.b;
        }
        if (div instanceof a.j) {
            return EmptyList.b;
        }
        if (div instanceof a.q) {
            return EmptyList.b;
        }
        if (div instanceof a.n) {
            return EmptyList.b;
        }
        if (div instanceof a.C2110a) {
            return itemsToExistingTokenList(((a.C2110a) getDiv()).c, getItem().getExpressionResolver(), existingToken);
        }
        if (div instanceof a.b) {
            return itemsToExistingTokenList(((a.b) getDiv()).c, getItem().getExpressionResolver(), existingToken);
        }
        if (div instanceof a.e) {
            return itemsToExistingTokenList(((a.e) getDiv()).c, getItem().getExpressionResolver(), existingToken);
        }
        if (div instanceof a.c) {
            return itemsToExistingTokenList(((a.c) getDiv()).c, getItem().getExpressionResolver(), existingToken);
        }
        if (div instanceof a.i) {
            return itemsToExistingTokenList(((a.i) getDiv()).c, getItem().getExpressionResolver(), existingToken);
        }
        if (div instanceof a.o) {
            throw new RebindTask.UnsupportedElementException(getDiv().getClass());
        }
        if (div instanceof a.m) {
            return stateToExistingTokenList(getItem().getExpressionResolver(), existingToken);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final ExistingToken getParentToken() {
        return this.parentToken;
    }

    public final View getView() {
        return this.view;
    }

    private final List<ExistingToken> itemsToExistingTokenList(g3 g3Var, ExpressionResolver expressionResolver, ExistingToken existingToken) {
        ArrayList arrayList = new ArrayList();
        View view = this.view;
        DivCustomWrapper divCustomWrapper = view instanceof DivCustomWrapper ? (DivCustomWrapper) view : null;
        View customView = divCustomWrapper != null ? divCustomWrapper.getCustomView() : null;
        ViewGroup viewGroup = customView instanceof ViewGroup ? (ViewGroup) customView : null;
        if (viewGroup == null) {
            return EmptyList.b;
        }
        int i = 0;
        for (Object obj : DivCollectionExtensionsKt.getNonNullItems(g3Var)) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            DivItemBuilderResult itemBuilderResult = DivCollectionExtensionsKt.toItemBuilderResult((a) obj, expressionResolver);
            View childAt = viewGroup.getChildAt(i);
            if (childAt == null) {
                return EmptyList.b;
            }
            arrayList.add(new ExistingToken(itemBuilderResult, i, childAt, existingToken == null ? this : existingToken));
            i = i2;
        }
        return arrayList;
    }

    private final List<ExistingToken> itemsToExistingTokenList(b5 b5Var, ExpressionResolver expressionResolver, ExistingToken existingToken) {
        return simpleItemsToExistingTokenList(DivCollectionExtensionsKt.itemsToDivItemBuilderResult(b5Var, expressionResolver), existingToken);
    }

    private final List<ExistingToken> itemsToExistingTokenList(DivPager divPager, ExpressionResolver expressionResolver, ExistingToken existingToken) {
        ViewPager2 viewPager;
        ArrayList arrayList = new ArrayList();
        View view = this.view;
        DivPagerView divPagerView = view instanceof DivPagerView ? (DivPagerView) view : null;
        if (divPagerView != null && (viewPager = divPagerView.getViewPager()) != null) {
            RecyclerView.Adapter adapter = viewPager.getAdapter();
            DivPagerAdapter divPagerAdapter = adapter instanceof DivPagerAdapter ? (DivPagerAdapter) adapter : null;
            if (divPagerAdapter == null) {
                return EmptyList.b;
            }
            ff<DivItemBuilderResult> itemsToShow = divPagerAdapter.getItemsToShow();
            ArrayList arrayList2 = new ArrayList(c5g.u(itemsToShow, 10));
            Iterator<DivItemBuilderResult> it = itemsToShow.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf(it.next().getDiv().hash()));
            }
            int i = 0;
            for (Object obj : DivCollectionExtensionsKt.buildItems(divPager, expressionResolver)) {
                int i2 = i + 1;
                if (i >= 0) {
                    DivItemBuilderResult divItemBuilderResult = (DivItemBuilderResult) obj;
                    if (arrayList2.contains(Integer.valueOf(divItemBuilderResult.getDiv().hash()))) {
                        View pageView = ((DivPagerView) this.view).getPageView(arrayList2.indexOf(Integer.valueOf(divItemBuilderResult.getDiv().hash())));
                        if (pageView != null) {
                            arrayList.add(new ExistingToken(divItemBuilderResult, i, pageView, existingToken == null ? this : existingToken));
                        }
                    }
                    i = i2;
                } else {
                    e43.t();
                    throw null;
                }
            }
            return arrayList;
        }
        return EmptyList.b;
    }

    private final List<ExistingToken> itemsToExistingTokenList(DivGallery divGallery, ExpressionResolver expressionResolver, ExistingToken existingToken) {
        View itemView;
        ArrayList arrayList = new ArrayList();
        View view = this.view;
        DivRecyclerView divRecyclerView = view instanceof DivRecyclerView ? (DivRecyclerView) view : null;
        RecyclerView.Adapter adapter = divRecyclerView != null ? divRecyclerView.getAdapter() : null;
        DivGalleryAdapter divGalleryAdapter = adapter instanceof DivGalleryAdapter ? (DivGalleryAdapter) adapter : null;
        if (divGalleryAdapter == null) {
            return EmptyList.b;
        }
        List<DivItemBuilderResult> visibleItems = divGalleryAdapter.getVisibleItems();
        ArrayList arrayList2 = new ArrayList(c5g.u(visibleItems, 10));
        Iterator<T> it = visibleItems.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(((DivItemBuilderResult) it.next()).getDiv().hash()));
        }
        int i = 0;
        for (Object obj : DivCollectionExtensionsKt.buildItems(divGallery, expressionResolver)) {
            int i2 = i + 1;
            if (i >= 0) {
                DivItemBuilderResult divItemBuilderResult = (DivItemBuilderResult) obj;
                if (arrayList2.contains(Integer.valueOf(divItemBuilderResult.getDiv().hash())) && (itemView = ((DivRecyclerView) this.view).getItemView(i)) != null) {
                    arrayList.add(new ExistingToken(divItemBuilderResult, i, itemView, existingToken == null ? this : existingToken));
                }
                i = i2;
            } else {
                e43.t();
                throw null;
            }
        }
        return arrayList;
    }
}
