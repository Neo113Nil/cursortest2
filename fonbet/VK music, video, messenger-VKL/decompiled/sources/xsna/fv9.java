package xsna;

import com.vk.im.engine.models.messages.Msg;
import java.util.ArrayList;
import java.util.HashMap;
import xsna.ev9;

/* compiled from: CarouselPositionMediator.kt */
/* loaded from: classes2.dex */
public final class fv9 implements ev9 {
    public final HashMap<Msg, Integer> a = new HashMap<>();
    public final ArrayList b = new ArrayList();

    @Override // xsna.ev9
    public final void a(com.vk.im.ui.components.viewcontrollers.msg_list.adapter.vh.a aVar) {
        this.b.remove(aVar);
    }

    @Override // xsna.ev9
    public final void b(ev9.a aVar) {
        this.b.add(aVar);
    }
}
