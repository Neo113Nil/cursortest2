package xsna;

import android.content.Context;
import com.vk.common.links.AwayLink;
import com.vk.common.links.LaunchContext;
import com.vk.dto.common.data.VKList;
import com.vk.dto.photo.Photo;
import com.vk.ecomm.reviews.ui.reviewbody.ReviewBodyView;
import com.vk.im.ui.components.dialogs_list.g;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.voip.ui.actions.feature.VoipActionsFeatureState;
import java.util.regex.Pattern;
import kotlin.Pair;
import ru.mail.libverify.controls.VerificationController;
import ru.mail.libverify.controls.VerificationListener;
import ru.mail.libverify.n.l;
import ru.mail.libverify.utils.Optional;
import xsna.bhg0;
import xsna.qjc;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class oq80 implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.core.s, qjc.a, io.reactivex.rxjava3.functions.b, io.reactivex.rxjava3.functions.m, Optional.Action, VideoView.f, t8z0, ru.mail.libverify.n.j, yads.l32 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ oq80(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.qjc.a
    public void I(AwayLink awayLink) {
        eig0<bhg0> eig0Var = ((ReviewBodyView) this.c).f;
        if (eig0Var != null) {
            eig0Var.a(bhg0.g.a);
        }
    }

    @Override // ru.mail.libverify.n.j
    public ru.mail.libverify.n.e a(Pattern pattern, Pattern pattern2, l.a aVar) {
        ru.mail.libverify.n.e a;
        a = ((ru.mail.libverify.n.m) this.c).a(pattern, pattern2, aVar);
        return a;
    }

    @Override // ru.mail.libverify.utils.Optional.Action
    public void accept(Object obj) {
        switch (this.b) {
            case 11:
                ((VerificationController) this.c).lambda$onCompleteInternal$25((VerificationListener) obj);
                break;
            default:
                String str = (String) obj;
                giy0 giy0Var = ((mxy0) this.c).c.T;
                if (str == null) {
                    str = "Playable interactive failed to load";
                }
                giy0Var.g(999, 5501, str);
                break;
        }
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (Photo) ((zl20) this.c).invoke(obj);
            case 1:
                return (VKList) ((zl20) this.c).invoke(obj);
            case 2:
                return (io.reactivex.rxjava3.core.b0) ((zl20) this.c).invoke(obj);
            case 3:
            case 5:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            default:
                return (Boolean) ((l4k0) this.c).invoke(obj);
            case 4:
                return (io.reactivex.rxjava3.core.b0) ((zl20) this.c).invoke(obj);
            case 6:
                return (Pair) ((l4k0) this.c).invoke(obj);
            case 7:
                return (azm0) ((izs) this.c).invoke(obj);
            case 9:
                return ((zmq0) this.c).invoke(obj);
            case 14:
                return (Boolean) ((l4k0) this.c).invoke(obj);
            case 15:
                return (VoipActionsFeatureState.UserType) ((com.vk.voip.ui.actions.feature.a) this.c).invoke(obj);
        }
    }

    @Override // io.reactivex.rxjava3.core.s
    public void subscribe(io.reactivex.rxjava3.core.r rVar) {
        String str = (String) this.c;
        gme0 gme0Var = new gme0(rVar);
        maz e = xwk.d().e();
        c63 c63Var = c63.a;
        Context b = c63.b();
        if (b == null && (b = e43.a) == null) {
            b = null;
        }
        maz.c(e, b, str, LaunchContext.A, null, gme0Var, 8);
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 10:
                return ((Boolean) ((rtg0) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((l4k0) this.c).invoke(obj)).booleanValue();
        }
    }

    @Override // yads.l32
    public boolean a(yads.m22 m22Var) {
        return yads.oz1.b((yads.oz1) this.c, m22Var);
    }

    @Override // io.reactivex.rxjava3.functions.b
    public void accept(Object obj, Object obj2) {
        com.vk.im.ui.components.dialogs_list.g gVar = (com.vk.im.ui.components.dialogs_list.g) this.c;
        g.c cVar = (g.c) obj;
        Throwable th = (Throwable) obj2;
        if (th == null) {
            gVar.h(cVar);
        } else {
            gVar.g(th);
        }
    }
}
