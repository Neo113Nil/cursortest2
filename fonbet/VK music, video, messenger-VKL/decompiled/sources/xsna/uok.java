package xsna;

import xsna.jpo0;

/* compiled from: CustomThemeViewHolder.kt */
/* loaded from: classes2.dex */
public final class uok extends fp6<jpo0.c> {
    @Override // xsna.fp6
    public final void V5(jpo0.c cVar) {
        jpo0.c cVar2 = cVar;
        a6(dhr0.M() ? cVar2.e : cVar2.d);
        this.o.setColors(dhr0.M() ? cVar2.g : cVar2.f);
        String str = cVar2.h;
        if (str == null) {
            str = "";
        }
        this.p.setText(str);
    }
}
