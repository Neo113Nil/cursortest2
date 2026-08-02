package xsna;

import android.view.View;
import xsna.fx10;
import xsna.zw10;

/* compiled from: MediaRouteDynamicChooserDialog.java */
/* loaded from: classes12.dex */
public final class ax10 implements View.OnClickListener {
    public final /* synthetic */ fx10.h b;
    public final /* synthetic */ zw10.d.c c;

    public ax10(zw10.d.c cVar, fx10.h hVar) {
        this.c = cVar;
        this.b = hVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zw10.d.c cVar = this.c;
        zw10 zw10Var = zw10.this;
        fx10.h hVar = this.b;
        zw10Var.p = hVar;
        hVar.l(true);
        cVar.m.setVisibility(4);
        cVar.n.setVisibility(0);
    }
}
