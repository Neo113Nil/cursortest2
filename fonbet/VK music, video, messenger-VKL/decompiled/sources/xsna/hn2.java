package xsna;

import android.view.View;
import android.widget.ImageView;
import com.vk.dto.common.VideoFile;
import com.vk.feed.design.view.newsfeed.dzen.storyitem.DzenStoryItemView;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.libvideo.models.offline.VideoScreenMode;
import com.vk.money.MoneyTransferLinkFragment;
import com.vk.music.subscription.MusicSubscriptionDetailsContainer;
import com.vk.stat.scheme.MobileOfficialAppsSharingStat$TypeEventSource;
import com.vk.superapp.browser.ui.dialogs.DialogResultState;
import com.vk.superapp.ui.toolbar.VkAuthToolbar;
import xsna.acx;
import xsna.b4;
import xsna.qds0;
import xsna.qsg;
import xsna.x7j0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class hn2 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hn2(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v18, types: [androidx.fragment.app.Fragment] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        gzs<s3q0> gzsVar;
        AboutVideoItem.g gVar;
        VideoFile videoFile;
        AboutVideoItem.g.b bVar;
        int i = this.b;
        r1 = null;
        r1 = null;
        b4 kVar = null;
        Object obj = this.c;
        switch (i) {
            case 0:
                in2 in2Var = (in2) obj;
                x64 x64Var = in2Var.O;
                if (x64Var != null) {
                    x64Var.c(in2Var.C);
                    break;
                }
                break;
            case 1:
                vkc vkcVar = ((ukc) obj).n;
                if (vkcVar != null && (gzsVar = vkcVar.e) != null) {
                    gzsVar.invoke();
                    break;
                }
                break;
            case 2:
                ((qsg) ((qsg.b) obj).m).k.h();
                break;
            case 3:
                int i2 = DzenStoryItemView.i;
                ((gzs) obj).invoke();
                break;
            case 4:
                ChatFragment chatFragment = ChatFragment.this;
                chatFragment.r0.k();
                chatFragment.requireContext();
                break;
            case 5:
                Object obj2 = ((pop) obj).o;
                ((qop) (obj2 != null ? obj2 : null)).z0();
                break;
            case 6:
                int i3 = vvs.C;
                ((vvs) obj).Dn(DialogResultState.OUTSIDE);
                break;
            case 7:
                MoneyTransferLinkFragment moneyTransferLinkFragment = (MoneyTransferLinkFragment) obj;
                int i4 = MoneyTransferLinkFragment.u0;
                efx0 efx0Var = e370.k;
                if (efx0Var == null) {
                    efx0Var = null;
                }
                ImageView imageView = moneyTransferLinkFragment.p0;
                ImageView imageView2 = imageView != null ? imageView : null;
                efx0Var.getClass();
                ome0.a(imageView2).subscribe(new b8v(new kn20(moneyTransferLinkFragment, 3), 7));
                break;
            case 8:
                int i5 = MusicSubscriptionDetailsContainer.A;
                ((f950) obj).a(view, null);
                break;
            case 9:
                xz70 xz70Var = (xz70) obj;
                mhy.j(view);
                ?? r6 = xz70Var.a;
                if (r6 instanceof vxh0) {
                    ((vxh0) r6).a3(xz70Var.f.b().b);
                    break;
                }
                break;
            case 10:
                f3i0 f3i0Var = (f3i0) obj;
                f3i0Var.a.a(new acx.h(f3i0Var.o.c));
                f3i0Var.a(true);
                f3i0Var.f(f3i0Var.o.a, po10.b(f3i0Var.a.l.e, f3i0Var.k.getCurrent()));
                break;
            case 11:
                e8j0 e8j0Var = (e8j0) obj;
                x7j0.j jVar = x7j0.j.b;
                e8j0Var.getClass();
                xn50.a.c(e8j0Var, jVar);
                break;
            case 12:
                qds0.a aVar = (qds0.a) obj;
                Object tag = view.getTag();
                if (epx.f(tag, "bottom_watch_later")) {
                    kVar = b4.m0.a;
                } else if (epx.f(tag, "bottom_like")) {
                    AboutVideoItem.g gVar2 = aVar.m;
                    kVar = new b4.h((gVar2 == null || (bVar = gVar2.b) == null) ? false : bVar.a);
                } else if (epx.f(tag, "bottom_share")) {
                    kVar = new b4.f0(MobileOfficialAppsSharingStat$TypeEventSource.BUTTON);
                } else if (epx.f(tag, "bottom_comment")) {
                    kVar = b4.d.a;
                } else if (epx.f(tag, "bottom_add")) {
                    kVar = b4.a.a;
                } else if (epx.f(tag, "download_video")) {
                    kVar = b4.e.a;
                } else if (epx.f(tag, "more_tag") && (gVar = aVar.m) != null && (videoFile = gVar.j) != null) {
                    kVar = new b4.k(videoFile, VideoScreenMode.DISCOVERY);
                }
                if (kVar != null) {
                    aVar.l.d(kVar);
                    break;
                }
                break;
            default:
                int i6 = VkAuthToolbar.k;
                ((izs) obj).invoke(view);
                break;
        }
    }
}
