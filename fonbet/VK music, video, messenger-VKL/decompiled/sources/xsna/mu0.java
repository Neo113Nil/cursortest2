package xsna;

import com.vk.core.view.components.text.VkFadeText;
import com.vk.log.L;
import com.vk.newsfeed.api.data.discover.NewsEntriesContainer;
import com.vk.notifications.GroupedNotificationsFragment;
import com.vk.superapp.api.dto.story.WebRenderableSticker;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class mu0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mu0(Object obj, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        boolean z = this.c;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                lu0 lu0Var = (lu0) obj2;
                x960 x960Var = (x960) obj;
                NewsEntriesContainer a = x960Var.a();
                if (z) {
                    lu0Var.reset();
                }
                NewsEntriesContainer.Info info = a.b;
                if (!info.n && lu0Var.a(a.c, info.l, info.b, info.j, info.k, x960Var.b())) {
                    a.c.clear();
                }
                return x960Var;
            case 1:
                hpd0 hpd0Var = (hpd0) obj2;
                mkj mkjVar = (mkj) obj;
                return mkj.a(mkjVar, null, dkj.c(mkjVar.c, hpd0Var, z), dkj.c(mkjVar.d, hpd0Var, z), false, null, false, 0, null, 249);
            case 2:
                GroupedNotificationsFragment groupedNotificationsFragment = (GroupedNotificationsFragment) obj2;
                Throwable th = (Throwable) obj;
                if (z) {
                    hou houVar = groupedNotificationsFragment.Z;
                    if (houVar != null) {
                        houVar.clear();
                    }
                } else {
                    int i2 = GroupedNotificationsFragment.f0;
                }
                L.i(th);
                return s3q0.a;
            case 3:
                nxb0 nxb0Var = (nxb0) obj2;
                nyb0 nyb0Var = nxb0Var.b;
                nyb0Var.b.getClass();
                nxb0Var.b(nyb0.a(nyb0Var, null, new yp2(!z, true), true, 1));
                return s3q0.a;
            case 4:
                WebRenderableSticker webRenderableSticker = (WebRenderableSticker) obj2;
                wk2 y = ((pvf) obj).y();
                if (y == null) {
                    throw new NullPointerException("Null anim res");
                }
                uzl0 uzl0Var = new uzl0(y, "0", webRenderableSticker.e, webRenderableSticker, this.c);
                boolean z2 = webRenderableSticker.k;
                z2l0 z2l0Var = uzl0Var.c;
                z2l0Var.q = z2;
                z2l0Var.o = webRenderableSticker.l;
                return uzl0Var;
            default:
                VkFadeText vkFadeText = (VkFadeText) obj;
                vkFadeText.setText((String) obj2);
                vkFadeText.setFade(z);
                return s3q0.a;
        }
    }

    public /* synthetic */ mu0(boolean z, Object obj, int i) {
        this.b = i;
        this.c = z;
        this.d = obj;
    }
}
