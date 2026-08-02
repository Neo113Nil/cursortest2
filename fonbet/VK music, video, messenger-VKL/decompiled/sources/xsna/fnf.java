package xsna;

import com.vk.fullscreenvideo.a;
import com.vk.superapp.bridges.dto.analytics.ActionGamesNotificationsPopup;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class fnf implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fnf(com.vk.clips.editor.templates.impl.player.a aVar, boolean z) {
        this.b = 0;
        this.d = aVar;
        this.c = z;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                awt0.u((com.vk.clips.editor.templates.impl.player.a) this.d, !this.c);
                break;
            case 1:
                izs izsVar = (izs) this.d;
                if (!this.c) {
                    izsVar.invoke(a.C1070a.a);
                }
                break;
            default:
                ber0 ber0Var = (ber0) this.d;
                udx0 udx0Var = e370.i;
                if (udx0Var == null) {
                    udx0Var = null;
                }
                udx0Var.d(this.c, ber0Var.a.getAppId(), ActionGamesNotificationsPopup.SHOWED);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ fnf(boolean z, Object obj, int i) {
        this.b = i;
        this.c = z;
        this.d = obj;
    }
}
