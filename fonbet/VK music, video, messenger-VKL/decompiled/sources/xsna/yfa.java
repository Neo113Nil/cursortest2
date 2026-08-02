package xsna;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockCatalog;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.collections.builders.SetBuilder;
import xsna.pda;

/* compiled from: CatalogSectionScrollPositionsCache.kt */
/* loaded from: classes16.dex */
public final class yfa implements pda, zda {
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashSet c = new LinkedHashSet();
    public final LinkedHashMap d = new LinkedHashMap();
    public final LinkedHashSet e = new LinkedHashSet();

    @Override // xsna.zda
    public final void H(UIBlockCatalog uIBlockCatalog) {
        ArrayList<UIBlock> arrayList = uIBlockCatalog.A;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((UIBlock) it.next()).Fb());
        }
        LinkedHashSet linkedHashSet2 = this.c;
        Set g = izi0.g(linkedHashSet2, linkedHashSet);
        g5g.y(linkedHashSet, linkedHashSet2);
        Set set = g;
        g5g.F(set, linkedHashSet2);
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            Iterable iterable = (Set) this.d.remove((String) it2.next());
            if (iterable == null) {
                iterable = EmptySet.b;
            }
            g5g.F(iterable, this.b.keySet());
        }
    }

    @Override // xsna.pda
    public final void a(UIBlockList uIBlockList) {
        this.b.remove(uIBlockList.b);
    }

    @Override // xsna.pda
    public final pda.a b(UIBlockList uIBlockList) {
        return (pda.a) this.b.get(uIBlockList.b);
    }

    @Override // xsna.pda
    public final void c(UIBlock uIBlock, btf0 btf0Var) {
        if (this.e.contains(uIBlock.Fb())) {
            this.b.put(uIBlock.Fb(), new pda.a(uIBlock, btf0Var));
        }
    }

    @Override // xsna.zda
    public final void k(UIBlock uIBlock) {
        String Fb = uIBlock.Fb();
        if (!this.c.contains(Fb)) {
            UIBlockList uIBlockList = uIBlock instanceof UIBlockList ? (UIBlockList) uIBlock : null;
            Fb = uIBlockList != null ? uIBlockList.z : null;
            if (Fb == null) {
                Fb = "";
            }
        }
        LinkedHashMap linkedHashMap = this.d;
        Object obj = linkedHashMap.get(Fb);
        if (obj == null) {
            obj = new LinkedHashSet();
            linkedHashMap.put(Fb, obj);
        }
        Set set = (Set) obj;
        SetBuilder setBuilder = new SetBuilder();
        ArrayList arrayList = new ArrayList();
        arrayList.add(uIBlock);
        while (!arrayList.isEmpty()) {
            UIBlock uIBlock2 = (UIBlock) arrayList.remove(e43.h(arrayList));
            setBuilder.add(uIBlock2.Fb());
            if (uIBlock2 instanceof UIBlockList) {
                arrayList.addAll(((UIBlockList) uIBlock2).y);
            }
        }
        SetBuilder d = setBuilder.d();
        Set g = izi0.g(set, d);
        LinkedHashSet linkedHashSet = this.e;
        g5g.y(d, linkedHashSet);
        Set set2 = g;
        g5g.F(set2, linkedHashSet);
        Set set3 = set;
        g5g.y(d, set3);
        g5g.F(set2, set3);
        g5g.F(set2, this.b.keySet());
    }

    @Override // xsna.zda
    public final void I(Throwable th) {
    }
}
