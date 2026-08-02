package yads;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public abstract class i extends a0 {
    private static final long serialVersionUID = 6588350623831699109L;

    public i(Map map) {
        super(map);
    }

    @Override // yads.e0
    public final n a() {
        n nVar = this.e;
        if (nVar != null) {
            return nVar;
        }
        n b = ((ty1) this).b();
        this.e = b;
        return b;
    }

    @Override // yads.e0
    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final boolean a(Object obj, Object obj2) {
        Collection collection = (Collection) this.f.get(obj);
        if (collection == null) {
            List list = (List) ((ty1) this).h.get();
            if (list.add(obj2)) {
                this.g++;
                this.f.put(obj, list);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        }
        if (!collection.add(obj2)) {
            return false;
        }
        this.g++;
        return true;
    }
}
