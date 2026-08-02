package com.yandex.div.core.view2.divs;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.yandex.div.core.downloader.DivPatchApply;
import com.yandex.div.core.downloader.DivPatchCache;
import com.yandex.div.core.downloader.DivPatchMap;
import com.yandex.div.core.expression.ExpressionResolverImpl;
import com.yandex.div.core.expression.ExpressionsRuntime;
import com.yandex.div.core.expression.local.UtilsKt;
import com.yandex.div.core.state.DivPathUtils;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.divs.DivCollectionViewHolder;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import xsna.epx;
import xsna.ggz;
import xsna.ikn;
import xsna.j5g;

/* compiled from: DivCollectionAdapter.kt */
/* loaded from: classes7.dex */
public abstract class DivCollectionAdapter<VH extends DivCollectionViewHolder> extends VisibilityAwareAdapter<VH> {
    private final BindingContext bindingContext;
    private List<String> ids;
    private final DivStatePath path;

    /* compiled from: DivCollectionAdapter.kt */
    public static final class DiffUtilCallback extends m.b {
        private final List<DivItemBuilderResult> newItems;
        private final List<DivItemBuilderResult> oldItems;

        public DiffUtilCallback(List<DivItemBuilderResult> list, List<DivItemBuilderResult> list2) {
            this.oldItems = list;
            this.newItems = list2;
        }

        private final void suppressMissingVariableException(DivItemBuilderResult divItemBuilderResult, boolean z) {
            ExpressionResolverImpl asImpl = UtilsKt.getAsImpl(divItemBuilderResult.getExpressionResolver());
            if (asImpl == null) {
                return;
            }
            asImpl.setSuppressMissingVariableException(z);
        }

        @Override // androidx.recyclerview.widget.m.b
        public boolean areContentsTheSame(int i, int i2) {
            return areContentsTheSame((DivItemBuilderResult) j5g.b0(i, this.oldItems), (DivItemBuilderResult) j5g.b0(i2, this.newItems));
        }

        @Override // androidx.recyclerview.widget.m.b
        public boolean areItemsTheSame(int i, int i2) {
            com.yandex.div2.a div;
            ikn b;
            Expression<String> i3;
            com.yandex.div2.a div2;
            ikn b2;
            Expression<String> i4;
            DivItemBuilderResult divItemBuilderResult = (DivItemBuilderResult) j5g.b0(i, this.oldItems);
            DivItemBuilderResult divItemBuilderResult2 = (DivItemBuilderResult) j5g.b0(i2, this.newItems);
            String str = null;
            String evaluate = (divItemBuilderResult == null || (div2 = divItemBuilderResult.getDiv()) == null || (b2 = div2.b()) == null || (i4 = b2.i()) == null) ? null : i4.evaluate(divItemBuilderResult.getExpressionResolver());
            if (divItemBuilderResult2 != null && (div = divItemBuilderResult2.getDiv()) != null && (b = div.b()) != null && (i3 = b.i()) != null) {
                str = i3.evaluate(divItemBuilderResult2.getExpressionResolver());
            }
            return (evaluate == null && str == null) ? areContentsTheSame(divItemBuilderResult, divItemBuilderResult2) : epx.f(evaluate, str);
        }

        @Override // androidx.recyclerview.widget.m.b
        public int getNewListSize() {
            return this.newItems.size();
        }

        @Override // androidx.recyclerview.widget.m.b
        public int getOldListSize() {
            return this.oldItems.size();
        }

        private final boolean areContentsTheSame(DivItemBuilderResult divItemBuilderResult, DivItemBuilderResult divItemBuilderResult2) {
            if (divItemBuilderResult == null || divItemBuilderResult2 == null) {
                return epx.f(divItemBuilderResult, divItemBuilderResult2);
            }
            suppressMissingVariableException(divItemBuilderResult, true);
            suppressMissingVariableException(divItemBuilderResult2, true);
            boolean a = divItemBuilderResult.getDiv().a(divItemBuilderResult2.getDiv(), divItemBuilderResult.getExpressionResolver(), divItemBuilderResult2.getExpressionResolver());
            suppressMissingVariableException(divItemBuilderResult, false);
            suppressMissingVariableException(divItemBuilderResult2, false);
            return a;
        }
    }

    public DivCollectionAdapter(BindingContext bindingContext, DivStatePath divStatePath, List<DivItemBuilderResult> list) {
        super(list);
        this.bindingContext = bindingContext;
        this.path = divStatePath;
        this.ids = DivPathUtils.INSTANCE.getItemIds(list);
    }

