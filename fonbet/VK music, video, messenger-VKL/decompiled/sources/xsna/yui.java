package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import xsna.c2r0;

/* compiled from: CompositeUsersStore.kt */
/* loaded from: classes11.dex */
public final class yui implements c2r0 {
    public final List<c2r0> b;

    public yui(List<? extends c2r0> list) {
        this.b = j5g.V(list);
    }

    @Override // xsna.c2r0
    public final boolean b(Context context, UserId userId) {
        Iterator<T> it = this.b.iterator();
        while (it.hasNext()) {
            ((c2r0) it.next()).b(context, userId);
        }
        return true;
    }

    @Override // xsna.c2r0
    public final io.reactivex.rxjava3.core.x<List<c2r0.b>> c(final Context context, boolean z) {
        return new io.reactivex.rxjava3.internal.operators.single.v(new Callable() { // from class: xsna.xui
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return yui.this.h(context, false);
            }
        });
    }

    @Override // xsna.c2r0
    public final List<c2r0.b> h(Context context, boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.b.iterator();
        while (it.hasNext()) {
            arrayList.addAll(((c2r0) it.next()).h(context, z));
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (hashSet.add(((c2r0.b) next).d())) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    @Override // xsna.c2r0
    public final boolean i(Context context, UserId userId) {
        Iterator<T> it = this.b.iterator();
        while (it.hasNext()) {
            ((c2r0) it.next()).i(context, userId);
        }
        return true;
    }

    @Override // xsna.c2r0
    public final boolean j(Context context, c2r0.b bVar) {
        Iterator<T> it = this.b.iterator();
        while (it.hasNext()) {
            ((c2r0) it.next()).j(context, bVar);
        }
        return true;
    }

    @Override // xsna.c2r0
    public final boolean k(Context context, c2r0.b bVar) {
        Iterator<T> it = this.b.iterator();
        while (it.hasNext()) {
            ((c2r0) it.next()).k(context, bVar);
        }
        return true;
    }
}
