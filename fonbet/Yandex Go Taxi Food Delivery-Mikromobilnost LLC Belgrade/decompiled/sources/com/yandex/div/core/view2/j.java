package com.yandex.div.core.view2;

import android.view.View;
import defpackage.b1s0;
import defpackage.dms;
import defpackage.f9l;
import defpackage.fbs0;
import defpackage.m3k;
import defpackage.rvo;
import defpackage.tls;
import defpackage.uvo;
import defpackage.zy11;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.collections.EmptySet;

/* loaded from: classes.dex */
public final class j {
    public final dms a;
    public final dms b;
    public final WeakHashMap c = new WeakHashMap();
    public final HashMap d = new HashMap();
    public final WeakHashMap e = new WeakHashMap();

    public j(dms dmsVar, dms dmsVar2) {
        this.a = dmsVar;
        this.b = dmsVar2;
    }

    public final void a(f9l f9lVar) {
        Set set;
        fbs0 fbs0Var = (fbs0) this.d.remove(f9lVar);
        if (fbs0Var == null) {
            return;
        }
        fbs0Var.a.close();
        View view = (View) fbs0Var.b.get();
        if (view == null || (set = (Set) this.c.get(view)) == null) {
            return;
        }
        set.remove(f9lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(final View view, final Div2View div2View, final rvo rvoVar, final m3k m3kVar, List list) {
        HashMap hashMap;
        fbs0 fbs0Var;
        WeakHashMap weakHashMap = this.e;
        if (!weakHashMap.containsKey(view) && (view instanceof uvo)) {
            ((uvo) view).addSubscription(new b1s0(this, view));
            weakHashMap.put(view, zy11.a);
        }
        WeakHashMap weakHashMap2 = this.c;
        Set set = (Set) weakHashMap2.get(view);
        if (set == null) {
            set = EmptySet.a;
        }
        LinkedHashSet U = kotlin.collections.a.U(list, set);
        Set M0 = kotlin.collections.a.M0(U);
        Iterator it = set.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hashMap = this.d;
            if (!hasNext) {
                break;
            }
            f9l f9lVar = (f9l) it.next();
            if (!U.contains(f9lVar) && (fbs0Var = (fbs0) hashMap.remove(f9lVar)) != null) {
                fbs0Var.a.close();
            }
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            final f9l f9lVar2 = (f9l) it2.next();
            if (!U.contains(f9lVar2)) {
                M0.add(f9lVar2);
                a(f9lVar2);
                hashMap.put(f9lVar2, new fbs0(f9lVar2.isEnabled().c(rvoVar, new tls() { // from class: com.yandex.div.core.view2.SightActionIsEnabledObserver$observe$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        j jVar = j.this;
                        if (booleanValue) {
                            ((DivVisibilityActionTracker$isEnabledObserver$1) jVar.a).invoke(div2View, rvoVar, view, m3kVar, f9lVar2);
                        } else {
                            ((DivVisibilityActionTracker$isEnabledObserver$2) jVar.b).invoke(div2View, rvoVar, view, m3kVar, f9lVar2);
                        }
                        return zy11.a;
                    }
                }), view));
            }
        }
        weakHashMap2.put(view, M0);
    }
}
