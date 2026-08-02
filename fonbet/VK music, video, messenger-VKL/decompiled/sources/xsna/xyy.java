package xsna;

import com.vk.geo.impl.model.BoundingBox;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.snt;

/* compiled from: Node.kt */
/* loaded from: classes2.dex */
public final class xyy<S extends snt> extends s470<S> {
    public final List<S> b;
    public final xmj c;
    public final BoundingBox d;

    /* JADX WARN: Multi-variable type inference failed */
    public xyy(List<? extends S> list, xmj xmjVar) {
        this.b = list;
        this.c = xmjVar;
        this.d = w2r0.a(list);
    }

    @Override // xsna.s470
    public final List<s470<S>> a(S s) {
        List<S> list = this.b;
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(s);
        int size = arrayList.size();
        xmj xmjVar = this.c;
        if (size <= xmjVar.a) {
            return Collections.singletonList(new xyy(arrayList, xmjVar));
        }
        yfz M = xmjVar.c.M(xmjVar.b, arrayList);
        if (M == null) {
            return EmptyList.b;
        }
        ArrayList arrayList2 = new ArrayList(2);
        arrayList2.add(new xyy(M.a.b, xmjVar));
        arrayList2.add(new xyy(M.b.b, xmjVar));
        return arrayList2;
    }

    @Override // xsna.s470
    public final uki0<S> c(dt dtVar, dnz dnzVar) {
        BoundingBox boundingBox = this.d;
        boundingBox.getClass();
        return !boundingBox.b((lif0) dnzVar.c) ? ghp.a : rli0.j(new i5g(this.b), new k7f(dtVar, dnzVar));
    }

    @Override // xsna.luu, xsna.ktx0
    public final lif0 d() {
        return this.d;
    }

    @Override // xsna.luu
    public final snt n() {
        return this.d;
    }
}
