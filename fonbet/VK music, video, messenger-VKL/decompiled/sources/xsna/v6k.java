package xsna;

import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.im.ui.components.common.AvatarAction;
import com.vk.log.L;
import com.vk.stories.design.view.stats.tabs.stickers.mvi.a;
import java.util.ArrayList;
import xsna.cwb0;
import xsna.t6k;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class v6k implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ v6k(Object obj, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                t6k.h hVar = (t6k.h) this.d;
                ArrayList w0 = rl3.w0(AvatarAction.values());
                p4g.l(w0, AvatarAction.REMOVE, !hVar.o.c0());
                p4g.l(w0, AvatarAction.CHANGE_BY_MINI_APP, this.c);
                new bzb0(hVar.itemView.getContext()).b(new cwb0.e(w0), new jm0(hVar, 23), null);
                break;
            case 1:
                h3t h3tVar = (h3t) this.d;
                Throwable th = (Throwable) obj;
                boolean z = h3tVar.g;
                GalleryFragmentImpl.c cVar = h3tVar.e;
                if (z) {
                    L.g("Failed to load gallery data in streaming mode", th);
                    cVar.b(h3tVar.i, this.c, h3tVar.k);
                } else {
                    cVar.c(th);
                }
                break;
            case 2:
                Throwable th2 = (Throwable) obj;
                ((ghm0) this.d).c.invoke(new a.c.h(this.c, th2));
                kwg0.b().accept(th2);
                break;
            default:
                ((ggu0) this.d).c((String) obj, this.c);
                break;
        }
        return s3q0.a;
    }
}
