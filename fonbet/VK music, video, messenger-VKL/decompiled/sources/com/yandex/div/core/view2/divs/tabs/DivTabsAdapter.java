package com.yandex.div.core.view2.divs.tabs;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.vk.movika.sdk.base.hooks.k;
import com.yandex.div.core.downloader.DivPatchApply;
import com.yandex.div.core.downloader.DivPatchCache;
import com.yandex.div.core.downloader.DivPatchMap;
import com.yandex.div.core.state.DivPathUtils;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.util.ReleasablesKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.divs.widgets.ReleaseUtils;
import com.yandex.div.internal.viewpool.ViewPool;
import com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi;
import com.yandex.div.internal.widget.tabs.HeightCalculatorFactory;
import com.yandex.div.internal.widget.tabs.TabTextStyleProvider;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivTabs;
import com.yandex.div2.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import xsna.c5g;
import xsna.izs;
import xsna.u11;

/* compiled from: DivTabsAdapter.kt */
/* loaded from: classes7.dex */
public final class DivTabsAdapter extends BaseDivTabbedCardUi<DivSimpleTab, ViewGroup, DivAction> {
    private final DivTabsActiveStateTracker activeStateTracker;
    private BindingContext bindingContext;
    private List<String> childIds;
    private final Map<String, DivStatePath> childStates;
    private final DivBinder divBinder;
    private final DivPatchCache divPatchCache;
    private final DivTabsEventManager divTabsEventManager;
    private final boolean isDynamicHeight;
    private final PagerController pager;
    private DivStatePath path;
    private final Map<ViewGroup, TabModel> tabModels;
    private final View view;
    private final DivViewCreator viewCreator;

    public DivTabsAdapter(ViewPool viewPool, View view, BaseDivTabbedCardUi.TabbedCardConfig tabbedCardConfig, HeightCalculatorFactory heightCalculatorFactory, boolean z, BindingContext bindingContext, TabTextStyleProvider tabTextStyleProvider, DivViewCreator divViewCreator, DivBinder divBinder, DivTabsEventManager divTabsEventManager, DivTabsActiveStateTracker divTabsActiveStateTracker, DivStatePath divStatePath, DivPatchCache divPatchCache) {
        super(viewPool, view, tabbedCardConfig, heightCalculatorFactory, tabTextStyleProvider, divTabsEventManager, divTabsEventManager, divTabsActiveStateTracker);
        this.view = view;
        this.isDynamicHeight = z;
        this.bindingContext = bindingContext;
        this.viewCreator = divViewCreator;
        this.divBinder = divBinder;
        this.divTabsEventManager = divTabsEventManager;
        this.activeStateTracker = divTabsActiveStateTracker;
        this.path = divStatePath;
        this.divPatchCache = divPatchCache;
        this.tabModels = new LinkedHashMap();
        this.childStates = new LinkedHashMap();
        this.childIds = EmptyList.b;
        this.pager = new PagerController(this.mPager);
    }

    private final View createItemView(a aVar, ExpressionResolver expressionResolver, int i) {
        View create = this.viewCreator.create(aVar, expressionResolver);
        u11.h(-1, -1, create);
        this.divBinder.bind(this.bindingContext, create, aVar, getChildPath(i));
        return create;
    }

    private final DivStatePath getChildPath(int i) {
        Map<String, DivStatePath> map = this.childStates;
        String str = this.childIds.get(i);
        DivStatePath divStatePath = map.get(str);
        if (divStatePath == null) {
            divStatePath = this.path.appendDiv(this.childIds.get(i));
            map.put(str, divStatePath);
        }
        return divStatePath;
    }

    public final a.o applyPatch(ExpressionResolver expressionResolver, a.o oVar) {
        DivPatchMap patch = this.divPatchCache.getPatch(this.bindingContext.getDivView().getDataTag());
        if (patch == null) {
            return null;
        }
        a.o oVar2 = (a.o) new DivPatchApply(patch).applyPatchForDiv(oVar, expressionResolver).get(0);
        DisplayMetrics displayMetrics = this.bindingContext.getDivView().getResources().getDisplayMetrics();
        List<DivTabs.a> list = oVar2.c.q;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new DivSimpleTab((DivTabs.a) it.next(), displayMetrics, expressionResolver));
        }
        setData(new k(arrayList, 22), this.mPager.getCurrentItem());
        return oVar2;
    }

    public final DivTabsActiveStateTracker getActiveStateTracker() {
        return this.activeStateTracker;
    }

    public final DivTabsEventManager getDivTabsEventManager() {
        return this.divTabsEventManager;
    }

    public final PagerController getPager() {
        return this.pager;
    }

    public final boolean isDynamicHeight() {
        return this.isDynamicHeight;
    }

    public final void notifyStateChanged() {
        for (Map.Entry<ViewGroup, TabModel> entry : this.tabModels.entrySet()) {
            ViewGroup key = entry.getKey();
            TabModel value = entry.getValue();
            this.divBinder.bind(this.bindingContext, value.getView(), value.getDiv(), getChildPath(value.getIndex()));
            key.requestLayout();
        }
    }

    public final void setBindingContext(BindingContext bindingContext) {
        this.bindingContext = bindingContext;
    }

    public final void setData(BaseDivTabbedCardUi.Input<DivSimpleTab> input, int i) {
        this.childIds = DivPathUtils.getIds$default(DivPathUtils.INSTANCE, input.getTabs(), new izs<DivSimpleTab, a>() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsAdapter$setData$1
            @Override // xsna.izs
            public final a invoke(DivSimpleTab divSimpleTab) {
                return divSimpleTab.getItem().a;
            }
        }, null, 2, null);
        super.setData(input, this.bindingContext.getExpressionResolver(), ReleasablesKt.getExpressionSubscriber(this.view));
        this.tabModels.clear();
        this.mPager.setCurrentItem(i, true);
    }

    public final void setStatePath(DivStatePath divStatePath) {
        this.path = divStatePath;
        this.childStates.clear();
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi
    public ViewGroup bindTabData(ViewGroup viewGroup, DivSimpleTab divSimpleTab, int i) {
        ReleaseUtils.INSTANCE.releaseAndRemoveChildren$div_release(viewGroup, this.bindingContext.getDivView());
        a aVar = divSimpleTab.getItem().a;
        View createItemView = createItemView(aVar, this.bindingContext.getExpressionResolver(), i);
        this.tabModels.put(viewGroup, new TabModel(i, aVar, createItemView));
        viewGroup.addView(createItemView);
        return viewGroup;
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi
    public void unbindTabData(ViewGroup viewGroup) {
        this.tabModels.remove(viewGroup);
        ReleaseUtils.INSTANCE.releaseAndRemoveChildren$div_release(viewGroup, this.bindingContext.getDivView());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List applyPatch$lambda$4(List list) {
        return list;
    }
}
