package com.yandex.div.core.view2;

import android.view.View;
import com.yandex.div2.DivVisibilityAction;
import defpackage.f9l;
import defpackage.jl40;
import defpackage.nnk;
import defpackage.rvo;
import defpackage.sls;
import defpackage.w53;
import defpackage.wfx;
import defpackage.y4k;
import defpackage.y6k;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class h implements Runnable {
    public final /* synthetic */ i a;
    public final /* synthetic */ View b;
    public final /* synthetic */ Div2View c;
    public final /* synthetic */ String w;
    public final /* synthetic */ rvo x;
    public final /* synthetic */ Map y;
    public final /* synthetic */ ArrayList z;

    public h(i iVar, View view, Div2View div2View, String str, rvo rvoVar, Map map, ArrayList arrayList) {
        this.a = iVar;
        this.b = view;
        this.c = div2View;
        this.w = str;
        this.x = rvoVar;
        this.y = map;
        this.z = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = wfx.a;
        i iVar = this.a;
        WeakHashMap weakHashMap = iVar.k;
        View view = this.b;
        Set set = (Set) weakHashMap.get(view);
        if (set != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : this.z) {
                if (obj instanceof nnk) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                set.remove((nnk) it.next());
            }
            if (set.isEmpty()) {
                iVar.k.remove(view);
                iVar.j.remove(view);
            }
        }
        if (jl40.l(this.c.getLogId(), this.w)) {
            final g gVar = iVar.b;
            final f9l[] f9lVarArr = (f9l[]) this.y.values().toArray(new f9l[0]);
            gVar.getClass();
            final Div2View div2View = this.c;
            final rvo rvoVar = this.x;
            final View view2 = this.b;
            div2View.bulkActions$div_release(new sls() { // from class: com.yandex.div.core.view2.DivVisibilityActionDispatcher$dispatchActions$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    int i2;
                    f9l[] f9lVarArr2 = f9lVarArr;
                    g gVar2 = gVar;
                    Div2View div2View2 = div2View;
                    rvo rvoVar2 = rvoVar;
                    int length = f9lVarArr2.length;
                    int i3 = 0;
                    int i4 = 0;
                    while (i4 < length) {
                        f9l f9lVar = f9lVarArr2[i4];
                        y4k y4kVar = gVar2.c;
                        w53 w53Var = gVar2.e;
                        w53 w53Var2 = gVar2.d;
                        y6k y6kVar = gVar2.b;
                        b bVar = new b(div2View2.getDataTag().a, div2View2.getLogId(), (String) f9lVar.b().a(rvoVar2));
                        boolean z = f9lVar instanceof DivVisibilityAction;
                        w53 w53Var3 = z ? w53Var2 : w53Var;
                        Object obj2 = w53Var3.get(bVar);
                        if (obj2 == null) {
                            obj2 = Integer.valueOf(i3);
                            w53Var3.put(bVar, obj2);
                        }
                        int intValue = ((Number) obj2).intValue();
                        int i5 = wfx.a;
                        long longValue = ((Number) f9lVar.c().a(rvoVar2)).longValue();
                        if (longValue != 0) {
                            i2 = i4;
                            if (intValue >= longValue) {
                                i4 = i2 + 1;
                                i3 = 0;
                            }
                        } else {
                            i2 = i4;
                        }
                        if (y6kVar.getUseActionUid()) {
                            String uuid = UUID.randomUUID().toString();
                            y6k actionHandler = div2View2.getActionHandler();
                            if (!(actionHandler != null ? actionHandler.handleAction(f9lVar, div2View2, rvoVar2, uuid) : false) && !y6kVar.handleAction(f9lVar, div2View2, rvoVar2, uuid)) {
                                if (!z) {
                                }
                                y4kVar.c(f9lVar, rvoVar2);
                            }
                        } else {
                            y6k actionHandler2 = div2View2.getActionHandler();
                            if (!(actionHandler2 != null ? actionHandler2.handleAction(f9lVar, div2View2, rvoVar2) : false) && !y6kVar.handleAction(f9lVar, div2View2, rvoVar2)) {
                                if (!z) {
                                }
                                y4kVar.c(f9lVar, rvoVar2);
                            }
                        }
                        if (z) {
                            w53Var = w53Var2;
                        }
                        w53Var.put(bVar, Integer.valueOf(intValue + 1));
                        i4 = i2 + 1;
                        i3 = 0;
                    }
                    return zy11.a;
                }
            });
        }
    }
}
