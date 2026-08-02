package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.dialogs.FolderType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: FoldersEditorImpl.kt */
/* loaded from: classes18.dex */
public final class z0s implements v0s, g4z {
    public final a1w b;
    public final b1s c;
    public final io.reactivex.rxjava3.core.w d = asu0.a.c();

    public z0s(a1w a1wVar, b1s b1sVar) {
        this.b = a1wVar;
        this.c = b1sVar;
    }

    @Override // xsna.v0s
    public final io.reactivex.rxjava3.internal.operators.completable.p D(String str, FolderType folderType, List list) {
        this.c.d(y480.b);
        io.reactivex.rxjava3.internal.operators.single.c C = this.b.C(this, new fqm(str, folderType, list));
        io.reactivex.rxjava3.core.w wVar = this.d;
        return new io.reactivex.rxjava3.internal.operators.completable.p(new io.reactivex.rxjava3.internal.operators.single.o(C.q(wVar).m(wVar).h(new ov2(new nv2(18, this, str), 19)), new pv2(new m4g(this, 21), 15)));
    }

    @Override // xsna.v0s
    public final io.reactivex.rxjava3.internal.operators.completable.p F(int i) {
        this.c.d(new a580(i));
        io.reactivex.rxjava3.internal.operators.single.c C = this.b.C(this, new gqm(i));
        io.reactivex.rxjava3.core.w wVar = this.d;
        return new io.reactivex.rxjava3.internal.operators.completable.p(new io.reactivex.rxjava3.internal.operators.single.o(C.q(wVar).m(wVar).h(new ho1(new h7a(this, i, 1), 22)), new f60(new w0s(this, i), 28)));
    }

    @Override // xsna.v0s
    public final io.reactivex.rxjava3.internal.operators.completable.p o(ArrayList arrayList) {
        this.c.d(i580.b);
        io.reactivex.rxjava3.internal.operators.single.c C = this.b.C(this, new mqm(arrayList));
        io.reactivex.rxjava3.core.w wVar = this.d;
        return new io.reactivex.rxjava3.internal.operators.completable.p(new io.reactivex.rxjava3.internal.operators.single.o(C.q(wVar).m(wVar), new wf1(new j6e(this, 25), 23)).h(new ff3(new omf(this, 14), 14)));
    }

    @Override // xsna.v0s
    public final io.reactivex.rxjava3.internal.operators.completable.p p(int i, String str, List list, List list2) {
        this.c.d(new d580(i));
        List list3 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            long longValue = ((Number) it.next()).longValue();
            Serializer.c<Peer> cVar = Peer.CREATOR;
            arrayList.add(Peer.a.b(longValue));
        }
        List list4 = list2;
        ArrayList arrayList2 = new ArrayList(c5g.u(list4, 10));
        Iterator it2 = list4.iterator();
        while (it2.hasNext()) {
            long longValue2 = ((Number) it2.next()).longValue();
            Serializer.c<Peer> cVar2 = Peer.CREATOR;
            arrayList2.add(Peer.a.b(longValue2));
        }
        io.reactivex.rxjava3.internal.operators.single.c C = this.b.C(this, new hqm(i, str, arrayList, arrayList2));
        io.reactivex.rxjava3.core.w wVar = this.d;
        return new io.reactivex.rxjava3.internal.operators.completable.p(new io.reactivex.rxjava3.internal.operators.single.o(C.q(wVar).m(wVar).h(new com.vk.im.ui.components.dialogs_list.b(new x0s(this, i, 0), 23)), new eu0(new y0s(this, i, list, list2), 25)));
    }

    @Override // xsna.g4z
    public final void onDestroy() {
    }
}
