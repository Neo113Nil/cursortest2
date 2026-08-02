package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import xsna.jbd;
import xsna.jkp0;

/* compiled from: ClipsGalleryProcessingUtils.kt */
/* loaded from: classes16.dex */
public final class l9e implements jkp0.a {
    public final /* synthetic */ jbd.a a;

    public l9e(jbd.a aVar) {
        this.a = aVar;
    }

    @Override // xsna.jkp0.a
    public final void a(int i) {
        jbd.a aVar = this.a;
        aVar.a = i;
        jbd jbdVar = jbd.this;
        ArrayList<jbd.a> arrayList = jbdVar.b;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - jbdVar.c < 300) {
            return;
        }
        Iterator<jbd.a> it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += it.next().a;
        }
        jbdVar.a.invoke(Integer.valueOf(i2 / arrayList.size()));
        jbdVar.c = currentTimeMillis;
    }

    @Override // xsna.jkp0.a
    public final void b(int i) {
    }
}
