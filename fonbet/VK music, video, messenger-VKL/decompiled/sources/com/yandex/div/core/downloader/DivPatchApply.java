package com.yandex.div.core.downloader;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.view2.divs.gallery.DivGalleryAdapter;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.core.view2.divs.widgets.DivRecyclerView;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.KLog;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.logging.Severity;
import com.yandex.div2.DivContainer;
import com.yandex.div2.DivGallery;
import com.yandex.div2.DivPager;
import com.yandex.div2.DivTabs;
import com.yandex.div2.a;
import com.yandex.div2.b5;
import com.yandex.div2.g3;
import com.yandex.div2.ma;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.collections.EmptyList;
import xsna.c5g;
import xsna.e43;
import xsna.epx;
import xsna.g5g;
import xsna.gzs;
import xsna.ikn;
import xsna.izs;
import xsna.zcl;

/* compiled from: DivPatchApply.kt */
/* loaded from: classes7.dex */
public final class DivPatchApply {
    public static final Companion Companion = new Companion(null);
    private final Set<String> appliedPatches = new LinkedHashSet();
    private final DivPatchMap patch;

    /* compiled from: DivPatchApply.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public DivPatchApply(DivPatchMap divPatchMap) {
        this.patch = divPatchMap;
    }

    private final List<a> applyPatch(a aVar, ExpressionResolver expressionResolver) {
        String id = aVar.b().getId();
        if (id != null && this.patch.getPatches().containsKey(id)) {
            return applyPatchForSingleDiv(aVar);
        }
        if (aVar instanceof a.C2110a) {
            aVar = applyPatch(((a.C2110a) aVar).c, expressionResolver);
        } else if (aVar instanceof a.e) {
            aVar = applyPatch(((a.e) aVar).c, expressionResolver);
        } else if (aVar instanceof a.c) {
            aVar = applyPatch(((a.c) aVar).c, expressionResolver);
        } else if (aVar instanceof a.i) {
            aVar = applyPatch(((a.i) aVar).c, expressionResolver);
        } else if (aVar instanceof a.m) {
            aVar = applyPatch(((a.m) aVar).c, expressionResolver);
        } else if (aVar instanceof a.o) {
            aVar = applyPatch(((a.o) aVar).c, expressionResolver);
        } else if (aVar instanceof a.b) {
            aVar = applyPatch(((a.b) aVar).c, expressionResolver);
        }
        return Collections.singletonList(aVar);
    }

    private final List<a> applyPatchForListOfDivs(List<? extends a> list, ExpressionResolver expressionResolver) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            g5g.y(applyPatch((a) it.next(), expressionResolver), arrayList);
        }
        return arrayList;
    }

    private final List<ma.a> applyPatchForListStates(List<ma.a> list, ExpressionResolver expressionResolver) {
        ikn b;
        ArrayList arrayList = new ArrayList();
        for (ma.a aVar : list) {
            a aVar2 = aVar.c;
            String id = (aVar2 == null || (b = aVar2.b()) == null) ? null : b.getId();
            if (id != null) {
                List<a> list2 = this.patch.getPatches().get(id);
                if (list2 != null && list2.size() == 1) {
                    arrayList.add(new ma.a(aVar.a, aVar.b, list2.get(0), aVar.d, aVar.e));
                    this.appliedPatches.add(id);
                } else if (list2 == null || !list2.isEmpty()) {
                    arrayList.add(tryApplyPatchToDiv(aVar, expressionResolver));
                } else {
                    this.appliedPatches.add(id);
                }
            } else {
                arrayList.add(tryApplyPatchToDiv(aVar, expressionResolver));
            }
        }
        return arrayList;
    }

    private final List<a> applyPatchForSingleDiv(a aVar) {
        String id = aVar.b().getId();
        if (id == null) {
            return Collections.singletonList(aVar);
        }
        List<a> list = this.patch.getPatches().get(id);
        if (list == null) {
            return Collections.singletonList(aVar);
        }
        this.appliedPatches.add(id);
        return list;
    }

    private final View findPatchedRecyclerViewAndNotifyChange(View view, a aVar, String str) {
        RecyclerView.Adapter adapter;
        a.i div;
        DivPager divPager;
        List<a> list;
        a.c div2;
        DivGallery divGallery;
        List<a> list2;
        int i = 0;
        if (view instanceof DivRecyclerView) {
            DivRecyclerView divRecyclerView = (DivRecyclerView) view;
            if (divRecyclerView.getDiv() == aVar) {
                RecyclerView.Adapter adapter2 = divRecyclerView.getAdapter();
                DivGalleryAdapter divGalleryAdapter = adapter2 instanceof DivGalleryAdapter ? (DivGalleryAdapter) adapter2 : null;
                if (divGalleryAdapter != null && (div2 = divRecyclerView.getDiv()) != null && (divGallery = div2.c) != null && (list2 = divGallery.u) != null) {
                    for (Object obj : list2) {
                        int i2 = i + 1;
                        if (i < 0) {
                            e43.t();
                            throw null;
                        }
                        if (epx.f(((a) obj).b().getId(), str)) {
                            divGalleryAdapter.notifyItemChanged(i);
                            return view;
                        }
                        i = i2;
                    }
                }
                return view;
            }
        } else if (view instanceof DivPagerView) {
            DivPagerView divPagerView = (DivPagerView) view;
            if (divPagerView.getDiv() == aVar) {
                View childAt = divPagerView.getViewPager().getChildAt(0);
                RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
                if (recyclerView != null && (adapter = recyclerView.getAdapter()) != null && (div = divPagerView.getDiv()) != null && (divPager = div.c) != null && (list = divPager.t) != null) {
                    for (Object obj2 : list) {
                        int i3 = i + 1;
                        if (i < 0) {
                            e43.t();
                            throw null;
                        }
                        if (epx.f(((a) obj2).b().getId(), str)) {
                            adapter.notifyItemChanged(i);
                            return view;
                        }
                        i = i3;
                    }
                }
                return view;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i4 = 0;
            while (true) {
                if (!(i4 < viewGroup.getChildCount())) {
                    break;
                }
                int i5 = i4 + 1;
                View childAt2 = viewGroup.getChildAt(i4);
                if (childAt2 == null) {
                    throw new IndexOutOfBoundsException();
                }
                View findPatchedRecyclerViewAndNotifyChange = findPatchedRecyclerViewAndNotifyChange(childAt2, aVar, str);
                if (findPatchedRecyclerViewAndNotifyChange != null) {
                    return findPatchedRecyclerViewAndNotifyChange;
                }
                i4 = i5;
            }
        }
        return null;
    }

    private final a getPatchedDivCollection(a aVar, List<? extends a> list, Iterator<? extends a> it, ExpressionResolver expressionResolver, izs<? super List<? extends a>, ? extends a> izsVar, gzs<? extends a> gzsVar) {
        if (!it.hasNext()) {
            return gzsVar.invoke();
        }
        int indexOf = list.indexOf(it.next());
        if (indexOf != -1) {
            ArrayList arrayList = new ArrayList(list);
            arrayList.set(indexOf, getPatchedTreeByPath((a) arrayList.get(indexOf), it, expressionResolver));
            return izsVar.invoke(arrayList);
        }
        KAssert kAssert = KAssert.INSTANCE;
        if (Assert.isEnabled()) {
            Assert.fail("Unable to find the next child to patch by following a precalculated path");
        }
        return aVar;
    }

    private final a getPatchedTreeByPath(a aVar, Iterator<? extends a> it, final ExpressionResolver expressionResolver) {
        final ikn b = aVar.b();
        if (b instanceof DivContainer) {
            return getPatchedDivCollection(aVar, DivCollectionExtensionsKt.getNonNullItems((DivContainer) b), it, expressionResolver, new izs<List<? extends a>, a>() { // from class: com.yandex.div.core.downloader.DivPatchApply$getPatchedTreeByPath$1
                {
                    super(1);
                }

                @Override // xsna.izs
                public final a invoke(List<? extends a> list) {
                    return new a.C2110a(DivContainer.B((DivContainer) ikn.this, null, list, -134217729));
                }
            }, new gzs<a>() { // from class: com.yandex.div.core.downloader.DivPatchApply$getPatchedTreeByPath$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // xsna.gzs
                public final a invoke() {
                    DivPatchMap divPatchMap;
                    a.C2110a applyPatch;
                    divPatchMap = DivPatchApply.this.patch;
                    applyPatch = new DivPatchApply(divPatchMap).applyPatch((DivContainer) b, expressionResolver);
                    return applyPatch;
                }
            });
        }
        if (b instanceof b5) {
            return getPatchedDivCollection(aVar, DivCollectionExtensionsKt.getNonNullItems((b5) b), it, expressionResolver, new izs<List<? extends a>, a>() { // from class: com.yandex.div.core.downloader.DivPatchApply$getPatchedTreeByPath$3
                {
                    super(1);
                }

                @Override // xsna.izs
                public final a invoke(List<? extends a> list) {
                    return new a.e(b5.B((b5) ikn.this, null, list, -16777217));
                }
            }, new gzs<a>() { // from class: com.yandex.div.core.downloader.DivPatchApply$getPatchedTreeByPath$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // xsna.gzs
                public final a invoke() {
                    DivPatchMap divPatchMap;
                    a.e applyPatch;
                    divPatchMap = DivPatchApply.this.patch;
                    applyPatch = new DivPatchApply(divPatchMap).applyPatch((b5) b, expressionResolver);
                    return applyPatch;
                }
            });
        }
        if (b instanceof DivGallery) {
            return getPatchedDivCollection(aVar, DivCollectionExtensionsKt.getNonNullItems((DivGallery) b), it, expressionResolver, new izs<List<? extends a>, a>() { // from class: com.yandex.div.core.downloader.DivPatchApply$getPatchedTreeByPath$5
                {
                    super(1);
                }

                @Override // xsna.izs
                public final a invoke(List<? extends a> list) {
                    return new a.c(DivGallery.B((DivGallery) ikn.this, null, list, -1048577));
                }
            }, new gzs<a>() { // from class: com.yandex.div.core.downloader.DivPatchApply$getPatchedTreeByPath$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // xsna.gzs
                public final a invoke() {
                    DivPatchMap divPatchMap;
                    a.c applyPatch;
                    divPatchMap = DivPatchApply.this.patch;
                    applyPatch = new DivPatchApply(divPatchMap).applyPatch((DivGallery) b, expressionResolver);
                    return applyPatch;
                }
            });
        }
        if (b instanceof DivPager) {
            return getPatchedDivCollection(aVar, DivCollectionExtensionsKt.getNonNullItems((DivPager) b), it, expressionResolver, new izs<List<? extends a>, a>() { // from class: com.yandex.div.core.downloader.DivPatchApply$getPatchedTreeByPath$7
                {
                    super(1);
                }

                @Override // xsna.izs
                public final a invoke(List<? extends a> list) {
                    return new a.i(DivPager.B((DivPager) ikn.this, null, list, -524289));
                }
            }, new gzs<a>() { // from class: com.yandex.div.core.downloader.DivPatchApply$getPatchedTreeByPath$8
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // xsna.gzs
                public final a invoke() {
                    DivPatchMap divPatchMap;
                    a.i applyPatch;
                    divPatchMap = DivPatchApply.this.patch;
                    applyPatch = new DivPatchApply(divPatchMap).applyPatch((DivPager) b, expressionResolver);
                    return applyPatch;
                }
            });
        }
        if (b instanceof DivTabs) {
            if (!it.hasNext()) {
                return new DivPatchApply(this.patch).applyPatch((DivTabs) b, expressionResolver);
            }
            DivTabs divTabs = (DivTabs) b;
            ArrayList arrayList = new ArrayList(divTabs.q);
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((DivTabs.a) it2.next()).a);
            }
            int indexOf = arrayList2.indexOf(it.next());
            if (indexOf != -1) {
                DivTabs.a aVar2 = (DivTabs.a) arrayList.get(indexOf);
                arrayList.set(indexOf, new DivTabs.a(getPatchedTreeByPath(aVar2.a, it, expressionResolver), aVar2.b, aVar2.c));
                return new a.o(DivTabs.B(divTabs, null, arrayList, -65537));
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unable to find the next child to patch by following a precalculated path");
                return aVar;
            }
        } else if (b instanceof ma) {
            if (!it.hasNext()) {
                return new DivPatchApply(this.patch).applyPatch((ma) b, expressionResolver);
            }
            ma maVar = (ma) b;
            ArrayList arrayList3 = new ArrayList(maVar.I);
            ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                arrayList4.add(((ma.a) it3.next()).c);
            }
            int indexOf2 = arrayList4.indexOf(it.next());
            if (indexOf2 == -1) {
                KAssert kAssert2 = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable to find the next child to patch by following a precalculated path");
                    return aVar;
                }
            } else {
                ma.a aVar3 = (ma.a) arrayList3.get(indexOf2);
                a aVar4 = aVar3.c;
                if (aVar4 != null) {
                    arrayList3.set(indexOf2, new ma.a(aVar3.a, aVar3.b, getPatchedTreeByPath(aVar4, it, expressionResolver), aVar3.d, aVar3.e));
                    return new a.m(ma.B(maVar, null, null, arrayList3, -1));
                }
            }
        }
        return aVar;
    }

    private final List<a> pathToChildWithId(a aVar, String str, ExpressionResolver expressionResolver, List<a> list) {
        ikn b;
        list.add(aVar);
        ikn b2 = aVar.b();
        if (b2 instanceof DivContainer) {
            return pathToChildWithId(DivCollectionExtensionsKt.getNonNullItems((DivContainer) b2), str, expressionResolver, list);
        }
        if (b2 instanceof b5) {
            return pathToChildWithId(DivCollectionExtensionsKt.getNonNullItems((b5) b2), str, expressionResolver, list);
        }
        if (b2 instanceof DivGallery) {
            return pathToChildWithId(DivCollectionExtensionsKt.getNonNullItems((DivGallery) b2), str, expressionResolver, list);
        }
        if (b2 instanceof DivPager) {
            return pathToChildWithId(DivCollectionExtensionsKt.getNonNullItems((DivPager) b2), str, expressionResolver, list);
        }
        if (b2 instanceof DivTabs) {
            DivTabs divTabs = (DivTabs) b2;
            List<DivTabs.a> list2 = divTabs.q;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    if (epx.f(((DivTabs.a) it.next()).a.b().getId(), str)) {
                    }
                }
            }
            Iterator<T> it2 = divTabs.q.iterator();
            while (it2.hasNext()) {
                List<a> pathToChildWithId = pathToChildWithId(((DivTabs.a) it2.next()).a, str, expressionResolver, list);
                if (!pathToChildWithId.isEmpty()) {
                    return pathToChildWithId;
                }
                list.remove(e43.h(list));
            }
            return EmptyList.b;
        }
        if (!(b2 instanceof ma)) {
            return EmptyList.b;
        }
        ma maVar = (ma) b2;
        List<ma.a> list3 = maVar.I;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator<T> it3 = list3.iterator();
            while (it3.hasNext()) {
                a aVar2 = ((ma.a) it3.next()).c;
                if (epx.f((aVar2 == null || (b = aVar2.b()) == null) ? null : b.getId(), str)) {
                }
            }
        }
        List<ma.a> list4 = maVar.I;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it4 = list4.iterator();
        while (it4.hasNext()) {
            a aVar3 = ((ma.a) it4.next()).c;
            if (aVar3 != null) {
                arrayList.add(aVar3);
            }
        }
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            List<a> pathToChildWithId2 = pathToChildWithId((a) it5.next(), str, expressionResolver, list);
            if (!pathToChildWithId2.isEmpty()) {
                return pathToChildWithId2;
            }
            list.remove(e43.h(list));
        }
        return EmptyList.b;
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List pathToChildWithId$default(DivPatchApply divPatchApply, a aVar, String str, ExpressionResolver expressionResolver, List list, int i, Object obj) {
        if ((i & 8) != 0) {
            list = new ArrayList();
        }
        return divPatchApply.pathToChildWithId(aVar, str, expressionResolver, (List<a>) list);
    }

    private final ma.a tryApplyPatchToDiv(ma.a aVar, ExpressionResolver expressionResolver) {
        a aVar2 = aVar.c;
        List<a> applyPatch = aVar2 != null ? applyPatch(aVar2, expressionResolver) : null;
        return (applyPatch == null || applyPatch.size() != 1) ? aVar : new ma.a(aVar.a, aVar.b, applyPatch.get(0), aVar.d, aVar.e);
    }

    public final List<a> applyPatchForDiv(a aVar, ExpressionResolver expressionResolver) {
        return applyPatch(aVar, expressionResolver);
    }

    public final a patchDivChild(View view, a aVar, String str, ExpressionResolver expressionResolver) {
        Object obj = null;
        List pathToChildWithId$default = pathToChildWithId$default(this, aVar, str, expressionResolver, null, 8, null);
        Iterator<? extends a> it = pathToChildWithId$default.iterator();
        if (pathToChildWithId$default.isEmpty()) {
            return null;
        }
        it.next();
        ListIterator listIterator = pathToChildWithId$default.listIterator(pathToChildWithId$default.size());
        while (listIterator.hasPrevious()) {
            Object previous = listIterator.previous();
            a aVar2 = (a) previous;
            if ((aVar2 instanceof a.c) || (aVar2 instanceof a.i)) {
                obj = previous;
                break;
            }
        }
        a aVar3 = (a) obj;
        if (aVar3 != null) {
            findPatchedRecyclerViewAndNotifyChange(view, aVar3, str);
        }
        return getPatchedTreeByPath(aVar, it, expressionResolver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a.C2110a applyPatch(DivContainer divContainer, ExpressionResolver expressionResolver) {
        return new a.C2110a(DivContainer.B(divContainer, null, applyPatchForListOfDivs(divContainer.B, expressionResolver), -134217729));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a.e applyPatch(b5 b5Var, ExpressionResolver expressionResolver) {
        return new a.e(b5.B(b5Var, null, applyPatchForListOfDivs(b5Var.y, expressionResolver), -16777217));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a.c applyPatch(DivGallery divGallery, ExpressionResolver expressionResolver) {
        return new a.c(DivGallery.B(divGallery, null, applyPatchForListOfDivs(divGallery.u, expressionResolver), -1048577));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a.i applyPatch(DivPager divPager, ExpressionResolver expressionResolver) {
        return new a.i(DivPager.B(divPager, null, applyPatchForListOfDivs(divPager.t, expressionResolver), -524289));
    }

    private final a.m applyPatch(ma maVar, ExpressionResolver expressionResolver) {
        return new a.m(ma.B(maVar, null, null, applyPatchForListStates(maVar.I, expressionResolver), -1));
    }

    private final a.b applyPatch(g3 g3Var, ExpressionResolver expressionResolver) {
        return new a.b(g3.B(g3Var, null, applyPatchForListOfDivs(g3Var.q, expressionResolver), -65537));
    }

    private final List<a> pathToChildWithId(List<? extends a> list, String str, ExpressionResolver expressionResolver, List<a> list2) {
        List<? extends a> list3 = list;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                if (epx.f(((a) it.next()).b().getId(), str)) {
                    return list2;
                }
            }
        }
        Iterator<T> it2 = list3.iterator();
        while (it2.hasNext()) {
            List<a> pathToChildWithId = pathToChildWithId((a) it2.next(), str, expressionResolver, list2);
            if (!pathToChildWithId.isEmpty()) {
                return pathToChildWithId;
            }
            list2.remove(e43.h(list2));
        }
        return EmptyList.b;
    }

    private final a.o applyPatch(DivTabs divTabs, ExpressionResolver expressionResolver) {
        ArrayList arrayList = new ArrayList();
        for (DivTabs.a aVar : divTabs.q) {
            List<a> applyPatch = applyPatch(aVar.a, expressionResolver);
            if (applyPatch.size() == 1) {
                arrayList.add(new DivTabs.a(applyPatch.get(0), aVar.b, aVar.c));
            } else {
                KLog kLog = KLog.INSTANCE;
                if (kLog.isAtLeast(Severity.ERROR)) {
                    kLog.print(6, "DivPatchApply", "Unable to patch tab because there is more than 1 div in the patch");
                }
                arrayList.add(aVar);
            }
        }
        return new a.o(DivTabs.B(divTabs, null, arrayList, -65537));
    }
}
