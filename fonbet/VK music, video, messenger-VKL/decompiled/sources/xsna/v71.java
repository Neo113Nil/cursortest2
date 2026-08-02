package xsna;

import android.os.SystemClock;
import com.vk.channels.impl.comments.f;
import com.vk.dto.common.DownloadingState;
import com.vk.im.ui.components.contacts.SortOrder;
import com.vk.im.ui.components.contacts.c;
import com.vk.im.ui.formatters.linkparser.LinkType;
import com.vk.masks.MasksController;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class v71 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v71(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                w71 w71Var = (w71) this.c;
                izs<Map<String, ? extends DownloadingState>, s3q0> izsVar = w71Var.c;
                LinkedHashMap linkedHashMap = w71Var.e;
                izsVar.invoke(pn00.t(linkedHashMap));
                linkedHashMap.clear();
                w71Var.f = SystemClock.uptimeMillis();
                return;
            case 1:
                com.vk.channels.impl.comments.b bVar = (com.vk.channels.impl.comments.b) this.c;
                bVar.q(new iz(bVar, 12));
                bVar.n(f.C0533f.a);
                return;
            case 2:
                com.vk.im.ui.components.contacts.c cVar = (com.vk.im.ui.components.contacts.c) this.c;
                g9e0 g9e0Var = cVar.w;
                c.b bVar2 = cVar.A;
                if (g9e0Var.c() && bVar2.b.isEmpty()) {
                    baz bazVar = new baz(Collections.singletonList(LinkType.PHONE));
                    CharSequence p0 = drm0.p0(bVar2.a);
                    if (bazVar.a(p0)) {
                        cVar.Y0().c(Collections.singletonList(new kjq(p0)), SortOrder.BY_HINTS, null);
                        return;
                    } else {
                        cVar.Y0().c(bVar2.b, SortOrder.BY_HINTS, null);
                        return;
                    }
                }
                return;
            case 3:
                ((ikv0) this.c).a();
                return;
            case 4:
                MasksController masksController = (MasksController) this.c;
                synchronized (masksController) {
                    masksController.i = null;
                }
                return;
            default:
                ((so10) this.c).c.set(false);
                return;
        }
    }
}
