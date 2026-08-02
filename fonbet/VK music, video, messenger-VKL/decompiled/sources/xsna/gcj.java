package xsna;

import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.libvideo.design.view.fullscreen.VideoFullscreenBottomBarView;
import com.vk.libvideo.design.view.fullscreen.VideoTopBarView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import one.video.player.OneVideoPlayer;
import xsna.sqt0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class gcj implements gzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ gcj(one.video.player.j jVar, OneVideoPlayer oneVideoPlayer, boolean z) {
        this.d = jVar;
        this.e = oneVideoPlayer;
        this.c = z;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        List<qtd0> list;
        n1j0 settingsDialog;
        VideoTopBarView topControlsView;
        VideoTopBarView topControlsView2;
        int i = this.b;
        Object obj = this.e;
        boolean z = this.c;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                com.vk.im.ui.components.contacts.b bVar = (com.vk.im.ui.components.contacts.b) obj2;
                List list2 = (List) obj;
                if (z) {
                    ProfilesSimpleInfo profilesSimpleInfo = new ProfilesSimpleInfo(bVar.d().a);
                    profilesSimpleInfo.Lb(list2);
                    Object obj3 = nbj.a;
                    list = nbj.a(profilesSimpleInfo, bVar.d().e.p);
                } else {
                    list = bVar.d().a;
                }
                List<qtd0> list3 = list;
                ArrayList arrayList = new ArrayList(list2);
                g5g.D(arrayList, true, new dhh(bVar, 4));
                bVar.o.onNext(gdj.a(bVar.d(), list3, null, null, j5g.u0(arrayList, bVar.d().g), null, false, null, 1982));
                break;
            case 1:
                OneVideoPlayer oneVideoPlayer = (OneVideoPlayer) obj;
                Iterator<OneVideoPlayer.c> it = ((one.video.player.j) obj2).b.iterator();
                while (it.hasNext()) {
                    it.next().b(oneVideoPlayer, z);
                }
                break;
            default:
                sqt0 sqt0Var = (sqt0) obj2;
                sqt0.j jVar = (sqt0.j) obj;
                srm srmVar = sqt0Var.C.F;
                srmVar.getClass();
                n1j0 n1j0Var = srmVar.a;
                if (n1j0Var != null) {
                    n1j0Var.dismiss();
                }
                srmVar.a = null;
                boolean z2 = !z;
                drt0 drt0Var = jVar.a;
                if (x19.H(drt0Var != null ? drt0Var.b : null)) {
                    topControlsView = sqt0Var.getTopControlsView();
                    if (f4m.h(topControlsView)) {
                        topControlsView2 = sqt0Var.getTopControlsView();
                        if (topControlsView2 != null) {
                            topControlsView2.setIsPlayNextEnabled(z2);
                        }
                    } else {
                        sqt0Var.G.c(z2);
                    }
                } else {
                    sqt0Var.F.P4(z2);
                }
                VideoFullscreenBottomBarView fullscreenBottomControlsView = sqt0Var.getFullscreenBottomControlsView();
                if (fullscreenBottomControlsView != null && (settingsDialog = fullscreenBottomControlsView.getSettingsDialog()) != null) {
                    settingsDialog.dismiss();
                }
                ebs0 videoClickActionCallback = sqt0Var.getVideoClickActionCallback();
                if (videoClickActionCallback != null) {
                    videoClickActionCallback.bk(new c4s0(z2));
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ gcj(sqt0 sqt0Var, boolean z, sqt0.j jVar) {
        this.d = sqt0Var;
        this.c = z;
        this.e = jVar;
    }

    public /* synthetic */ gcj(boolean z, com.vk.im.ui.components.contacts.b bVar, List list) {
        this.c = z;
        this.d = bVar;
        this.e = list;
    }
}
