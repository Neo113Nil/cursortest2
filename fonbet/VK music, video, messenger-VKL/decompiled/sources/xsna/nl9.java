package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.CameraInternal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: CameraSelector.java */
/* loaded from: classes11.dex */
public final class nl9 {

    @NonNull
    public static final nl9 b;

    @NonNull
    public static final nl9 c;
    public LinkedHashSet<pi9> a;

    static {
        LinkedHashSet<pi9> linkedHashSet = new LinkedHashSet<>();
        f2z f2zVar = new f2z();
        f2zVar.a = 0;
        linkedHashSet.add(f2zVar);
        nl9 nl9Var = new nl9();
        nl9Var.a = linkedHashSet;
        b = nl9Var;
        LinkedHashSet<pi9> linkedHashSet2 = new LinkedHashSet<>();
        f2z f2zVar2 = new f2z();
        f2zVar2.a = 1;
        linkedHashSet2.add(f2zVar2);
        nl9 nl9Var2 = new nl9();
        nl9Var2.a = linkedHashSet2;
        c = nl9Var2;
    }

    public nl9() {
        throw null;
    }

    @NonNull
    public final LinkedHashSet<CameraInternal> a(@NonNull LinkedHashSet<CameraInternal> linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator<CameraInternal> it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().b());
        }
        List b2 = b(arrayList);
        LinkedHashSet<CameraInternal> linkedHashSet2 = new LinkedHashSet<>();
        Iterator<CameraInternal> it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            CameraInternal next = it2.next();
            if (b2.contains(next.b())) {
                linkedHashSet2.add(next);
            }
        }
        return linkedHashSet2;
    }

    @NonNull
    public final List b(@NonNull ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        ArrayList arrayList3 = new ArrayList(arrayList);
        Iterator<pi9> it = this.a.iterator();
        while (it.hasNext()) {
            arrayList3 = it.next().a(Collections.unmodifiableList(arrayList3));
            if (arrayList3.isEmpty()) {
                throw new IllegalArgumentException("No available camera can be found.");
            }
            if (!arrayList2.containsAll(arrayList3)) {
                throw new IllegalArgumentException("The output isn't contained in the input.");
            }
            arrayList2.retainAll(arrayList3);
        }
        return arrayList3;
    }

    @Nullable
    public final Integer c() {
        Iterator<pi9> it = this.a.iterator();
        Integer num = null;
        while (it.hasNext()) {
            pi9 next = it.next();
            if (next instanceof f2z) {
                Integer valueOf = Integer.valueOf(((f2z) next).a);
                if (num == null) {
                    num = valueOf;
                } else if (!num.equals(valueOf)) {
                    throw new IllegalStateException("Multiple conflicting lens facing requirements exist.");
                }
            }
        }
        return num;
    }
}
