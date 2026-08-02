package xsna;

import androidx.fragment.app.FragmentActivity;
import com.vk.cachecontrol.api.CacheTarget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: CacheDialog.kt */
/* loaded from: classes15.dex */
public final class ew8 extends io.reactivex.rxjava3.core.x<List<? extends CacheTarget>> {
    public final io.reactivex.rxjava3.internal.operators.single.b b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, androidx.recyclerview.widget.RecyclerView$Adapter, xsna.qul] */
    public ew8(FragmentActivity fragmentActivity, List<sx8> list) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = list;
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        List list2 = (List) ref$ObjectRef.element;
        defpackage.c cVar = new defpackage.c(7, ref$ObjectRef, ref$ObjectRef2);
        ?? ux8Var = new ux8(true);
        ux8Var.x0(sx8.class, new on(cVar, 9));
        ux8Var.setItems(list2);
        ux8Var.setHasStableIds(true);
        ref$ObjectRef2.element = ux8Var;
        this.b = new io.reactivex.rxjava3.internal.operators.single.b(new aw8(fragmentActivity, ref$ObjectRef2, this, ref$ObjectRef));
    }

    public static void F(io.reactivex.rxjava3.core.y yVar) {
        if (yVar.h()) {
            return;
        }
        yVar.b(new CancellationException("CacheBottomSheet dismissed"));
    }

    public static void G(List list, io.reactivex.rxjava3.core.y yVar) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((sx8) obj).f) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((sx8) it.next()).e);
        }
        if (yVar.h()) {
            return;
        }
        if (arrayList2.isEmpty()) {
            yVar.b(new IllegalStateException("Clear cache without targets"));
        } else {
            yVar.onSuccess(arrayList2);
        }
    }

    @Override // io.reactivex.rxjava3.core.x
    public final void p(io.reactivex.rxjava3.core.z<? super List<? extends CacheTarget>> zVar) {
        this.b.subscribe(zVar);
    }
}
