package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import defpackage.pey;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes10.dex */
public final class z implements q {
    public final Object a;
    public final a b;

    public z(Object obj) {
        this.a = obj;
        c cVar = c.c;
        Class<?> cls = obj.getClass();
        a aVar = (a) cVar.a.get(cls);
        this.b = aVar == null ? cVar.a(cls, null) : aVar;
    }

    @Override // androidx.lifecycle.q
    public final void M1(pey peyVar, Lifecycle.Event event) {
        HashMap hashMap = this.b.a;
        List list = (List) hashMap.get(event);
        Object obj = this.a;
        a.a(list, peyVar, event, obj);
        a.a((List) hashMap.get(Lifecycle.Event.ON_ANY), peyVar, event, obj);
    }
}
