package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.lc50;
import xsna.tc50;

/* compiled from: MusicTrackMenuModalBottomSheet.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class bd50 extends FunctionReferenceImpl implements izs<List<? extends lc50.c>, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(List<? extends lc50.c> list) {
        vc50 vc50Var = ((hd50) this.receiver).s;
        List<? extends lc50.c> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(tc50.a.a((lc50.c) it.next()));
        }
        vc50Var.setItems(arrayList);
        vc50Var.notifyDataSetChanged();
        return s3q0.a;
    }
}
