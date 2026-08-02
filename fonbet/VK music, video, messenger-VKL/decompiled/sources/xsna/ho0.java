package xsna;

import com.vk.music.stickyplayer.domain.PlayerContext;
import xsna.dz40;
import xsna.sx40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ho0 implements gzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ho0(izs izsVar, wh50 wh50Var, boolean z) {
        this.c = z;
        this.d = izsVar;
        this.e = wh50Var;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        xuy i;
        switch (this.b) {
            case 0:
                izs izsVar = (izs) this.d;
                wh50 wh50Var = (wh50) this.e;
                com.vk.core.utils.newtork.b.a.getClass();
                if (com.vk.core.utils.newtork.b.d()) {
                    boolean z = !this.c;
                    wh50Var.setValue(Boolean.valueOf(z));
                    izsVar.invoke(new sx40.m0(z, PlayerContext.FULL));
                } else {
                    izsVar.invoke(sx40.o.b);
                }
                return s3q0.a;
            default:
                dz40.n nVar = (dz40.n) this.d;
                return Boolean.valueOf(!nVar.c().isEmpty() && this.c && (i = kci.i((xvy) this.e)) != null && i.getIndex() >= e43.h(new wow(nVar.a())) + (-5));
        }
    }

    public /* synthetic */ ho0(dz40.n nVar, boolean z, xvy xvyVar) {
        this.d = nVar;
        this.c = z;
        this.e = xvyVar;
    }
}
