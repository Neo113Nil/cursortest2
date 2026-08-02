package xsna;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: GLTextureRepository.kt */
/* loaded from: classes4.dex */
public final class i2t implements e2t {
    public final ArrayList a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ gzg0 c;
    public final /* synthetic */ h2t d;

    public i2t(ArrayList arrayList, ArrayList arrayList2, gzg0 gzg0Var, h2t h2tVar) {
        this.b = arrayList2;
        this.c = gzg0Var;
        this.d = h2tVar;
        this.a = arrayList;
    }

    @Override // xsna.e2t
    public final void a(ArrayList arrayList) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((p3p) this.d.a.invoke()).a((o3p) it.next());
        }
        this.c.resumeWith(new o1t((f2t) arrayList.get(0), (f2t) arrayList.get(1)));
    }

    @Override // xsna.e2t
    public final List<Bitmap> b() {
        return this.a;
    }
}
