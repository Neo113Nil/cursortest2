package xsna;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.vk.bridges.ImageViewer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachForMediaViewer;
import com.vk.dto.attaches.AttachImage;
import com.vk.dto.attaches.AttachWithImage;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import xsna.dwn;
import xsna.p920;

/* compiled from: ChannelFragmentAttachImageViewer.kt */
/* loaded from: classes16.dex */
public final class gza implements g24 {
    public final Activity a;
    public final ImageViewer b;
    public final defpackage.g c;
    public final Lazy d;
    public ImageViewer.c<AttachForMediaViewer> e;
    public ImageViewer.c<?> f;

    public gza(FragmentActivity fragmentActivity, Lazy lazy, ImageViewer imageViewer, defpackage.g gVar) {
        this.a = fragmentActivity;
        this.b = imageViewer;
        this.c = gVar;
        this.d = lazy;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    @Override // xsna.g24
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(AttachWithImage attachWithImage, com.vk.im.engine.models.messages.a aVar) {
        dwn dwnVar;
        dwn bVar;
        p920 p920Var;
        List<Attach> list;
        ImageViewer.c<AttachForMediaViewer> i;
        if ((attachWithImage instanceof AttachImage) && ((AttachImage) attachWithImage).o == -88) {
            return;
        }
        boolean z = aVar instanceof p920;
        if (z) {
            p920.a aVar2 = ((p920) aVar).d;
            if (aVar2 instanceof o920) {
                o920 o920Var = (o920) aVar2;
                bVar = new dwn.b(o920Var.a, o920Var.b, o920Var.c);
                p920Var = !z ? (p920) aVar : null;
                if (p920Var != null || (list = p920Var.c) == null || !list.contains(attachWithImage)) {
                    ArrayList M9 = aVar.M9(true, false);
                    this.f = ImageViewer.a(this.b, attachWithImage, M9, this.a, new xmw(new defpackage.v(4, M9, this), new com.vk.movika.sdk.base.presenter.b(this, 5), new qc(this, 9), new s5(this, 19), bVar, false), false, null, 496);
                } else {
                    ArrayList arrayList = new ArrayList(aVar.Y5(false));
                    i = this.b.i(arrayList.indexOf((AttachForMediaViewer) attachWithImage), arrayList, this.a, new e120(new fza(arrayList, this), new sz(this, 10), new sh3(5, arrayList, this), new yh(this, 16), new ic(this, 16), new com.vk.movika.sdk.android.defaultplayer.view.timeline.a(this, 17), bVar), Long.valueOf(((p920) aVar).e), (r18 & 256) != 0, (r18 & 512) != 0 ? o25.a().c() : null);
                    this.e = i;
                    return;
                }
            }
            if (aVar2 instanceof n920) {
                dwnVar = new dwn.a(this.a.getString(R.string.vkim_channels_donate_badge_text));
            } else {
                if (!(aVar2 instanceof p920.a.C3498a)) {
                    throw new NoWhenBranchMatchedException();
                }
                dwnVar = dwn.c.a;
            }
        } else {
            dwnVar = dwn.c.a;
        }
        bVar = dwnVar;
        if (!z) {
        }
        if (p920Var != null) {
        }
        ArrayList M92 = aVar.M9(true, false);
        this.f = ImageViewer.a(this.b, attachWithImage, M92, this.a, new xmw(new defpackage.v(4, M92, this), new com.vk.movika.sdk.base.presenter.b(this, 5), new qc(this, 9), new s5(this, 19), bVar, false), false, null, 496);
    }

    public final sf20 b() {
        return (sf20) this.d.getValue();
    }
}
