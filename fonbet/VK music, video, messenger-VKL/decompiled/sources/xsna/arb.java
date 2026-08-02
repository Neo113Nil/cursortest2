package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.ui.fragments.chat.ChatFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class arb implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ arb(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        int i2 = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                com.vk.im.ui.components.msg_list.a aVar = ((ChatFragment) obj).H0;
                if (aVar == null) {
                    aVar = null;
                }
                aVar.getClass();
                Serializer.c<Peer> cVar = Peer.CREATOR;
                aVar.l.D(aVar, new oi30(i2, Peer.a.b(aVar.n)));
                break;
            case 1:
                ((izs) obj).invoke(Integer.valueOf(i2));
                break;
            default:
                com.vk.story.viewer.impl.presentation.stories.view.dynstickers.poll.c cVar2 = (com.vk.story.viewer.impl.presentation.stories.view.dynstickers.poll.c) obj;
                cVar2.c.a();
                com.vk.story.viewer.impl.presentation.stories.view.dynstickers.poll.d dVar = cVar2.c;
                dVar.g(i2, false);
                dVar.c();
                break;
        }
        return s3q0.a;
    }
}
