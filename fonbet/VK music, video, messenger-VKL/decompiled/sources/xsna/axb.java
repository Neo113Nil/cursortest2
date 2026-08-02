package xsna;

import com.vk.profile.user.impl.domain.edit.models.ExternalEvent;
import com.vk.video.ui.discovery.minimizable.related_videos.VideoDiscoveryRelatedAudioSnackBarManager;
import xsna.at70;
import xsna.uxd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class axb implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ axb(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                ((cxb) this.c).k(uxd0.c.a);
                break;
            case 1:
                ((awq) this.c).h();
                break;
            case 2:
                ((el50) this.c).W().c(at70.a.a);
                break;
            case 3:
                ((niq0) this.c).B.b(new ExternalEvent.a());
                break;
            case 4:
                ikv0 ikv0Var = ((VideoDiscoveryRelatedAudioSnackBarManager) this.c).b;
                if (ikv0Var != null) {
                    ikv0Var.a();
                    break;
                }
                break;
            default:
                ((com.vk.voip.ui.hint.a) this.c).c();
                break;
        }
    }
}
