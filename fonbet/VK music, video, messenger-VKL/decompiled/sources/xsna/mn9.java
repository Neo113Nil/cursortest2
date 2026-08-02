package xsna;

import android.view.View;
import com.vk.catalog2.common.ui.holders.TextVh;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.im.ui.fragments.ContactsListFragmentRedesign;
import com.vk.superapp.browser.ui.dialogs.DialogResultState;
import com.vk.video.ui.discovery.minimizable.announce.author.VideoAnnounceAuthorView;
import one.video.ad.ux.ShoppableAdView;
import one.video.controls20.SimpleControlsView;
import xsna.r0w;
import xsna.sbc;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class mn9 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mn9(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        bm9 presenter;
        xqm xqmVar;
        xqm xqmVar2;
        qej0 qej0Var;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                CameraUIView cameraUIView = (CameraUIView) obj;
                float f = CameraUIView.w1;
                if (!cameraUIView.getClickLock().a() && !cameraUIView.getShutterLock().a() && (presenter = cameraUIView.getPresenter()) != null) {
                    presenter.B();
                    break;
                }
                break;
            case 1:
                sbc.a aVar = ((tbc) obj).a;
                if (aVar != null && (xqmVar = sbc.this.l) != null) {
                    xqmVar.a();
                    break;
                }
                break;
            case 2:
                int i2 = ContactsListFragmentRedesign.q0;
                ((ContactsListFragmentRedesign) obj).finish();
                break;
            case 3:
                gzs<s3q0> gzsVar = ((sgj) obj).b;
                if (gzsVar != null) {
                    gzsVar.invoke();
                    break;
                }
                break;
            case 4:
                int i3 = vvs.C;
                ((vvs) obj).Dn(DialogResultState.CANCEL);
                break;
            case 5:
                r0w.a aVar2 = ((s0w) obj).b;
                if (aVar2 != null && (xqmVar2 = aVar2.a.l) != null) {
                    xqmVar2.a();
                    break;
                }
                break;
            case 6:
                bba0 bba0Var = (bba0) obj;
                x64 x64Var = bba0Var.e;
                if (x64Var != null) {
                    x64Var.c(bba0Var.c);
                    break;
                }
                break;
            case 7:
                ShoppableAdView shoppableAdView = (ShoppableAdView) obj;
                nej0 nej0Var = (nej0) j5g.b0(shoppableAdView.c, shoppableAdView.d);
                if (nej0Var != null && (qej0Var = shoppableAdView.h) != null) {
                    qej0Var.a(nej0Var);
                    break;
                }
                break;
            case 8:
                int i4 = SimpleControlsView.S;
                ((tox) obj).onClick();
                break;
            case 9:
                TextVh textVh = (TextVh) obj;
                textVh.f = true;
                textVh.c.b(new t8f0(new e9i0(textVh, 12), true), false);
                break;
            case 10:
                ((n5p0) obj).b.a(b6d.b);
                break;
            case 11:
                VideoAnnounceAuthorView videoAnnounceAuthorView = (VideoAnnounceAuthorView) obj;
                int i5 = VideoAnnounceAuthorView.A;
                videoAnnounceAuthorView.setSubscribeState(VideoAnnounceAuthorView.SubscribeState.Subscribed);
                n9m0 n9m0Var = videoAnnounceAuthorView.y;
                if (n9m0Var != null) {
                    n9m0Var.invoke(Boolean.TRUE);
                    break;
                }
                break;
            default:
                ((dhy0) obj).i.c(view, 1);
                break;
        }
    }
}
