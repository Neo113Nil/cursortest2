package com.yandex.div.core.view2.debugview;

import defpackage.agz;
import defpackage.h3u0;
import defpackage.wfx;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "errors", "warnings", "Lzy11;", "invoke", "(Ljava/util/List;Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class DebugViewModelProvider$updateOnErrors$1 extends Lambda implements wls {
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DebugViewModelProvider$updateOnErrors$1(b bVar) {
        super(2);
        this.this$0 = bVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        List list = (List) obj;
        List list2 = (List) obj2;
        ArrayList arrayList = this.this$0.i;
        arrayList.clear();
        ArrayList arrayList2 = new ArrayList(list);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        ArrayList arrayList3 = this.this$0.j;
        arrayList3.clear();
        ArrayList arrayList4 = new ArrayList(list2);
        Collections.reverse(arrayList4);
        arrayList3.addAll(arrayList4);
        b bVar = this.this$0;
        bVar.d(h3u0.a(bVar.n, false, false, null, list, list2, 7));
        b bVar2 = this.this$0;
        agz agzVar = bVar2.k;
        ArrayList arrayList5 = bVar2.i;
        ArrayList arrayList6 = bVar2.j;
        agzVar.getClass();
        if (!arrayList5.isEmpty() || !arrayList6.isEmpty()) {
            ArrayList arrayList7 = new ArrayList();
            for (Object obj3 : arrayList5) {
                if (agzVar.a.add((Throwable) obj3)) {
                    arrayList7.add(obj3);
                }
            }
            ArrayList arrayList8 = new ArrayList();
            Iterator it = arrayList6.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (agzVar.b.add((Throwable) next)) {
                    arrayList8.add(next);
                }
            }
            if (!arrayList7.isEmpty()) {
                int i = wfx.a;
            }
            if (!arrayList8.isEmpty()) {
                int i2 = wfx.a;
            }
            if (!arrayList7.isEmpty() || !arrayList8.isEmpty()) {
                int i3 = wfx.a;
            }
        }
        return zy11.a;
    }
}
