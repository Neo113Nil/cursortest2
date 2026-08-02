package xsna;

import com.vk.dto.stories.model.GifItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Pair;
import xsna.y7f;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class f8f implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f8f(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.b) {
            case 0:
                Pair pair = (Pair) this.c;
                i8f i8fVar = (i8f) this.d;
                z7f z7fVar = (z7f) pair.i();
                List list = (List) pair.j();
                y7f.h hVar = i8fVar.c;
                m8f m8fVar = i8fVar.f;
                hVar.d(z7fVar);
                List<n7f> list2 = z7fVar.d;
                ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(fz5.x((n7f) it.next(), z7fVar.f));
                }
                y7f.this.a.Mm(arrayList);
                m8fVar.v7();
                r8f c = hVar.c();
                if (c != null) {
                    ((s8f) c).q(null, list);
                }
                r8f c2 = hVar.c();
                if (c2 != null) {
                    ((s8f) c2).c(0L);
                }
                r8f c3 = hVar.c();
                if (c3 != null) {
                    ((s8f) c3).d(z7fVar.c());
                }
                i8fVar.d.f();
                m8fVar.j7();
                return z7fVar;
            default:
                xyt xytVar = (xyt) this.c;
                GifItem gifItem = (GifItem) this.d;
                k9f0 k9f0Var = (k9f0) xytVar.a;
                List<j9f0> all = k9f0Var.getAll();
                ArrayList arrayList2 = new ArrayList(c5g.u(all, 10));
                for (j9f0 j9f0Var : all) {
                    arrayList2.add(new GifItem(j9f0Var.a, j9f0Var.b, j9f0Var.c));
                }
                LinkedList<GifItem> linkedList = new LinkedList(arrayList2);
                if (!linkedList.contains(gifItem)) {
                    linkedList.addFirst(gifItem);
                    if (linkedList.size() > 6) {
                        linkedList.removeLast();
                    }
                    ArrayList arrayList3 = new ArrayList(c5g.u(linkedList, 10));
                    for (GifItem gifItem2 : linkedList) {
                        arrayList3.add(new j9f0(gifItem2.b, gifItem2.c, gifItem2.d));
                    }
                    k9f0Var.c(arrayList3);
                } else if (linkedList.indexOf(gifItem) != 0) {
                    linkedList.remove(gifItem);
                    linkedList.addFirst(gifItem);
                    ArrayList arrayList4 = new ArrayList(c5g.u(linkedList, 10));
                    for (GifItem gifItem3 : linkedList) {
                        arrayList4.add(new j9f0(gifItem3.b, gifItem3.c, gifItem3.d));
                    }
                    k9f0Var.c(arrayList4);
                }
                return s3q0.a;
        }
    }
}
