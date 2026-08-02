package xsna;

import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.vk.catalog2.feature.music.holders.vkmix.viewholders.MusicBaseVkMixInteractiveVh;
import com.vk.dto.attaches.Attach;
import com.vk.dto.video.VideoNotificationsStatus;
import com.vk.libvideo.api.Subscription;
import com.vk.newsfeed.impl.requests.WallWithCounters;
import com.vk.sharing.api.di.SharingComponent;
import com.vk.sharing.api.dto.AttachmentInfo;
import com.vk.superapp.api.dto.identity.WebIdentityCardData;
import com.vk.video.profile.presentation.a;
import com.vk.video.profile.presentation.c;
import com.vk.video.ui.discovery.minimizable.n;
import com.vk.writebar.WriteBar;
import kotlin.NoWhenBranchMatchedException;
import xsna.nbv0;
import xsna.x1x0;
import xsna.xuw0;
import xsna.yau0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class gsq0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gsq0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14, types: [androidx.fragment.app.Fragment, xsna.e0v0] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = 2;
        VideoNotificationsStatus videoNotificationsStatus = null;
        r3 = null;
        Size size = null;
        boolean z = false;
        Object[] objArr = 0;
        switch (this.b) {
            case 0:
                isq0 isq0Var = (isq0) this.c;
                WallWithCounters wallWithCounters = (WallWithCounters) obj;
                es60 es60Var = isq0Var.f;
                es60Var.b.a();
                return odq.c(es60Var.a, new aic(), new xc3(wallWithCounters, null, es60Var.b, isq0Var.g, null, true, null)).l(new xw70(new hsc0(wallWithCounters, 23), 10));
            case 1:
                ((nrr0) this.c).l.x();
                return s3q0.a;
            case 2:
                ((com.vk.video.ui.discovery.minimizable.g) this.c).T((n.a) obj);
                return s3q0.a;
            case 3:
                com.vk.video.profile.presentation.c cVar = (com.vk.video.profile.presentation.c) this.c;
                Subscription subscription = (Subscription) obj;
                Subscription.Subscribed subscribed = subscription instanceof Subscription.Subscribed ? (Subscription.Subscribed) subscription : null;
                Subscription.Subscribed.Notifications notifications = subscribed != null ? subscribed.a : null;
                int i2 = notifications == null ? -1 : c.a.$EnumSwitchMapping$0[notifications.ordinal()];
                if (i2 != -1) {
                    if (i2 == 1) {
                        videoNotificationsStatus = VideoNotificationsStatus.ALL;
                    } else if (i2 == 2) {
                        videoNotificationsStatus = VideoNotificationsStatus.PREFERRED;
                    } else {
                        if (i2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        videoNotificationsStatus = VideoNotificationsStatus.NONE;
                    }
                }
                if (videoNotificationsStatus != null) {
                    cVar.C(new a.l0(videoNotificationsStatus));
                }
                return s3q0.a;
            case 4:
                h1u0 h1u0Var = (h1u0) this.c;
                View view = (View) obj;
                if (view.getWidth() != 0 && view.getHeight() != 0) {
                    size = new Size(view.getWidth(), view.getHeight());
                }
                h1u0Var.d = size;
                return s3q0.a;
            case 5:
                yau0 yau0Var = (yau0) this.c;
                int i3 = 6;
                new io.reactivex.rxjava3.internal.operators.observable.c0(yau0Var.a().U(new mh40(new kvm0(yau0Var.b.t(), 14), 22)), new wau0(new vyq0(yau0Var, 7), objArr == true ? 1 : 0), io.reactivex.rxjava3.internal.functions.a.c).G(new shd(yau0Var, i3)).subscribe(new t6m0(new ubt0(yau0Var, i), i3), new wvq0(new yau0.a(1, yau0Var, yau0.class, "showError", "showError(Ljava/lang/Throwable;)V", 0), 8));
                return s3q0.a;
            case 6:
                g4f0 g4f0Var = (g4f0) this.c;
                WebIdentityCardData webIdentityCardData = (WebIdentityCardData) obj;
                g4f0Var.d = webIdentityCardData;
                if (webIdentityCardData != null) {
                    ((Fragment) g4f0Var.b).I6(webIdentityCardData);
                }
                g4f0Var.c = null;
                return s3q0.a;
            case 7:
                w6v0 w6v0Var = (w6v0) this.c;
                ((Boolean) obj).getClass();
                par0 par0Var = par0.a;
                String str = w6v0Var.x + " activated!";
                par0Var.getClass();
                par0.a(str);
                w6v0Var.z.b();
                return s3q0.a;
            case 8:
                return new t1g0((ViewGroup) obj, (nbv0.a) this.c);
            case 9:
                ((MusicBaseVkMixInteractiveVh.a) this.c).invoke();
                return s3q0.a;
            case 10:
                return new paw0((ViewGroup) obj, (b8w0) this.c);
            case 11:
                return new wfw0((ViewGroup) obj, ((vfw0) this.c).i);
            case 12:
                ((puw0) this.c).T((xuw0.a) obj);
                return s3q0.a;
            case 13:
                l1x0 l1x0Var = (l1x0) this.c;
                bpn0 bpn0Var = l1x0Var.j1;
                x1x0 x1x0Var = (x1x0) obj;
                int i4 = l1x0.k1;
                if (x1x0Var instanceof x1x0.b) {
                    x1x0.b bVar = (x1x0.b) x1x0Var;
                    AttachmentInfo i5 = ((SharingComponent) bpn0Var.getValue()).u().i(bVar.a, bVar.b);
                    tbj0 a = ((SharingComponent) bpn0Var.getValue()).F2().a(l1x0Var.requireContext());
                    a.c = i5;
                    a.g();
                } else {
                    if (!x1x0Var.equals(x1x0.a.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    l1x0Var.dismiss();
                }
                return s3q0.a;
            case 14:
                return Boolean.valueOf(((Class) this.c).isAssignableFrom(((Attach) obj).getClass()));
            default:
                WriteBar writeBar = (WriteBar) this.c;
                s1y0 s1y0Var = writeBar.I;
                if (s1y0Var != null) {
                    writeBar.getInputState();
                    z = s1y0Var.c();
                }
                return Boolean.valueOf(z);
        }
    }
}
