package xsna;

import com.vk.channels.api.Channel;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.log.L;
import com.vk.pushes.dto.PushMessage;
import com.vk.superapp.api.dto.auth.VkAuthCredentials;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class w6b implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w6b(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                a7b a7bVar = (a7b) this.c;
                b5b b5bVar = (b5b) obj;
                boolean z = false;
                if (b5bVar.b().Kb()) {
                    Msg b = b5bVar.b();
                    MsgFromChannel msgFromChannel = b instanceof MsgFromChannel ? (MsgFromChannel) b : null;
                    if (!(msgFromChannel == null ? false : msgFromChannel.gc())) {
                        Channel a = b5bVar.a();
                        xuo0.a.getClass();
                        if (!a.Db(xuo0.a()) && !b5bVar.a().Eb(b5bVar.b().Z5())) {
                            Long Bb = b5bVar.a().Bb();
                            int Z5 = b5bVar.b().Z5();
                            List<PushMessage> c = v1b.b.c(Bb, a7bVar.a());
                            if (!(c instanceof Collection) || !c.isEmpty()) {
                                Iterator<T> it = c.iterator();
                                while (it.hasNext()) {
                                    if (((PushMessage) it.next()).Ab() == Z5) {
                                    }
                                }
                            }
                            z = true;
                        }
                    }
                }
                L.e("ChannelNewMessagesNotificationsHandler", p2i0.c.a("[Push]: shouldShow=" + z + ' ' + b5bVar));
                return Boolean.valueOf(z);
            default:
                vop vopVar = (vop) this.c;
                VkAuthCredentials vkAuthCredentials = (VkAuthCredentials) obj;
                try {
                    cop copVar = (cop) vopVar.a;
                    if (copVar != null) {
                        copVar.x1(new fg1(10, vopVar, vkAuthCredentials), new myh(vopVar, 11));
                    }
                } catch (Throwable th) {
                    par0.a.getClass();
                    par0.d(th);
                }
                return s3q0.a;
        }
    }
}
