package xsna;

import android.view.View;
import com.vk.clips.sdk.shared.item.clip.events.ClipItemViewEvent;
import xsna.as30;
import xsna.go30;
import xsna.mem;
import xsna.w1m0;
import xsna.wpa0;
import xsna.y8g;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class bc implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bc(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                ((cc) this.c).i6();
                break;
            case 1:
                ((com.vk.im.design.view.pagination.pin.a) this.c).l.invoke();
                break;
            case 2:
                ((com.vk.auth.ui.checkaccess.a) this.c).un();
                break;
            case 3:
                ((w6d) this.c).e.a(ClipItemViewEvent.OwnerClicked.AVATAR);
                break;
            case 4:
                mem.a aVar = ((sem) this.c).l;
                if (aVar != null) {
                    aVar.a();
                    break;
                }
                break;
            case 5:
                djo djoVar = (djo) this.c;
                djoVar.m(true);
                w1m0.a aVar2 = djoVar.G;
                if (aVar2.g) {
                    djoVar.t(new wpa0.a(new y8g.c(aVar2.f), true));
                    break;
                }
                break;
            case 6:
                as30.a aVar3 = ((com.vk.im.video.a) this.c).q;
                if (aVar3 == null) {
                    aVar3 = null;
                }
                aVar3.a();
                break;
            case 7:
                go30.a aVar4 = ((fo30) this.c).c;
                if (aVar4 != null) {
                    aVar4.a();
                    break;
                }
                break;
            case 8:
                ((com.vk.music.onboarding.impl.b) this.c).A.g(false, true, true);
                break;
            default:
                g9p0 g9p0Var = (g9p0) this.c;
                c6z c6zVar = g9p0Var.e;
                if (!jjc.b() && c6zVar != null) {
                    g9p0Var.a.k(g9p0Var.b.getContext(), c6zVar, false);
                    break;
                }
                break;
        }
    }
}
