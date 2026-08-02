package com.yandex.div.core.view2.reuse;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.yandex.div2.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import xsna.epx;
import xsna.j5g;
import xsna.ttp0;

/* compiled from: ReusableTokenList.kt */
/* loaded from: classes7.dex */
public final class ReusableTokenList {
    private final HashMap<Integer, LinkedList<ExistingToken>> reusable = new HashMap<>();
    private final Map<Integer, Integer> viewIndexShift = new LinkedHashMap();

    public final void add(ExistingToken existingToken) {
        int divHash = existingToken.getDivHash();
        HashMap<Integer, LinkedList<ExistingToken>> hashMap = this.reusable;
        Integer valueOf = Integer.valueOf(divHash);
        LinkedList<ExistingToken> linkedList = hashMap.get(valueOf);
        if (linkedList == null) {
            linkedList = new LinkedList<>();
            hashMap.put(valueOf, linkedList);
        }
        linkedList.add(existingToken);
    }

    public final void clear() {
        this.reusable.clear();
        this.viewIndexShift.clear();
    }

    public final View getUniqueViewForDiv(a aVar) {
        ExistingToken existingToken;
        int propertiesHash = aVar.propertiesHash();
        Map<Integer, Integer> map = this.viewIndexShift;
        Integer valueOf = Integer.valueOf(propertiesHash);
        Integer num = map.get(valueOf);
        if (num == null) {
            num = 0;
            map.put(valueOf, num);
        }
        int intValue = num.intValue();
        LinkedList<ExistingToken> linkedList = this.reusable.get(Integer.valueOf(propertiesHash));
        if (linkedList == null || (existingToken = (ExistingToken) j5g.b0(intValue, linkedList)) == null) {
            return null;
        }
        this.viewIndexShift.put(Integer.valueOf(propertiesHash), Integer.valueOf(intValue + 1));
        ViewParent parent = existingToken.getView().getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(existingToken.getView());
        }
        return existingToken.getView();
    }

    public final boolean isEmpty() {
        return this.reusable.isEmpty();
    }

    public final ExistingToken pop(int i) {
        LinkedList<ExistingToken> linkedList = this.reusable.get(Integer.valueOf(i));
        if (linkedList == null || linkedList.isEmpty()) {
            return null;
        }
        ExistingToken pop = linkedList.pop();
        LinkedList<ExistingToken> linkedList2 = this.reusable.get(Integer.valueOf(i));
        if (linkedList2 != null && !linkedList2.isEmpty()) {
            return pop;
        }
        this.reusable.remove(Integer.valueOf(i));
        return pop;
    }

    public final boolean remove(ExistingToken existingToken) {
        Object obj;
        LinkedList<ExistingToken> linkedList = this.reusable.get(Integer.valueOf(existingToken.getDivHash()));
        if (linkedList == null) {
            return false;
        }
        Iterator<T> it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((ExistingToken) obj).getView(), existingToken.getView())) {
                break;
            }
        }
        return ttp0.a(linkedList).remove(obj);
    }

    public final ExistingToken pop(a aVar) {
        return pop(aVar.propertiesHash());
    }
}
