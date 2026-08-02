package xsna;

import com.vk.dto.common.AppState;
import com.vk.music.player.PlayState;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class eaj implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ eaj(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                kaj kajVar = (kaj) this.c;
                kajVar.a(AppState.NOT_RUNNNIG);
                c63 c63Var = kajVar.d;
                jaj jajVar = new jaj(kajVar);
                c63Var.getClass();
                c63.a(jajVar);
                kajVar.a.subscribe(new gaj(new faj(kajVar, 0), 0));
                kajVar.f.a().b0(yqw.class).subscribe(new iaj(new haj(kajVar), 0));
                break;
            case 1:
                hfl0 hfl0Var = (hfl0) this.c;
                PlayState playState = hfl0Var.i;
                if (playState != null) {
                    hfl0Var.i = null;
                    hfl0Var.d();
                    hfl0.c(hfl0Var, playState, 2);
                    break;
                }
                break;
            default:
                ((t5t0) this.c).a();
                break;
        }
    }
}
