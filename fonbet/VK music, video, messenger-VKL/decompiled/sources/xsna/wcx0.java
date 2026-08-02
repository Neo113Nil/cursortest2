package xsna;

import com.vk.log.L;
import com.vk.voip.ui.watchmovie.player.CommandForPlayer;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class wcx0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wcx0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [xsna.vfz, xsna.ycx0$a] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ycx0 ycx0Var = (ycx0) this.c;
                CommandForPlayer commandForPlayer = (CommandForPlayer) obj;
                ?? r1 = ycx0Var.f;
                if (commandForPlayer == CommandForPlayer.TRANSLATION_DOWN) {
                    ycx0Var.i(ycx0.q, r1.getPlayerView());
                } else if (commandForPlayer == CommandForPlayer.TRANSLATION_UP) {
                    ycx0Var.h(ycx0Var.b.c(), r1.getPlayerView());
                }
                break;
            default:
                i8f i8fVar = (i8f) this.c;
                Throwable th = (Throwable) obj;
                h03.b(th);
                L.g("ClipsTemplateEditorRequestsHandlerImpl", th);
                i8fVar.getClass();
                break;
        }
        return s3q0.a;
    }
}
