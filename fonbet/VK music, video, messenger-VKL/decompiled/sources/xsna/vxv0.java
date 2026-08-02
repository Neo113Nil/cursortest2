package xsna;

import android.os.Parcelable;
import com.vk.dto.photo.Photo;
import com.vk.upload.impl.UploadNotification;
import xsna.erw0;
import xsna.gm50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class vxv0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ vxv0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                mp3 mp3Var = (mp3) obj3;
                g84 g84Var = (g84) obj2;
                UploadNotification.b bVar = (UploadNotification.b) obj;
                UploadNotification.State state = bVar.b;
                if (state == UploadNotification.State.DONE) {
                    Parcelable parcelable = bVar.e;
                    mp3Var.invoke(parcelable instanceof Photo ? (Photo) parcelable : null);
                } else if (state == UploadNotification.State.FAILED) {
                    g84Var.invoke(bVar.f);
                }
                break;
            case 1:
                lfa lfaVar = (lfa) obj2;
                brj0 brj0Var = (brj0) obj;
                dw20 dw20Var = ((y7w0) obj3).b;
                if (dw20Var != null) {
                    dw20Var.hide();
                }
                lfaVar.invoke(brj0Var);
                break;
            default:
                qqw0 qqw0Var = (qqw0) obj3;
                drw0 drw0Var = (drw0) obj2;
                erw0.b bVar2 = (erw0.b) obj;
                int i2 = qqw0.j1;
                yzt0<erw0.c> yzt0Var = bVar2.a;
                rqw0 rqw0Var = new rqw0(1, drw0Var, drw0.class, "accept", "accept(Lcom/vk/voip/ui/scheduled/invite/ui/state/VoipInviteToScheduledCallViewState$Loading;)V", 0);
                qqw0Var.getClass();
                gm50.a.a(qqw0Var, yzt0Var, rqw0Var);
                gm50.a.a(qqw0Var, bVar2.b, new sqw0(1, drw0Var, drw0.class, "accept", "accept(Lcom/vk/voip/ui/scheduled/invite/ui/state/VoipInviteToScheduledCallViewState$Content;)V", 0));
                gm50.a.a(qqw0Var, bVar2.c, new tqw0(1, drw0Var, drw0.class, "accept", "accept(Lcom/vk/voip/ui/scheduled/invite/ui/state/VoipInviteToScheduledCallViewState$ViewState;)V", 0));
                break;
        }
        return s3q0.a;
    }
}
