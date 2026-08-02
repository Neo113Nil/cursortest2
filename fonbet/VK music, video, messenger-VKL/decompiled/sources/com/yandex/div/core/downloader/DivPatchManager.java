package com.yandex.div.core.downloader;

import android.view.View;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2Builder;
import com.yandex.div2.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import xsna.c5g;
import xsna.e9e0;
import xsna.on00;

/* compiled from: DivPatchManager.kt */
/* loaded from: classes7.dex */
public class DivPatchManager {
    private final DivPatchCache divPatchCache;
    private final e9e0<Div2Builder> divViewCreator;

    public DivPatchManager(DivPatchCache divPatchCache, e9e0<Div2Builder> e9e0Var) {
        this.divPatchCache = divPatchCache;
        this.divViewCreator = e9e0Var;
    }

    public List<View> buildViewsForId(BindingContext bindingContext, String str) {
        List<a> patchDivListById = this.divPatchCache.getPatchDivListById(bindingContext.getDivView().getDataTag(), str);
        if (patchDivListById == null) {
            return null;
        }
        List<a> list = patchDivListById;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.divViewCreator.get().buildView((a) it.next(), bindingContext, bindingContext.getDivView().getCurrentRootPath$div_release()));
        }
        return arrayList;
    }

    public Map<a, View> createViewsForId(BindingContext bindingContext, String str) {
        List<a> patchDivListById = this.divPatchCache.getPatchDivListById(bindingContext.getDivView().getDataTag(), str);
        if (patchDivListById == null) {
            return null;
        }
        List<a> list = patchDivListById;
        int e = on00.e(c5g.u(list, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        for (Object obj : list) {
            linkedHashMap.put(obj, this.divViewCreator.get().createView((a) obj, bindingContext, bindingContext.getDivView().getCurrentRootPath$div_release()));
        }
        return linkedHashMap;
    }
}
