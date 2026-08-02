package defpackage;

import java.lang.ref.WeakReference;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes15.dex */
public final class a9z implements zeo {
    public final afo a;
    public yeo b;

    public a9z(tt5 tt5Var) {
        afo afoVar = new afo(tt5Var, "location");
        this.a = afoVar;
        afoVar.a(this);
        bfm.i.g.add(new lfm(new WeakReference(this), 1));
    }

    public final void a() {
        yeo yeoVar;
        s6z s6zVar = (s6z) bfm.i.e.get();
        if (s6zVar == null || (yeoVar = this.b) == null) {
            return;
        }
        yeoVar.success(b.h(new Pair("lat", Double.valueOf(s6zVar.b)), new Pair("lon", Double.valueOf(s6zVar.a))));
    }

    @Override // defpackage.zeo
    public final void onCancel(Object obj) {
        this.b = null;
    }

    @Override // defpackage.zeo
    public final void onListen(Object obj, xeo xeoVar) {
        this.b = (yeo) xeoVar;
        a();
    }
}
