package xsna;

import com.vk.dto.common.id.UserId;
import java.util.Iterator;
import one.video.player.OneVideoPlayer;
import xsna.fzu0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class t9s implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ t9s(long j, Object obj, Object obj2, int i) {
        this.b = i;
        this.d = obj;
        this.e = obj2;
        this.c = j;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        fzu0 view;
        fzu0.a aVar;
        fzu0 view2;
        switch (this.b) {
            case 0:
                one.video.player.j jVar = (one.video.player.j) this.d;
                OneVideoPlayer oneVideoPlayer = (OneVideoPlayer) this.e;
                long j = this.c;
                Iterator<OneVideoPlayer.c> it = jVar.b.iterator();
                while (it.hasNext()) {
                    it.next().k(oneVideoPlayer, j);
                }
                break;
            case 1:
                long j2 = this.c;
                g4y g4yVar = (g4y) this.d;
                String str = (String) this.e;
                if (j2 == 0) {
                    fvv0 fvv0Var = g4yVar.b;
                    if (fvv0Var != null && (aVar = g4yVar.c) != null && (view2 = aVar.getView()) != null) {
                        view2.Q6(fvv0Var.t(), str);
                    }
                } else {
                    fzu0.a aVar2 = g4yVar.c;
                    if (aVar2 != null && (view = aVar2.getView()) != null) {
                        gzs<s3q0> gzsVar = fkq0.a;
                        view.g8(new UserId(j2), str);
                    }
                }
                break;
            default:
                hds0 hds0Var = (hds0) this.d;
                kes0 kes0Var = (kes0) this.e;
                long j3 = this.c;
                fkn0 fkn0Var = hds0Var.g;
                if (fkn0Var == null) {
                    fkn0Var = null;
                }
                fkn0Var.d(kes0Var, j3);
                kfp0<zis0> kfp0Var = hds0Var.h;
                (kfp0Var != null ? kfp0Var : null).a();
                hds0Var.j = j3;
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ t9s(long j, g4y g4yVar, String str) {
        this.b = 1;
        this.c = j;
        this.d = g4yVar;
        this.e = str;
    }
}