    private final void updateIds() {
        this.ids = DivPathUtils.INSTANCE.getItemIds(getItems());
    }

    public final boolean applyPatch(RecyclerView recyclerView, DivPatchCache divPatchCache, BindingContext bindingContext) {
        DivPatchMap patch = divPatchCache.getPatch(bindingContext.getDivView().getDataTag());
        if (patch != null) {
            DivPatchApply divPatchApply = new DivPatchApply(patch);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < getItems().size()) {
                String id = getItems().get(i).getDiv().b().getId();
                List<com.yandex.div2.a> patchDivListById = id != null ? divPatchCache.getPatchDivListById(bindingContext.getDivView().getDataTag(), id) : null;
                if (patchDivListById != null) {
                    removeItem(i);
                    addItems(i, DivCollectionExtensionsKt.toDivItemBuilderResult(patchDivListById, bindingContext.getExpressionResolver()));
                    i += patchDivListById.size() - 1;
                    linkedHashSet.add(id);
                }
                i++;
            }
            Set<String> keySet = patch.getPatches().keySet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : keySet) {
                if (!linkedHashSet.contains((String) obj)) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                int size = getItems().size();
                int i2 = 0;
                while (true) {
                    if (i2 < size) {
                        com.yandex.div2.a patchDivChild = divPatchApply.patchDivChild(recyclerView != null ? recyclerView : bindingContext.getDivView(), getItems().get(i2).getDiv(), str, bindingContext.getExpressionResolver());
                        if (patchDivChild != null) {
                            VisibilityAwareAdapter.setItem$default(this, i2, new DivItemBuilderResult(patchDivChild, bindingContext.getExpressionResolver()), null, 4, null);
                            break;
                        }
                        i2++;
                    }
                }
            }
            if (!linkedHashSet.isEmpty()) {
                updateIds();
                subscribeOnElements();
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        DivItemBuilderResult divItemBuilderResult = (DivItemBuilderResult) j5g.b0(i, getVisibleItems());
        if (divItemBuilderResult == null) {
            return 0;
        }
        Expression<String> i2 = divItemBuilderResult.getDiv().b().i();
        String evaluate = i2 != null ? i2.evaluate(divItemBuilderResult.getExpressionResolver()) : null;
        if (evaluate != null) {
            return evaluate.hashCode();
        }
        return 0;
    }

    public void setItems(List<DivItemBuilderResult> list) {
        DiffUtilCallback diffUtilCallback = new DiffUtilCallback(getItems(), list);
        m.a(diffUtilCallback, true).c(new UpdateCallBack(list));
        updateIds();
        subscribeOnElements();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(VH vh, int i) {
        ExpressionResolver expressionResolver;
        DivItemBuilderResult divItemBuilderResult = getVisibleItems().get(i);
        DivStatePath appendDiv = this.path.appendDiv(this.ids.get(getItems().indexOf(divItemBuilderResult)));
        ExpressionsRuntime resolveRuntimeWith = this.bindingContext.getDivView().getRuntimeStore$div_release().resolveRuntimeWith(this.bindingContext.getDivView(), appendDiv, divItemBuilderResult.getDiv(), divItemBuilderResult.getExpressionResolver(), this.bindingContext.getExpressionResolver());
        if (resolveRuntimeWith == null || (expressionResolver = resolveRuntimeWith.getExpressionResolver()) == null) {
            expressionResolver = divItemBuilderResult.getExpressionResolver();
        }
        vh.bind(this.bindingContext.getFor(expressionResolver), divItemBuilderResult.getDiv(), i, appendDiv);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(VH vh) {
        super.onViewAttachedToWindow((DivCollectionAdapter<VH>) vh);
        vh.updateState();
    }

    /* compiled from: DivCollectionAdapter.kt */
    public final class UpdateCallBack implements ggz {
        private final List<DivItemBuilderResult> newItems;

        public UpdateCallBack(List<DivItemBuilderResult> list) {
            this.newItems = list;
        }

        @Override // xsna.ggz
        public void onInserted(int i, int i2) {
            int size = i + i2 > this.newItems.size() ? this.newItems.size() - i2 : i;
            DivCollectionAdapter.this.addItems(i, this.newItems.subList(size, i2 + size));
        }

        @Override // xsna.ggz
        public void onMoved(int i, int i2) {
            onRemoved(i, 1);
            onInserted(i2, 1);
        }

        @Override // xsna.ggz
        public void onRemoved(int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                DivCollectionAdapter.this.removeItem(i);
            }
        }

        @Override // xsna.ggz
        public void onChanged(int i, int i2, Object obj) {
        }
    }
}
