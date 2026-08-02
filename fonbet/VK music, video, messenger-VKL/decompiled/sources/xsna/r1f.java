package xsna;

import android.content.Context;
import com.vk.dto.clips.model.ClipsEditorInputData;
import com.vk.dto.clips.model.ClipsEditorInputVideoItem;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: ClipsRequestsHandlerImpl.kt */
/* loaded from: classes16.dex */
public final class r1f extends zsi implements p1f {
    public final Context b;
    public final c9d c;
    public final bwd d;
    public final e2e e;
    public final qzd f;
    public final ayd g;
    public final osd h;

    public r1f(Context context, c9d c9dVar, bwd bwdVar, e2e e2eVar, qzd qzdVar) {
        super(0);
        this.b = context;
        this.c = c9dVar;
        this.d = bwdVar;
        this.e = e2eVar;
        this.f = qzdVar;
        this.g = e2eVar.j;
        this.h = null;
    }

    @Override // xsna.p1f
    public final io.reactivex.rxjava3.internal.operators.single.y c(ClipsEditorInputData clipsEditorInputData, File file) {
        e2e e2eVar = this.e;
        cmf cmfVar = e2eVar.i;
        cxd cxdVar = e2eVar.k;
        File a = e2eVar.j.a();
        qzd qzdVar = this.f;
        return new m9e(cmfVar, cxdVar, a, this.b, qzdVar != null ? qzdVar.b : null, qzdVar != null ? Integer.valueOf(qzdVar.a) : null).d(file, new q1f()).l(new yi2(new nv2(10, clipsEditorInputData, this), 9));
    }

    public final io.reactivex.rxjava3.internal.operators.single.x g(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(uzd.b((ClipsEditorInputVideoItem) it.next(), this.g, this.h));
        }
        return io.reactivex.rxjava3.core.x.k(arrayList);
    }
}
